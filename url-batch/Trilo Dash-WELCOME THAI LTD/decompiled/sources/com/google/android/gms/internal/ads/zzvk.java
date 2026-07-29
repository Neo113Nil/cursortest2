package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzvk extends zzvn {
    private zzvj zza;

    protected abstract Pair zzb(zzvj zzvjVar, int[][][] iArr, int[] iArr2, zzsb zzsbVar, zzci zzciVar) throws zzgu;

    @Override // com.google.android.gms.internal.ads.zzvn
    public final zzvo zzj(zzjv[] zzjvVarArr, zztz zztzVar, zzsb zzsbVar, zzci zzciVar) throws zzgu {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzck[][] zzckVarArr = new zzck[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zztzVar.zzc;
            zzckVarArr[i] = new zzck[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjvVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zztzVar.zzc) {
            zzck zzb = zztzVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzjv zzjvVar = zzjvVarArr[i7];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzjvVar.zzO(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i11;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzjv zzjvVar2 = zzjvVarArr[i8];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzjvVar2.zzO(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i8];
            zzckVarArr[i8][i17] = zzb;
            iArr3[i8][i17] = iArr;
            iArr2[i8] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zztz[] zztzVarArr = new zztz[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zztzVarArr[i18] = new zztz((zzck[]) zzeg.zzad(zzckVarArr[i18], i19));
            iArr3[i18] = (int[][]) zzeg.zzad(iArr3[i18], i19);
            strArr[i18] = zzjvVarArr[i18].zzK();
            iArr6[i18] = zzjvVarArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        zzvj zzvjVar = new zzvj(strArr, iArr6, zztzVarArr, iArr4, iArr3, new zztz((zzck[]) zzeg.zzad(zzckVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzvjVar, iArr3, iArr4, zzsbVar, zzciVar);
        zzvl[] zzvlVarArr = (zzvl[]) zzb2.second;
        List[] listArr = new List[zzvlVarArr.length];
        for (int i20 = 0; i20 < zzvlVarArr.length; i20++) {
            zzvl zzvlVar = zzvlVarArr[i20];
            listArr[i20] = zzvlVar != null ? zzfrh.zzp(zzvlVar) : zzfrh.zzo();
        }
        zzfre zzfreVar = new zzfre();
        for (int i21 = 0; i21 < 2; i21++) {
            zztz zzd = zzvjVar.zzd(i21);
            List list = listArr[i21];
            for (int i22 = 0; i22 < zzd.zzc; i22++) {
                zzck zzb3 = zzd.zzb(i22);
                boolean z4 = zzvjVar.zza(i21, i22, false) != 0;
                int i23 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i24 = 0;
                while (true) {
                    int i25 = zzb3.zzb;
                    if (i24 <= 0) {
                        iArr7[i24] = zzvjVar.zzb(i21, i22, i24) & 7;
                        int i26 = 0;
                        while (true) {
                            if (i26 >= list.size()) {
                                z = false;
                                break;
                            }
                            zzvl zzvlVar2 = (zzvl) list.get(i26);
                            if (zzvlVar2.zze().equals(zzb3) && zzvlVar2.zzb(i24) != -1) {
                                z = true;
                                break;
                            }
                            i26++;
                        }
                        zArr[i24] = z;
                        i24++;
                    }
                }
                zzfreVar.zze(new zzcs(zzb3, z4, iArr7, zArr));
            }
        }
        zztz zze = zzvjVar.zze();
        for (int i27 = 0; i27 < zze.zzc; i27++) {
            zzck zzb4 = zze.zzb(i27);
            int i28 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i29 = zzb4.zzb;
            zzfreVar.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvo((zzjw[]) zzb2.first, (zzvh[]) zzb2.second, new zzct(zzfreVar.zzg()), zzvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzk(Object obj) {
        this.zza = (zzvj) obj;
    }
}
