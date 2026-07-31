package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzest implements zzeup {
    private static String zzc;
    private final zzgpd zza;
    private final Context zzb;

    public zzest(zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzest.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzesu zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
            return new zzesu(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfS)).booleanValue()) {
            return new zzesu(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzesu(zzc);
    }
}
