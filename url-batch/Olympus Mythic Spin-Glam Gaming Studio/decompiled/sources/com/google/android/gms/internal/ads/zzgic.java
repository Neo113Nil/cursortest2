package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgic implements zzinw {
    private final zziof zza;

    private zzgic(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgic zza(zziof zziofVar) {
        return new zzgic(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzioe.zzb(displayMetrics);
        return displayMetrics;
    }
}
