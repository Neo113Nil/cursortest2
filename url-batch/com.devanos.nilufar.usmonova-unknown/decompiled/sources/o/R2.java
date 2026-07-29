package o;

import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class R2 implements Runnable {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ R2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        LU c;
        long j;
        switch (this.h) {
            case 0:
                S2 s2 = (S2) this.i;
                s2.removeCallbacks(this);
                MotionEvent motionEvent = s2.s0;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    S2 s22 = (S2) this.i;
                    s22.F(motionEvent, i, s22.t0, false);
                    return;
                }
                return;
            case 1:
                ViewOnTouchListenerC1875sA viewOnTouchListenerC1875sA = (ViewOnTouchListenerC1875sA) this.i;
                C1713pj c1713pj = viewOnTouchListenerC1875sA.j;
                C1609o7 c1609o7 = viewOnTouchListenerC1875sA.h;
                if (viewOnTouchListenerC1875sA.v) {
                    if (viewOnTouchListenerC1875sA.t) {
                        viewOnTouchListenerC1875sA.t = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c1609o7.e = currentAnimationTimeMillis;
                        c1609o7.g = -1L;
                        c1609o7.f = currentAnimationTimeMillis;
                        c1609o7.h = 0.5f;
                    }
                    if ((c1609o7.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1609o7.g + c1609o7.i) || !viewOnTouchListenerC1875sA.e()) {
                        viewOnTouchListenerC1875sA.v = false;
                        return;
                    }
                    if (viewOnTouchListenerC1875sA.u) {
                        viewOnTouchListenerC1875sA.u = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        c1713pj.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c1609o7.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = c1609o7.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - c1609o7.f;
                    c1609o7.f = currentAnimationTimeMillis2;
                    viewOnTouchListenerC1875sA.x.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * c1609o7.d));
                    WeakHashMap weakHashMap = AZ.a;
                    c1713pj.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi = (DialogInterfaceOnCancelListenerC2107vi) this.i;
                dialogInterfaceOnCancelListenerC2107vi.a0.onDismiss(dialogInterfaceOnCancelListenerC2107vi.i0);
                return;
            case 3:
                C1713pj c1713pj2 = (C1713pj) this.i;
                c1713pj2.s = null;
                c1713pj2.drawableStateChanged();
                return;
            case 4:
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = (AbstractComponentCallbacksC0069Co) this.i;
                if (abstractComponentCallbacksC0069Co.O != null) {
                    abstractComponentCallbacksC0069Co.b().getClass();
                    return;
                }
                return;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((AbstractC0588Wo) this.i).A(true);
                return;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.i;
                if (searchView$SearchAutoComplete.m) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.m = false;
                    return;
                }
                return;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                ((Toolbar) this.i).u();
                return;
            case 9:
                C0911dW c0911dW = (C0911dW) this.i;
                Window.Callback callback = c0911dW.b;
                Menu p = c0911dW.p();
                MenuC0825cC menuC0825cC = p instanceof MenuC0825cC ? (MenuC0825cC) p : null;
                if (menuC0825cC != null) {
                    menuC0825cC.w();
                }
                try {
                    p.clear();
                    if (callback.onCreatePanelMenu(0, p)) {
                        if (!callback.onPreparePanel(0, null, p)) {
                        }
                        if (menuC0825cC == null) {
                            menuC0825cC.v();
                            return;
                        }
                        return;
                    }
                    p.clear();
                    if (menuC0825cC == null) {
                    }
                } catch (Throwable th) {
                    if (menuC0825cC != null) {
                        menuC0825cC.v();
                    }
                    throw th;
                }
            case 10:
                ((C1274j20) this.i).h();
                return;
            case 11:
                D4 d4 = ((C1274j20) ((C1818rJ) this.i).i).b;
                d4.d(d4.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 12:
                throw null;
            case 13:
                E00 e00 = (E00) this.i;
                synchronized (e00.a) {
                    try {
                        if (e00.b()) {
                            Log.e("WakeLock", String.valueOf(e00.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            e00.d();
                            if (e00.b()) {
                                e00.c = 1;
                                e00.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 14:
                if (((NU) this.i).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                synchronized (((Y20) this.i).j) {
                    ((InterfaceC0698aG) ((Y20) this.i).k).b();
                }
                return;
        }
        while (true) {
            RU ru = (RU) this.i;
            synchronized (ru) {
                c = ru.c();
            }
            if (c == null) {
                return;
            }
            QU qu = c.c;
            AbstractC0048Bt.k(qu);
            RU ru2 = (RU) this.i;
            boolean isLoggable = RU.j.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                ZM.a(c, qu, "starting");
            } else {
                j = -1;
            }
            try {
                RU.a(ru2, c);
                if (isLoggable) {
                    ZM.a(c, qu, "finished run in ".concat(ZM.f(System.nanoTime() - j)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) ru2.a.i).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        ZM.a(c, qu, "failed a run in ".concat(ZM.f(System.nanoTime() - j)));
                    }
                    throw th3;
                }
            }
        }
    }

    public R2(AbstractDialogInterfaceOnCancelListenerC1078g20 abstractDialogInterfaceOnCancelListenerC1078g20, C1143h2 c1143h2) {
        this.h = 12;
        this.i = c1143h2;
    }
}
