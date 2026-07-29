package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzuf extends zzuh {
    private final zzvv zzd;
    private final zzfrh zze;
    private final zzcx zzf;

    protected zzuf(zzck zzckVar, int[] iArr, int i, zzvv zzvvVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzcx zzcxVar) {
        super(zzckVar, iArr, 0);
        this.zzd = zzvvVar;
        this.zze = zzfrh.zzm(list);
        this.zzf = zzcxVar;
    }

    static /* bridge */ /* synthetic */ zzfrh zzf(zzvg[] zzvgVarArr) {
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
            zzvg zzvgVar = zzvgVarArr[i3];
            if (zzvgVar == null || zzvgVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfre zzi = zzfrh.zzi();
                zzi.zze(new zzud(0L, 0L));
                arrayList.add(zzi);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzvg zzvgVar2 = zzvgVarArr[i4];
            if (zzvgVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzvgVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    if (i5 >= zzvgVar2.zzb.length) {
                        break;
                    }
                    jArr[i4][i5] = zzvgVar2.zza.zzb(r10[i5]).zzi;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfrs zza = zzfsk.zzc(zzfsp.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double d = 0.0d;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length - 1;
                double d2 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    zza.zzs(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i10] + dArr[i11]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfrh zzm = zzfrh.zzm(zza.zzt());
        for (int i12 = 0; i12 < zzm.size(); i12++) {
            int intValue = ((Integer) zzm.get(i12)).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            zzg(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        zzg(arrayList, jArr2);
        zzfre zzi2 = zzfrh.zzi();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzfre zzfreVar = (zzfre) arrayList.get(i15);
            zzi2.zze(zzfreVar == null ? zzfrh.zzo() : zzfreVar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfre zzfreVar = (zzfre) list.get(i2);
            if (zzfreVar != null) {
                zzfreVar.zze(new zzud(j, jArr[i2]));
            }
        }
    }
}
