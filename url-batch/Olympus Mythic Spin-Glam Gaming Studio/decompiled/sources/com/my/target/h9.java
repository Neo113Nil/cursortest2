package com.my.target;

import android.graphics.Point;
import com.my.target.common.MyTargetManager;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class h9 extends w {
    private h9() {
    }

    private boolean b(n nVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i8 i8Var = (i8) it.next();
            if (i8Var instanceof d9) {
                ArrayList arrayList = new ArrayList();
                i++;
                d9 d9Var = (d9) i8Var;
                eb j0 = d9Var.j0();
                if (j0 != null) {
                    if (j0.i0() != null) {
                        arrayList.add(j0.i0());
                    }
                    dj djVar = (dj) j0.A0();
                    if (djVar != null && djVar.c()) {
                        gj.a(djVar).a();
                        if (djVar.a() == null && d9Var.l0()) {
                            return false;
                        }
                    }
                }
                if (d9Var.y() != null) {
                    arrayList.add(d9Var.y());
                }
                if (d9Var.w() != null) {
                    arrayList.add(d9Var.w());
                }
                if (d9Var.Z() != null) {
                    arrayList.add(d9Var.Z());
                }
                if (d9Var.d0() != null) {
                    arrayList.add(d9Var.d0());
                }
                if (d9Var.a() != null) {
                    arrayList.add(d9Var.a().g());
                }
                ImageData i2 = d9Var.h0().i();
                if (i2 != null) {
                    arrayList.add(i2);
                }
                List g0 = d9Var.g0();
                if (!g0.isEmpty()) {
                    Iterator it2 = g0.iterator();
                    while (it2.hasNext()) {
                        ImageData y = ((k8) it2.next()).y();
                        if (y != null) {
                            arrayList.add(y);
                        }
                    }
                }
                i8 f0 = d9Var.f0();
                if (f0 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(f0);
                    if (!a(nVar, arrayList2)) {
                        d9Var.a((i8) null);
                    }
                }
                if (!arrayList.isEmpty()) {
                    b6.a(arrayList).c();
                }
            }
        }
        return i != 0;
    }

    public static h9 a() {
        return new h9();
    }

    @Override // com.my.target.w
    public i9 a(i9 i9Var, n nVar, s sVar) {
        List c = i9Var.c();
        if (c.isEmpty()) {
            jb b = i9Var.b();
            if (b != null && b.b()) {
                return i9Var;
            }
            sVar.b(q.r);
            return null;
        }
        if (a(nVar, c)) {
            b(c);
            return i9Var;
        }
        sVar.b(q.s);
        return null;
    }

    private boolean a(n nVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((i8) it.next()) instanceof d9) {
                i++;
            }
        }
        if (i > 0) {
            return b(nVar, list);
        }
        i8 i8Var = (i8) list.get(0);
        if (i8Var instanceof r8) {
            return a((r8) i8Var, nVar);
        }
        if (i8Var instanceof p8) {
            a((p8) i8Var, nVar);
            return true;
        }
        if (i8Var instanceof u8) {
            return a((u8) i8Var, nVar);
        }
        return false;
    }

    private boolean a(th thVar) {
        uh a = thVar.a(1);
        if (!a.c.isEmpty()) {
            a(a.c).f();
            return true;
        }
        uh a2 = thVar.a(2);
        if (!a2.c.isEmpty()) {
            a(a2.c).f();
            return true;
        }
        uh b = thVar.b("show");
        if (!b.c.isEmpty()) {
            ((rh) b.c.get(0)).f();
            return true;
        }
        uh b2 = thVar.b("playbackStarted");
        if (b2.c.isEmpty()) {
            return false;
        }
        ((rh) b2.c.get(0)).f();
        return true;
    }

    private gc a(List list) {
        gc gcVar = (gc) list.get(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc gcVar2 = (gc) it.next();
            if (gcVar2.h < gcVar.h) {
                gcVar = gcVar2;
            }
        }
        return gcVar;
    }

    private boolean a(r8 r8Var, n nVar) {
        ImageData Z;
        ArrayList arrayList = new ArrayList();
        jg c = MyTargetManager.c();
        if (c == null) {
            return false;
        }
        Point c2 = qi.c(c.a);
        ImageData a = a(r8Var.g0(), Math.min(c2.x, c2.y), Math.max(c2.x, c2.y));
        if (a != null) {
            arrayList.add(a);
            r8Var.g(a);
        }
        ImageData a2 = a(r8Var.d0(), Math.max(c2.x, c2.y), Math.min(c2.x, c2.y));
        if (a2 != null) {
            arrayList.add(a2);
            r8Var.f(a2);
        }
        if ((a != null || a2 != null) && (Z = r8Var.Z()) != null) {
            arrayList.add(Z);
        }
        e a3 = r8Var.a();
        if (a3 != null) {
            arrayList.add(a3.g());
        }
        if (!arrayList.isEmpty()) {
            b6.a(arrayList).c();
            if (a != null && a.getBitmap() != null) {
                return true;
            }
            if (a2 != null && a2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    private void b(List list) {
        eb j0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i8 i8Var = (i8) it.next();
            th H = i8Var.H();
            if (!H.g() && a(H)) {
                return;
            }
            if ((i8Var instanceof d9) && (j0 = ((d9) i8Var).j0()) != null) {
                th H2 = j0.H();
                if (!H2.g() && a(H2)) {
                    return;
                }
            }
            if (i8Var instanceof u8) {
                u8 u8Var = (u8) i8Var;
                c9 g0 = u8Var.g0();
                if (g0 != null) {
                    th a = g0.a();
                    if (!a.g() && a(a)) {
                        return;
                    }
                }
                if (!u8Var.d0().a().g() && a(u8Var.d0().a())) {
                    return;
                }
                if (!u8Var.e0().a().g() && a(u8Var.e0().a())) {
                    return;
                }
            }
        }
    }

    private boolean a(u8 u8Var, n nVar) {
        c9 g0 = u8Var.g0();
        z8 e0 = u8Var.e0();
        if (g0 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        dj g = g0.g();
        if (g != null) {
            arrayList.add(g0.f());
            if (g.c()) {
                gj.a(g).a();
                if (g.a() == null) {
                    return false;
                }
            }
            arrayList.add(g0.b());
        }
        arrayList.add(e0.d());
        b6.a(arrayList).c();
        return true;
    }

    private void a(p8 p8Var, n nVar) {
        ArrayList arrayList = new ArrayList();
        e a = p8Var.a();
        if (a != null) {
            arrayList.add(a.g());
        }
        ImageData Z = p8Var.Z();
        if (Z != null) {
            arrayList.add(Z);
        }
        b6.a(arrayList).c();
    }

    private ImageData a(List list, int i, int i2) {
        float f;
        float f2;
        ImageData imageData = null;
        if (list.isEmpty()) {
            return null;
        }
        if (i2 != 0 && i != 0) {
            float f3 = i;
            float f4 = i2;
            float f5 = f3 / f4;
            Iterator it = list.iterator();
            float f6 = 0.0f;
            while (it.hasNext()) {
                ImageData imageData2 = (ImageData) it.next();
                if (imageData2.getWidth() > 0 && imageData2.getHeight() > 0) {
                    float width = imageData2.getWidth() / imageData2.getHeight();
                    if (f5 < width) {
                        f = imageData2.getWidth();
                        if (f > f3) {
                            f = f3;
                        }
                        f2 = f / width;
                    } else {
                        float height = imageData2.getHeight();
                        if (height > f4) {
                            height = f4;
                        }
                        float f7 = height;
                        f = width * height;
                        f2 = f7;
                    }
                    float f8 = f2 * f;
                    if (f8 <= f6) {
                        break;
                    }
                    imageData = imageData2;
                    f6 = f8;
                }
            }
            return imageData;
        }
        mi.a("InterstitialAdResultProcessor: Display size is zero");
        return null;
    }
}
