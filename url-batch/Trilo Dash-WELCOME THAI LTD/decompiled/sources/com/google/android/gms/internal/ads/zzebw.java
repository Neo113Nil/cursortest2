package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzebw {
    private final zzfvk zza;
    private final zzebd zzb;
    private final zzgpo zzc;

    public zzebw(zzfvk zzfvkVar, zzebd zzebdVar, zzgpo zzgpoVar) {
        this.zza = zzfvkVar;
        this.zzb = zzebdVar;
        this.zzc = zzgpoVar;
    }

    private final zzfvj zzg(final zzbzu zzbzuVar, zzebv zzebvVar, final zzebv zzebvVar2, final zzfuh zzfuhVar) {
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfva.zzg(zzfva.zzn(zzfur.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfva.zzh(new zzebm(1)) : zzfva.zzg(zzebvVar.zza(zzbzuVar), ExecutionException.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfva.zzh(((ExecutionException) obj).getCause());
            }
        }, this.zza)), zzfuhVar, this.zza), zzebm.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzebw.this.zzb(zzebvVar2, zzbzuVar, zzfuhVar, (zzebm) obj);
            }
        }, this.zza);
    }

    public final zzfvj zza(final zzbzu zzbzuVar) {
        zzfuh zzfuhVar = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzbzu zzbzuVar2 = zzbzu.this;
                zzbzuVar2.zzj = new String(zzftj.zza((InputStream) obj), zzfog.zzc);
                return zzfva.zzi(zzbzuVar2);
            }
        };
        final zzebd zzebdVar = this.zzb;
        return zzg(zzbzuVar, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebd.this.zzb(zzbzuVar2);
            }
        }, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zzc(zzbzuVar2);
            }
        }, zzfuhVar);
    }

    final /* synthetic */ zzfvj zzb(zzebv zzebvVar, zzbzu zzbzuVar, zzfuh zzfuhVar, zzebm zzebmVar) throws Exception {
        return zzfva.zzn(zzebvVar.zza(zzbzuVar), zzfuhVar, this.zza);
    }

    final /* synthetic */ zzfvj zzc(zzbzu zzbzuVar) {
        return ((zzecn) this.zzc.zzb()).zzb(zzbzuVar, Binder.getCallingUid());
    }

    final /* synthetic */ zzfvj zzd(zzbzu zzbzuVar) {
        return this.zzb.zzc(((Boolean) zzbju.zzd.zze()).booleanValue() ? zzbzuVar.zzh : zzbzuVar.zzj);
    }

    final /* synthetic */ zzfvj zze(zzbzu zzbzuVar) {
        return ((zzecn) this.zzc.zzb()).zzi(((Boolean) zzbju.zzd.zze()).booleanValue() ? zzbzuVar.zzh : zzbzuVar.zzj);
    }

    public final zzfvj zzf(zzbzu zzbzuVar) {
        if (zzapf.zzg(zzbzuVar.zzj)) {
            return zzfva.zzh(new zzdzk(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbzuVar, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zzd(zzbzuVar2);
            }
        }, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zze(zzbzuVar2);
            }
        }, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfva.zzi(null);
            }
        });
    }
}
