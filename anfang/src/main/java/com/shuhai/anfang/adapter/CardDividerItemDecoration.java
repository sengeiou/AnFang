package com.shuhai.anfang.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lenovo on 2016-01-13.
 */
public class CardDividerItemDecoration extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS = new int[]{
            android.R.attr.listDivider
    };

    public static final int HORIZONTAL_LIST = LinearLayoutManager.HORIZONTAL;
    public static final int VERTICAL_LIST = LinearLayoutManager.VERTICAL;
    private Drawable mDivider;
    private int mOrientation;

    public CardDividerItemDecoration(Context context, int orientation) {
        final TypedArray a = context.obtainStyledAttributes(ATTRS);
        mDivider = a.getDrawable(0);
        a.recycle();
        setOrientation(orientation);
    }

    public void setOrientation(int orientation) {
        if (orientation != HORIZONTAL_LIST && orientation != VERTICAL_LIST) {
            throw new IllegalArgumentException("invalid orientation");
        }
        mOrientation = orientation;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent) {
        //Log.v("recyclerview - itemdecoration", "onDraw()");
        if (mOrientation == VERTICAL_LIST) {
            drawVertical(c, parent);
        } else {
            drawHorizontal(c, parent);
        }
    }

    public void drawVertical(Canvas c, RecyclerView parent) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();
        final int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            android.support.v7.widget.RecyclerView v = new android.support.v7.widget.RecyclerView(parent.getContext());
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            final int top = child.getBottom() + params.bottomMargin;
            final int bottom = top + mDivider.getIntrinsicHeight();
            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

    public void drawHorizontal(Canvas c, RecyclerView parent) {
        final int top = parent.getPaddingTop();
        final int bottom = parent.getHeight() - parent.getPaddingBottom();
        final int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            final int left = child.getRight() + params.rightMargin;
            final int right = left + mDivider.getIntrinsicHeight();
            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
        if (mOrientation == VERTICAL_LIST) {
            outRect.set(0, 0, 0, mDivider.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
        }
    }
}

//public class DividerItemDecoration extends RecyclerView.ItemDecoration{
//
//    /*
//    * RecyclerView的布局方向，默认先赋值
//    * 为纵向布局
//    * RecyclerView 布局可横向，也可纵向
//    * 横向和纵向对应的分割想画法不一样
//    * */
//    private int mOrientation = LinearLayoutManager.VERTICAL ;
//
//    /**
//     * item之间分割线的size，默认为1
//     */
//    private int mItemSize = 1 ;
//
//    /**
//     * 绘制item分割线的画笔，和设置其属性
//     * 来绘制个性分割线
//     */
//    private Paint mPaint ;
//
//    /**
//     * 构造方法传入布局方向，不可不传
//     * @param context
//     * @param orientation
//     */
//    public DividerItemDecoration(Context context,int orientation) {
//        this.mOrientation = orientation;
//        if(orientation != LinearLayoutManager.VERTICAL && orientation != LinearLayoutManager.HORIZONTAL){
//            throw new IllegalArgumentException("请传入正确的参数") ;
//        }
//        mItemSize = (int) TypedValue.applyDimension(mItemSize, TypedValue.COMPLEX_UNIT_DIP, context.getResources().getDisplayMetrics());
//        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG) ;
//        mPaint.setColor(Color.LTGRAY);
//         /*设置填充*/
//        mPaint.setStyle(Paint.Style.FILL);
//    }
//
//    @Override
//    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
//        if(mOrientation == LinearLayoutManager.VERTICAL){
//            drawVertical(c,parent) ;
//        }else {
//            drawHorizontal(c,parent) ;
//        }
//    }
//
//    /**
//     * 绘制纵向 item 分割线
//     * @param canvas
//     * @param parent
//     */
//    private void drawVertical(Canvas canvas,RecyclerView parent){
//        final int left = parent.getPaddingLeft() ;
//        final int right = parent.getMeasuredWidth() - parent.getPaddingRight() ;
//        final int childSize = parent.getChildCount() ;
//        for(int i = 0 ; i < childSize ; i ++){
//            final View child = parent.getChildAt( i ) ;
//            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
//            final int top = child.getBottom() + layoutParams.bottomMargin ;
//            final int bottom = top + mItemSize ;
//            canvas.drawRect(left,top,right,bottom,mPaint);
//        }
//    }
//
//    /**
//     * 绘制横向 item 分割线
//     * @param canvas
//     * @param parent
//     */
//    private void drawHorizontal(Canvas canvas,RecyclerView parent){
//        final int top = parent.getPaddingTop() ;
//        final int bottom = parent.getMeasuredHeight() - parent.getPaddingBottom() ;
//        final int childSize = parent.getChildCount() ;
//        for(int i = 0 ; i < childSize ; i ++){
//            final View child = parent.getChildAt( i ) ;
//            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
//            final int left = child.getRight() + layoutParams.rightMargin ;
//            final int right = left + mItemSize ;
//            canvas.drawRect(left,top,right,bottom,mPaint);
//        }
//    }
//
//    /**
//     * 设置item分割线的size
//     * @param outRect
//     * @param view
//     * @param parent
//     * @param state
//     */
//    @Override
//    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
//        if(mOrientation == LinearLayoutManager.VERTICAL){
//            outRect.set(0,0,0,mItemSize);
//        }else {
//            outRect.set(0,0,mItemSize,0);
//        }
//    }
//}