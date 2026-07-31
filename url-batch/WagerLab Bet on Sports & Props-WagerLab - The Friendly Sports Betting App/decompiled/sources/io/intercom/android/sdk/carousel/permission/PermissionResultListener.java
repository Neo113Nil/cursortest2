package io.intercom.android.sdk.carousel.permission;

/* loaded from: classes8.dex */
public interface PermissionResultListener {
    void requestBackgroundLocationPermission();

    void showDeniedPermanently();

    void showDeniedTemporarily();

    void showGranted();
}
