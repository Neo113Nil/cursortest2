package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.ApkInfo;

/* loaded from: classes3.dex */
class ApkInfoJni implements ApkInfo.Natives {
    private static JniTestInstanceHolder sOverride;

    ApkInfoJni() {
    }

    public static ApkInfo.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (ApkInfo.Natives) obj;
        }
        return new ApkInfoJni();
    }

    @Override // org.chromium.base.ApkInfo.Natives
    public void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i) {
        GEN_JNI.org_chromium_base_ApkInfo_fillFields(str, str2, str3, str4, str5, str6, str7, str8, z, i);
    }
}
