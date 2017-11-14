package com.shuhai.anfang.model;

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
        public final static Property Img = new Property(2, String.class, "img", false, "IMG");
        public final static Property Url = new Property(3, String.class, "url", false, "URL");
        public final static Property Cell = new Property(4, String.class, "cell", false, "CELL");
        public final static Property Pid = new Property(5, String.class, "pid", false, "PID");
    };

    private DaoSession daoSession;


    public BeanHomeCfgDao(DaoConfig config) {
        super(config);
    }
    
    public BeanHomeCfgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BEAN_HOME_CFG\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"IMG\" TEXT," + // 2: img
                "\"URL\" TEXT," + // 3: url
                "\"CELL\" TEXT," + // 4: cell
                "\"PID\" TEXT);"); // 5: pid
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
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(3, img);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(4, url);
        }
 
        String cell = entity.getCell();
        if (cell != null) {
            stmt.bindString(5, cell);
        }
 
        String pid = entity.getPid();
        if (pid != null) {
            stmt.bindString(6, pid);
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
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(3, img);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(4, url);
        }
 
        String cell = entity.getCell();
        if (cell != null) {
            stmt.bindString(5, cell);
        }
 
        String pid = entity.getPid();
        if (pid != null) {
            stmt.bindString(6, pid);
        }
    }

    @Override
    protected final void attachEntity(BeanHomeCfg entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
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
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // img
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // cell
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // pid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BeanHomeCfg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImg(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCell(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPid(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
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
