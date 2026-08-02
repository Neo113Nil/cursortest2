package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdoz {
    zzbnf zza;
    zzbnc zzb;
    zzbns zzc;
    zzbnp zzd;
    zzbsl zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdoz zza(zzbnc zzbncVar) {
        this.zzb = zzbncVar;
        return this;
    }

    public final zzdoz zzb(zzbnf zzbnfVar) {
        this.zza = zzbnfVar;
        return this;
    }

    public final zzdoz zzc(String str, zzbnl zzbnlVar, zzbni zzbniVar) {
        this.zzf.put(str, zzbnlVar);
        if (zzbniVar != null) {
            this.zzg.put(str, zzbniVar);
        }
        return this;
    }

    public final zzdoz zzd(zzbsl zzbslVar) {
        this.zze = zzbslVar;
        return this;
    }

    public final zzdoz zze(zzbnp zzbnpVar) {
        this.zzd = zzbnpVar;
        return this;
    }

    public final zzdoz zzf(zzbns zzbnsVar) {
        this.zzc = zzbnsVar;
        return this;
    }

    public final zzdpb zzg() {
        return new zzdpb(this);
    }
}
