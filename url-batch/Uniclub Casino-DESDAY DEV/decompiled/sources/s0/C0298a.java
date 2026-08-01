package s0;

import K.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import q1.d;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298a extends d {

    /* renamed from: e, reason: collision with root package name */
    public int f3761e;

    /* renamed from: f, reason: collision with root package name */
    public int f3762f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3763g;

    public C0298a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3763g = swipeDismissBehavior;
    }

    @Override // q1.d
    public final void F(View view, int i) {
        this.f3762f = i;
        this.f3761e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3763g;
            swipeDismissBehavior.f1545c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1545c = false;
        }
    }

    @Override // q1.d
    public final void G(int i) {
        this.f3763g.getClass();
    }

    @Override // q1.d
    public final void H(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3763g;
        float f2 = width * swipeDismissBehavior.f1546e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1547f;
        float abs = Math.abs(i - this.f3761e);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // q1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(View view, float f2, float f3) {
        int i;
        this.f3762f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3763g;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = S.f360a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3761e;
                    z2 = false;
                } else {
                    i = this.f3761e;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3761e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3761e - width;
        } else {
            int left2 = view.getLeft() - this.f3761e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1543a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = S.f360a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // q1.d
    public final boolean Z(View view, int i) {
        int i2 = this.f3762f;
        return (i2 == -1 || i2 == i) && this.f3763g.r(view);
    }

    @Override // q1.d
    public final int e(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f360a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3763g.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3761e - view.getWidth();
                width2 = this.f3761e;
            } else {
                width = this.f3761e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3761e - view.getWidth();
            width2 = view.getWidth() + this.f3761e;
        } else if (z2) {
            width = this.f3761e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3761e - view.getWidth();
            width2 = this.f3761e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // q1.d
    public final int f(View view, int i) {
        return view.getTop();
    }

    @Override // q1.d
    public final int z(View view) {
        return view.getWidth();
    }
}
