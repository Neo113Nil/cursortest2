package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxv extends zzaxz {
    private final AtomicReference zza;

    public zzaxv() {
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

    @Override // com.google.android.gms.internal.ads.zzaxz
    protected final zzaxt[] zzb(zzary[] zzaryVarArr, zzaxp[] zzaxpVarArr, int[][][] iArr) throws zzare {
        zzaxo zzaxoVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i;
        int i2 = 2;
        zzaxt[] zzaxtVarArr = new zzaxt[2];
        zzaxu zzaxuVar = (zzaxu) this.zza.get();
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            int i4 = -1;
            int i5 = 1;
            if (i3 >= i2) {
                break;
            }
            if (zzaryVarArr[i3].zzc() == i2) {
                if (!z3) {
                    zzary zzaryVar = zzaryVarArr[i3];
                    zzaxp zzaxpVar = zzaxpVarArr[i3];
                    int[][] iArr3 = iArr[i3];
                    int i6 = zzaxuVar.zzd;
                    int i7 = zzaxuVar.zze;
                    int i8 = zzaxuVar.zzf;
                    boolean z4 = zzaxuVar.zzc;
                    boolean z5 = zzaxuVar.zzb;
                    int i9 = zzaxuVar.zzi;
                    int i10 = zzaxuVar.zzj;
                    boolean z6 = zzaxuVar.zzk;
                    boolean z7 = zzaxuVar.zzg;
                    boolean z8 = zzaxuVar.zzh;
                    int i11 = -1;
                    int i12 = 0;
                    zzaxo zzaxoVar2 = null;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < zzaxpVar.zzb) {
                        zzaxo zzb = zzaxpVar.zzb(i12);
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
                                zzaxp zzaxpVar2 = zzaxpVar;
                                if (zza(iArr4[i18], true)) {
                                    zzars zzb2 = zzb.zzb(i18);
                                    if (arrayList2.contains(Integer.valueOf(i18))) {
                                        int i20 = zzb2.zzj;
                                        int i21 = zzb2.zzk;
                                        int i22 = zzb2.zzb;
                                        zzaxoVar = zzb;
                                        z = true;
                                        z2 = true;
                                    } else {
                                        zzaxoVar = zzb;
                                        z = true;
                                        z2 = false;
                                    }
                                    if (z != z2) {
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
                                    boolean z9 = i > i14;
                                    if (i == i14) {
                                        int zzh = zzb2.zza() != i11 ? zzh(zzb2.zza(), i11) : zzh(zzb2.zzb, i4);
                                        z9 = !(zza && z2) ? zzh >= 0 : zzh <= 0;
                                    }
                                    if (z9) {
                                        i4 = zzb2.zzb;
                                        i11 = zzb2.zza();
                                        i14 = i;
                                        i13 = i18;
                                        zzaxoVar2 = zzaxoVar;
                                    }
                                } else {
                                    zzaxoVar = zzb;
                                    iArr2 = iArr4;
                                    arrayList = arrayList2;
                                }
                                i18++;
                                zzaxpVar = zzaxpVar2;
                                zzb = zzaxoVar;
                                arrayList2 = arrayList;
                                iArr4 = iArr2;
                            }
                        }
                        i12++;
                        i5 = 1;
                    }
                    zzaxw zzaxwVar = zzaxoVar2 == null ? null : new zzaxw(zzaxoVar2, i13, 0, null);
                    zzaxtVarArr[i3] = zzaxwVar;
                    z3 = zzaxwVar != null;
                }
                int i23 = zzaxpVarArr[i3].zzb;
            }
            i3++;
            i2 = 2;
        }
        int i24 = 0;
        boolean z10 = false;
        while (i24 < i2) {
            if (zzaryVarArr[i24].zzc() == 1 && !z10) {
                zzaxp zzaxpVar3 = zzaxpVarArr[i24];
                int[][] iArr5 = iArr[i24];
                String str = zzaxuVar.zza;
                boolean z11 = zzaxuVar.zzh;
                boolean z12 = zzaxuVar.zzb;
                int i25 = 0;
                int i26 = 0;
                int i27 = -1;
                int i28 = -1;
                while (i25 < zzaxpVar3.zzb) {
                    zzaxo zzb3 = zzaxpVar3.zzb(i25);
                    int[] iArr6 = iArr5[i25];
                    int i29 = i28;
                    int i30 = i27;
                    int i31 = i26;
                    int i32 = 0;
                    while (true) {
                        int i33 = zzb3.zza;
                        if (i32 <= 0) {
                            if (zza(iArr6[i32], true)) {
                                zzars zzb4 = zzb3.zzb(i32);
                                int i34 = iArr6[i32];
                                int i35 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                                if (zza(i34, false)) {
                                    i35 += 1000;
                                }
                                if (i35 > i31) {
                                    i30 = i25;
                                    i29 = i32;
                                    i31 = i35;
                                }
                            }
                            i32++;
                        }
                    }
                    i25++;
                    i26 = i31;
                    i27 = i30;
                    i28 = i29;
                }
                zzaxw zzaxwVar2 = i27 == -1 ? null : new zzaxw(zzaxpVar3.zzb(i27), i28, 0, null);
                zzaxtVarArr[i24] = zzaxwVar2;
                z10 = zzaxwVar2 != null;
            }
            i24++;
            i2 = 2;
        }
        return zzaxtVarArr;
    }

    public zzaxv(zzaya zzayaVar) {
        this.zza = new AtomicReference(new zzaxu());
    }
}
