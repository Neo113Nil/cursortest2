package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzazd extends zzazh {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzazb zzc;

    protected abstract zzayx[] zzb(zzatc[] zzatcVarArr, zzayt[] zzaytVarArr, int[][][] iArr) throws zzasi;

    @Override // com.google.android.gms.internal.ads.zzazh
    public final zzazi zzc(zzatc[] zzatcVarArr, zzayt zzaytVar) throws zzasi {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzays[][] zzaysVarArr = new zzays[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaytVar.zzb;
            zzaysVarArr[i] = new zzays[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzatcVarArr[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaytVar.zzb) {
            zzays zzb = zzaytVar.zzb(i5);
            int i6 = i3;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= i3) {
                    i7 = i6;
                    break;
                }
                zzatc zzatcVar = zzatcVarArr[i7];
                int i9 = 0;
                while (true) {
                    int i10 = zzb.zza;
                    if (i9 <= 0) {
                        int zzG = zzatcVar.zzG(zzb.zzb(i9)) & 3;
                        if (zzG > i8) {
                            if (zzG == 3) {
                                break;
                            }
                            i6 = i7;
                            i8 = zzG;
                        }
                        i9++;
                    }
                }
                i7++;
                i3 = 2;
            }
            if (i7 == 2) {
                int i11 = zzb.zza;
                iArr = new int[1];
            } else {
                zzatc zzatcVar2 = zzatcVarArr[i7];
                int i12 = zzb.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zzb.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzatcVar2.zzG(zzb.zzb(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzaysVarArr[i7][i15] = zzb;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i5++;
            i3 = 2;
        }
        int i16 = i3;
        zzayt[] zzaytVarArr = new zzayt[i16];
        int[] iArr6 = new int[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            zzaytVarArr[i17] = new zzayt((zzays[]) Arrays.copyOf(zzaysVarArr[i17], i18));
            iArr3[i17] = (int[][]) Arrays.copyOf(iArr3[i17], i18);
            iArr6[i17] = zzatcVarArr[i17].zzc();
            i17++;
            i16 = 2;
        }
        int i19 = i16;
        zzayt zzaytVar2 = new zzayt((zzays[]) Arrays.copyOf(zzaysVarArr[i19], iArr2[i19]));
        zzayx[] zzb2 = zzb(zzatcVarArr, zzaytVarArr, iArr3);
        int i20 = 0;
        while (i20 < i19) {
            if (this.zzb.get(i20)) {
                zzb2[i20] = null;
            } else {
                zzayt zzaytVar3 = zzaytVarArr[i20];
                Map map = (Map) this.zza.get(i20);
                if ((map == null ? null : (zzazc) map.get(zzaytVar3)) != null) {
                    throw null;
                }
            }
            i20++;
            i19 = 2;
        }
        zzazb zzazbVar = new zzazb(iArr6, zzaytVarArr, iArr4, iArr3, zzaytVar2);
        zzatd[] zzatdVarArr = new zzatd[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzatdVarArr[i21] = zzb2[i21] != null ? zzatd.zza : null;
        }
        return new zzazi(zzaytVar, new zzazf(zzb2, null), zzazbVar, zzatdVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzd(Object obj) {
        this.zzc = (zzazb) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) == z) {
            return;
        }
        this.zzb.put(i, z);
        zzg();
    }
}
