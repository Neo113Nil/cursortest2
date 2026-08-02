package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawn {
    private static final int[] zza = {zzbar.zzg("isom"), zzbar.zzg("iso2"), zzbar.zzg("iso3"), zzbar.zzg("iso4"), zzbar.zzg("iso5"), zzbar.zzg("iso6"), zzbar.zzg("avc1"), zzbar.zzg("hvc1"), zzbar.zzg("hev1"), zzbar.zzg("mp41"), zzbar.zzg("mp42"), zzbar.zzg("3g2a"), zzbar.zzg("3g2b"), zzbar.zzg("3gr6"), zzbar.zzg("3gs6"), zzbar.zzg("3ge6"), zzbar.zzg("3gg6"), zzbar.zzg("M4V "), zzbar.zzg("M4A "), zzbar.zzg("f4v "), zzbar.zzg("kddi"), zzbar.zzg("M4VP"), zzbar.zzg("qt  "), zzbar.zzg("MSNV")};

    public static boolean zza(zzauy zzauyVar) throws IOException, InterruptedException {
        return zzc(zzauyVar, true);
    }

    public static boolean zzb(zzauy zzauyVar) throws IOException, InterruptedException {
        return zzc(zzauyVar, false);
    }

    private static boolean zzc(zzauy zzauyVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long zzc = zzauyVar.zzc();
        if (zzc == -1 || zzc > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            zzc = 4096;
        }
        int i = (int) zzc;
        zzbak zzbakVar = new zzbak(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            zzbakVar.zzs(8);
            zzauyVar.zzg(zzbakVar.zza, 0, 8, false);
            long zzm = zzbakVar.zzm();
            int zze = zzbakVar.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzauyVar.zzg(zzbakVar.zza, 8, 8, false);
                zzbakVar.zzu(16);
                zzm = zzbakVar.zzn();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzavw.zzE) {
                if (zze == zzavw.zzN || zze == zzavw.zzP) {
                    z2 = true;
                    break;
                }
                if ((i2 + zzm) - j >= i) {
                    break;
                }
                int i4 = (int) (zzm - j);
                i2 += i4;
                if (zze == zzavw.zzd) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzbakVar.zzs(i4);
                    zzauyVar.zzg(zzbakVar.zza, 0, i4, false);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int zze2 = zzbakVar.zze();
                            if ((zze2 >>> 8) != zzbar.zzg("3gp")) {
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
                        zzbakVar.zzw(4);
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzauyVar.zzf(i4, false);
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
