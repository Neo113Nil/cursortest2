package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.HttpUtil;

/* loaded from: classes4.dex */
class HttpUtilJni implements HttpUtil.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    HttpUtilJni() {
    }

    public static HttpUtil.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (HttpUtil.Natives) obj;
        }
        return new HttpUtilJni();
    }

    public static void setInstanceForTesting(HttpUtil.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.HttpUtil.Natives
    public boolean isAllowedHeader(String str, String str2) {
        return GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(str, str2);
    }
}
