package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public int f350a;

    /* renamed from: b, reason: collision with root package name */
    public int f351b;

    /* renamed from: c, reason: collision with root package name */
    public int f352c;
    public Object d;

    public D() {
        if (J0.e.f264b == null) {
            J0.e.f264b = new J0.e(9);
        }
    }

    public int a(int i) {
        if (i < this.f352c) {
            return ((ByteBuffer) this.d).getShort(this.f351b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f351b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f351b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f350a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c2 = S.c(view);
            C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f370a : new C0001b(c2);
            if (c0001b == null) {
                c0001b = new C0001b();
            }
            S.l(view, c0001b);
            view.setTag(this.f350a, obj);
            S.g(view, this.f352c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
