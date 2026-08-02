package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcuz implements zzdda, zzdeo, zzddu, com.google.android.gms.ads.internal.client.zza, zzddq {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfdw zze;
    private final zzfdk zzf;
    private final zzfki zzg;
    private final zzfeo zzh;
    private final zzape zzi;
    private final zzbkb zzj;
    private final zzfju zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbkd zzp;

    zzcuz(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfdw zzfdwVar, zzfdk zzfdkVar, zzfki zzfkiVar, zzfeo zzfeoVar, View view, zzcmp zzcmpVar, zzape zzapeVar, zzbkb zzbkbVar, zzbkd zzbkdVar, zzfju zzfjuVar, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfdwVar;
        this.zzf = zzfdkVar;
        this.zzg = zzfkiVar;
        this.zzh = zzfeoVar;
        this.zzi = zzapeVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcmpVar);
        this.zzj = zzbkbVar;
        this.zzp = zzbkdVar;
        this.zzk = zzfjuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        int i;
        String zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcI)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbkr.zzh.zze()).booleanValue()) {
            zzfeo zzfeoVar = this.zzh;
            zzfki zzfkiVar = this.zzg;
            zzfdw zzfdwVar = this.zze;
            zzfdk zzfdkVar = this.zzf;
            zzfeoVar.zza(zzfkiVar.zzd(zzfdwVar, zzfdkVar, false, zzh, null, zzfdkVar.zzd));
            return;
        }
        if (((Boolean) zzbkr.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzfzg.zzr((zzfyx) zzfzg.zzo(zzfyx.zzv(zzfzg.zzi(null)), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcuy(this, zzh), this.zzb);
    }

    private final void zzt(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcus
                @Override // java.lang.Runnable
                public final void run() {
                    zzcuz.this.zzi(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbkr.zzd.zze()).booleanValue()) {
            zzfzg.zzr(zzfzg.zzf(zzfyx.zzv(this.zzj.zza()), Throwable.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzcut
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzchc.zzf), new zzcux(this), this.zzb);
            return;
        }
        zzfeo zzfeoVar = this.zzh;
        zzfki zzfkiVar = this.zzg;
        zzfdw zzfdwVar = this.zze;
        zzfdk zzfdkVar = this.zzf;
        zzfeoVar.zzc(zzfkiVar.zzc(zzfdwVar, zzfdkVar, zzfdkVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
        zzfeo zzfeoVar = this.zzh;
        zzfki zzfkiVar = this.zzg;
        zzfdw zzfdwVar = this.zze;
        zzfdk zzfdkVar = this.zzf;
        zzfeoVar.zza(zzfkiVar.zzc(zzfdwVar, zzfdkVar, zzfdkVar.zzj));
    }

    final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuw
            @Override // java.lang.Runnable
            public final void run() {
                zzcuz.this.zzs();
            }
        });
    }

    final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    final /* synthetic */ void zzi(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // java.lang.Runnable
            public final void run() {
                zzcuz.this.zzh(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfki.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcM)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcN)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcL)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcuz.this.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfeo zzfeoVar = this.zzh;
            zzfki zzfkiVar = this.zzg;
            zzfdw zzfdwVar = this.zze;
            zzfdk zzfdkVar = this.zzf;
            zzfeoVar.zza(zzfkiVar.zzc(zzfdwVar, zzfdkVar, zzfdkVar.zzn));
            zzfeo zzfeoVar2 = this.zzh;
            zzfki zzfkiVar2 = this.zzg;
            zzfdw zzfdwVar2 = this.zze;
            zzfdk zzfdkVar2 = this.zzf;
            zzfeoVar2.zza(zzfkiVar2.zzc(zzfdwVar2, zzfdkVar2, zzfdkVar2.zzg));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzp(zzcbs zzcbsVar, String str, String str2) {
        zzfeo zzfeoVar = this.zzh;
        zzfki zzfkiVar = this.zzg;
        zzfdk zzfdkVar = this.zzf;
        zzfeoVar.zza(zzfkiVar.zze(zzfdkVar, zzfdkVar.zzi, zzcbsVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
        zzfeo zzfeoVar = this.zzh;
        zzfki zzfkiVar = this.zzg;
        zzfdw zzfdwVar = this.zze;
        zzfdk zzfdkVar = this.zzf;
        zzfeoVar.zza(zzfkiVar.zzc(zzfdwVar, zzfdkVar, zzfdkVar.zzh));
    }
}
