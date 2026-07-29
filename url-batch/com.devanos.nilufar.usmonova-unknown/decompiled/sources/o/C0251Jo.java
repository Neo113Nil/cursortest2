package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: o.Jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251Jo extends FrameLayout {
    public final ArrayList h;
    public final ArrayList i;
    public View.OnApplyWindowInsetsListener j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251Jo(Context context, AttributeSet attributeSet, AbstractC0588Wo abstractC0588Wo) {
        super(context, attributeSet);
        AbstractC0048Bt.n(context, "context");
        AbstractC0048Bt.n(attributeSet, "attrs");
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820rL.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0069Co C = abstractC0588Wo.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC1888sN.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0432Qo G = abstractC0588Wo.G();
            context.getClassLoader();
            AbstractComponentCallbacksC0069Co a = G.a(classAttribute);
            AbstractC0048Bt.m(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.D = id;
            a.E = id;
            a.F = string;
            a.z = abstractC0588Wo;
            C0173Go c0173Go = abstractC0588Wo.v;
            a.A = c0173Go;
            a.K = true;
            if ((c0173Go == null ? null : c0173Go.r) != null) {
                a.K = true;
            }
            Q7 q7 = new Q7(abstractC0588Wo);
            q7.f88o = true;
            a.L = this;
            q7.e(getId(), a, string);
            if (q7.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            AbstractC0588Wo abstractC0588Wo2 = q7.p;
            if (abstractC0588Wo2.v != null && !abstractC0588Wo2.I) {
                abstractC0588Wo2.z(true);
                q7.a(abstractC0588Wo2.K, abstractC0588Wo2.L);
                abstractC0588Wo2.b = true;
                try {
                    abstractC0588Wo2.T(abstractC0588Wo2.K, abstractC0588Wo2.L);
                    abstractC0588Wo2.d();
                    abstractC0588Wo2.e0();
                    abstractC0588Wo2.v();
                    ((HashMap) abstractC0588Wo2.c.i).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    abstractC0588Wo2.d();
                    throw th;
                }
            }
        }
        Iterator it = abstractC0588Wo.c.t().iterator();
        while (it.hasNext()) {
            int i = ((C0995ep) it.next()).c.E;
            getId();
        }
    }

    public final void a(View view) {
        if (this.i.contains(view)) {
            this.h.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC0048Bt.n(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0069Co ? (AbstractComponentCallbacksC0069Co) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1142h10 c1142h10;
        AbstractC0048Bt.n(windowInsets, "insets");
        C1142h10 c = C1142h10.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.j;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0048Bt.m(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c1142h10 = C1142h10.c(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = AZ.a;
            WindowInsets b = c.b();
            if (b != null) {
                WindowInsets b2 = AbstractC1637oZ.b(this, b);
                if (!b2.equals(b)) {
                    c = C1142h10.c(b2, this);
                }
            }
            c1142h10 = c;
        }
        if (!c1142h10.a.l()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AZ.a;
                WindowInsets b3 = c1142h10.b();
                if (b3 != null) {
                    WindowInsets a = AbstractC1637oZ.a(childAt, b3);
                    if (!a.equals(b3)) {
                        C1142h10.c(a, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0048Bt.n(canvas, "canvas");
        if (this.k) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0048Bt.n(canvas, "canvas");
        AbstractC0048Bt.n(view, "child");
        if (this.k) {
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0048Bt.n(view, "view");
        this.i.remove(view);
        if (this.h.remove(view)) {
            this.k = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0069Co> F getFragment() {
        AbstractActivityC0199Ho abstractActivityC0199Ho;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co;
        AbstractC0588Wo supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0199Ho = null;
            if (view == null) {
                abstractComponentCallbacksC0069Co = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0069Co = tag instanceof AbstractComponentCallbacksC0069Co ? (AbstractComponentCallbacksC0069Co) tag : null;
            if (abstractComponentCallbacksC0069Co != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0069Co == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0199Ho) {
                    abstractActivityC0199Ho = (AbstractActivityC0199Ho) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0199Ho == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0199Ho.getSupportFragmentManager();
        } else {
            if (abstractComponentCallbacksC0069Co.A == null || !abstractComponentCallbacksC0069Co.r) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0069Co + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0069Co.c();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0048Bt.n(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0048Bt.m(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0048Bt.n(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC0048Bt.m(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0048Bt.n(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0048Bt.m(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0048Bt.m(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.k = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0048Bt.n(onApplyWindowInsetsListener, "listener");
        this.j = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0048Bt.n(view, "view");
        if (view.getParent() == this) {
            this.i.add(view);
        }
        super.startViewTransition(view);
    }
}
