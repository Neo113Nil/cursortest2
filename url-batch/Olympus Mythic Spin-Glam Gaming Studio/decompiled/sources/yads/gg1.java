package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class gg1 implements hg1 {
    public static final ag1 d = new ag1(2, -9223372036854775807L);
    public static final ag1 e = new ag1(3, -9223372036854775807L);
    public final ExecutorService a;
    public bg1 b;
    public IOException c;

    public gg1(String str) {
        this.a = sb3.d("ExoPlayer:Loader:".concat(str));
    }

    public final long a(cg1 cg1Var, zf1 zf1Var, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException();
        }
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bg1 bg1Var = new bg1(this, myLooper, cg1Var, zf1Var, i, elapsedRealtime);
        if (this.b != null) {
            throw new IllegalStateException();
        }
        this.b = bg1Var;
        bg1Var.f = null;
        this.a.execute(bg1Var);
        return elapsedRealtime;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void a(dg1 dg1Var) {
        bg1 bg1Var = this.b;
        if (bg1Var != null) {
            bg1Var.a(true);
        }
        if (dg1Var != null) {
            this.a.execute(new eg1(dg1Var));
        }
        this.a.shutdown();
    }

    @Override // yads.hg1
    public final void a() {
        a(Integer.MIN_VALUE);
    }

    public final void a(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            bg1 bg1Var = this.b;
            if (bg1Var != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bg1Var.b;
                }
                IOException iOException2 = bg1Var.f;
                if (iOException2 != null && bg1Var.g > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }
}
