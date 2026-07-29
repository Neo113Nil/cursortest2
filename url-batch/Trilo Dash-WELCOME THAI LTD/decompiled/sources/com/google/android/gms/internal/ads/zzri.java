package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzri implements zzsl, zzpe {
    final /* synthetic */ zzrk zza;
    private final Object zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzri(zzrk zzrkVar, Object obj) {
        this.zza = zzrkVar;
        this.zzc = zzrkVar.zze(null);
        this.zzd = zzrkVar.zzc(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzsb zzsbVar) {
        zzsb zzsbVar2;
        if (zzsbVar != null) {
            zzsbVar2 = this.zza.zzv(this.zzb, zzsbVar);
            if (zzsbVar2 == null) {
                return false;
            }
        } else {
            zzsbVar2 = null;
        }
        zzsk zzskVar = this.zzc;
        if (zzskVar.zza != i || !zzeg.zzS(zzskVar.zzb, zzsbVar2)) {
            this.zzc = this.zza.zzf(i, zzsbVar2, 0L);
        }
        zzpd zzpdVar = this.zzd;
        if (zzpdVar.zza == i && zzeg.zzS(zzpdVar.zzb, zzsbVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsbVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaf(int i, zzsb zzsbVar, zzrx zzrxVar) {
        if (zzf(i, zzsbVar)) {
            this.zzc.zzc(zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzag(int i, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i, zzsbVar)) {
            this.zzc.zze(zzrsVar, zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzah(int i, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i, zzsbVar)) {
            this.zzc.zzg(zzrsVar, zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzai(int i, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar, IOException iOException, boolean z) {
        if (zzf(i, zzsbVar)) {
            this.zzc.zzi(zzrsVar, zzrxVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaj(int i, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i, zzsbVar)) {
            this.zzc.zzk(zzrsVar, zzrxVar);
        }
    }
}
