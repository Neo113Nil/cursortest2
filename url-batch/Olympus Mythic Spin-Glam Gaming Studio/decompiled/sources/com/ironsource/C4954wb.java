package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4954wb {
    private static final String g = "wb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final C4758lg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC4716ja f = new a();

    /* renamed from: com.ironsource.wb$a */
    class a implements InterfaceC4716ja {
        a() {
        }

        @Override // com.ironsource.InterfaceC4716ja
        public void a() {
            C4954wb.this.c.c(System.currentTimeMillis());
            C4954wb.this.c();
        }

        @Override // com.ironsource.InterfaceC4716ja
        public void b() {
            C4954wb.this.c.b(System.currentTimeMillis());
            C4954wb c4954wb = C4954wb.this;
            c4954wb.b(c4954wb.c.a());
        }

        @Override // com.ironsource.InterfaceC4716ja
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4716ja
        public void d() {
        }
    }

    /* renamed from: com.ironsource.wb$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4954wb c4954wb = C4954wb.this;
            c4954wb.a.b(c4954wb.f);
            C4954wb.this.c.b();
            C4954wb.this.b.run();
        }
    }

    public C4954wb(Runnable runnable, com.ironsource.lifecycle.b bVar, C4758lg c4758lg) {
        this.b = runnable;
        this.a = bVar;
        this.c = c4758lg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }
}
