package a;

import X.A;
import X.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1097a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.b f1098b = new Q0.b();

    /* renamed from: c, reason: collision with root package name */
    public A f1099c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1100e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1101f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1102g;

    public x(Runnable runnable) {
        this.f1097a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1087a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f1083a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1099c == null) {
            Q0.b bVar = this.f1098b;
            ListIterator<E> listIterator = bVar.listIterator(bVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f784a) {
                        break;
                    }
                }
            }
        }
        this.f1099c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1099c;
        if (a3 == null) {
            Q0.b bVar = this.f1098b;
            bVar.getClass();
            ListIterator listIterator = bVar.listIterator(bVar.f660c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f784a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1099c = null;
        if (a3 == null) {
            this.f1097a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f784a) {
            i.L();
        } else {
            i.f813g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1100e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1083a;
        if (z2 && !this.f1101f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1101f = true;
        } else {
            if (z2 || !this.f1101f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1101f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1102g;
        boolean z3 = false;
        Q0.b bVar = this.f1098b;
        if (bVar == null || !bVar.isEmpty()) {
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f784a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1102g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
