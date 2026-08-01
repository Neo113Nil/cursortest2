package G0;

import U.s;
import U.v;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C;
import androidx.lifecycle.EnumC0079l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.luckycounter.drinkwater.MainActivity;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.TargetCrashActivity;
import com.luckycounter.drinkwater.ui.TargetCrashView;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import k1.AbstractC0220d;
import k1.C0219c;
import z.AbstractC0384b;
import z.C0383a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f517b;

    public /* synthetic */ o(int i, Object obj) {
        this.f516a = i;
        this.f517b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4 = 1;
        r4 = 1;
        switch (this.f516a) {
            case 0:
                View view = (View) this.f517b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                N0.e eVar = (N0.e) this.f517b;
                eVar.f905c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f906e;
                T.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f904b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f904b);
                        return;
                    }
                    return;
                }
            case 2:
                ((P0.e) this.f517b).t(true);
                return;
            case 3:
                P0.k kVar = (P0.k) this.f517b;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f947m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f517b).d.requestLayout();
                return;
            case 5:
                int i = MainActivity.F;
                ((MainActivity) this.f517b).v();
                return;
            case 6:
                int i2 = TargetCrashActivity.f2485z;
                TargetCrashActivity targetCrashActivity = (TargetCrashActivity) this.f517b;
                TargetCrashView targetCrashView = targetCrashActivity.t().f1161c;
                String string = targetCrashActivity.getString(R.string.target_crashed);
                i1.f.d(string, "getString(...)");
                String string2 = targetCrashActivity.getString(R.string.target_crashed_sub);
                i1.f.d(string2, "getString(...)");
                ArrayList arrayList = targetCrashView.f2510a;
                arrayList.clear();
                int[] iArr = {-60269, -16711681, -4259585, -256, -12976364};
                for (int i3 = 0; i3 < 40; i3++) {
                    C0219c c0219c = AbstractC0220d.f3279a;
                    arrayList.add(new U0.d(((c0219c.a() * 40.0f) + (targetCrashView.getWidth() / 2.0f)) - 20.0f, targetCrashView.getHeight() / 2.0f, (c0219c.a() * 12.0f) - 6.0f, (c0219c.a() * (-14.0f)) - 4.0f, (c0219c.a() * 6.0f) + 3.0f, iArr[AbstractC0220d.f3280b.a().nextInt(5)]));
                }
                targetCrashView.f2518l = string;
                targetCrashView.f2519m = string2;
                targetCrashView.i = System.currentTimeMillis();
                targetCrashView.h = true;
                Choreographer.getInstance().postFrameCallback(targetCrashView.f2517k);
                targetCrashView.invalidate();
                return;
            case 7:
                s sVar = (s) this.f517b;
                synchronized (sVar.d) {
                    try {
                        if (sVar.h == null) {
                            return;
                        }
                        try {
                            H.j b2 = sVar.b();
                            int i4 = b2.f564e;
                            if (i4 == 2) {
                                synchronized (sVar.d) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                int i5 = G.h.f433a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                M0.e eVar3 = sVar.f1201c;
                                Context context = sVar.f1199a;
                                eVar3.getClass();
                                Typeface w2 = C.h.f238a.w(context, new H.j[]{b2}, 0);
                                MappedByteBuffer V2 = F1.l.V(sVar.f1199a, b2.f561a);
                                if (V2 == null || w2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    v vVar = new v(w2, F1.l.f0(V2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (sVar.d) {
                                        try {
                                            F1.l lVar = sVar.h;
                                            if (lVar != null) {
                                                lVar.X(vVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                    int i6 = G.h.f433a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (sVar.d) {
                                try {
                                    F1.l lVar2 = sVar.h;
                                    if (lVar2 != null) {
                                        lVar2.W(th2);
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                a.i iVar = (a.i) this.f517b;
                i1.f.e(iVar, "this$0");
                Runnable runnable = iVar.f1572b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1572b = null;
                    return;
                }
                return;
            case 9:
                a.m.a((a.m) this.f517b);
                return;
            case 10:
                C c2 = (C) this.f517b;
                i1.f.e(c2, "this$0");
                int i7 = c2.f1866b;
                androidx.lifecycle.v vVar2 = c2.f1869f;
                if (i7 == 0) {
                    c2.f1867c = true;
                    vVar2.d(EnumC0079l.ON_PAUSE);
                }
                if (c2.f1865a == 0 && c2.f1867c) {
                    vVar2.d(EnumC0079l.ON_STOP);
                    c2.d = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.f517b).m();
                return;
            case 12:
                Activity activity = (Activity) this.f517b;
                if (activity.isFinishing()) {
                    return;
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28) {
                    Class cls = AbstractC0384b.f4659a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0384b.f4659a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i8 == 26 || i8 == 27;
                Method method = AbstractC0384b.f4663f;
                if ((!z2 || method != null) && (AbstractC0384b.f4662e != null || AbstractC0384b.d != null)) {
                    try {
                        Object obj2 = AbstractC0384b.f4661c.get(activity);
                        if (obj2 != null && (obj = AbstractC0384b.f4660b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0383a c0383a = new C0383a(activity);
                            application.registerActivityLifecycleCallbacks(c0383a);
                            Handler handler = AbstractC0384b.f4664g;
                            handler.post(new H.a(c0383a, 4, obj2));
                            if (i8 != 26 && i8 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0383a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0383a c0383a2 = c0383a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 5, c0383a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0383a;
                                    r7 = application;
                                    activity.recreate();
                                }
                                r4.post(new H.a((Object) r7, 5, (Object) r6));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                ((CarouselLayoutManager) this.f517b).n0();
                return;
        }
    }
}
