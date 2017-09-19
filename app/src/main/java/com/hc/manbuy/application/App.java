package com.hc.manbuy.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.hc.manbuy.dao.DaoMaster;
import com.hc.manbuy.dao.DaoSession;
import com.hc.manbuy.dao.UserDao;

/**
 * Created by YU on 2017/9/16.
 */

public class App extends Application {
    private UserDao userDao;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper Helper = new DaoMaster.DevOpenHelper(this, "User.db", null);
        SQLiteDatabase db = Helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();

    }
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
