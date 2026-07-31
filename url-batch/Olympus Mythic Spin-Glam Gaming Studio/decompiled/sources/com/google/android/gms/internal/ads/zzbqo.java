package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbqo implements zzbqh {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{n.g, "playVideo", "storePicture", "createCalendarEvent", n.h, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbys zzc;
    private final zzbyz zzd;

    public zzbqo(com.google.android.gms.ads.internal.zzb zzbVar, zzbys zzbysVar, zzbyz zzbyzVar) {
        this.zzb = zzbVar;
        this.zzc = zzbysVar;
        this.zzd = zzbyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbyv(zzclmVar, map).zza();
                    return;
                }
                if (intValue == 4) {
                    new zzbyp(zzclmVar, map).zza();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzclmVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzclmVar.zzam(i);
    }
}
