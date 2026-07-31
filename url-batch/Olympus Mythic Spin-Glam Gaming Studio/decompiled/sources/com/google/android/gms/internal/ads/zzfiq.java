package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzfiq {
    private final zzfnl zza;
    private final zzdcx zzb;
    private final Executor zzc;
    private zzfio zzd;

    public zzfiq(zzfnl zzfnlVar, zzdcx zzdcxVar, Executor executor) {
        this.zza = zzfnlVar;
        this.zzb = zzdcxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfnv zzb() {
        zzflw zzb = this.zzb.zzb();
        return this.zza.zzd(zzb.zzd, zzb.zzg, zzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFuture;
        zzfio zzfioVar = this.zzd;
        if (zzfioVar != null) {
            return zzhcy.zza(zzfioVar);
        }
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            zzhcq zzw = zzhcq.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfin zzfinVar = new zzfin(this);
            Executor executor = this.zzc;
            listenableFuture = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk(zzw, zzfinVar, executor), zzehp.class, new zzfim(this), executor);
        } else {
            zzfio zzfioVar2 = new zzfio(null, zzb(), null);
            this.zzd = zzfioVar2;
            listenableFuture = zzhcy.zza(zzfioVar2);
        }
        return zzhcy.zzk(listenableFuture, zzfip.zza, this.zzc);
    }

    final /* synthetic */ zzfio zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzfio zzfioVar) {
        this.zzd = zzfioVar;
    }
}
