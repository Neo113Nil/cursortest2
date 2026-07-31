package com.my.target.common.webform;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public interface WebFormClient {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface CustomSdkUserInfoCallback {
        void onGetUserInfo(@Nullable UserInfo userInfo);
    }

    @Nullable
    @Deprecated
    UserInfo getCustomSdkUserInfo(@NonNull WebForm webForm);

    void getCustomSdkUserInfo(@NonNull WebForm webForm, @NonNull CustomSdkUserInfoCallback customSdkUserInfoCallback);

    @Nullable
    View getErrorView(@NonNull String str, @NonNull WebForm webForm);

    void onCopyText(@NonNull String str, @NonNull WebForm webForm);

    void onDismiss(@NonNull WebForm webForm);

    void onPresent(@NonNull WebForm webForm);

    void setViewSettings(@NonNull WebFormSetViewSettings webFormSetViewSettings, @NonNull WebForm webForm);
}
