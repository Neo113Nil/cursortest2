package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxt implements Runnable {
    final /* synthetic */ zzaxw zza;
    final /* synthetic */ zzaxy zzb;

    zzaxt(zzaxy zzaxyVar, zzaxw zzaxwVar) {
        this.zzb = zzaxyVar;
        this.zza = zzaxwVar;
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
            ((zzayn) sparseArray2.valueAt(i)).zzi();
        }
    }
}
