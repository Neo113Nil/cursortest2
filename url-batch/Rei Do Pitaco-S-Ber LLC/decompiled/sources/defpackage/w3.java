package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w3 implements Window.Callback {
    public final Window.Callback f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ c4 j;

    public w3(c4 c4Var, Window.Callback callback) {
        this.j = c4Var;
        if (callback != null) {
            this.f = callback;
        } else {
            l8.l("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.g = true;
            callback.onContentChanged();
        } finally {
            this.g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        y90.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        Window.Callback callback = this.f;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.j.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        ss ssVar;
        boolean performShortcut;
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            c4 c4Var = this.j;
            c4Var.z();
            ca0 ca0Var = c4Var.s;
            if (ca0Var != null) {
                ba0 ba0Var = ca0Var.i;
                if (ba0Var == null || (ssVar = ba0Var.i) == null) {
                    performShortcut = false;
                } else {
                    ssVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = ssVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            b4 b4Var = c4Var.Q;
            if (b4Var == null || !c4Var.E(b4Var, keyEvent.getKeyCode(), keyEvent)) {
                if (c4Var.Q == null) {
                    b4 y = c4Var.y(0);
                    c4Var.F(y, keyEvent);
                    boolean E = c4Var.E(y, keyEvent.getKeyCode(), keyEvent);
                    y.k = false;
                }
                z = false;
                if (z) {
                    return false;
                }
            } else {
                b4 b4Var2 = c4Var.Q;
                if (b4Var2 != null) {
                    b4Var2.l = true;
                }
            }
            z = true;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.g) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ss)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            c4 c4Var = this.j;
            c4Var.z();
            ca0 ca0Var = c4Var.s;
            if (ca0Var != null) {
                ArrayList arrayList = ca0Var.m;
                if (true != ca0Var.l) {
                    ca0Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        l8.c();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.i) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        c4 c4Var = this.j;
        if (i != 108) {
            if (i == 0) {
                b4 y = c4Var.y(i);
                if (y.m) {
                    c4Var.r(y, false);
                    return;
                }
                return;
            }
            return;
        }
        c4Var.z();
        ca0 ca0Var = c4Var.s;
        if (ca0Var != null) {
            ArrayList arrayList = ca0Var.m;
            if (ca0Var.l) {
                ca0Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                l8.c();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        z90.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ss ssVar = menu instanceof ss ? (ss) menu : null;
        if (i == 0 && ssVar == null) {
            return false;
        }
        if (ssVar != null) {
            ssVar.x = true;
        }
        boolean onPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (ssVar != null) {
            ssVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ss ssVar = this.j.y(0).h;
        if (ssVar != null) {
            d(list, ssVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return x90.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        c4 c4Var = this.j;
        Context context = c4Var.p;
        if (i != 0) {
            return x90.b(this.f, callback, i);
        }
        oe oeVar = new oe();
        oeVar.g = context;
        oeVar.f = callback;
        oeVar.h = new ArrayList();
        oeVar.i = new e20(0);
        o1 o1Var = c4Var.y;
        if (o1Var != null) {
            o1Var.a();
        }
        o4 o4Var = new o4((LayoutInflater.Factory2) c4Var, (Object) oeVar, 4);
        c4Var.z();
        ca0 ca0Var = c4Var.s;
        int i2 = 1;
        if (ca0Var != null) {
            ba0 ba0Var = ca0Var.i;
            if (ba0Var != null) {
                ba0Var.a();
            }
            ca0Var.c.setHideOnContentScrollEnabled(false);
            ca0Var.f.e();
            ba0 ba0Var2 = new ba0(ca0Var, ca0Var.f.getContext(), o4Var);
            ss ssVar = ba0Var2.i;
            ssVar.w();
            try {
                if (((oe) ba0Var2.j.g).v(ba0Var2, ssVar)) {
                    ca0Var.i = ba0Var2;
                    ba0Var2.h();
                    ca0Var.f.c(ba0Var2);
                    ca0Var.a(true);
                } else {
                    ba0Var2 = null;
                }
                c4Var.y = ba0Var2;
            } finally {
                ssVar.v();
            }
        }
        if (c4Var.y == null) {
            v80 v80Var = c4Var.C;
            if (v80Var != null) {
                v80Var.b();
            }
            o1 o1Var2 = c4Var.y;
            if (o1Var2 != null) {
                o1Var2.a();
            }
            if (c4Var.z == null) {
                if (c4Var.M) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        dd ddVar = new dd(context, 0);
                        ddVar.getTheme().setTo(newTheme);
                        context = ddVar;
                    }
                    c4Var.z = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    c4Var.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    c4Var.A.setContentView(c4Var.z);
                    c4Var.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    c4Var.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    c4Var.A.setHeight(-2);
                    c4Var.B = new p3(c4Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) c4Var.E.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        c4Var.z();
                        ca0 ca0Var2 = c4Var.s;
                        Context b = ca0Var2 != null ? ca0Var2.b() : null;
                        if (b != null) {
                            context = b;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        c4Var.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (c4Var.z != null) {
                v80 v80Var2 = c4Var.C;
                if (v80Var2 != null) {
                    v80Var2.b();
                }
                c4Var.z.e();
                Context context2 = c4Var.z.getContext();
                ActionBarContextView actionBarContextView = c4Var.z;
                b30 b30Var = new b30();
                b30Var.h = context2;
                b30Var.i = actionBarContextView;
                b30Var.j = o4Var;
                ss ssVar2 = new ss(actionBarContextView.getContext());
                ssVar2.l = 1;
                b30Var.m = ssVar2;
                ssVar2.e = b30Var;
                if (((oe) o4Var.g).v(b30Var, ssVar2)) {
                    b30Var.h();
                    c4Var.z.c(b30Var);
                    c4Var.y = b30Var;
                    boolean z = c4Var.D && (viewGroup = c4Var.E) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = c4Var.z;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        v80 a = f80.a(c4Var.z);
                        a.a(1.0f);
                        c4Var.C = a;
                        a.d(new r3(i2, c4Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        c4Var.z.setVisibility(0);
                        if (c4Var.z.getParent() instanceof View) {
                            View view = (View) c4Var.z.getParent();
                            WeakHashMap weakHashMap = f80.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (c4Var.A != null) {
                        c4Var.q.getDecorView().post(c4Var.B);
                    }
                } else {
                    c4Var.y = null;
                }
            }
            c4Var.H();
            c4Var.y = c4Var.y;
        }
        c4Var.H();
        o1 o1Var3 = c4Var.y;
        if (o1Var3 != null) {
            return oeVar.k(o1Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
