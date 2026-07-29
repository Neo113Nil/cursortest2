package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzuw extends zzco {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;

    @Deprecated
    public zzuw() {
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    private final void zzu() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final /* synthetic */ zzco zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzuw zzo(int i, boolean z) {
        if (this.zzg.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzg.put(i, true);
        } else {
            this.zzg.delete(i);
        }
        return this;
    }

    public zzuw(Context context) {
        super.zzd(context);
        Point zzA = zzeg.zzA(context);
        zze(zzA.x, zzA.y, true);
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    /* synthetic */ zzuw(zzuu zzuuVar, zzuv zzuvVar) {
        super(zzuuVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzuuVar.zzG;
        this.zzb = zzuuVar.zzI;
        this.zzc = zzuuVar.zzK;
        this.zzd = zzuuVar.zzP;
        this.zze = zzuuVar.zzR;
        sparseArray = zzuuVar.zzS;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzf = sparseArray2;
        sparseBooleanArray = zzuuVar.zzT;
        this.zzg = sparseBooleanArray.clone();
    }
}
