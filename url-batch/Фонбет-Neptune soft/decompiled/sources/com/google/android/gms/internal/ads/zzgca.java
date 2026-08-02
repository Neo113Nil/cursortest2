package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgca extends zzgck {
    zzgca() {
    }

    public static zzgca zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgca ? (zzgca) listenableFuture : new zzgcb(listenableFuture);
    }
}
