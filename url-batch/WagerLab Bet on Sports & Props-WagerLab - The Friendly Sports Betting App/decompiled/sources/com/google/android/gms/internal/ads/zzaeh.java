package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.amazon.a.a.o.b.f;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaeh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzaee zzb(zzef zzefVar, boolean z, boolean z2) throws zzas {
        if (z) {
            zzd(3, zzefVar, false);
        }
        String zzK = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzefVar.zzA();
        String[] strArr = new String[(int) zzA];
        int i = length + 15;
        for (int i2 = 0; i2 < zzA; i2++) {
            String zzK2 = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
            strArr[i2] = zzK2;
            i = i + 4 + zzK2.length();
        }
        if (z2 && (zzefVar.zzs() & 1) == 0) {
            throw zzas.zzb("framing bit expected to be set", null);
        }
        return new zzaee(zzK, strArr, i + 1);
    }

    public static zzao zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzeo.zza;
            String[] split = str.split(f.b, 2);
            if (split.length != 2) {
                String.valueOf(str);
                zzds.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafu.zzb(new zzef(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzds.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzags(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzao(arrayList);
    }

    public static boolean zzd(int i, zzef zzefVar, boolean z) throws zzas {
        if (zzefVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzefVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzas.zzb(sb.toString(), null);
        }
        if (zzefVar.zzs() != i) {
            if (z) {
                return false;
            }
            String hexString = Integer.toHexString(i);
            String.valueOf(hexString);
            throw zzas.zzb("expected header type ".concat(String.valueOf(hexString)), null);
        }
        if (zzefVar.zzs() == 118 && zzefVar.zzs() == 111 && zzefVar.zzs() == 114 && zzefVar.zzs() == 98 && zzefVar.zzs() == 105 && zzefVar.zzs() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzas.zzb("expected characters 'vorbis'", null);
    }
}
