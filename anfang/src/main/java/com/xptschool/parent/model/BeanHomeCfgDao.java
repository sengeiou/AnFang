package com.xptschool.parent.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BEAN_HOME_CFG".
*/
public class BeanHomeCfgDao extends AbstractDao<BeanHomeCfg, String> {

    public static final String TABLENAME = "BEAN_HOME_CFG";

    /**
     * Properties of entity BeanHomeCfg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Product_name = new Property(2, String.class, "product_name", false, "PRODUCT_NAME");
        public final static Property Image = new Property(3, String.class, "image", false, "IMAGE");
        public final static Property Source = new Property(4, String.class, "source", false, "SOURCE");
        public final static Property Url = new Property(5, String.class, "url", false, "URL");
        public final static Property Mark = new Property(6, String.class, "mark", false, "MARK");
        public final static Property Type = new Property(7, String.class, "type", false, "TYPE");
        public final static Property Price = new Property(8, String.class, "price", false, "PRICE");
    };


    public BeanHomeCfgDao(DaoConfig config) {
        super(config);
    }
    
    public BeanHomeCfgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BEAN_HOME_CFG\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"PRODUCT_NAME\" TEXT," + // 2: product_name
                "\"IMAGE\" TEXT," + // 3: image
                "\"SOURCE\" TEXT," + // 4: source
                "\"URL\" TEXT," + // 5: url
                "\"MARK\" TEXT," + // 6: mark
                "\"TYPE\" TEXT," + // 7: type
                "\"PRICE\" TEXT);"); // 8: price
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BEAN_HOME_CFG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BeanHomeCfg entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String product_name = entity.getProduct_name();
        if (product_name != null) {
            stmt.bindString(3, product_name);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(5, source);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(7, mark);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(8, type);
        }
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(9, price);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BeanHomeCfg entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String product_name = entity.getProduct_name();
        if (product_name != null) {
            stmt.bindString(3, product_name);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(5, source);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(7, mark);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(8, type);
        }
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(9, price);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BeanHomeCfg readEntity(Cursor cursor, int offset) {
        BeanHomeCfg entity = new BeanHomeCfg( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // product_name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // source
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mark
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // type
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // price
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BeanHomeCfg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setProduct_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSource(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMark(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPrice(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BeanHomeCfg entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(BeanHomeCfg entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
