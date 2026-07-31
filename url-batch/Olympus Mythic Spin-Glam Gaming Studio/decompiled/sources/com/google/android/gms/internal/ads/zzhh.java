package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzhh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzhe zzb(zzeu zzeuVar, boolean z, boolean z2) throws zzat {
        if (z) {
            zzc(3, zzeuVar, false);
        }
        String zzK = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzeuVar.zzA();
        String[] strArr = new String[(int) zzA];
        int i = length + 15;
        for (int i2 = 0; i2 < zzA; i2++) {
            String zzK2 = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
            strArr[i2] = zzK2;
            i = i + 4 + zzK2.length();
        }
        if (z2 && (zzeuVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzhe(zzK, strArr, i + 1);
    }

    public static boolean zzc(int i, zzeu zzeuVar, boolean z) throws zzat {
        if (zzeuVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzeuVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzeuVar.zzs() != i) {
            if (z) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzeuVar.zzs() == 118 && zzeuVar.zzs() == 111 && zzeuVar.zzs() == 114 && zzeuVar.zzs() == 98 && zzeuVar.zzs() == 105 && zzeuVar.zzs() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
