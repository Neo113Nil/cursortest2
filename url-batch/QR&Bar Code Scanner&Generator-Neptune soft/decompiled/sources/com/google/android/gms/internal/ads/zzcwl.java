package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcwl extends zzcze {
    private final View zzc;
    private final zzcmp zzd;
    private final zzfdl zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcwd zzi;
    private zzbdn zzj;

    zzcwl(zzczd zzczdVar, View view, zzcmp zzcmpVar, zzfdl zzfdlVar, int i, boolean z, boolean z2, zzcwd zzcwdVar) {
        super(zzczdVar);
        this.zzc = view;
        this.zzd = zzcmpVar;
        this.zze = zzfdlVar;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcwdVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfdl zzc() {
        return zzfej.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbdd zzbddVar) {
        this.zzd.zzaj(zzbddVar);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzJ();
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    public final zzbdn zzj() {
        return this.zzj;
    }

    public final void zzk(zzbdn zzbdnVar) {
        this.zzj = zzbdnVar;
    }
}
