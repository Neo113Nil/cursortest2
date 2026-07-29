package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: o.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2132w3 implements InterfaceC0061Cg, View.OnAttachStateChangeListener {
    public final S2 h;
    public final J2 i;
    public C1182he j;
    public final C2340zD k = new C2340zD();
    public final AD l = new AD();
    public final long m = 100;
    public int n = 1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237o = true;
    public final N6 p = new N6(0);
    public final J8 q = AbstractC1807r8.b(1, 6, null);
    public final Handler r = new Handler(Looper.getMainLooper());
    public C2340zD s;
    public long t;
    public final C2340zD u;
    public C2353zQ v;
    public boolean w;
    public final D1 x;

    public ViewOnAttachStateChangeListenerC2132w3(S2 s2, J2 j2) {
        this.h = s2;
        this.i = j2;
        C2340zD c2340zD = AbstractC0999et.a;
        AbstractC0048Bt.l(c2340zD, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.s = c2340zD;
        this.u = new C2340zD();
        C2287yQ a = s2.getSemanticsOwner().a();
        AbstractC0048Bt.l(c2340zD, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.v = new C2353zQ(a, c2340zD);
        this.x = new D1(4, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (o.PX.D(r6, r0) == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004f, B:18:0x005c, B:20:0x0064, B:22:0x006d, B:23:0x0070, B:25:0x0074, B:26:0x007d, B:34:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        C2066v3 c2066v3;
        Object obj;
        int i;
        EnumC0448Re enumC0448Re;
        ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3;
        I8 i8;
        try {
            if (abstractC2367ze instanceof C2066v3) {
                c2066v3 = (C2066v3) abstractC2367ze;
                int i2 = c2066v3.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2066v3.l = i2 - Integer.MIN_VALUE;
                    obj = c2066v3.j;
                    i = c2066v3.l;
                    enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        try {
                            J8 j8 = this.q;
                            j8.getClass();
                            i8 = new I8(j8);
                            viewOnAttachStateChangeListenerC2132w3 = this;
                        } catch (Throwable th) {
                            th = th;
                            viewOnAttachStateChangeListenerC2132w3 = this;
                            viewOnAttachStateChangeListenerC2132w3.p.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        i8 = c2066v3.i;
                        viewOnAttachStateChangeListenerC2132w3 = c2066v3.h;
                        AbstractC1494mO.l(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            viewOnAttachStateChangeListenerC2132w3.p.clear();
                            return C0782bY.a;
                        }
                        i8.c();
                        if (viewOnAttachStateChangeListenerC2132w3.e()) {
                            viewOnAttachStateChangeListenerC2132w3.f();
                        }
                        if (!viewOnAttachStateChangeListenerC2132w3.w) {
                            viewOnAttachStateChangeListenerC2132w3.w = true;
                            viewOnAttachStateChangeListenerC2132w3.r.post(viewOnAttachStateChangeListenerC2132w3.x);
                        }
                        viewOnAttachStateChangeListenerC2132w3.p.clear();
                        long j = viewOnAttachStateChangeListenerC2132w3.m;
                        c2066v3.h = viewOnAttachStateChangeListenerC2132w3;
                        c2066v3.i = i8;
                        c2066v3.l = 2;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8 = c2066v3.i;
                        viewOnAttachStateChangeListenerC2132w3 = c2066v3.h;
                        AbstractC1494mO.l(obj);
                    }
                    c2066v3.h = viewOnAttachStateChangeListenerC2132w3;
                    c2066v3.i = i8;
                    c2066v3.l = 1;
                    obj = i8.b(c2066v3);
                    if (obj == enumC0448Re) {
                        return enumC0448Re;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
            c2066v3.h = viewOnAttachStateChangeListenerC2132w3;
            c2066v3.i = i8;
            c2066v3.l = 1;
            obj = i8.b(c2066v3);
            if (obj == enumC0448Re) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c2066v3 = new C2066v3(this, abstractC2367ze);
        obj = c2066v3.j;
        i = c2066v3.l;
        enumC0448Re = EnumC0448Re.h;
    }

    @Override // o.InterfaceC0061Cg
    public final void b(InterfaceC0365Nz interfaceC0365Nz) {
        this.j = (C1182he) this.i.invoke();
        l(this.h.getSemanticsOwner().a());
        f();
    }

    public final C2340zD d() {
        if (this.f237o) {
            this.f237o = false;
            this.s = AbstractC1052fg.u(this.h.getSemanticsOwner());
            this.t = System.currentTimeMillis();
        }
        return this.s;
    }

    public final boolean e() {
        return this.j != null;
    }

    public final void f() {
        long j;
        char c;
        long j2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C1182he c1182he = this.j;
        if (c1182he == null) {
            return;
        }
        Object obj = c1182he.a;
        View view = c1182he.b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        C2340zD c2340zD = this.k;
        if (c2340zD.e != 0) {
            ArrayList arrayList3 = new ArrayList();
            j = 255;
            Object[] objArr = c2340zD.c;
            long[] jArr = c2340zD.a;
            c = 7;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                j2 = -9187201950435737472L;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j3 & 255) < 128) {
                                arrayList3.add((C1206i00) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                j2 = -9187201950435737472L;
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList4.add(((C1206i00) arrayList3.get(i4)).a);
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                AbstractC1050fe.a(AbstractC2196x2.g(obj), arrayList4);
            } else if (i5 >= 29) {
                ViewStructure b = AbstractC0984ee.b(AbstractC2196x2.g(obj), view);
                AbstractC0919de.a(b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                AbstractC0984ee.d(AbstractC2196x2.g(obj), b);
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    AbstractC0984ee.d(AbstractC2196x2.g(obj), (ViewStructure) arrayList4.get(i6));
                }
                ViewStructure b2 = AbstractC0984ee.b(AbstractC2196x2.g(obj), view);
                AbstractC0919de.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                AbstractC0984ee.d(AbstractC2196x2.g(obj), b2);
            }
            c2340zD.a();
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
        }
        AD ad = this.l;
        if (ad.d != 0) {
            ArrayList arrayList5 = new ArrayList();
            int[] iArr = ad.b;
            long[] jArr2 = ad.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i7 = 0;
                while (true) {
                    long j4 = jArr2[i7];
                    ArrayList arrayList6 = arrayList5;
                    if ((((~j4) << c) & j4 & j2) != j2) {
                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j4 & j) < 128) {
                                arrayList2 = arrayList6;
                                arrayList2.add(Integer.valueOf(iArr[(i7 << 3) + i9]));
                            } else {
                                arrayList2 = arrayList6;
                            }
                            j4 >>= 8;
                            i9++;
                            arrayList6 = arrayList2;
                        }
                        arrayList = arrayList6;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        arrayList = arrayList6;
                    }
                    if (i7 == length2) {
                        break;
                    }
                    i7++;
                    arrayList5 = arrayList;
                }
            } else {
                arrayList = arrayList5;
            }
            ArrayList arrayList7 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList7.add(Long.valueOf(((Number) arrayList.get(i10)).intValue()));
            }
            long[] jArr3 = new long[arrayList7.size()];
            Iterator it = arrayList7.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                jArr3[i11] = ((Number) it.next()).longValue();
                i11++;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 34) {
                ContentCaptureSession g = AbstractC2196x2.g(obj);
                M1 t = TM.t(view);
                Objects.requireNonNull(t);
                AbstractC0984ee.f(g, K7.f(t.h), jArr3);
            } else if (i12 >= 29) {
                ViewStructure b3 = AbstractC0984ee.b(AbstractC2196x2.g(obj), view);
                AbstractC0919de.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                AbstractC0984ee.d(AbstractC2196x2.g(obj), b3);
                ContentCaptureSession g2 = AbstractC2196x2.g(obj);
                M1 t2 = TM.t(view);
                Objects.requireNonNull(t2);
                AbstractC0984ee.f(g2, K7.f(t2.h), jArr3);
                ViewStructure b4 = AbstractC0984ee.b(AbstractC2196x2.g(obj), view);
                AbstractC0919de.a(b4).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                AbstractC0984ee.d(AbstractC2196x2.g(obj), b4);
            }
            ad.b();
        }
    }

    public final void g(C2287yQ c2287yQ, C2353zQ c2353zQ) {
        List g;
        int size;
        List g2;
        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        size = g.size();
        for (int i = 0; i < size; i++) {
            C2287yQ c2287yQ2 = (C2287yQ) g.get(i);
            if (d().b(c2287yQ2.g) && !c2353zQ.b.c(c2287yQ2.g)) {
                l(c2287yQ2);
            }
        }
        C2340zD c2340zD = this.u;
        int[] iArr = c2340zD.b;
        long[] jArr = c2340zD.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i2 << 3) + i4];
                            if (!d().b(i5)) {
                                C2340zD c2340zD2 = this.k;
                                if (c2340zD2.c(i5)) {
                                    c2340zD2.g(i5);
                                } else {
                                    this.l.a(i5);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        g2 = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        int size2 = g2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C2287yQ c2287yQ3 = (C2287yQ) g2.get(i6);
            C2340zD d = d();
            int i7 = c2287yQ3.g;
            if (d.b(i7) && c2340zD.b(i7)) {
                Object e = c2340zD.e(i7);
                if (e == null) {
                    AbstractC0868ct.X("node not present in pruned tree before this change");
                    throw null;
                }
                g(c2287yQ3, (C2353zQ) e);
            }
        }
    }

    public final void h(int i, String str) {
        C1182he c1182he;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (c1182he = this.j) != null) {
            AutofillId a = c1182he.a(i);
            if (a == null) {
                AbstractC0868ct.X("Invalid content capture ID");
                throw null;
            }
            if (i2 >= 29) {
                AbstractC0984ee.e(AbstractC2196x2.g(c1182he.a), a, str);
            }
        }
    }

    public final void i(C2287yQ c2287yQ, C2353zQ c2353zQ) {
        List g;
        List g2;
        AD ad = new AD();
        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        C0027Ay c0027Ay = c2287yQ.c;
        int size = g.size();
        int i = 0;
        while (true) {
            C0782bY c0782bY = C0782bY.a;
            J8 j8 = this.q;
            N6 n6 = this.p;
            if (i >= size) {
                AD ad2 = c2353zQ.b;
                int[] iArr = ad2.b;
                long[] jArr = ad2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        int[] iArr2 = iArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128 && !ad.c(iArr2[(i2 << 3) + i4])) {
                                    if (n6.add(c0027Ay)) {
                                        j8.f(c0782bY);
                                        return;
                                    }
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        iArr = iArr2;
                    }
                }
                g2 = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
                int size2 = g2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    C2287yQ c2287yQ2 = (C2287yQ) g2.get(i5);
                    if (d().b(c2287yQ2.g)) {
                        Object e = this.u.e(c2287yQ2.g);
                        if (e == null) {
                            AbstractC0868ct.X("node not present in pruned tree before this change");
                            throw null;
                        }
                        i(c2287yQ2, (C2353zQ) e);
                    }
                }
                return;
            }
            C2287yQ c2287yQ3 = (C2287yQ) g.get(i);
            C2340zD d = d();
            int i6 = c2287yQ3.g;
            if (d.b(i6)) {
                if (!c2353zQ.b.c(i6)) {
                    if (n6.add(c0027Ay)) {
                        j8.f(c0782bY);
                        return;
                    }
                    return;
                }
                ad.a(i6);
            }
            i++;
        }
    }

    @Override // o.InterfaceC0061Cg
    public final void k(InterfaceC0365Nz interfaceC0365Nz) {
        m(this.h.getSemanticsOwner().a());
        f();
        this.j = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v13 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r9v13 android.view.autofill.AutofillId) from 0x0096: IF  (r9v13 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:76:0x0174 A[HIDDEN] (LINE:151)
          (r9v13 android.view.autofill.AutofillId) from 0x00a0: PHI (r9v5 android.view.autofill.AutofillId) = (r9v4 android.view.autofill.AutofillId), (r9v13 android.view.autofill.AutofillId) binds: [B:75:0x009a, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l(o.C2287yQ r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ViewOnAttachStateChangeListenerC2132w3.l(o.yQ):void");
    }

    public final void m(C2287yQ c2287yQ) {
        List g;
        if (e()) {
            int i = c2287yQ.g;
            C2340zD c2340zD = this.k;
            if (c2340zD.c(i)) {
                c2340zD.g(i);
            } else {
                this.l.a(i);
            }
            g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
            int size = g.size();
            for (int i2 = 0; i2 < size; i2++) {
                m((C2287yQ) g.get(i2));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.r.removeCallbacks(this.x);
        this.j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
