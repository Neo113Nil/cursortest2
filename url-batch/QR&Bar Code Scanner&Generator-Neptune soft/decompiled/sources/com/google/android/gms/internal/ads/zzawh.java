package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawh {
    public final zzawq zza = new zzawq();
    public final zzavi zzb;
    public zzawo zzc;
    public zzawe zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzavh zzh;
    public zzawp zzi;

    public zzawh(zzavi zzaviVar) {
        this.zzb = zzaviVar;
    }

    public final void zzb() {
        zzawq zzawqVar = this.zza;
        zzawqVar.zzd = 0;
        zzawqVar.zzr = 0L;
        zzawqVar.zzl = false;
        zzawqVar.zzq = false;
        zzawqVar.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }

    public final void zza(zzawo zzawoVar, zzawe zzaweVar) {
        Objects.requireNonNull(zzawoVar);
        this.zzc = zzawoVar;
        Objects.requireNonNull(zzaweVar);
        this.zzd = zzaweVar;
        this.zzb.zza(zzawoVar.zzf);
        zzb();
    }
}
