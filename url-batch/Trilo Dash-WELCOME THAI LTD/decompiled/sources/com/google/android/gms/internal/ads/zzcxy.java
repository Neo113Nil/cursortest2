package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcxy implements zzcxz {
    private final Map zza;

    zzcxy(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final zzeey zza(int i, String str) {
        return (zzeey) this.zza.get(str);
    }
}
