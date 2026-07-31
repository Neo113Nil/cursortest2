package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes5.dex */
class CronetUrlRequestJni implements CronetUrlRequest.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUrlRequestJni() {
    }

    public static CronetUrlRequest.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CronetUrlRequest.Natives) obj;
        }
        return new CronetUrlRequestJni();
    }

    public static void setInstanceForTesting(CronetUrlRequest.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean addRequestHeader(long j, String str, String str2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_addRequestHeader(j, str, str2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public long createRequestAdapter(CronetUrlRequest cronetUrlRequest, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, byte[] bArr, ByteBuffer byteBuffer, int i5, int i6, String str2, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(cronetUrlRequest, j, str, i, z, z2, z3, i2, z4, i3, i4, bArr, byteBuffer, i5, i6, str2, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void destroy(long j, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_destroy(j, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void followDeferredRedirect(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void getStatus(long j, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_getStatus(j, urlRequestStatusListener);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean readData(long j, ByteBuffer byteBuffer, int i, int i2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_readData(j, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean setHttpMethod(long j, String str) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_setHttpMethod(j, str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void start(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_start(j);
    }
}
