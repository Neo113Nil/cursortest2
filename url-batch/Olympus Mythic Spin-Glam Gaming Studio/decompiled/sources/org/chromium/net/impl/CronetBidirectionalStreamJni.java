package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes3.dex */
class CronetBidirectionalStreamJni implements CronetBidirectionalStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetBidirectionalStreamJni() {
    }

    public static CronetBidirectionalStream.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CronetBidirectionalStream.Natives) obj;
        }
        return new CronetBidirectionalStreamJni();
    }

    public static void setInstanceForTesting(CronetBidirectionalStream.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public long createBidirectionalStream(CronetBidirectionalStream cronetBidirectionalStream, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(cronetBidirectionalStream, j, z, z2, i, z3, i2, j2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_destroy(j);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean readData(long j, ByteBuffer byteBuffer, int i, int i2) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_readData(j, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void sendRequestHeaders(long j) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(j);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public int start(long j, String str, int i, String str2, String[] strArr, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_start(j, str, i, str2, strArr, z);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean writevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_writevData(j, byteBufferArr, iArr, iArr2, z);
    }
}
