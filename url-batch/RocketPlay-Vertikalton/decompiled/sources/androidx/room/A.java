package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class A implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2044a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2045b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f2046c;
    public Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2047e;

    public A(e0.d dVar) {
        this.f2044a = 0;
        i1.f.e(dVar, "executor");
        this.f2047e = dVar;
        this.f2046c = new ArrayDeque();
        this.f2045b = new Object();
    }

    public final void a() {
        switch (this.f2044a) {
            case 0:
                synchronized (this.f2045b) {
                    Object poll = this.f2046c.poll();
                    Runnable runnable = (Runnable) poll;
                    this.d = runnable;
                    if (poll != null) {
                        ((e0.d) this.f2047e).execute(runnable);
                    }
                }
                return;
            default:
                synchronized (this.f2045b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f2046c.poll();
                        this.d = runnable2;
                        if (runnable2 != null) {
                            ((g.m) this.f2047e).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2044a) {
            case 0:
                i1.f.e(runnable, "command");
                synchronized (this.f2045b) {
                    this.f2046c.offer(new B.o(runnable, 2, this));
                    if (this.d == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.f2045b) {
                    try {
                        this.f2046c.add(new B.o(this, 4, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public A(g.m mVar) {
        this.f2044a = 1;
        this.f2045b = new Object();
        this.f2046c = new ArrayDeque();
        this.f2047e = mVar;
    }
}
