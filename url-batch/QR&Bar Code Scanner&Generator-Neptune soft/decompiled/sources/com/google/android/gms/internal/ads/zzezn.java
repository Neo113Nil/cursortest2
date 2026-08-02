package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzezn implements zzeou {
    final /* synthetic */ zzezo zza;

    zzezn(zzezo zzezoVar) {
        this.zza = zzezoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezg zzezgVar;
        zzezg zzezgVar2;
        zzcwv zzcwvVar = (zzcwv) obj;
        synchronized (this.zza) {
            zzcwv zzcwvVar2 = this.zza.zza;
            if (zzcwvVar2 != null) {
                zzcwvVar2.zzV();
            }
            zzezo zzezoVar = this.zza;
            zzezoVar.zza = zzcwvVar;
            zzcwvVar.zzc(zzezoVar);
            zzezo zzezoVar2 = this.zza;
            zzezgVar = zzezoVar2.zzg;
            zzezgVar2 = zzezoVar2.zzg;
            zzezgVar.zzl(new zzcww(zzcwvVar, zzezoVar2, zzezgVar2));
            zzcwvVar.zzW();
        }
    }
}
