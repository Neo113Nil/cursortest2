package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f623a;

    /* renamed from: b, reason: collision with root package name */
    public int f624b;

    /* renamed from: c, reason: collision with root package name */
    public int f625c;
    public Object d;

    public E() {
        if (M0.e.f812b == null) {
            M0.e.f812b = new M0.e(12);
        }
    }

    public int a(int i) {
        if (i < this.f625c) {
            return ((ByteBuffer) this.d).getShort(this.f624b + i);
        }
        return 0;
    }

    public void b() {
        if (((X0.f) this.d).h != this.f625c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f623a;
            X0.f fVar = (X0.f) this.d;
            if (i >= fVar.f1308f || fVar.f1306c[i] >= 0) {
                return;
            } else {
                this.f623a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f624b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f624b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f623a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate c2 = T.c(view);
            C0007b c0007b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f644a : new C0007b(c2);
            if (c0007b == null) {
                c0007b = new C0007b();
            }
            T.l(view, c0007b);
            view.setTag(this.f623a, obj);
            T.g(view, this.f625c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f623a < ((X0.f) this.d).f1308f;
    }

    public void remove() {
        b();
        if (this.f624b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        X0.f fVar = (X0.f) this.d;
        fVar.c();
        fVar.l(this.f624b);
        this.f624b = -1;
        this.f625c = fVar.h;
    }
}
