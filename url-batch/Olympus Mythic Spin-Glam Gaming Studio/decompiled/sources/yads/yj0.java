package yads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class yj0 extends Thread {
    public final ck0 b;
    public final dk0 c;
    public final ak0 d;
    public final boolean e;
    public final int f;
    public volatile wj0 g;
    public volatile boolean h;
    public Exception i;
    public long j = -1;

    public yj0(ck0 ck0Var, dk0 dk0Var, ak0 ak0Var, boolean z, int i, wj0 wj0Var) {
        this.b = ck0Var;
        this.c = dk0Var;
        this.d = ak0Var;
        this.e = z;
        this.f = i;
        this.g = wj0Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.g = null;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.e) {
                this.c.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.h) {
                    try {
                        this.c.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.h) {
                            long j2 = this.d.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.f) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.i = e2;
        }
        wj0 wj0Var = this.g;
        if (wj0Var != null) {
            wj0Var.obtainMessage(9, this).sendToTarget();
        }
    }

    public final void a(long j, long j2, float f) {
        this.d.a = j2;
        this.d.b = f;
        if (j != this.j) {
            this.j = j;
            wj0 wj0Var = this.g;
            if (wj0Var != null) {
                wj0Var.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }
}
