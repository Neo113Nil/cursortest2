package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzecd extends zzecz {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private String zzc;
    private String zzd;

    zzecd() {
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzb(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzeda zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzece(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
