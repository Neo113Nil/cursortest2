package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaoa implements zzagk {
    private final zzagk zzb;
    private final zzanx zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzaoa(zzagk zzagkVar, zzanx zzanxVar) {
        this.zzb = zzagkVar;
        this.zzc = zzanxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.zze = true;
        }
        if (i2 != 3) {
            return this.zzb.zzs(i, i2);
        }
        SparseArray sparseArray = this.zzd;
        zzaoc zzaocVar = (zzaoc) sparseArray.get(i);
        if (zzaocVar != null) {
            return zzaocVar;
        }
        zzaoc zzaocVar2 = new zzaoc(this.zzb.zzs(i, 3), this.zzc);
        sparseArray.put(i, zzaocVar2);
        return zzaocVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzaoc) sparseArray.valueAt(i)).zzf(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(zzahk zzahkVar) {
        this.zzb.zzw(zzahkVar);
    }
}
