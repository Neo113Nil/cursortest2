package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzwp extends zzwr {
    protected zzwp(zzcd zzcdVar, int[] iArr, int i, zzyj zzyjVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdj zzdjVar) {
        super(zzcdVar, iArr, 0);
        zzfxr.zzk(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ zzfxr zzf(zzxu[] zzxuVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzxu zzxuVar = zzxuVarArr[i3];
            if (zzxuVar == null || zzxuVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfxo zzfxoVar = new zzfxo();
                zzfxoVar.zzf(new zzwn(0L, 0L));
                arrayList.add(zzfxoVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzxu zzxuVar2 = zzxuVarArr[i4];
            if (zzxuVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzxuVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzxuVar2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = zzxuVar2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfyc zza = zzfyx.zzc(zzfzc.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length - 1;
                double d2 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d3 = dArr[i10];
                    i10++;
                    zza.zzq(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfxr zzk = zzfxr.zzk(zza.zzr());
        for (int i11 = 0; i11 < zzk.size(); i11++) {
            int intValue = ((Integer) zzk.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            zzg(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j3 = jArr3[i13];
                jArr3[i13] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzfxo zzfxoVar2 = new zzfxo();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfxo zzfxoVar3 = (zzfxo) arrayList.get(i14);
            zzfxoVar2.zzf(zzfxoVar3 == null ? zzfxr.zzm() : zzfxoVar3.zzi());
        }
        return zzfxoVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxo zzfxoVar = (zzfxo) list.get(i2);
            if (zzfxoVar != null) {
                zzfxoVar.zzf(new zzwn(j, jArr[i2]));
            }
        }
    }
}
