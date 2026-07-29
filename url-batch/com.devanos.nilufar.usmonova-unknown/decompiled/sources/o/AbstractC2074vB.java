package o;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* renamed from: o.vB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2074vB {
    public int h;
    public int i;
    public int j;
    public Object k;

    public AbstractC2074vB() {
        if (CU.a == null) {
            CU.a = new CU();
        }
    }

    public int a(int i) {
        if (i < this.j) {
            return ((ByteBuffer) this.k).getShort(this.i + i);
        }
        return 0;
    }

    public void b() {
        if (((C2140wB) this.k).f238o != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i = this.h;
            C2140wB c2140wB = (C2140wB) this.k;
            if (i >= c2140wB.m || c2140wB.j[i] >= 0) {
                return;
            } else {
                this.h = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.i) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.i) {
            tag = d(view);
        } else {
            tag = view.getTag(this.h);
            if (!((Class) this.k).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate c = AZ.c(view);
            C0 c0 = c == null ? null : c instanceof B0 ? ((B0) c).a : new C0(c);
            if (c0 == null) {
                c0 = new C0();
            }
            AZ.h(view, c0);
            view.setTag(this.h, obj);
            AZ.e(view, this.j);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.h < ((C2140wB) this.k).m;
    }

    public void remove() {
        C2140wB c2140wB = (C2140wB) this.k;
        b();
        if (this.i == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c2140wB.b();
        c2140wB.m(this.i);
        this.i = -1;
        this.j = c2140wB.f238o;
    }
}
