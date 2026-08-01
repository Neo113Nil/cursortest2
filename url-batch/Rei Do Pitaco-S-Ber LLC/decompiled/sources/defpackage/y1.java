package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class y1 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public y1(z1 z1Var, uv uvVar, tx txVar) {
        List i;
        uvVar.getClass();
        this.b = z1Var;
        this.d = uvVar;
        uh uhVar = uh.f;
        this.e = uhVar;
        this.f = uhVar;
        this.c = new ArrayList();
        xn xnVar = z1Var.h;
        xnVar.getClass();
        URI g = xnVar.g();
        if (g.getHost() == null) {
            i = z60.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = z1Var.g.select(g);
            i = (select == null || select.isEmpty()) ? z60.i(Proxy.NO_PROXY) : z60.u(select);
        }
        this.e = i;
        this.a = 0;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((vb) this.d) != null) {
                if (((vb) this.f) == null) {
                    this.f = new vb();
                }
                vb vbVar = (vb) this.f;
                vbVar.c = null;
                vbVar.b = false;
                vbVar.d = null;
                vbVar.a = false;
                WeakHashMap weakHashMap = f80.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    vbVar.b = true;
                    vbVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    vbVar.a = true;
                    vbVar.d = backgroundTintMode;
                }
                if (vbVar.b || vbVar.a) {
                    f4.e(background, vbVar, view.getDrawableState());
                    return;
                }
            }
            vb vbVar2 = (vb) this.e;
            if (vbVar2 != null) {
                f4.e(background, vbVar2, view.getDrawableState());
                return;
            }
            vb vbVar3 = (vb) this.d;
            if (vbVar3 != null) {
                f4.e(background, vbVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x1 x1Var = (x1) arrayList.get(i2);
            int i3 = x1Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = x1Var.b;
                    int i5 = x1Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(x1Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dy) this.e).a((x1) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        dy dyVar = (dy) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x1 x1Var = (x1) arrayList.get(i);
            int i2 = x1Var.a;
            if (i2 == 1) {
                dyVar.a(x1Var);
                dyVar.d(x1Var.b, x1Var.d);
            } else if (i2 == 2) {
                dyVar.a(x1Var);
                int i3 = x1Var.b;
                int i4 = x1Var.d;
                RecyclerView recyclerView = dyVar.f;
                recyclerView.S(i3, i4, true);
                recyclerView.o0 = true;
                recyclerView.l0.c += i4;
            } else if (i2 == 4) {
                dyVar.a(x1Var);
                dyVar.c(x1Var.b, x1Var.d, x1Var.c);
            } else if (i2 == 8) {
                dyVar.a(x1Var);
                dyVar.e(x1Var.b, x1Var.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(x1 x1Var) {
        int i;
        nw nwVar = (nw) this.b;
        int i2 = x1Var.a;
        if (i2 == 1 || i2 == 8) {
            l8.l("should not dispatch add or move for pre layout");
            return;
        }
        int v = v(x1Var.b, i2);
        int i3 = x1Var.b;
        int i4 = x1Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                l8.w(x1Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < x1Var.d; i6++) {
            int v2 = v((i * i6) + x1Var.b, x1Var.a);
            int i7 = x1Var.a;
            if (i7 == 2 ? v2 != v : !(i7 == 4 && v2 == v + 1)) {
                x1 m = m(x1Var.c, i7, v, i5);
                f(m, i3);
                m.c = null;
                nwVar.c(m);
                if (x1Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                v = v2;
            } else {
                i5++;
            }
        }
        Object obj = x1Var.c;
        x1Var.c = null;
        nwVar.c(x1Var);
        if (i5 > 0) {
            x1 m2 = m(obj, x1Var.a, v, i5);
            f(m2, i3);
            m2.c = null;
            nwVar.c(m2);
        }
    }

    public void f(x1 x1Var, int i) {
        dy dyVar = (dy) this.e;
        dyVar.a(x1Var);
        int i2 = x1Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                dyVar.c(i, x1Var.d, x1Var.c);
                return;
            } else {
                l8.l("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = x1Var.d;
        RecyclerView recyclerView = dyVar.f;
        recyclerView.S(i, i3, true);
        recyclerView.o0 = true;
        recyclerView.l0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            x1 x1Var = (x1) arrayList.get(i2);
            int i3 = x1Var.a;
            int i4 = x1Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = x1Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (x1Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = x1Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += x1Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        vb vbVar = (vb) this.e;
        if (vbVar != null) {
            return (ColorStateList) vbVar.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        vb vbVar = (vb) this.e;
        if (vbVar != null) {
            return (PorterDuff.Mode) vbVar.d;
        }
        return null;
    }

    public boolean j() {
        return this.a < ((List) this.e).size() || !((ArrayList) this.c).isEmpty();
    }

    public boolean k() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = kx.y;
        y5 l = y5.l(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) l.a;
        View view2 = (View) this.b;
        f80.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) l.a, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                f4 f4Var = (f4) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (f4Var) {
                    f = f4Var.a.f(context2, i2);
                }
                if (f != null) {
                    s(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(l.e(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(vf.b(typedArray.getInt(2, -1), null));
            }
            l.n();
        } catch (Throwable th) {
            l.n();
            throw th;
        }
    }

    public x1 m(Object obj, int i, int i2, int i3) {
        x1 x1Var = (x1) ((nw) this.b).a();
        if (x1Var != null) {
            x1Var.a = i;
            x1Var.b = i2;
            x1Var.d = i3;
            x1Var.c = obj;
            return x1Var;
        }
        x1 x1Var2 = new x1();
        x1Var2.a = i;
        x1Var2.b = i2;
        x1Var2.d = i3;
        x1Var2.c = obj;
        return x1Var2;
    }

    public void n() {
        this.a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateList;
        this.a = i;
        f4 f4Var = (f4) this.c;
        if (f4Var != null) {
            Context context = ((View) this.b).getContext();
            synchronized (f4Var) {
                colorStateList = f4Var.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(x1 x1Var) {
        dy dyVar = (dy) this.e;
        ((ArrayList) this.d).add(x1Var);
        int i = x1Var.a;
        if (i == 1) {
            dyVar.d(x1Var.b, x1Var.d);
            return;
        }
        if (i == 2) {
            int i2 = x1Var.b;
            int i3 = x1Var.d;
            RecyclerView recyclerView = dyVar.f;
            recyclerView.S(i2, i3, false);
            recyclerView.o0 = true;
            return;
        }
        if (i == 4) {
            dyVar.c(x1Var.b, x1Var.d, x1Var.c);
        } else if (i == 8) {
            dyVar.e(x1Var.b, x1Var.d);
        } else {
            l8.w(x1Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q() {
        boolean z;
        char c;
        x1 m;
        int i;
        int i2;
        x1 m2;
        boolean z2;
        boolean z3;
        Object obj;
        x1 x1Var;
        nw nwVar = (nw) this.b;
        dy dyVar = (dy) this.e;
        uv uvVar = (uv) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        uvVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((x1) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            y1 y1Var = (y1) uvVar.f;
            nw nwVar2 = (nw) y1Var.b;
            x1 x1Var2 = (x1) arrayList.get(size);
            x1 x1Var3 = (x1) arrayList.get(i3);
            int i4 = x1Var3.a;
            if (i4 == 1) {
                int i5 = x1Var2.d;
                int i6 = x1Var3.b;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = x1Var2.b;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    x1Var2.b = i8 + x1Var3.d;
                }
                int i9 = x1Var3.b;
                if (i9 <= i5) {
                    x1Var2.d = i5 + x1Var3.d;
                }
                x1Var3.b = i9 + i7;
                arrayList.set(size, x1Var3);
                arrayList.set(i3, x1Var2);
            } else if (i4 == 2) {
                int i10 = x1Var2.b;
                int i11 = x1Var2.d;
                int i12 = x1Var3.b;
                if (i10 < i11) {
                    if (i12 == i10 && x1Var3.d == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && x1Var3.d == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    x1Var3.b = i12 - 1;
                } else {
                    int i13 = x1Var3.d;
                    if (i11 < i12 + i13) {
                        x1Var3.d = i13 - 1;
                        x1Var2.a = 2;
                        x1Var2.d = 1;
                        if (x1Var3.d == 0) {
                            arrayList.remove(i3);
                            x1Var3.c = null;
                            nwVar2.c(x1Var3);
                        }
                    }
                }
                int i14 = x1Var2.b;
                int i15 = x1Var3.b;
                if (i14 <= i15) {
                    x1Var3.b = i15 + 1;
                } else {
                    int i16 = i15 + x1Var3.d;
                    if (i14 < i16) {
                        obj = null;
                        x1 m3 = y1Var.m(null, 2, i14 + 1, i16 - i14);
                        x1Var3.d = x1Var2.b - x1Var3.b;
                        x1Var = m3;
                        if (z3) {
                            if (z2) {
                                if (x1Var != null) {
                                    int i17 = x1Var2.b;
                                    if (i17 > x1Var.b) {
                                        x1Var2.b = i17 - x1Var.d;
                                    }
                                    int i18 = x1Var2.d;
                                    if (i18 > x1Var.b) {
                                        x1Var2.d = i18 - x1Var.d;
                                    }
                                }
                                int i19 = x1Var2.b;
                                if (i19 > x1Var3.b) {
                                    x1Var2.b = i19 - x1Var3.d;
                                }
                                int i20 = x1Var2.d;
                                if (i20 > x1Var3.b) {
                                    x1Var2.d = i20 - x1Var3.d;
                                }
                            } else {
                                if (x1Var != null) {
                                    int i21 = x1Var2.b;
                                    if (i21 >= x1Var.b) {
                                        x1Var2.b = i21 - x1Var.d;
                                    }
                                    int i22 = x1Var2.d;
                                    if (i22 >= x1Var.b) {
                                        x1Var2.d = i22 - x1Var.d;
                                    }
                                }
                                int i23 = x1Var2.b;
                                if (i23 >= x1Var3.b) {
                                    x1Var2.b = i23 - x1Var3.d;
                                }
                                int i24 = x1Var2.d;
                                if (i24 >= x1Var3.b) {
                                    x1Var2.d = i24 - x1Var3.d;
                                }
                            }
                            arrayList.set(size, x1Var3);
                            if (x1Var2.b != x1Var2.d) {
                                arrayList.set(i3, x1Var2);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (x1Var != null) {
                                arrayList.add(size, x1Var);
                            }
                        } else {
                            arrayList.set(size, x1Var3);
                            arrayList.remove(i3);
                            x1Var2.c = obj;
                            nwVar2.c(x1Var2);
                        }
                    }
                }
                obj = null;
                x1Var = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = x1Var2.d;
                int i26 = x1Var3.b;
                if (i25 < i26) {
                    x1Var3.b = i26 - 1;
                } else {
                    int i27 = x1Var3.d;
                    if (i25 < i26 + i27) {
                        x1Var3.d = i27 - 1;
                        m = y1Var.m(x1Var3.c, 4, x1Var2.b, 1);
                        i = x1Var2.b;
                        i2 = x1Var3.b;
                        if (i > i2) {
                            x1Var3.b = i2 + 1;
                        } else {
                            int i28 = i2 + x1Var3.d;
                            if (i < i28) {
                                int i29 = i28 - i;
                                m2 = y1Var.m(x1Var3.c, 4, i + 1, i29);
                                x1Var3.d -= i29;
                                arrayList.set(i3, x1Var2);
                                if (x1Var3.d > 0) {
                                    arrayList.set(size, x1Var3);
                                } else {
                                    arrayList.remove(size);
                                    x1Var3.c = null;
                                    nwVar2.c(x1Var3);
                                }
                                if (m != null) {
                                    arrayList.add(size, m);
                                }
                                if (m2 != null) {
                                    arrayList.add(size, m2);
                                }
                            }
                        }
                        m2 = null;
                        arrayList.set(i3, x1Var2);
                        if (x1Var3.d > 0) {
                        }
                        if (m != null) {
                        }
                        if (m2 != null) {
                        }
                    }
                }
                m = null;
                i = x1Var2.b;
                i2 = x1Var3.b;
                if (i > i2) {
                }
                m2 = null;
                arrayList.set(i3, x1Var2);
                if (x1Var3.d > 0) {
                }
                if (m != null) {
                }
                if (m2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            x1 x1Var4 = (x1) arrayList.get(i30);
            int i31 = x1Var4.a;
            if (i31 == 1) {
                p(x1Var4);
            } else if (i31 == 2) {
                int i32 = x1Var4.b;
                int i33 = x1Var4.d + i32;
                int i34 = i32;
                int i35 = 0;
                char c2 = 65535;
                while (i34 < i33) {
                    if (dyVar.b(i34) != null || b(i34)) {
                        if (c2 == 0) {
                            e(m(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            p(m(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    c2 = c;
                }
                if (i35 != x1Var4.d) {
                    x1Var4.c = null;
                    nwVar.c(x1Var4);
                    x1Var4 = m(null, 2, i32, i35);
                }
                if (c2 == 0) {
                    e(x1Var4);
                } else {
                    p(x1Var4);
                }
            } else if (i31 == 4) {
                int i36 = x1Var4.b;
                int i37 = x1Var4.d + i36;
                int i38 = i36;
                int i39 = 0;
                char c3 = 65535;
                while (i36 < i37) {
                    if (dyVar.b(i36) != null || b(i36)) {
                        if (c3 == 0) {
                            e(m(x1Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            p(m(x1Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != x1Var4.d) {
                    Object obj2 = x1Var4.c;
                    x1Var4.c = null;
                    nwVar.c(x1Var4);
                    x1Var4 = m(obj2, 4, i38, i39);
                }
                if (c3 == 0) {
                    e(x1Var4);
                } else {
                    p(x1Var4);
                }
            } else if (i31 == 8) {
                p(x1Var4);
            }
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x1 x1Var = (x1) arrayList.get(i);
            x1Var.c = null;
            ((nw) this.b).c(x1Var);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((vb) this.d) == null) {
                this.d = new vb();
            }
            vb vbVar = (vb) this.d;
            vbVar.c = colorStateList;
            vbVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((vb) this.e) == null) {
            this.e = new vb();
        }
        vb vbVar = (vb) this.e;
        vbVar.c = colorStateList;
        vbVar.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((vb) this.e) == null) {
            this.e = new vb();
        }
        vb vbVar = (vb) this.e;
        vbVar.d = mode;
        vbVar.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        nw nwVar = (nw) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1 x1Var = (x1) arrayList.get(size);
            int i5 = x1Var.a;
            int i6 = x1Var.b;
            if (i5 == 8) {
                int i7 = x1Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            x1Var.b = i6 + 1;
                            x1Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            x1Var.b = i6 - 1;
                            x1Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        x1Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        x1Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        x1Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        x1Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= x1Var.d;
                } else if (i5 == 2) {
                    i += x1Var.d;
                }
            } else if (i2 == 1) {
                x1Var.b = i6 + 1;
            } else if (i2 == 2) {
                x1Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            x1 x1Var2 = (x1) arrayList.get(size2);
            int i8 = x1Var2.a;
            int i9 = x1Var2.d;
            if (i8 == 8) {
                if (i9 == x1Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    x1Var2.c = null;
                    nwVar.c(x1Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                x1Var2.c = null;
                nwVar.c(x1Var2);
            }
        }
        return i;
    }

    public y1(View view) {
        this.a = -1;
        this.b = view;
        this.c = f4.a();
    }

    public y1(dy dyVar) {
        this.b = new nw(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = dyVar;
        this.f = new uv(this);
    }
}
