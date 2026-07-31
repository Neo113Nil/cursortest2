package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzzy extends zzaaa {
    protected zzzy(zzbg zzbgVar, int[] iArr, int i, zzabu zzabuVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdp zzdpVar) {
        super(zzbgVar, iArr, 0);
        zzgxm.zzq(list);
    }

    static /* synthetic */ zzgxm zzd(zzabd[] zzabdVarArr) {
        int i;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            zzabd zzabdVar = zzabdVarArr[i3];
            if (zzabdVar == null || zzabdVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i4 = zzgxm.zzd;
                zzgxj zzgxjVar = new zzgxj();
                zzgxjVar.zzf(new zzzw(0L, 0L));
                arrayList.add(zzgxjVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzabd zzabdVar2 = zzabdVarArr[i5];
            if (zzabdVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr2 = zzabdVar2.zzb;
                jArr[i5] = new long[iArr2.length];
                for (int i6 = 0; i6 < iArr2.length; i6++) {
                    long j = zzabdVar2.zza.zza(iArr2[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr3 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzgyh zza = zzgzb.zzc(zzgzg.zzb()).zzb(2).zza();
        int i8 = 0;
        for (i = 2; i8 < i; i = 2) {
            int length = jArr[i8].length;
            if (length <= 1) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length];
                int i9 = i2;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i9] = d;
                    i9++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i10 = length - 1;
                double d2 = dArr[i10] - dArr[i2];
                int i11 = i2;
                while (i11 < i10) {
                    double d3 = dArr[i11];
                    i11++;
                    zza.zze(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i11]) * 0.5d) - dArr[i2]) / d2), Integer.valueOf(i8));
                    i2 = 0;
                }
            }
            i8++;
            iArr3 = iArr;
            i2 = 0;
        }
        int[] iArr5 = iArr3;
        zzgxm zzq = zzgxm.zzq(zza.zzt());
        for (int i12 = 0; i12 < zzq.size(); i12++) {
            int intValue = ((Integer) zzq.get(i12)).intValue();
            int i13 = iArr5[intValue] + 1;
            iArr5[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzgxj zzgxjVar2 = new zzgxj();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzgxj zzgxjVar3 = (zzgxj) arrayList.get(i15);
            zzgxjVar2.zzf(zzgxjVar3 == null ? zzgxm.zzi() : zzgxjVar3.zzi());
        }
        return zzgxjVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgxj zzgxjVar = (zzgxj) list.get(i2);
            if (zzgxjVar != null) {
                zzgxjVar.zzf(new zzzw(j, jArr[i2]));
            }
        }
    }
}
