package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzclz implements zzbol {
    final /* synthetic */ zzcmb zza;

    zzclz(zzcmb zzcmbVar) {
        this.zza = zzcmbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
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
                    zzcmb zzcmbVar = this.zza;
                    i = zzcmbVar.zzG;
                    if (i != parseInt) {
                        zzcmbVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
