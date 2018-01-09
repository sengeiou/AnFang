package com.hyphenate.easeui.utils;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hyphenate.easeui.R;
import com.hyphenate.easeui.EaseUI;
import com.hyphenate.easeui.EaseUI.EaseUserProfileProvider;
import com.hyphenate.easeui.domain.EaseUser;
import com.hyphenate.easeui.model.EaseLocalUser;

public class EaseUserUtils {

    static EaseUserProfileProvider userProvider;

    static {
        userProvider = EaseUI.getInstance().getUserProfileProvider();
    }

    /**
     * get EaseUser according username
     *
     * @param username
     * @return
     */
    public static EaseUser getUserInfo(String username) {
        if (userProvider != null)
            return userProvider.getUser(username);

        return null;
    }

    /**
     * set user avatar
     *
     * @param username
     */
    public static void setUserAvatar(Context context, String username, ImageView imageView) {
        EaseUser user = getUserInfo(username);
        if (user != null && user.getAvatar() != null) {
            try {
                int avatarResId = Integer.parseInt(user.getAvatar());
                Glide.with(context).load(avatarResId).into(imageView);
            } catch (Exception e) {
                //use default avatar
                Glide.with(context).load(user.getAvatar()).diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(R.drawable.ease_default_avatar).into(imageView);
            }
        } else {
            EaseLocalUser localUser = EaseLocalUserHelper.getInstance().getLocalUser(username);
            if (localUser == null) {
                Glide.with(context).load(R.drawable.ease_default_avatar).into(imageView);
                return;
            }

            if (localUser.getType().equals(UserType.PARENT.toString())) {
                if ("1".equals(localUser.getSex())) {
                    Glide.with(context).load(R.drawable.parent_father).into(imageView);
                } else {
                    Glide.with(context).load(R.drawable.parent_mother).into(imageView);
                }
            } else if (localUser.getType().equals(UserType.TEACHER.toString())) {
                if ("1".equals(localUser.getSex())) {
                    Glide.with(context).load(R.drawable.teacher_man).into(imageView);
                } else {
                    Glide.with(context).load(R.drawable.teacher_woman).into(imageView);
                }
            }

        }
    }

    /**
     * set user's nickname
     */
    public static void setUserNick(String username, TextView textView) {
        if (textView != null) {
            EaseUser user = getUserInfo(username);
            if (user != null && user.getNick() != null) {
                textView.setText(user.getNick());
            } else {
                textView.setText(username);
            }
        }
    }

}
