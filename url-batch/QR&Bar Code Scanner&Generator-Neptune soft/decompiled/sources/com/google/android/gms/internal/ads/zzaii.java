package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaii implements zzaib {
    final /* synthetic */ zzaik zza;
    private final zzee zzb = new zzee(new byte[4], 4);

    public zzaii(zzaik zzaikVar) {
        this.zza = zzaikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zza(zzef zzefVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzefVar.zzk() == 0 && (zzefVar.zzk() & 128) != 0) {
            zzefVar.zzG(6);
            int zza = zzefVar.zza() / 4;
            for (int i2 = 0; i2 < zza; i2++) {
                zzefVar.zzA(this.zzb, 4);
                int zzc = this.zzb.zzc(16);
                this.zzb.zzj(3);
                if (zzc == 0) {
                    this.zzb.zzj(13);
                } else {
                    int zzc2 = this.zzb.zzc(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzc2) == null) {
                        zzaik zzaikVar = this.zza;
                        sparseArray3 = zzaikVar.zzf;
                        sparseArray3.put(zzc2, new zzaic(new zzaij(zzaikVar, zzc2)));
                        zzaik zzaikVar2 = this.zza;
                        i = zzaikVar2.zzl;
                        zzaikVar2.zzl = i + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(zzel zzelVar, zzzl zzzlVar, zzaio zzaioVar) {
    }
}
