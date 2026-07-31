package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public class Q0 {
    private final O0 a;
    private final Fb b;
    private final C4954wb c = c();
    private Timer d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q0.this.b.b();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Q0.this.b.b();
        }
    }

    public Q0(O0 o0, @NotNull Fb fb) {
        this.a = o0;
        this.b = fb;
    }

    private synchronized void b(long j) {
        j();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    private C4954wb c() {
        return new C4954wb(new a(), com.ironsource.lifecycle.b.d(), new C4758lg());
    }

    private synchronized void j() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.a.a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected boolean d() {
        return this.a.c() > 0;
    }

    public void e() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.a.c());
        }
    }

    public void f() {
        if (this.a.a() == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.a.d());
        }
    }

    public void g() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.a.a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.a.d());
    }

    protected void i() {
        C4954wb c4954wb = this.c;
        if (c4954wb != null) {
            c4954wb.b();
        }
    }

    public void k() {
        if (this.a.a() != O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.a.b());
    }

    protected O0 b() {
        return this.a;
    }

    protected void a(long j) {
        C4954wb c4954wb = this.c;
        if (c4954wb != null) {
            c4954wb.a(j);
        }
    }
}
