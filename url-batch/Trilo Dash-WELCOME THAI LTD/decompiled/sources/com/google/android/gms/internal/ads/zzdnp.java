package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdnp {
    zzbmb zza;
    zzbly zzb;
    zzbmo zzc;
    zzbml zzd;
    zzbra zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdnp zza(zzbly zzblyVar) {
        this.zzb = zzblyVar;
        return this;
    }

    public final zzdnp zzb(zzbmb zzbmbVar) {
        this.zza = zzbmbVar;
        return this;
    }

    public final zzdnp zzc(String str, zzbmh zzbmhVar, zzbme zzbmeVar) {
        this.zzf.put(str, zzbmhVar);
        if (zzbmeVar != null) {
            this.zzg.put(str, zzbmeVar);
        }
        return this;
    }

    public final zzdnp zzd(zzbra zzbraVar) {
        this.zze = zzbraVar;
        return this;
    }

    public final zzdnp zze(zzbml zzbmlVar) {
        this.zzd = zzbmlVar;
        return this;
    }

    public final zzdnp zzf(zzbmo zzbmoVar) {
        this.zzc = zzbmoVar;
        return this;
    }

    public final zzdnr zzg() {
        return new zzdnr(this);
    }
}
