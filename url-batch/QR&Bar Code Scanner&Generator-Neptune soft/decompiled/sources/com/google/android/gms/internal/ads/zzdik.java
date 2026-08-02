package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdik {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfaw zzo;

    public final zzdik zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdkg(zzaVar, executor));
        return this;
    }

    public final zzdik zzb(zzddd zzdddVar, Executor executor) {
        this.zzi.add(new zzdkg(zzdddVar, executor));
        return this;
    }

    public final zzdik zzc(zzddq zzddqVar, Executor executor) {
        this.zzl.add(new zzdkg(zzddqVar, executor));
        return this;
    }

    public final zzdik zzd(zzddu zzdduVar, Executor executor) {
        this.zzf.add(new zzdkg(zzdduVar, executor));
        return this;
    }

    public final zzdik zze(zzdda zzddaVar, Executor executor) {
        this.zze.add(new zzdkg(zzddaVar, executor));
        return this;
    }

    public final zzdik zzf(zzdeo zzdeoVar, Executor executor) {
        this.zzh.add(new zzdkg(zzdeoVar, executor));
        return this;
    }

    public final zzdik zzg(zzdez zzdezVar, Executor executor) {
        this.zzg.add(new zzdkg(zzdezVar, executor));
        return this;
    }

    public final zzdik zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdkg(zzoVar, executor));
        return this;
    }

    public final zzdik zzi(zzdfl zzdflVar, Executor executor) {
        this.zzm.add(new zzdkg(zzdflVar, executor));
        return this;
    }

    public final zzdik zzj(zzdfv zzdfvVar, Executor executor) {
        this.zzb.add(new zzdkg(zzdfvVar, executor));
        return this;
    }

    public final zzdik zzk(zzasf zzasfVar, Executor executor) {
        this.zzk.add(new zzdkg(zzasfVar, executor));
        return this;
    }

    public final zzdik zzl(zzdkn zzdknVar, Executor executor) {
        this.zzd.add(new zzdkg(zzdknVar, executor));
        return this;
    }

    public final zzdik zzm(zzfaw zzfawVar) {
        this.zzo = zzfawVar;
        return this;
    }

    public final zzdim zzn() {
        return new zzdim(this, null);
    }
}
