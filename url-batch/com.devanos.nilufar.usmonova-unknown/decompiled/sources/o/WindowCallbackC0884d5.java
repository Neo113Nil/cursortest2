package o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: o.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowCallbackC0884d5 implements Window.Callback {
    public final Window.Callback h;
    public C0845cW i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ LayoutInflaterFactory2C1213i5 m;

    public WindowCallbackC0884d5(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, Window.Callback callback) {
        this.m = layoutInflaterFactory2C1213i5;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.h = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.j = true;
            callback.onContentChanged();
        } finally {
            this.j = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.h.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.h.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        L00.a(this.h, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.h.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        Window.Callback callback = this.h;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.m.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.h.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.m;
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            if (abstractC1075g1 == null || !abstractC1075g1.i(keyCode, keyEvent)) {
                C1147h5 c1147h5 = layoutInflaterFactory2C1213i5.T;
                if (c1147h5 == null || !layoutInflaterFactory2C1213i5.F(c1147h5, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C1213i5.T == null) {
                        C1147h5 y = layoutInflaterFactory2C1213i5.y(0);
                        layoutInflaterFactory2C1213i5.G(y, keyEvent);
                        boolean F = layoutInflaterFactory2C1213i5.F(y, keyEvent.getKeyCode(), keyEvent);
                        y.k = false;
                        if (F) {
                        }
                    }
                    return false;
                }
                C1147h5 c1147h52 = layoutInflaterFactory2C1213i5.T;
                if (c1147h52 != null) {
                    c1147h52.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.h.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.h.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.h.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.h.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.h.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.h.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.j) {
            this.h.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0825cC)) {
            return this.h.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C0845cW c0845cW = this.i;
        if (c0845cW != null) {
            View view = i == 0 ? new View(c0845cW.h.a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.h.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.h.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.m;
        if (i == 108) {
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            if (abstractC1075g1 != null) {
                abstractC1075g1.c(true);
            }
        } else {
            layoutInflaterFactory2C1213i5.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.l) {
            this.h.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.m;
        if (i == 108) {
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            if (abstractC1075g1 != null) {
                abstractC1075g1.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C1147h5 y = layoutInflaterFactory2C1213i5.y(i);
            if (y.m) {
                layoutInflaterFactory2C1213i5.r(y, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        M00.a(this.h, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0825cC menuC0825cC = menu instanceof MenuC0825cC ? (MenuC0825cC) menu : null;
        if (i == 0 && menuC0825cC == null) {
            return false;
        }
        if (menuC0825cC != null) {
            menuC0825cC.x = true;
        }
        C0845cW c0845cW = this.i;
        if (c0845cW != null && i == 0) {
            C0911dW c0911dW = c0845cW.h;
            if (!c0911dW.d) {
                c0911dW.a.l = true;
                c0911dW.d = true;
            }
        }
        boolean onPreparePanel = this.h.onPreparePanel(i, view, menu);
        if (menuC0825cC != null) {
            menuC0825cC.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0825cC menuC0825cC = this.m.y(0).h;
        if (menuC0825cC != null) {
            d(list, menuC0825cC, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return K00.a(this.h, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.h.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.h.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return K00.b(this.h, callback, i);
        }
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.m;
        C1334k c1334k = new C1334k(layoutInflaterFactory2C1213i5.r, callback);
        B1 l = layoutInflaterFactory2C1213i5.l(c1334k);
        if (l != null) {
            return c1334k.s(l);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.h.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
