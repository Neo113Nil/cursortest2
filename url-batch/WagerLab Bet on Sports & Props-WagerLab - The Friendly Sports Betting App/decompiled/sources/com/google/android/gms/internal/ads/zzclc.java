package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzclc implements zzcky {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        this.zza.zzd(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
