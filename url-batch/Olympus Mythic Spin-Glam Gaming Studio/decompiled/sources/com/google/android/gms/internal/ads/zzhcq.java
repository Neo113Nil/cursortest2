package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public class zzhcq extends zzhcz {
    zzhcq() {
    }

    public static zzhcq zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhcq ? (zzhcq) listenableFuture : new zzhcr(listenableFuture);
    }
}
