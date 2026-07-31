package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzahb {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final zzgo zzo;

    private zzahb(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, @Nullable String str, @Nullable zzgo zzgoVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = f;
        this.zzm = i13;
        this.zzn = str;
        this.zzo = zzgoVar;
    }

    public static zzahb zza(zzeu zzeuVar) throws zzat {
        return zzc(zzeuVar, false, null);
    }

    public static zzahb zzb(zzeu zzeuVar, zzgo zzgoVar) throws zzat {
        return zzc(zzeuVar, true, zzgoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzahb zzc(zzeu zzeuVar, boolean z, @Nullable zzgo zzgoVar) throws zzat {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        zzgk zzgkVar;
        int max;
        boolean z3;
        int max2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 4;
        if (z) {
            try {
                zzeuVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z2 = true;
                throw zzat.zzb("Error parsing".concat(z2 == z ? "HEVC config" : "L-HEVC config"), e);
            }
        } else {
            try {
                zzeuVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = true;
                throw zzat.zzb("Error parsing".concat(z2 == z ? "HEVC config" : "L-HEVC config"), e);
            }
        }
        int zzs = zzeuVar.zzs() & 3;
        int zzs2 = zzeuVar.zzs();
        int zzg = zzeuVar.zzg();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < zzs2; i13++) {
            zzeuVar.zzk(1);
            int zzt = zzeuVar.zzt();
            for (int i14 = 0; i14 < zzt; i14++) {
                int zzt2 = zzeuVar.zzt();
                i12 += zzt2 + 4;
                zzeuVar.zzk(zzt2);
            }
        }
        zzeuVar.zzh(zzg);
        byte[] bArr = new byte[i12];
        zzgo zzgoVar2 = zzgoVar;
        int i15 = 0;
        float f = 1.0f;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        String str = null;
        int i28 = 0;
        while (i28 < zzs2) {
            int zzs3 = zzeuVar.zzs() & 63;
            int zzt3 = zzeuVar.zzt();
            int i29 = i11;
            zzgo zzgoVar3 = zzgoVar2;
            while (i29 < zzt3) {
                int zzt4 = zzeuVar.zzt();
                int i30 = zzs2;
                System.arraycopy(zzgr.zza, i11, bArr, i15, i10);
                int i31 = i15 + 4;
                System.arraycopy(zzeuVar.zzi(), zzeuVar.zzg(), bArr, i31, zzt4);
                int i32 = 32;
                if (zzs3 != 32) {
                    i32 = zzs3;
                } else if (i29 == 0) {
                    zzgoVar3 = zzgr.zzf(bArr, i31, i31 + zzt4);
                    i = zzt3;
                    i2 = zzs3;
                    i5 = 0;
                    i29 = 0;
                    i15 = i31 + zzt4;
                    zzeuVar.zzk(zzt4);
                    i29++;
                    i11 = i5;
                    zzs2 = i30;
                    zzt3 = i;
                    zzs3 = i2;
                    i10 = 4;
                }
                i = zzt3;
                if (i32 != 33) {
                    i2 = zzs3;
                    if (i32 == 39 && i29 == 0) {
                        int i33 = i15 + 6;
                        int i34 = (i31 + zzt4) - 1;
                        while (true) {
                            byte b = bArr[i34];
                            if (b == 0) {
                                if (i34 <= i33) {
                                    break;
                                }
                                i34--;
                            } else if (b != 0 && i34 > i33) {
                                zzgz zzgzVar = new zzgz(bArr, i33, i34 + 1);
                                while (zzgzVar.zzd(16)) {
                                    int zzf = zzgzVar.zzf(8);
                                    int i35 = 0;
                                    while (zzf == 255) {
                                        i35 += 255;
                                        zzf = zzgzVar.zzf(8);
                                    }
                                    int i36 = i35 + zzf;
                                    int zzf2 = zzgzVar.zzf(8);
                                    int i37 = 0;
                                    while (zzf2 == 255) {
                                        i37 += 255;
                                        zzf2 = zzgzVar.zzf(8);
                                    }
                                    int i38 = i37 + zzf2;
                                    if (i38 == 0 || !zzgzVar.zzd(i38)) {
                                        break;
                                    }
                                    if (i36 == 176) {
                                        int zzg2 = zzgzVar.zzg();
                                        boolean zze = zzgzVar.zze();
                                        int zzg3 = zze ? zzgzVar.zzg() : 0;
                                        int zzg4 = zzgzVar.zzg();
                                        int i39 = 0;
                                        int i40 = -1;
                                        int i41 = -1;
                                        int i42 = -1;
                                        int i43 = -1;
                                        int i44 = -1;
                                        int i45 = -1;
                                        while (i39 <= zzg4) {
                                            i40 = zzgzVar.zzg();
                                            i41 = zzgzVar.zzg();
                                            i3 = i29;
                                            int zzf3 = zzgzVar.zzf(6);
                                            if (zzf3 != 63) {
                                                if (zzf3 == 0) {
                                                    i4 = i16;
                                                    max = Math.max(0, zzg2 - 30);
                                                } else {
                                                    i4 = i16;
                                                    max = Math.max(0, (zzf3 + zzg2) - 31);
                                                }
                                                i43 = zzgzVar.zzf(max);
                                                if (zze) {
                                                    int zzf4 = zzgzVar.zzf(6);
                                                    if (zzf4 != 63) {
                                                        if (zzf4 == 0) {
                                                            z3 = zze;
                                                            max2 = Math.max(0, zzg3 - 30);
                                                        } else {
                                                            z3 = zze;
                                                            max2 = Math.max(0, (zzf4 + zzg3) - 31);
                                                        }
                                                        i45 = zzgzVar.zzf(max2);
                                                        i44 = zzf4;
                                                    }
                                                } else {
                                                    z3 = zze;
                                                }
                                                if (zzgzVar.zze()) {
                                                    zzgzVar.zzb(10);
                                                }
                                                i39++;
                                                i42 = zzf3;
                                                i29 = i3;
                                                zze = z3;
                                                i16 = i4;
                                            }
                                        }
                                        i3 = i29;
                                        i4 = i16;
                                        zzgkVar = new zzgk(zzg2, zzg3, zzg4 + 1, i40, i41, i42, i43, i44, i45);
                                    } else {
                                        zzgzVar.zzb(i38 * 8);
                                        i29 = i29;
                                        i16 = i16;
                                    }
                                }
                            }
                        }
                        i3 = i29;
                        i4 = i16;
                        zzgkVar = null;
                        if (zzgkVar != null && zzgoVar3 != null) {
                            i5 = 0;
                            if (zzgkVar.zza == ((zzge) zzgoVar3.zza.get(0)).zzb) {
                                i29 = i3;
                                i16 = i4;
                                i26 = 4;
                                i15 = i31 + zzt4;
                                zzeuVar.zzk(zzt4);
                                i29++;
                                i11 = i5;
                                zzs2 = i30;
                                zzt3 = i;
                                zzs3 = i2;
                                i10 = 4;
                            } else {
                                i26 = 5;
                                i29 = i3;
                                i16 = i4;
                                i15 = i31 + zzt4;
                                zzeuVar.zzk(zzt4);
                                i29++;
                                i11 = i5;
                                zzs2 = i30;
                                zzt3 = i;
                                zzs3 = i2;
                                i10 = 4;
                            }
                        }
                    }
                    i3 = i29;
                    i4 = i16;
                } else if (i29 == 0) {
                    zzgl zzg5 = zzgr.zzg(bArr, i31, i31 + zzt4, zzgoVar3);
                    int i46 = zzg5.zza + 1;
                    int i47 = zzg5.zze;
                    int i48 = zzg5.zzf;
                    int i49 = zzg5.zzg;
                    int i50 = zzg5.zzh;
                    int i51 = zzg5.zzc + 8;
                    int i52 = zzg5.zzd + 8;
                    int i53 = zzg5.zzk;
                    int i54 = zzg5.zzl;
                    int i55 = zzg5.zzm;
                    float f2 = zzg5.zzi;
                    int i56 = zzg5.zzj;
                    zzgg zzggVar = zzg5.zzb;
                    if (zzggVar != null) {
                        i6 = i56;
                        i7 = i49;
                        i8 = i47;
                        i2 = zzs3;
                        i9 = i48;
                        str = zzdr.zzc(zzggVar.zza, zzggVar.zzb, zzggVar.zzc, zzggVar.zzd, zzggVar.zze, zzggVar.zzf);
                    } else {
                        i6 = i56;
                        i7 = i49;
                        i8 = i47;
                        i2 = zzs3;
                        i9 = i48;
                    }
                    i16 = i46;
                    i17 = i8;
                    i5 = 0;
                    i27 = i6;
                    i25 = i55;
                    i23 = i53;
                    i21 = i51;
                    i20 = i50;
                    i18 = i9;
                    i22 = i52;
                    i19 = i7;
                    f = f2;
                    i24 = i54;
                    i15 = i31 + zzt4;
                    zzeuVar.zzk(zzt4);
                    i29++;
                    i11 = i5;
                    zzs2 = i30;
                    zzt3 = i;
                    zzs3 = i2;
                    i10 = 4;
                } else {
                    i2 = zzs3;
                    i3 = i29;
                    i4 = i16;
                }
                i5 = 0;
                i29 = i3;
                i16 = i4;
                i15 = i31 + zzt4;
                zzeuVar.zzk(zzt4);
                i29++;
                i11 = i5;
                zzs2 = i30;
                zzt3 = i;
                zzs3 = i2;
                i10 = 4;
            }
            i28++;
            zzgoVar2 = zzgoVar3;
            i10 = 4;
        }
        return new zzahb(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzs + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, f, i27, str, zzgoVar2);
    }
}
