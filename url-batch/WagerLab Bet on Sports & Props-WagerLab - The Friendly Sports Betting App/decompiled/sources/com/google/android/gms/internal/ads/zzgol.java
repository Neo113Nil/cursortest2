package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzgol extends zzgou {
    zzgol() {
    }

    public static zzgol zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgol ? (zzgol) listenableFuture : new zzgom(listenableFuture);
    }
}
