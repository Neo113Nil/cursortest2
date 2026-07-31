package io.bidmachine.rendering.internal.state;

import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.internal.state.a;
import io.bidmachine.util.Tag;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public class d implements io.bidmachine.rendering.internal.state.a {
    private final Tag a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final AtomicBoolean j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    private final Set o;

    public static final class a implements a.b {
        a() {
        }

        @Override // io.bidmachine.rendering.internal.state.a.b
        public void a(io.bidmachine.rendering.internal.state.a source, a.EnumC1812a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            k.b(d.this.a, "Event: " + event, new Object[0]);
        }
    }

    public d(String parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.a = new Tag("DefaultAdState (" + parent + ')');
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new LinkedHashSet();
        a(new a());
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void b(a.b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.o) {
            this.o.remove(observer);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean c() {
        return this.d.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean d() {
        boolean compareAndSet = this.j.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.Clicked);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void destroy() {
        this.e.set(true);
        this.b.set(false);
        this.c.set(false);
        this.d.set(false);
        this.f.set(false);
        this.g.set(false);
        this.h.set(false);
        this.i.set(false);
        this.j.set(false);
        this.k.set(false);
        this.l.set(false);
        this.m.set(false);
        this.n.set(false);
        a(a.EnumC1812a.Destroyed);
        synchronized (this.o) {
            this.o.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean e() {
        boolean compareAndSet = this.i.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.FailedToShow);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean f() {
        boolean compareAndSet = this.g.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.ViewabilityShow);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean g() {
        return this.k.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean h() {
        return this.g.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean i() {
        return this.l.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean isCompleted() {
        return this.n.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean j() {
        return this.e.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean k() {
        boolean compareAndSet = this.h.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.Shown);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void l() {
        this.n.set(true);
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean m() {
        boolean compareAndSet = this.k.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.Finished);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean n() {
        boolean compareAndSet = this.m.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.Expired);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void o() {
        this.d.set(true);
        a(a.EnumC1812a.ShowInitiated);
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean p() {
        return this.h.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean a() {
        return this.b.get() && !j();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void a(a.b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (j()) {
            return;
        }
        synchronized (this.o) {
            this.o.add(observer);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b() {
        boolean compareAndSet = this.c.compareAndSet(false, true);
        if (compareAndSet) {
            a(a.EnumC1812a.LoadingStarted);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b(boolean z) {
        boolean compareAndSet = this.l.compareAndSet(!z, z);
        if (compareAndSet) {
            a(z ? a.EnumC1812a.Appeared : a.EnumC1812a.Disappeared);
        }
        return compareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean a(boolean z) {
        boolean z2 = false;
        this.c.set(false);
        this.b.set(z);
        if (this.f.compareAndSet(false, true) && !j()) {
            z2 = true;
        }
        if (z2) {
            a(z ? a.EnumC1812a.Loaded : a.EnumC1812a.FailedToLoad);
        }
        return z2;
    }

    private final void a(a.EnumC1812a enumC1812a) {
        synchronized (this.o) {
            try {
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    ((a.b) it.next()).a(this, enumC1812a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
