package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffd implements zzfdi {
    public zzffd(zzcfk zzcfkVar, zzhdi zzhdiVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        final ListenableFuture zza = zzhcy.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgU)).booleanValue()) {
            zza = zzhcy.zza(null);
        }
        final ListenableFuture zza2 = zzhcy.zza(null);
        return zzhcy.zzo(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzffe((String) ListenableFuture.this.get(), (String) zza2.get());
            }
        }, zzcgj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 47;
    }
}
