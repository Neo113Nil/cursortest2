package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdah {
    private final zzecp zza;
    private final zzfef zzb;
    private final zzfih zzc;
    private final zzctu zzd;
    private final zzekt zze;
    private final zzdie zzf;
    private zzfdw zzg;
    private final zzedt zzh;
    private final zzdcg zzi;
    private final Executor zzj;
    private final zzedg zzk;
    private final zzehh zzl;

    zzdah(zzecp zzecpVar, zzfef zzfefVar, zzfih zzfihVar, zzctu zzctuVar, zzekt zzektVar, zzdie zzdieVar, zzfdw zzfdwVar, zzedt zzedtVar, zzdcg zzdcgVar, Executor executor, zzedg zzedgVar, zzehh zzehhVar) {
        this.zza = zzecpVar;
        this.zzb = zzfefVar;
        this.zzc = zzfihVar;
        this.zzd = zzctuVar;
        this.zze = zzektVar;
        this.zzf = zzdieVar;
        this.zzg = zzfdwVar;
        this.zzh = zzedtVar;
        this.zzi = zzdcgVar;
        this.zzj = executor;
        this.zzk = zzedgVar;
        this.zzl = zzehhVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzffe.zzb(th, this.zzl);
    }

    public final zzdie zzc() {
        return this.zzf;
    }

    final /* synthetic */ zzfdw zzd(zzfdw zzfdwVar) throws Exception {
        this.zzd.zza(zzfdwVar);
        return zzfdwVar;
    }

    public final zzfzp zze(final zzffx zzffxVar) {
        zzfhm zza = this.zzc.zzb(zzfib.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdae
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdah.this.zzf(zzffxVar, (zzcbc) obj);
            }
        }).zza();
        zzfzg.zzr(zza, new zzdaf(this), this.zzj);
        return zza;
    }

    final /* synthetic */ zzfzp zzf(zzffx zzffxVar, zzcbc zzcbcVar) throws Exception {
        zzcbcVar.zzi = zzffxVar;
        return this.zzh.zza(zzcbcVar);
    }

    public final zzfzp zzg(zzcbc zzcbcVar) {
        zzfhm zza = this.zzc.zzb(zzfib.NOTIFY_CACHE_HIT, this.zzh.zzf(zzcbcVar)).zza();
        zzfzg.zzr(zza, new zzdag(this), this.zzj);
        return zza;
    }

    public final zzfzp zzh(zzfzp zzfzpVar) {
        zzfhy zzf = this.zzc.zzb(zzfib.RENDERER, zzfzpVar).zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzdad
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                zzfdw zzfdwVar = (zzfdw) obj;
                zzdah.this.zzd(zzfdwVar);
                return zzfdwVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeD)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeE)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final zzfzp zzi() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfih zzfihVar = this.zzc;
        return zzfhr.zzc(this.zza.zza(), zzfib.PRELOADED_LOADER, zzfihVar).zza();
    }

    public final zzfzp zzj(zzfzp zzfzpVar) {
        if (this.zzg != null) {
            zzfih zzfihVar = this.zzc;
            return zzfhr.zzc(zzfzg.zzi(this.zzg), zzfib.SERVER_TRANSACTION, zzfihVar).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        zzfhy zzb = this.zzc.zzb(zzfib.SERVER_TRANSACTION, zzfzpVar);
        final zzedg zzedgVar = this.zzk;
        return zzb.zzf(new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzedg.this.zzb((zzcbc) obj);
            }
        }).zza();
    }

    public final void zzk(zzfdw zzfdwVar) {
        this.zzg = zzfdwVar;
    }
}
