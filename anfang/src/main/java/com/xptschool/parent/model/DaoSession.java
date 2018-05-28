package com.xptschool.parent.model;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.xptschool.parent.model.BeanBanner;
import com.xptschool.parent.model.BeanCounty;
import com.xptschool.parent.model.BeanHomeCfg;
import com.xptschool.parent.model.BeanLearningModule;
import com.xptschool.parent.model.BeanMyClass;
import com.xptschool.parent.model.BeanParent;
import com.xptschool.parent.model.BeanStudent;
import com.xptschool.parent.model.BeanUser;
import com.xptschool.parent.model.BeanWChat;
import com.xptschool.parent.model.ContactParent;
import com.xptschool.parent.model.ContactSchool;
import com.xptschool.parent.model.ContactStudent;
import com.xptschool.parent.model.ContactTeacher;

import com.xptschool.parent.model.BeanBannerDao;
import com.xptschool.parent.model.BeanCountyDao;
import com.xptschool.parent.model.BeanHomeCfgDao;
import com.xptschool.parent.model.BeanLearningModuleDao;
import com.xptschool.parent.model.BeanMyClassDao;
import com.xptschool.parent.model.BeanParentDao;
import com.xptschool.parent.model.BeanStudentDao;
import com.xptschool.parent.model.BeanUserDao;
import com.xptschool.parent.model.BeanWChatDao;
import com.xptschool.parent.model.ContactParentDao;
import com.xptschool.parent.model.ContactSchoolDao;
import com.xptschool.parent.model.ContactStudentDao;
import com.xptschool.parent.model.ContactTeacherDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig beanBannerDaoConfig;
    private final DaoConfig beanCountyDaoConfig;
    private final DaoConfig beanHomeCfgDaoConfig;
    private final DaoConfig beanLearningModuleDaoConfig;
    private final DaoConfig beanMyClassDaoConfig;
    private final DaoConfig beanParentDaoConfig;
    private final DaoConfig beanStudentDaoConfig;
    private final DaoConfig beanUserDaoConfig;
    private final DaoConfig beanWChatDaoConfig;
    private final DaoConfig contactParentDaoConfig;
    private final DaoConfig contactSchoolDaoConfig;
    private final DaoConfig contactStudentDaoConfig;
    private final DaoConfig contactTeacherDaoConfig;

    private final BeanBannerDao beanBannerDao;
    private final BeanCountyDao beanCountyDao;
    private final BeanHomeCfgDao beanHomeCfgDao;
    private final BeanLearningModuleDao beanLearningModuleDao;
    private final BeanMyClassDao beanMyClassDao;
    private final BeanParentDao beanParentDao;
    private final BeanStudentDao beanStudentDao;
    private final BeanUserDao beanUserDao;
    private final BeanWChatDao beanWChatDao;
    private final ContactParentDao contactParentDao;
    private final ContactSchoolDao contactSchoolDao;
    private final ContactStudentDao contactStudentDao;
    private final ContactTeacherDao contactTeacherDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        beanBannerDaoConfig = daoConfigMap.get(BeanBannerDao.class).clone();
        beanBannerDaoConfig.initIdentityScope(type);

        beanCountyDaoConfig = daoConfigMap.get(BeanCountyDao.class).clone();
        beanCountyDaoConfig.initIdentityScope(type);

        beanHomeCfgDaoConfig = daoConfigMap.get(BeanHomeCfgDao.class).clone();
        beanHomeCfgDaoConfig.initIdentityScope(type);

        beanLearningModuleDaoConfig = daoConfigMap.get(BeanLearningModuleDao.class).clone();
        beanLearningModuleDaoConfig.initIdentityScope(type);

        beanMyClassDaoConfig = daoConfigMap.get(BeanMyClassDao.class).clone();
        beanMyClassDaoConfig.initIdentityScope(type);

        beanParentDaoConfig = daoConfigMap.get(BeanParentDao.class).clone();
        beanParentDaoConfig.initIdentityScope(type);

        beanStudentDaoConfig = daoConfigMap.get(BeanStudentDao.class).clone();
        beanStudentDaoConfig.initIdentityScope(type);

        beanUserDaoConfig = daoConfigMap.get(BeanUserDao.class).clone();
        beanUserDaoConfig.initIdentityScope(type);

        beanWChatDaoConfig = daoConfigMap.get(BeanWChatDao.class).clone();
        beanWChatDaoConfig.initIdentityScope(type);

        contactParentDaoConfig = daoConfigMap.get(ContactParentDao.class).clone();
        contactParentDaoConfig.initIdentityScope(type);

        contactSchoolDaoConfig = daoConfigMap.get(ContactSchoolDao.class).clone();
        contactSchoolDaoConfig.initIdentityScope(type);

        contactStudentDaoConfig = daoConfigMap.get(ContactStudentDao.class).clone();
        contactStudentDaoConfig.initIdentityScope(type);

        contactTeacherDaoConfig = daoConfigMap.get(ContactTeacherDao.class).clone();
        contactTeacherDaoConfig.initIdentityScope(type);

        beanBannerDao = new BeanBannerDao(beanBannerDaoConfig, this);
        beanCountyDao = new BeanCountyDao(beanCountyDaoConfig, this);
        beanHomeCfgDao = new BeanHomeCfgDao(beanHomeCfgDaoConfig, this);
        beanLearningModuleDao = new BeanLearningModuleDao(beanLearningModuleDaoConfig, this);
        beanMyClassDao = new BeanMyClassDao(beanMyClassDaoConfig, this);
        beanParentDao = new BeanParentDao(beanParentDaoConfig, this);
        beanStudentDao = new BeanStudentDao(beanStudentDaoConfig, this);
        beanUserDao = new BeanUserDao(beanUserDaoConfig, this);
        beanWChatDao = new BeanWChatDao(beanWChatDaoConfig, this);
        contactParentDao = new ContactParentDao(contactParentDaoConfig, this);
        contactSchoolDao = new ContactSchoolDao(contactSchoolDaoConfig, this);
        contactStudentDao = new ContactStudentDao(contactStudentDaoConfig, this);
        contactTeacherDao = new ContactTeacherDao(contactTeacherDaoConfig, this);

        registerDao(BeanBanner.class, beanBannerDao);
        registerDao(BeanCounty.class, beanCountyDao);
        registerDao(BeanHomeCfg.class, beanHomeCfgDao);
        registerDao(BeanLearningModule.class, beanLearningModuleDao);
        registerDao(BeanMyClass.class, beanMyClassDao);
        registerDao(BeanParent.class, beanParentDao);
        registerDao(BeanStudent.class, beanStudentDao);
        registerDao(BeanUser.class, beanUserDao);
        registerDao(BeanWChat.class, beanWChatDao);
        registerDao(ContactParent.class, contactParentDao);
        registerDao(ContactSchool.class, contactSchoolDao);
        registerDao(ContactStudent.class, contactStudentDao);
        registerDao(ContactTeacher.class, contactTeacherDao);
    }
    
    public void clear() {
        beanBannerDaoConfig.getIdentityScope().clear();
        beanCountyDaoConfig.getIdentityScope().clear();
        beanHomeCfgDaoConfig.getIdentityScope().clear();
        beanLearningModuleDaoConfig.getIdentityScope().clear();
        beanMyClassDaoConfig.getIdentityScope().clear();
        beanParentDaoConfig.getIdentityScope().clear();
        beanStudentDaoConfig.getIdentityScope().clear();
        beanUserDaoConfig.getIdentityScope().clear();
        beanWChatDaoConfig.getIdentityScope().clear();
        contactParentDaoConfig.getIdentityScope().clear();
        contactSchoolDaoConfig.getIdentityScope().clear();
        contactStudentDaoConfig.getIdentityScope().clear();
        contactTeacherDaoConfig.getIdentityScope().clear();
    }

    public BeanBannerDao getBeanBannerDao() {
        return beanBannerDao;
    }

    public BeanCountyDao getBeanCountyDao() {
        return beanCountyDao;
    }

    public BeanHomeCfgDao getBeanHomeCfgDao() {
        return beanHomeCfgDao;
    }

    public BeanLearningModuleDao getBeanLearningModuleDao() {
        return beanLearningModuleDao;
    }

    public BeanMyClassDao getBeanMyClassDao() {
        return beanMyClassDao;
    }

    public BeanParentDao getBeanParentDao() {
        return beanParentDao;
    }

    public BeanStudentDao getBeanStudentDao() {
        return beanStudentDao;
    }

    public BeanUserDao getBeanUserDao() {
        return beanUserDao;
    }

    public BeanWChatDao getBeanWChatDao() {
        return beanWChatDao;
    }

    public ContactParentDao getContactParentDao() {
        return contactParentDao;
    }

    public ContactSchoolDao getContactSchoolDao() {
        return contactSchoolDao;
    }

    public ContactStudentDao getContactStudentDao() {
        return contactStudentDao;
    }

    public ContactTeacherDao getContactTeacherDao() {
        return contactTeacherDao;
    }

}
