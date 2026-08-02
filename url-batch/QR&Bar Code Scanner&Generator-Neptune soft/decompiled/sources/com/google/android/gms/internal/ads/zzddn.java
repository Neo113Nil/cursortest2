package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzddn extends zzdij implements zzdde {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzddn(zzddm zzddmVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzj(zzddmVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddg
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzdde) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzb() {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddi
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzdde) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzc(final zzdmo zzdmoVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzdde) obj).zzc(zzdmo.this);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.zze.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdmo("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // java.lang.Runnable
            public final void run() {
                zzddn.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzit)).intValue(), TimeUnit.MILLISECONDS);
    }
}
