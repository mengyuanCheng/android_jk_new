package com.hlct.android.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.hlct.android.bean.BankInfo;
import com.hlct.android.bean.LoginUser;
import com.hlct.android.bean.Detail;
import com.hlct.android.bean.User;

import com.hlct.android.greendao.BankInfoDao;
import com.hlct.android.greendao.LoginUserDao;
import com.hlct.android.greendao.DetailDao;
import com.hlct.android.greendao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bankInfoDaoConfig;
    private final DaoConfig loginUserDaoConfig;
    private final DaoConfig detailDaoConfig;
    private final DaoConfig userDaoConfig;

    private final BankInfoDao bankInfoDao;
    private final LoginUserDao loginUserDao;
    private final DetailDao detailDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bankInfoDaoConfig = daoConfigMap.get(BankInfoDao.class).clone();
        bankInfoDaoConfig.initIdentityScope(type);

        loginUserDaoConfig = daoConfigMap.get(LoginUserDao.class).clone();
        loginUserDaoConfig.initIdentityScope(type);

        detailDaoConfig = daoConfigMap.get(DetailDao.class).clone();
        detailDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        bankInfoDao = new BankInfoDao(bankInfoDaoConfig, this);
        loginUserDao = new LoginUserDao(loginUserDaoConfig, this);
        detailDao = new DetailDao(detailDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(BankInfo.class, bankInfoDao);
        registerDao(LoginUser.class, loginUserDao);
        registerDao(Detail.class, detailDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        bankInfoDaoConfig.clearIdentityScope();
        loginUserDaoConfig.clearIdentityScope();
        detailDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public BankInfoDao getBankInfoDao() {
        return bankInfoDao;
    }

    public LoginUserDao getLoginUserDao() {
        return loginUserDao;
    }

    public DetailDao getDetailDao() {
        return detailDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
