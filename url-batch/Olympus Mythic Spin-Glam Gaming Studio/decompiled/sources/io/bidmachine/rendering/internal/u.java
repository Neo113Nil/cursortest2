package io.bidmachine.rendering.internal;

import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.SystemComponent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class u implements r, m, p, o, t, s, e {
    private final io.bidmachine.rendering.internal.event.b a;
    private final List b;

    public static final class b extends a {
        b() {
        }

        @Override // io.bidmachine.util.SafeRunnable
        public void onRun() {
            u.this.n().k();
            u.this.b.remove(this);
        }
    }

    public u(io.bidmachine.rendering.internal.event.b eventCallback) {
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.a = eventCallback;
        this.b = new CopyOnWriteArrayList();
    }

    public void a() {
    }

    public void a(long j, long j2, float f) {
    }

    public void a(Integer num) {
    }

    public void a(String str) {
    }

    public void b(Integer num) {
    }

    public void d() {
    }

    public void destroy() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        this.b.clear();
    }

    public void j() {
    }

    @Override // io.bidmachine.rendering.internal.r
    public void k() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
    }

    public io.bidmachine.rendering.internal.event.b n() {
        return this.a;
    }

    public abstract String o();

    @Override // io.bidmachine.rendering.internal.r
    public void pause() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    private static abstract class a implements j {
        private long a;
        private long b;

        private final long c() {
            return Math.max(this.b - System.currentTimeMillis(), 0L);
        }

        public final void a(long j) {
            this.a = j;
            this.b = System.currentTimeMillis() + j;
            b();
        }

        public final void b() {
            long j = this.a;
            if (j > 0) {
                UiUtils.onUiThread(this, j);
            } else {
                UiUtils.onUiThread(this);
            }
        }

        public final void a() {
            this.a = c();
            UiUtils.cancelOnUiThread(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.r
    public void a(long j) {
        b bVar = new b();
        this.b.add(bVar);
        bVar.a(j);
    }

    public void a(SystemComponent systemComponent) {
        n().a(systemComponent);
    }
}
