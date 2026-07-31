package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzewk implements zzeup {
    public zzewk(zzbyk zzbykVar, zzgpd zzgpdVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        final ListenableFuture zza = zzgot.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgn)).booleanValue()) {
            zza = zzgot.zza(null);
        }
        final ListenableFuture zza2 = zzgot.zza(null);
        return zzgot.zzn(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewl((String) ListenableFuture.this.get(), (String) zza2.get());
            }
        }, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 47;
    }
}
