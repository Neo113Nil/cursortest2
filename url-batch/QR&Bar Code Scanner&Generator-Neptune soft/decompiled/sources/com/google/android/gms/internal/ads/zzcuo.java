package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcuo implements zzctw {
    private final zzeak zza;

    zzcuo(zzeak zzeakVar) {
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctw
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzm(str.equals("true"));
    }
}
