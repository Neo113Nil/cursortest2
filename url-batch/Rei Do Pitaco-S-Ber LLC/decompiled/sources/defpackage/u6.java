package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u6 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u6(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k40 c;
        long j;
        k1 k1Var;
        switch (this.f) {
            case 0:
                kq kqVar = (kq) this.g;
                bg bgVar = kqVar.h;
                t6 t6Var = kqVar.f;
                if (kqVar.t) {
                    if (kqVar.r) {
                        kqVar.r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        t6Var.e = currentAnimationTimeMillis;
                        t6Var.g = -1L;
                        t6Var.f = currentAnimationTimeMillis;
                        t6Var.h = 0.5f;
                    }
                    if ((t6Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > t6Var.g + t6Var.i) || !kqVar.e()) {
                        kqVar.t = false;
                        return;
                    }
                    if (kqVar.s) {
                        kqVar.s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        bgVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (t6Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = t6Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - t6Var.f;
                    t6Var.f = currentAnimationTimeMillis2;
                    kqVar.v.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * t6Var.d));
                    WeakHashMap weakHashMap = f80.a;
                    bgVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                f8 f8Var = (f8) this.g;
                f8Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) f8Var.e;
                h80 h80Var = bottomSheetBehavior.Q;
                if (h80Var != null && h80Var.f()) {
                    f8Var.a(f8Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.F(f8Var.b);
                        return;
                    }
                    return;
                }
            case 2:
                ne neVar = (ne) this.g;
                neVar.b.endViewTransition(neVar.c);
                neVar.d.d();
                return;
            case 3:
                jf jfVar = (jf) this.g;
                jfVar.Z.onDismiss(jfVar.h0);
                return;
            case 4:
                bg bgVar2 = (bg) this.g;
                bgVar2.q = null;
                bgVar2.drawableStateChanged();
                return;
            case 5:
                ti tiVar = (ti) this.g;
                ValueAnimator valueAnimator = tiVar.z;
                int i = tiVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                tiVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 6:
                ((sk) this.g).y(true);
                return;
            case 7:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.g;
                if (searchView$SearchAutoComplete.k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.k = false;
                    return;
                }
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.g).D0();
                return;
            case 9:
                break;
            case 10:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.g).h.l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.g).f;
                if (actionMenuView == null || (k1Var = actionMenuView.y) == null) {
                    return;
                }
                k1Var.n();
                return;
            default:
                ((h80) this.g).m(0);
                return;
        }
        while (true) {
            m40 m40Var = (m40) this.g;
            synchronized (m40Var) {
                c = m40Var.c();
            }
            if (c == null) {
                return;
            }
            l40 l40Var = c.c;
            l40Var.getClass();
            m40 m40Var2 = (m40) this.g;
            boolean isLoggable = m40.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                g8.b(c, l40Var, "starting");
            } else {
                j = -1;
            }
            try {
                m40.a(m40Var2, c);
                if (isLoggable) {
                    g8.b(c, l40Var, "finished run in ".concat(g8.y(System.nanoTime() - j)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) m40Var2.a.f).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        g8.b(c, l40Var, "failed a run in ".concat(g8.y(System.nanoTime() - j)));
                    }
                    throw th2;
                }
            }
        }
    }
}
