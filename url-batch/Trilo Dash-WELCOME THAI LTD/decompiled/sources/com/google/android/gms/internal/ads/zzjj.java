package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzjj implements zzsl, zzpe {
    final /* synthetic */ zzjn zza;
    private final zzjl zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzjj(zzjn zzjnVar, zzjl zzjlVar) {
        zzsk zzskVar;
        zzpd zzpdVar;
        this.zza = zzjnVar;
        zzskVar = zzjnVar.zzf;
        this.zzc = zzskVar;
        zzpdVar = zzjnVar.zzg;
        this.zzd = zzpdVar;
        this.zzb = zzjlVar;
    }

    private final boolean zzf(int i, zzsb zzsbVar) {
        zzsk zzskVar;
        zzpd zzpdVar;
        zzsb zzsbVar2 = null;
        if (zzsbVar != null) {
            zzjl zzjlVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjlVar.zzc.size()) {
                    break;
                }
                if (((zzsb) zzjlVar.zzc.get(i2)).zzd == zzsbVar.zzd) {
                    zzsbVar2 = zzsbVar.zzc(Pair.create(zzjlVar.zzb, zzsbVar.zza));
                    break;
                }
                i2++;
            }
            if (zzsbVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsk zzskVar2 = this.zzc;
        if (zzskVar2.zza != i3 || !zzeg.zzS(zzskVar2.zzb, zzsbVar2)) {
            zzskVar = this.zza.zzf;
            this.zzc = zzskVar.zza(i3, zzsbVar2, 0L);
        }
        zzpd zzpdVar2 = this.zzd;
        if (zzpdVar2.zza == i3 && zzeg.zzS(zzpdVar2.zzb, zzsbVar2)) {
            return true;
        }
        zzpdVar = this.zza.zzg;
        this.zzd = zzpdVar.zza(i3, zzsbVar2);
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
