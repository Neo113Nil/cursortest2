package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbil;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzat {
    private final String zza;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbil.zza.EnumC0240zza zzc() {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals(BrandSafetyUtils.k)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbil.zza.EnumC0240zza.AD_INITIATER_UNSPECIFIED : zzbil.zza.EnumC0240zza.REWARD_BASED_VIDEO_AD : zzbil.zza.EnumC0240zza.AD_LOADER : zzbil.zza.EnumC0240zza.INTERSTITIAL : zzbil.zza.EnumC0240zza.BANNER;
    }
}
