package a;

import Y.A;
import Y.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.h f1621b = new W0.h();

    /* renamed from: c, reason: collision with root package name */
    public A f1622c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1624f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1625g;

    public x(Runnable runnable) {
        this.f1620a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1613a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f1609a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1622c == null) {
            W0.h hVar = this.f1621b;
            ListIterator<E> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f1319a) {
                        break;
                    }
                }
            }
        }
        this.f1622c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1622c;
        if (a3 == null) {
            W0.h hVar = this.f1621b;
            ListIterator listIterator = hVar.listIterator(hVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f1319a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1622c = null;
        if (a3 == null) {
            this.f1620a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f1319a) {
            i.L();
        } else {
            i.f1347g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1623e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1609a;
        if (z2 && !this.f1624f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1624f = true;
        } else {
            if (z2 || !this.f1624f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1624f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1625g;
        boolean z3 = false;
        W0.h hVar = this.f1621b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator<E> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f1319a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1625g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
