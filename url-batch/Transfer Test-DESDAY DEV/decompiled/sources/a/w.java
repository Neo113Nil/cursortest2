package a;

import Y.A;
import Y.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.c f1227b = new V0.c();

    /* renamed from: c, reason: collision with root package name */
    public A f1228c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1229e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1230f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1231g;

    public w(Runnable runnable) {
        this.f1226a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? s.f1219a.a(new n(this, 0), new n(this, 1), new o(this, 0), new o(this, 1)) : q.f1215a.a(new o(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1228c == null) {
            V0.c cVar = this.f1227b;
            ListIterator<E> listIterator = cVar.listIterator(cVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f937a) {
                        break;
                    }
                }
            }
        }
        this.f1228c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1228c;
        if (a3 == null) {
            V0.c cVar = this.f1227b;
            ListIterator listIterator = cVar.listIterator(cVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f937a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1228c = null;
        if (a3 == null) {
            this.f1226a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f937a) {
            i.L();
        } else {
            i.f966g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1229e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        q qVar = q.f1215a;
        if (z2 && !this.f1230f) {
            qVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1230f = true;
        } else {
            if (z2 || !this.f1230f) {
                return;
            }
            qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1230f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1231g;
        boolean z3 = false;
        V0.c cVar = this.f1227b;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<E> it = cVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f937a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1231g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
