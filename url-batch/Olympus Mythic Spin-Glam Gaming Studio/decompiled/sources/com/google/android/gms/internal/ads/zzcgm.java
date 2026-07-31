package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcgm {
    public static void zza(ListenableFuture listenableFuture, String str, Executor executor) {
        zzhcy.zzr(listenableFuture, new zzcgk(str), executor);
    }

    public static void zzb(ListenableFuture listenableFuture, String str) {
        zzhcy.zzr(listenableFuture, new zzcgl(str), zzcgj.zzh);
    }
}
