package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzazx extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzbaa zzb;
    private final zzazy zzc;
    private final zzazw zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazx(zzbaa zzbaaVar, Looper looper, zzazy zzazyVar, zzazw zzazwVar, int i, long j) {
        super(looper);
        this.zzb = zzbaaVar;
        this.zzc = zzazyVar;
        this.zzd = zzazwVar;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzazx zzazxVar;
        this.zzf = null;
        zzbaa zzbaaVar = this.zzb;
        executorService = zzbaaVar.zza;
        zzazxVar = zzbaaVar.zzb;
        executorService.execute(zzazxVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.zze;
        if (this.zzc.zze()) {
            this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
            return;
        }
        if (i == 2) {
            this.zzd.zzu(this.zzc, elapsedRealtime, j);
            return;
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zzf = iOException;
        int zzd = this.zzd.zzd(this.zzc, elapsedRealtime, j, iOException);
        if (zzd == 3) {
            this.zzb.zzc = this.zzf;
        } else if (zzd != 2) {
            this.zzg = zzd != 1 ? 1 + this.zzg : 1;
            zzc(Math.min((r1 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                zzbap.zza("load:" + this.zzc.getClass().getSimpleName());
                try {
                    this.zzc.zzc();
                    zzbap.zzb();
                } catch (Throwable th) {
                    zzbap.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e2);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzazz(e2)).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            if (!this.zzi) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (InterruptedException unused) {
            zzbac.zze(this.zzc.zze());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzazz(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzazx zzazxVar;
        zzazxVar = this.zzb.zzb;
        zzbac.zze(zzazxVar == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
