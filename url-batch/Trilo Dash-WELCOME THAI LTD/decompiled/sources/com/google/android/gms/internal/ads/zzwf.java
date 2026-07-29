package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzwf extends Handler implements Runnable {
    final /* synthetic */ zzwk zza;
    private final zzwg zzb;
    private final long zzc;
    private zzwc zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzwf(zzwk zzwkVar, Looper looper, zzwg zzwgVar, zzwc zzwcVar, int i, long j) {
        super(looper);
        this.zza = zzwkVar;
        this.zzb = zzwgVar;
        this.zzd = zzwcVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.zzc;
        zzwc zzwcVar = this.zzd;
        Objects.requireNonNull(zzwcVar);
        if (this.zzh) {
            zzwcVar.zzG(this.zzb, elapsedRealtime, j2, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 1) {
            try {
                zzwcVar.zzH(this.zzb, elapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                zzdn.zza("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzwj(e);
                return;
            }
        }
        if (i4 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i5 = this.zzf + 1;
        this.zzf = i5;
        zzwe zzt = zzwcVar.zzt(this.zzb, elapsedRealtime, j2, iOException, i5);
        i = zzt.zza;
        if (i == 3) {
            this.zza.zzg = this.zze;
            return;
        }
        i2 = zzt.zza;
        if (i2 != 2) {
            i3 = zzt.zza;
            if (i3 == 1) {
                this.zzf = 1;
            }
            j = zzt.zzb;
            zzc(j != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i = zzeg.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzi();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(2, new zzwj(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(2, new zzwj(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwc zzwcVar = this.zzd;
            Objects.requireNonNull(zzwcVar);
            zzwcVar.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzwf zzwfVar;
        zzwfVar = this.zza.zzf;
        zzcw.zzf(zzwfVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        ExecutorService executorService;
        zzwf zzwfVar;
        this.zze = null;
        zzwk zzwkVar = this.zza;
        executorService = zzwkVar.zze;
        zzwfVar = zzwkVar.zzf;
        Objects.requireNonNull(zzwfVar);
        executorService.execute(zzwfVar);
    }
}
