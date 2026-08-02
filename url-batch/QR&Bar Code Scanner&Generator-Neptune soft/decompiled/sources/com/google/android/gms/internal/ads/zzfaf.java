package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfaf implements zzfaz {
    private final zzfaz zza;
    private final zzfaz zzb;
    private final zzfgm zzc;
    private final String zzd;
    private zzdcj zze;
    private final Executor zzf;

    public zzfaf(zzfaz zzfazVar, zzfaz zzfazVar2, zzfgm zzfgmVar, String str, Executor executor) {
        this.zza = zzfazVar;
        this.zzb = zzfazVar2;
        this.zzc = zzfgmVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfzp zzg(zzffz zzffzVar, zzfba zzfbaVar) {
        zzdcj zzdcjVar = zzffzVar.zza;
        this.zze = zzdcjVar;
        if (zzffzVar.zzc != null) {
            if (zzdcjVar.zzf() != null) {
                zzffzVar.zzc.zzo().zzbL(zzffzVar.zza.zzf());
            }
            return zzfzg.zzi(zzffzVar.zzc);
        }
        zzdcjVar.zzb().zzk(zzffzVar.zzb);
        return ((zzfap) this.zza).zzb(zzfbaVar, null, zzffzVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcj zzd() {
        return this.zze;
    }

    final /* synthetic */ zzfzp zzb(zzfba zzfbaVar, zzfae zzfaeVar, zzfay zzfayVar, zzdcj zzdcjVar, zzfak zzfakVar) throws Exception {
        if (zzfakVar != null) {
            zzfae zzfaeVar2 = new zzfae(zzfaeVar.zza, zzfaeVar.zzb, zzfaeVar.zzc, zzfaeVar.zzd, zzfaeVar.zze, zzfaeVar.zzf, zzfakVar.zza);
            if (zzfakVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfaeVar2);
                return zzg(zzfakVar.zzc, zzfbaVar);
            }
            zzfzp zza = this.zzc.zza(zzfaeVar2);
            if (zza != null) {
                this.zze = null;
                return zzfzg.zzn(zza, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfab
                    @Override // com.google.android.gms.internal.ads.zzfyn
                    public final zzfzp zza(Object obj) {
                        return zzfaf.this.zze((zzfgj) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfaeVar2);
            zzfbaVar = new zzfba(zzfbaVar.zzb, zzfakVar.zzb);
        }
        zzfzp zzb = ((zzfap) this.zza).zzb(zzfbaVar, zzfayVar, zzdcjVar);
        this.zze = zzdcjVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzfba zzfbaVar, zzfay zzfayVar, Object obj) {
        return zzf(zzfbaVar, zzfayVar, null);
    }

    final /* synthetic */ zzfzp zze(zzfgj zzfgjVar) throws Exception {
        zzfgl zzfglVar;
        if (zzfgjVar == null || zzfgjVar.zza == null || (zzfglVar = zzfgjVar.zzb) == null) {
            throw new zzebh(1, "Empty prefetch");
        }
        zzbfe zza = zzbfk.zza();
        zzbfc zza2 = zzbfd.zza();
        zza2.zzd(2);
        zza2.zzb(zzbfh.zzd());
        zza.zza(zza2);
        zzfgjVar.zza.zza.zzb().zzc().zzi((zzbfk) zza.zzam());
        return zzg(zzfgjVar.zza, ((zzfae) zzfglVar).zzb);
    }

    public final synchronized zzfzp zzf(final zzfba zzfbaVar, final zzfay zzfayVar, zzdcj zzdcjVar) {
        zzdci zza = zzfayVar.zza(zzfbaVar.zzb);
        zza.zza(new zzfag(this.zzd));
        final zzdcj zzdcjVar2 = (zzdcj) zza.zzh();
        zzdcjVar2.zzg();
        zzdcjVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzdcjVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfef zzg = zzdcjVar2.zzg();
            final zzfae zzfaeVar = new zzfae(zzfayVar, zzfbaVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfzg.zzn(zzfyx.zzv(((zzfal) this.zzb).zzb(zzfbaVar, zzfayVar, zzdcjVar2)), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfac
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return zzfaf.this.zzb(zzfbaVar, zzfaeVar, zzfayVar, zzdcjVar2, (zzfak) obj);
                }
            }, this.zzf);
        }
        this.zze = zzdcjVar2;
        return ((zzfap) this.zza).zzb(zzfbaVar, zzfayVar, zzdcjVar2);
    }
}
