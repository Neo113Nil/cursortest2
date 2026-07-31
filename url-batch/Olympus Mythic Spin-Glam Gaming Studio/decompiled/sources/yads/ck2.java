package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ck2 implements dk0 {
    public final ExecutorService a;
    public final v30 b;
    public final fr c;
    public final or d;
    public yj0 e;
    public volatile bk2 f;
    public volatile boolean g;

    public ck2(wl1 wl1Var, er erVar, ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
        wl1Var.c.getClass();
        Map emptyMap = Collections.emptyMap();
        rl1 rl1Var = wl1Var.c;
        Uri uri = rl1Var.a;
        String str = rl1Var.c;
        oh.a(uri, "The uri must be set.");
        v30 v30Var = new v30(uri, 0L, 1, null, emptyMap, 0L, -1L, str, 4, null);
        this.b = v30Var;
        p30 p30Var = erVar.c;
        fr a = erVar.a(p30Var != null ? p30Var.a() : null, 1);
        this.c = a;
        this.d = new or(a, v30Var, null, new nr() { // from class: yads.ck2$$ExternalSyntheticLambda0
            @Override // yads.nr
            public final void a(long j, long j2, long j3) {
                ck2.this.a(j, j2, j3);
            }
        });
    }

    @Override // yads.dk0
    public final void a(yj0 yj0Var) {
        this.e = yj0Var;
        this.f = new bk2(this);
        try {
            if (!this.g) {
                this.a.execute(this.f);
                try {
                    bk2 bk2Var = this.f;
                    bk2Var.c.a();
                    bk2Var.c();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = sb3.a;
                    throw cause;
                }
            }
        } finally {
            this.f.c.b();
        }
    }

    @Override // yads.dk0
    public final void cancel() {
        this.g = true;
        bk2 bk2Var = this.f;
        if (bk2Var != null) {
            bk2Var.cancel(true);
        }
    }

    @Override // yads.dk0
    public final void remove() {
        fr frVar = this.c;
        ((lz2) frVar.a).c(frVar.e.a(this.b));
    }

    public final void a(long j, long j2, long j3) {
        yj0 yj0Var = this.e;
        if (yj0Var == null) {
            return;
        }
        yj0Var.a(j, j2, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j);
    }
}
