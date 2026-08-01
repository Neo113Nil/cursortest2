package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vectorharbor.planetvectorsurvey.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class k extends ViewGroup {
    public WeakReference d;
    public IBinder e;
    public a31 f;
    public vh g;
    public c9 h;
    public boolean i;
    public boolean j;
    public boolean k;

    public k(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        i3 i3Var = new i3(2, this);
        addOnAttachStateChangeListener(i3Var);
        g8 g8Var = new g8(26);
        ch0.g(this).a.add(g8Var);
        this.h = new c9(this, i3Var, g8Var, 3);
    }

    private final void setParentContext(vh vhVar) {
        if (this.g != vhVar) {
            this.g = vhVar;
            if (vhVar != null) {
                this.d = null;
            }
            a31 a31Var = this.f;
            if (a31Var != null) {
                a31Var.h();
                this.f = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.e != iBinder) {
            this.e = iBinder;
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(ih ihVar, int i);

    public final void c() {
        if (this.j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        if (this.f == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.j = true;
                this.f = b31.a(this, g(), new eg(-656146368, true, new j(objArr == true ? 1 : 0, this)));
            } finally {
                this.j = false;
            }
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vh g() {
        wi0 wi0Var;
        rj rjVar;
        r5 r5Var;
        vh vhVar = this.g;
        if (vhVar == null) {
            vhVar = t21.b(this);
            if (vhVar == null) {
                Object parent = getParent();
                while (vhVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    vhVar = t21.b(view);
                    parent = view.getParent();
                }
            }
            if (vhVar != null) {
                vh vhVar2 = (!(vhVar instanceof wi0) || ((si0) ((wi0) vhVar).t.getValue()).compareTo(si0.e) > 0) ? vhVar : null;
                if (vhVar2 != null) {
                    this.d = new WeakReference(vhVar2);
                }
            } else {
                vhVar = null;
            }
            if (vhVar == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (vhVar = (vh) weakReference.get()) == null || ((vhVar instanceof wi0) && ((si0) ((wi0) vhVar).t.getValue()).compareTo(si0.e) <= 0)) {
                    vhVar = null;
                }
                if (vhVar == null) {
                    if (!isAttachedToWindow()) {
                        cy.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    vh b = t21.b(view2);
                    if (b == null) {
                        ((n21) o21.a.get()).getClass();
                        up upVar = up.d;
                        lu0 lu0Var = p5.p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            rjVar = (rj) p5.p.getValue();
                        } else {
                            rjVar = (rj) p5.q.get();
                            if (rjVar == null) {
                                g8.s("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        rj i = rjVar.i(upVar);
                        a60 a60Var = (a60) i.k(b2.D);
                        if (a60Var != null) {
                            r5 r5Var2 = new r5(a60Var);
                            w00 w00Var = (w00) r5Var2.f;
                            synchronized (w00Var.a) {
                                w00Var.d = false;
                                r5Var = r5Var2;
                            }
                        } else {
                            r5Var = 0;
                        }
                        gj0 gj0Var = new gj0();
                        rj rjVar2 = (b60) i.k(b2.E);
                        if (rjVar2 == null) {
                            rjVar2 = new c60();
                            gj0Var.d = rjVar2;
                        }
                        if (r5Var != 0) {
                            upVar = r5Var;
                        }
                        rj i2 = i.i(upVar).i(rjVar2);
                        wi0 wi0Var2 = new wi0(i2);
                        wi0Var2.E();
                        jj d = x40.d(i2);
                        o20 j = ze0.j(view2);
                        g20 lifecycle = j != null ? j.getLifecycle() : null;
                        if (lifecycle == null) {
                            cy.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new kf();
                        }
                        view2.addOnAttachStateChangeListener(new p21(view2, wi0Var2));
                        lifecycle.a(new r21(d, r5Var, wi0Var2, gj0Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, wi0Var2);
                        Handler handler = view2.getHandler();
                        int i3 = dw.a;
                        rj rjVar3 = new cw(handler, "windowRecomposer cleanup", false).i;
                        c cVar = new c(wi0Var2, view2, r1, 15);
                        ek ekVar = ek.g;
                        if ((2 & 1) != 0) {
                            rjVar3 = up.d;
                        }
                        if ((2 & 2) != 0) {
                            ekVar = ek.d;
                        }
                        rj s = a50.s(up.d, rjVar3, true);
                        gl glVar = vm.a;
                        if (s != glVar && s.k(b2.t) == null) {
                            s = s.i(glVar);
                        }
                        l v10Var = ekVar == ek.e ? new v10(s, cVar) : new ws0(s, true);
                        v10Var.d0(ekVar, v10Var, cVar);
                        view2.addOnAttachStateChangeListener(new i3(3, v10Var));
                        wi0Var = wi0Var2;
                    } else {
                        if (!(b instanceof wi0)) {
                            g8.s("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        wi0Var = (wi0) b;
                    }
                    r1 = ((si0) wi0Var.t.getValue()).compareTo(si0.e) > 0 ? wi0Var : null;
                    if (r1 != null) {
                        this.d = new WeakReference(r1);
                    }
                    return wi0Var;
                }
            }
        }
        return vhVar;
    }

    public final boolean getHasComposition() {
        return this.f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(vh vhVar) {
        setParentContext(vhVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.i = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((f3) ((dd0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.k = true;
    }

    public final void setViewCompositionStrategy(d01 d01Var) {
        c9 c9Var = this.h;
        if (c9Var != null) {
            c9Var.a();
        }
        ((ld0) d01Var).getClass();
        i3 i3Var = new i3(2, this);
        addOnAttachStateChangeListener(i3Var);
        g8 g8Var = new g8(26);
        ch0.g(this).a.add(g8Var);
        this.h = new c9(this, i3Var, g8Var, 3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
