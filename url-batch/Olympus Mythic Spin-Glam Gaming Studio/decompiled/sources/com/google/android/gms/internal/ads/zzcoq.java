package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcoq implements zzinw {
    private final zziof zza;

    private zzcoq(zzcod zzcodVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcoq zzc(zzcod zzcodVar, zziof zziofVar) {
        return new zzcoq(zzcodVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzfms.zza(((zzcok) this.zza).zza()).zze();
    }
}
