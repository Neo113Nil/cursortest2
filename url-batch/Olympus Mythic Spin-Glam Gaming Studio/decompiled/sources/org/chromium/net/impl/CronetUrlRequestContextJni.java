package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes13.dex */
class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUrlRequestContextJni() {
    }

    public static CronetUrlRequestContext.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CronetUrlRequestContext.Natives) obj;
        }
        return new CronetUrlRequestContextJni();
    }

    public static void setInstanceForTesting(CronetUrlRequestContext.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addPkp(long j, String str, byte[][] bArr, boolean z, long j2) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addPkp(j, str, bArr, z, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addQuicHint(long j, String str, int i, int i2) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(j, str, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void configureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(j, z, z2, z3);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextAdapter(long j) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextConfig(byte[] bArr) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(bArr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_destroy(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void flushWritePropertiesForTesting(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_flushWritePropertiesForTesting(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void initRequestContextOnInitThread(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(j, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideRTTObservations(long j, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideThroughputObservations(long j, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void startNetLogToDisk(long j, String str, boolean z, int i) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(j, str, z, i);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean startNetLogToFile(long j, String str, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(j, str, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void stopNetLog(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(j);
    }
}
