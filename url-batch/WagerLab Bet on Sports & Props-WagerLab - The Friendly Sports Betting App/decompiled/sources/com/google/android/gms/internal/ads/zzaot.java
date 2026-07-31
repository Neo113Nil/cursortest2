package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaot extends Thread {
    private static final boolean zza = zzapt.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaor zzd;
    private volatile boolean zze = false;
    private final zzapu zzf;
    private final zzaoy zzg;

    public zzaot(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaor zzaorVar, zzaoy zzaoyVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaorVar;
        this.zzg = zzaoyVar;
        this.zzf = new zzapu(this, blockingQueue2, zzaoyVar);
    }

    private void zzc() throws InterruptedException {
        zzaph zzaphVar = (zzaph) this.zzb.take();
        zzaphVar.zzc("cache-queue-take");
        zzaphVar.zze(1);
        try {
            zzaphVar.zzl();
            zzaor zzaorVar = this.zzd;
            zzaoq zza2 = zzaorVar.zza(zzaphVar.zzi());
            if (zza2 == null) {
                zzaphVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzaphVar)) {
                    this.zzc.put(zzaphVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaphVar.zzc("cache-hit-expired");
                    zzaphVar.zzj(zza2);
                    if (!this.zzf.zzc(zzaphVar)) {
                        this.zzc.put(zzaphVar);
                    }
                } else {
                    zzaphVar.zzc("cache-hit");
                    zzapn zzr = zzaphVar.zzr(new zzapd(zza2.zza, zza2.zzg));
                    zzaphVar.zzc("cache-hit-parsed");
                    if (!zzr.zzc()) {
                        zzaphVar.zzc("cache-parsing-failed");
                        zzaorVar.zzd(zzaphVar.zzi(), true);
                        zzaphVar.zzj(null);
                        if (!this.zzf.zzc(zzaphVar)) {
                            this.zzc.put(zzaphVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaphVar.zzc("cache-hit-refresh-needed");
                        zzaphVar.zzj(zza2);
                        zzr.zzd = true;
                        if (this.zzf.zzc(zzaphVar)) {
                            this.zzg.zza(zzaphVar, zzr, null);
                        } else {
                            this.zzg.zza(zzaphVar, zzr, new zzaos(this, zzaphVar));
                        }
                    } else {
                        this.zzg.zza(zzaphVar, zzr, null);
                    }
                }
            }
        } finally {
            zzaphVar.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapt.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapt.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
