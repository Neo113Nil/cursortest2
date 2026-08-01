package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class yc0 {
    public static final rp0 a(p10 p10Var, boolean z) {
        t50 t50Var = (t50) p10Var.F.j;
        Object obj = null;
        if ((t50Var.g & 8) != 0) {
            loop0: while (true) {
                if (t50Var == null) {
                    break;
                }
                if ((t50Var.f & 8) != 0) {
                    t50 t50Var2 = t50Var;
                    l70 l70Var = null;
                    while (t50Var2 != null) {
                        if (t50Var2 instanceof pp0) {
                            obj = t50Var2;
                            break loop0;
                        }
                        if ((t50Var2.f & 8) != 0 && (t50Var2 instanceof ol)) {
                            int i = 0;
                            for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                if ((t50Var3.f & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        t50Var2 = t50Var3;
                                    } else {
                                        if (l70Var == null) {
                                            l70Var = new l70(new t50[16]);
                                        }
                                        if (t50Var2 != null) {
                                            l70Var.b(t50Var2);
                                            t50Var2 = null;
                                        }
                                        l70Var.b(t50Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        t50Var2 = nz.j(l70Var);
                    }
                }
                if ((t50Var.g & 8) == 0) {
                    break;
                }
                t50Var = t50Var.i;
            }
        }
        obj.getClass();
        t50 t50Var4 = ((t50) ((pp0) obj)).d;
        np0 p = p10Var.p();
        if (p == null) {
            p = new np0();
        }
        return new rp0(t50Var4, z, p10Var, p);
    }

    public static final int b(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [t50] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final ix0 c(nl nlVar, Object obj) {
        ca0 ca0Var;
        t50 t50Var = (t50) nlVar;
        if (!t50Var.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var2 = t50Var.d.h;
        p10 a0 = nz.a0(nlVar);
        while (a0 != null) {
            if ((((t50) a0.F.j).g & 262144) != 0) {
                while (t50Var2 != null) {
                    if ((t50Var2.f & 262144) != 0) {
                        ol olVar = t50Var2;
                        ?? r4 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof ix0) {
                                ix0 ix0Var = (ix0) olVar;
                                if (obj.equals(ix0Var.j())) {
                                    return ix0Var;
                                }
                            } else if ((olVar.f & 262144) != 0 && (olVar instanceof ol)) {
                                t50 t50Var3 = olVar.s;
                                int i = 0;
                                olVar = olVar;
                                r4 = r4;
                                while (t50Var3 != null) {
                                    if ((t50Var3.f & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            olVar = t50Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r4.b(olVar);
                                                olVar = 0;
                                            }
                                            r4.b(t50Var3);
                                        }
                                    }
                                    t50Var3 = t50Var3.i;
                                    olVar = olVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            olVar = nz.j(r4);
                        }
                    }
                    t50Var2 = t50Var2.h;
                }
            }
            a0 = a0.n();
            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ix0, java.lang.Object, nl] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [t50] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [t50] */
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
    public static final ix0 d(ix0 ix0Var) {
        ca0 ca0Var;
        t50 t50Var = (t50) ix0Var;
        if (!t50Var.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var2 = t50Var.d.h;
        p10 a0 = nz.a0(ix0Var);
        while (a0 != null) {
            if ((((t50) a0.F.j).g & 262144) != 0) {
                while (t50Var2 != null) {
                    if ((t50Var2.f & 262144) != 0) {
                        ol olVar = t50Var2;
                        ?? r5 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof ix0) {
                                ix0 ix0Var2 = (ix0) olVar;
                                if (nz.l(ix0Var.j(), ix0Var2.j()) && ix0Var.getClass() == ix0Var2.getClass()) {
                                    return ix0Var2;
                                }
                            } else if ((olVar.f & 262144) != 0 && (olVar instanceof ol)) {
                                t50 t50Var3 = olVar.s;
                                int i = 0;
                                olVar = olVar;
                                r5 = r5;
                                while (t50Var3 != null) {
                                    if ((t50Var3.f & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            olVar = t50Var3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r5.b(olVar);
                                                olVar = 0;
                                            }
                                            r5.b(t50Var3);
                                        }
                                    }
                                    t50Var3 = t50Var3.i;
                                    olVar = olVar;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            olVar = nz.j(r5);
                        }
                    }
                    t50Var2 = t50Var2.h;
                }
            }
            a0 = a0.n();
            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        return null;
    }

    public static u8 e(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new u8(oe.b(view));
        }
        return null;
    }

    public static final float f(sl slVar, boolean z, long j) {
        float c = ra0.c(mz.o(fr0.e(j), fr0.c(j))) / 2.0f;
        return z ? slVar.o(10.0f) + c : c;
    }

    public static or0 g(or0 or0Var) {
        if (or0Var instanceof fx0) {
            fx0 fx0Var = (fx0) or0Var;
            if (fx0Var.t == rg0.j()) {
                fx0Var.r = null;
                return or0Var;
            }
        }
        if (or0Var instanceof gx0) {
            gx0 gx0Var = (gx0) or0Var;
            if (gx0Var.i == rg0.j()) {
                gx0Var.h = null;
                return or0Var;
            }
        }
        or0 h = ur0.h(or0Var, null, false);
        h.j();
        return h;
    }

    public static Object h(mu muVar, bu buVar) {
        or0 fx0Var;
        if (muVar == null) {
            return buVar.a();
        }
        or0 or0Var = (or0) ur0.b.o();
        if (or0Var instanceof fx0) {
            fx0 fx0Var2 = (fx0) or0Var;
            if (fx0Var2.t == rg0.j()) {
                mu muVar2 = fx0Var2.r;
                mu muVar3 = fx0Var2.s;
                try {
                    ((fx0) or0Var).r = ur0.l(muVar, muVar2, true);
                    ((fx0) or0Var).s = muVar3;
                    return buVar.a();
                } finally {
                    fx0Var2.r = muVar2;
                    fx0Var2.s = muVar3;
                }
            }
        }
        if (or0Var == null || (or0Var instanceof e70)) {
            fx0Var = new fx0(or0Var instanceof e70 ? (e70) or0Var : null, muVar, null, true, false);
        } else {
            if (muVar == null) {
                return buVar.a();
            }
            fx0Var = or0Var.u(muVar);
        }
        try {
            or0 j = fx0Var.j();
            try {
                Object a = buVar.a();
                or0.q(j);
                fx0Var.c();
                return a;
            } catch (Throwable th) {
                or0.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            fx0Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ViewStructure viewStructure, p10 p10Var, AutofillId autofillId, String str, bj0 bj0Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        pw0 pw0Var;
        tl0 tl0Var;
        l7 l7Var;
        f4 f4Var;
        boolean z;
        hj hjVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        boolean z3;
        String[] C;
        AutofillValue forText;
        String u;
        String[] C2;
        String[] C3;
        a70 a70Var;
        int i2;
        int i3;
        int i4;
        a70 a70Var2;
        pw0 pw0Var2;
        tl0 tl0Var2;
        l7 l7Var2;
        Integer num3 = 1;
        yp0 yp0Var = vp0.a;
        yp0 yp0Var2 = mp0.a;
        np0 p = p10Var.p();
        int i5 = 8;
        if (p == null || (a70Var2 = p.d) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            pw0Var = null;
            tl0Var = null;
            l7Var = null;
            f4Var = null;
            z = false;
            hjVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr = a70Var2.b;
            Object[] objArr2 = a70Var2.c;
            long[] jArr = a70Var2.a;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                int i6 = 0;
                f4Var = null;
                z = false;
                pw0Var2 = null;
                hjVar = null;
                bool = null;
                tl0Var2 = null;
                z2 = false;
                num = null;
                l7Var2 = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i6];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                yp0 yp0Var3 = (yp0) obj;
                                if (nz.l(yp0Var3, vp0.r)) {
                                    obj2.getClass();
                                    f4Var = (f4) obj2;
                                } else if (nz.l(yp0Var3, vp0.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) zd.d0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (nz.l(yp0Var3, vp0.q)) {
                                    obj2.getClass();
                                    hjVar = (hj) obj2;
                                } else if (nz.l(yp0Var3, vp0.D)) {
                                    obj2.getClass();
                                    l7Var2 = (l7) obj2;
                                } else if (nz.l(yp0Var3, vp0.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (nz.l(yp0Var3, vp0.K)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (nz.l(yp0Var3, vp0.H)) {
                                    z2 = true;
                                } else if (nz.l(yp0Var3, vp0.w)) {
                                    obj2.getClass();
                                    tl0Var2 = (tl0) obj2;
                                } else if (nz.l(yp0Var3, vp0.F)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (nz.l(yp0Var3, vp0.G)) {
                                    obj2.getClass();
                                    pw0Var2 = (pw0) obj2;
                                } else if (nz.l(yp0Var3, mp0.b)) {
                                    viewStructure.setClickable(true);
                                } else if (nz.l(yp0Var3, mp0.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (nz.l(yp0Var3, mp0.t)) {
                                    viewStructure.setFocusable(true);
                                } else if (nz.l(yp0Var3, mp0.i)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            } else {
                c = 7;
                j3 = -9187201950435737472L;
                f4Var = null;
                z = false;
                pw0Var2 = null;
                hjVar = null;
                bool = null;
                tl0Var2 = null;
                z2 = false;
                num = null;
                l7Var2 = null;
            }
            pw0Var = pw0Var2;
            tl0Var = tl0Var2;
            l7Var = l7Var2;
        }
        np0 p2 = p10Var.p();
        if (p2 != null && p2.f && !p2.g) {
            p2 = p2.a();
            x60 x60Var = new x60(((i70) p10Var.i()).d.f);
            x60Var.b(p10Var.i());
            while (x60Var.h()) {
                p10 p10Var2 = (p10) x60Var.j(x60Var.b - 1);
                np0 p3 = p10Var2.p();
                if (p3 != null && !p3.f) {
                    p2.c(p3);
                    if (!p3.g) {
                        x60Var.b(p10Var2.i());
                    }
                }
            }
        }
        if (p2 != null && (a70Var = p2.d) != null) {
            Object[] objArr3 = a70Var.b;
            Object[] objArr4 = a70Var.c;
            long[] jArr2 = a70Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i10];
                    num2 = num3;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = objArr3[i13];
                                Object obj4 = objArr4[i13];
                                i4 = i5;
                                yp0 yp0Var4 = (yp0) obj3;
                                i3 = i12;
                                if (nz.l(yp0Var4, vp0.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (nz.l(yp0Var4, vp0.z)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i3 = i12;
                                i4 = i5;
                            }
                            j5 >>= i4;
                            i12 = i3 + 1;
                            i5 = i4;
                        }
                        i2 = i5;
                        if (i11 != i2) {
                            break;
                        }
                    } else {
                        i2 = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i2;
                    num3 = num2;
                }
                Integer valueOf2 = Integer.valueOf(p10Var.e);
                if (p10Var.n() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (f4Var == null && !z) ? pw0Var == null ? Integer.valueOf(i) : null : num2;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (hjVar != null && (C3 = x40.C(hjVar)) != null) {
                    viewStructure.setAutofillHints(C3);
                }
                bj0Var.a.b(p10Var.e, new fh0(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (pw0Var != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(pw0Var == pw0.d);
                } else if (bool != null && (tl0Var == null || tl0Var.a != 4)) {
                    z3 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    hj.a.getClass();
                    C = x40.C(gj.b);
                    C.getClass();
                    if (C.length != 0) {
                        g8.e("Array is empty.");
                        return;
                    }
                    boolean z4 = (hjVar == null || (C2 = x40.C(hjVar)) == null || p8.b0(C2, C[0]) < 0) ? false : z3;
                    if (!z2 && !z4) {
                        z3 = false;
                    }
                    if (z3) {
                        viewStructure.setDataIsSensitive(true);
                    }
                    viewStructure.setVisibility(((ea0) p10Var.F.h).D0() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        String str2 = "";
                        for (int i14 = 0; i14 < size; i14++) {
                            str2 = str2 + ((l7) list.get(i14)).e + '\n';
                        }
                        viewStructure.setText(str2);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((i70) p10Var.i()).isEmpty() && tl0Var != null && (u = ld0.u(tl0Var.a)) != null) {
                        viewStructure.setClassName(u);
                    }
                    if (z) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (l7Var != null) {
                            forText = AutofillValue.forText(l7Var.e);
                            viewStructure.setAutofillValue(forText);
                        }
                        if (z3) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z3 = true;
                hj.a.getClass();
                C = x40.C(gj.b);
                C.getClass();
                if (C.length != 0) {
                }
            }
        }
        num2 = num3;
        list = null;
        Integer valueOf22 = Integer.valueOf(p10Var.e);
        if (p10Var.n() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (f4Var == null) {
            if (valueOf != null) {
            }
            if (hjVar != null) {
                viewStructure.setAutofillHints(C3);
            }
            bj0Var.a.b(p10Var.e, new fh0(viewStructure));
            if (bool != null) {
            }
            if (pw0Var != null) {
            }
            z3 = true;
            hj.a.getClass();
            C = x40.C(gj.b);
            C.getClass();
            if (C.length != 0) {
            }
        }
        if (valueOf != null) {
        }
        if (hjVar != null) {
        }
        bj0Var.a.b(p10Var.e, new fh0(viewStructure));
        if (bool != null) {
        }
        if (pw0Var != null) {
        }
        z3 = true;
        hj.a.getClass();
        C = x40.C(gj.b);
        C.getClass();
        if (C.length != 0) {
        }
    }

    public static bb0 j(sh shVar) {
        ur0.f(ur0.a);
        synchronized (ur0.c) {
            ur0.h = zd.k0(ur0.h, shVar);
        }
        return new bb0(shVar);
    }

    public static final float k(long j, float f, sl slVar) {
        float c;
        long b = fw0.b(j);
        if (gw0.a(b, 4294967296L)) {
            if (slVar.h() <= 1.05d) {
                return slVar.I(j);
            }
            c = fw0.c(j) / fw0.c(slVar.P(f));
        } else {
            if (!gw0.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = fw0.c(j);
        }
        return c * f;
    }

    public static void l(or0 or0Var, or0 or0Var2, mu muVar) {
        if (or0Var != or0Var2) {
            or0Var2.getClass();
            or0.q(or0Var);
            or0Var2.c();
        } else if (or0Var instanceof fx0) {
            ((fx0) or0Var).r = muVar;
        } else if (or0Var instanceof gx0) {
            ((gx0) or0Var).h = muVar;
        } else {
            g8.d(or0Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void m() {
        boolean z;
        synchronized (ur0.c) {
            b70 b70Var = ur0.j.h;
            z = false;
            if (b70Var != null) {
                if (b70Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ur0.a();
        }
    }

    public static final void n(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(d31.I(j)), i, i2, 33);
        }
    }

    public static void o(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            z0.d(window, z);
        } else {
            if (i >= 30) {
                z0.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void p(Spannable spannable, long j, sl slVar, int i, int i2) {
        long b = fw0.b(j);
        if (gw0.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(a50.H(slVar.I(j)), false), i, i2, 33);
        } else if (gw0.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(fw0.c(j)), i, i2, 33);
        }
    }

    public static final void q(Spannable spannable, t30 t30Var, int i, int i2) {
        LocaleSpan localeSpan;
        if (t30Var != null) {
            List list = t30Var.d;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(ae.Y(t30Var, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s30) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = r0.e(r0.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? jg0.a.g().a() : t30Var.a()).a);
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final long r(zi0 zi0Var) {
        float f = zi0Var.c - zi0Var.a;
        float f2 = zi0Var.d - zi0Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long s(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ix0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [mu] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void t(ix0 ix0Var, mu muVar) {
        if (!((t50) ix0Var).d.q) {
            cy.b("visitSubtreeIf called on an unattached node");
        }
        l70 l70Var = new l70(new t50[16]);
        t50 t50Var = ((t50) ix0Var).d;
        t50 t50Var2 = t50Var.i;
        if (t50Var2 == null) {
            nz.h(l70Var, t50Var);
        } else {
            l70Var.b(t50Var2);
        }
        while (true) {
            int i = l70Var.f;
            if (i == 0) {
                return;
            }
            t50 t50Var3 = (t50) l70Var.j(i - 1);
            if ((t50Var3.g & 262144) != 0) {
                for (t50 t50Var4 = t50Var3; t50Var4 != null; t50Var4 = t50Var4.i) {
                    if ((t50Var4.f & 262144) != 0) {
                        ol olVar = t50Var4;
                        ?? r7 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof ix0) {
                                ix0 ix0Var2 = (ix0) olVar;
                                hx0 hx0Var = (nz.l(ix0Var.j(), ix0Var2.j()) && ix0Var.getClass() == ix0Var2.getClass()) ? (hx0) muVar.c(ix0Var2) : hx0.d;
                                if (hx0Var == hx0.f) {
                                    return;
                                }
                                if (hx0Var == hx0.e) {
                                    break;
                                }
                            } else if ((olVar.f & 262144) != 0 && (olVar instanceof ol)) {
                                t50 t50Var5 = olVar.s;
                                int i2 = 0;
                                olVar = olVar;
                                r7 = r7;
                                while (t50Var5 != null) {
                                    if ((t50Var5.f & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            olVar = t50Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r7.b(olVar);
                                                olVar = 0;
                                            }
                                            r7.b(t50Var5);
                                        }
                                    }
                                    t50Var5 = t50Var5.i;
                                    olVar = olVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            olVar = nz.j(r7);
                        }
                    }
                }
            }
            nz.h(l70Var, t50Var3);
        }
    }

    public static final double u(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final int v(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
