package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class es {
    public static final n5 f = new n5(1);
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final ds d = new ds(new g8(this));
    public final ArrayList e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        ArrayList arrayList2;
        int indexOf;
        int lastIndexOf;
        int i2;
        Rect rect2 = this.a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    d(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        View view2 = null;
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return c(i, rect2, view, viewGroup, arrayList);
            }
            g8.f("Unknown direction: ", i);
            return null;
        }
        ds dsVar = this.d;
        try {
            dsVar.a(arrayList, viewGroup);
            Collections.sort(arrayList, dsVar);
            dsVar.c.a();
            dsVar.b.b();
            dsVar.d.a();
            dsVar.a.a();
            int size = arrayList.size();
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (indexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size - 1) : (View) arrayList2.get(indexOf - 1);
                }
            } else if (i == 2) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = lastIndexOf + 1) >= size) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
                }
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                view2 = c(i, this.a, view, viewGroup, arrayList2);
            } else {
                arrayList2 = arrayList;
            }
            return view2 == null ? (View) arrayList2.get(size - 1) : view2;
        } catch (Throwable th) {
            dsVar.c.a();
            dsVar.b.b();
            dsVar.d.a();
            dsVar.a.a();
            throw th;
        }
    }

    public final View b(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View l = x40.l(view, viewGroup2, i);
        boolean z = true;
        View view3 = l;
        while (l != null) {
            if (l.isFocusable() && l.getVisibility() == 0 && (!l.isInTouchMode() || l.isFocusableInTouchMode())) {
                view2 = l;
                break;
            }
            l = x40.l(l, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                view3 = view3 != null ? x40.l(view3, viewGroup2, i) : null;
                if (view3 == l) {
                    break;
                }
            }
            z = z2;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                x40.o(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.b;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!nz.l(view3, view) && !nz.l(view3, viewGroup)) {
                Rect rect3 = this.c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                zi0 t = ld0.t(rect3);
                zi0 t2 = ld0.t(rect2);
                zi0 t3 = ld0.t(rect);
                bs N = nk.N(i);
                if (od0.m(t, t2, t3, N != null ? N.a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
