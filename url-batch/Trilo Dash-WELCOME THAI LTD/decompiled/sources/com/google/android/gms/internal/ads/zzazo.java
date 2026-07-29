package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzazo {
    public final List zza;
    public final int zzb;
    public final float zzc;

    private zzazo(List list, int i, int i2, int i3, float f) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: ArrayIndexOutOfBoundsException -> 0x01af, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01af, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a2, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01a9, B:112:0x01ae), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: ArrayIndexOutOfBoundsException -> 0x01af, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01af, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a2, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01a9, B:112:0x01ae), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e A[Catch: ArrayIndexOutOfBoundsException -> 0x01af, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01af, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a2, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01a9, B:112:0x01ae), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a A[Catch: ArrayIndexOutOfBoundsException -> 0x01af, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01af, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a2, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01a9, B:112:0x01ae), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzazo zza(zzazg zzazgVar) throws zzarv {
        int i;
        int i2;
        float f;
        int zzc;
        int i3;
        int zzc2;
        boolean zze;
        int zza;
        try {
            zzazgVar.zzw(4);
            int zzg = (zzazgVar.zzg() & 3) + 1;
            if (zzg == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzg2 = zzazgVar.zzg() & 31;
            for (int i4 = 0; i4 < zzg2; i4++) {
                arrayList.add(zzb(zzazgVar));
            }
            int zzg3 = zzazgVar.zzg();
            for (int i5 = 0; i5 < zzg3; i5++) {
                arrayList.add(zzb(zzazgVar));
            }
            float f2 = 1.0f;
            if (zzg2 > 0) {
                zzazh zzazhVar = new zzazh((byte[]) arrayList.get(0), zzg, ((byte[]) arrayList.get(0)).length);
                zzazhVar.zzd(8);
                int zza2 = zzazhVar.zza(8);
                zzazhVar.zzd(16);
                zzazhVar.zzc();
                if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128 && zza2 != 138) {
                    zzc = 1;
                    zzazhVar.zzc();
                    zzc2 = zzazhVar.zzc();
                    if (zzc2 != 0) {
                        zzazhVar.zzc();
                    } else if (zzc2 == 1) {
                        zzazhVar.zze();
                        zzazhVar.zzb();
                        zzazhVar.zzb();
                        long zzc3 = zzazhVar.zzc();
                        for (int i6 = 0; i6 < zzc3; i6++) {
                            zzazhVar.zzc();
                        }
                    }
                    zzazhVar.zzc();
                    zzazhVar.zzd(1);
                    int zzc4 = zzazhVar.zzc() + 1;
                    int zzc5 = zzazhVar.zzc() + 1;
                    zze = zzazhVar.zze();
                    int i7 = 2 - (zze ? 1 : 0);
                    int i8 = zzc5 * i7;
                    if (!zze) {
                        zzazhVar.zzd(1);
                    }
                    zzazhVar.zzd(1);
                    int i9 = zzc4 * 16;
                    int i10 = i8 * 16;
                    if (zzazhVar.zze()) {
                        int zzc6 = zzazhVar.zzc();
                        int zzc7 = zzazhVar.zzc();
                        int zzc8 = zzazhVar.zzc();
                        int zzc9 = zzazhVar.zzc();
                        if (zzc != 0) {
                            int i11 = zzc == 3 ? 1 : 2;
                            i7 *= zzc == 1 ? 2 : 1;
                            r3 = i11;
                        }
                        i9 -= (zzc6 + zzc7) * r3;
                        i10 -= (zzc8 + zzc9) * i7;
                    }
                    if (zzazhVar.zze() && zzazhVar.zze()) {
                        zza = zzazhVar.zza(8);
                        if (zza != 255) {
                            int zza3 = zzazhVar.zza(16);
                            int zza4 = zzazhVar.zza(16);
                            if (zza3 != 0 && zza4 != 0) {
                                f2 = zza3 / zza4;
                            }
                        } else if (zza < 17) {
                            f2 = zzaze.zzb[zza];
                        } else {
                            Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza);
                        }
                    }
                    f = f2;
                    i2 = i10;
                    i = i9;
                }
                zzc = zzazhVar.zzc();
                if (zzc == 3) {
                    zzazhVar.zze();
                    i3 = 3;
                } else {
                    i3 = zzc;
                }
                zzazhVar.zzc();
                zzazhVar.zzc();
                zzazhVar.zzd(1);
                if (zzazhVar.zze()) {
                    int i12 = i3 != 3 ? 8 : 12;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (zzazhVar.zze()) {
                            int i14 = i13 < 6 ? 16 : 64;
                            int i15 = 8;
                            int i16 = 8;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i15 != 0) {
                                    i15 = ((zzazhVar.zzb() + i16) + 256) % 256;
                                }
                                if (i15 != 0) {
                                    i16 = i15;
                                }
                            }
                        }
                        i13++;
                    }
                }
                zzazhVar.zzc();
                zzc2 = zzazhVar.zzc();
                if (zzc2 != 0) {
                }
                zzazhVar.zzc();
                zzazhVar.zzd(1);
                int zzc42 = zzazhVar.zzc() + 1;
                int zzc52 = zzazhVar.zzc() + 1;
                zze = zzazhVar.zze();
                int i72 = 2 - (zze ? 1 : 0);
                int i82 = zzc52 * i72;
                if (!zze) {
                }
                zzazhVar.zzd(1);
                int i92 = zzc42 * 16;
                int i102 = i82 * 16;
                if (zzazhVar.zze()) {
                }
                if (zzazhVar.zze()) {
                    zza = zzazhVar.zza(8);
                    if (zza != 255) {
                    }
                }
                f = f2;
                i2 = i102;
                i = i92;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzazo(arrayList, zzg, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarv("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzazg zzazgVar) {
        int zzj = zzazgVar.zzj();
        int zzc = zzazgVar.zzc();
        zzazgVar.zzw(zzj);
        return zzayz.zzb(zzazgVar.zza, zzc, zzj);
    }
}
