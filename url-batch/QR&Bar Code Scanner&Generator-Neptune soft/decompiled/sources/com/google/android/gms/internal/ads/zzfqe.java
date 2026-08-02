package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqe extends zzfqq {
    private String zza;
    private String zzb;

    zzfqe() {
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqr zzc() {
        return new zzfqg(this.zza, this.zzb, null);
    }
}
