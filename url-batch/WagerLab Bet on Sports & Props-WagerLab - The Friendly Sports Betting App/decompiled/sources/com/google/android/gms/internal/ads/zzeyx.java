package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeyx implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzelm zze;
    private final ViewGroup zzf;
    private zzbdd zzg;
    private final zzcyt zzh;
    private final zzfie zzi;
    private final zzday zzj;
    private final zzfdb zzk;
    private ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzelx zzo;

    public zzeyx(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcgv zzcgvVar, zzeli zzeliVar, zzelm zzelmVar, zzfdb zzfdbVar, zzday zzdayVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zze = zzelmVar;
        this.zzk = zzfdbVar;
        this.zzh = zzcgvVar.zzd();
        this.zzi = zzcgvVar.zzv();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdayVar;
        zzfdbVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziT)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeyx.this.zzm(zzeVar);
                }
            });
        }
        zzelx zzelxVar = this.zzo;
        if (zzelxVar != null) {
            zzelxVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) throws RemoteException {
        zzcpp zzh;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeyx.this.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzu().zzc(true);
            }
            Bundle zza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfdb zzfdbVar = this.zzk;
            zzfdbVar.zzg(str);
            zzfdbVar.zza(zzmVar);
            zzfdbVar.zzv(zza);
            Context context = this.zza;
            zzfdc zzz = zzfdbVar.zzz();
            zzfhr zzo = zzfhr.zzo(context, zzfia.zzg(zzz), 3, zzmVar);
            zzfib zzfibVar = null;
            if (!((Boolean) zzbeo.zzd.zze()).booleanValue() || !zzfdbVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziT)).booleanValue()) {
                    zzcpo zzg = this.zzc.zzg();
                    zzcva zzcvaVar = new zzcva();
                    zzcvaVar.zza(context);
                    zzcvaVar.zzb(zzz);
                    zzg.zzl(zzcvaVar.zze());
                    zzdbr zzdbrVar = new zzdbr();
                    zzeli zzeliVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdbrVar.zzm(zzeliVar, executor);
                    zzdbrVar.zze(zzeliVar, executor);
                    zzg.zzm(zzdbrVar.zzn());
                    zzg.zzk(new zzejp(this.zzg));
                    zzg.zzd(new zzdgy(zzdje.zza, null));
                    zzg.zzg(new zzcqk(this.zzh, this.zzj));
                    zzg.zze(new zzcoh(this.zzf));
                    zzh = zzg.zzh();
                } else {
                    zzcpo zzg2 = this.zzc.zzg();
                    zzcva zzcvaVar2 = new zzcva();
                    zzcvaVar2.zza(context);
                    zzcvaVar2.zzb(zzz);
                    zzg2.zzl(zzcvaVar2.zze());
                    zzdbr zzdbrVar2 = new zzdbr();
                    zzeli zzeliVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbrVar2.zzm(zzeliVar2, executor2);
                    zzdbrVar2.zzf(zzeliVar2, executor2);
                    zzdbrVar2.zzf(this.zze, executor2);
                    zzdbrVar2.zzg(zzeliVar2, executor2);
                    zzdbrVar2.zzh(zzeliVar2, executor2);
                    zzdbrVar2.zza(zzeliVar2, executor2);
                    zzdbrVar2.zzb(zzeliVar2, executor2);
                    zzdbrVar2.zzc(zzeliVar2, executor2);
                    zzdbrVar2.zze(zzeliVar2, executor2);
                    zzdbrVar2.zzk(zzeliVar2, executor2);
                    zzg2.zzm(zzdbrVar2.zzn());
                    zzg2.zzk(new zzejp(this.zzg));
                    zzg2.zzd(new zzdgy(zzdje.zza, null));
                    zzg2.zzg(new zzcqk(this.zzh, this.zzj));
                    zzg2.zze(new zzcoh(this.zzf));
                    zzh = zzg2.zzh();
                }
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfibVar = zzh.zze();
                    zzfibVar.zzi(3);
                    zzfibVar.zzc(zzmVar.zzp);
                    zzfibVar.zzd(zzmVar.zzm);
                }
                this.zzo = zzelxVar;
                zzcrw zzc = zzh.zzc();
                ListenableFuture zzc2 = zzc.zzc(zzc.zzb());
                this.zzl = zzc2;
                zzgot.zzq(zzc2, new zzeyt(this, zzfibVar, zzo, zzh), this.zzb);
                return true;
            }
            zzeli zzeliVar3 = this.zzd;
            if (zzeliVar3 != null) {
                zzeliVar3.zzdN(zzfee.zzd(7, null, null));
            }
        } else if (!this.zzk.zzA()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    zzcok zzcokVar = (zzcok) this.zzl.get();
                    this.zzl = null;
                    ViewGroup viewGroup = this.zzf;
                    viewGroup.removeAllViews();
                    zzcokVar.zza();
                    ViewParent parent = zzcokVar.zza().getParent();
                    if (parent instanceof ViewGroup) {
                        String zze = zzcokVar.zzn() != null ? zzcokVar.zzn().zze() : "";
                        StringBuilder sb = new StringBuilder(String.valueOf(zze).length() + 78);
                        sb.append("Banner view provided from ");
                        sb.append(zze);
                        sb.append(" already has a parent view. Removing its old parent.");
                        String sb2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        ((ViewGroup) parent).removeView(zzcokVar.zza());
                    }
                    zzbbz zzbbzVar = zzbci.zziT;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                        zzczi zzq = zzcokVar.zzq();
                        zzq.zza(this.zzd);
                        zzq.zzb(this.zze);
                    }
                    viewGroup.addView(zzcokVar.zza());
                    zzelx zzelxVar = this.zzo;
                    if (zzelxVar != null) {
                        zzelxVar.zzb(zzcokVar);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzeli zzeliVar = this.zzd;
                        Objects.requireNonNull(zzeliVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzeli.this.zzg();
                            }
                        });
                    }
                    if (zzcokVar.zzh() >= 0) {
                        this.zzm = false;
                        zzcyt zzcytVar = this.zzh;
                        zzcytVar.zzd(zzcokVar.zzh());
                        zzcytVar.zze(zzcokVar.zzg());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcokVar.zzg());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzn();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zzc();
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbdd zzbddVar) {
        this.zzg = zzbddVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final zzfdb zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
    }

    public final void zzi(zzcyo zzcyoVar) {
        this.zzh.zzq(zzcyoVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    final /* synthetic */ void zzl() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdN(zzeVar);
    }

    final /* synthetic */ zzcyt zzo() {
        return this.zzh;
    }

    final /* synthetic */ zzfie zzp() {
        return this.zzi;
    }

    final /* synthetic */ zzday zzq() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
