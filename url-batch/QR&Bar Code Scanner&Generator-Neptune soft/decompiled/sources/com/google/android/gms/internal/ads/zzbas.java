package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbas {
    public final List zza;
    public final int zzb;
    public final float zzc;

    private zzbas(List list, int i, int i2, int i3, float f) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00d8, B:39:0x00e1, B:40:0x0100, B:42:0x0119, B:43:0x011c, B:45:0x0127, B:48:0x0148, B:54:0x0146, B:56:0x014e, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:65:0x016e, B:68:0x0177, B:69:0x017c, B:71:0x0199, B:75:0x00e7, B:76:0x00f5, B:78:0x00fa, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b2, B:97:0x00c6, B:101:0x00d2, B:104:0x00d5, B:111:0x01a0, B:112:0x01a5), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00d8, B:39:0x00e1, B:40:0x0100, B:42:0x0119, B:43:0x011c, B:45:0x0127, B:48:0x0148, B:54:0x0146, B:56:0x014e, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:65:0x016e, B:68:0x0177, B:69:0x017c, B:71:0x0199, B:75:0x00e7, B:76:0x00f5, B:78:0x00fa, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b2, B:97:0x00c6, B:101:0x00d2, B:104:0x00d5, B:111:0x01a0, B:112:0x01a5), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00d8, B:39:0x00e1, B:40:0x0100, B:42:0x0119, B:43:0x011c, B:45:0x0127, B:48:0x0148, B:54:0x0146, B:56:0x014e, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:65:0x016e, B:68:0x0177, B:69:0x017c, B:71:0x0199, B:75:0x00e7, B:76:0x00f5, B:78:0x00fa, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b2, B:97:0x00c6, B:101:0x00d2, B:104:0x00d5, B:111:0x01a0, B:112:0x01a5), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162 A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00d8, B:39:0x00e1, B:40:0x0100, B:42:0x0119, B:43:0x011c, B:45:0x0127, B:48:0x0148, B:54:0x0146, B:56:0x014e, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:65:0x016e, B:68:0x0177, B:69:0x017c, B:71:0x0199, B:75:0x00e7, B:76:0x00f5, B:78:0x00fa, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b2, B:97:0x00c6, B:101:0x00d2, B:104:0x00d5, B:111:0x01a0, B:112:0x01a5), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzbas zza(zzbak zzbakVar) throws zzasz {
        int i;
        float f;
        int i2;
        int zzc;
        int i3;
        int zzc2;
        boolean zze;
        int zza;
        try {
            zzbakVar.zzw(4);
            int zzg = (zzbakVar.zzg() & 3) + 1;
            if (zzg == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzg2 = zzbakVar.zzg() & 31;
            for (int i4 = 0; i4 < zzg2; i4++) {
                arrayList.add(zzb(zzbakVar));
            }
            int zzg3 = zzbakVar.zzg();
            for (int i5 = 0; i5 < zzg3; i5++) {
                arrayList.add(zzb(zzbakVar));
            }
            float f2 = 1.0f;
            if (zzg2 > 0) {
                zzbal zzbalVar = new zzbal((byte[]) arrayList.get(0), zzg, ((byte[]) arrayList.get(0)).length);
                zzbalVar.zzd(8);
                int zza2 = zzbalVar.zza(8);
                zzbalVar.zzd(16);
                zzbalVar.zzc();
                if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128 && zza2 != 138) {
                    zzc = 1;
                    zzbalVar.zzc();
                    zzc2 = zzbalVar.zzc();
                    if (zzc2 != 0) {
                        zzbalVar.zzc();
                    } else if (zzc2 == 1) {
                        zzbalVar.zze();
                        zzbalVar.zzb();
                        zzbalVar.zzb();
                        long zzc3 = zzbalVar.zzc();
                        for (int i6 = 0; i6 < zzc3; i6++) {
                            zzbalVar.zzc();
                        }
                    }
                    zzbalVar.zzc();
                    zzbalVar.zzd(1);
                    int zzc4 = zzbalVar.zzc() + 1;
                    int zzc5 = zzbalVar.zzc() + 1;
                    zze = zzbalVar.zze();
                    int i7 = 2 - (zze ? 1 : 0);
                    int i8 = zzc5 * i7;
                    if (!zze) {
                        zzbalVar.zzd(1);
                    }
                    zzbalVar.zzd(1);
                    int i9 = zzc4 * 16;
                    int i10 = i8 * 16;
                    if (zzbalVar.zze()) {
                        int zzc6 = zzbalVar.zzc();
                        int zzc7 = zzbalVar.zzc();
                        int zzc8 = zzbalVar.zzc();
                        int zzc9 = zzbalVar.zzc();
                        if (zzc != 0) {
                            int i11 = zzc == 3 ? 1 : 2;
                            i7 *= zzc == 1 ? 2 : 1;
                            r3 = i11;
                        }
                        i9 -= (zzc6 + zzc7) * r3;
                        i10 -= (zzc8 + zzc9) * i7;
                    }
                    if (zzbalVar.zze() && zzbalVar.zze()) {
                        zza = zzbalVar.zza(8);
                        if (zza != 255) {
                            int zza3 = zzbalVar.zza(16);
                            int zza4 = zzbalVar.zza(16);
                            if (zza3 != 0 && zza4 != 0) {
                                f2 = zza3 / zza4;
                            }
                        } else if (zza < 17) {
                            f2 = zzbai.zzb[zza];
                        } else {
                            Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza);
                        }
                    }
                    f = f2;
                    i = i10;
                    i2 = i9;
                }
                zzc = zzbalVar.zzc();
                if (zzc == 3) {
                    zzbalVar.zze();
                    i3 = 3;
                } else {
                    i3 = zzc;
                }
                zzbalVar.zzc();
                zzbalVar.zzc();
                zzbalVar.zzd(1);
                if (zzbalVar.zze()) {
                    int i12 = i3 != 3 ? 8 : 12;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (zzbalVar.zze()) {
                            int i14 = i13 < 6 ? 16 : 64;
                            int i15 = 8;
                            int i16 = 8;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i15 != 0) {
                                    i15 = ((zzbalVar.zzb() + i16) + 256) % 256;
                                }
                                if (i15 != 0) {
                                    i16 = i15;
                                }
                            }
                        }
                        i13++;
                    }
                }
                zzbalVar.zzc();
                zzc2 = zzbalVar.zzc();
                if (zzc2 != 0) {
                }
                zzbalVar.zzc();
                zzbalVar.zzd(1);
                int zzc42 = zzbalVar.zzc() + 1;
                int zzc52 = zzbalVar.zzc() + 1;
                zze = zzbalVar.zze();
                int i72 = 2 - (zze ? 1 : 0);
                int i82 = zzc52 * i72;
                if (!zze) {
                }
                zzbalVar.zzd(1);
                int i92 = zzc42 * 16;
                int i102 = i82 * 16;
                if (zzbalVar.zze()) {
                }
                if (zzbalVar.zze()) {
                    zza = zzbalVar.zza(8);
                    if (zza != 255) {
                    }
                }
                f = f2;
                i = i102;
                i2 = i92;
            } else {
                i = -1;
                f = 1.0f;
                i2 = -1;
            }
            return new zzbas(arrayList, zzg, i2, i, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzasz("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzbak zzbakVar) {
        int zzj = zzbakVar.zzj();
        int zzc = zzbakVar.zzc();
        zzbakVar.zzw(zzj);
        return zzbad.zzb(zzbakVar.zza, zzc, zzj);
    }
}
