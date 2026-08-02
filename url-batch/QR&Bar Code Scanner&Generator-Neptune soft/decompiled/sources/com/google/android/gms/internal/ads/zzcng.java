package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcng implements zzbpu {
    final /* synthetic */ zzcni zza;

    zzcng(zzcni zzcniVar) {
        this.zza = zzcniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcni zzcniVar = this.zza;
                    i = zzcniVar.zzG;
                    if (i != parseInt) {
                        zzcniVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
