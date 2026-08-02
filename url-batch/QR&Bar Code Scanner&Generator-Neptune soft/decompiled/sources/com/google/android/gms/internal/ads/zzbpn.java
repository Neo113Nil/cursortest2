package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbpn implements zzbpu {
    zzbpn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzi("Received log message: ".concat(String.valueOf((String) map.get(TypedValues.Custom.S_STRING))));
    }
}
