package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcre implements zzdyq {
    private final zzcpw zza;
    private final zzcrk zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcre(zzcpw zzcpwVar, zzcrk zzcrkVar, zzcrd zzcrdVar) {
        this.zza = zzcpwVar;
        this.zzb = zzcrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyq
    public final /* synthetic */ zzdyq zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyq
    public final /* bridge */ /* synthetic */ zzdyq zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyq
    public final zzdyr zzc() {
        zzgxq.zzc(this.zzc, Long.class);
        zzgxq.zzc(this.zzd, String.class);
        return new zzcrg(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
