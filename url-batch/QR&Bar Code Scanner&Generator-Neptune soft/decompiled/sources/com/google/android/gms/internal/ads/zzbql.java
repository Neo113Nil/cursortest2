package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbql implements zzbpu {
    private final zzbqk zza;

    public zzbql(zzbqk zzbqkVar) {
        this.zza = zzbqkVar;
    }

    public static void zzb(zzcmp zzcmpVar, zzbqk zzbqkVar) {
        zzcmpVar.zzaf("/reward", new zzbql(zzbqkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzcce zzcceVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcceVar = new zzcce(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzcceVar);
    }
}
