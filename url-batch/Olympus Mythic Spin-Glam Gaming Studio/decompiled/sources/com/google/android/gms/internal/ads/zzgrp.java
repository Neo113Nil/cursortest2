package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgrp extends zzgrx {
    private String zza;
    private String zzb;

    zzgrp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgry zzc() {
        return new zzgrq(this.zza, this.zzb, null);
    }
}
