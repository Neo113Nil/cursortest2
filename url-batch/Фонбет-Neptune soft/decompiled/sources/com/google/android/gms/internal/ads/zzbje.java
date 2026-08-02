package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbje implements zzbix {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbrk zzc;
    private final zzbrr zzd;

    public zzbje(com.google.android.gms.ads.internal.zzb zzbVar, zzbrk zzbrkVar, zzbrr zzbrrVar) {
        this.zzb = zzbVar;
        this.zzc = zzbrkVar;
        this.zzd = zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbrn(zzcejVar, map).zzb();
                    return;
                }
                if (intValue == 4) {
                    new zzbrh(zzcejVar, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcejVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzcejVar.zzau(i);
    }
}
