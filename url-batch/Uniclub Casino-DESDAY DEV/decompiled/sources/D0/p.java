package D0;

import M0.C0029e;
import T.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.t;
import com.fortuneodd.shadegrid.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0346b;
import z.C0345a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165b;

    public /* synthetic */ p(int i, Object obj) {
        this.f164a = i;
        this.f165b = obj;
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
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4 = 1;
        r4 = 1;
        switch (this.f164a) {
            case 0:
                View view = (View) this.f165b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                K0.e eVar = (K0.e) this.f165b;
                eVar.f466c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f467e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f465b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f465b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0029e) this.f165b).t(true);
                return;
            case 3:
                M0.l lVar = (M0.l) this.f165b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f529m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f165b).d.requestLayout();
                return;
            case 5:
                T.r rVar = (T.r) this.f165b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i = b2.f225e;
                            if (i == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = G.h.f179a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                J0.e eVar3 = rVar.f744c;
                                Context context = rVar.f742a;
                                eVar3.getClass();
                                Typeface j2 = C.h.f63a.j(context, new H.k[]{b2}, 0);
                                MappedByteBuffer a02 = q1.l.a0(rVar.f742a, b2.f222a);
                                if (a02 == null || j2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(j2, q1.l.j0(a02));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            q1.l lVar2 = rVar.h;
                                            if (lVar2 != null) {
                                                lVar2.g0(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i3 = G.h.f179a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    q1.l lVar3 = rVar.h;
                                    if (lVar3 != null) {
                                        lVar3.b0(th2);
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                a.i iVar = (a.i) this.f165b;
                X0.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1048b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1048b = null;
                    return;
                }
                return;
            case 7:
                a.m.a((a.m) this.f165b);
                return;
            case 8:
                A a2 = (A) this.f165b;
                X0.d.e(a2, "this$0");
                int i4 = a2.f1332b;
                t tVar = a2.f1335f;
                if (i4 == 0) {
                    a2.f1333c = true;
                    tVar.d(EnumC0068l.ON_PAUSE);
                }
                if (a2.f1331a == 0 && a2.f1333c) {
                    tVar.d(EnumC0068l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 9:
                ((com.google.android.material.timepicker.e) this.f165b).m();
                return;
            case 10:
                int i5 = MainActivity.f1519E;
                ((MainActivity) this.f165b).v();
                return;
            case 11:
                ((CarouselLayoutManager) this.f165b).l0();
                return;
            default:
                Activity activity = (Activity) this.f165b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0346b.f4211a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0346b.f4211a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0346b.f4215f;
                if ((!z2 || method != null) && (AbstractC0346b.f4214e != null || AbstractC0346b.d != null)) {
                    try {
                        Object obj2 = AbstractC0346b.f4213c.get(activity);
                        if (obj2 != null && (obj = AbstractC0346b.f4212b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0345a c0345a = new C0345a(activity);
                            application.registerActivityLifecycleCallbacks(c0345a);
                            Handler handler = AbstractC0346b.f4216g;
                            handler.post(new H.a(c0345a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0345a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0345a c0345a2 = c0345a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0345a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0345a;
                                    r7 = application;
                                    activity.recreate();
                                }
                                r4.post(new H.a((Object) r7, 4, (Object) r6));
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
        }
    }
}
