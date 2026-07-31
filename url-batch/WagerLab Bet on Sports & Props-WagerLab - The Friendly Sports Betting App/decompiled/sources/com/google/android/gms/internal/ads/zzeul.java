package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeul implements zzeup {
    private final zzgpd zza;
    private final Context zzb;

    zzeul(zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeul.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 37;
    }

    final /* synthetic */ zzeuj zzc() {
        return new zzeuj(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgB)));
    }
}
