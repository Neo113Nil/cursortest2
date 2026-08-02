package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabm {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabl zza(zzej zzejVar) {
        int i;
        int i2;
        int zzd;
        int zzd2 = zzejVar.zzd(16);
        int zzd3 = zzejVar.zzd(16);
        if (zzd3 == 65535) {
            zzd3 = zzejVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzd3 + i;
        if (zzd2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzd4 = zzejVar.zzd(2);
        if (zzd4 == 3) {
            int i5 = 0;
            while (true) {
                zzd = i5 + zzejVar.zzd(2);
                if (!zzejVar.zzp()) {
                    break;
                }
                i5 = (zzd + 1) << 2;
            }
            zzd4 = zzd + 3;
        }
        int i6 = zzd4;
        int zzd5 = zzejVar.zzd(10);
        if (zzejVar.zzp() && zzejVar.zzd(3) > 0) {
            zzejVar.zzn(2);
        }
        int i7 = true != zzejVar.zzp() ? 44100 : 48000;
        int zzd6 = zzejVar.zzd(4);
        if (i7 == 44100 && zzd6 == 13) {
            i2 = zzb[13];
        } else if (i7 != 48000 || zzd6 >= 14) {
            i2 = 0;
        } else {
            int i8 = zzb[zzd6];
            int i9 = zzd5 % 5;
            if (i9 != 1) {
                if (i9 == 2) {
                    if (zzd6 != 8) {
                    }
                    i8++;
                    i2 = i8;
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (zzd6 != 3) {
                            if (zzd6 != 8) {
                            }
                        }
                        i8++;
                    }
                    i2 = i8;
                }
            }
            if (zzd6 != 3) {
            }
            i8++;
            i2 = i8;
        }
        return new zzabl(i6, 2, i7, i4, i2, null);
    }

    public static void zzb(int i, zzek zzekVar) {
        zzekVar.zzH(7);
        byte[] zzM = zzekVar.zzM();
        zzM[0] = -84;
        zzM[1] = 64;
        zzM[2] = -1;
        zzM[3] = -1;
        zzM[4] = (byte) ((i >> 16) & 255);
        zzM[5] = (byte) ((i >> 8) & 255);
        zzM[6] = (byte) (i & 255);
    }
}
