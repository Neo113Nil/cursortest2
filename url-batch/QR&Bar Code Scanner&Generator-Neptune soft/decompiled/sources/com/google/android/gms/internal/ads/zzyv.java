package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzyv {
    public static void zza(long j, zzef zzefVar, zzaap[] zzaapVarArr) {
        int i;
        while (true) {
            if (zzefVar.zza() <= 1) {
                return;
            }
            int zzc = zzc(zzefVar);
            int zzc2 = zzc(zzefVar);
            int zzc3 = zzefVar.zzc() + zzc2;
            if (zzc2 == -1 || zzc2 > zzefVar.zza()) {
                zzdw.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzc3 = zzefVar.zzd();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzk = zzefVar.zzk();
                int zzo = zzefVar.zzo();
                if (zzo == 49) {
                    i = zzefVar.zze();
                    zzo = 49;
                } else {
                    i = 0;
                }
                int zzk2 = zzefVar.zzk();
                if (zzo == 47) {
                    zzefVar.zzG(1);
                    zzo = 47;
                }
                boolean z = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                if (zzo == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzefVar, zzaapVarArr);
                }
            }
            zzefVar.zzF(zzc3);
        }
    }

    public static void zzb(long j, zzef zzefVar, zzaap[] zzaapVarArr) {
        int zzk = zzefVar.zzk();
        if ((zzk & 64) != 0) {
            zzefVar.zzG(1);
            int i = (zzk & 31) * 3;
            int zzc = zzefVar.zzc();
            for (zzaap zzaapVar : zzaapVarArr) {
                zzefVar.zzF(zzc);
                zzaapVar.zzq(zzefVar, i);
                if (j != -9223372036854775807L) {
                    zzaapVar.zzs(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int zzc(zzef zzefVar) {
        int i = 0;
        while (zzefVar.zza() != 0) {
            int zzk = zzefVar.zzk();
            i += zzk;
            if (zzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
