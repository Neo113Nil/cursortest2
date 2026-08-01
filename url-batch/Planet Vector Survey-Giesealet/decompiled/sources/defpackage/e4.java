package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e4 implements dl, View.OnAttachStateChangeListener {
    public final f3 d;
    public final z2 e;
    public j3 f;
    public final ArrayList g = new ArrayList();
    public final long h = 100;
    public b4 i = b4.d;
    public boolean j = true;
    public final eb k = x40.b(1, null, 6);
    public final Handler l = new Handler(Looper.getMainLooper());
    public p60 m;
    public long n;
    public final p60 o;
    public sp0 p;
    public boolean q;
    public final w2 r;

    public e4(f3 f3Var, z2 z2Var) {
        this.d = f3Var;
        this.e = z2Var;
        p60 p60Var = az.a;
        p60Var.getClass();
        this.m = p60Var;
        this.o = new p60();
        this.p = new sp0(f3Var.getSemanticsOwner().a(), p60Var);
        this.r = new w2(2, this);
    }

    @Override // defpackage.dl
    public final void b(o20 o20Var) {
        p(this.d.getSemanticsOwner().a());
        l();
        this.f = null;
    }

    @Override // defpackage.dl
    public final void c(o20 o20Var) {
        this.f = (j3) this.e.a();
        o(-1, this.d.getSemanticsOwner().a());
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (defpackage.mz.B(r7.h, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(lj ljVar) {
        d4 d4Var;
        int i;
        db dbVar;
        if (ljVar instanceof d4) {
            d4Var = (d4) ljVar;
            int i2 = d4Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4Var.g = i2 - Integer.MIN_VALUE;
                Object obj = d4Var.e;
                i = d4Var.g;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    eb ebVar = this.k;
                    ebVar.getClass();
                    dbVar = new db(ebVar);
                } else if (i == 1) {
                    dbVar = d4Var.d;
                    rg0.u(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return ky0.a;
                    }
                    dbVar.c();
                    if (k()) {
                        l();
                    }
                    if (!this.q) {
                        this.q = true;
                        this.l.post(this.r);
                    }
                    d4Var.d = dbVar;
                    d4Var.g = 2;
                } else {
                    if (i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dbVar = d4Var.d;
                    rg0.u(obj);
                }
                d4Var.d = dbVar;
                d4Var.g = 1;
                obj = dbVar.b(d4Var);
            }
        }
        d4Var = new d4(this, ljVar);
        Object obj2 = d4Var.e;
        i = d4Var.g;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
        d4Var.d = dbVar;
        d4Var.g = 1;
        obj2 = dbVar.b(d4Var);
    }

    public final void i(zy zyVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        zy zyVar2 = zyVar;
        int[] iArr3 = zyVar2.b;
        long[] jArr = zyVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        sp0 sp0Var = (sp0) this.o.b(i7);
                        tp0 tp0Var = (tp0) zyVar2.b(i7);
                        rp0 rp0Var = tp0Var != null ? tp0Var.a : null;
                        if (rp0Var == null) {
                            throw y6.u("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = rp0Var.g;
                        a70 a70Var = rp0Var.d.d;
                        if (sp0Var == null) {
                            Object[] objArr = a70Var.b;
                            long[] jArr2 = a70Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                yp0 yp0Var = (yp0) objArr[(i10 << 3) + i12];
                                                yp0 yp0Var2 = vp0.z;
                                                if (nz.l(yp0Var, yp0Var2)) {
                                                    Object g = a70Var.g(yp0Var2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    n(String.valueOf(list != null ? (l7) zd.d0(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = a70Var.b;
                            long[] jArr3 = a70Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                yp0 yp0Var3 = (yp0) objArr2[(i13 << 3) + i15];
                                                yp0 yp0Var4 = vp0.z;
                                                if (nz.l(yp0Var3, yp0Var4)) {
                                                    Object g2 = sp0Var.a.d.g(yp0Var4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    l7 l7Var = list2 != null ? (l7) zd.d0(list2) : null;
                                                    Object g3 = a70Var.g(yp0Var4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    l7 l7Var2 = list3 != null ? (l7) zd.d0(list3) : null;
                                                    if (!nz.l(l7Var, l7Var2)) {
                                                        n(String.valueOf(l7Var2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    zyVar2 = zyVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            zyVar2 = zyVar;
            iArr3 = iArr;
        }
    }

    public final zy j() {
        if (this.j) {
            this.j = false;
            this.m = nz.C(this.d.getSemanticsOwner());
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    public final boolean k() {
        return this.f != null;
    }

    public final void l() {
        j3 j3Var = this.f;
        if (j3Var == null) {
            return;
        }
        Object obj = j3Var.e;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xi xiVar = (xi) arrayList.get(i);
            int ordinal = xiVar.c.ordinal();
            if (ordinal == 0) {
                p01 p01Var = xiVar.d;
                if (p01Var != null) {
                    ViewStructure viewStructure = (ViewStructure) p01Var.e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        zi.d(n2.f(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    g8.c();
                    return;
                }
                AutofillId h = j3Var.h(xiVar.a);
                if (h != null && Build.VERSION.SDK_INT >= 29) {
                    zi.e(n2.f(obj), h);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession f = n2.f(obj);
            u8 e = yc0.e((View) j3Var.f);
            Objects.requireNonNull(e);
            zi.g(f, t0.e(e.a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void m(rp0 rp0Var, sp0 sp0Var) {
        w3 w3Var = new w3(1, sp0Var, this);
        rp0Var.getClass();
        List j = rp0.j(4, rp0Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (j().a(((rp0) obj).g)) {
                w3Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j2 = rp0.j(4, rp0Var);
        int size2 = j2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            rp0 rp0Var2 = (rp0) j2.get(i3);
            zy j3 = j();
            int i4 = rp0Var2.g;
            if (j3.a(i4)) {
                p60 p60Var = this.o;
                if (p60Var.a(i4)) {
                    Object b = p60Var.b(i4);
                    if (b == null) {
                        throw y6.u("node not present in pruned tree before this change");
                    }
                    m(rp0Var2, (sp0) b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void n(String str, int i) {
        j3 j3Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (j3Var = this.f) != null) {
            AutofillId h = j3Var.h(i);
            if (h == null) {
                throw y6.u("Invalid content capture ID");
            }
            if (i2 >= 29) {
                zi.f(n2.f(j3Var.e), h, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r8v12 android.view.autofill.AutofillId) from 0x0097: IF  (r8v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0075 A[HIDDEN] (LINE:152)
          (r8v12 android.view.autofill.AutofillId) from 0x00a0: PHI (r8v4 android.view.autofill.AutofillId) = (r8v3 android.view.autofill.AutofillId), (r8v12 android.view.autofill.AutofillId) binds: [B:103:0x009a, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int r19, defpackage.rp0 r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4.o(int, rp0):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l.removeCallbacks(this.r);
        this.f = null;
    }

    public final void p(rp0 rp0Var) {
        if (k()) {
            this.g.add(new xi(rp0Var.g, this.n, yi.e, null));
            List j = rp0.j(4, rp0Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                p((rp0) j.get(i));
            }
        }
    }

    public final void q() {
        p60 p60Var = this.o;
        p60Var.c();
        zy j = j();
        int[] iArr = j.b;
        Object[] objArr = j.c;
        long[] jArr = j.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            p60Var.h(iArr[i4], new sp0(((tp0) objArr[i4]).a, j()));
                        }
                        j2 >>= 8;
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
        }
        this.p = new sp0(this.d.getSemanticsOwner().a(), j());
    }

    @Override // defpackage.dl
    public final void a(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void d(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void e(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void f(o20 o20Var) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
