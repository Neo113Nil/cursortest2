package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public abstract class hl3 {
    public static final tl3 a = new tl3();

    public static final float b(int i, float f) {
        return ((i + 0.0f) / f) + 0.5f;
    }

    public static final int b(Context context) {
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int c(Context context) {
        Object m8023constructorimpl;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a2 = vw2Var2.a(context);
        if (a2 == null || !a2.G0) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 30) {
                Object systemService = context.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                i = bounds.height();
            } else {
                i = context.getResources().getDisplayMetrics().heightPixels;
            }
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(i));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = valueOf;
        }
        return ((Number) m8023constructorimpl).intValue();
    }

    public static final int d(Context context) {
        return (int) b(e(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int e(Context context) {
        Object m8023constructorimpl;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a2 = vw2Var2.a(context);
        if (a2 == null || !a2.G0) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 30) {
                Object systemService = context.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                i = bounds.width();
            } else {
                i = context.getResources().getDisplayMetrics().widthPixels;
            }
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(i));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels);
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = valueOf;
        }
        return ((Number) m8023constructorimpl).intValue();
    }

    public static final boolean b(View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static final int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(int i, float f) {
        return Color.argb(RangesKt.coerceAtLeast(0, RangesKt.coerceAtMost(255, (int) ((255 * (100 - f)) / 100.0f))), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int a(View view) {
        int i;
        if (view == null || !view.isShown() || (i = a.a(view).a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i * 100) / (height * width);
    }

    public static final boolean c(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }
}
