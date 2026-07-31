package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgeo extends zzgfq {
    private String zza;
    private String zzb;

    zzgeo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfq zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfq zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfr zzc() {
        return new zzgep(this.zza, this.zzb, null);
    }
}
