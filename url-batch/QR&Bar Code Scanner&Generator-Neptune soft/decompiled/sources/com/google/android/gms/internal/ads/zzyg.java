package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzyg {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzyf zza(byte[] bArr) throws zzbu {
        return zzb(new zzee(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r11 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzyf zzb(zzee zzeeVar, boolean z) throws zzbu {
        int i;
        int zzc2 = zzc(zzeeVar);
        int zzd = zzd(zzeeVar);
        int zzc3 = zzeeVar.zzc(4);
        String str = "mp4a.40." + zzc2;
        int i2 = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzeeVar);
            zzc2 = zzc(zzeeVar);
            if (zzc2 == 22) {
                zzc3 = zzeeVar.zzc(4);
            }
        }
        if (z) {
            int i3 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzbu.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzeeVar.zzl()) {
                zzdw.zze("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzeeVar.zzl()) {
                zzeeVar.zzj(14);
            }
            boolean zzl = zzeeVar.zzl();
            if (zzc3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 != 20) {
                    i = zzc2;
                    if (zzl) {
                        if (zzc2 == 22) {
                            zzeeVar.zzj(16);
                        } else {
                            i2 = zzc2;
                        }
                        if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                            zzeeVar.zzj(3);
                        }
                        zzeeVar.zzj(1);
                    }
                    switch (i) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int zzc4 = zzeeVar.zzc(2);
                            if (zzc4 == 2) {
                                i3 = zzc4;
                            }
                            throw zzbu.zzc("Unsupported epConfig: " + i3);
                    }
                }
                zzc2 = 20;
            }
            i = zzc2;
            zzeeVar.zzj(3);
            if (zzl) {
            }
            switch (i) {
            }
        }
        int i4 = zzc[zzc3];
        if (i4 != -1) {
            return new zzyf(zzd, i4, str, null);
        }
        throw zzbu.zza(null, null);
    }

    private static int zzc(zzee zzeeVar) {
        int zzc2 = zzeeVar.zzc(5);
        return zzc2 == 31 ? zzeeVar.zzc(6) + 32 : zzc2;
    }

    private static int zzd(zzee zzeeVar) throws zzbu {
        int zzc2 = zzeeVar.zzc(4);
        if (zzc2 == 15) {
            return zzeeVar.zzc(24);
        }
        if (zzc2 < 13) {
            return zzb[zzc2];
        }
        throw zzbu.zza(null, null);
    }
}
