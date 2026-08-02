package com.google.android.play.core.splitinstall.testing;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
abstract class zzs {
    zzs() {
    }

    abstract zzs zza(int i);

    abstract zzs zzb(Map map);

    abstract zzt zzc();

    abstract Map zzd();

    final zzt zze() {
        zzb(Collections.unmodifiableMap(zzd()));
        return zzc();
    }
}
