package com.codeup.adlister.dao;

import com.codeup.adlister.dao.ListAdsDao;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}