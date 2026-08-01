package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import com.ionia.reidopitaco.libya.R;
import defpackage.fp;
import defpackage.kv;
import defpackage.lp;
import defpackage.ov;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sk {
    public o4 A;
    public o4 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public uk L;
    public final u6 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public pv g;
    public final o4 l;
    public final CopyOnWriteArrayList m;
    public final jk n;
    public final jk o;
    public final jk p;
    public final jk q;
    public final mk r;
    public int s;
    public fk t;
    public m60 u;
    public dk v;
    public dk w;
    public final nk x;
    public final tg y;
    public o4 z;
    public final ArrayList a = new ArrayList();
    public final oe c = new oe(3);
    public final ik f = new ik(this);
    public final lk h = new lk(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [jk] */
    /* JADX WARN: Type inference failed for: r0v13, types: [jk] */
    /* JADX WARN: Type inference failed for: r0v14, types: [jk] */
    /* JADX WARN: Type inference failed for: r0v15, types: [jk] */
    public sk() {
        Collections.synchronizedMap(new HashMap());
        this.l = new o4(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new wc(this) { // from class: jk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i2 = i;
                sk skVar = this.b;
                switch (i2) {
                    case 0:
                        if (skVar.I()) {
                            skVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (skVar.I() && num.intValue() == 80) {
                            skVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vt vtVar = (vt) obj;
                        if (skVar.I()) {
                            boolean z = vtVar.a;
                            skVar.m(false);
                            break;
                        }
                        break;
                    default:
                        gw gwVar = (gw) obj;
                        if (skVar.I()) {
                            boolean z2 = gwVar.a;
                            skVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new wc(this) { // from class: jk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i22 = i2;
                sk skVar = this.b;
                switch (i22) {
                    case 0:
                        if (skVar.I()) {
                            skVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (skVar.I() && num.intValue() == 80) {
                            skVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vt vtVar = (vt) obj;
                        if (skVar.I()) {
                            boolean z = vtVar.a;
                            skVar.m(false);
                            break;
                        }
                        break;
                    default:
                        gw gwVar = (gw) obj;
                        if (skVar.I()) {
                            boolean z2 = gwVar.a;
                            skVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new wc(this) { // from class: jk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i22 = i3;
                sk skVar = this.b;
                switch (i22) {
                    case 0:
                        if (skVar.I()) {
                            skVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (skVar.I() && num.intValue() == 80) {
                            skVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vt vtVar = (vt) obj;
                        if (skVar.I()) {
                            boolean z = vtVar.a;
                            skVar.m(false);
                            break;
                        }
                        break;
                    default:
                        gw gwVar = (gw) obj;
                        if (skVar.I()) {
                            boolean z2 = gwVar.a;
                            skVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new wc(this) { // from class: jk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i22 = i4;
                sk skVar = this.b;
                switch (i22) {
                    case 0:
                        if (skVar.I()) {
                            skVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (skVar.I() && num.intValue() == 80) {
                            skVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vt vtVar = (vt) obj;
                        if (skVar.I()) {
                            boolean z = vtVar.a;
                            skVar.m(false);
                            break;
                        }
                        break;
                    default:
                        gw gwVar = (gw) obj;
                        if (skVar.I()) {
                            boolean z2 = gwVar.a;
                            skVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new mk(this);
        this.s = -1;
        this.x = new nk(this);
        this.y = new tg(23);
        this.C = new ArrayDeque();
        this.M = new u6(6, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(dk dkVar) {
        dkVar.getClass();
        ArrayList m = dkVar.y.c.m();
        int size = m.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = m.get(i);
            i++;
            dk dkVar2 = (dk) obj;
            if (dkVar2 != null) {
                z = H(dkVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(dk dkVar) {
        if (dkVar == null) {
            return true;
        }
        if (dkVar.G) {
            return dkVar.w == null || J(dkVar.z);
        }
        return false;
    }

    public static boolean K(dk dkVar) {
        if (dkVar == null) {
            return true;
        }
        sk skVar = dkVar.w;
        return dkVar == skVar.w && K(skVar.v);
    }

    public static void Z(dk dkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + dkVar);
        }
        if (dkVar.D) {
            dkVar.D = false;
            dkVar.N = !dkVar.N;
        }
    }

    public final dk A(int i) {
        oe oeVar = this.c;
        ArrayList arrayList = (ArrayList) oeVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dk dkVar = (dk) arrayList.get(size);
            if (dkVar != null && dkVar.A == i) {
                return dkVar;
            }
        }
        for (a aVar : ((HashMap) oeVar.g).values()) {
            if (aVar != null) {
                dk dkVar2 = aVar.c;
                if (dkVar2.A == i) {
                    return dkVar2;
                }
            }
        }
        return null;
    }

    public final dk B(String str) {
        oe oeVar = this.c;
        ArrayList arrayList = (ArrayList) oeVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dk dkVar = (dk) arrayList.get(size);
            if (dkVar != null && str.equals(dkVar.C)) {
                return dkVar;
            }
        }
        for (a aVar : ((HashMap) oeVar.g).values()) {
            if (aVar != null) {
                dk dkVar2 = aVar.c;
                if (str.equals(dkVar2.C)) {
                    return dkVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(dk dkVar) {
        ViewGroup viewGroup = dkVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (dkVar.B <= 0 || !this.u.M()) {
            return null;
        }
        View L = this.u.L(dkVar.B);
        if (L instanceof ViewGroup) {
            return (ViewGroup) L;
        }
        return null;
    }

    public final nk D() {
        dk dkVar = this.v;
        return dkVar != null ? dkVar.w.D() : this.x;
    }

    public final tg E() {
        dk dkVar = this.v;
        return dkVar != null ? dkVar.w.E() : this.y;
    }

    public final void F(dk dkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + dkVar);
        }
        if (dkVar.D) {
            return;
        }
        dkVar.D = true;
        dkVar.N = true ^ dkVar.N;
        Y(dkVar);
    }

    public final boolean I() {
        dk dkVar = this.v;
        if (dkVar == null) {
            return true;
        }
        return dkVar.x != null && dkVar.p && dkVar.j().I();
    }

    public final void L(int i, boolean z) {
        fk fkVar;
        if (this.t == null && i != -1) {
            l8.u("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            oe oeVar = this.c;
            HashMap hashMap = (HashMap) oeVar.g;
            ArrayList arrayList = (ArrayList) oeVar.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a aVar = (a) hashMap.get(((dk) obj).j);
                if (aVar != null) {
                    aVar.k();
                }
            }
            for (a aVar2 : hashMap.values()) {
                if (aVar2 != null) {
                    aVar2.k();
                    dk dkVar = aVar2.c;
                    if (dkVar.q && !dkVar.o()) {
                        oeVar.s(aVar2);
                    }
                }
            }
            a0();
            if (this.D && (fkVar = this.t) != null && this.s == 7) {
                fkVar.y.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void M() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.h = false;
        for (dk dkVar : this.c.n()) {
            if (dkVar != null) {
                dkVar.y.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i, int i2) {
        y(false);
        x(true);
        dk dkVar = this.w;
        if (dkVar != null && i < 0 && dkVar.g().N()) {
            return true;
        }
        boolean P = P(this.I, this.J, i, i2);
        if (P) {
            this.b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        c0();
        u();
        ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    w6 w6Var = (w6) this.d.get(size);
                    if (i >= 0 && i == w6Var.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        w6 w6Var2 = (w6) this.d.get(i3 - 1);
                        if (i < 0 || i != w6Var2.r) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((w6) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(dk dkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + dkVar + " nesting=" + dkVar.v);
        }
        boolean o = dkVar.o();
        if (dkVar.E && o) {
            return;
        }
        oe oeVar = this.c;
        synchronized (((ArrayList) oeVar.f)) {
            ((ArrayList) oeVar.f).remove(dkVar);
        }
        dkVar.p = false;
        if (H(dkVar)) {
            this.D = true;
        }
        dkVar.q = true;
        Y(dkVar);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            l8.u("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((w6) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((w6) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void S(Parcelable parcelable) {
        o4 o4Var;
        int i;
        boolean z;
        int i2;
        a aVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.v.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.v.getClassLoader());
                arrayList.add((xk) bundle.getParcelable("state"));
            }
        }
        oe oeVar = this.c;
        HashMap hashMap = (HashMap) oeVar.h;
        HashMap hashMap2 = (HashMap) oeVar.g;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            xk xkVar = (xk) obj;
            hashMap.put(xkVar.g, xkVar);
        }
        tk tkVar = (tk) bundle3.getParcelable("state");
        if (tkVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = tkVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            o4Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            xk xkVar2 = (xk) ((HashMap) oeVar.h).remove((String) obj2);
            if (xkVar2 != null) {
                dk dkVar = (dk) this.L.c.get(xkVar2.g);
                if (dkVar != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + dkVar);
                    }
                    aVar = new a(o4Var, oeVar, dkVar, xkVar2);
                } else {
                    aVar = new a(this.l, this.c, this.t.v.getClassLoader(), D(), xkVar2);
                }
                dk dkVar2 = aVar.c;
                dkVar2.w = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + dkVar2.j + "): " + dkVar2);
                }
                aVar.m(this.t.v.getClassLoader());
                oeVar.r(aVar);
                aVar.e = this.s;
            }
        }
        uk ukVar = this.L;
        ukVar.getClass();
        ArrayList arrayList3 = new ArrayList(ukVar.c.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            dk dkVar3 = (dk) obj3;
            if (hashMap2.get(dkVar3.j) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + dkVar3 + " that was not found in the set of active Fragments " + tkVar.f);
                }
                this.L.e(dkVar3);
                dkVar3.w = this;
                a aVar2 = new a(o4Var, oeVar, dkVar3);
                aVar2.e = 1;
                aVar2.k();
                dkVar3.q = true;
                aVar2.k();
            }
        }
        ArrayList arrayList4 = tkVar.g;
        ((ArrayList) oeVar.f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                dk h = oeVar.h(str3);
                if (h == null) {
                    l8.h(str3, ")", "No instantiated fragment for (");
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h);
                }
                oeVar.a(h);
            }
        }
        if (tkVar.h != null) {
            this.d = new ArrayList(tkVar.h.length);
            int i7 = 0;
            while (true) {
                x6[] x6VarArr = tkVar.h;
                if (i7 >= x6VarArr.length) {
                    break;
                }
                x6 x6Var = x6VarArr[i7];
                ArrayList arrayList5 = x6Var.g;
                w6 w6Var = new w6(this);
                int[] iArr = x6Var.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    al alVar = new al();
                    int i10 = i8 + 1;
                    int i11 = i;
                    alVar.a = iArr[i8];
                    if (G(i11)) {
                        Log.v("FragmentManager", "Instantiate " + w6Var + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    alVar.h = gp.values()[x6Var.h[i9]];
                    alVar.i = gp.values()[x6Var.i[i9]];
                    int i12 = i8 + 2;
                    alVar.c = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    alVar.d = i13;
                    int i14 = iArr[i8 + 3];
                    alVar.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    alVar.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    alVar.g = i17;
                    w6Var.b = i13;
                    w6Var.c = i14;
                    w6Var.d = i16;
                    w6Var.e = i17;
                    w6Var.b(alVar);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                w6Var.f = x6Var.j;
                w6Var.h = x6Var.k;
                w6Var.g = true;
                w6Var.i = x6Var.m;
                w6Var.j = x6Var.n;
                w6Var.k = x6Var.o;
                w6Var.l = x6Var.p;
                w6Var.m = x6Var.q;
                w6Var.n = x6Var.r;
                w6Var.o = x6Var.s;
                w6Var.r = x6Var.l;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((al) w6Var.a.get(i19)).b = oeVar.h(str4);
                    }
                }
                w6Var.c(1);
                if (G(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + w6Var.r + "): " + w6Var);
                    PrintWriter printWriter = new PrintWriter(new qq());
                    w6Var.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(w6Var);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(tkVar.i);
        String str5 = tkVar.j;
        if (str5 != null) {
            dk h2 = oeVar.h(str5);
            this.w = h2;
            q(h2);
        }
        ArrayList arrayList6 = tkVar.k;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (y6) tkVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(tkVar.m);
    }

    public final Bundle T() {
        int i;
        ArrayList arrayList;
        x6[] x6VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            re reVar = (re) it.next();
            if (reVar.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                reVar.e = false;
                reVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((re) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.h = true;
        oe oeVar = this.c;
        oeVar.getClass();
        HashMap hashMap = (HashMap) oeVar.g;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            a aVar = (a) it3.next();
            if (aVar != null) {
                dk dkVar = aVar.c;
                xk xkVar = new xk(dkVar);
                if (dkVar.f <= -1 || xkVar.r != null) {
                    xkVar.r = dkVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    dkVar.x(bundle2);
                    dkVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", dkVar.y.T());
                    aVar.a.n(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (dkVar.J != null) {
                        aVar.o();
                    }
                    if (dkVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", dkVar.h);
                    }
                    if (dkVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", dkVar.i);
                    }
                    if (!dkVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", dkVar.L);
                    }
                    xkVar.r = bundle3;
                    if (dkVar.m != null) {
                        if (bundle3 == null) {
                            xkVar.r = new Bundle();
                        }
                        xkVar.r.putString("android:target_state", dkVar.m);
                        int i2 = dkVar.n;
                        if (i2 != 0) {
                            xkVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(dkVar.j);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + dkVar + ": " + dkVar.g);
                }
            }
        }
        oe oeVar2 = this.c;
        oeVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) oeVar2.h).values());
        if (!arrayList3.isEmpty()) {
            oe oeVar3 = this.c;
            synchronized (((ArrayList) oeVar3.f)) {
                try {
                    if (((ArrayList) oeVar3.f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) oeVar3.f).size());
                        ArrayList arrayList4 = (ArrayList) oeVar3.f;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            dk dkVar2 = (dk) obj;
                            arrayList.add(dkVar2.j);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + dkVar2.j + "): " + dkVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                x6VarArr = null;
            } else {
                x6VarArr = new x6[size];
                for (int i4 = 0; i4 < size; i4++) {
                    x6VarArr[i4] = new x6((w6) this.d.get(i4));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            }
            tk tkVar = new tk();
            tkVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            tkVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            tkVar.l = arrayList7;
            tkVar.f = arrayList2;
            tkVar.g = arrayList;
            tkVar.h = x6VarArr;
            tkVar.i = this.i.get();
            dk dkVar3 = this.w;
            if (dkVar3 != null) {
                tkVar.j = dkVar3.j;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            tkVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", tkVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                xk xkVar2 = (xk) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", xkVar2);
                bundle.putBundle("fragment_" + xkVar2.g, bundle4);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void U() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.w.removeCallbacks(this.M);
                    this.t.w.post(this.M);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(dk dkVar, boolean z) {
        ViewGroup C = C(dkVar);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z);
    }

    public final void W(dk dkVar, gp gpVar) {
        if (dkVar == this.c.h(dkVar.j) && (dkVar.x == null || dkVar.w == this)) {
            dkVar.Q = gpVar;
        } else {
            l8.p("Fragment ", dkVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void X(dk dkVar) {
        if (dkVar != null) {
            if (dkVar != this.c.h(dkVar.j) || (dkVar.x != null && dkVar.w != this)) {
                l8.p("Fragment ", dkVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        dk dkVar2 = this.w;
        this.w = dkVar;
        q(dkVar2);
        q(this.w);
    }

    public final void Y(dk dkVar) {
        ViewGroup C = C(dkVar);
        if (C != null) {
            bk bkVar = dkVar.M;
            if ((bkVar == null ? 0 : bkVar.e) + (bkVar == null ? 0 : bkVar.d) + (bkVar == null ? 0 : bkVar.c) + (bkVar == null ? 0 : bkVar.b) > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, dkVar);
                }
                dk dkVar2 = (dk) C.getTag(R.id.visible_removing_fragment_view_tag);
                bk bkVar2 = dkVar.M;
                boolean z = bkVar2 != null ? bkVar2.a : false;
                if (dkVar2.M == null) {
                    return;
                }
                dkVar2.f().a = z;
            }
        }
    }

    public final a a(dk dkVar) {
        String str = dkVar.P;
        if (str != null) {
            zk.c(dkVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + dkVar);
        }
        a f = f(dkVar);
        dkVar.w = this;
        oe oeVar = this.c;
        oeVar.r(f);
        if (!dkVar.E) {
            oeVar.a(dkVar);
            dkVar.q = false;
            if (dkVar.J == null) {
                dkVar.N = false;
            }
            if (H(dkVar)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0() {
        ArrayList l = this.c.l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            a aVar = (a) obj;
            dk dkVar = aVar.c;
            if (dkVar.K) {
                if (this.b) {
                    this.H = true;
                } else {
                    dkVar.K = false;
                    aVar.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1, kp] */
    public final void b(fk fkVar, m60 m60Var, dk dkVar) {
        String str;
        if (this.t != null) {
            l8.u("Already attached");
            return;
        }
        this.t = fkVar;
        this.u = m60Var;
        this.v = dkVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (dkVar != 0) {
            copyOnWriteArrayList.add(new ok(dkVar));
        } else if (fkVar != null) {
            copyOnWriteArrayList.add(fkVar);
        }
        if (this.v != null) {
            c0();
        }
        int i = 0;
        if (fkVar != null) {
            final pv h = fkVar.y.h();
            this.g = h;
            fk fkVar2 = dkVar != 0 ? dkVar : fkVar;
            h.getClass();
            lk lkVar = this.h;
            lkVar.getClass();
            final androidx.lifecycle.a e = fkVar2.e();
            if (e.c != gp.f) {
                final kv kvVar = new kv(lkVar, new lv(lkVar, fkVar2));
                lkVar.a.add(kvVar);
                kvVar.b(false);
                oe oeVar = ((nv) h.b.a()).c;
                oeVar.getClass();
                if (((LinkedHashSet) oeVar.h).add(kvVar)) {
                    qu quVar = (qu) oeVar.g;
                    quVar.getClass();
                    if (kvVar.c != null) {
                        l8.v(kvVar, "' is already registered with a dispatcher", "Handler '");
                        return;
                    } else {
                        quVar.e.addFirst(kvVar);
                        kvVar.c = oeVar;
                        quVar.b();
                    }
                }
                final ?? r4 = new jp(h, e) { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1
                    public final /* synthetic */ androidx.lifecycle.a b;

                    {
                        this.b = e;
                    }

                    @Override // defpackage.jp
                    public final void b(lp lpVar, fp fpVar) {
                        int i2 = ov.a[fpVar.ordinal()];
                        kv kvVar2 = kv.this;
                        if (i2 == 1) {
                            kvVar2.b(true);
                            return;
                        }
                        if (i2 == 2) {
                            kvVar2.b(false);
                        } else {
                            if (i2 != 3) {
                                return;
                            }
                            kvVar2.a();
                            this.b.f(this);
                        }
                    }
                };
                e.a(r4);
                lkVar.c.add(new AutoCloseable() { // from class: mv
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        androidx.lifecycle.a.this.f(r4);
                    }
                });
            }
        }
        if (dkVar != 0) {
            uk ukVar = dkVar.w.L;
            HashMap hashMap = ukVar.d;
            uk ukVar2 = (uk) hashMap.get(dkVar.j);
            if (ukVar2 == null) {
                ukVar2 = new uk(ukVar.f);
                hashMap.put(dkVar.j, ukVar2);
            }
            this.L = ukVar2;
        } else if (fkVar != null) {
            y5 y5Var = new y5(fkVar.y.d(), uk.i, pd.b);
            String canonicalName = uk.class.getCanonicalName();
            if (canonicalName == null) {
                l8.l("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (uk) y5Var.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), uk.class);
        } else {
            this.L = new uk(false);
        }
        uk ukVar3 = this.L;
        int i2 = 1;
        ukVar3.h = this.E || this.F;
        this.c.i = ukVar3;
        fk fkVar3 = this.t;
        int i3 = 2;
        if (fkVar3 != null && dkVar == 0) {
            h3 a = fkVar3.a();
            a.e("android:support:fragments", new jb(i3, this));
            Bundle c = a.c("android:support:fragments");
            if (c != null) {
                S(c);
            }
        }
        fk fkVar4 = this.t;
        if (fkVar4 != null) {
            nb nbVar = fkVar4.y.m;
            if (dkVar != 0) {
                str = dkVar.j + ":";
            } else {
                str = "";
            }
            String concat = "FragmentManager:".concat(str);
            this.z = nbVar.b(concat.concat("StartActivityForResult"), new u1(i2), new kk(this, i2));
            this.A = nbVar.b(concat.concat("StartIntentSenderForResult"), new u1(i3), new kk(this, i3));
            this.B = nbVar.b(concat.concat("RequestPermissions"), new u1(i), new kk(this, i));
        }
        fk fkVar5 = this.t;
        if (fkVar5 != null) {
            b3 b3Var = fkVar5.y;
            jk jkVar = this.n;
            jkVar.getClass();
            b3Var.n.add(jkVar);
        }
        fk fkVar6 = this.t;
        if (fkVar6 != null) {
            b3 b3Var2 = fkVar6.y;
            jk jkVar2 = this.o;
            jkVar2.getClass();
            b3Var2.o.add(jkVar2);
        }
        fk fkVar7 = this.t;
        if (fkVar7 != null) {
            b3 b3Var3 = fkVar7.y;
            jk jkVar3 = this.p;
            jkVar3.getClass();
            b3Var3.q.add(jkVar3);
        }
        fk fkVar8 = this.t;
        if (fkVar8 != null) {
            b3 b3Var4 = fkVar8.y;
            jk jkVar4 = this.q;
            jkVar4.getClass();
            b3Var4.r.add(jkVar4);
        }
        fk fkVar9 = this.t;
        if (fkVar9 == null || dkVar != 0) {
            return;
        }
        b3 b3Var5 = fkVar9.y;
        mk mkVar = this.r;
        mkVar.getClass();
        y5 y5Var2 = b3Var5.h;
        ((CopyOnWriteArrayList) y5Var2.c).add(mkVar);
        ((Runnable) y5Var2.b).run();
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new qq());
        fk fkVar = this.t;
        if (fkVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            fkVar.y.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void c(dk dkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + dkVar);
        }
        if (dkVar.E) {
            dkVar.E = false;
            if (dkVar.p) {
                return;
            }
            this.c.a(dkVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + dkVar);
            }
            if (H(dkVar)) {
                this.D = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                lk lkVar = this.h;
                ArrayList arrayList = this.d;
                lkVar.a((arrayList != null ? arrayList.size() : 0) > 0 && K(this.v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList l = this.c.l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            ViewGroup viewGroup = ((a) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(re.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final a f(dk dkVar) {
        String str = dkVar.j;
        oe oeVar = this.c;
        a aVar = (a) ((HashMap) oeVar.g).get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this.l, oeVar, dkVar);
        aVar2.m(this.t.v.getClassLoader());
        aVar2.e = this.s;
        return aVar2;
    }

    public final void g(dk dkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + dkVar);
        }
        if (dkVar.E) {
            return;
        }
        dkVar.E = true;
        if (dkVar.p) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + dkVar);
            }
            oe oeVar = this.c;
            synchronized (((ArrayList) oeVar.f)) {
                ((ArrayList) oeVar.f).remove(dkVar);
            }
            dkVar.p = false;
            if (H(dkVar)) {
                this.D = true;
            }
            Y(dkVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (dk dkVar : this.c.n()) {
            if (dkVar != null) {
                dkVar.H = true;
                if (z) {
                    dkVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (dk dkVar : this.c.n()) {
                if (dkVar != null) {
                    if (!dkVar.D ? dkVar.y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (dk dkVar : this.c.n()) {
            if (dkVar != null && J(dkVar)) {
                if (!dkVar.D ? dkVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dkVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                dk dkVar2 = (dk) this.e.get(i);
                if (arrayList == null || !arrayList.contains(dkVar2)) {
                    dkVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean z;
        boolean isTerminated;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((re) it.next()).e();
        }
        fk fkVar = this.t;
        oe oeVar = this.c;
        if (fkVar != null) {
            z = ((uk) oeVar.i).g;
        } else {
            z = fkVar.v != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((y6) it2.next()).f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    uk ukVar = (uk) oeVar.i;
                    ukVar.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    ukVar.d(str);
                }
            }
        }
        t(-1);
        fk fkVar2 = this.t;
        if (fkVar2 != null) {
            b3 b3Var = fkVar2.y;
            jk jkVar = this.o;
            jkVar.getClass();
            b3Var.o.remove(jkVar);
        }
        fk fkVar3 = this.t;
        if (fkVar3 != null) {
            b3 b3Var2 = fkVar3.y;
            jk jkVar2 = this.n;
            jkVar2.getClass();
            b3Var2.n.remove(jkVar2);
        }
        fk fkVar4 = this.t;
        if (fkVar4 != null) {
            b3 b3Var3 = fkVar4.y;
            jk jkVar3 = this.p;
            jkVar3.getClass();
            b3Var3.q.remove(jkVar3);
        }
        fk fkVar5 = this.t;
        if (fkVar5 != null) {
            b3 b3Var4 = fkVar5.y;
            jk jkVar4 = this.q;
            jkVar4.getClass();
            b3Var4.r.remove(jkVar4);
        }
        fk fkVar6 = this.t;
        if (fkVar6 != null) {
            b3 b3Var5 = fkVar6.y;
            mk mkVar = this.r;
            mkVar.getClass();
            y5 y5Var = b3Var5.h;
            ((CopyOnWriteArrayList) y5Var.c).remove(mkVar);
            if (((HashMap) y5Var.a).remove(mkVar) == null) {
                ((Runnable) y5Var.b).run();
            } else {
                l8.c();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            lk lkVar = this.h;
            ArrayList arrayList2 = lkVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = lkVar.c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((kv) obj2).a();
            }
            arrayList2.clear();
            this.g = null;
        }
        o4 o4Var = this.z;
        if (o4Var != null) {
            o4Var.P();
            this.A.P();
            this.B.P();
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (dk dkVar : this.c.n()) {
            if (dkVar != null) {
                dkVar.H = true;
                if (z) {
                    dkVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (dk dkVar : this.c.n()) {
            if (dkVar != null && z) {
                dkVar.y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList m = this.c.m();
        int size = m.size();
        int i = 0;
        while (i < size) {
            Object obj = m.get(i);
            i++;
            dk dkVar = (dk) obj;
            if (dkVar != null) {
                dkVar.n();
                dkVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (dk dkVar : this.c.n()) {
                if (dkVar != null) {
                    if (!dkVar.D ? dkVar.y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (dk dkVar : this.c.n()) {
            if (dkVar != null && !dkVar.D) {
                dkVar.y.p();
            }
        }
    }

    public final void q(dk dkVar) {
        if (dkVar != null) {
            if (dkVar != this.c.h(dkVar.j)) {
                return;
            }
            dkVar.w.getClass();
            boolean K = K(dkVar);
            Boolean bool = dkVar.o;
            if (bool == null || bool.booleanValue() != K) {
                dkVar.o = Boolean.valueOf(K);
                sk skVar = dkVar.y;
                skVar.c0();
                skVar.q(skVar.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (dk dkVar : this.c.n()) {
            if (dkVar != null && z) {
                dkVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (dk dkVar : this.c.n()) {
            if (dkVar != null && J(dkVar)) {
                if (!dkVar.D ? dkVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (a aVar : ((HashMap) this.c.g).values()) {
                if (aVar != null) {
                    aVar.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((re) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        dk dkVar = this.v;
        if (dkVar != null) {
            sb.append(dkVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            fk fkVar = this.t;
            if (fkVar != null) {
                sb.append(fkVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            a0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        oe oeVar = this.c;
        ArrayList arrayList = (ArrayList) oeVar.f;
        String str4 = str + "    ";
        HashMap hashMap = (HashMap) oeVar.g;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a aVar : hashMap.values()) {
                printWriter.print(str);
                if (aVar != null) {
                    dk dkVar = aVar.c;
                    printWriter.println(dkVar);
                    dkVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(dkVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(dkVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(dkVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(dkVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(dkVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(dkVar.v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(dkVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(dkVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(dkVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(dkVar.s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(dkVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(dkVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(dkVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(dkVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(dkVar.L);
                    if (dkVar.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(dkVar.w);
                    }
                    if (dkVar.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(dkVar.x);
                    }
                    if (dkVar.z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(dkVar.z);
                    }
                    if (dkVar.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(dkVar.k);
                    }
                    if (dkVar.g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(dkVar.g);
                    }
                    if (dkVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(dkVar.h);
                    }
                    if (dkVar.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(dkVar.i);
                    }
                    Object obj = dkVar.l;
                    if (obj == null) {
                        sk skVar = dkVar.w;
                        obj = (skVar == null || (str2 = dkVar.m) == null) ? null : skVar.c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(dkVar.n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    bk bkVar = dkVar.M;
                    printWriter.println(bkVar == null ? false : bkVar.a);
                    bk bkVar2 = dkVar.M;
                    if ((bkVar2 == null ? 0 : bkVar2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        bk bkVar3 = dkVar.M;
                        printWriter.println(bkVar3 == null ? 0 : bkVar3.b);
                    }
                    bk bkVar4 = dkVar.M;
                    if ((bkVar4 == null ? 0 : bkVar4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        bk bkVar5 = dkVar.M;
                        printWriter.println(bkVar5 == null ? 0 : bkVar5.c);
                    }
                    bk bkVar6 = dkVar.M;
                    if ((bkVar6 == null ? 0 : bkVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        bk bkVar7 = dkVar.M;
                        printWriter.println(bkVar7 == null ? 0 : bkVar7.d);
                    }
                    bk bkVar8 = dkVar.M;
                    if ((bkVar8 == null ? 0 : bkVar8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        bk bkVar9 = dkVar.M;
                        printWriter.println(bkVar9 == null ? 0 : bkVar9.e);
                    }
                    if (dkVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(dkVar.I);
                    }
                    if (dkVar.J != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(dkVar.J);
                    }
                    if (dkVar.h() != null) {
                        y5 y5Var = new y5(dkVar.d(), nq.d);
                        String canonicalName = nq.class.getCanonicalName();
                        if (canonicalName == null) {
                            l8.l("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        s20 s20Var = ((nq) y5Var.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), nq.class)).c;
                        if (s20Var.h > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (s20Var.h > 0) {
                                if (s20Var.g[0] != null) {
                                    l8.c();
                                    return;
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(s20Var.f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + dkVar.y + ":");
                    dkVar.y.v(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                dk dkVar2 = (dk) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(dkVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                dk dkVar3 = (dk) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(dkVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                w6 w6Var = (w6) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(w6Var.toString());
                w6Var.d(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (qk) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(qk qkVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    l8.u("FragmentManager has been destroyed");
                    return;
                } else {
                    l8.u("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                l8.u("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(qkVar);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            l8.u("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                l8.u("FragmentManager has been destroyed");
                return;
            } else {
                l8.u("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.w.getLooper()) {
            l8.u("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            l8.u("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean z2;
        ArrayList arrayList;
        x(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((qk) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.w.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                c0();
                u();
                ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        oe oeVar = this.c;
        boolean z5 = ((w6) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(oeVar.n());
        dk dkVar = this.w;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.K.clear();
                if (!z7 && this.s >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        ArrayList arrayList4 = ((w6) arrayList.get(i10)).a;
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            dk dkVar2 = ((al) obj).b;
                            if (dkVar2 != null && dkVar2.w != null) {
                                oeVar.r(f(dkVar2));
                            }
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        w6Var.c(-1);
                        sk skVar = w6Var.p;
                        ArrayList arrayList5 = w6Var.a;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            al alVar = (al) arrayList5.get(size2);
                            dk dkVar3 = alVar.b;
                            if (dkVar3 != null) {
                                if (dkVar3.M != null) {
                                    dkVar3.f().a = z8;
                                }
                                int i13 = w6Var.f;
                                int i14 = 8194;
                                int i15 = 4097;
                                if (i13 != 4097) {
                                    if (i13 != 8194) {
                                        i14 = 4100;
                                        i15 = 8197;
                                        if (i13 != 8197) {
                                            if (i13 == 4099) {
                                                i14 = 4099;
                                            } else if (i13 != 4100) {
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    i14 = i15;
                                }
                                if (dkVar3.M != null || i14 != 0) {
                                    dkVar3.f();
                                    dkVar3.M.f = i14;
                                }
                                dkVar3.f();
                                dkVar3.M.getClass();
                            }
                            switch (alVar.a) {
                                case 1:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    z8 = true;
                                    skVar.V(dkVar3, true);
                                    skVar.Q(dkVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + alVar.a);
                                case 3:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    skVar.a(dkVar3);
                                    z8 = true;
                                case 4:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    skVar.getClass();
                                    Z(dkVar3);
                                    z8 = true;
                                case 5:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    skVar.V(dkVar3, true);
                                    skVar.F(dkVar3);
                                    z8 = true;
                                case 6:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    skVar.c(dkVar3);
                                    z8 = true;
                                case 7:
                                    dkVar3.E(alVar.d, alVar.e, alVar.f, alVar.g);
                                    skVar.V(dkVar3, true);
                                    skVar.g(dkVar3);
                                    z8 = true;
                                case 8:
                                    skVar.X(null);
                                    z8 = true;
                                case 9:
                                    skVar.X(dkVar3);
                                    z8 = true;
                                case 10:
                                    skVar.W(dkVar3, alVar.h);
                                    z8 = true;
                            }
                        }
                    } else {
                        w6Var.c(1);
                        sk skVar2 = w6Var.p;
                        ArrayList arrayList6 = w6Var.a;
                        int size3 = arrayList6.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            al alVar2 = (al) arrayList6.get(i16);
                            dk dkVar4 = alVar2.b;
                            if (dkVar4 != null) {
                                if (dkVar4.M != null) {
                                    dkVar4.f().a = false;
                                }
                                int i17 = w6Var.f;
                                if (dkVar4.M != null || i17 != 0) {
                                    dkVar4.f();
                                    dkVar4.M.f = i17;
                                }
                                dkVar4.f();
                                dkVar4.M.getClass();
                            }
                            switch (alVar2.a) {
                                case 1:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.V(dkVar4, false);
                                    skVar2.a(dkVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + alVar2.a);
                                case 3:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.Q(dkVar4);
                                    break;
                                case 4:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.F(dkVar4);
                                    break;
                                case 5:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.V(dkVar4, false);
                                    Z(dkVar4);
                                    break;
                                case 6:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.g(dkVar4);
                                    break;
                                case 7:
                                    dkVar4.E(alVar2.d, alVar2.e, alVar2.f, alVar2.g);
                                    skVar2.V(dkVar4, false);
                                    skVar2.c(dkVar4);
                                    break;
                                case 8:
                                    skVar2.X(dkVar4);
                                    break;
                                case 9:
                                    skVar2.X(null);
                                    break;
                                case 10:
                                    skVar2.W(dkVar4, alVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    w6 w6Var2 = (w6) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size4 = w6Var2.a.size() - 1; size4 >= 0; size4--) {
                            dk dkVar5 = ((al) w6Var2.a.get(size4)).b;
                            if (dkVar5 != null) {
                                f(dkVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = w6Var2.a;
                        int size5 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj2 = arrayList7.get(i19);
                            i19++;
                            dk dkVar6 = ((al) obj2).b;
                            if (dkVar6 != null) {
                                f(dkVar6).k();
                            }
                        }
                    }
                }
                L(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    ArrayList arrayList8 = ((w6) arrayList.get(i20)).a;
                    int size6 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size6) {
                        Object obj3 = arrayList8.get(i21);
                        i21++;
                        dk dkVar7 = ((al) obj3).b;
                        if (dkVar7 != null && (viewGroup = dkVar7.I) != null) {
                            hashSet.add(re.f(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    re reVar = (re) it.next();
                    reVar.d = booleanValue;
                    synchronized (reVar.b) {
                        try {
                            reVar.g();
                            reVar.e = false;
                            int size7 = reVar.b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    u20 u20Var = (u20) reVar.b.get(size7);
                                    int c = n20.c(u20Var.c.J);
                                    if (u20Var.a != 2 || c == 2) {
                                        size7--;
                                    } else {
                                        bk bkVar = u20Var.c.M;
                                        reVar.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    reVar.c();
                }
                for (int i22 = i; i22 < i2; i22++) {
                    w6 w6Var3 = (w6) arrayList.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && w6Var3.r >= 0) {
                        w6Var3.r = -1;
                    }
                    w6Var3.getClass();
                }
                return;
            }
            w6 w6Var4 = (w6) arrayList.get(i8);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i23 = 1;
                ArrayList arrayList10 = w6Var4.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    al alVar3 = (al) arrayList10.get(size8);
                    int i24 = alVar3.a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    dkVar = null;
                                    break;
                                case 9:
                                    dkVar = alVar3.b;
                                    break;
                                case 10:
                                    alVar3.i = alVar3.h;
                                    break;
                            }
                            size8--;
                            i23 = 1;
                        }
                        arrayList9.add(alVar3.b);
                        size8--;
                        i23 = 1;
                    }
                    arrayList9.remove(alVar3.b);
                    size8--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = w6Var4.a;
                int i25 = 0;
                while (i25 < arrayList11.size()) {
                    al alVar4 = (al) arrayList11.get(i25);
                    int i26 = alVar4.a;
                    if (i26 != i9) {
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                z3 = z5;
                                arrayList9.remove(alVar4.b);
                                dk dkVar8 = alVar4.b;
                                if (dkVar8 == dkVar) {
                                    arrayList11.add(i25, new al(9, dkVar8));
                                    i25++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    dkVar = null;
                                }
                            } else if (i26 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i26 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList11.add(i25, new al(9, dkVar, 0));
                                alVar4.c = true;
                                i25++;
                                dkVar = alVar4.b;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            dk dkVar9 = alVar4.b;
                            int i27 = dkVar9.B;
                            int size9 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i28 = i8;
                                dk dkVar10 = (dk) arrayList9.get(size9);
                                boolean z10 = z6;
                                if (dkVar10.B != i27) {
                                    i6 = i27;
                                } else if (dkVar10 == dkVar9) {
                                    i6 = i27;
                                    z9 = true;
                                } else {
                                    if (dkVar10 == dkVar) {
                                        i6 = i27;
                                        i7 = 0;
                                        arrayList11.add(i25, new al(9, dkVar10, 0));
                                        i25++;
                                        dkVar = null;
                                    } else {
                                        i6 = i27;
                                        i7 = 0;
                                    }
                                    al alVar5 = new al(3, dkVar10, i7);
                                    alVar5.d = alVar4.d;
                                    alVar5.f = alVar4.f;
                                    alVar5.e = alVar4.e;
                                    alVar5.g = alVar4.g;
                                    arrayList11.add(i25, alVar5);
                                    arrayList9.remove(dkVar10);
                                    i25++;
                                    dkVar = dkVar;
                                }
                                size9--;
                                i27 = i6;
                                z6 = z10;
                                i8 = i28;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList11.remove(i25);
                                i25--;
                            } else {
                                alVar4.a = 1;
                                alVar4.c = true;
                                arrayList9.add(dkVar9);
                            }
                        }
                        i25 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    } else {
                        z3 = z5;
                        i4 = i9;
                    }
                    i5 = i8;
                    z4 = z6;
                    arrayList9.add(alVar4.b);
                    i25 += i4;
                    i9 = i4;
                    z5 = z3;
                    z6 = z4;
                    i8 = i5;
                }
                z = z5;
                i3 = i8;
                z2 = z6;
            }
            z6 = z2 || w6Var4.g;
            i8 = i3 + 1;
            z5 = z;
        }
    }
}
