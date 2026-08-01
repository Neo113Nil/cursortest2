package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class j40 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public j40() {
        if (iw.g == null) {
            iw.g = new iw(18);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = f80.d(view);
            x xVar = d != null ? d instanceof w ? ((w) d).a : new x(d) : null;
            if (xVar == null) {
                xVar = new x();
            }
            f80.m(view, xVar);
            view.setTag(this.a, obj);
            f80.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
