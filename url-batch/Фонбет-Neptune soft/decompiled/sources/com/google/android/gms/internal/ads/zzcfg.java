package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcfg implements zzbix {
    final /* synthetic */ zzcfi zza;

    zzcfg(zzcfi zzcfiVar) {
        this.zza = zzcfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
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
                    zzcfi zzcfiVar = this.zza;
                    i = zzcfiVar.zzI;
                    if (i != parseInt) {
                        zzcfiVar.zzI = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
