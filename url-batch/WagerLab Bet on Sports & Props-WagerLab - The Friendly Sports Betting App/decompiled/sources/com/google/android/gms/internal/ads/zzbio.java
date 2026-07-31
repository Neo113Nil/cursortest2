package com.google.android.gms.internal.ads;

import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbio implements zzbjl {
    zzbio() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            String str = (String) map.get(ViewProps.ENABLED);
            zzbjl zzbjlVar = zzbjk.zza;
            if (!zzggj.zze("true", str) && !zzggj.zze("false", str)) {
                return;
            }
            zzftj.zza(zzcekVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
