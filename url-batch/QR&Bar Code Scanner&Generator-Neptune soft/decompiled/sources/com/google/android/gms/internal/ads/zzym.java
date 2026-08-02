package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzym {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, PointerIconCompat.TYPE_CONTEXT_MENU, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzyl zza(zzee zzeeVar) {
        int i;
        int i2;
        int zzc;
        int zzc2 = zzeeVar.zzc(16);
        int zzc3 = zzeeVar.zzc(16);
        if (zzc3 == 65535) {
            zzc3 = zzeeVar.zzc(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzc3 + i;
        if (zzc2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzc4 = zzeeVar.zzc(2);
        int i5 = 0;
        if (zzc4 == 3) {
            int i6 = 0;
            while (true) {
                zzc = i6 + zzeeVar.zzc(2);
                if (!zzeeVar.zzl()) {
                    break;
                }
                i6 = (zzc + 1) << 2;
            }
            zzc4 = zzc + 3;
        }
        int zzc5 = zzeeVar.zzc(10);
        if (zzeeVar.zzl() && zzeeVar.zzc(3) > 0) {
            zzeeVar.zzj(2);
        }
        int i7 = true != zzeeVar.zzl() ? 44100 : 48000;
        int zzc6 = zzeeVar.zzc(4);
        if (i7 == 44100 && zzc6 == 13) {
            i2 = zzb[13];
        } else {
            if (i7 == 48000 && zzc6 < 14) {
                i5 = zzb[zzc6];
                int i8 = zzc5 % 5;
                if (i8 != 1) {
                    if (i8 == 2) {
                        if (zzc6 != 8) {
                        }
                        i5++;
                    } else if (i8 != 3) {
                        if (i8 == 4) {
                            if (zzc6 != 3) {
                                if (zzc6 != 8) {
                                }
                            }
                            i5++;
                        }
                    }
                }
                if (zzc6 != 3) {
                }
                i5++;
            }
            i2 = i5;
        }
        return new zzyl(zzc4, 2, i7, i4, i2, null);
    }

    public static void zzb(int i, zzef zzefVar) {
        zzefVar.zzC(7);
        byte[] zzH = zzefVar.zzH();
        zzH[0] = -84;
        zzH[1] = 64;
        zzH[2] = -1;
        zzH[3] = -1;
        zzH[4] = (byte) ((i >> 16) & 255);
        zzH[5] = (byte) ((i >> 8) & 255);
        zzH[6] = (byte) (i & 255);
    }
}
