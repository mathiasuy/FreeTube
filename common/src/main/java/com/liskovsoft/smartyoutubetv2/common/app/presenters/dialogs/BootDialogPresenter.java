package com.liskovsoft.smartyoutubetv2.common.app.presenters.dialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.base.BasePresenter;

/** FreeTube: no inherited update or APK installer during application startup. */
public class BootDialogPresenter extends BasePresenter<Void> {
    @SuppressLint("StaticFieldLeak")
    private static BootDialogPresenter sInstance;

    public BootDialogPresenter(Context context) {
        super(context);
    }

    public static BootDialogPresenter instance(Context context) {
        if (sInstance == null) {
            sInstance = new BootDialogPresenter(context);
        }
        sInstance.setContext(context);
        return sInstance;
    }

    public void start() {
        // Intentionally do not contact remote update manifests.
    }
}
