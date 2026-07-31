package io.bidmachine.rendering.internal.adform.video.player;

import android.net.Uri;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes15.dex */
public abstract class a implements b {
    private d f;
    private Uri i;
    private long k;
    private volatile boolean g = false;
    private volatile boolean h = false;
    private long j = -1;
    private final C1783a a = new C1783a(16);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicLong e = new AtomicLong(-1);

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.a$a, reason: collision with other inner class name */
    private class C1783a implements j {
        private final AtomicBoolean a = new AtomicBoolean(false);
        private final AtomicInteger b = new AtomicInteger(0);
        private final int c;

        public C1783a(int i) {
            this.c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.a.set(false);
            UiUtils.cancelOnUiThread(this);
        }

        @Override // io.bidmachine.util.SafeRunnable
        public void onRun() {
            if (this.a.get()) {
                if (a.this.C()) {
                    a();
                }
                a aVar = a.this;
                aVar.b(aVar.o());
                UiUtils.onUiThread(this, this.c);
            }
        }

        private void a() {
            if (a.this.o() == null) {
                return;
            }
            long f = a.this.f();
            if (f <= 0) {
                return;
            }
            float longValue = (r0.longValue() * 100.0f) / f;
            int i = this.b.get();
            if (longValue > (i * 25.0f) - 1.0f) {
                if (i == 0) {
                    a.this.L();
                } else if (i == 1) {
                    a.this.J();
                } else if (i == 2) {
                    a.this.K();
                } else if (i == 3) {
                    a.this.M();
                } else if (i == 4) {
                    a.this.I();
                }
                this.b.incrementAndGet();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.b.set(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            d();
            this.a.set(true);
            UiUtils.onUiThread(this);
        }
    }

    private void O() {
        try {
            this.j = u();
        } catch (Exception unused) {
        }
    }

    private d p() {
        return this.f;
    }

    protected void A() {
        k();
    }

    protected void B() {
        m();
    }

    public boolean C() {
        try {
            return w();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean D() {
        try {
            return x();
        } catch (Exception unused) {
            return false;
        }
    }

    protected void E() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.c(this);
    }

    protected void F() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.d(this);
    }

    protected void G() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.b(this);
    }

    protected void H() {
        d p;
        if (this.b.compareAndSet(false, true) && (p = p()) != null) {
            p.f(this);
        }
    }

    protected void I() {
        d p;
        if (this.d.compareAndSet(false, true) && (p = p()) != null) {
            p.i(this);
        }
    }

    protected void J() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.a(this);
    }

    protected void K() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.h(this);
    }

    protected void L() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.g(this);
    }

    protected void M() {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.e(this);
    }

    protected void N() {
        if (this.d.get()) {
            return;
        }
        this.a.c();
    }

    protected abstract long a();

    protected abstract void a(float f);

    protected abstract void a(long j);

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void a(d dVar) {
        this.f = dVar;
    }

    protected abstract long b();

    protected abstract void b(Uri uri);

    @Override // io.bidmachine.rendering.internal.m
    public void b(Integer num) {
        e(0.0f);
    }

    protected abstract float c();

    public void c(long j) {
        try {
            b(j);
        } catch (Exception unused) {
        }
    }

    @Override // io.bidmachine.rendering.internal.s
    public void d() {
        if (!this.h || this.d.get()) {
            return;
        }
        pause();
        c(f());
        F();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void destroy() {
        this.f = null;
        n();
    }

    public void e(float f) {
        try {
            c(f);
        } catch (Exception unused) {
        }
    }

    protected abstract boolean e();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public long f() {
        return this.j;
    }

    protected abstract boolean g();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public float getVolume() {
        try {
            return v();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    protected abstract void h();

    protected abstract void i();

    @Override // io.bidmachine.rendering.internal.p
    public void j() {
        try {
            this.d.set(false);
            this.a.b();
            a((Long) 0L);
        } catch (Exception e) {
            b(e);
        }
    }

    protected abstract void k();

    protected abstract void m();

    protected void n() {
        this.a.d();
    }

    public Long o() {
        try {
            return Long.valueOf(t());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void pause() {
        try {
            this.c.set(false);
            y();
            this.k = t();
        } catch (Exception unused) {
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void play() {
        try {
            this.h = true;
            a(this.d.get() ? Long.valueOf(f()) : null);
        } catch (Exception e) {
            b(e);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void prepare() {
        try {
            A();
        } catch (Exception e) {
            c(e);
        }
    }

    protected void q() {
        E();
        n();
    }

    protected void r() {
        G();
        N();
    }

    protected void s() {
        O();
        if (this.c.compareAndSet(true, false)) {
            a(true, Long.valueOf(this.k));
        }
        H();
    }

    protected long t() {
        return a();
    }

    protected long u() {
        return b();
    }

    protected float v() {
        return c();
    }

    protected boolean w() {
        return e();
    }

    protected boolean x() {
        return g();
    }

    protected void y() {
        h();
    }

    protected void z() {
        i();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void a(Uri uri) {
        try {
            c(uri);
            this.i = uri;
        } catch (Exception unused) {
        }
    }

    protected void b(long j) {
        a(j);
    }

    protected void c(Uri uri) {
        b(uri);
    }

    protected void f(float f) {
        if (f == 0.0f && !this.g) {
            this.g = true;
            a(true);
        } else if (this.g) {
            this.g = false;
            a(false);
        }
    }

    protected void b(float f) {
        f(f);
        d(f);
    }

    protected void c(float f) {
        a(f);
    }

    @Override // io.bidmachine.rendering.internal.m
    public void a(Integer num) {
        e(1.0f);
    }

    protected void c(Throwable th) {
        c(Error.create(th));
    }

    protected void a(Throwable th) {
        a(Error.create(th));
    }

    protected void b(Throwable th) {
        b(Error.create(th));
    }

    protected void c(Error error) {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.b(this, error);
    }

    protected void d(float f) {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.a(this, f);
    }

    protected void a(Error error) {
        if (this.h) {
            b(error);
        } else {
            c(error);
        }
    }

    protected void b(Error error) {
        if (this.d.get()) {
            return;
        }
        d p = p();
        if (p != null) {
            p.a(this, error);
        }
        I();
    }

    protected void a(boolean z) {
        d p;
        if (this.d.get() || (p = p()) == null) {
            return;
        }
        p.a(this, z);
    }

    private void a(Long l) {
        this.c.set(true);
        a(D(), l);
    }

    protected void b(Long l) {
        d p;
        if (l == null || this.e.getAndSet(l.longValue()) == l.longValue() || this.d.get() || (p = p()) == null) {
            return;
        }
        p.a((b) this, l.longValue());
    }

    private void a(boolean z, Long l) {
        if (l != null) {
            try {
                this.k = l.longValue();
            } catch (Exception e) {
                a(e);
                return;
            }
        }
        if (z) {
            if (l != null) {
                c(l.longValue());
            }
            z();
        } else {
            B();
            Uri uri = this.i;
            if (uri != null) {
                c(uri);
            }
            A();
        }
    }
}
