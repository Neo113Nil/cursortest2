package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.MotionEvent;
import com.google.firebase.installations.FirebaseInstallations;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class D1 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ D1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        H1 h1;
        Application application;
        char c;
        long j;
        long j2;
        long[] jArr;
        long[] jArr2;
        C2340zD c2340zD;
        int i;
        C2340zD c2340zD2;
        int i2;
        int i3;
        char c2;
        int i4 = 10;
        int i5 = 2;
        ?? r5 = 1;
        r5 = 1;
        int i6 = 0;
        switch (this.h) {
            case 0:
                Activity activity = (Activity) this.i;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = I1.g;
                Method method = I1.f;
                ?? r4 = Build.VERSION.SDK_INT;
                if (r4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((r4 != 26 && r4 != 27) || method != null) && (I1.e != null || I1.d != null)) {
                    try {
                        Object obj2 = I1.c.get(activity);
                        if (obj2 != null && (obj = I1.b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            H1 h12 = new H1(activity);
                            application2.registerActivityLifecycleCallbacks(h12);
                            handler.post(new RunnableC1996u1(1 == true ? 1 : 0, h12, obj2, false));
                            if (r4 != 26 && r4 != 27) {
                                r5 = 0;
                            }
                            try {
                                if (r5 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = application2;
                                        r5 = h12;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application2;
                                        h1 = h12;
                                        handler.post(new RunnableC1996u1(2, application, h1, false));
                                        throw th;
                                    }
                                } else {
                                    r4 = application2;
                                    r5 = h12;
                                    activity.recreate();
                                }
                                handler.post(new RunnableC1996u1(i5, r4, r5, false));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                application = r4;
                                h1 = r5;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                S2 s2 = (S2) this.i;
                s2.y0 = false;
                MotionEvent motionEvent = s2.s0;
                AbstractC0048Bt.k(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                s2.E(motionEvent);
                return;
            case 2:
                ((InterfaceC1455lp) this.i).invoke();
                return;
            case 3:
                C1013f3 c1013f3 = (C1013f3) this.i;
                Trace.beginSection("measureAndLayout");
                try {
                    c1013f3.d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c1013f3.h();
                        Trace.endSection();
                        c1013f3.H = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 4:
                ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3 = (ViewOnAttachStateChangeListenerC2132w3) this.i;
                boolean e = viewOnAttachStateChangeListenerC2132w3.e();
                C2340zD c2340zD3 = viewOnAttachStateChangeListenerC2132w3.u;
                S2 s22 = viewOnAttachStateChangeListenerC2132w3.h;
                if (e) {
                    s22.s(true);
                    viewOnAttachStateChangeListenerC2132w3.i(s22.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC2132w3.v);
                    viewOnAttachStateChangeListenerC2132w3.g(s22.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC2132w3.v);
                    C2340zD d = viewOnAttachStateChangeListenerC2132w3.d();
                    int[] iArr = d.b;
                    long[] jArr3 = d.a;
                    int length = jArr3.length - 2;
                    char c3 = 7;
                    int i7 = 8;
                    if (length >= 0) {
                        int i8 = 0;
                        j = 128;
                        j2 = 255;
                        while (true) {
                            long j3 = jArr3[i8];
                            int i9 = i5;
                            int[] iArr2 = iArr;
                            if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((j3 & 255) < 128) {
                                        i3 = i9;
                                        int i12 = iArr2[(i8 << 3) + i11];
                                        c2 = c3;
                                        C2353zQ c2353zQ = (C2353zQ) c2340zD3.e(i12);
                                        AQ aq = (AQ) d.e(i12);
                                        C2287yQ c2287yQ = aq != null ? aq.a : null;
                                        if (c2287yQ == null) {
                                            AbstractC0868ct.X("no value for specified key");
                                            throw null;
                                        }
                                        int i13 = c2287yQ.g;
                                        C2023uQ c2023uQ = c2287yQ.d;
                                        i2 = i7;
                                        LinkedHashMap linkedHashMap = c2023uQ.h;
                                        if (c2353zQ == null) {
                                            Iterator it = c2023uQ.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                C2340zD c2340zD4 = d;
                                                FQ fq = CQ.s;
                                                if (AbstractC0048Bt.h(key, fq)) {
                                                    Object obj3 = linkedHashMap.get(fq);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list = (List) obj3;
                                                    viewOnAttachStateChangeListenerC2132w3.h(i13, String.valueOf(list != null ? (Y3) AbstractC0720ac.p0(list) : null));
                                                }
                                                d = c2340zD4;
                                            }
                                            c2340zD2 = d;
                                        } else {
                                            c2340zD2 = d;
                                            Iterator it2 = c2023uQ.iterator();
                                            while (it2.hasNext()) {
                                                FQ fq2 = (FQ) ((Map.Entry) it2.next()).getKey();
                                                Iterator it3 = it2;
                                                FQ fq3 = CQ.s;
                                                if (AbstractC0048Bt.h(fq2, fq3)) {
                                                    Object obj4 = c2353zQ.a.h.get(fq3);
                                                    if (obj4 == null) {
                                                        obj4 = null;
                                                    }
                                                    List list2 = (List) obj4;
                                                    Y3 y3 = list2 != null ? (Y3) AbstractC0720ac.p0(list2) : null;
                                                    Object obj5 = linkedHashMap.get(fq3);
                                                    if (obj5 == null) {
                                                        obj5 = null;
                                                    }
                                                    List list3 = (List) obj5;
                                                    Y3 y32 = list3 != null ? (Y3) AbstractC0720ac.p0(list3) : null;
                                                    if (!AbstractC0048Bt.h(y3, y32)) {
                                                        viewOnAttachStateChangeListenerC2132w3.h(i13, String.valueOf(y32));
                                                    }
                                                }
                                                it2 = it3;
                                            }
                                        }
                                    } else {
                                        c2340zD2 = d;
                                        i2 = i7;
                                        i3 = i9;
                                        c2 = c3;
                                    }
                                    j3 >>= i2;
                                    i11++;
                                    i9 = i3;
                                    c3 = c2;
                                    i7 = i2;
                                    d = c2340zD2;
                                }
                                c2340zD = d;
                                i = i9;
                                c = c3;
                                if (i10 != i7) {
                                }
                            } else {
                                c2340zD = d;
                                i = i9;
                                c = c3;
                            }
                            if (i8 != length) {
                                i8++;
                                iArr = iArr2;
                                i5 = i;
                                c3 = c;
                                d = c2340zD;
                                i7 = 8;
                                i6 = 0;
                            }
                        }
                    } else {
                        c = 7;
                        j = 128;
                        j2 = 255;
                    }
                    c2340zD3.a();
                    C2340zD d2 = viewOnAttachStateChangeListenerC2132w3.d();
                    int[] iArr3 = d2.b;
                    Object[] objArr = d2.c;
                    long[] jArr4 = d2.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j4 = jArr4[i14];
                            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j4 & j2) < j) {
                                        int i17 = (i14 << 3) + i16;
                                        jArr2 = jArr4;
                                        c2340zD3.h(iArr3[i17], new C2353zQ(((AQ) objArr[i17]).a, viewOnAttachStateChangeListenerC2132w3.d()));
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    j4 >>= 8;
                                    i16++;
                                    jArr4 = jArr2;
                                }
                                jArr = jArr4;
                                if (i15 != 8) {
                                }
                            } else {
                                jArr = jArr4;
                            }
                            if (i14 != length2) {
                                i14++;
                                jArr4 = jArr;
                            }
                        }
                    }
                    viewOnAttachStateChangeListenerC2132w3.v = new C2353zQ(s22.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC2132w3.d());
                    viewOnAttachStateChangeListenerC2132w3.w = false;
                    return;
                }
                return;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ViewTreeObserverOnDrawListenerC0316Mc viewTreeObserverOnDrawListenerC0316Mc = (ViewTreeObserverOnDrawListenerC0316Mc) this.i;
                AbstractC0048Bt.n(viewTreeObserverOnDrawListenerC0316Mc, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0316Mc.i;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0316Mc.i = null;
                    return;
                }
                return;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                DialogC0498Tc.a((DialogC0498Tc) this.i);
                return;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                C0450Rg c0450Rg = (C0450Rg) this.i;
                AbstractC0048Bt.n(c0450Rg, "this$0");
                AbstractC0048Bt.n(null, "$operation");
                c0450Rg.a(null);
                return;
            case 8:
                ((FirebaseInstallations) this.i).lambda$getId$1();
                return;
            case 9:
                ((CallableC1585nn) this.i).b.e.prefetchDefaultFontManager();
                return;
            case 10:
                C0639Yn c0639Yn = (C0639Yn) this.i;
                synchronized (c0639Yn.d) {
                    try {
                        if (c0639Yn.h == null) {
                            return;
                        }
                        try {
                            C1718po c4 = c0639Yn.c();
                            int i18 = c4.e;
                            if (i18 == 2) {
                                synchronized (c0639Yn.d) {
                                }
                            }
                            if (i18 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i18 + ")");
                            }
                            try {
                                int i19 = AbstractC1502mW.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0218Ih c0218Ih = c0639Yn.c;
                                Context context = c0639Yn.a;
                                c0218Ih.getClass();
                                Typeface g = BX.a.g(context, new C1718po[]{c4}, 0);
                                MappedByteBuffer j5 = PO.j(c0639Yn.a, c4.a);
                                if (j5 == null || g == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C1334k c1334k = new C1334k(g, EB.O(j5));
                                    Trace.endSection();
                                    synchronized (c0639Yn.d) {
                                        try {
                                            AbstractC0868ct abstractC0868ct = c0639Yn.h;
                                            if (abstractC0868ct != null) {
                                                abstractC0868ct.P(c1334k);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0639Yn.b();
                                    return;
                                } finally {
                                    int i20 = AbstractC1502mW.a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            synchronized (c0639Yn.d) {
                                try {
                                    AbstractC0868ct abstractC0868ct2 = c0639Yn.h;
                                    if (abstractC0868ct2 != null) {
                                        abstractC0868ct2.O(th4);
                                    }
                                    c0639Yn.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 11:
                ((DI) this.i).c(false);
                return;
            case 12:
                C1884sJ c1884sJ = (C1884sJ) this.i;
                C0417Pz c0417Pz = c1884sJ.m;
                if (c1884sJ.i == 0) {
                    c1884sJ.j = true;
                    c0417Pz.e(EnumC0054Bz.ON_PAUSE);
                }
                if (c1884sJ.h == 0 && c1884sJ.j) {
                    c0417Pz.e(EnumC0054Bz.ON_STOP);
                    c1884sJ.k = true;
                    return;
                }
                return;
            default:
                M10 m10 = (M10) this.i;
                ((C1495mP) m10.d).q(new C1932t2(i4, m10));
                return;
        }
    }

    public /* synthetic */ D1(C0450Rg c0450Rg, RS rs) {
        this.h = 7;
        this.i = c0450Rg;
    }
}
