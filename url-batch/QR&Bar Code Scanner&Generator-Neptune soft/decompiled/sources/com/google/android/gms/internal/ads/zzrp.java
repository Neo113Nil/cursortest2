package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzrp implements zzss, zzpl {
    final /* synthetic */ zzrr zza;
    private final Object zzb;
    private zzsr zzc;
    private zzpk zzd;

    public zzrp(zzrr zzrrVar, Object obj) {
        this.zza = zzrrVar;
        this.zzc = zzrrVar.zze(null);
        this.zzd = zzrrVar.zzc(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzsi zzsiVar) {
        zzsi zzsiVar2;
        if (zzsiVar != null) {
            zzsiVar2 = this.zza.zzv(this.zzb, zzsiVar);
            if (zzsiVar2 == null) {
                return false;
            }
        } else {
            zzsiVar2 = null;
        }
        zzsr zzsrVar = this.zzc;
        if (zzsrVar.zza != i || !zzen.zzT(zzsrVar.zzb, zzsiVar2)) {
            this.zzc = this.zza.zzf(i, zzsiVar2, 0L);
        }
        zzpk zzpkVar = this.zzd;
        if (zzpkVar.zza == i && zzen.zzT(zzpkVar.zzb, zzsiVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsiVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzaf(int i, zzsi zzsiVar, zzse zzseVar) {
        if (zzf(i, zzsiVar)) {
            this.zzc.zzc(zzseVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzag(int i, zzsi zzsiVar, zzrz zzrzVar, zzse zzseVar) {
        if (zzf(i, zzsiVar)) {
            this.zzc.zze(zzrzVar, zzseVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzah(int i, zzsi zzsiVar, zzrz zzrzVar, zzse zzseVar) {
        if (zzf(i, zzsiVar)) {
            this.zzc.zzg(zzrzVar, zzseVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzai(int i, zzsi zzsiVar, zzrz zzrzVar, zzse zzseVar, IOException iOException, boolean z) {
        if (zzf(i, zzsiVar)) {
            this.zzc.zzi(zzrzVar, zzseVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzaj(int i, zzsi zzsiVar, zzrz zzrzVar, zzse zzseVar) {
        if (zzf(i, zzsiVar)) {
            this.zzc.zzk(zzrzVar, zzseVar);
        }
    }
}
