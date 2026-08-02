package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqn extends zzfrg {
    private String zza;
    private String zzb;

    zzfqn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrh zzc() {
        return new zzfqp(this.zza, this.zzb, null);
    }
}
