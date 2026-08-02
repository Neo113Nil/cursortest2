package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfav {
    private final zzffq zza;
    private final zzdcj zzb;
    private final Executor zzc;
    private zzfau zzd;

    public zzfav(zzffq zzffqVar, zzdcj zzdcjVar, Executor executor) {
        this.zza = zzffqVar;
        this.zzb = zzdcjVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfga zze() {
        zzfef zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfzp zzc() {
        zzfzp zzf;
        zzfau zzfauVar = this.zzd;
        if (zzfauVar != null) {
            return zzfzg.zzi(zzfauVar);
        }
        if (((Boolean) zzbky.zza.zze()).booleanValue()) {
            zzf = zzfzg.zzf(zzfzg.zzm(zzfyx.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzfas(this), this.zzc), zzedj.class, new zzfar(this), this.zzc);
        } else {
            zzfau zzfauVar2 = new zzfau(null, zze(), null);
            this.zzd = zzfauVar2;
            zzf = zzfzg.zzi(zzfauVar2);
        }
        return zzfzg.zzm(zzf, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return (zzfau) obj;
            }
        }, this.zzc);
    }
}
