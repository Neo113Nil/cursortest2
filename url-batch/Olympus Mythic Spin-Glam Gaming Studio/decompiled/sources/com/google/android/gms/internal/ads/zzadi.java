package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzadi implements zzafb {
    final /* synthetic */ zzvp zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzadn zzd;

    zzadi(zzadn zzadnVar, zzvp zzvpVar, int i, long j) {
        this.zza = zzvpVar;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzadnVar);
        this.zzd = zzadnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zza(long j) {
        this.zzd.zzaD(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzb() {
        this.zzd.zzaA(this.zza, this.zzb, this.zzc);
    }
}
