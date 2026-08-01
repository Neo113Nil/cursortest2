package x0;

import K.T;
import T.e;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347a extends e {

    /* renamed from: a, reason: collision with root package name */
    public int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public int f4067b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4068c;

    public C0347a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4068c = swipeDismissBehavior;
    }

    @Override // T.e
    public final int B(View view) {
        return view.getWidth();
    }

    @Override // T.e
    public final void K(View view, int i) {
        this.f4067b = i;
        this.f4066a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4068c;
            swipeDismissBehavior.f1771c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1771c = false;
        }
    }

    @Override // T.e
    public final void L(int i) {
        this.f4068c.getClass();
    }

    @Override // T.e
    public final void M(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4068c;
        float f2 = width * swipeDismissBehavior.f1772e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1773f;
        float abs = Math.abs(i - this.f4066a);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f1570A0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f1570A0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // T.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(View view, float f2, float f3) {
        int i;
        this.f4067b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4068c;
        if (f2 != RecyclerView.f1570A0) {
            WeakHashMap weakHashMap = T.f372a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4066a;
                    z2 = false;
                } else {
                    i = this.f4066a;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f1570A0) {
                int left = view.getLeft();
                int i3 = this.f4066a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4066a - width;
        } else {
            int left2 = view.getLeft() - this.f4066a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1769a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = T.f372a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // T.e
    public final boolean Y(View view, int i) {
        int i2 = this.f4067b;
        return (i2 == -1 || i2 == i) && this.f4068c.r(view);
    }

    @Override // T.e
    public final int k(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f372a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4068c.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4066a - view.getWidth();
                width2 = this.f4066a;
            } else {
                width = this.f4066a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4066a - view.getWidth();
            width2 = view.getWidth() + this.f4066a;
        } else if (z2) {
            width = this.f4066a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4066a - view.getWidth();
            width2 = this.f4066a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // T.e
    public final int l(View view, int i) {
        return view.getTop();
    }
}
