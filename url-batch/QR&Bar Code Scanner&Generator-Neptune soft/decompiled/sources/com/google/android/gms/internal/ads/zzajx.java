package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzajx extends Thread {
    private final BlockingQueue zza;
    private final zzajw zzb;
    private final zzajn zzc;
    private volatile boolean zzd = false;
    private final zzaju zze;

    public zzajx(BlockingQueue blockingQueue, zzajw zzajwVar, zzajn zzajnVar, zzaju zzajuVar, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzajwVar;
        this.zzc = zzajnVar;
        this.zze = zzajuVar;
    }

    private void zzb() throws InterruptedException {
        zzakd zzakdVar = (zzakd) this.zza.take();
        SystemClock.elapsedRealtime();
        zzakdVar.zzt(3);
        try {
            zzakdVar.zzm("network-queue-take");
            zzakdVar.zzw();
            TrafficStats.setThreadStatsTag(zzakdVar.zzc());
            zzajz zza = this.zzb.zza(zzakdVar);
            zzakdVar.zzm("network-http-complete");
            if (zza.zze && zzakdVar.zzv()) {
                zzakdVar.zzp("not-modified");
                zzakdVar.zzr();
                return;
            }
            zzakj zzh = zzakdVar.zzh(zza);
            zzakdVar.zzm("network-parse-complete");
            if (zzh.zzb != null) {
                this.zzc.zzd(zzakdVar.zzj(), zzh.zzb);
                zzakdVar.zzm("network-cache-written");
            }
            zzakdVar.zzq();
            this.zze.zzb(zzakdVar, zzh, null);
            zzakdVar.zzs(zzh);
        } catch (zzakm e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzakdVar, e);
            zzakdVar.zzr();
        } catch (Exception e2) {
            zzakp.zzc(e2, "Unhandled exception %s", e2.toString());
            zzakm zzakmVar = new zzakm(e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzakdVar, zzakmVar);
            zzakdVar.zzr();
        } finally {
            zzakdVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakp.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
