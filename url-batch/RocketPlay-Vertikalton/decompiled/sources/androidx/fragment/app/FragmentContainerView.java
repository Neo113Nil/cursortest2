package androidx.fragment.app;

import K.F;
import K.T;
import K.z0;
import X.a;
import Y.AbstractComponentCallbacksC0055q;
import Y.C;
import Y.C0039a;
import Y.C0058u;
import Y.I;
import Y.O;
import Y.P;
import Z.d;
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
import com.luckycounter.drinkwater.R;
import g.AbstractActivityC0129i;
import i1.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1863b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1864c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        f.e(context, "context");
        this.f1862a = new ArrayList();
        this.f1863b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1288b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1863b.contains(view)) {
            this.f1862a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0055q ? (AbstractComponentCallbacksC0055q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        z0 z0Var;
        f.e(windowInsets, "insets");
        z0 g2 = z0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1864c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            f.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            z0Var = z0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = T.f633a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = F.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = z0.g(this, b2);
                }
            }
            z0Var = g2;
        }
        if (!z0Var.f729a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = T.f633a;
                WindowInsets f3 = z0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = F.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        z0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        if (this.d) {
            Iterator it = this.f1862a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        f.e(canvas, "canvas");
        f.e(view, "child");
        if (this.d) {
            ArrayList arrayList = this.f1862a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        f.e(view, "view");
        this.f1863b.remove(view);
        if (this.f1862a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0055q> F getFragment() {
        AbstractActivityC0129i abstractActivityC0129i;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q;
        I i;
        View view = this;
        while (true) {
            abstractActivityC0129i = null;
            if (view == null) {
                abstractComponentCallbacksC0055q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0055q = tag instanceof AbstractComponentCallbacksC0055q ? (AbstractComponentCallbacksC0055q) tag : null;
            if (abstractComponentCallbacksC0055q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0055q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0129i) {
                    abstractActivityC0129i = (AbstractActivityC0129i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0129i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i = ((C0058u) abstractActivityC0129i.f2674s.f38b).d;
        } else {
            if (!abstractComponentCallbacksC0055q.m()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0055q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i = abstractComponentCallbacksC0055q.g();
        }
        return (F) i.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f.e(windowInsets, "insets");
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
                f.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        f.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        f.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        f.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f.e(onApplyWindowInsetsListener, "listener");
        this.f1864c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        f.e(view, "view");
        if (view.getParent() == this) {
            this.f1863b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, I i) {
        super(context, attributeSet);
        View view;
        f.e(context, "context");
        f.e(attributeSet, "attrs");
        f.e(i, "fm");
        this.f1862a = new ArrayList();
        this.f1863b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1288b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0055q A2 = i.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C C2 = i.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0055q a2 = C2.a(classAttribute);
            f.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1484C = true;
            C0058u c0058u = a2.f1514s;
            if ((c0058u == null ? null : c0058u.f1528a) != null) {
                a2.f1484C = true;
            }
            C0039a c0039a = new C0039a(i);
            c0039a.f1422o = true;
            a2.f1485D = this;
            int id2 = getId();
            String str = a2.f1491K;
            if (str != null) {
                d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1519x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1519x + " now " + string);
                    }
                    a2.f1519x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i2 = a2.f1517v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1517v + " now " + id2);
                    }
                    a2.f1517v = id2;
                    a2.f1518w = id2;
                }
                c0039a.b(new P(1, a2));
                I i3 = c0039a.f1423p;
                a2.f1513r = i3;
                if (!c0039a.f1416g) {
                    if (i3.f1358t != null && !i3.f1335G) {
                        i3.x(true);
                        c0039a.a(i3.f1337I, i3.f1338J);
                        i3.f1343b = true;
                        try {
                            i3.P(i3.f1337I, i3.f1338J);
                            i3.d();
                            i3.a0();
                            i3.u();
                            ((HashMap) i3.f1344c.f1208b).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            i3.d();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        Iterator it = i.f1344c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
            if (abstractComponentCallbacksC0055q.f1518w == getId() && (view = abstractComponentCallbacksC0055q.f1486E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0055q.f1485D = this;
                o2.b();
            }
        }
    }
}
