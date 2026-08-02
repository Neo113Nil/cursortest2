package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcyw {
    private final zzdfp zza;
    private final zzdhv zzb;

    public zzcyw(zzdfp zzdfpVar, zzdhv zzdhvVar) {
        this.zza = zzdfpVar;
        this.zzb = zzdhvVar;
    }

    public final zzdfp zza() {
        return this.zza;
    }

    final zzdhv zzb() {
        return this.zzb;
    }

    final zzdkg zzc() {
        zzdhv zzdhvVar = this.zzb;
        return zzdhvVar != null ? new zzdkg(zzdhvVar, zzchc.zzf) : new zzdkg(new zzcyv(this), zzchc.zzf);
    }
}
