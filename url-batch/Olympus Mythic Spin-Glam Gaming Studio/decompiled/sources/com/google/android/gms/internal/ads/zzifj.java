package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzifj implements zzifa {
    final int zza;
    final zziin zzb;
    final boolean zzc;
    final boolean zzd;

    zzifj(zzifr zzifrVar, int i, zziin zziinVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zziinVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzifj) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziin zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziio zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zze() {
        return this.zzd;
    }
}
