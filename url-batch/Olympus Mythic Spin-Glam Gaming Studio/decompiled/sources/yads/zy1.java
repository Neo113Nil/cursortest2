package yads;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class zy1 {
    public final List a;
    public final v22 b;
    public String c;
    public a22 d;

    public zy1(List list, v22 v22Var) {
        this.a = list;
        this.b = v22Var;
    }

    public final boolean a(z22 z22Var) {
        a22 a22Var = this.d;
        if (a22Var == null) {
            return false;
        }
        this.b.getClass();
        return z22Var.a(a22Var);
    }

    public final boolean b() {
        return !a(new z22() { // from class: yads.zy1$$ExternalSyntheticLambda0
            @Override // yads.z22
            public final boolean a(a22 a22Var) {
                return zy1.b(zy1.this, a22Var);
            }
        });
    }

    public final boolean c() {
        return !a(new z22() { // from class: yads.zy1$$ExternalSyntheticLambda2
            @Override // yads.z22
            public final boolean a(a22 a22Var) {
                return zy1.c(zy1.this, a22Var);
            }
        });
    }

    public final boolean d() {
        return !a(new z22() { // from class: yads.zy1$$ExternalSyntheticLambda4
            @Override // yads.z22
            public final boolean a(a22 a22Var) {
                return zy1.d(zy1.this, a22Var);
            }
        });
    }

    public final mp2 e() {
        return new mp2(this.c, a(new z22() { // from class: yads.zy1$$ExternalSyntheticLambda1
            @Override // yads.z22
            public final boolean a(a22 a22Var) {
                return zy1.e(zy1.this, a22Var);
            }
        }));
    }

    public static final boolean b(zy1 zy1Var, a22 a22Var) {
        Object obj;
        Iterator it = zy1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ph phVar = (ph) obj;
            if (phVar.f && Intrinsics.areEqual(phVar.a, "sponsored")) {
                break;
            }
        }
        ph phVar2 = (ph) obj;
        if (phVar2 == null) {
            return true;
        }
        qh a = a22Var.a(phVar2);
        return a != null && a.d();
    }

    public static final boolean c(zy1 zy1Var, a22 a22Var) {
        Object obj;
        List list = zy1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ph) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ph phVar = (ph) obj;
            qh a = a22Var.a(phVar);
            if (a == null) {
                a = null;
            }
            if (a == null || !a.a(phVar.c)) {
                break;
            }
        }
        ph phVar2 = (ph) obj;
        zy1Var.c = phVar2 != null ? phVar2.a : null;
        return phVar2 == null;
    }

    public static final boolean d(zy1 zy1Var, a22 a22Var) {
        Object obj;
        List list = zy1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ph) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qh a = a22Var.a((ph) obj);
            if (a == null || !a.e()) {
                break;
            }
        }
        ph phVar = (ph) obj;
        zy1Var.c = phVar != null ? phVar.a : null;
        return phVar == null;
    }

    public final boolean a() {
        return !a(new z22() { // from class: yads.zy1$$ExternalSyntheticLambda3
            @Override // yads.z22
            public final boolean a(a22 a22Var) {
                return zy1.a(zy1.this, a22Var);
            }
        });
    }

    public static final boolean a(zy1 zy1Var, a22 a22Var) {
        List list = zy1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ph) obj).f) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qh a = a22Var.a((ph) it.next());
                if (a != null && a.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(zy1 zy1Var, a22 a22Var) {
        Object obj;
        List list = zy1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ph) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qh a = a22Var.a((ph) obj);
            if (a == null || !a.b()) {
                break;
            }
        }
        ph phVar = (ph) obj;
        zy1Var.c = phVar != null ? phVar.a : null;
        return phVar == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ec3 a(boolean z) {
        int i;
        qh a;
        wk3 c;
        Resources resources;
        DisplayMetrics displayMetrics;
        bc3 bc3Var = null;
        if (d() && !z) {
            return new bc3(ac3.f, this.c, null);
        }
        List list = this.a;
        a22 a22Var = this.d;
        if (a22Var != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ph phVar = (ph) it.next();
                wd1 wd1Var = phVar.g;
                if (wd1Var != null && (a = a22Var.a(phVar)) != null && (c = a.c()) != null) {
                    View a2 = a22Var.c.a();
                    if (a2 != null && (resources = a2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        float f = displayMetrics.density;
                        Integer num = wd1Var.a;
                        Integer num2 = wd1Var.b;
                        if (num != null && c.a < ((int) (num.intValue() * f))) {
                            bc3Var = zb3.a(2, phVar.a, null);
                            break;
                        }
                        if (num2 != null && c.b < ((int) (num2.intValue() * f))) {
                            bc3Var = zb3.a(2, phVar.a, null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        if (b() && !z) {
            createListBuilder.add(dc3.d);
        }
        List list2 = this.a;
        boolean z2 = false;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((ph) it2.next()).f && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if ((i >= 2) && a()) {
            z2 = true;
        }
        if (z2 && !z) {
            createListBuilder.add(dc3.e);
        }
        if (c()) {
            createListBuilder.add(dc3.c);
        }
        return new cc3(CollectionsKt.build(createListBuilder));
    }
}
