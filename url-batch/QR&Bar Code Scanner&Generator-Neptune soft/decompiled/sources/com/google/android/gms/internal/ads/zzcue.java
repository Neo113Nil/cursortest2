package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcue implements zzctw {
    private final zzeak zza;

    zzcue(zzeak zzeakVar) {
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctw
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhU)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.zzl(str);
        }
    }
}
