package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.UUID;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class om extends Dialog implements o20, fb0, g90, ln0 {
    public q20 d;
    public final jn0 e;
    public final lu0 f;
    public final lu0 g;
    public bu h;
    public mm i;
    public final View j;
    public final jm k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(bu buVar, mm mmVar, View view, c10 c10Var, sl slVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), mmVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.e = new jn0(new kn0(this, new ab0(5, this)));
        this.f = new lu0(new bu(this) { // from class: bg
            public final /* synthetic */ om e;

            {
                this.e = this;
            }

            @Override // defpackage.bu
            public final Object a() {
                int i2 = i;
                om omVar = this.e;
                switch (i2) {
                    case 0:
                        pm pmVar = new pm();
                        omVar.getNavigationEventDispatcher().b(pmVar);
                        return pmVar;
                    default:
                        return new eb0(new w2(4, omVar));
                }
            }
        });
        final int i2 = 1;
        this.g = new lu0(new bu(this) { // from class: bg
            public final /* synthetic */ om e;

            {
                this.e = this;
            }

            @Override // defpackage.bu
            public final Object a() {
                int i22 = i2;
                om omVar = this.e;
                switch (i22) {
                    case 0:
                        pm pmVar = new pm();
                        omVar.getNavigationEventDispatcher().b(pmVar);
                        return pmVar;
                    default:
                        return new eb0(new w2(4, omVar));
                }
            }
        });
        this.h = buVar;
        this.i = mmVar;
        this.j = view;
        Window window = getWindow();
        if (window == null) {
            g8.s("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        yc0.o(window, this.i.e);
        window.setGravity(17);
        if (!this.i.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                o7.a.a(attributes);
            }
            if (i3 >= 30) {
                p7 p7Var = p7.a;
                p7Var.a(attributes, 0);
                p7Var.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        jm jmVar = new jm(getContext(), window);
        setTitle(this.i.f);
        jmVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        jmVar.setClipChildren(false);
        jmVar.setElevation(slVar.o(8.0f));
        jmVar.setOutlineProvider(new nm(0));
        this.k = jmVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(jmVar);
        jmVar.setTag(R.id.view_tree_lifecycle_owner, ze0.j(view));
        jmVar.setTag(R.id.view_tree_view_model_store_owner, ch0.f(view));
        jmVar.setTag(R.id.view_tree_saved_state_registry_owner, rg0.k(view));
        e(this.h, this.i, c10Var);
        eb0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        h4 h4Var = new h4(this, i2);
        onBackPressedDispatcher.getClass();
        z8 z8Var = new z8(h4Var);
        q20 c = c();
        if (c.c == f20.d) {
            return;
        }
        ya0 ya0Var = new ya0(z8Var, new za0(z8Var, this));
        z8Var.a.add(ya0Var);
        ya0Var.g(false);
        f90.a(onBackPressedDispatcher.a(), ya0Var);
        db0 db0Var = new db0(ya0Var, onBackPressedDispatcher, c);
        c.a(db0Var);
        z8Var.c.add(db0Var);
    }

    public static void a(om omVar) {
        super.onBackPressed();
    }

    public static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof jm) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final q20 c() {
        q20 q20Var = this.d;
        if (q20Var != null) {
            return q20Var;
        }
        q20 q20Var2 = new q20(this, true);
        this.d = q20Var2;
        return q20Var2;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void e(bu buVar, mm mmVar, c10 c10Var) {
        int i;
        this.h = buVar;
        this.i = mmVar;
        ap0 ap0Var = mmVar.c;
        int i2 = h5.a;
        ViewGroup.LayoutParams layoutParams = this.j.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = ap0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2) {
                    g8.c();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal2 = c10Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                g8.c();
                return;
            }
            i = 1;
        }
        jm jmVar = this.k;
        jmVar.setLayoutDirection(i);
        boolean z2 = mmVar.e;
        boolean z3 = mmVar.d;
        Window window2 = jmVar.l;
        boolean z4 = (jmVar.p && z3 == jmVar.n && z2 == jmVar.o) ? false : true;
        jmVar.n = z3;
        jmVar.o = z2;
        if (z4) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z3 ? -2 : -1;
            if (i3 != attributes.width || !jmVar.p) {
                window2.setLayout(i3, -2);
                jmVar.p = true;
            }
        }
        setCanceledOnTouchOutside(mmVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z2 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // defpackage.o20
    public final g20 getLifecycle() {
        return c();
    }

    @Override // defpackage.g90
    public final f90 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().a();
    }

    @Override // defpackage.fb0
    public final eb0 getOnBackPressedDispatcher() {
        return (eb0) this.g.getValue();
    }

    @Override // defpackage.ln0
    public final in0 getSavedStateRegistry() {
        return this.e.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((pm) this.f.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            eb0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.b(onBackInvokedDispatcher);
        }
        this.e.a(bundle);
        c().e(e20.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.i.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.h.a();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.e.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(e20.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        c().e(e20.ON_DESTROY);
        this.d = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.i.b) {
            jm jmVar = this.k;
            jmVar.getClass();
            float x = motionEvent.getX();
            if (!Float.isInfinite(x) && !Float.isNaN(x)) {
                float y = motionEvent.getY();
                if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = jmVar.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + jmVar.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + jmVar.getTop();
                    int height = childAt.getHeight() + top;
                    int H = a50.H(motionEvent.getX());
                    if (left <= H) {
                        if (H <= width) {
                            int H2 = a50.H(motionEvent.getY());
                            if (top <= H2) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.l = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.l = false;
                    return onTouchEvent;
                }
            } else if (this.l) {
                this.h.a();
                this.l = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.l = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
