package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjp implements zzss, zzpl {
    final /* synthetic */ zzjt zza;
    private final zzjr zzb;
    private zzsr zzc;
    private zzpk zzd;

    public zzjp(zzjt zzjtVar, zzjr zzjrVar) {
        zzsr zzsrVar;
        zzpk zzpkVar;
        this.zza = zzjtVar;
        zzsrVar = zzjtVar.zzf;
        this.zzc = zzsrVar;
        zzpkVar = zzjtVar.zzg;
        this.zzd = zzpkVar;
        this.zzb = zzjrVar;
    }

    private final boolean zzf(int i, zzsi zzsiVar) {
        zzsr zzsrVar;
        zzpk zzpkVar;
        zzsi zzsiVar2 = null;
        if (zzsiVar != null) {
            zzjr zzjrVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjrVar.zzc.size()) {
                    break;
                }
                if (((zzsi) zzjrVar.zzc.get(i2)).zzd == zzsiVar.zzd) {
                    zzsiVar2 = zzsiVar.zzc(Pair.create(zzjrVar.zzb, zzsiVar.zza));
                    break;
                }
                i2++;
            }
            if (zzsiVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsr zzsrVar2 = this.zzc;
        if (zzsrVar2.zza != i3 || !zzen.zzT(zzsrVar2.zzb, zzsiVar2)) {
            zzsrVar = this.zza.zzf;
            this.zzc = zzsrVar.zza(i3, zzsiVar2, 0L);
        }
        zzpk zzpkVar2 = this.zzd;
        if (zzpkVar2.zza == i3 && zzen.zzT(zzpkVar2.zzb, zzsiVar2)) {
            return true;
        }
        zzpkVar = this.zza.zzg;
        this.zzd = zzpkVar.zza(i3, zzsiVar2);
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
