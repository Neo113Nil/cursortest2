package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfs {
    private final zzfr zza;
    private final zzea zzb;
    private final zzea zzc;
    private boolean zzd;
    private boolean zze;

    public zzfs(Context context, Looper looper, zzdp zzdpVar) {
        this.zza = new zzfr(context.getApplicationContext());
        this.zzb = zzdpVar.zzd(looper, null);
        this.zzc = zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z, final boolean z2) {
        if (zzh(z, z2)) {
            this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfs.this.zze(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.zzc.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfs.this.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfs.this.zzd(atomicBoolean, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z, boolean z2) {
        return z && z2;
    }

    public final void zza(boolean z) {
        if (this.zzd == z) {
            return;
        }
        this.zzd = z;
        zzg(z, this.zze);
    }

    public final void zzb(boolean z) {
        if (this.zze == z) {
            return;
        }
        this.zze = z;
        if (this.zzd) {
            zzg(true, z);
        }
    }

    final /* synthetic */ void zzc(final AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final zzfr zzfrVar = this.zza;
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfr.this.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    final /* synthetic */ void zzd(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.zza.zzb(z, z2);
    }

    final /* synthetic */ void zze(boolean z, boolean z2) {
        this.zza.zzb(z, z2);
    }
}
