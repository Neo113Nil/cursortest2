package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcqf implements zzecb {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    private final Context zze;
    private final zzbri zzf;
    private final zzcpp zzg;
    private final zzcqf zzh = this;

    zzcqf(zzcpp zzcppVar, Context context, zzbri zzbriVar) {
        this.zzg = zzcppVar;
        this.zze = context;
        this.zzf = zzbriVar;
        zzinw zza = zzinx.zza(this);
        this.zza = zza;
        zzinw zza2 = zzinx.zza(zzbriVar);
        this.zzb = zza2;
        zzebx zzc = zzebx.zzc(zza2);
        this.zzc = zzc;
        this.zzd = zzinv.zza(zzebz.zza(zza, zzc));
    }

    final zzebw zza() {
        return zzebx.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final zzeby zzb() {
        return (zzeby) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final zzebt zzc() {
        return new zzcqc(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
