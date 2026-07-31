package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcqu implements zzcqv {
    private final Map zza;

    zzcqu(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzedz zza(int i, String str) {
        return (zzedz) this.zza.get(str);
    }
}
