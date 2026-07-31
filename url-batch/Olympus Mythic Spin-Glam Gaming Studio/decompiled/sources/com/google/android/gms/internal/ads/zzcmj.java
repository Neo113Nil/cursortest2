package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcmj implements zzbqh {
    final /* synthetic */ zzcmp zza;

    zzcmj(zzcmp zzcmpVar) {
        Objects.requireNonNull(zzcmpVar);
        this.zza = zzcmpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                zzcmp zzcmpVar = this.zza;
                synchronized (zzcmpVar) {
                    try {
                        if (zzcmpVar.zzaX() != parseInt) {
                            zzcmpVar.zzaY(parseInt);
                            zzcmpVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
