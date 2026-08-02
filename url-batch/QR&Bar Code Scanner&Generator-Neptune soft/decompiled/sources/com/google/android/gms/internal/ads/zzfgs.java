package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfgs {
    private final zzfgl zza;
    private final zzfzp zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfgs(final zzffq zzffqVar, final zzfgk zzfgkVar, final zzfgl zzfglVar) {
        this.zza = zzfglVar;
        this.zzb = zzfzg.zzg(zzfzg.zzn(zzfgkVar.zza(zzfglVar), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfgq
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfgs.this.zzb(zzfgkVar, zzffqVar, zzfglVar, (zzffz) obj);
            }
        }, zzfglVar.zzb()), Exception.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfgr
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfgs.this.zzc(zzfgkVar, (Exception) obj);
            }
        }, zzfglVar.zzb());
    }

    public final synchronized zzfzp zza(zzfgl zzfglVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfglVar.zza() != null && this.zza.zza().equals(zzfglVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ zzfzp zzb(zzfgk zzfgkVar, zzffq zzffqVar, zzfgl zzfglVar, zzffz zzffzVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfgkVar.zzb(zzffzVar);
            if (this.zzc) {
                return zzfzg.zzi(new zzfgj(zzffzVar, zzfglVar));
            }
            zzffqVar.zzd(zzfglVar.zza(), zzffzVar);
            return zzfzg.zzi(null);
        }
    }

    final /* synthetic */ zzfzp zzc(zzfgk zzfgkVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfzc zzfzcVar) {
        zzfzg.zzr(zzfzg.zzn(this.zzb, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfgp
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzj();
            }
        }, this.zza.zzb()), zzfzcVar, this.zza.zzb());
    }
}
