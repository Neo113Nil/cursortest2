package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzavj {
    private static final int[] zza = {zzazn.zzg("isom"), zzazn.zzg("iso2"), zzazn.zzg("iso3"), zzazn.zzg("iso4"), zzazn.zzg("iso5"), zzazn.zzg("iso6"), zzazn.zzg("avc1"), zzazn.zzg("hvc1"), zzazn.zzg("hev1"), zzazn.zzg("mp41"), zzazn.zzg("mp42"), zzazn.zzg("3g2a"), zzazn.zzg("3g2b"), zzazn.zzg("3gr6"), zzazn.zzg("3gs6"), zzazn.zzg("3ge6"), zzazn.zzg("3gg6"), zzazn.zzg("M4V "), zzazn.zzg("M4A "), zzazn.zzg("f4v "), zzazn.zzg("kddi"), zzazn.zzg("M4VP"), zzazn.zzg("qt  "), zzazn.zzg("MSNV")};

    public static boolean zza(zzatu zzatuVar) throws IOException, InterruptedException {
        return zzc(zzatuVar, true);
    }

    public static boolean zzb(zzatu zzatuVar) throws IOException, InterruptedException {
        return zzc(zzatuVar, false);
    }

    private static boolean zzc(zzatu zzatuVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long zzc = zzatuVar.zzc();
        if (zzc == -1 || zzc > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            zzc = 4096;
        }
        int i = (int) zzc;
        zzazg zzazgVar = new zzazg(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            zzazgVar.zzs(8);
            zzatuVar.zzg(zzazgVar.zza, 0, 8, false);
            long zzm = zzazgVar.zzm();
            int zze = zzazgVar.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzatuVar.zzg(zzazgVar.zza, 8, 8, false);
                zzazgVar.zzu(16);
                zzm = zzazgVar.zzn();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzaus.zzE) {
                if (zze == zzaus.zzN || zze == zzaus.zzP) {
                    z2 = true;
                    break;
                }
                if ((i2 + zzm) - j >= i) {
                    break;
                }
                int i4 = (int) (zzm - j);
                i2 += i4;
                if (zze == zzaus.zzd) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzazgVar.zzs(i4);
                    zzatuVar.zzg(zzazgVar.zza, 0, i4, false);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int zze2 = zzazgVar.zze();
                            if ((zze2 >>> 8) != zzazn.zzg("3gp")) {
                                int[] iArr = zza;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] != zze2) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                        zzazgVar.zzw(4);
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzatuVar.zzf(i4, false);
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
