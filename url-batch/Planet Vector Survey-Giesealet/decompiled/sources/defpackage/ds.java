package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ds implements Comparator {
    public final a70 a;
    public final b70 b;
    public final a70 c;
    public final w60 d;

    public ds(g8 g8Var) {
        long[] jArr = vn0.a;
        this.a = new a70();
        int i = wn0.a;
        this.b = new b70();
        this.c = new a70();
        w60 w60Var = ma0.a;
        this.d = new w60();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        w60 w60Var;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            w60Var = this.d;
            if (i >= size) {
                break;
            }
            w60Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        b70 b70Var = this.b;
        a70 a70Var = this.a;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View l = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : x40.l(view, viewGroup, 2);
                if (l != null && w60Var.d(l) >= 0) {
                    a70Var.m(view, l);
                    b70Var.a(l);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) a70Var.g(view2)) != null && !b70Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    a70 a70Var2 = this.c;
                    View view4 = (View) a70Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    a70Var2.m(view2, view3);
                    view2 = (View) a70Var.g(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        a70 a70Var = this.c;
        View view3 = (View) a70Var.g(view);
        View view4 = (View) a70Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        w60 w60Var = this.d;
        return w60Var.e(view) < w60Var.e(view2) ? -1 : 1;
    }
}
