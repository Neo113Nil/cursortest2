package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzun extends zzup {
    private final zzwh zzd;
    private final zzfvn zze;
    private final zzde zzf;

    protected zzun(zzcp zzcpVar, int[] iArr, int i, zzwh zzwhVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzde zzdeVar) {
        super(zzcpVar, iArr, 0);
        this.zzd = zzwhVar;
        this.zze = zzfvn.zzm(list);
        this.zzf = zzdeVar;
    }

    static /* bridge */ /* synthetic */ zzfvn zzf(zzvs[] zzvsVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzvs zzvsVar = zzvsVarArr[i4];
            if (zzvsVar == null || zzvsVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfvk zzi = zzfvn.zzi();
                zzi.zze(new zzul(0L, 0L));
                arrayList.add(zzi);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzvs zzvsVar2 = zzvsVarArr[i5];
            if (zzvsVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzvsVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    if (i6 >= zzvsVar2.zzb.length) {
                        break;
                    }
                    jArr[i5][i6] = zzvsVar2.zza.zzb(r10[i6]).zzi;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfvy zza = zzfwq.zzc(zzfwv.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i9];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i9] = d;
                    i9++;
                }
                int i10 = length - 1;
                double d2 = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    zza.zzs(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i11] + dArr[i12]) * 0.5d) - dArr[i3]) / d2), Integer.valueOf(i8));
                    i11 = i12;
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfvn zzm = zzfvn.zzm(zza.zzt());
        for (int i13 = 0; i13 < zzm.size(); i13++) {
            int intValue = ((Integer) zzm.get(i13)).intValue();
            int i14 = iArr[intValue] + 1;
            iArr[intValue] = i14;
            jArr2[intValue] = jArr[intValue][i14];
            zzg(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j2 = jArr2[i15];
                jArr2[i15] = j2 + j2;
            }
        }
        zzg(arrayList, jArr2);
        zzfvk zzi2 = zzfvn.zzi();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfvk zzfvkVar = (zzfvk) arrayList.get(i16);
            zzi2.zze(zzfvkVar == null ? zzfvn.zzo() : zzfvkVar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfvk zzfvkVar = (zzfvk) list.get(i2);
            if (zzfvkVar != null) {
                zzfvkVar.zze(new zzul(j, jArr[i2]));
            }
        }
    }
}
