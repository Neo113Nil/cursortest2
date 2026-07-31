package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public final class bg1 extends Handler implements Runnable {
    public final int b;
    public final cg1 c;
    public final long d;
    public zf1 e;
    public IOException f;
    public int g;
    public Thread h;
    public boolean i;
    public volatile boolean j;
    public final /* synthetic */ gg1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(gg1 gg1Var, Looper looper, cg1 cg1Var, zf1 zf1Var, int i, long j) {
        super(looper);
        this.k = gg1Var;
        this.c = cg1Var;
        this.e = zf1Var;
        this.b = i;
        this.d = j;
    }

    public final void a(boolean z) {
        this.j = z;
        this.f = null;
        if (hasMessages(0)) {
            this.i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.i = true;
                    this.c.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.k.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zf1 zf1Var = this.e;
            zf1Var.getClass();
            zf1Var.a(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
            this.e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f = null;
            gg1 gg1Var = this.k;
            ExecutorService executorService = gg1Var.a;
            bg1 bg1Var = gg1Var.b;
            bg1Var.getClass();
            executorService.execute(bg1Var);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.k.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.d;
        zf1 zf1Var = this.e;
        zf1Var.getClass();
        if (this.i) {
            zf1Var.a(this.c, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                zf1Var.a(this.c, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                gh1.b("LoadTask", gh1.a("Unexpected exception handling load completed", e));
                this.k.c = new fg1(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f = iOException;
        int i3 = this.g + 1;
        this.g = i3;
        ag1 a = zf1Var.a(this.c, elapsedRealtime, j, iOException, i3);
        int i4 = a.a;
        if (i4 == 3) {
            this.k.c = this.f;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.g = 1;
            }
            long j2 = a.b;
            if (j2 == -9223372036854775807L) {
                j2 = Math.min((this.g - 1) * 1000, 5000);
            }
            gg1 gg1Var2 = this.k;
            if (gg1Var2.b != null) {
                throw new IllegalStateException();
            }
            gg1Var2.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                this.f = null;
                gg1Var2.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.i;
                this.h = Thread.currentThread();
            }
            if (!z) {
                t73.a("load:".concat(this.c.getClass().getSimpleName()));
                try {
                    this.c.a();
                    t73.a();
                } catch (Throwable th) {
                    t73.a();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.j) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.j) {
                return;
            }
            gh1.b("LoadTask", gh1.a("Unexpected exception loading stream", e2));
            obtainMessage(2, new fg1(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.j) {
                return;
            }
            gh1.b("LoadTask", gh1.a("OutOfMemory error loading stream", e3));
            obtainMessage(2, new fg1(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.j) {
                gh1.b("LoadTask", gh1.a("Unexpected error loading stream", e4));
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
