package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzco {
    private final Map zza = new HashMap();

    zzco() {
    }

    final synchronized double zza(String str) {
        Double d = (Double) this.zza.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    final synchronized double zzb(String str, zzdg zzdgVar) {
        double d;
        d = (((zzce) zzdgVar).zzf + 1.0d) / ((zzce) zzdgVar).zzg;
        this.zza.put(str, Double.valueOf(d));
        return d;
    }

    final synchronized void zzc(String str) {
        this.zza.put(str, Double.valueOf(0.0d));
    }
}
