package com.liskovsoft.smartyoutubetv2.common.app.presenters.dialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liskovsoft.appupdatechecker2.AppUpdateCheckerListener;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.base.BasePresenter;
import java.util.List;

/**
 * FreeTube: disabled upstream remote APK update and installation.
 * Updates must be independently audited, compiled and signed.
 */
public class AppUpdatePresenter extends BasePresenter<Void> implements AppUpdateCheckerListener {
    @SuppressLint("StaticFieldLeak")
    private static AppUpdatePresenter sInstance;

    public AppUpdatePresenter(Context context) {
        super(context);
    }

    public static AppUpdatePresenter instance(Context context) {
        if (sInstance == null) {
            sInstance = new AppUpdatePresenter(context);
        }
        sInstance.setContext(context);
        return sInstance;
    }

    public static void unhold() {
        sInstance = null;
    }

    public void start(boolean forceCheck) {
        // Both automatic and manual checks are disabled.
        onFinish();
    }

    @Override
    public void onUpdateFound(String versionName, List<String> changelog, String apkPath) {
        // No remote APK can be offered or installed here.
    }

    @Override
    public void onUpdateError(Exception error) {
        onFinish();
    }
}
