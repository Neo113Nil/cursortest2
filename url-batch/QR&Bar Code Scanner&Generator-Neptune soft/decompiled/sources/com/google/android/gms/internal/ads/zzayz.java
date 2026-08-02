package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzayz extends zzazd {
    private final AtomicReference zza;

    public zzayz() {
        this(null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final zzayx[] zzb(zzatc[] zzatcVarArr, zzayt[] zzaytVarArr, int[][][] iArr) throws zzasi {
        zzaza zzazaVar;
        boolean z;
        zzays zzaysVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int i;
        int i2 = 2;
        zzayx[] zzayxVarArr = new zzayx[2];
        zzayy zzayyVar = (zzayy) this.zza.get();
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            int i4 = -1;
            int i5 = 1;
            if (i3 >= i2) {
                break;
            }
            if (zzatcVarArr[i3].zzc() == i2) {
                if (!z4) {
                    zzatc zzatcVar = zzatcVarArr[i3];
                    zzayt zzaytVar = zzaytVarArr[i3];
                    int[][] iArr3 = iArr[i3];
                    int i6 = zzayyVar.zzd;
                    int i7 = zzayyVar.zze;
                    int i8 = zzayyVar.zzf;
                    boolean z5 = zzayyVar.zzc;
                    boolean z6 = zzayyVar.zzb;
                    int i9 = zzayyVar.zzi;
                    int i10 = zzayyVar.zzj;
                    boolean z7 = zzayyVar.zzk;
                    boolean z8 = zzayyVar.zzg;
                    boolean z9 = zzayyVar.zzh;
                    int i11 = -1;
                    int i12 = 0;
                    zzays zzaysVar2 = null;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < zzaytVar.zzb) {
                        zzays zzb = zzaytVar.zzb(i12);
                        int i15 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        int i16 = 0;
                        while (true) {
                            int i17 = zzb.zza;
                            if (i16 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i16));
                            i16++;
                        }
                        int[] iArr4 = iArr3[i12];
                        int i18 = 0;
                        while (true) {
                            int i19 = zzb.zza;
                            if (i18 <= 0) {
                                zzayt zzaytVar2 = zzaytVar;
                                if (zza(iArr4[i18], true)) {
                                    zzasw zzb2 = zzb.zzb(i18);
                                    if (arrayList2.contains(Integer.valueOf(i18))) {
                                        int i20 = zzb2.zzj;
                                        int i21 = zzb2.zzk;
                                        int i22 = zzb2.zzb;
                                        zzaysVar = zzb;
                                        z2 = true;
                                        z3 = true;
                                    } else {
                                        zzaysVar = zzb;
                                        z2 = true;
                                        z3 = false;
                                    }
                                    if (z2 != z3) {
                                        arrayList = arrayList2;
                                        i = 1;
                                    } else {
                                        arrayList = arrayList2;
                                        i = 2;
                                    }
                                    iArr2 = iArr4;
                                    boolean zza = zza(iArr4[i18], false);
                                    if (zza) {
                                        i += 1000;
                                    }
                                    boolean z10 = i > i14;
                                    if (i == i14) {
                                        int zzh = zzb2.zza() != i11 ? zzh(zzb2.zza(), i11) : zzh(zzb2.zzb, i4);
                                        z10 = !(zza && z3) ? zzh >= 0 : zzh <= 0;
                                    }
                                    if (z10) {
                                        i4 = zzb2.zzb;
                                        i11 = zzb2.zza();
                                        i14 = i;
                                        i13 = i18;
                                        zzaysVar2 = zzaysVar;
                                    }
                                } else {
                                    zzaysVar = zzb;
                                    iArr2 = iArr4;
                                    arrayList = arrayList2;
                                }
                                i18++;
                                zzaytVar = zzaytVar2;
                                zzb = zzaysVar;
                                arrayList2 = arrayList;
                                iArr4 = iArr2;
                            }
                        }
                        i12++;
                        i5 = 1;
                    }
                    zzaza zzazaVar2 = zzaysVar2 == null ? null : new zzaza(zzaysVar2, i13, 0, null);
                    zzayxVarArr[i3] = zzazaVar2;
                    z4 = zzazaVar2 != null;
                }
                int i23 = zzaytVarArr[i3].zzb;
            }
            i3++;
            i2 = 2;
        }
        int i24 = 0;
        boolean z11 = false;
        while (i24 < i2) {
            if (zzatcVarArr[i24].zzc() == 1 && !z11) {
                zzayt zzaytVar3 = zzaytVarArr[i24];
                int[][] iArr5 = iArr[i24];
                String str = zzayyVar.zza;
                boolean z12 = zzayyVar.zzh;
                boolean z13 = zzayyVar.zzb;
                int i25 = -1;
                int i26 = -1;
                int i27 = 0;
                int i28 = 0;
                while (i27 < zzaytVar3.zzb) {
                    zzays zzb3 = zzaytVar3.zzb(i27);
                    int[] iArr6 = iArr5[i27];
                    int i29 = i26;
                    int i30 = i25;
                    int i31 = i28;
                    int i32 = 0;
                    while (true) {
                        int i33 = zzb3.zza;
                        if (i32 <= 0) {
                            if (zza(iArr6[i32], true)) {
                                zzasw zzb4 = zzb3.zzb(i32);
                                int i34 = iArr6[i32];
                                int i35 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                                if (zza(i34, false)) {
                                    i35 += 1000;
                                }
                                if (i35 > i31) {
                                    i30 = i27;
                                    i29 = i32;
                                    i31 = i35;
                                }
                            }
                            i32++;
                        }
                    }
                    i27++;
                    i28 = i31;
                    i25 = i30;
                    i26 = i29;
                }
                if (i25 == -1) {
                    zzazaVar = null;
                    z = false;
                } else {
                    z = false;
                    zzazaVar = new zzaza(zzaytVar3.zzb(i25), i26, 0, null);
                }
                zzayxVarArr[i24] = zzazaVar;
                z11 = zzazaVar != null ? true : z;
            }
            i24++;
            i2 = 2;
        }
        return zzayxVarArr;
    }

    public zzayz(zzaze zzazeVar) {
        this.zza = new AtomicReference(new zzayy());
    }
}
