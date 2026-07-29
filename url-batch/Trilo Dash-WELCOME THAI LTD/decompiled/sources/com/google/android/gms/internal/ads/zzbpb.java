package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbpb implements zzbol {
    private final zzbpa zza;

    public zzbpb(zzbpa zzbpaVar) {
        this.zza = zzbpaVar;
    }

    public static void zzb(zzcli zzcliVar, zzbpa zzbpaVar) {
        zzcliVar.zzaf("/reward", new zzbpb(zzbpaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
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
        zzcaw zzcawVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcawVar = new zzcaw(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzcawVar);
    }
}
