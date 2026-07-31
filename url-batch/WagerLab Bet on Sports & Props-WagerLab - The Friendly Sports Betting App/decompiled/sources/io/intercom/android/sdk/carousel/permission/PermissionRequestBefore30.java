package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener();
    protected final PermissionManager permissionManager;
    private PermissionResultListener permissionResultListener;

    PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void attach(PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void detach() {
        this.permissionResultListener = null;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void request(ScreenAction screenAction, int i) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (validPermissions.isEmpty()) {
            return;
        }
        handleRequest(validPermissions, i);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void handleResult(String[] strArr, int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    protected void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    protected void handleRequest(List<String> list, int i) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i);
    }

    PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener = this.permissionResultListener;
        return permissionResultListener == null ? this.nullListener : permissionResultListener;
    }

    private void handleRequestResult(String[] strArr, int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    private static final class NullPermissionResultListener implements PermissionResultListener {
        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void requestBackgroundLocationPermission() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedPermanently() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedTemporarily() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showGranted() {
        }

        private NullPermissionResultListener() {
        }
    }
}
