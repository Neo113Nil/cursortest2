package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import androidx.lifecycle.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.MainActivity;
import com.ionia.reidopitaco.libya.MainActivity2;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x032a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        long j;
        int i;
        boolean z;
        int i2 = this.f;
        boolean z2 = false;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = s1.g;
                Method method = s1.f;
                ?? r4 = Build.VERSION.SDK_INT;
                if (r4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((r4 != 26 && r4 != 27) || method != null) && (s1.e != null || s1.d != null)) {
                    try {
                        Object obj3 = s1.c.get(activity);
                        if (obj3 != null && (obj = s1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            r1 r1Var = new r1(activity);
                            application.registerActivityLifecycleCallbacks(r1Var);
                            handler.post(new g1(r1Var, obj3, 1));
                            r1 r1Var2 = (r4 == 26 || r4 == 27) ? 1 : null;
                            try {
                                if (r1Var2 != null) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = application;
                                        r1Var2 = r1Var;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        r1Var2 = r1Var;
                                        handler.post(new g1(application2, r1Var2, 2));
                                        throw th;
                                    }
                                } else {
                                    r4 = application;
                                    r1Var2 = r1Var;
                                    activity.recreate();
                                }
                                handler.post(new g1((Object) r4, r1Var2, 2));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                x2 x2Var = (x2) ((x2) obj2).c.g;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = x2Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    v20 v20Var = (v20) arrayList.get(i3);
                    if (v20Var != null) {
                        e20 e20Var = x2Var.a;
                        Long l = (Long) e20Var.get(v20Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                e20Var.remove(v20Var);
                            }
                        }
                        long j2 = v20Var.f;
                        if (j2 == 0) {
                            v20Var.f = uptimeMillis;
                            v20Var.c(v20Var.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            v20Var.f = uptimeMillis;
                            float f = v20.b().g;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            boolean z3 = v20Var.l;
                            float f2 = v20Var.k;
                            if (z3) {
                                if (f2 != Float.MAX_VALUE) {
                                    j = uptimeMillis;
                                    v20Var.j.i = f2;
                                    v20Var.k = Float.MAX_VALUE;
                                } else {
                                    j = uptimeMillis;
                                }
                                v20Var.b = (float) v20Var.j.i;
                                v20Var.a = 0.0f;
                                v20Var.l = z2;
                                i = i3;
                            } else {
                                j = uptimeMillis;
                                w20 w20Var = v20Var.j;
                                float f3 = v20Var.b;
                                float f4 = v20Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    i = i3;
                                    long j5 = j4 / 2;
                                    jg a = w20Var.a(f3, f4, j5);
                                    w20 w20Var2 = v20Var.j;
                                    w20Var2.i = v20Var.k;
                                    v20Var.k = Float.MAX_VALUE;
                                    jg a2 = w20Var2.a(a.a, a.b, j5);
                                    v20Var.b = a2.a;
                                    v20Var.a = a2.b;
                                } else {
                                    i = i3;
                                    jg a3 = w20Var.a(f3, f4, j4);
                                    v20Var.b = a3.a;
                                    v20Var.a = a3.b;
                                }
                                float max = Math.max(v20Var.b, -3.4028235E38f);
                                v20Var.b = max;
                                v20Var.b = Math.min(max, Float.MAX_VALUE);
                                float f5 = v20Var.a;
                                w20 w20Var3 = v20Var.j;
                                w20Var3.getClass();
                                if (Math.abs(f5) >= w20Var3.e || Math.abs(r2 - ((float) w20Var3.i)) >= w20Var3.d) {
                                    z = false;
                                    float min = Math.min(v20Var.b, Float.MAX_VALUE);
                                    v20Var.b = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    v20Var.b = max2;
                                    v20Var.c(max2);
                                    if (z) {
                                        continue;
                                    } else {
                                        ArrayList arrayList2 = v20Var.h;
                                        v20Var.e = false;
                                        x2 b = v20.b();
                                        b.a.remove(v20Var);
                                        ArrayList arrayList3 = b.b;
                                        int indexOf = arrayList3.indexOf(v20Var);
                                        if (indexOf >= 0) {
                                            arrayList3.set(indexOf, null);
                                            b.f = true;
                                        }
                                        v20Var.f = 0L;
                                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                            if (arrayList2.get(i4) != null) {
                                                arrayList2.get(i4).getClass();
                                                l8.c();
                                                return;
                                            }
                                        }
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    }
                                    i3 = i + 1;
                                    uptimeMillis = j;
                                    z2 = false;
                                } else {
                                    v20Var.b = (float) v20Var.j.i;
                                    v20Var.a = 0.0f;
                                }
                            }
                            z = true;
                            float min2 = Math.min(v20Var.b, Float.MAX_VALUE);
                            v20Var.b = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            v20Var.b = max22;
                            v20Var.c(max22);
                            if (z) {
                            }
                            i3 = i + 1;
                            uptimeMillis = j;
                            z2 = false;
                        }
                    }
                    i = i3;
                    j = uptimeMillis;
                    i3 = i + 1;
                    uptimeMillis = j;
                    z2 = false;
                }
                if (x2Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        o4 o4Var = x2Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((v2) o4Var.g);
                        o4Var.g = null;
                    }
                    x2Var.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) x2Var.e.g).postFrameCallback(new w2(x2Var.d));
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).o0();
                return;
            case 3:
                ((na) obj2).s(true);
                return;
            case 4:
                mb mbVar = (mb) obj2;
                Runnable runnable = mbVar.g;
                if (runnable != null) {
                    runnable.run();
                    mbVar.g = null;
                    return;
                }
                return;
            case 5:
                rb.b((rb) obj2);
                return;
            case 6:
                hg hgVar = (hg) obj2;
                boolean isPopupShowing = hgVar.h.isPopupShowing();
                hgVar.s(isPopupShowing);
                hgVar.m = isPopupShowing;
                return;
            case 7:
                kj kjVar = (kj) obj2;
                synchronized (kjVar.i) {
                    try {
                        if (kjVar.m == null) {
                            return;
                        }
                        try {
                            uj b2 = kjVar.b();
                            int i5 = b2.f;
                            if (i5 == 2) {
                                synchronized (kjVar.i) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                Method method2 = u50.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                tg tgVar = kjVar.h;
                                Context context = kjVar.f;
                                tgVar.getClass();
                                uj[] ujVarArr = {b2};
                                m60 m60Var = o60.a;
                                g8.f("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface s = o60.a.s(context, ujVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer Y = g8.Y(kjVar.f, b2.a);
                                    if (Y == null || s == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        oe oeVar = new oe(s, oo.G(Y));
                                        Trace.endSection();
                                        synchronized (kjVar.i) {
                                            try {
                                                vv vvVar = kjVar.m;
                                                if (vvVar != null) {
                                                    vvVar.C(oeVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        kjVar.a();
                                        return;
                                    } finally {
                                        Method method3 = u50.b;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (kjVar.i) {
                                try {
                                    vv vvVar2 = kjVar.m;
                                    if (vvVar2 != null) {
                                        vvVar2.B(th3);
                                    }
                                    kjVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                int i6 = MainActivity.L;
                ((MainActivity) obj2).r();
                return;
            case 9:
                m80 m80Var = ((MainActivity2) obj2).G;
                if (m80Var != null) {
                    m80Var.c.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(200L).start();
                    return;
                } else {
                    oo.P("habitsBinding");
                    throw null;
                }
            case 10:
                MaterialButton.a((MaterialButton) obj2);
                return;
            case 11:
                uw uwVar = (uw) obj2;
                a aVar = uwVar.k;
                if (uwVar.g == 0) {
                    uwVar.h = true;
                    aVar.d(fp.ON_PAUSE);
                }
                if (uwVar.f == 0 && uwVar.h) {
                    aVar.d(fp.ON_STOP);
                    uwVar.i = true;
                    return;
                }
                return;
            case 12:
                ((lx) obj2).m();
                return;
            case 13:
                f8 f8Var = (f8) obj2;
                f8Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) f8Var.e;
                h80 h80Var = sideSheetBehavior.i;
                if (h80Var != null && h80Var.f()) {
                    f8Var.a(f8Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(f8Var.b);
                        return;
                    }
                    return;
                }
            case 14:
                f40 f40Var = ((h40) obj2).a;
                ViewParent parent = f40Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(f40Var);
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj2).j.requestLayout();
                return;
        }
    }
}
