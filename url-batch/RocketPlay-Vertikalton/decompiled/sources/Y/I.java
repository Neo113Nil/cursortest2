package Y;

import E1.AbstractC0001b;
import K.C0019l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0080m;
import com.luckycounter.drinkwater.R;
import d0.C0105a;
import g.AbstractActivityC0129i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public B.j f1330A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f1331B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1332C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1333D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1334E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1335G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1336H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1337I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1338J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1339K;

    /* renamed from: L, reason: collision with root package name */
    public L f1340L;

    /* renamed from: M, reason: collision with root package name */
    public final A1.e f1341M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1343b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1345e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f1347g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f1350l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1351m;

    /* renamed from: n, reason: collision with root package name */
    public final y f1352n;

    /* renamed from: o, reason: collision with root package name */
    public final y f1353o;

    /* renamed from: p, reason: collision with root package name */
    public final y f1354p;

    /* renamed from: q, reason: collision with root package name */
    public final y f1355q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1356r;

    /* renamed from: s, reason: collision with root package name */
    public int f1357s;

    /* renamed from: t, reason: collision with root package name */
    public C0058u f1358t;

    /* renamed from: u, reason: collision with root package name */
    public F1.d f1359u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0055q f1360v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0055q f1361w;

    /* renamed from: x, reason: collision with root package name */
    public final C f1362x;

    /* renamed from: y, reason: collision with root package name */
    public final M0.e f1363y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f1364z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1342a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U.v f1344c = new U.v(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f1346f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1348j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1349k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f1350l = new B.j(this);
        this.f1351m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1352n = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1540b;

            {
                this.f1540b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1540b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1540b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1540b;
                        if (i4.G()) {
                            i4.m(fVar.f4666a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1540b;
                        if (i5.G()) {
                            i5.r(gVar.f4667a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1353o = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1540b;

            {
                this.f1540b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1540b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1540b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1540b;
                        if (i4.G()) {
                            i4.m(fVar.f4666a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1540b;
                        if (i5.G()) {
                            i5.r(gVar.f4667a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1354p = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1540b;

            {
                this.f1540b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1540b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1540b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1540b;
                        if (i4.G()) {
                            i4.m(fVar.f4666a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1540b;
                        if (i5.G()) {
                            i5.r(gVar.f4667a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1355q = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1540b;

            {
                this.f1540b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1540b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1540b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1540b;
                        if (i42.G()) {
                            i42.m(fVar.f4666a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1540b;
                        if (i5.G()) {
                            i5.r(gVar.f4667a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1356r = new B(this);
        this.f1357s = -1;
        this.f1362x = new C(this);
        this.f1363y = new M0.e(16);
        this.f1332C = new ArrayDeque();
        this.f1341M = new A1.e(6, this);
    }

    public static boolean F(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        abstractComponentCallbacksC0055q.getClass();
        Iterator it = abstractComponentCallbacksC0055q.f1515t.f1344c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = (AbstractComponentCallbacksC0055q) it.next();
            if (abstractComponentCallbacksC0055q2 != null) {
                z2 = F(abstractComponentCallbacksC0055q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (abstractComponentCallbacksC0055q == null) {
            return true;
        }
        return abstractComponentCallbacksC0055q.f1483B && (abstractComponentCallbacksC0055q.f1513r == null || H(abstractComponentCallbacksC0055q.f1516u));
    }

    public static boolean I(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (abstractComponentCallbacksC0055q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0055q.f1513r;
        return abstractComponentCallbacksC0055q.equals(i.f1361w) && I(i.f1360v);
    }

    public static void X(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0055q);
        }
        if (abstractComponentCallbacksC0055q.f1520y) {
            abstractComponentCallbacksC0055q.f1520y = false;
            abstractComponentCallbacksC0055q.f1489I = !abstractComponentCallbacksC0055q.f1489I;
        }
    }

    public final AbstractComponentCallbacksC0055q A(int i) {
        U.v vVar = this.f1344c;
        ArrayList arrayList = (ArrayList) vVar.f1207a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = (AbstractComponentCallbacksC0055q) arrayList.get(size);
            if (abstractComponentCallbacksC0055q != null && abstractComponentCallbacksC0055q.f1517v == i) {
                return abstractComponentCallbacksC0055q;
            }
        }
        for (O o2 : ((HashMap) vVar.f1208b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = o2.f1389c;
                if (abstractComponentCallbacksC0055q2.f1517v == i) {
                    return abstractComponentCallbacksC0055q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0055q.f1485D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0055q.f1518w > 0 && this.f1359u.W()) {
            View T2 = this.f1359u.T(abstractComponentCallbacksC0055q.f1518w);
            if (T2 instanceof ViewGroup) {
                return (ViewGroup) T2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1360v;
        return abstractComponentCallbacksC0055q != null ? abstractComponentCallbacksC0055q.f1513r.C() : this.f1362x;
    }

    public final M0.e D() {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1360v;
        return abstractComponentCallbacksC0055q != null ? abstractComponentCallbacksC0055q.f1513r.D() : this.f1363y;
    }

    public final void E(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0055q);
        }
        if (abstractComponentCallbacksC0055q.f1520y) {
            return;
        }
        abstractComponentCallbacksC0055q.f1520y = true;
        abstractComponentCallbacksC0055q.f1489I = true ^ abstractComponentCallbacksC0055q.f1489I;
        W(abstractComponentCallbacksC0055q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1360v;
        if (abstractComponentCallbacksC0055q == null) {
            return true;
        }
        return abstractComponentCallbacksC0055q.m() && this.f1360v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0058u c0058u;
        if (this.f1358t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1357s) {
            this.f1357s = i;
            U.v vVar = this.f1344c;
            Iterator it = ((ArrayList) vVar.f1207a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) vVar.f1208b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0055q) it.next()).f1502e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o3.f1389c;
                    if (abstractComponentCallbacksC0055q.f1507l && !abstractComponentCallbacksC0055q.o()) {
                        vVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f1333D && (c0058u = this.f1358t) != null && this.f1357s == 7) {
                c0058u.f1531e.invalidateOptionsMenu();
                this.f1333D = false;
            }
        }
    }

    public final void K() {
        if (this.f1358t == null) {
            return;
        }
        this.f1334E = false;
        this.F = false;
        this.f1340L.f1376g = false;
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                abstractComponentCallbacksC0055q.f1515t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1361w;
        if (abstractComponentCallbacksC0055q != null && i < 0 && abstractComponentCallbacksC0055q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f1337I, this.f1338J, i, i2);
        if (N2) {
            this.f1343b = true;
            try {
                P(this.f1337I, this.f1338J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1344c.f1208b).values().removeAll(Collections.singleton(null));
        return N2;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z2 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    C0039a c0039a = (C0039a) this.d.get(size);
                    if (i >= 0 && i == c0039a.f1425r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0039a c0039a2 = (C0039a) this.d.get(size - 1);
                            if (i < 0 || i != c0039a2.f1425r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0039a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0055q + " nesting=" + abstractComponentCallbacksC0055q.f1512q);
        }
        boolean o2 = abstractComponentCallbacksC0055q.o();
        if (abstractComponentCallbacksC0055q.f1521z && o2) {
            return;
        }
        U.v vVar = this.f1344c;
        synchronized (((ArrayList) vVar.f1207a)) {
            ((ArrayList) vVar.f1207a).remove(abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1506k = false;
        if (F(abstractComponentCallbacksC0055q)) {
            this.f1333D = true;
        }
        abstractComponentCallbacksC0055q.f1507l = true;
        W(abstractComponentCallbacksC0055q);
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0039a) arrayList.get(i)).f1422o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0039a) arrayList.get(i2)).f1422o) {
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

    public final void Q(Parcelable parcelable) {
        int i;
        B.j jVar;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1358t.f1529b.getClassLoader());
                this.f1349k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1358t.f1529b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        U.v vVar = this.f1344c;
        HashMap hashMap = (HashMap) vVar.f1209c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1378b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) vVar.f1208b;
        hashMap2.clear();
        Iterator it2 = j2.f1365a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f1350l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) vVar.f1209c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = (AbstractComponentCallbacksC0055q) this.f1340L.f1372b.get(n3.f1378b);
                if (abstractComponentCallbacksC0055q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0055q);
                    }
                    o2 = new O(jVar, vVar, abstractComponentCallbacksC0055q, n3);
                } else {
                    o2 = new O(this.f1350l, this.f1344c, this.f1358t.f1529b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = o2.f1389c;
                abstractComponentCallbacksC0055q2.f1513r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0055q2.f1502e + "): " + abstractComponentCallbacksC0055q2);
                }
                o2.m(this.f1358t.f1529b.getClassLoader());
                vVar.m(o2);
                o2.f1390e = this.f1357s;
            }
        }
        L l2 = this.f1340L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1372b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = (AbstractComponentCallbacksC0055q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0055q3.f1502e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0055q3 + " that was not found in the set of active Fragments " + j2.f1365a);
                }
                this.f1340L.e(abstractComponentCallbacksC0055q3);
                abstractComponentCallbacksC0055q3.f1513r = this;
                O o3 = new O(jVar, vVar, abstractComponentCallbacksC0055q3);
                o3.f1390e = 1;
                o3.k();
                abstractComponentCallbacksC0055q3.f1507l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f1366b;
        ((ArrayList) vVar.f1207a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0055q d = vVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                vVar.a(d);
            }
        }
        if (j2.f1367c != null) {
            this.d = new ArrayList(j2.f1367c.length);
            int i3 = 0;
            while (true) {
                C0040b[] c0040bArr = j2.f1367c;
                if (i3 >= c0040bArr.length) {
                    break;
                }
                C0040b c0040b = c0040bArr[i3];
                c0040b.getClass();
                C0039a c0039a = new C0039a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0040b.f1426a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1391a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0039a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0080m.values()[c0040b.f1428c[i5]];
                    p2.i = EnumC0080m.values()[c0040b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1393c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1394e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1395f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1396g = i12;
                    c0039a.f1412b = i8;
                    c0039a.f1413c = i9;
                    c0039a.d = i11;
                    c0039a.f1414e = i12;
                    c0039a.b(p2);
                    i5++;
                    i = 2;
                }
                c0039a.f1415f = c0040b.f1429e;
                c0039a.h = c0040b.f1430f;
                c0039a.f1416g = true;
                c0039a.i = c0040b.h;
                c0039a.f1417j = c0040b.i;
                c0039a.f1418k = c0040b.f1432j;
                c0039a.f1419l = c0040b.f1433k;
                c0039a.f1420m = c0040b.f1434l;
                c0039a.f1421n = c0040b.f1435m;
                c0039a.f1422o = c0040b.f1436n;
                c0039a.f1425r = c0040b.f1431g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0040b.f1427b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0039a.f1411a.get(i13)).f1392b = vVar.d(str4);
                    }
                    i13++;
                }
                c0039a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0039a.f1425r + "): " + c0039a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0039a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0039a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f1368e;
        if (str5 != null) {
            AbstractComponentCallbacksC0055q d2 = vVar.d(str5);
            this.f1361w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f1369f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f1348j.put((String) arrayList4.get(i14), (C0041c) j2.f1370g.get(i14));
            }
        }
        this.f1332C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0040b[] c0040bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0047i c0047i = (C0047i) it.next();
            if (c0047i.f1453e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0047i.f1453e = false;
                c0047i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0047i) it2.next()).e();
        }
        y(true);
        this.f1334E = true;
        this.f1340L.f1376g = true;
        U.v vVar = this.f1344c;
        vVar.getClass();
        HashMap hashMap = (HashMap) vVar.f1208b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
                N n2 = new N(abstractComponentCallbacksC0055q);
                if (abstractComponentCallbacksC0055q.f1499a <= -1 || n2.f1386m != null) {
                    n2.f1386m = abstractComponentCallbacksC0055q.f1500b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0055q.x(bundle2);
                    abstractComponentCallbacksC0055q.f1496P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0055q.f1515t.R());
                    o2.f1387a.r(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0055q.f1486E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0055q.f1501c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0055q.f1501c);
                    }
                    if (abstractComponentCallbacksC0055q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0055q.d);
                    }
                    if (!abstractComponentCallbacksC0055q.f1487G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0055q.f1487G);
                    }
                    n2.f1386m = bundle2;
                    if (abstractComponentCallbacksC0055q.h != null) {
                        if (bundle2 == null) {
                            n2.f1386m = new Bundle();
                        }
                        n2.f1386m.putString("android:target_state", abstractComponentCallbacksC0055q.h);
                        int i2 = abstractComponentCallbacksC0055q.i;
                        if (i2 != 0) {
                            n2.f1386m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = o2.f1389c;
                arrayList2.add(abstractComponentCallbacksC0055q2.f1502e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0055q2 + ": " + abstractComponentCallbacksC0055q2.f1500b);
                }
            }
        }
        U.v vVar2 = this.f1344c;
        vVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) vVar2.f1209c).values());
        if (!arrayList3.isEmpty()) {
            U.v vVar3 = this.f1344c;
            synchronized (((ArrayList) vVar3.f1207a)) {
                try {
                    if (((ArrayList) vVar3.f1207a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) vVar3.f1207a).size());
                        Iterator it3 = ((ArrayList) vVar3.f1207a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = (AbstractComponentCallbacksC0055q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0055q3.f1502e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0055q3.f1502e + "): " + abstractComponentCallbacksC0055q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0040bArr = null;
            } else {
                c0040bArr = new C0040b[size];
                for (i = 0; i < size; i++) {
                    c0040bArr[i] = new C0040b((C0039a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f1368e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f1369f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f1370g = arrayList6;
            j2.f1365a = arrayList2;
            j2.f1366b = arrayList;
            j2.f1367c = c0040bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q4 = this.f1361w;
            if (abstractComponentCallbacksC0055q4 != null) {
                j2.f1368e = abstractComponentCallbacksC0055q4.f1502e;
            }
            arrayList5.addAll(this.f1348j.keySet());
            arrayList6.addAll(this.f1348j.values());
            j2.h = new ArrayList(this.f1332C);
            bundle.putParcelable("state", j2);
            for (String str : this.f1349k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1349k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1378b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1342a) {
            try {
                if (this.f1342a.size() == 1) {
                    this.f1358t.f1530c.removeCallbacks(this.f1341M);
                    this.f1358t.f1530c.post(this.f1341M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0055q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q, EnumC0080m enumC0080m) {
        if (abstractComponentCallbacksC0055q.equals(this.f1344c.d(abstractComponentCallbacksC0055q.f1502e)) && (abstractComponentCallbacksC0055q.f1514s == null || abstractComponentCallbacksC0055q.f1513r == this)) {
            abstractComponentCallbacksC0055q.f1492L = enumC0080m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0055q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (abstractComponentCallbacksC0055q != null) {
            if (!abstractComponentCallbacksC0055q.equals(this.f1344c.d(abstractComponentCallbacksC0055q.f1502e)) || (abstractComponentCallbacksC0055q.f1514s != null && abstractComponentCallbacksC0055q.f1513r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0055q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = this.f1361w;
        this.f1361w = abstractComponentCallbacksC0055q;
        q(abstractComponentCallbacksC0055q2);
        q(this.f1361w);
    }

    public final void W(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0055q);
        if (B2 != null) {
            C0054p c0054p = abstractComponentCallbacksC0055q.f1488H;
            if ((c0054p == null ? 0 : c0054p.f1476e) + (c0054p == null ? 0 : c0054p.d) + (c0054p == null ? 0 : c0054p.f1475c) + (c0054p == null ? 0 : c0054p.f1474b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0055q);
                }
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = (AbstractComponentCallbacksC0055q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0054p c0054p2 = abstractComponentCallbacksC0055q.f1488H;
                boolean z2 = c0054p2 != null ? c0054p2.f1473a : false;
                if (abstractComponentCallbacksC0055q2.f1488H == null) {
                    return;
                }
                abstractComponentCallbacksC0055q2.f().f1473a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1344c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
            if (abstractComponentCallbacksC0055q.F) {
                if (this.f1343b) {
                    this.f1336H = true;
                } else {
                    abstractComponentCallbacksC0055q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0058u c0058u = this.f1358t;
        if (c0058u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0058u.f1531e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        String str = abstractComponentCallbacksC0055q.f1491K;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0055q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0055q);
        }
        O f2 = f(abstractComponentCallbacksC0055q);
        abstractComponentCallbacksC0055q.f1513r = this;
        U.v vVar = this.f1344c;
        vVar.m(f2);
        if (!abstractComponentCallbacksC0055q.f1521z) {
            vVar.a(abstractComponentCallbacksC0055q);
            abstractComponentCallbacksC0055q.f1507l = false;
            if (abstractComponentCallbacksC0055q.f1486E == null) {
                abstractComponentCallbacksC0055q.f1489I = false;
            }
            if (F(abstractComponentCallbacksC0055q)) {
                this.f1333D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f1342a) {
            try {
                if (!this.f1342a.isEmpty()) {
                    A a2 = this.h;
                    a2.f1319a = true;
                    a.w wVar = a2.f1321c;
                    if (wVar != null) {
                        wVar.c();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f1319a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1360v);
                a.w wVar2 = a3.f1321c;
                if (wVar2 != null) {
                    wVar2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0058u c0058u, F1.d dVar, AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        String str;
        if (this.f1358t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1358t = c0058u;
        this.f1359u = dVar;
        this.f1360v = abstractComponentCallbacksC0055q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1351m;
        if (abstractComponentCallbacksC0055q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0055q));
        } else if (c0058u != null) {
            copyOnWriteArrayList.add(c0058u);
        }
        if (this.f1360v != null) {
            a0();
        }
        if (c0058u != null) {
            a.x i = c0058u.f1531e.i();
            this.f1347g = i;
            C0058u c0058u2 = abstractComponentCallbacksC0055q != 0 ? abstractComponentCallbacksC0055q : c0058u;
            i.getClass();
            A a2 = this.h;
            i1.f.e(a2, "onBackPressedCallback");
            androidx.lifecycle.v e2 = c0058u2.e();
            if (e2.d != EnumC0080m.f1896a) {
                a2.f1320b.add(new a.u(i, e2, a2));
                i.d();
                a2.f1321c = new a.w(0, i, a.x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }
        }
        if (abstractComponentCallbacksC0055q != 0) {
            L l2 = abstractComponentCallbacksC0055q.f1513r.f1340L;
            HashMap hashMap = l2.f1373c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0055q.f1502e);
            if (l3 == null) {
                l3 = new L(l2.f1374e);
                hashMap.put(abstractComponentCallbacksC0055q.f1502e, l3);
            }
            this.f1340L = l3;
        } else if (c0058u != null) {
            this.f1340L = (L) new A1.d(c0058u.f1531e.c(), L.h).s(L.class);
        } else {
            this.f1340L = new L(false);
        }
        L l4 = this.f1340L;
        l4.f1376g = this.f1334E || this.F;
        this.f1344c.d = l4;
        C0058u c0058u3 = this.f1358t;
        if (c0058u3 != null && abstractComponentCallbacksC0055q == 0) {
            i0.d b2 = c0058u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0058u c0058u4 = this.f1358t;
        if (c0058u4 != null) {
            AbstractActivityC0129i abstractActivityC0129i = c0058u4.f1531e;
            if (abstractComponentCallbacksC0055q != 0) {
                str = abstractComponentCallbacksC0055q.f1502e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String g2 = AbstractC0001b.g(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0129i.h;
            this.f1364z = jVar.b(g2, e3, zVar);
            this.f1330A = jVar.b(AbstractC0001b.g(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f1331B = jVar.b(AbstractC0001b.g(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0058u c0058u5 = this.f1358t;
        if (c0058u5 != null) {
            c0058u5.f1531e.g(this.f1352n);
        }
        C0058u c0058u6 = this.f1358t;
        if (c0058u6 != null) {
            AbstractActivityC0129i abstractActivityC0129i2 = c0058u6.f1531e;
            y yVar = this.f1353o;
            abstractActivityC0129i2.getClass();
            i1.f.e(yVar, "listener");
            abstractActivityC0129i2.f1589j.add(yVar);
        }
        C0058u c0058u7 = this.f1358t;
        if (c0058u7 != null) {
            AbstractActivityC0129i abstractActivityC0129i3 = c0058u7.f1531e;
            y yVar2 = this.f1354p;
            abstractActivityC0129i3.getClass();
            i1.f.e(yVar2, "listener");
            abstractActivityC0129i3.f1591l.add(yVar2);
        }
        C0058u c0058u8 = this.f1358t;
        if (c0058u8 != null) {
            AbstractActivityC0129i abstractActivityC0129i4 = c0058u8.f1531e;
            y yVar3 = this.f1355q;
            abstractActivityC0129i4.getClass();
            i1.f.e(yVar3, "listener");
            abstractActivityC0129i4.f1592m.add(yVar3);
        }
        C0058u c0058u9 = this.f1358t;
        if (c0058u9 == null || abstractComponentCallbacksC0055q != 0) {
            return;
        }
        AbstractActivityC0129i abstractActivityC0129i5 = c0058u9.f1531e;
        B b3 = this.f1356r;
        abstractActivityC0129i5.getClass();
        i1.f.e(b3, "provider");
        C0019l c0019l = abstractActivityC0129i5.f1585c;
        ((CopyOnWriteArrayList) c0019l.f684b).add(b3);
        ((Runnable) c0019l.f683a).run();
    }

    public final void c(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0055q);
        }
        if (abstractComponentCallbacksC0055q.f1521z) {
            abstractComponentCallbacksC0055q.f1521z = false;
            if (abstractComponentCallbacksC0055q.f1506k) {
                return;
            }
            this.f1344c.a(abstractComponentCallbacksC0055q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0055q);
            }
            if (F(abstractComponentCallbacksC0055q)) {
                this.f1333D = true;
            }
        }
    }

    public final void d() {
        this.f1343b = false;
        this.f1338J.clear();
        this.f1337I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1344c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1389c.f1485D;
            if (viewGroup != null) {
                hashSet.add(C0047i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        String str = abstractComponentCallbacksC0055q.f1502e;
        U.v vVar = this.f1344c;
        O o2 = (O) ((HashMap) vVar.f1208b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f1350l, vVar, abstractComponentCallbacksC0055q);
        o3.m(this.f1358t.f1529b.getClassLoader());
        o3.f1390e = this.f1357s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0055q);
        }
        if (abstractComponentCallbacksC0055q.f1521z) {
            return;
        }
        abstractComponentCallbacksC0055q.f1521z = true;
        if (abstractComponentCallbacksC0055q.f1506k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0055q);
            }
            U.v vVar = this.f1344c;
            synchronized (((ArrayList) vVar.f1207a)) {
                ((ArrayList) vVar.f1207a).remove(abstractComponentCallbacksC0055q);
            }
            abstractComponentCallbacksC0055q.f1506k = false;
            if (F(abstractComponentCallbacksC0055q)) {
                this.f1333D = true;
            }
            W(abstractComponentCallbacksC0055q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1358t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                abstractComponentCallbacksC0055q.f1484C = true;
                if (z2) {
                    abstractComponentCallbacksC0055q.f1515t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1357s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                if (!abstractComponentCallbacksC0055q.f1520y ? abstractComponentCallbacksC0055q.f1515t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1357s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null && H(abstractComponentCallbacksC0055q)) {
                if (!abstractComponentCallbacksC0055q.f1520y ? abstractComponentCallbacksC0055q.f1515t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0055q);
                    z2 = true;
                }
            }
        }
        if (this.f1345e != null) {
            for (int i = 0; i < this.f1345e.size(); i++) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = (AbstractComponentCallbacksC0055q) this.f1345e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0055q2)) {
                    abstractComponentCallbacksC0055q2.getClass();
                }
            }
        }
        this.f1345e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1335G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0047i) it.next()).e();
        }
        C0058u c0058u = this.f1358t;
        U.v vVar = this.f1344c;
        if (c0058u != null) {
            z2 = ((L) vVar.d).f1375f;
        } else {
            AbstractActivityC0129i abstractActivityC0129i = c0058u.f1529b;
            if (abstractActivityC0129i != null) {
                z2 = true ^ abstractActivityC0129i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1348j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0041c) it2.next()).f1437a) {
                    L l2 = (L) vVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0058u c0058u2 = this.f1358t;
        if (c0058u2 != null) {
            AbstractActivityC0129i abstractActivityC0129i2 = c0058u2.f1531e;
            y yVar = this.f1353o;
            abstractActivityC0129i2.getClass();
            i1.f.e(yVar, "listener");
            abstractActivityC0129i2.f1589j.remove(yVar);
        }
        C0058u c0058u3 = this.f1358t;
        if (c0058u3 != null) {
            AbstractActivityC0129i abstractActivityC0129i3 = c0058u3.f1531e;
            y yVar2 = this.f1352n;
            abstractActivityC0129i3.getClass();
            i1.f.e(yVar2, "listener");
            abstractActivityC0129i3.i.remove(yVar2);
        }
        C0058u c0058u4 = this.f1358t;
        if (c0058u4 != null) {
            AbstractActivityC0129i abstractActivityC0129i4 = c0058u4.f1531e;
            y yVar3 = this.f1354p;
            abstractActivityC0129i4.getClass();
            i1.f.e(yVar3, "listener");
            abstractActivityC0129i4.f1591l.remove(yVar3);
        }
        C0058u c0058u5 = this.f1358t;
        if (c0058u5 != null) {
            AbstractActivityC0129i abstractActivityC0129i5 = c0058u5.f1531e;
            y yVar4 = this.f1355q;
            abstractActivityC0129i5.getClass();
            i1.f.e(yVar4, "listener");
            abstractActivityC0129i5.f1592m.remove(yVar4);
        }
        C0058u c0058u6 = this.f1358t;
        if (c0058u6 != null) {
            AbstractActivityC0129i abstractActivityC0129i6 = c0058u6.f1531e;
            B b2 = this.f1356r;
            abstractActivityC0129i6.getClass();
            i1.f.e(b2, "provider");
            C0019l c0019l = abstractActivityC0129i6.f1585c;
            ((CopyOnWriteArrayList) c0019l.f684b).remove(b2);
            if (((HashMap) c0019l.f685c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0019l.f683a).run();
        }
        this.f1358t = null;
        this.f1359u = null;
        this.f1360v = null;
        if (this.f1347g != null) {
            Iterator it3 = this.h.f1320b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f1347g = null;
        }
        B.j jVar = this.f1364z;
        if (jVar != null) {
            jVar.M();
            this.f1330A.M();
            this.f1331B.M();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1358t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                abstractComponentCallbacksC0055q.f1484C = true;
                if (z2) {
                    abstractComponentCallbacksC0055q.f1515t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1358t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null && z3) {
                abstractComponentCallbacksC0055q.f1515t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1344c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = (AbstractComponentCallbacksC0055q) it.next();
            if (abstractComponentCallbacksC0055q != null) {
                abstractComponentCallbacksC0055q.n();
                abstractComponentCallbacksC0055q.f1515t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1357s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                if (!abstractComponentCallbacksC0055q.f1520y ? abstractComponentCallbacksC0055q.f1515t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1357s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null && !abstractComponentCallbacksC0055q.f1520y) {
                abstractComponentCallbacksC0055q.f1515t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (abstractComponentCallbacksC0055q != null) {
            if (abstractComponentCallbacksC0055q.equals(this.f1344c.d(abstractComponentCallbacksC0055q.f1502e))) {
                abstractComponentCallbacksC0055q.f1513r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0055q);
                Boolean bool = abstractComponentCallbacksC0055q.f1505j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0055q.f1505j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0055q.f1515t;
                    i.a0();
                    i.q(i.f1361w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1358t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null && z3) {
                abstractComponentCallbacksC0055q.f1515t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1357s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : this.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null && H(abstractComponentCallbacksC0055q)) {
                if (!abstractComponentCallbacksC0055q.f1520y ? abstractComponentCallbacksC0055q.f1515t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1343b = true;
            for (O o2 : ((HashMap) this.f1344c.f1208b).values()) {
                if (o2 != null) {
                    o2.f1390e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0047i) it.next()).e();
            }
            this.f1343b = false;
            y(true);
        } catch (Throwable th) {
            this.f1343b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            sb.append(abstractComponentCallbacksC0055q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1360v)));
            sb.append("}");
        } else {
            C0058u c0058u = this.f1358t;
            if (c0058u != null) {
                sb.append(c0058u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1358t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f1336H) {
            this.f1336H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String g2 = AbstractC0001b.g(str, "    ");
        U.v vVar = this.f1344c;
        vVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) vVar.f1208b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
                    printWriter.println(abstractComponentCallbacksC0055q);
                    abstractComponentCallbacksC0055q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0055q.f1517v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0055q.f1518w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0055q.f1519x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1499a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1502e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0055q.f1512q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1506k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1507l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1508m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0055q.f1509n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1520y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1521z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1483B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0055q.f1482A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0055q.f1487G);
                    if (abstractComponentCallbacksC0055q.f1513r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1513r);
                    }
                    if (abstractComponentCallbacksC0055q.f1514s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1514s);
                    }
                    if (abstractComponentCallbacksC0055q.f1516u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1516u);
                    }
                    if (abstractComponentCallbacksC0055q.f1503f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1503f);
                    }
                    if (abstractComponentCallbacksC0055q.f1500b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1500b);
                    }
                    if (abstractComponentCallbacksC0055q.f1501c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1501c);
                    }
                    if (abstractComponentCallbacksC0055q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0055q.d);
                    }
                    Object obj = abstractComponentCallbacksC0055q.f1504g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0055q.f1513r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0055q.h) == null) ? null : i.f1344c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0055q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0054p c0054p = abstractComponentCallbacksC0055q.f1488H;
                    printWriter.println(c0054p == null ? false : c0054p.f1473a);
                    C0054p c0054p2 = abstractComponentCallbacksC0055q.f1488H;
                    if ((c0054p2 == null ? 0 : c0054p2.f1474b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0054p c0054p3 = abstractComponentCallbacksC0055q.f1488H;
                        printWriter.println(c0054p3 == null ? 0 : c0054p3.f1474b);
                    }
                    C0054p c0054p4 = abstractComponentCallbacksC0055q.f1488H;
                    if ((c0054p4 == null ? 0 : c0054p4.f1475c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0054p c0054p5 = abstractComponentCallbacksC0055q.f1488H;
                        printWriter.println(c0054p5 == null ? 0 : c0054p5.f1475c);
                    }
                    C0054p c0054p6 = abstractComponentCallbacksC0055q.f1488H;
                    if ((c0054p6 == null ? 0 : c0054p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0054p c0054p7 = abstractComponentCallbacksC0055q.f1488H;
                        printWriter.println(c0054p7 == null ? 0 : c0054p7.d);
                    }
                    C0054p c0054p8 = abstractComponentCallbacksC0055q.f1488H;
                    if ((c0054p8 == null ? 0 : c0054p8.f1476e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0054p c0054p9 = abstractComponentCallbacksC0055q.f1488H;
                        printWriter.println(c0054p9 == null ? 0 : c0054p9.f1476e);
                    }
                    if (abstractComponentCallbacksC0055q.f1485D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1485D);
                    }
                    if (abstractComponentCallbacksC0055q.f1486E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0055q.f1486E);
                    }
                    if (abstractComponentCallbacksC0055q.h() != null) {
                        o.l lVar = ((C0105a) new A1.d(abstractComponentCallbacksC0055q.c(), C0105a.f2520c).s(C0105a.class)).f2521b;
                        if (lVar.f3615c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3615c > 0) {
                                if (lVar.f3614b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3613a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0055q.f1515t + ":");
                    abstractComponentCallbacksC0055q.f1515t.v(AbstractC0001b.g(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) vVar.f1207a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = (AbstractComponentCallbacksC0055q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0055q2.toString());
            }
        }
        ArrayList arrayList2 = this.f1345e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = (AbstractComponentCallbacksC0055q) this.f1345e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0055q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0039a c0039a = (C0039a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0039a.toString());
                c0039a.d(g2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1342a) {
            try {
                int size4 = this.f1342a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f1342a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
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
        printWriter.println(this.f1358t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1359u);
        if (this.f1360v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1360v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1357s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1334E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1335G);
        if (this.f1333D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1333D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f1358t == null) {
                if (!this.f1335G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1334E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1342a) {
            try {
                if (this.f1358t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1342a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1343b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1358t == null) {
            if (!this.f1335G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1358t.f1530c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1334E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1337I == null) {
            this.f1337I = new ArrayList();
            this.f1338J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1337I;
            ArrayList arrayList2 = this.f1338J;
            synchronized (this.f1342a) {
                if (this.f1342a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1342a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f1342a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1344c.f1208b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1343b = true;
            try {
                P(this.f1337I, this.f1338J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        U.v vVar;
        U.v vVar2;
        U.v vVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0039a) arrayList3.get(i)).f1422o;
        ArrayList arrayList5 = this.f1339K;
        if (arrayList5 == null) {
            this.f1339K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1339K;
        U.v vVar4 = this.f1344c;
        arrayList6.addAll(vVar4.j());
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1361w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                U.v vVar5 = vVar4;
                this.f1339K.clear();
                if (!z2 && this.f1357s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0039a) arrayList.get(i8)).f1411a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = ((P) it.next()).f1392b;
                            if (abstractComponentCallbacksC0055q2 == null || abstractComponentCallbacksC0055q2.f1513r == null) {
                                vVar = vVar5;
                            } else {
                                vVar = vVar5;
                                vVar.m(f(abstractComponentCallbacksC0055q2));
                            }
                            vVar5 = vVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0039a c0039a = (C0039a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0039a.c(-1);
                        ArrayList arrayList7 = c0039a.f1411a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = p2.f1392b;
                            if (abstractComponentCallbacksC0055q3 != null) {
                                if (abstractComponentCallbacksC0055q3.f1488H != null) {
                                    abstractComponentCallbacksC0055q3.f().f1473a = z4;
                                }
                                int i10 = c0039a.f1415f;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 4100;
                                        i12 = 8197;
                                        if (i10 != 8197) {
                                            if (i10 == 4099) {
                                                i11 = 4099;
                                            } else if (i10 != 4100) {
                                                i11 = 0;
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                if (abstractComponentCallbacksC0055q3.f1488H != null || i11 != 0) {
                                    abstractComponentCallbacksC0055q3.f();
                                    abstractComponentCallbacksC0055q3.f1488H.f1477f = i11;
                                }
                                abstractComponentCallbacksC0055q3.f();
                                abstractComponentCallbacksC0055q3.f1488H.getClass();
                            }
                            int i13 = p2.f1391a;
                            I i14 = c0039a.f1423p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0055q3, true);
                                    i14.O(abstractComponentCallbacksC0055q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1391a);
                                case 3:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    i14.a(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    i14.T(abstractComponentCallbacksC0055q3, true);
                                    i14.E(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    i14.c(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0055q3.E(p2.d, p2.f1394e, p2.f1395f, p2.f1396g);
                                    i14.T(abstractComponentCallbacksC0055q3, true);
                                    i14.g(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0055q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0055q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0039a.c(1);
                        ArrayList arrayList8 = c0039a.f1411a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q4 = p3.f1392b;
                            if (abstractComponentCallbacksC0055q4 != null) {
                                if (abstractComponentCallbacksC0055q4.f1488H != null) {
                                    abstractComponentCallbacksC0055q4.f().f1473a = false;
                                }
                                int i16 = c0039a.f1415f;
                                if (abstractComponentCallbacksC0055q4.f1488H != null || i16 != 0) {
                                    abstractComponentCallbacksC0055q4.f();
                                    abstractComponentCallbacksC0055q4.f1488H.f1477f = i16;
                                }
                                abstractComponentCallbacksC0055q4.f();
                                abstractComponentCallbacksC0055q4.f1488H.getClass();
                            }
                            int i17 = p3.f1391a;
                            I i18 = c0039a.f1423p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.T(abstractComponentCallbacksC0055q4, false);
                                    i18.a(abstractComponentCallbacksC0055q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1391a);
                                case 3:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.O(abstractComponentCallbacksC0055q4);
                                case 4:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.E(abstractComponentCallbacksC0055q4);
                                case 5:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.T(abstractComponentCallbacksC0055q4, false);
                                    X(abstractComponentCallbacksC0055q4);
                                case 6:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.g(abstractComponentCallbacksC0055q4);
                                case 7:
                                    abstractComponentCallbacksC0055q4.E(p3.d, p3.f1394e, p3.f1395f, p3.f1396g);
                                    i18.T(abstractComponentCallbacksC0055q4, false);
                                    i18.c(abstractComponentCallbacksC0055q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0055q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0055q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0039a c0039a2 = (C0039a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0039a2.f1411a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q5 = ((P) c0039a2.f1411a.get(size3)).f1392b;
                            if (abstractComponentCallbacksC0055q5 != null) {
                                f(abstractComponentCallbacksC0055q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0039a2.f1411a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q6 = ((P) it2.next()).f1392b;
                            if (abstractComponentCallbacksC0055q6 != null) {
                                f(abstractComponentCallbacksC0055q6).k();
                            }
                        }
                    }
                }
                J(this.f1357s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0039a) arrayList.get(i20)).f1411a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q7 = ((P) it3.next()).f1392b;
                        if (abstractComponentCallbacksC0055q7 != null && (viewGroup = abstractComponentCallbacksC0055q7.f1485D) != null) {
                            hashSet.add(C0047i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0047i c0047i = (C0047i) it4.next();
                    c0047i.d = booleanValue;
                    synchronized (c0047i.f1451b) {
                        try {
                            c0047i.g();
                            c0047i.f1453e = false;
                            int size4 = c0047i.f1451b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0047i.f1451b.get(size4);
                                    int c2 = AbstractC0001b.c(u2.f1407c.f1486E);
                                    if (u2.f1405a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0054p c0054p = u2.f1407c.f1488H;
                                        c0047i.f1453e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0047i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0039a c0039a3 = (C0039a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0039a3.f1425r >= 0) {
                        c0039a3.f1425r = -1;
                    }
                    c0039a3.getClass();
                }
                return;
            }
            C0039a c0039a4 = (C0039a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                vVar2 = vVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f1339K;
                ArrayList arrayList10 = c0039a4.f1411a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1391a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0055q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0055q = p4.f1392b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1392b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1392b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1339K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0039a4.f1411a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1391a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1392b);
                                    AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q8 = p5.f1392b;
                                    if (abstractComponentCallbacksC0055q8 == abstractComponentCallbacksC0055q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0055q8));
                                        i24++;
                                        vVar3 = vVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0055q = null;
                                    }
                                } else if (i25 == 7) {
                                    vVar3 = vVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0055q, 0));
                                    p5.f1393c = true;
                                    i24++;
                                    abstractComponentCallbacksC0055q = p5.f1392b;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q9 = p5.f1392b;
                                int i26 = abstractComponentCallbacksC0055q9.f1518w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    U.v vVar6 = vVar4;
                                    AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q10 = (AbstractComponentCallbacksC0055q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0055q10.f1518w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0055q10 == abstractComponentCallbacksC0055q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0055q10 == abstractComponentCallbacksC0055q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0055q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0055q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0055q10, i5);
                                        p6.d = p5.d;
                                        p6.f1395f = p5.f1395f;
                                        p6.f1394e = p5.f1394e;
                                        p6.f1396g = p5.f1396g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0055q10);
                                        i24++;
                                        abstractComponentCallbacksC0055q = abstractComponentCallbacksC0055q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    vVar4 = vVar6;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f1391a = 1;
                                    p5.f1393c = true;
                                    arrayList11.add(abstractComponentCallbacksC0055q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            vVar4 = vVar3;
                        } else {
                            vVar3 = vVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1392b);
                        i24 += i3;
                        i7 = i3;
                        vVar4 = vVar3;
                    } else {
                        vVar2 = vVar4;
                    }
                }
            }
            z3 = z3 || c0039a4.f1416g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            vVar4 = vVar2;
        }
    }
}
