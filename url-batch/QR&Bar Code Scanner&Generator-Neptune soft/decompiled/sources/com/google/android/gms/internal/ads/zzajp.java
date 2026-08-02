package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzajp extends Thread {
    private static final boolean zza = zzakp.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzajn zzd;
    private volatile boolean zze = false;
    private final zzakq zzf;
    private final zzaju zzg;

    public zzajp(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajn zzajnVar, zzaju zzajuVar, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzajnVar;
        this.zzg = zzajuVar;
        this.zzf = new zzakq(this, blockingQueue2, zzajuVar, null);
    }

    private void zzc() throws InterruptedException {
        zzakd zzakdVar = (zzakd) this.zzb.take();
        zzakdVar.zzm("cache-queue-take");
        zzakdVar.zzt(1);
        try {
            zzakdVar.zzw();
            zzajm zza2 = this.zzd.zza(zzakdVar.zzj());
            if (zza2 == null) {
                zzakdVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzakdVar)) {
                    this.zzc.put(zzakdVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzakdVar.zzm("cache-hit-expired");
                zzakdVar.zze(zza2);
                if (!this.zzf.zzc(zzakdVar)) {
                    this.zzc.put(zzakdVar);
                }
                return;
            }
            zzakdVar.zzm("cache-hit");
            zzakj zzh = zzakdVar.zzh(new zzajz(zza2.zza, zza2.zzg));
            zzakdVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzakdVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzakdVar.zzj(), true);
                zzakdVar.zze(null);
                if (!this.zzf.zzc(zzakdVar)) {
                    this.zzc.put(zzakdVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzakdVar.zzm("cache-hit-refresh-needed");
                zzakdVar.zze(zza2);
                zzh.zzd = true;
                if (this.zzf.zzc(zzakdVar)) {
                    this.zzg.zzb(zzakdVar, zzh, null);
                } else {
                    this.zzg.zzb(zzakdVar, zzh, new zzajo(this, zzakdVar));
                }
            } else {
                this.zzg.zzb(zzakdVar, zzh, null);
            }
        } finally {
            zzakdVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzakp.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakp.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
