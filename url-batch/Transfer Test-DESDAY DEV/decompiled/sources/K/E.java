package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f362a;

    /* renamed from: b, reason: collision with root package name */
    public int f363b;

    /* renamed from: c, reason: collision with root package name */
    public int f364c;
    public Object d;

    public E() {
        if (O0.e.f516b == null) {
            O0.e.f516b = new O0.e(11);
        }
    }

    public int a(int i) {
        if (i < this.f364c) {
            return ((ByteBuffer) this.d).getShort(this.f363b + i);
        }
        return 0;
    }

    public void b() {
        if (((W0.f) this.d).h != this.f364c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f362a;
            W0.f fVar = (W0.f) this.d;
            if (i >= fVar.f917f || fVar.f915c[i] >= 0) {
                return;
            } else {
                this.f362a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f363b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f363b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f362a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate c2 = T.c(view);
            C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f382a : new C0002b(c2);
            if (c0002b == null) {
                c0002b = new C0002b();
            }
            T.l(view, c0002b);
            view.setTag(this.f362a, obj);
            T.g(view, this.f364c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f362a < ((W0.f) this.d).f917f;
    }

    public void remove() {
        b();
        if (this.f363b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        W0.f fVar = (W0.f) this.d;
        fVar.c();
        fVar.l(this.f363b);
        this.f363b = -1;
        this.f364c = fVar.h;
    }
}
