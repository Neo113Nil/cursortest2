package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
final class zzeku extends zzelq {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    zzeku() {
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelq zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelq zzb(@Nullable com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelq zzc(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelq zzd(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelr zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzekv(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
