package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaav {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzbq zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] zzah = zzen.zzah(str, "=");
            if (zzah.length != 2) {
                zzdw.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzah[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaci.zzb(new zzef(Base64.decode(zzah[1], 0))));
                } catch (RuntimeException e) {
                    zzdw.zzf("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzady(zzah[0], zzah[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    public static zzaas zzc(zzef zzefVar, boolean z, boolean z2) throws zzbu {
        if (z) {
            zzd(3, zzefVar, false);
        }
        String zzx = zzefVar.zzx((int) zzefVar.zzq(), zzfsk.zzc);
        long zzq = zzefVar.zzq();
        String[] strArr = new String[(int) zzq];
        int length = zzx.length() + 15;
        for (int i = 0; i < zzq; i++) {
            String zzx2 = zzefVar.zzx((int) zzefVar.zzq(), zzfsk.zzc);
            strArr[i] = zzx2;
            length = length + 4 + zzx2.length();
        }
        if (z2 && (zzefVar.zzk() & 1) == 0) {
            throw zzbu.zza("framing bit expected to be set", null);
        }
        return new zzaas(zzx, strArr, length + 1);
    }

    public static boolean zzd(int i, zzef zzefVar, boolean z) throws zzbu {
        if (zzefVar.zza() < 7) {
            if (z) {
                return false;
            }
            throw zzbu.zza("too short header: " + zzefVar.zza(), null);
        }
        if (zzefVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbu.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzefVar.zzk() == 118 && zzefVar.zzk() == 111 && zzefVar.zzk() == 114 && zzefVar.zzk() == 98 && zzefVar.zzk() == 105 && zzefVar.zzk() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzbu.zza("expected characters 'vorbis'", null);
    }
}
