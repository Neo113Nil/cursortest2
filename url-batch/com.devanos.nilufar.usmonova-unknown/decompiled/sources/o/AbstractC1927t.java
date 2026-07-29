package o;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.devanos.nilufar.usmonova.R;
import java.lang.ref.WeakReference;

/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1927t extends ViewGroup {
    public WeakReference h;
    public IBinder i;
    public S10 j;
    public AbstractC1838rd k;
    public V7 l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f223o;

    private final void setParentContext(AbstractC1838rd abstractC1838rd) {
        if (this.k != abstractC1838rd) {
            this.k = abstractC1838rd;
            if (abstractC1838rd != null) {
                this.h = null;
            }
            S10 s10 = this.j;
            if (s10 != null) {
                s10.a();
                this.j = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.i != iBinder) {
            this.i = iBinder;
            this.h = null;
        }
    }

    public abstract void a(InterfaceC1377kd interfaceC1377kd, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.n) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.j == null) {
            try {
                this.n = true;
                this.j = Y10.a(this, d(), new C0721ad(-656146368, true, new C1861s(0, this)));
            } finally {
                this.n = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC1838rd d() {
        C0901dM c0901dM;
        InterfaceC0189He interfaceC0189He;
        P3 p3;
        AbstractC1838rd abstractC1838rd = this.k;
        if (abstractC1838rd == null) {
            abstractC1838rd = AbstractC2327z10.b(this);
            if (abstractC1838rd == null) {
                for (ViewParent parent = getParent(); abstractC1838rd == null && (parent instanceof View); parent = parent.getParent()) {
                    abstractC1838rd = AbstractC2327z10.b((View) parent);
                }
            }
            if (abstractC1838rd != null) {
                AbstractC1838rd abstractC1838rd2 = (!(abstractC1838rd instanceof C0901dM) || ((XL) ((C0901dM) abstractC1838rd).r.getValue()).compareTo(XL.i) > 0) ? abstractC1838rd : null;
                if (abstractC1838rd2 != null) {
                    this.h = new WeakReference(abstractC1838rd2);
                }
            } else {
                abstractC1838rd = null;
            }
            if (abstractC1838rd == null) {
                WeakReference weakReference = this.h;
                if (weakReference == null || (abstractC1838rd = (AbstractC1838rd) weakReference.get()) == null || ((abstractC1838rd instanceof C0901dM) && ((XL) ((C0901dM) abstractC1838rd).r.getValue()).compareTo(XL.i) <= 0)) {
                    abstractC1838rd = null;
                }
                if (abstractC1838rd == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC0868ct.W("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC1838rd b = AbstractC2327z10.b(view);
                    if (b == null) {
                        ((C1799r10) AbstractC1931t10.a.get()).getClass();
                        C1188hk c1188hk = C1188hk.h;
                        BU bu = N3.t;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC0189He = (InterfaceC0189He) N3.t.getValue();
                        } else {
                            interfaceC0189He = (InterfaceC0189He) N3.u.get();
                            if (interfaceC0189He == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC0189He D = interfaceC0189He.D(c1188hk);
                        InterfaceC0957eD interfaceC0957eD = (InterfaceC0957eD) D.k(HO.E);
                        if (interfaceC0957eD != null) {
                            P3 p32 = new P3(interfaceC0957eD);
                            C1662oy c1662oy = (C1662oy) p32.j;
                            synchronized (c1662oy.a) {
                                c1662oy.d = false;
                                p3 = p32;
                            }
                        } else {
                            p3 = 0;
                        }
                        C1360kM c1360kM = new C1360kM();
                        C1023fD c1023fD = (C1023fD) D.k(C0460Rq.O);
                        if (c1023fD == null) {
                            c1023fD = new C1023fD();
                            c1360kM.h = c1023fD;
                        }
                        if (p3 != 0) {
                            c1188hk = p3;
                        }
                        InterfaceC0189He D2 = D.D(c1188hk).D(c1023fD);
                        c0901dM = new C0901dM(D2);
                        synchronized (c0901dM.b) {
                            c0901dM.q = true;
                        }
                        C2103ve c = AbstractC1052fg.c(D2);
                        InterfaceC0365Nz g = ON.g(view);
                        AbstractC0106Dz lifecycle = g != null ? g.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC0868ct.X("ViewTreeLifecycleOwner not found from " + view);
                            throw null;
                        }
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2222xR(view, c0901dM));
                        lifecycle.a(new C2195x10(c, p3, c0901dM, c1360kM, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c0901dM);
                        Handler handler = view.getHandler();
                        int i = AbstractC1391kr.a;
                        InterfaceC0189He interfaceC0189He2 = new C1325jr(handler, "windowRecomposer cleanup", false).m;
                        C1865s10 c1865s10 = new C1865s10(c0901dM, view, null);
                        if ((2 & 1) != 0) {
                            interfaceC0189He2 = C1188hk.h;
                        }
                        EnumC0500Te enumC0500Te = (2 & 2) != 0 ? EnumC0500Te.h : null;
                        InterfaceC0189He t = AbstractC0946e20.t(C1188hk.h, interfaceC0189He2, true);
                        C0191Hg c0191Hg = AbstractC0115Ei.a;
                        if (t != c0191Hg && t.k(C0460Rq.w) == null) {
                            t = t.D(c0191Hg);
                        }
                        AbstractC1993u c1597nz = enumC0500Te == EnumC0500Te.i ? new C1597nz(t, c1865s10) : new C0908dT(t, true);
                        c1597nz.c0(enumC0500Te, c1597nz, c1865s10);
                        view.addOnAttachStateChangeListener(new W2(4, c1597nz));
                    } else {
                        if (!(b instanceof C0901dM)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c0901dM = (C0901dM) b;
                    }
                    C0901dM c0901dM2 = ((XL) c0901dM.r.getValue()).compareTo(XL.i) > 0 ? c0901dM : null;
                    if (c0901dM2 != null) {
                        this.h = new WeakReference(c0901dM2);
                    }
                    return c0901dM;
                }
            }
        }
        return abstractC1838rd;
    }

    public final boolean getHasComposition() {
        return this.j != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f223o || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(AbstractC1838rd abstractC1838rd) {
        setParentContext(abstractC1838rd);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.m = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((S2) ((ZG) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f223o = true;
    }

    public final void setViewCompositionStrategy(EZ ez) {
        V7 v7 = this.l;
        if (v7 != null) {
            v7.invoke();
        }
        ((ZM) ez).getClass();
        W2 w2 = new W2(3, this);
        addOnAttachStateChangeListener(w2);
        C1574nc c1574nc = new C1574nc(20);
        AbstractC0946e20.w(this).a.add(c1574nc);
        this.l = new V7(this, w2, c1574nc, 8);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
