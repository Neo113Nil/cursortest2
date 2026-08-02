package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzks implements zzus, zzre {
    final /* synthetic */ zzkw zza;
    private final zzku zzb;

    public zzks(zzkw zzkwVar, zzku zzkuVar) {
        this.zza = zzkwVar;
        this.zzb = zzkuVar;
    }

    private final Pair zzf(int i, zzui zzuiVar) {
        zzui zzuiVar2;
        zzui zzuiVar3 = null;
        if (zzuiVar != null) {
            zzku zzkuVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkuVar.zzc.size()) {
                    zzuiVar2 = null;
                    break;
                }
                if (((zzui) zzkuVar.zzc.get(i2)).zzd == zzuiVar.zzd) {
                    zzuiVar2 = zzuiVar.zza(Pair.create(zzkuVar.zzb, zzuiVar.zza));
                    break;
                }
                i2++;
            }
            if (zzuiVar2 == null) {
                return null;
            }
            zzuiVar3 = zzuiVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzuiVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzae(int i, zzui zzuiVar, final zzue zzueVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuiVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // java.lang.Runnable
                public final void run() {
                    zzln zzlnVar;
                    Pair pair = zzf;
                    zzlnVar = zzks.this.zza.zzh;
                    zzlnVar.zzae(((Integer) pair.first).intValue(), (zzui) pair.second, zzueVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzaf(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuiVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // java.lang.Runnable
                public final void run() {
                    zzln zzlnVar;
                    Pair pair = zzf;
                    zzlnVar = zzks.this.zza.zzh;
                    zzlnVar.zzaf(((Integer) pair.first).intValue(), (zzui) pair.second, zztzVar, zzueVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzag(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuiVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // java.lang.Runnable
                public final void run() {
                    zzln zzlnVar;
                    Pair pair = zzf;
                    zzlnVar = zzks.this.zza.zzh;
                    zzlnVar.zzag(((Integer) pair.first).intValue(), (zzui) pair.second, zztzVar, zzueVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzah(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar, final IOException iOException, final boolean z) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuiVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // java.lang.Runnable
                public final void run() {
                    zzln zzlnVar;
                    Pair pair = zzf;
                    zzlnVar = zzks.this.zza.zzh;
                    zzlnVar.zzah(((Integer) pair.first).intValue(), (zzui) pair.second, zztzVar, zzueVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzai(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuiVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkp
                @Override // java.lang.Runnable
                public final void run() {
                    zzln zzlnVar;
                    Pair pair = zzf;
                    zzlnVar = zzks.this.zza.zzh;
                    zzlnVar.zzai(((Integer) pair.first).intValue(), (zzui) pair.second, zztzVar, zzueVar);
                }
            });
        }
    }
}
