package com.liskovsoft.smartyoutubetv2.common.app.presenters.settings;

import android.content.Context;
import com.liskovsoft.sharedutils.helpers.AppInfoHelpers;
import com.liskovsoft.smartyoutubetv2.common.R;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.AppDialogPresenter;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.base.BasePresenter;

public class AboutSimpleSettingsPresenter extends BasePresenter<Void> {

    public AboutSimpleSettingsPresenter(Context context) {
        super(context);

    }

    public static AboutSimpleSettingsPresenter instance(Context context) {
        return new AboutSimpleSettingsPresenter(context);
    }

    public void show() {
        String mainTitle = String.format("%s %s",
                getContext().getString(R.string.app_name) + " MOD",
                AppInfoHelpers.getAppVersionName(getContext()));

        AppDialogPresenter settingsPresenter = AppDialogPresenter.instance(getContext());
        // FreeTube: remove inherited update and bridge installation actions.

settingsPresenter.showDialog(mainTitle);
    }

}
