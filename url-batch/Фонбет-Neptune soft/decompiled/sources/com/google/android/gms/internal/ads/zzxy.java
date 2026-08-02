package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzxy extends zzyb {
    protected abstract Pair zzd(zzxx zzxxVar, int[][][] iArr, int[] iArr2, zzui zzuiVar, zzcc zzccVar) throws zzhw;

    @Override // com.google.android.gms.internal.ads.zzyb
    public final zzyc zzo(zzlh[] zzlhVarArr, zzwi zzwiVar, zzui zzuiVar, zzcc zzccVar) throws zzhw {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcd[][] zzcdVarArr = new zzcd[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzwiVar.zzb;
            zzcdVarArr[i] = new zzcd[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlhVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzwiVar.zzb) {
            zzcd zzb = zzwiVar.zzb(i5);
            int i6 = zzb.zzc;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzlh zzlhVar = zzlhVarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 < zzb.zza; i11++) {
                    i10 = Math.max(i10, zzlhVar.zzY(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[zzb.zza];
            } else {
                zzlh zzlhVar2 = zzlhVarArr[i8];
                int[] iArr5 = new int[zzb.zza];
                for (int i12 = 0; i12 < zzb.zza; i12++) {
                    iArr5[i12] = zzlhVar2.zzY(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzcdVarArr[i8][i13] = zzb;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzwi[] zzwiVarArr = new zzwi[2];
        String[] strArr = new String[2];
        int[] iArr6 = new int[2];
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int i16 = iArr2[i14];
            zzwiVarArr[i14] = new zzwi((zzcd[]) zzet.zzP(zzcdVarArr[i14], i16));
            iArr3[i14] = (int[][]) zzet.zzP(iArr3[i14], i16);
            strArr[i14] = zzlhVarArr[i14].zzU();
            iArr6[i14] = zzlhVarArr[i14].zzb();
            i14++;
        }
        zzxx zzxxVar = new zzxx(strArr, iArr6, zzwiVarArr, iArr4, iArr3, new zzwi((zzcd[]) zzet.zzP(zzcdVarArr[2], iArr2[2])));
        Pair zzd = zzd(zzxxVar, iArr3, iArr4, zzuiVar, zzccVar);
        zzxz[] zzxzVarArr = (zzxz[]) zzd.second;
        List[] listArr = new List[zzxzVarArr.length];
        for (int i17 = 0; i17 < zzxzVarArr.length; i17++) {
            zzxz zzxzVar = zzxzVarArr[i17];
            listArr[i17] = zzxzVar != null ? zzfxr.zzn(zzxzVar) : zzfxr.zzm();
        }
        zzfxo zzfxoVar = new zzfxo();
        for (int i18 = 0; i18 < 2; i18++) {
            zzwi zzd2 = zzxxVar.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd2.zzb; i19++) {
                zzcd zzb2 = zzd2.zzb(i19);
                boolean z4 = zzxxVar.zza(i18, i19, false) != 0;
                int i20 = zzb2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzb2.zza; i21++) {
                    iArr7[i21] = zzxxVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzxz zzxzVar2 = (zzxz) list.get(i22);
                        if (zzxzVar2.zze().equals(zzb2) && zzxzVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfxoVar.zzf(new zzcj(zzb2, z4, iArr7, zArr));
            }
        }
        zzwi zze = zzxxVar.zze();
        for (int i23 = 0; i23 < zze.zzb; i23++) {
            zzcd zzb3 = zze.zzb(i23);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfxoVar.zzf(new zzcj(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzyc((zzli[]) zzd.first, (zzxv[]) zzd.second, new zzck(zzfxoVar.zzi()), zzxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzp(Object obj) {
    }
}
