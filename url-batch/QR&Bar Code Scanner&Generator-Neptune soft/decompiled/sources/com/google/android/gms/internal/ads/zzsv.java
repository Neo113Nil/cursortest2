package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzsv implements zzvt {
    private final zzvt zza;
    private final zzcp zzb;

    public zzsv(zzvt zzvtVar, zzcp zzcpVar) {
        this.zza = zzvtVar;
        this.zzb = zzcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsv)) {
            return false;
        }
        zzsv zzsvVar = (zzsv) obj;
        return this.zza.equals(zzsvVar.zza) && this.zzb.equals(zzsvVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final zzaf zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final zzcp zze() {
        return this.zzb;
    }
}
