package androidx.fragment.app;

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
import com.ionia.reidopitaco.libya.R;
import defpackage.al;
import defpackage.b3;
import defpackage.db0;
import defpackage.dk;
import defpackage.f80;
import defpackage.fk;
import defpackage.hx;
import defpackage.l8;
import defpackage.nk;
import defpackage.sk;
import defpackage.w6;
import defpackage.zk;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, sk skVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hx.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        dk A = skVar.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                l8.h(classAttribute, string != null ? " with tag ".concat(string) : "", "FragmentContainerView must have an android:id to add Fragment ");
                throw null;
            }
            nk D = skVar.D();
            context.getClassLoader();
            dk a = D.a(classAttribute);
            a.getClass();
            a.H = true;
            fk fkVar = a.x;
            if ((fkVar == null ? null : fkVar.u) != null) {
                a.H = true;
            }
            w6 w6Var = new w6(skVar);
            w6Var.o = true;
            a.I = this;
            int id2 = getId();
            String str = a.P;
            if (str != null) {
                zk.c(a, str);
            }
            Class<?> cls = a.getClass();
            int modifiers = cls.getModifiers();
            if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
            if (string != null) {
                String str2 = a.C;
                if (str2 != null && !string.equals(str2)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(a);
                    String str3 = a.C;
                    sb.append(": was ");
                    sb.append(str3);
                    sb.append(" now ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                a.C = string;
            }
            if (id2 != 0) {
                if (id2 == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + a + " with tag " + string + " to container view with no id");
                }
                int i2 = a.A;
                if (i2 != 0 && i2 != id2) {
                    StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                    sb2.append(a);
                    int i3 = a.A;
                    sb2.append(": was ");
                    sb2.append(i3);
                    sb2.append(" now ");
                    sb2.append(id2);
                    throw new IllegalStateException(sb2.toString());
                }
                a.A = id2;
                a.B = id2;
            }
            w6Var.b(new al(1, a));
            sk skVar2 = w6Var.p;
            a.w = skVar2;
            if (w6Var.g) {
                l8.u("This transaction is already being added to the back stack");
                throw null;
            }
            if (skVar2.t != null && !skVar2.G) {
                skVar2.x(true);
                w6Var.a(skVar2.I, skVar2.J);
                skVar2.b = true;
                try {
                    skVar2.R(skVar2.I, skVar2.J);
                    skVar2.d();
                    skVar2.c0();
                    skVar2.u();
                    ((HashMap) skVar2.c.g).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    skVar2.d();
                    throw th;
                }
            }
        }
        ArrayList l = skVar.c.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            a aVar = (a) obj;
            dk dkVar = aVar.c;
            if (dkVar.B == getId() && (view = dkVar.J) != null && view.getParent() == null) {
                dkVar.I = this;
                aVar.b();
            }
        }
    }

    public final void a(View view) {
        if (this.g.contains(view)) {
            this.f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof dk ? (dk) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            l8.s(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        db0 db0Var;
        windowInsets.getClass();
        db0 g = db0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            db0Var = db0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = f80.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = db0.g(this, f);
            }
            db0Var = g;
        }
        if (!db0Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                f80.b(getChildAt(i), db0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.i) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.i) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.g.remove(view);
        if (this.f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends dk> F getFragment() {
        dk dkVar;
        b3 b3Var;
        sk skVar;
        View view = this;
        while (true) {
            if (view == null) {
                dkVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            dkVar = tag instanceof dk ? (dk) tag : null;
            if (dkVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (dkVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    b3Var = null;
                    break;
                }
                if (context instanceof b3) {
                    b3Var = (b3) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (b3Var == null) {
                l8.h(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            skVar = ((fk) b3Var.z.g).x;
        } else {
            if (dkVar.x == null || !dkVar.p) {
                throw new IllegalStateException("The Fragment " + dkVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            skVar = dkVar.g();
        }
        return (F) skVar.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
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
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hx.b, 0, 0);
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
}
