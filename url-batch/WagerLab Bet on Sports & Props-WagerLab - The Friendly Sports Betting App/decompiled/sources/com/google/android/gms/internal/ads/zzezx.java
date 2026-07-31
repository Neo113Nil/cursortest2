package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzezx {
    private final zzfer zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzezv zzd;

    public zzezx(zzfer zzferVar, zzcuz zzcuzVar, Executor executor) {
        this.zza = zzferVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzffb zzb() {
        zzfdc zzb = this.zzb.zzb();
        return this.zza.zzd(zzb.zzd, zzb.zzg, zzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFuture;
        zzezv zzezvVar = this.zzd;
        if (zzezvVar != null) {
            return zzgot.zza(zzezvVar);
        }
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            zzgol zzw = zzgol.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzezu zzezuVar = new zzezu(this);
            Executor executor = this.zzc;
            listenableFuture = (zzgol) zzgot.zzg((zzgol) zzgot.zzk(zzw, zzezuVar, executor), zzdzk.class, new zzezt(this), executor);
        } else {
            zzezv zzezvVar2 = new zzezv(null, zzb(), null);
            this.zzd = zzezvVar2;
            listenableFuture = zzgot.zza(zzezvVar2);
        }
        return zzgot.zzk(listenableFuture, zzezw.zza, this.zzc);
    }

    final /* synthetic */ zzezv zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzezv zzezvVar) {
        this.zzd = zzezvVar;
    }
}
