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
 * DAO for table "BEAN_STUDENT".
*/
public class BeanStudentDao extends AbstractDao<BeanStudent, String> {

    public static final String TABLENAME = "BEAN_STUDENT";

    /**
     * Properties of entity BeanStudent.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property S_id = new Property(0, String.class, "s_id", false, "S_ID");
        public final static Property A_id = new Property(1, String.class, "a_id", false, "A_ID");
        public final static Property G_id = new Property(2, String.class, "g_id", false, "G_ID");
        public final static Property C_id = new Property(3, String.class, "c_id", false, "C_ID");
        public final static Property Stu_id = new Property(4, String.class, "stu_id", true, "STU_ID");
        public final static Property Stu_name = new Property(5, String.class, "stu_name", false, "STU_NAME");
        public final static Property Stu_no = new Property(6, String.class, "stu_no", false, "STU_NO");
        public final static Property Imei_id = new Property(7, String.class, "imei_id", false, "IMEI_ID");
        public final static Property Card_phone = new Property(8, String.class, "card_phone", false, "CARD_PHONE");
        public final static Property Birth_date = new Property(9, String.class, "birth_date", false, "BIRTH_DATE");
        public final static Property Rx_date = new Property(10, String.class, "rx_date", false, "RX_DATE");
        public final static Property Sex = new Property(11, String.class, "sex", false, "SEX");
        public final static Property Devicetype = new Property(12, String.class, "devicetype", false, "DEVICETYPE");
        public final static Property S_name = new Property(13, String.class, "s_name", false, "S_NAME");
        public final static Property A_name = new Property(14, String.class, "a_name", false, "A_NAME");
        public final static Property G_name = new Property(15, String.class, "g_name", false, "G_NAME");
        public final static Property C_name = new Property(16, String.class, "c_name", false, "C_NAME");
        public final static Property Sos = new Property(17, String.class, "sos", false, "SOS");
        public final static Property Whitelist = new Property(18, String.class, "whitelist", false, "WHITELIST");
        public final static Property Monitor = new Property(19, String.class, "monitor", false, "MONITOR");
        public final static Property Photo = new Property(20, String.class, "photo", false, "PHOTO");
        public final static Property Relation = new Property(21, String.class, "relation", false, "RELATION");
    };


    public BeanStudentDao(DaoConfig config) {
        super(config);
    }
    
    public BeanStudentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BEAN_STUDENT\" (" + //
                "\"S_ID\" TEXT," + // 0: s_id
                "\"A_ID\" TEXT," + // 1: a_id
                "\"G_ID\" TEXT," + // 2: g_id
                "\"C_ID\" TEXT," + // 3: c_id
                "\"STU_ID\" TEXT PRIMARY KEY NOT NULL ," + // 4: stu_id
                "\"STU_NAME\" TEXT," + // 5: stu_name
                "\"STU_NO\" TEXT," + // 6: stu_no
                "\"IMEI_ID\" TEXT," + // 7: imei_id
                "\"CARD_PHONE\" TEXT," + // 8: card_phone
                "\"BIRTH_DATE\" TEXT," + // 9: birth_date
                "\"RX_DATE\" TEXT," + // 10: rx_date
                "\"SEX\" TEXT," + // 11: sex
                "\"DEVICETYPE\" TEXT," + // 12: devicetype
                "\"S_NAME\" TEXT," + // 13: s_name
                "\"A_NAME\" TEXT," + // 14: a_name
                "\"G_NAME\" TEXT," + // 15: g_name
                "\"C_NAME\" TEXT," + // 16: c_name
                "\"SOS\" TEXT," + // 17: sos
                "\"WHITELIST\" TEXT," + // 18: whitelist
                "\"MONITOR\" TEXT," + // 19: monitor
                "\"PHOTO\" TEXT," + // 20: photo
                "\"RELATION\" TEXT);"); // 21: relation
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BEAN_STUDENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BeanStudent entity) {
        stmt.clearBindings();
 
        String s_id = entity.getS_id();
        if (s_id != null) {
            stmt.bindString(1, s_id);
        }
 
        String a_id = entity.getA_id();
        if (a_id != null) {
            stmt.bindString(2, a_id);
        }
 
        String g_id = entity.getG_id();
        if (g_id != null) {
            stmt.bindString(3, g_id);
        }
 
        String c_id = entity.getC_id();
        if (c_id != null) {
            stmt.bindString(4, c_id);
        }
 
        String stu_id = entity.getStu_id();
        if (stu_id != null) {
            stmt.bindString(5, stu_id);
        }
 
        String stu_name = entity.getStu_name();
        if (stu_name != null) {
            stmt.bindString(6, stu_name);
        }
 
        String stu_no = entity.getStu_no();
        if (stu_no != null) {
            stmt.bindString(7, stu_no);
        }
 
        String imei_id = entity.getImei_id();
        if (imei_id != null) {
            stmt.bindString(8, imei_id);
        }
 
        String card_phone = entity.getCard_phone();
        if (card_phone != null) {
            stmt.bindString(9, card_phone);
        }
 
        String birth_date = entity.getBirth_date();
        if (birth_date != null) {
            stmt.bindString(10, birth_date);
        }
 
        String rx_date = entity.getRx_date();
        if (rx_date != null) {
            stmt.bindString(11, rx_date);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(12, sex);
        }
 
        String devicetype = entity.getDevicetype();
        if (devicetype != null) {
            stmt.bindString(13, devicetype);
        }
 
        String s_name = entity.getS_name();
        if (s_name != null) {
            stmt.bindString(14, s_name);
        }
 
        String a_name = entity.getA_name();
        if (a_name != null) {
            stmt.bindString(15, a_name);
        }
 
        String g_name = entity.getG_name();
        if (g_name != null) {
            stmt.bindString(16, g_name);
        }
 
        String c_name = entity.getC_name();
        if (c_name != null) {
            stmt.bindString(17, c_name);
        }
 
        String sos = entity.getSos();
        if (sos != null) {
            stmt.bindString(18, sos);
        }
 
        String whitelist = entity.getWhitelist();
        if (whitelist != null) {
            stmt.bindString(19, whitelist);
        }
 
        String monitor = entity.getMonitor();
        if (monitor != null) {
            stmt.bindString(20, monitor);
        }
 
        String photo = entity.getPhoto();
        if (photo != null) {
            stmt.bindString(21, photo);
        }
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(22, relation);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BeanStudent entity) {
        stmt.clearBindings();
 
        String s_id = entity.getS_id();
        if (s_id != null) {
            stmt.bindString(1, s_id);
        }
 
        String a_id = entity.getA_id();
        if (a_id != null) {
            stmt.bindString(2, a_id);
        }
 
        String g_id = entity.getG_id();
        if (g_id != null) {
            stmt.bindString(3, g_id);
        }
 
        String c_id = entity.getC_id();
        if (c_id != null) {
            stmt.bindString(4, c_id);
        }
 
        String stu_id = entity.getStu_id();
        if (stu_id != null) {
            stmt.bindString(5, stu_id);
        }
 
        String stu_name = entity.getStu_name();
        if (stu_name != null) {
            stmt.bindString(6, stu_name);
        }
 
        String stu_no = entity.getStu_no();
        if (stu_no != null) {
            stmt.bindString(7, stu_no);
        }
 
        String imei_id = entity.getImei_id();
        if (imei_id != null) {
            stmt.bindString(8, imei_id);
        }
 
        String card_phone = entity.getCard_phone();
        if (card_phone != null) {
            stmt.bindString(9, card_phone);
        }
 
        String birth_date = entity.getBirth_date();
        if (birth_date != null) {
            stmt.bindString(10, birth_date);
        }
 
        String rx_date = entity.getRx_date();
        if (rx_date != null) {
            stmt.bindString(11, rx_date);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(12, sex);
        }
 
        String devicetype = entity.getDevicetype();
        if (devicetype != null) {
            stmt.bindString(13, devicetype);
        }
 
        String s_name = entity.getS_name();
        if (s_name != null) {
            stmt.bindString(14, s_name);
        }
 
        String a_name = entity.getA_name();
        if (a_name != null) {
            stmt.bindString(15, a_name);
        }
 
        String g_name = entity.getG_name();
        if (g_name != null) {
            stmt.bindString(16, g_name);
        }
 
        String c_name = entity.getC_name();
        if (c_name != null) {
            stmt.bindString(17, c_name);
        }
 
        String sos = entity.getSos();
        if (sos != null) {
            stmt.bindString(18, sos);
        }
 
        String whitelist = entity.getWhitelist();
        if (whitelist != null) {
            stmt.bindString(19, whitelist);
        }
 
        String monitor = entity.getMonitor();
        if (monitor != null) {
            stmt.bindString(20, monitor);
        }
 
        String photo = entity.getPhoto();
        if (photo != null) {
            stmt.bindString(21, photo);
        }
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(22, relation);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4);
    }    

    @Override
    public BeanStudent readEntity(Cursor cursor, int offset) {
        BeanStudent entity = new BeanStudent( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // s_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // a_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // g_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // c_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // stu_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // stu_name
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // stu_no
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // imei_id
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // card_phone
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // birth_date
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // rx_date
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // sex
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // devicetype
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // s_name
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // a_name
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // g_name
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // c_name
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // sos
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // whitelist
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // monitor
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // photo
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21) // relation
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BeanStudent entity, int offset) {
        entity.setS_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setA_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setG_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setC_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStu_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStu_name(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStu_no(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setImei_id(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCard_phone(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setBirth_date(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRx_date(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSex(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setDevicetype(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setS_name(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setA_name(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setG_name(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setC_name(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSos(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setWhitelist(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setMonitor(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setPhoto(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setRelation(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BeanStudent entity, long rowId) {
        return entity.getStu_id();
    }
    
    @Override
    public String getKey(BeanStudent entity) {
        if(entity != null) {
            return entity.getStu_id();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
