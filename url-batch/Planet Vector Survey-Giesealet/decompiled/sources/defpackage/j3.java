package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.foundation.gestures.a;
import com.vectorharbor.planetvectorsurvey.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j3 implements np, pc0, on0 {
    public final /* synthetic */ int d;
    public Object e;
    public Object f;

    public j3(int i) {
        this.d = i;
        switch (i) {
            case 6:
                this.e = new a70();
                this.f = new a70();
                break;
            case 7:
                this.e = new l70(new p10[16]);
                break;
            case 11:
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                break;
            case 15:
                this.e = new pg0(15);
                this.f = new n40(16);
                break;
            case 16:
                this.e = new l70(new Reference[16]);
                this.f = new ReferenceQueue();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.e = new d1(this);
                    break;
                } else {
                    this.e = new e1(this);
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void g(p10 p10Var) {
        if (p10Var.M > 0) {
            if (p10Var.G.c == m10.h && !p10Var.j() && !p10Var.k() && !p10Var.N && p10Var.C()) {
                t50 t50Var = (t50) p10Var.F.j;
                if ((t50Var.g & 256) != 0) {
                    while (t50Var != null) {
                        if ((t50Var.f & 256) != 0) {
                            ol olVar = t50Var;
                            ?? r5 = 0;
                            while (olVar != 0) {
                                if (olVar instanceof fv) {
                                    fv fvVar = (fv) olVar;
                                    fvVar.n(nz.Y(fvVar, 256));
                                } else if ((olVar.f & 256) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var2 = olVar.s;
                                    int i = 0;
                                    olVar = olVar;
                                    r5 = r5;
                                    while (t50Var2 != null) {
                                        if ((t50Var2.f & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                olVar = t50Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r5.b(olVar);
                                                    olVar = 0;
                                                }
                                                r5.b(t50Var2);
                                            }
                                        }
                                        t50Var2 = t50Var2.i;
                                        olVar = olVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                olVar = nz.j(r5);
                            }
                        }
                        if ((t50Var.g & 256) == 0) {
                            break;
                        } else {
                            t50Var = t50Var.i;
                        }
                    }
                }
            }
            p10Var.L = false;
            l70 s = p10Var.s();
            Object[] objArr = s.d;
            int i2 = s.f;
            for (int i3 = 0; i3 < i2; i3++) {
                g((p10) objArr[i3]);
            }
        }
    }

    @Override // defpackage.np
    public Object a() {
        return (ny0) this.e;
    }

    @Override // defpackage.np
    public boolean b(CharSequence charSequence, int i, int i2, yx0 yx0Var) {
        if ((yx0Var.c & 4) > 0) {
            return true;
        }
        if (((ny0) this.e) == null) {
            this.e = new ny0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((y7) this.f).getClass();
        ((ny0) this.e).setSpan(new zx0(yx0Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.pc0
    public List c(Integer num) {
        List c = ((pc0) this.e).c(null);
        mr0 mr0Var = (mr0) this.f;
        int i = mr0Var.v;
        return i < 0 ? c : zd.l0(d31.l(mr0Var, num, i, Integer.valueOf(mr0Var.C(mr0Var.b, i))), c);
    }

    @Override // defpackage.on0
    public Object d(vm0 vm0Var, Object obj) {
        return ((qu) this.e).invoke(vm0Var, obj);
    }

    public boolean e(long j) {
        Object obj;
        List list = (List) ((j3) this.f).e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vg0.a(((yg0) obj).a, j)) {
                break;
            }
            i++;
        }
        yg0 yg0Var = (yg0) obj;
        if (yg0Var != null) {
            return yg0Var.h;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:412:0x0851, code lost:
    
        if (r5 == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0132, code lost:
    
        if (defpackage.rp0.j(4, r6).isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0832 A[LOOP:9: B:394:0x0815->B:403:0x0832, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0838 A[EDGE_INSN: B:404:0x0838->B:405:0x0838 BREAK  A[LOOP:9: B:394:0x0815->B:403:0x0832], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x062a  */
    /* JADX WARN: Type inference failed for: r2v47, types: [wp] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c1 f(int i) {
        AccessibilityManager accessibilityManager;
        ps0 ps0Var;
        n3 n3Var;
        f3 f3Var;
        n60 n60Var;
        np0 np0Var;
        rp0 rp0Var;
        tl0 tl0Var;
        p10 p10Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        c1 c1Var;
        a70 a70Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        tl0 tl0Var2;
        int i2;
        c1 c1Var2;
        int i3;
        Object g;
        n3 n3Var2;
        boolean z;
        Object g2;
        float f;
        f3 f3Var2;
        c1 c1Var3;
        boolean z2;
        boolean z3;
        p10 p10Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        boolean z9;
        rp0 rp0Var2;
        int i5;
        g20 lifecycle;
        n3 n3Var3 = (n3) this.f;
        AccessibilityManager accessibilityManager2 = n3Var3.g;
        f3 f3Var3 = n3Var3.d;
        y2 viewTreeOwners = f3Var3.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : ((q20) lifecycle).c) == f20.d) {
            if (!accessibilityManager2.isEnabled()) {
                c1Var3 = new c1(AccessibilityNodeInfo.obtain());
                n3Var2 = n3Var3;
                i3 = i;
                if (n3Var2.r) {
                    if (i3 == n3Var2.n) {
                        n3Var2.p = c1Var3;
                    }
                    if (i3 == n3Var2.o) {
                        n3Var2.q = c1Var3;
                    }
                }
                return c1Var3;
            }
            c1Var3 = null;
            n3Var2 = n3Var3;
            i3 = i;
            if (n3Var2.r) {
            }
            return c1Var3;
        }
        tp0 tp0Var = (tp0) n3Var3.l().b(i);
        if (tp0Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                c1Var3 = new c1(AccessibilityNodeInfo.obtain());
                n3Var2 = n3Var3;
                i3 = i;
                if (n3Var2.r) {
                }
                return c1Var3;
            }
            c1Var3 = null;
            n3Var2 = n3Var3;
            i3 = i;
            if (n3Var2.r) {
            }
            return c1Var3;
        }
        rp0 rp0Var3 = tp0Var.a;
        np0 k = rp0Var3.k();
        p10 p10Var3 = rp0Var3.c;
        Object g3 = k.d.g(vp0.n);
        if (g3 == null) {
            g3 = null;
        }
        boolean l = nz.l(g3, Boolean.TRUE);
        if (l) {
            if (!(Build.VERSION.SDK_INT >= 34 ? l0.e(accessibilityManager2) : true)) {
                n3Var2 = n3Var3;
                i3 = i;
                c1Var3 = null;
                if (n3Var2.r) {
                }
                return c1Var3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        c1 c1Var4 = new c1(obtain);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            l0.g(obtain, l);
        } else {
            c1Var4.f(64, l);
        }
        if (i == -1) {
            Object parentForAccessibility = f3Var3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            c1Var4.b = -1;
            obtain.setParent(view);
        } else {
            rp0 l2 = rp0Var3.l();
            Integer valueOf = l2 != null ? Integer.valueOf(l2.g) : null;
            if (valueOf == null) {
                cy.c("semanticsNode " + i + " has null parent");
                throw new kf();
            }
            int intValue = valueOf.intValue();
            if (intValue == f3Var3.getSemanticsOwner().a().g) {
                intValue = -1;
            }
            c1Var4.b = intValue;
            obtain.setParent(f3Var3, intValue);
        }
        c1Var4.c = i;
        obtain.setSource(f3Var3, i);
        obtain.setBoundsInScreen(n3Var3.c(tp0Var));
        n60 n60Var2 = n3Var3.M;
        ps0 ps0Var2 = n3Var3.v;
        Resources resources = f3Var3.getContext().getResources();
        c1Var4.g("android.view.View");
        np0 np0Var2 = rp0Var3.d;
        a70 a70Var2 = np0Var2.d;
        if (a70Var2.c(vp0.D)) {
            c1Var4.g("android.widget.EditText");
        }
        if (a70Var2.c(vp0.z)) {
            c1Var4.g("android.widget.TextView");
        }
        Object g4 = a70Var2.g(vp0.w);
        if (g4 == null) {
            g4 = null;
        }
        tl0 tl0Var3 = (tl0) g4;
        if (tl0Var3 != null) {
            int i7 = tl0Var3.a;
            accessibilityManager = accessibilityManager2;
            if (rp0Var3.e) {
                i5 = 4;
                ps0Var = ps0Var2;
            } else {
                i5 = 4;
                ps0Var = ps0Var2;
            }
            if (i7 == i5) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
            } else if (i7 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
            } else {
                String u = ld0.u(i7);
                if (i7 != 5 || rp0Var3.o() || np0Var2.f) {
                    c1Var4.g(u);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            ps0Var = ps0Var2;
        }
        obtain.setPackageName(f3Var3.getContext().getPackageName());
        boolean K = nz.K(rp0Var3);
        if (i6 >= 24) {
            obtain.setImportantForAccessibility(K);
        }
        boolean e = i6 >= 34 ? l0.e(accessibilityManager) : true;
        List j = rp0.j(4, rp0Var3);
        int size = j.size();
        boolean z10 = e;
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9;
            rp0 rp0Var4 = (rp0) j.get(i9);
            int i11 = size;
            zy l3 = n3Var3.l();
            List list = j;
            int i12 = rp0Var4.g;
            if (l3.a(i12)) {
                if (f3Var3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(rp0Var4.c) != null) {
                    g8.q();
                    return null;
                }
                if (i12 != -1) {
                    tp0 tp0Var2 = (tp0) n3Var3.l().b(i12);
                    if (tp0Var2 == null || (rp0Var2 = tp0Var2.a) == null) {
                        z9 = false;
                    } else {
                        Object g5 = rp0Var2.k().d.g(vp0.n);
                        if (g5 == null) {
                            g5 = null;
                        }
                        z9 = nz.l(g5, Boolean.TRUE);
                    }
                    if (z10 || !z9) {
                        obtain.addChild(f3Var3, i12);
                    }
                    n60Var2.f(i12, i8);
                    i8++;
                }
            }
            i9 = i10 + 1;
            size = i11;
            j = list;
        }
        int i13 = n3Var3.n;
        AccessibilityNodeInfo accessibilityNodeInfo4 = c1Var4.a;
        if (i == i13) {
            accessibilityNodeInfo4.setAccessibilityFocused(true);
            c1Var4.a(y0.d);
        } else {
            accessibilityNodeInfo4.setAccessibilityFocused(false);
            c1Var4.a(y0.c);
        }
        l7 x = a50.x(rp0Var3);
        if (x != null) {
            f3Var3.getFontFamilyResolver();
            sl density = f3Var3.getDensity();
            t7 t7Var = n3Var3.I;
            f3Var = f3Var3;
            String str = x.e;
            p10Var = p10Var3;
            List list2 = x.d;
            SpannableString spannableString2 = new SpannableString(str);
            ArrayList arrayList3 = x.f;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                n3Var = n3Var3;
                int i14 = 0;
                while (i14 < size2) {
                    int i15 = i14;
                    k7 k7Var = (k7) arrayList3.get(i14);
                    ArrayList arrayList4 = arrayList3;
                    ns0 ns0Var = (ns0) k7Var.a;
                    int i16 = size2;
                    int i17 = k7Var.b;
                    int i18 = k7Var.c;
                    n60 n60Var3 = n60Var2;
                    np0 np0Var3 = np0Var2;
                    long b = ns0Var.a.b();
                    rp0 rp0Var5 = rp0Var3;
                    tl0 tl0Var4 = tl0Var3;
                    long j2 = ns0Var.b;
                    ut utVar = ns0Var.c;
                    st stVar = ns0Var.d;
                    lv0 lv0Var = ns0Var.j;
                    t30 t30Var = ns0Var.k;
                    AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                    c1 c1Var5 = c1Var4;
                    long j3 = ns0Var.l;
                    gv0 gv0Var = ns0Var.m;
                    kv0 kv0Var = ns0Var.a;
                    AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                    a70 a70Var3 = a70Var2;
                    if (!ge.c(b, kv0Var.b())) {
                        kv0Var = b != 16 ? new se(b) : jv0.a;
                    }
                    yc0.n(spannableString2, kv0Var.b(), i17, i18);
                    SpannableString spannableString3 = spannableString2;
                    yc0.p(spannableString3, j2, density, i17, i18);
                    if (utVar == null && stVar == null) {
                        i4 = 33;
                    } else {
                        i4 = 33;
                        spannableString3.setSpan(new StyleSpan(nk.t(utVar == null ? ut.f : utVar, stVar != null ? stVar.a : 0)), i17, i18, 33);
                    }
                    if (gv0Var != null) {
                        int i19 = gv0Var.a;
                        if ((i19 | 1) == i19) {
                            spannableString3.setSpan(new UnderlineSpan(), i17, i18, i4);
                        }
                        if ((i19 | 2) == i19) {
                            spannableString3.setSpan(new StrikethroughSpan(), i17, i18, i4);
                        }
                    }
                    if (lv0Var != null) {
                        spannableString3.setSpan(new ScaleXSpan(lv0Var.a), i17, i18, i4);
                    }
                    yc0.q(spannableString3, t30Var, i17, i18);
                    if (j3 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(d31.I(j3)), i17, i18, i4);
                    }
                    spannableString2 = spannableString3;
                    i14 = i15 + 1;
                    a70Var2 = a70Var3;
                    arrayList3 = arrayList4;
                    size2 = i16;
                    n60Var2 = n60Var3;
                    np0Var2 = np0Var3;
                    rp0Var3 = rp0Var5;
                    tl0Var3 = tl0Var4;
                    obtain = accessibilityNodeInfo5;
                    c1Var4 = c1Var5;
                    accessibilityNodeInfo4 = accessibilityNodeInfo6;
                }
            } else {
                n3Var = n3Var3;
            }
            n60Var = n60Var2;
            np0Var = np0Var2;
            rp0Var = rp0Var3;
            tl0Var = tl0Var3;
            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
            accessibilityNodeInfo = obtain;
            c1Var = c1Var4;
            SpannableString spannableString4 = spannableString2;
            a70Var = a70Var2;
            int length = str.length();
            ?? r2 = wp.d;
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i20 = 0; i20 < size3; i20++) {
                    Object obj = list2.get(i20);
                    k7 k7Var2 = (k7) obj;
                    if ((k7Var2.a instanceof qz0) && m7.a(0, length, k7Var2.b, k7Var2.c)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r2;
            }
            int size4 = arrayList.size();
            for (int i21 = 0; i21 < size4; i21++) {
                k7 k7Var3 = (k7) arrayList.get(i21);
                qz0 qz0Var = (qz0) k7Var3.a;
                int i22 = k7Var3.b;
                int i23 = k7Var3.c;
                if (!(qz0Var instanceof qz0)) {
                    g8.c();
                    return null;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(qz0Var.a).build(), i22, i23, 33);
            }
            int length2 = str.length();
            if (list2 != null) {
                arrayList2 = new ArrayList(list2.size());
                int size5 = list2.size();
                for (int i24 = 0; i24 < size5; i24++) {
                    Object obj2 = list2.get(i24);
                    k7 k7Var4 = (k7) obj2;
                    if ((k7Var4.a instanceof vy0) && m7.a(0, length2, k7Var4.b, k7Var4.c)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r2;
            }
            int size6 = arrayList2.size();
            for (int i25 = 0; i25 < size6; i25++) {
                k7 k7Var5 = (k7) arrayList2.get(i25);
                vy0 vy0Var = (vy0) k7Var5.a;
                int i26 = k7Var5.b;
                int i27 = k7Var5.c;
                WeakHashMap weakHashMap = (WeakHashMap) t7Var.e;
                Object obj3 = weakHashMap.get(vy0Var);
                if (obj3 == null) {
                    obj3 = new URLSpan(vy0Var.a);
                    weakHashMap.put(vy0Var, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i26, i27, 33);
            }
            int length3 = str.length();
            if (list2 != null) {
                r2 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i28 = 0; i28 < size7; i28++) {
                    Object obj4 = list2.get(i28);
                    k7 k7Var6 = (k7) obj4;
                    if ((k7Var6.a instanceof g30) && m7.a(0, length3, k7Var6.b, k7Var6.c)) {
                        r2.add(obj4);
                    }
                }
            }
            int size8 = r2.size();
            for (int i29 = 0; i29 < size8; i29++) {
                k7 k7Var7 = (k7) r2.get(i29);
                int i30 = k7Var7.b;
                Object obj5 = k7Var7.a;
                int i31 = k7Var7.c;
                if (i30 != i31) {
                    g30 g30Var = (g30) obj5;
                    if (g30Var instanceof f30) {
                        obj5.getClass();
                        f30 f30Var = (f30) obj5;
                        k7 k7Var8 = new k7(i30, i31, f30Var);
                        WeakHashMap weakHashMap2 = (WeakHashMap) t7Var.f;
                        Object obj6 = weakHashMap2.get(k7Var8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(f30Var.a);
                            weakHashMap2.put(k7Var8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i30, i31, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) t7Var.g;
                        Object obj7 = weakHashMap3.get(k7Var7);
                        if (obj7 == null) {
                            obj7 = new ng(g30Var);
                            weakHashMap3.put(k7Var7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i30, i31, 33);
                    }
                }
            }
            spannableString = (SpannableString) n3.G(spannableString4);
            accessibilityNodeInfo2 = accessibilityNodeInfo7;
        } else {
            n3Var = n3Var3;
            f3Var = f3Var3;
            n60Var = n60Var2;
            np0Var = np0Var2;
            rp0Var = rp0Var3;
            tl0Var = tl0Var3;
            p10Var = p10Var3;
            accessibilityNodeInfo = obtain;
            c1Var = c1Var4;
            a70Var = a70Var2;
            spannableString = null;
            accessibilityNodeInfo2 = accessibilityNodeInfo4;
        }
        accessibilityNodeInfo2.setText(spannableString);
        yp0 yp0Var = vp0.I;
        if (a70Var.c(yp0Var)) {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
            accessibilityNodeInfo3.setContentInvalid(true);
            Object g6 = a70Var.g(yp0Var);
            if (g6 == null) {
                g6 = null;
            }
            accessibilityNodeInfo3.setError((CharSequence) g6);
        } else {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
        }
        rp0 rp0Var6 = rp0Var;
        String w = a50.w(rp0Var6, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            z0.f(accessibilityNodeInfo2, w);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", w);
        }
        accessibilityNodeInfo3.setCheckable(a50.v(rp0Var6));
        Object g7 = a70Var.g(vp0.G);
        if (g7 == null) {
            g7 = null;
        }
        pw0 pw0Var = (pw0) g7;
        if (pw0Var != null) {
            if (pw0Var == pw0.d) {
                accessibilityNodeInfo2.setChecked(true);
            } else if (pw0Var == pw0.e) {
                accessibilityNodeInfo2.setChecked(false);
            }
        }
        Object g8 = a70Var.g(vp0.F);
        if (g8 == null) {
            g8 = null;
        }
        Boolean bool = (Boolean) g8;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (tl0Var == null) {
                tl0Var2 = tl0Var;
                i2 = 4;
            } else {
                tl0Var2 = tl0Var;
                i2 = 4;
                if (tl0Var2.a == 4) {
                    accessibilityNodeInfo3.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo2.setChecked(booleanValue);
        } else {
            tl0Var2 = tl0Var;
            i2 = 4;
        }
        np0 np0Var4 = np0Var;
        if (!np0Var4.f || rp0.j(i2, rp0Var6).isEmpty()) {
            Object g9 = a70Var.g(vp0.a);
            if (g9 == null) {
                g9 = null;
            }
            List list3 = (List) g9;
            accessibilityNodeInfo3.setContentDescription(list3 != null ? (String) zd.d0(list3) : null);
        }
        Object g10 = a70Var.g(vp0.x);
        if (g10 == null) {
            g10 = null;
        }
        String str2 = (String) g10;
        if (str2 != null) {
            rp0 rp0Var7 = rp0Var6;
            while (true) {
                if (rp0Var7 == null) {
                    z8 = false;
                    break;
                }
                np0 np0Var5 = rp0Var7.d;
                yp0 yp0Var2 = wp0.a;
                if (np0Var5.d.c(yp0Var2)) {
                    z8 = ((Boolean) np0Var5.b(yp0Var2)).booleanValue();
                    break;
                }
                rp0Var7 = rp0Var7.l();
            }
            if (z8) {
                accessibilityNodeInfo3.setViewIdResourceName(str2);
            }
        }
        Object g11 = a70Var.g(vp0.h);
        if (g11 == null) {
            g11 = null;
        }
        if (((ky0) g11) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo2.setHeading(true);
            } else {
                c1Var2 = c1Var;
                c1Var2.f(2, true);
                i3 = i;
                if (i3 != -1) {
                    int d = n60Var.d(rp0Var6.g);
                    if (d == -1) {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        accessibilityNodeInfo3.setDrawingOrder(d);
                    }
                }
                accessibilityNodeInfo3.setPassword(a70Var.c(vp0.H));
                accessibilityNodeInfo3.setEditable(a70Var.c(vp0.J));
                g = a70Var.g(vp0.K);
                if (g == null) {
                    g = null;
                }
                Integer num = (Integer) g;
                accessibilityNodeInfo3.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo3.setEnabled(a50.f(rp0Var6));
                yp0 yp0Var3 = vp0.k;
                accessibilityNodeInfo3.setFocusable(a70Var.c(yp0Var3));
                if (accessibilityNodeInfo3.isFocusable()) {
                    n3Var2 = n3Var;
                } else {
                    accessibilityNodeInfo3.setFocused(((Boolean) np0Var4.b(yp0Var3)).booleanValue());
                    if (!accessibilityNodeInfo3.isFocused()) {
                        n3Var2 = n3Var;
                        z = true;
                        accessibilityNodeInfo2.addAction(1);
                        accessibilityNodeInfo3.setVisibleToUser(nz.I(rp0Var6) ^ z);
                        g2 = a70Var.g(vp0.j);
                        if (g2 == null) {
                            g2 = null;
                        }
                        if (g2 != null) {
                            g8.q();
                            return null;
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object g12 = a70Var.g(mp0.b);
                        if (g12 == null) {
                            g12 = null;
                        }
                        h0 h0Var = (h0) g12;
                        if (h0Var != null) {
                            Object g13 = a70Var.g(vp0.F);
                            if (g13 == null) {
                                g13 = null;
                            }
                            boolean l4 = nz.l(g13, Boolean.TRUE);
                            if (!(tl0Var2 != null && tl0Var2.a == 4)) {
                                if (!(tl0Var2 != null && tl0Var2.a == 3)) {
                                    z7 = false;
                                    accessibilityNodeInfo2.setClickable(z7 || (z7 && !l4));
                                    if (a50.f(rp0Var6) && accessibilityNodeInfo3.isClickable()) {
                                        c1Var2.a(new y0(null, 16, h0Var.a, null));
                                    }
                                }
                            }
                            z7 = true;
                            accessibilityNodeInfo2.setClickable(z7 || (z7 && !l4));
                            if (a50.f(rp0Var6)) {
                                c1Var2.a(new y0(null, 16, h0Var.a, null));
                            }
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        h0 h0Var2 = (h0) rg0.m(np0Var4, mp0.c);
                        if (h0Var2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (a50.f(rp0Var6)) {
                                c1Var2.a(new y0(h0Var2.a, 32));
                            }
                        }
                        h0 h0Var3 = (h0) rg0.m(np0Var4, mp0.n);
                        if (h0Var3 != null) {
                            c1Var2.a(new y0(h0Var3.a, 16384));
                        }
                        if (a50.f(rp0Var6)) {
                            h0 h0Var4 = (h0) rg0.m(np0Var4, mp0.i);
                            if (h0Var4 != null) {
                                c1Var2.a(new y0(h0Var4.a, 2097152));
                            }
                            h0 h0Var5 = (h0) rg0.m(np0Var4, mp0.m);
                            if (h0Var5 != null) {
                                c1Var2.a(new y0(h0Var5.a, android.R.id.accessibilityActionImeEnter));
                            }
                            h0 h0Var6 = (h0) rg0.m(np0Var4, mp0.o);
                            if (h0Var6 != null) {
                                c1Var2.a(new y0(h0Var6.a, 65536));
                            }
                            h0 h0Var7 = (h0) rg0.m(np0Var4, mp0.p);
                            if (h0Var7 != null && accessibilityNodeInfo3.isFocused()) {
                                ClipDescription primaryClipDescription = f3Var.m13getClipboardManager().a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    c1Var2.a(new y0(h0Var7.a, 32768));
                                }
                            }
                        }
                        String m = n3.m(rp0Var6);
                        if (!(m == null || m.length() == 0)) {
                            accessibilityNodeInfo3.setTextSelection(n3Var2.k(rp0Var6), n3Var2.j(rp0Var6));
                            h0 h0Var8 = (h0) rg0.m(np0Var4, mp0.h);
                            c1Var2.a(new y0(h0Var8 != null ? h0Var8.a : null, 131072));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            List list4 = (List) rg0.m(np0Var4, vp0.a);
                            if ((list4 == null || list4.isEmpty()) && a70Var.c(mp0.a)) {
                                if (!a70Var.c(vp0.D) || nz.l(rg0.m(np0Var4, yp0Var3), Boolean.TRUE)) {
                                    p10 n = p10Var.n();
                                    while (true) {
                                        if (n == null) {
                                            n = null;
                                            break;
                                        }
                                        np0 p = n.p();
                                        if (p != null && p.f) {
                                            if (p.d.c(vp0.D)) {
                                                z6 = true;
                                                if (!z6) {
                                                    break;
                                                }
                                                n = n.n();
                                            }
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                    }
                                    if (n != null) {
                                        np0 p2 = n.p();
                                        if (p2 != null) {
                                            Object g14 = p2.d.g(yp0Var3);
                                            if (g14 == null) {
                                                g14 = null;
                                            }
                                            z5 = nz.l(g14, Boolean.TRUE);
                                        } else {
                                            z5 = false;
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                }
                                z4 = true;
                                if (!z4) {
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add("androidx.compose.ui.semantics.id");
                            CharSequence e2 = c1Var2.e();
                            if (!(e2 == null || e2.length() == 0) && a70Var.c(mp0.a)) {
                                arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (a70Var.c(vp0.x)) {
                                arrayList5.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (a70Var.c(vp0.L)) {
                                arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                            }
                        }
                        di0 di0Var = (di0) rg0.m(np0Var4, vp0.c);
                        float f2 = 0.0f;
                        if (di0Var != null) {
                            yp0 yp0Var4 = mp0.g;
                            if (a70Var.c(yp0Var4)) {
                                c1Var2.g("android.widget.SeekBar");
                            } else {
                                c1Var2.g("android.widget.ProgressBar");
                            }
                            if (di0Var != di0.b) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                            if (a70Var.c(yp0Var4)) {
                                a50.f(rp0Var6);
                            }
                        }
                        int i32 = Build.VERSION.SDK_INT;
                        if (i32 >= 24) {
                            mz.q(c1Var2, rp0Var6);
                        }
                        Object g15 = rp0Var6.k().d.g(vp0.f);
                        if (g15 == null) {
                            g15 = null;
                        }
                        if (g15 == null) {
                            ArrayList arrayList6 = new ArrayList();
                            Object g16 = rp0Var6.k().d.g(vp0.e);
                            if (g16 == null) {
                                g16 = null;
                            }
                            if (g16 != null) {
                                List j4 = rp0.j(4, rp0Var6);
                                int size9 = j4.size();
                                int i33 = 0;
                                while (i33 < size9) {
                                    rp0 rp0Var8 = (rp0) j4.get(i33);
                                    float f3 = f2;
                                    if (rp0Var8.k().d.c(vp0.F)) {
                                        arrayList6.add(rp0Var8);
                                    }
                                    i33++;
                                    f2 = f3;
                                }
                            }
                            f = f2;
                            if (!arrayList6.isEmpty()) {
                                boolean l5 = a50.l(arrayList6);
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(l5 ? 1 : arrayList6.size(), l5 ? arrayList6.size() : 1, false, 0));
                            }
                        } else {
                            f = 0.0f;
                            g8.q();
                        }
                        a50.K(c1Var2, rp0Var6);
                        zn0 zn0Var = (zn0) rg0.m(np0Var4, vp0.t);
                        h0 h0Var9 = (h0) rg0.m(np0Var4, mp0.d);
                        if (zn0Var != null && h0Var9 != null) {
                            Object g17 = rp0Var6.k().d.g(vp0.f);
                            if (g17 == null) {
                                g17 = null;
                            }
                            if (g17 == null) {
                                Object g18 = rp0Var6.k().d.g(vp0.e);
                                if (g18 == null) {
                                    g18 = null;
                                }
                                if (g18 == null) {
                                    z3 = false;
                                    if (!z3) {
                                        c1Var2.g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) zn0Var.b.a()).floatValue() > f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (a50.f(rp0Var6)) {
                                        boolean r = n3.r(zn0Var);
                                        c10 c10Var = c10.e;
                                        if (r) {
                                            c1Var2.a(y0.e);
                                            p10Var2 = p10Var;
                                            c1Var2.a(!(p10Var2.z == c10Var) ? y0.j : y0.h);
                                        } else {
                                            p10Var2 = p10Var;
                                        }
                                        if (n3.q(zn0Var)) {
                                            c1Var2.a(y0.f);
                                            c1Var2.a(!(p10Var2.z == c10Var) ? y0.h : y0.j);
                                        }
                                    }
                                }
                            }
                            z3 = true;
                            if (!z3) {
                            }
                            if (((Number) zn0Var.b.a()).floatValue() > f) {
                            }
                            if (a50.f(rp0Var6)) {
                            }
                        }
                        zn0 zn0Var2 = (zn0) rg0.m(np0Var4, vp0.u);
                        if (zn0Var2 != null && h0Var9 != null) {
                            Object g19 = rp0Var6.k().d.g(vp0.f);
                            if (g19 == null) {
                                g19 = null;
                            }
                            if (g19 == null) {
                                Object g20 = rp0Var6.k().d.g(vp0.e);
                                if (g20 == null) {
                                    g20 = null;
                                }
                                if (g20 == null) {
                                    z2 = false;
                                    if (!z2) {
                                        c1Var2.g("android.widget.ScrollView");
                                    }
                                    if (((Number) zn0Var2.b.a()).floatValue() > f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (a50.f(rp0Var6)) {
                                        if (n3.r(zn0Var2)) {
                                            c1Var2.a(y0.e);
                                            c1Var2.a(y0.i);
                                        }
                                        if (n3.q(zn0Var2)) {
                                            c1Var2.a(y0.f);
                                            c1Var2.a(y0.g);
                                        }
                                    }
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                            if (((Number) zn0Var2.b.a()).floatValue() > f) {
                            }
                            if (a50.f(rp0Var6)) {
                            }
                        }
                        if (i32 >= 29) {
                            nz.k(c1Var2, rp0Var6);
                        }
                        CharSequence charSequence = (CharSequence) rg0.m(rp0Var6.m(), vp0.d);
                        if (i32 >= 28) {
                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (a50.f(rp0Var6)) {
                            h0 h0Var10 = (h0) rg0.m(rp0Var6.m(), mp0.q);
                            if (h0Var10 != null) {
                                c1Var2.a(new y0(h0Var10.a, 262144));
                            }
                            h0 h0Var11 = (h0) rg0.m(rp0Var6.m(), mp0.r);
                            if (h0Var11 != null) {
                                c1Var2.a(new y0(h0Var11.a, 524288));
                            }
                            h0 h0Var12 = (h0) rg0.m(rp0Var6.m(), mp0.s);
                            if (h0Var12 != null) {
                                c1Var2.a(new y0(h0Var12.a, 1048576));
                            }
                            np0 m2 = rp0Var6.m();
                            yp0 yp0Var5 = mp0.u;
                            if (m2.d.c(mp0.u)) {
                                List list5 = (List) rp0Var6.m().b(yp0Var5);
                                int size10 = list5.size();
                                o60 o60Var = n3.Q;
                                if (size10 >= o60Var.b) {
                                    throw new IllegalStateException("Can't have more than " + o60Var.b + " custom actions for one widget");
                                }
                                ps0 ps0Var3 = new ps0();
                                w60 a = ma0.a();
                                ps0 ps0Var4 = ps0Var;
                                if (ps0Var4.d) {
                                    x40.m(ps0Var4);
                                }
                                if (nz.o(ps0Var4.e, ps0Var4.g, i3) >= 0) {
                                    w60 w60Var = (w60) ps0Var4.b(i3);
                                    int[] iArr = o60Var.a;
                                    int i34 = o60Var.b;
                                    int i35 = 0;
                                    int[] iArr2 = new int[16];
                                    int i36 = 0;
                                    while (i36 < i34) {
                                        int i37 = iArr[i36];
                                        int i38 = i34;
                                        int i39 = i35 + 1;
                                        w60 w60Var2 = w60Var;
                                        if (iArr2.length < i39) {
                                            iArr2 = Arrays.copyOf(iArr2, Math.max(i39, (iArr2.length * 3) / 2));
                                        }
                                        iArr2[i35] = i37;
                                        i36++;
                                        i35 = i39;
                                        i34 = i38;
                                        w60Var = w60Var2;
                                    }
                                    w60 w60Var3 = w60Var;
                                    ArrayList arrayList7 = new ArrayList();
                                    if (list5.size() > 0) {
                                        y6.B(list5.get(0));
                                        w60Var3.getClass();
                                        throw null;
                                    }
                                    if (arrayList7.size() > 0) {
                                        y6.B(arrayList7.get(0));
                                        if (i35 <= 0) {
                                            g8.m("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i40 = iArr2[0];
                                        throw null;
                                    }
                                } else if (list5.size() > 0) {
                                    y6.B(list5.get(0));
                                    o60Var.b(0);
                                    throw null;
                                }
                                n3Var2.u.d(i3, ps0Var3);
                                ps0Var4.d(i3, a);
                            }
                        }
                        boolean g21 = a50.g(rp0Var6, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo2.setScreenReaderFocusable(g21);
                        } else {
                            c1Var2.f(1, g21);
                        }
                        int d2 = n3Var2.E.d(i3);
                        if (d2 != -1) {
                            ld0.q(f3Var.getAndroidViewsHandler$ui_release(), d2);
                            f3Var2 = f3Var;
                            accessibilityNodeInfo2.setTraversalBefore(f3Var2, d2);
                            n3Var2.b(i3, c1Var2, n3Var2.G, null);
                        } else {
                            f3Var2 = f3Var;
                        }
                        int d3 = n3Var2.F.d(i3);
                        if (d3 != -1) {
                            ld0.q(f3Var2.getAndroidViewsHandler$ui_release(), d3);
                        }
                        String str3 = (String) rg0.m(rp0Var6.m(), wp0.b);
                        if (str3 != null) {
                            c1Var2.g(str3);
                        }
                        c1Var3 = c1Var2;
                        if (n3Var2.r) {
                        }
                        return c1Var3;
                    }
                    accessibilityNodeInfo2.addAction(2);
                    n3Var2 = n3Var;
                    n3Var2.o = i3;
                }
                z = true;
                accessibilityNodeInfo3.setVisibleToUser(nz.I(rp0Var6) ^ z);
                g2 = a70Var.g(vp0.j);
                if (g2 == null) {
                }
                if (g2 != null) {
                }
            }
        }
        c1Var2 = c1Var;
        i3 = i;
        if (i3 != -1) {
        }
        accessibilityNodeInfo3.setPassword(a70Var.c(vp0.H));
        accessibilityNodeInfo3.setEditable(a70Var.c(vp0.J));
        g = a70Var.g(vp0.K);
        if (g == null) {
        }
        Integer num2 = (Integer) g;
        accessibilityNodeInfo3.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo3.setEnabled(a50.f(rp0Var6));
        yp0 yp0Var32 = vp0.k;
        accessibilityNodeInfo3.setFocusable(a70Var.c(yp0Var32));
        if (accessibilityNodeInfo3.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo3.setVisibleToUser(nz.I(rp0Var6) ^ z);
        g2 = a70Var.g(vp0.j);
        if (g2 == null) {
        }
        if (g2 != null) {
        }
    }

    public AutofillId h(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession f = n2.f(this.e);
        u8 e = yc0.e((View) this.f);
        Objects.requireNonNull(e);
        return zi.b(f, t0.e(e.a), j);
    }

    public String toString() {
        switch (this.d) {
            case 17:
                return "Bounds{lower=" + ((oy) this.e) + " upper=" + ((oy) this.f) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j3(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    public j3(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.d = 17;
        lowerBound = bounds.getLowerBound();
        this.e = oy.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f = oy.d(upperBound);
    }

    public j3(p01 p01Var) {
        this.d = 2;
        this.e = p01Var;
        this.f = a.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j3(n3 n3Var) {
        this(0);
        this.d = 0;
        this.f = n3Var;
    }
}
