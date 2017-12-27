package com.shuhai.anfang.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 3): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 3;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        BeanBannerDao.createTable(db, ifNotExists);
        BeanClassDao.createTable(db, ifNotExists);
        BeanCourseDao.createTable(db, ifNotExists);
        BeanHomeCfgDao.createTable(db, ifNotExists);
        BeanHomeCfgChildDao.createTable(db, ifNotExists);
        BeanHotGoodDao.createTable(db, ifNotExists);
        BeanLearningModuleDao.createTable(db, ifNotExists);
        BeanMyClassDao.createTable(db, ifNotExists);
        BeanParentDao.createTable(db, ifNotExists);
        BeanStudentDao.createTable(db, ifNotExists);
        BeanTeacherDao.createTable(db, ifNotExists);
        ContactParentDao.createTable(db, ifNotExists);
        ContactSchoolDao.createTable(db, ifNotExists);
        ContactStudentDao.createTable(db, ifNotExists);
        ContactTeacherDao.createTable(db, ifNotExists);
        BeanCountyDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        BeanBannerDao.dropTable(db, ifExists);
        BeanClassDao.dropTable(db, ifExists);
        BeanCourseDao.dropTable(db, ifExists);
        BeanHomeCfgDao.dropTable(db, ifExists);
        BeanHomeCfgChildDao.dropTable(db, ifExists);
        BeanHotGoodDao.dropTable(db, ifExists);
        BeanLearningModuleDao.dropTable(db, ifExists);
        BeanMyClassDao.dropTable(db, ifExists);
        BeanParentDao.dropTable(db, ifExists);
        BeanStudentDao.dropTable(db, ifExists);
        BeanTeacherDao.dropTable(db, ifExists);
        ContactParentDao.dropTable(db, ifExists);
        ContactSchoolDao.dropTable(db, ifExists);
        ContactStudentDao.dropTable(db, ifExists);
        ContactTeacherDao.dropTable(db, ifExists);
        BeanCountyDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(BeanBannerDao.class);
        registerDaoClass(BeanClassDao.class);
        registerDaoClass(BeanCourseDao.class);
        registerDaoClass(BeanHomeCfgDao.class);
        registerDaoClass(BeanHomeCfgChildDao.class);
        registerDaoClass(BeanHotGoodDao.class);
        registerDaoClass(BeanLearningModuleDao.class);
        registerDaoClass(BeanMyClassDao.class);
        registerDaoClass(BeanParentDao.class);
        registerDaoClass(BeanStudentDao.class);
        registerDaoClass(BeanTeacherDao.class);
        registerDaoClass(ContactParentDao.class);
        registerDaoClass(ContactSchoolDao.class);
        registerDaoClass(ContactStudentDao.class);
        registerDaoClass(ContactTeacherDao.class);
        registerDaoClass(BeanCountyDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
