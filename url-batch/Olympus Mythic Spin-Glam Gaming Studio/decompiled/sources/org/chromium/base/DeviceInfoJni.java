package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.DeviceInfo;

/* loaded from: classes10.dex */
class DeviceInfoJni implements DeviceInfo.Natives {
    private static JniTestInstanceHolder sOverride;

    DeviceInfoJni() {
    }

    public static DeviceInfo.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (DeviceInfo.Natives) obj;
        }
        return new DeviceInfoJni();
    }

    @Override // org.chromium.base.DeviceInfo.Natives
    public void fillFields(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6) {
        GEN_JNI.org_chromium_base_DeviceInfo_fillFields(str, z, z2, z3, z4, i, z5, z6);
    }
}
