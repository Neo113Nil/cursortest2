package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzach {
    public static void zza(long j, zzef zzefVar, zzaeb[] zzaebVarArr) {
        int i;
        while (true) {
            if (zzefVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzefVar);
            int zzc2 = zzc(zzefVar);
            int zzg = zzefVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzefVar.zzd()) {
                zzds.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzefVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzefVar.zzs();
                int zzt = zzefVar.zzt();
                if (zzt == 49) {
                    i = zzefVar.zzB();
                    zzt = 49;
                } else {
                    i = 0;
                }
                int zzs2 = zzefVar.zzs();
                if (zzt == 47) {
                    zzefVar.zzk(1);
                    zzt = 47;
                }
                boolean z = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzefVar, zzaebVarArr);
                }
            }
            zzefVar.zzh(zzg);
        }
    }

    public static void zzb(long j, zzef zzefVar, zzaeb[] zzaebVarArr) {
        int zzs = zzefVar.zzs();
        if ((zzs & 64) != 0) {
            int i = zzs & 31;
            zzefVar.zzk(1);
            int zzg = zzefVar.zzg();
            for (zzaeb zzaebVar : zzaebVarArr) {
                int i2 = i * 3;
                zzefVar.zzh(zzg);
                zzaebVar.zzz(zzefVar, i2);
                zzghc.zzh(j != C.TIME_UNSET);
                zzaebVar.zzx(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzef zzefVar) {
        int i = 0;
        while (zzefVar.zzd() != 0) {
            int zzs = zzefVar.zzs();
            i += zzs;
            if (zzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
