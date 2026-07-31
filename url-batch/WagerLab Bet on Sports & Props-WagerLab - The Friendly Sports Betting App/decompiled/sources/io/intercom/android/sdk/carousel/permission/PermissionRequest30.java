package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
class PermissionRequest30 extends PermissionRequestBefore30 {
    PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    protected void handleRequest(List<String> list, int i) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, i);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    protected void handleGranted(String[] strArr) {
        if (askForBackgroundPermission(Arrays.asList(strArr))) {
            if (isBackgroundPermissionDeniedPermanently()) {
                getListener().showDeniedPermanently();
                return;
            } else {
                getListener().requestBackgroundLocationPermission();
                return;
            }
        }
        getListener().showGranted();
    }

    private boolean askForBackgroundPermission(List<String> list) {
        return isLocationPermission(list) && isBackgroundPermissionInManifest();
    }

    private boolean isLocationPermission(List<String> list) {
        return list.contains("android.permission.ACCESS_COARSE_LOCATION") || list.contains("android.permission.ACCESS_FINE_LOCATION");
    }

    private boolean isBackgroundPermissionInManifest() {
        return !this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty();
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        return this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2;
    }
}
