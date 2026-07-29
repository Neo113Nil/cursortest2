package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzawp implements Runnable {
    final /* synthetic */ zzaws zza;
    final /* synthetic */ zzawu zzb;

    zzawp(zzawu zzawuVar, zzaws zzawsVar) {
        this.zzb = zzawuVar;
        this.zza = zzawsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zza.zza();
        sparseArray = this.zzb.zzn;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzb.zzn;
            ((zzaxj) sparseArray2.valueAt(i)).zzi();
        }
    }
}
