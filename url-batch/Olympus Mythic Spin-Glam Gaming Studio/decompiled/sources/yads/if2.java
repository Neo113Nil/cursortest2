package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes13.dex */
public final class if2 {
    public final hf2 a;
    public final gf2 b;
    public final p53 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public if2(gf2 gf2Var, hf2 hf2Var, g73 g73Var, int i, p53 p53Var, Looper looper) {
        this.b = gf2Var;
        this.a = hf2Var;
        this.f = looper;
        this.c = p53Var;
    }

    public final if2 a() {
        if (this.g) {
            throw new IllegalStateException();
        }
        this.g = true;
        fo0 fo0Var = (fo0) this.b;
        synchronized (fo0Var) {
            if (!fo0Var.z && fo0Var.j.isAlive()) {
                fo0Var.i.a(14, this).b();
            }
            gh1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
        return this;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final synchronized void a(long j) {
        boolean z;
        if (this.g) {
            if (this.f.getThread() != Thread.currentThread()) {
                this.c.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                while (true) {
                    z = this.i;
                    if (z || j <= 0) {
                        break;
                    }
                    this.c.getClass();
                    wait(j);
                    this.c.getClass();
                    j = elapsedRealtime - SystemClock.elapsedRealtime();
                }
                if (!z) {
                    throw new TimeoutException("Message delivery timed out.");
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
