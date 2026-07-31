package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.AndroidInfo;

/* loaded from: classes6.dex */
class AndroidInfoJni implements AndroidInfo.Natives {
    private static JniTestInstanceHolder sOverride;

    AndroidInfoJni() {
    }

    public static AndroidInfo.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (AndroidInfo.Natives) obj;
        }
        return new AndroidInfoJni();
    }

    @Override // org.chromium.base.AndroidInfo.Natives
    public void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z, String str14) {
        GEN_JNI.org_chromium_base_AndroidInfo_fillFields(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i, z, str14);
    }
}
