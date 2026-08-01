package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class h6 extends v00 implements qu {
    public static final h6 A;
    public static final h6 B;
    public static final h6 C;
    public static final h6 D;
    public static final h6 E;
    public static final h6 F;
    public static final h6 G;
    public static final h6 H;
    public static final h6 f;
    public static final h6 g;
    public static final h6 h;
    public static final h6 i;
    public static final h6 j;
    public static final h6 k;
    public static final h6 l;
    public static final h6 m;
    public static final h6 n;
    public static final h6 o;
    public static final h6 p;
    public static final h6 q;
    public static final h6 r;
    public static final h6 s;
    public static final h6 t;
    public static final h6 u;
    public static final h6 v;
    public static final h6 w;
    public static final h6 x;
    public static final h6 y;
    public static final h6 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 2;
        f = new h6(i2, 0);
        g = new h6(i2, 1);
        h = new h6(i2, 2);
        i = new h6(i2, 3);
        j = new h6(i2, 4);
        k = new h6(i2, 5);
        l = new h6(i2, 6);
        m = new h6(i2, 7);
        n = new h6(i2, 8);
        o = new h6(i2, 9);
        p = new h6(i2, 10);
        q = new h6(i2, 11);
        r = new h6(i2, 12);
        s = new h6(i2, 13);
        t = new h6(i2, 14);
        u = new h6(i2, 15);
        v = new h6(i2, 16);
        w = new h6(i2, 17);
        x = new h6(i2, 18);
        y = new h6(i2, 19);
        z = new h6(i2, 20);
        A = new h6(i2, 21);
        B = new h6(i2, 22);
        C = new h6(i2, 23);
        D = new h6(i2, 24);
        E = new h6(i2, 25);
        F = new h6(i2, 26);
        G = new h6(i2, 27);
        H = new h6(i2, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [l70] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [l70] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [t50] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [t50] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object] */
    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        String str;
        yu yuVar;
        int i2 = this.e;
        ky0 ky0Var = ky0.a;
        switch (i2) {
            case 0:
                long j2 = ((iz) obj).a;
                long j3 = ((iz) obj2).a;
                LinkedHashMap linkedHashMap = t01.a;
                return nk.K(1, new iz(px0.c(1, 1)));
            case 1:
                return Integer.valueOf(Math.round((1.0f + (((c10) obj2) == c10.d ? -1.0f : 1.0f)) * (((Number) obj).intValue() / 2.0f)));
            case 2:
                String str2 = (String) obj;
                s50 s50Var = (s50) obj2;
                if (str2.length() == 0) {
                    return s50Var.toString();
                }
                return str2 + ", " + s50Var;
            case 3:
                ih ihVar = (ih) obj;
                int intValue = ((Number) obj2).intValue();
                qh qhVar = (qh) ihVar;
                if (!qhVar.N(intValue & 1, (intValue & 3) != 2)) {
                    qhVar.Q();
                }
                return ky0Var;
            case 4:
                ih ihVar2 = (ih) obj;
                int intValue2 = ((Number) obj2).intValue();
                qh qhVar2 = (qh) ihVar2;
                if (!qhVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qhVar2.Q();
                }
                return ky0Var;
            case 5:
                ((Number) obj2).intValue();
                ((eh) obj).getClass();
                return ky0Var;
            case 6:
                g50 g50Var = (g50) obj2;
                p10 p10Var = (p10) ((eh) obj);
                if (!nz.l(p10Var.x, g50Var)) {
                    p10Var.x = g50Var;
                    p10Var.x();
                }
                return ky0Var;
            case 7:
                ((p10) ((eh) obj)).T((u50) obj2);
                return ky0Var;
            case 8:
                fi fiVar = (fi) obj2;
                p10 p10Var2 = (p10) ((eh) obj);
                p10Var2.B = fiVar;
                ca0 ca0Var = p10Var2.F;
                lt0 lt0Var = hi.h;
                gf0 gf0Var = (gf0) fiVar;
                gf0Var.getClass();
                p10Var2.Q((sl) a50.D(gf0Var, lt0Var));
                gf0 gf0Var2 = (gf0) fiVar;
                c10 c10Var = (c10) a50.D(gf0Var2, hi.n);
                if (p10Var2.z != c10Var) {
                    p10Var2.z = c10Var;
                    p10Var2.x();
                    p10 n2 = p10Var2.n();
                    if (n2 != null) {
                        n2.v();
                    }
                    p10Var2.w();
                    for (t50 t50Var = (t50) ca0Var.j; t50Var != null; t50Var = t50Var.i) {
                        t50Var.c0();
                    }
                }
                p10Var2.U((e01) a50.D(gf0Var2, hi.s));
                t50 t50Var2 = (t50) ca0Var.j;
                if ((t50Var2.g & 32768) != 0) {
                    while (t50Var2 != null) {
                        if ((t50Var2.f & 32768) != 0) {
                            ol olVar = t50Var2;
                            ?? r0 = 0;
                            while (olVar != 0) {
                                if (olVar instanceof di) {
                                    t50 t50Var3 = ((t50) ((di) olVar)).d;
                                    if (t50Var3.q) {
                                        fa0.c(t50Var3);
                                    } else {
                                        t50Var3.m = true;
                                    }
                                } else if ((olVar.f & 32768) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var4 = olVar.s;
                                    int i3 = 0;
                                    r0 = r0;
                                    olVar = olVar;
                                    while (t50Var4 != null) {
                                        if ((t50Var4.f & 32768) != 0) {
                                            i3++;
                                            r0 = r0;
                                            if (i3 == 1) {
                                                olVar = t50Var4;
                                            } else {
                                                if (r0 == 0) {
                                                    r0 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r0.b(olVar);
                                                    olVar = 0;
                                                }
                                                r0.b(t50Var4);
                                            }
                                        }
                                        t50Var4 = t50Var4.i;
                                        r0 = r0;
                                        olVar = olVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                olVar = nz.j(r0);
                            }
                        }
                        if ((t50Var2.g & 32768) != 0) {
                            t50Var2 = t50Var2.i;
                        }
                    }
                }
                return ky0Var;
            case 9:
                s80 s80Var = (s80) obj2;
                LinkedHashMap linkedHashMap2 = s80Var.n;
                LinkedHashMap linkedHashMap3 = s80Var.m;
                h8 h8Var = s80Var.g;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : x40.S(s80Var.v.a).entrySet()) {
                    ((p90) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                if (!h8Var.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[h8Var.f];
                    Iterator it = h8Var.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i4] = new z70((y70) it.next());
                        i4++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i5 = 0;
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        int intValue3 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        iArr[i5] = intValue3;
                        arrayList2.add(str3);
                        i5++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        h8 h8Var2 = (h8) entry3.getValue();
                        arrayList3.add(str4);
                        Parcelable[] parcelableArr2 = new Parcelable[h8Var2.f];
                        Iterator it2 = h8Var2.iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                px0.V();
                                throw null;
                            }
                            parcelableArr2[i6] = (z70) next;
                            i6 = i7;
                        }
                        bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str4, parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (s80Var.f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", s80Var.f);
                }
                return bundle;
            case 10:
                return Integer.valueOf(((ho0) obj2).a.g());
            case 11:
                return (f4) obj;
            case 12:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList4 = new ArrayList(list);
                arrayList4.addAll(list2);
                return arrayList4;
            case 13:
                return (hj) obj;
            case 14:
                return (ky0) obj;
            case 15:
                return (ky0) obj;
            case 16:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 17:
                return (ky0) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 19:
                tl0 tl0Var = (tl0) obj;
                int i8 = ((tl0) obj2).a;
                return tl0Var;
            case 20:
                return (rq0) obj;
            case 21:
                return (String) obj;
            case 22:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList5 = new ArrayList(list3);
                arrayList5.addAll(list4);
                return arrayList5;
            case 23:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 24:
                return (String) obj;
            case 25:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 26:
                h0 h0Var = (h0) obj;
                h0 h0Var2 = (h0) obj2;
                if (h0Var == null || (str = h0Var.a) == null) {
                    str = h0Var2.a;
                }
                if (h0Var == null || (yuVar = h0Var.b) == null) {
                    yuVar = h0Var2.b;
                }
                return new h0(str, yuVar);
            case 27:
                return obj == null ? obj2 : obj;
            default:
                rp0 rp0Var = (rp0) obj2;
                Float valueOf = Float.valueOf(0.0f);
                np0 np0Var = ((rp0) obj).d;
                yp0 yp0Var = vp0.s;
                Object g2 = np0Var.d.g(yp0Var);
                if (g2 == null) {
                    g2 = valueOf;
                }
                float floatValue = ((Number) g2).floatValue();
                ?? g3 = rp0Var.d.d.g(yp0Var);
                if (g3 != 0) {
                    valueOf = g3;
                }
                return Integer.valueOf(Float.compare(floatValue, valueOf.floatValue()));
        }
    }
}
