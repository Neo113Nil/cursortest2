package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdjo {
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
    private zzfir zzo;

    final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    final /* synthetic */ zzfir zzC() {
        return this.zzo;
    }

    public final zzdjo zza(zzddp zzddpVar, Executor executor) {
        this.zze.add(new zzdlo(zzddpVar, executor));
        return this;
    }

    public final zzdjo zzb(zzdfd zzdfdVar, Executor executor) {
        this.zzh.add(new zzdlo(zzdfdVar, executor));
        return this;
    }

    public final zzdjo zzc(zzdds zzddsVar, Executor executor) {
        this.zzi.add(new zzdlo(zzddsVar, executor));
        return this;
    }

    public final zzdjo zzd(zzdef zzdefVar, Executor executor) {
        this.zzl.add(new zzdlo(zzdefVar, executor));
        return this;
    }

    public final zzdjo zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdlo(appEventListener, executor));
        return this;
    }

    public final zzdjo zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdlo(zzaVar, executor));
        return this;
    }

    public final zzdjo zzg(zzdlw zzdlwVar, Executor executor) {
        this.zzd.add(new zzdlo(zzdlwVar, executor));
        return this;
    }

    public final zzdjo zzh(zzdej zzdejVar, Executor executor) {
        this.zzf.add(new zzdlo(zzdejVar, executor));
        return this;
    }

    public final zzdjo zzi(zzdfo zzdfoVar, Executor executor) {
        this.zzg.add(new zzdlo(zzdfoVar, executor));
        return this;
    }

    public final zzdjo zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdlo(zzrVar, executor));
        return this;
    }

    public final zzdjo zzk(zzdgg zzdggVar, Executor executor) {
        this.zzm.add(new zzdlo(zzdggVar, executor));
        return this;
    }

    public final zzdjo zzl(zzfir zzfirVar) {
        this.zzo = zzfirVar;
        return this;
    }

    public final zzdjo zzm(zzdgv zzdgvVar, Executor executor) {
        this.zzb.add(new zzdlo(zzdgvVar, executor));
        return this;
    }

    public final zzdjp zzn() {
        return new zzdjp(this, null);
    }

    final /* synthetic */ Set zzo() {
        return this.zza;
    }

    final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    final /* synthetic */ Set zzs() {
        return this.zze;
    }

    final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    final /* synthetic */ Set zzz() {
        return this.zzl;
    }
}
