package v0;

import F1.l;
import K.T;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376a extends l {

    /* renamed from: e, reason: collision with root package name */
    public int f4408e;

    /* renamed from: f, reason: collision with root package name */
    public int f4409f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4410g;

    public C0376a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4410g = swipeDismissBehavior;
    }

    @Override // F1.l
    public final int L(View view) {
        return view.getWidth();
    }

    @Override // F1.l
    public final void Z(View view, int i) {
        this.f4409f = i;
        this.f4408e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4410g;
            swipeDismissBehavior.f2139c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2139c = false;
        }
    }

    @Override // F1.l
    public final void a0(int i) {
        this.f4410g.getClass();
    }

    @Override // F1.l
    public final void b0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4410g;
        float f2 = width * swipeDismissBehavior.f2140e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2141f;
        float abs = Math.abs(i - this.f4408e);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f1949A0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f1949A0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // F1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(View view, float f2, float f3) {
        int i;
        this.f4409f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4410g;
        if (f2 != RecyclerView.f1949A0) {
            WeakHashMap weakHashMap = T.f633a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4408e;
                    z2 = false;
                } else {
                    i = this.f4408e;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f1949A0) {
                int left = view.getLeft();
                int i3 = this.f4408e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4408e - width;
        } else {
            int left2 = view.getLeft() - this.f4408e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f2137a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = T.f633a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // F1.l
    public final int n(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f633a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4410g.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4408e - view.getWidth();
                width2 = this.f4408e;
            } else {
                width = this.f4408e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4408e - view.getWidth();
            width2 = view.getWidth() + this.f4408e;
        } else if (z2) {
            width = this.f4408e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4408e - view.getWidth();
            width2 = this.f4408e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // F1.l
    public final int o(View view, int i) {
        return view.getTop();
    }

    @Override // F1.l
    public final boolean p0(View view, int i) {
        int i2 = this.f4409f;
        return (i2 == -1 || i2 == i) && this.f4410g.r(view);
    }
}
