package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetUploadDataStream;

/* loaded from: classes6.dex */
class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUploadDataStreamJni() {
    }

    public static CronetUploadDataStream.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CronetUploadDataStream.Natives) obj;
        }
        return new CronetUploadDataStreamJni();
    }

    public static void setInstanceForTesting(CronetUploadDataStream.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long attachUploadDataToRequest(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createAdapterForTesting(CronetUploadDataStream cronetUploadDataStream) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(cronetUploadDataStream);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createUploadDataStreamForTesting(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_destroy(j);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onReadSucceeded(long j, int i, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(j, i, z);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onRewindSucceeded(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(j);
    }
}
