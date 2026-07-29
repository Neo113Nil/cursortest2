package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcvd extends zzcxw {
    private final View zzc;
    private final zzcli zzd;
    private final zzfbh zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcuv zzi;
    private zzbcj zzj;

    zzcvd(zzcxv zzcxvVar, View view, zzcli zzcliVar, zzfbh zzfbhVar, int i, boolean z, boolean z2, zzcuv zzcuvVar) {
        super(zzcxvVar);
        this.zzc = view;
        this.zzd = zzcliVar;
        this.zze = zzfbhVar;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcuvVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfbh zzc() {
        return zzfcc.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbbz zzbbzVar) {
        this.zzd.zzaj(zzbbzVar);
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

    public final zzbcj zzj() {
        return this.zzj;
    }

    public final void zzk(zzbcj zzbcjVar) {
        this.zzj = zzbcjVar;
    }
}
