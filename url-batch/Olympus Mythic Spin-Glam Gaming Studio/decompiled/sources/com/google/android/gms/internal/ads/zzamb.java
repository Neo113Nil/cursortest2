package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzamb implements zzahk {
    private final SparseArray zza;
    private final SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    /* synthetic */ zzamb(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        SparseArray sparseArray = this.zza;
        int i = this.zze;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            zzahl zzahlVar = new zzahl(0L, this.zzd);
            return new zzahi(zzahlVar, zzahlVar);
        }
        int zzo = zzfm.zzo(jArr, j, true, true);
        zzahl zzahlVar2 = new zzahl(jArr[zzo], jArr2[zzo]);
        return new zzahi(zzahlVar2, zzahlVar2);
    }
}
