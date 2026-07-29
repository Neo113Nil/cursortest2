package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzxu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzxt zza(byte[] bArr) throws zzbp {
        return zzb(new zzdx(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r11 != 3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzxt zzb(zzdx zzdxVar, boolean z) throws zzbp {
        int i;
        int zzc2 = zzc(zzdxVar);
        int zzd = zzd(zzdxVar);
        int zzc3 = zzdxVar.zzc(4);
        String str = "mp4a.40." + zzc2;
        int i2 = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzdxVar);
            zzc2 = zzc(zzdxVar);
            if (zzc2 == 22) {
                zzc3 = zzdxVar.zzc(4);
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
                        throw zzbp.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzdxVar.zzl()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(14);
            }
            boolean zzl = zzdxVar.zzl();
            if (zzc3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 == 6) {
                i = zzc2;
            } else {
                if (zzc2 != 20) {
                    i = zzc2;
                    if (zzl) {
                        if (zzc2 == 22) {
                            zzdxVar.zzj(16);
                        } else {
                            i2 = zzc2;
                        }
                        if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                            zzdxVar.zzj(3);
                        }
                        zzdxVar.zzj(1);
                    }
                    switch (i) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int zzc4 = zzdxVar.zzc(2);
                            if (zzc4 == 2) {
                                i3 = zzc4;
                            }
                            throw zzbp.zzc("Unsupported epConfig: " + i3);
                    }
                }
                zzc2 = 20;
                i = 20;
            }
            zzdxVar.zzj(3);
            if (zzl) {
            }
            switch (i) {
            }
        }
        int i4 = zzc[zzc3];
        if (i4 != -1) {
            return new zzxt(zzd, i4, str, null);
        }
        throw zzbp.zza(null, null);
    }

    private static int zzc(zzdx zzdxVar) {
        int zzc2 = zzdxVar.zzc(5);
        return zzc2 == 31 ? zzdxVar.zzc(6) + 32 : zzc2;
    }

    private static int zzd(zzdx zzdxVar) throws zzbp {
        int zzc2 = zzdxVar.zzc(4);
        if (zzc2 == 15) {
            return zzdxVar.zzc(24);
        }
        if (zzc2 < 13) {
            return zzb[zzc2];
        }
        throw zzbp.zza(null, null);
    }
}
