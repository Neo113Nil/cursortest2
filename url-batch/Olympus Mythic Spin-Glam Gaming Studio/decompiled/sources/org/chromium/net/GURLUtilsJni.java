package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.GURLUtils;

/* loaded from: classes4.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static GURLUtils.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (GURLUtils.Natives) obj;
        }
        return new GURLUtilsJni();
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) GEN_JNI.org_chromium_net_GURLUtils_getOrigin(str);
    }
}
