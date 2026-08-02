package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfjt {
    public static void zza(zzfzp zzfzpVar, zzfju zzfjuVar, zzfjj zzfjjVar) {
        zzg(zzfzpVar, zzfjuVar, zzfjjVar, false);
    }

    public static void zzb(zzfzp zzfzpVar, zzfju zzfjuVar, zzfjj zzfjjVar) {
        zzg(zzfzpVar, zzfjuVar, zzfjjVar, true);
    }

    public static void zzc(zzfzp zzfzpVar, zzfju zzfjuVar, zzfjj zzfjjVar) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfzg.zzr(zzfyx.zzv(zzfzpVar), new zzfjs(zzfjuVar, zzfjjVar), zzchc.zzf);
        }
    }

    public static void zzd(zzfzp zzfzpVar, zzfjj zzfjjVar) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfzg.zzr(zzfyx.zzv(zzfzpVar), new zzfjq(zzfjjVar), zzchc.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhA), str);
    }

    public static int zzf(zzfef zzfefVar) {
        int zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(zzfefVar) - 1;
        return (zzd == 0 || zzd == 1) ? 7 : 23;
    }

    private static void zzg(zzfzp zzfzpVar, zzfju zzfjuVar, zzfjj zzfjjVar, boolean z) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfzg.zzr(zzfyx.zzv(zzfzpVar), new zzfjr(zzfjuVar, zzfjjVar, z), zzchc.zzf);
        }
    }
}
