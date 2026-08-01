package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class A implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1667c;
    public Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1668e;

    public A(e0.d dVar) {
        this.f1665a = 0;
        g1.f.e(dVar, "executor");
        this.f1668e = dVar;
        this.f1667c = new ArrayDeque();
        this.f1666b = new Object();
    }

    public final void a() {
        switch (this.f1665a) {
            case 0:
                synchronized (this.f1666b) {
                    Object poll = this.f1667c.poll();
                    Runnable runnable = (Runnable) poll;
                    this.d = runnable;
                    if (poll != null) {
                        ((e0.d) this.f1668e).execute(runnable);
                    }
                }
                return;
            default:
                synchronized (this.f1666b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f1667c.poll();
                        this.d = runnable2;
                        if (runnable2 != null) {
                            ((g.l) this.f1668e).execute(runnable2);
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
        switch (this.f1665a) {
            case 0:
                g1.f.e(runnable, "command");
                synchronized (this.f1666b) {
                    this.f1667c.offer(new B.o(runnable, 2, this));
                    if (this.d == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.f1666b) {
                    try {
                        this.f1667c.add(new B.o(this, 4, runnable));
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

    public A(g.l lVar) {
        this.f1665a = 1;
        this.f1666b = new Object();
        this.f1667c = new ArrayDeque();
        this.f1668e = lVar;
    }
}
