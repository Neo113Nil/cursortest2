package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbut {
    private final zzbtw zza;
    private zzfzp zzb;

    zzbut(zzbtw zzbtwVar) {
        this.zza = zzbtwVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzchh zzchhVar = new zzchh();
            this.zzb = zzchhVar;
            this.zza.zzb(null).zzi(new zzchl() { // from class: com.google.android.gms.internal.ads.zzbur
                @Override // com.google.android.gms.internal.ads.zzchl
                public final void zza(Object obj) {
                    zzchh.this.zzd((zzbtx) obj);
                }
            }, new zzchj() { // from class: com.google.android.gms.internal.ads.zzbus
                @Override // com.google.android.gms.internal.ads.zzchj
                public final void zza() {
                    zzchh.this.zze(new zzbtz("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbuw zza(String str, zzbud zzbudVar, zzbuc zzbucVar) {
        zzd();
        return new zzbuw(this.zzb, "google.afma.activeView.handleUpdate", zzbudVar, zzbucVar);
    }

    public final void zzb(final String str, final zzbpu zzbpuVar) {
        zzd();
        this.zzb = zzfzg.zzn(this.zzb, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzbup
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                zzbtx zzbtxVar = (zzbtx) obj;
                zzbtxVar.zzq(str, zzbpuVar);
                return zzfzg.zzi(zzbtxVar);
            }
        }, zzchc.zzf);
    }

    public final void zzc(final String str, final zzbpu zzbpuVar) {
        this.zzb = zzfzg.zzm(this.zzb, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzbuq
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzbtx zzbtxVar = (zzbtx) obj;
                zzbtxVar.zzr(str, zzbpuVar);
                return zzbtxVar;
            }
        }, zzchc.zzf);
    }
}
