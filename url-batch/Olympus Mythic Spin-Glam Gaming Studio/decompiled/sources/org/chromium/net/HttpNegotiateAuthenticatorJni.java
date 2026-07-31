package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.HttpNegotiateAuthenticator;

/* loaded from: classes3.dex */
class HttpNegotiateAuthenticatorJni implements HttpNegotiateAuthenticator.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    HttpNegotiateAuthenticatorJni() {
    }

    public static HttpNegotiateAuthenticator.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (HttpNegotiateAuthenticator.Natives) obj;
        }
        return new HttpNegotiateAuthenticatorJni();
    }

    public static void setInstanceForTesting(HttpNegotiateAuthenticator.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.HttpNegotiateAuthenticator.Natives
    public void setResult(long j, int i, String str) {
        GEN_JNI.org_chromium_net_HttpNegotiateAuthenticator_setResult(j, i, str);
    }
}
