package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgrv extends zzgsx {
    private String zza;
    private String zzb;

    zzgrv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final zzgsy zzc() {
        return new zzgrw(this.zza, this.zzb, null);
    }
}
