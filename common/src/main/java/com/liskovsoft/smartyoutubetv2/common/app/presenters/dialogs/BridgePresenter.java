package com.liskovsoft.smartyoutubetv2.common.app.presenters.dialogs;

import android.content.Context;
import android.content.Intent;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.base.BasePresenter;
import com.liskovsoft.smartyoutubetv2.common.misc.MotherActivity;

/**
 * FreeTube: disable inherited voice bridge and version restoration APK installers.
 * Preserve subclass contracts pending a full caller audit.
 */
abstract class BridgePresenter extends BasePresenter<Void> implements MotherActivity.OnResult {
    public BridgePresenter(Context context) {
        super(context);
    }

    public void start() {
        onFinish();
    }

    public void runBridgeInstaller(boolean force) {
        // No network APK downloads, package removal or installation.
        onFinish();
    }

    @Override
    public void onResult(int requestCode, int resultCode, Intent data) {
        onFinish();
    }

    protected abstract String getPackageName();
    protected abstract String getPackageUrl();
    protected abstract Integer[] getPackageSignatureHash();
    protected abstract boolean checkLauncher();
}
