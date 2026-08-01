package X;

import K.C0012l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0070m;
import com.ratebook.luckyconvert.R;
import g.AbstractActivityC0126i;
import h0.C0133d;
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
    public B.j f796A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f797B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f798C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f799D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f800E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f801G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f802H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f803I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f804J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f805K;

    /* renamed from: L, reason: collision with root package name */
    public L f806L;

    /* renamed from: M, reason: collision with root package name */
    public final K0.B f807M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f809b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f811e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f813g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f816l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f817m;

    /* renamed from: n, reason: collision with root package name */
    public final y f818n;

    /* renamed from: o, reason: collision with root package name */
    public final y f819o;

    /* renamed from: p, reason: collision with root package name */
    public final y f820p;

    /* renamed from: q, reason: collision with root package name */
    public final y f821q;

    /* renamed from: r, reason: collision with root package name */
    public final B f822r;

    /* renamed from: s, reason: collision with root package name */
    public int f823s;

    /* renamed from: t, reason: collision with root package name */
    public C0052u f824t;

    /* renamed from: u, reason: collision with root package name */
    public q1.d f825u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f826v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f827w;

    /* renamed from: x, reason: collision with root package name */
    public final C f828x;

    /* renamed from: y, reason: collision with root package name */
    public final H0.e f829y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f830z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f808a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.u f810c = new T.u(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f812f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f814j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f815k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f816l = new B.j(this);
        this.f817m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f818n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1005b;

            {
                this.f1005b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1005b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1005b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1005b;
                        if (i4.G()) {
                            i4.m(fVar.f4189a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1005b;
                        if (i5.G()) {
                            i5.r(gVar.f4190a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f819o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1005b;

            {
                this.f1005b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1005b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1005b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1005b;
                        if (i4.G()) {
                            i4.m(fVar.f4189a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1005b;
                        if (i5.G()) {
                            i5.r(gVar.f4190a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f820p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1005b;

            {
                this.f1005b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1005b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1005b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1005b;
                        if (i4.G()) {
                            i4.m(fVar.f4189a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1005b;
                        if (i5.G()) {
                            i5.r(gVar.f4190a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f821q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1005b;

            {
                this.f1005b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1005b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1005b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1005b;
                        if (i42.G()) {
                            i42.m(fVar.f4189a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1005b;
                        if (i5.G()) {
                            i5.r(gVar.f4190a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f822r = new B(this);
        this.f823s = -1;
        this.f828x = new C(this);
        this.f829y = new H0.e(12);
        this.f798C = new ArrayDeque();
        this.f807M = new K0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        abstractComponentCallbacksC0049q.getClass();
        Iterator it = abstractComponentCallbacksC0049q.f981t.f810c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) it.next();
            if (abstractComponentCallbacksC0049q2 != null) {
                z2 = F(abstractComponentCallbacksC0049q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q == null) {
            return true;
        }
        return abstractComponentCallbacksC0049q.f949B && (abstractComponentCallbacksC0049q.f979r == null || H(abstractComponentCallbacksC0049q.f982u));
    }

    public static boolean I(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0049q.f979r;
        return abstractComponentCallbacksC0049q.equals(i.f827w) && I(i.f826v);
    }

    public static void X(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f986y) {
            abstractComponentCallbacksC0049q.f986y = false;
            abstractComponentCallbacksC0049q.f955I = !abstractComponentCallbacksC0049q.f955I;
        }
    }

    public final AbstractComponentCallbacksC0049q A(int i) {
        T.u uVar = this.f810c;
        ArrayList arrayList = (ArrayList) uVar.f746a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) arrayList.get(size);
            if (abstractComponentCallbacksC0049q != null && abstractComponentCallbacksC0049q.f983v == i) {
                return abstractComponentCallbacksC0049q;
            }
        }
        for (O o2 : ((HashMap) uVar.f747b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f855c;
                if (abstractComponentCallbacksC0049q2.f983v == i) {
                    return abstractComponentCallbacksC0049q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f951D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0049q.f984w > 0 && this.f825u.d0()) {
            View c02 = this.f825u.c0(abstractComponentCallbacksC0049q.f984w);
            if (c02 instanceof ViewGroup) {
                return (ViewGroup) c02;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f826v;
        return abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f979r.C() : this.f828x;
    }

    public final H0.e D() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f826v;
        return abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f979r.D() : this.f829y;
    }

    public final void E(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f986y) {
            return;
        }
        abstractComponentCallbacksC0049q.f986y = true;
        abstractComponentCallbacksC0049q.f955I = true ^ abstractComponentCallbacksC0049q.f955I;
        W(abstractComponentCallbacksC0049q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f826v;
        if (abstractComponentCallbacksC0049q == null) {
            return true;
        }
        return abstractComponentCallbacksC0049q.m() && this.f826v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0052u c0052u;
        if (this.f824t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f823s) {
            this.f823s = i;
            T.u uVar = this.f810c;
            Iterator it = ((ArrayList) uVar.f746a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) uVar.f747b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0049q) it.next()).f968e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o3.f855c;
                    if (abstractComponentCallbacksC0049q.f973l && !abstractComponentCallbacksC0049q.o()) {
                        uVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f799D && (c0052u = this.f824t) != null && this.f823s == 7) {
                c0052u.i.invalidateOptionsMenu();
                this.f799D = false;
            }
        }
    }

    public final void K() {
        if (this.f824t == null) {
            return;
        }
        this.f800E = false;
        this.F = false;
        this.f806L.f842g = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f981t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f827w;
        if (abstractComponentCallbacksC0049q != null && i < 0 && abstractComponentCallbacksC0049q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f803I, this.f804J, i, i2);
        if (N2) {
            this.f809b = true;
            try {
                P(this.f803I, this.f804J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f810c.f747b).values().removeAll(Collections.singleton(null));
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
                    C0033a c0033a = (C0033a) this.d.get(size);
                    if (i >= 0 && i == c0033a.f891r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0033a c0033a2 = (C0033a) this.d.get(size - 1);
                            if (i < 0 || i != c0033a2.f891r) {
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
            arrayList.add((C0033a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0049q + " nesting=" + abstractComponentCallbacksC0049q.f978q);
        }
        boolean o2 = abstractComponentCallbacksC0049q.o();
        if (abstractComponentCallbacksC0049q.f987z && o2) {
            return;
        }
        T.u uVar = this.f810c;
        synchronized (((ArrayList) uVar.f746a)) {
            ((ArrayList) uVar.f746a).remove(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f972k = false;
        if (F(abstractComponentCallbacksC0049q)) {
            this.f799D = true;
        }
        abstractComponentCallbacksC0049q.f973l = true;
        W(abstractComponentCallbacksC0049q);
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
            if (!((C0033a) arrayList.get(i)).f888o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0033a) arrayList.get(i2)).f888o) {
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
                bundle2.setClassLoader(this.f824t.f995f.getClassLoader());
                this.f815k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f824t.f995f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.u uVar = this.f810c;
        HashMap hashMap = (HashMap) uVar.f748c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f844b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) uVar.f747b;
        hashMap2.clear();
        Iterator it2 = j2.f831a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f816l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) uVar.f748c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) this.f806L.f838b.get(n3.f844b);
                if (abstractComponentCallbacksC0049q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0049q);
                    }
                    o2 = new O(jVar, uVar, abstractComponentCallbacksC0049q, n3);
                } else {
                    o2 = new O(this.f816l, this.f810c, this.f824t.f995f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f855c;
                abstractComponentCallbacksC0049q2.f979r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0049q2.f968e + "): " + abstractComponentCallbacksC0049q2);
                }
                o2.m(this.f824t.f995f.getClassLoader());
                uVar.m(o2);
                o2.f856e = this.f823s;
            }
        }
        L l2 = this.f806L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f838b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0049q3.f968e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0049q3 + " that was not found in the set of active Fragments " + j2.f831a);
                }
                this.f806L.e(abstractComponentCallbacksC0049q3);
                abstractComponentCallbacksC0049q3.f979r = this;
                O o3 = new O(jVar, uVar, abstractComponentCallbacksC0049q3);
                o3.f856e = 1;
                o3.k();
                abstractComponentCallbacksC0049q3.f973l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f832b;
        ((ArrayList) uVar.f746a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0049q d = uVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                uVar.a(d);
            }
        }
        if (j2.f833c != null) {
            this.d = new ArrayList(j2.f833c.length);
            int i3 = 0;
            while (true) {
                C0034b[] c0034bArr = j2.f833c;
                if (i3 >= c0034bArr.length) {
                    break;
                }
                C0034b c0034b = c0034bArr[i3];
                c0034b.getClass();
                C0033a c0033a = new C0033a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0034b.f892a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f857a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0033a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0070m.values()[c0034b.f894c[i5]];
                    p2.i = EnumC0070m.values()[c0034b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f859c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f860e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f861f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f862g = i12;
                    c0033a.f878b = i8;
                    c0033a.f879c = i9;
                    c0033a.d = i11;
                    c0033a.f880e = i12;
                    c0033a.b(p2);
                    i5++;
                    i = 2;
                }
                c0033a.f881f = c0034b.f895e;
                c0033a.h = c0034b.f896f;
                c0033a.f882g = true;
                c0033a.i = c0034b.h;
                c0033a.f883j = c0034b.i;
                c0033a.f884k = c0034b.f898j;
                c0033a.f885l = c0034b.f899k;
                c0033a.f886m = c0034b.f900l;
                c0033a.f887n = c0034b.f901m;
                c0033a.f888o = c0034b.f902n;
                c0033a.f891r = c0034b.f897g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0034b.f893b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0033a.f877a.get(i13)).f858b = uVar.d(str4);
                    }
                    i13++;
                }
                c0033a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0033a.f891r + "): " + c0033a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0033a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0033a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f834e;
        if (str5 != null) {
            AbstractComponentCallbacksC0049q d2 = uVar.d(str5);
            this.f827w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f835f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f814j.put((String) arrayList4.get(i14), (C0035c) j2.f836g.get(i14));
            }
        }
        this.f798C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0034b[] c0034bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0041i c0041i = (C0041i) it.next();
            if (c0041i.f919e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0041i.f919e = false;
                c0041i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0041i) it2.next()).e();
        }
        y(true);
        this.f800E = true;
        this.f806L.f842g = true;
        T.u uVar = this.f810c;
        uVar.getClass();
        HashMap hashMap = (HashMap) uVar.f747b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
                N n2 = new N(abstractComponentCallbacksC0049q);
                if (abstractComponentCallbacksC0049q.f965a <= -1 || n2.f852m != null) {
                    n2.f852m = abstractComponentCallbacksC0049q.f966b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0049q.x(bundle2);
                    abstractComponentCallbacksC0049q.f962P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0049q.f981t.R());
                    o2.f853a.n(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0049q.f952E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0049q.f967c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0049q.f967c);
                    }
                    if (abstractComponentCallbacksC0049q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0049q.d);
                    }
                    if (!abstractComponentCallbacksC0049q.f953G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0049q.f953G);
                    }
                    n2.f852m = bundle2;
                    if (abstractComponentCallbacksC0049q.h != null) {
                        if (bundle2 == null) {
                            n2.f852m = new Bundle();
                        }
                        n2.f852m.putString("android:target_state", abstractComponentCallbacksC0049q.h);
                        int i2 = abstractComponentCallbacksC0049q.i;
                        if (i2 != 0) {
                            n2.f852m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f855c;
                arrayList2.add(abstractComponentCallbacksC0049q2.f968e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0049q2 + ": " + abstractComponentCallbacksC0049q2.f966b);
                }
            }
        }
        T.u uVar2 = this.f810c;
        uVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) uVar2.f748c).values());
        if (!arrayList3.isEmpty()) {
            T.u uVar3 = this.f810c;
            synchronized (((ArrayList) uVar3.f746a)) {
                try {
                    if (((ArrayList) uVar3.f746a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) uVar3.f746a).size());
                        Iterator it3 = ((ArrayList) uVar3.f746a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0049q3.f968e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0049q3.f968e + "): " + abstractComponentCallbacksC0049q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0034bArr = null;
            } else {
                c0034bArr = new C0034b[size];
                for (i = 0; i < size; i++) {
                    c0034bArr[i] = new C0034b((C0033a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f834e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f835f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f836g = arrayList6;
            j2.f831a = arrayList2;
            j2.f832b = arrayList;
            j2.f833c = c0034bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q4 = this.f827w;
            if (abstractComponentCallbacksC0049q4 != null) {
                j2.f834e = abstractComponentCallbacksC0049q4.f968e;
            }
            arrayList5.addAll(this.f814j.keySet());
            arrayList6.addAll(this.f814j.values());
            j2.h = new ArrayList(this.f798C);
            bundle.putParcelable("state", j2);
            for (String str : this.f815k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f815k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f844b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f808a) {
            try {
                if (this.f808a.size() == 1) {
                    this.f824t.f996g.removeCallbacks(this.f807M);
                    this.f824t.f996g.post(this.f807M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0049q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, EnumC0070m enumC0070m) {
        if (abstractComponentCallbacksC0049q.equals(this.f810c.d(abstractComponentCallbacksC0049q.f968e)) && (abstractComponentCallbacksC0049q.f980s == null || abstractComponentCallbacksC0049q.f979r == this)) {
            abstractComponentCallbacksC0049q.f958L = enumC0070m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0049q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q != null) {
            if (!abstractComponentCallbacksC0049q.equals(this.f810c.d(abstractComponentCallbacksC0049q.f968e)) || (abstractComponentCallbacksC0049q.f980s != null && abstractComponentCallbacksC0049q.f979r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0049q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = this.f827w;
        this.f827w = abstractComponentCallbacksC0049q;
        q(abstractComponentCallbacksC0049q2);
        q(this.f827w);
    }

    public final void W(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0049q);
        if (B2 != null) {
            C0048p c0048p = abstractComponentCallbacksC0049q.f954H;
            if ((c0048p == null ? 0 : c0048p.f942e) + (c0048p == null ? 0 : c0048p.d) + (c0048p == null ? 0 : c0048p.f941c) + (c0048p == null ? 0 : c0048p.f940b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0049q);
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0048p c0048p2 = abstractComponentCallbacksC0049q.f954H;
                boolean z2 = c0048p2 != null ? c0048p2.f939a : false;
                if (abstractComponentCallbacksC0049q2.f954H == null) {
                    return;
                }
                abstractComponentCallbacksC0049q2.f().f939a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f810c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
            if (abstractComponentCallbacksC0049q.F) {
                if (this.f809b) {
                    this.f802H = true;
                } else {
                    abstractComponentCallbacksC0049q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0052u c0052u = this.f824t;
        if (c0052u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0052u.i.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str = abstractComponentCallbacksC0049q.f957K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0049q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0049q);
        }
        O f2 = f(abstractComponentCallbacksC0049q);
        abstractComponentCallbacksC0049q.f979r = this;
        T.u uVar = this.f810c;
        uVar.m(f2);
        if (!abstractComponentCallbacksC0049q.f987z) {
            uVar.a(abstractComponentCallbacksC0049q);
            abstractComponentCallbacksC0049q.f973l = false;
            if (abstractComponentCallbacksC0049q.f952E == null) {
                abstractComponentCallbacksC0049q.f955I = false;
            }
            if (F(abstractComponentCallbacksC0049q)) {
                this.f799D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f808a) {
            try {
                if (!this.f808a.isEmpty()) {
                    A a2 = this.h;
                    a2.f784a = true;
                    a.w wVar = a2.f786c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f784a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f826v);
                a.w wVar2 = a3.f786c;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0052u c0052u, q1.d dVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str;
        if (this.f824t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f824t = c0052u;
        this.f825u = dVar;
        this.f826v = abstractComponentCallbacksC0049q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f817m;
        if (abstractComponentCallbacksC0049q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0049q));
        } else if (c0052u != null) {
            copyOnWriteArrayList.add(c0052u);
        }
        if (this.f826v != null) {
            a0();
        }
        if (c0052u != null) {
            a.x i = c0052u.i.i();
            this.f813g = i;
            C0052u c0052u2 = abstractComponentCallbacksC0049q != 0 ? abstractComponentCallbacksC0049q : c0052u;
            i.getClass();
            A a2 = this.h;
            X0.e.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0052u2.d();
            if (d.f1370c != EnumC0070m.f1360a) {
                a2.f785b.add(new a.u(i, d, a2));
                i.d();
                a2.f786c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0049q != 0) {
            L l2 = abstractComponentCallbacksC0049q.f979r.f806L;
            HashMap hashMap = l2.f839c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0049q.f968e);
            if (l3 == null) {
                l3 = new L(l2.f840e);
                hashMap.put(abstractComponentCallbacksC0049q.f968e, l3);
            }
            this.f806L = l3;
        } else if (c0052u != null) {
            this.f806L = (L) new B0.d(c0052u.i.c(), L.h).w(L.class);
        } else {
            this.f806L = new L(false);
        }
        L l4 = this.f806L;
        l4.f842g = this.f800E || this.F;
        this.f810c.d = l4;
        C0052u c0052u3 = this.f824t;
        if (c0052u3 != null && abstractComponentCallbacksC0049q == 0) {
            C0133d b2 = c0052u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0052u c0052u4 = this.f824t;
        if (c0052u4 != null) {
            AbstractActivityC0126i abstractActivityC0126i = c0052u4.i;
            if (abstractComponentCallbacksC0049q != 0) {
                str = abstractComponentCallbacksC0049q.f968e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0126i.h;
            this.f830z = jVar.b(e2, e3, zVar);
            this.f796A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f797B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0052u c0052u5 = this.f824t;
        if (c0052u5 != null) {
            c0052u5.i.g(this.f818n);
        }
        C0052u c0052u6 = this.f824t;
        if (c0052u6 != null) {
            AbstractActivityC0126i abstractActivityC0126i2 = c0052u6.i;
            y yVar = this.f819o;
            abstractActivityC0126i2.getClass();
            X0.e.e(yVar, "listener");
            abstractActivityC0126i2.f1063j.add(yVar);
        }
        C0052u c0052u7 = this.f824t;
        if (c0052u7 != null) {
            AbstractActivityC0126i abstractActivityC0126i3 = c0052u7.i;
            y yVar2 = this.f820p;
            abstractActivityC0126i3.getClass();
            X0.e.e(yVar2, "listener");
            abstractActivityC0126i3.f1065l.add(yVar2);
        }
        C0052u c0052u8 = this.f824t;
        if (c0052u8 != null) {
            AbstractActivityC0126i abstractActivityC0126i4 = c0052u8.i;
            y yVar3 = this.f821q;
            abstractActivityC0126i4.getClass();
            X0.e.e(yVar3, "listener");
            abstractActivityC0126i4.f1066m.add(yVar3);
        }
        C0052u c0052u9 = this.f824t;
        if (c0052u9 == null || abstractComponentCallbacksC0049q != 0) {
            return;
        }
        AbstractActivityC0126i abstractActivityC0126i5 = c0052u9.i;
        B b3 = this.f822r;
        abstractActivityC0126i5.getClass();
        X0.e.e(b3, "provider");
        C0012l c0012l = abstractActivityC0126i5.f1059c;
        ((CopyOnWriteArrayList) c0012l.f432c).add(b3);
        ((Runnable) c0012l.f431b).run();
    }

    public final void c(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f987z) {
            abstractComponentCallbacksC0049q.f987z = false;
            if (abstractComponentCallbacksC0049q.f972k) {
                return;
            }
            this.f810c.a(abstractComponentCallbacksC0049q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0049q);
            }
            if (F(abstractComponentCallbacksC0049q)) {
                this.f799D = true;
            }
        }
    }

    public final void d() {
        this.f809b = false;
        this.f804J.clear();
        this.f803I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f810c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f855c.f951D;
            if (viewGroup != null) {
                hashSet.add(C0041i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str = abstractComponentCallbacksC0049q.f968e;
        T.u uVar = this.f810c;
        O o2 = (O) ((HashMap) uVar.f747b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f816l, uVar, abstractComponentCallbacksC0049q);
        o3.m(this.f824t.f995f.getClassLoader());
        o3.f856e = this.f823s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f987z) {
            return;
        }
        abstractComponentCallbacksC0049q.f987z = true;
        if (abstractComponentCallbacksC0049q.f972k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0049q);
            }
            T.u uVar = this.f810c;
            synchronized (((ArrayList) uVar.f746a)) {
                ((ArrayList) uVar.f746a).remove(abstractComponentCallbacksC0049q);
            }
            abstractComponentCallbacksC0049q.f972k = false;
            if (F(abstractComponentCallbacksC0049q)) {
                this.f799D = true;
            }
            W(abstractComponentCallbacksC0049q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f824t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f950C = true;
                if (z2) {
                    abstractComponentCallbacksC0049q.f981t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f823s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null) {
                if (!abstractComponentCallbacksC0049q.f986y ? abstractComponentCallbacksC0049q.f981t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f823s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null && H(abstractComponentCallbacksC0049q)) {
                if (!abstractComponentCallbacksC0049q.f986y ? abstractComponentCallbacksC0049q.f981t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0049q);
                    z2 = true;
                }
            }
        }
        if (this.f811e != null) {
            for (int i = 0; i < this.f811e.size(); i++) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) this.f811e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0049q2)) {
                    abstractComponentCallbacksC0049q2.getClass();
                }
            }
        }
        this.f811e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f801G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0041i) it.next()).e();
        }
        C0052u c0052u = this.f824t;
        T.u uVar = this.f810c;
        if (c0052u != null) {
            z2 = ((L) uVar.d).f841f;
        } else {
            AbstractActivityC0126i abstractActivityC0126i = c0052u.f995f;
            if (abstractActivityC0126i != null) {
                z2 = true ^ abstractActivityC0126i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f814j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0035c) it2.next()).f903a) {
                    L l2 = (L) uVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0052u c0052u2 = this.f824t;
        if (c0052u2 != null) {
            AbstractActivityC0126i abstractActivityC0126i2 = c0052u2.i;
            y yVar = this.f819o;
            abstractActivityC0126i2.getClass();
            X0.e.e(yVar, "listener");
            abstractActivityC0126i2.f1063j.remove(yVar);
        }
        C0052u c0052u3 = this.f824t;
        if (c0052u3 != null) {
            AbstractActivityC0126i abstractActivityC0126i3 = c0052u3.i;
            y yVar2 = this.f818n;
            abstractActivityC0126i3.getClass();
            X0.e.e(yVar2, "listener");
            abstractActivityC0126i3.i.remove(yVar2);
        }
        C0052u c0052u4 = this.f824t;
        if (c0052u4 != null) {
            AbstractActivityC0126i abstractActivityC0126i4 = c0052u4.i;
            y yVar3 = this.f820p;
            abstractActivityC0126i4.getClass();
            X0.e.e(yVar3, "listener");
            abstractActivityC0126i4.f1065l.remove(yVar3);
        }
        C0052u c0052u5 = this.f824t;
        if (c0052u5 != null) {
            AbstractActivityC0126i abstractActivityC0126i5 = c0052u5.i;
            y yVar4 = this.f821q;
            abstractActivityC0126i5.getClass();
            X0.e.e(yVar4, "listener");
            abstractActivityC0126i5.f1066m.remove(yVar4);
        }
        C0052u c0052u6 = this.f824t;
        if (c0052u6 != null) {
            AbstractActivityC0126i abstractActivityC0126i6 = c0052u6.i;
            B b2 = this.f822r;
            abstractActivityC0126i6.getClass();
            X0.e.e(b2, "provider");
            C0012l c0012l = abstractActivityC0126i6.f1059c;
            ((CopyOnWriteArrayList) c0012l.f432c).remove(b2);
            if (((HashMap) c0012l.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0012l.f431b).run();
        }
        this.f824t = null;
        this.f825u = null;
        this.f826v = null;
        if (this.f813g != null) {
            Iterator it3 = this.h.f785b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f813g = null;
        }
        B.j jVar = this.f830z;
        if (jVar != null) {
            jVar.J();
            this.f796A.J();
            this.f797B.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f824t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f950C = true;
                if (z2) {
                    abstractComponentCallbacksC0049q.f981t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f824t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null && z3) {
                abstractComponentCallbacksC0049q.f981t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f810c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) it.next();
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.n();
                abstractComponentCallbacksC0049q.f981t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f823s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null) {
                if (!abstractComponentCallbacksC0049q.f986y ? abstractComponentCallbacksC0049q.f981t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f823s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null && !abstractComponentCallbacksC0049q.f986y) {
                abstractComponentCallbacksC0049q.f981t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q != null) {
            if (abstractComponentCallbacksC0049q.equals(this.f810c.d(abstractComponentCallbacksC0049q.f968e))) {
                abstractComponentCallbacksC0049q.f979r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0049q);
                Boolean bool = abstractComponentCallbacksC0049q.f971j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0049q.f971j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0049q.f981t;
                    i.a0();
                    i.q(i.f827w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f824t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null && z3) {
                abstractComponentCallbacksC0049q.f981t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f823s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f810c.j()) {
            if (abstractComponentCallbacksC0049q != null && H(abstractComponentCallbacksC0049q)) {
                if (!abstractComponentCallbacksC0049q.f986y ? abstractComponentCallbacksC0049q.f981t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f809b = true;
            for (O o2 : ((HashMap) this.f810c.f747b).values()) {
                if (o2 != null) {
                    o2.f856e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0041i) it.next()).e();
            }
            this.f809b = false;
            y(true);
        } catch (Throwable th) {
            this.f809b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f826v;
        if (abstractComponentCallbacksC0049q != null) {
            sb.append(abstractComponentCallbacksC0049q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f826v)));
            sb.append("}");
        } else {
            C0052u c0052u = this.f824t;
            if (c0052u != null) {
                sb.append(c0052u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f824t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f802H) {
            this.f802H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.u uVar = this.f810c;
        uVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) uVar.f747b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
                    printWriter.println(abstractComponentCallbacksC0049q);
                    abstractComponentCallbacksC0049q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0049q.f983v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0049q.f984w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0049q.f985x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0049q.f965a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0049q.f968e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0049q.f978q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0049q.f972k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0049q.f973l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0049q.f974m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0049q.f975n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0049q.f986y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0049q.f987z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0049q.f949B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0049q.f948A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0049q.f953G);
                    if (abstractComponentCallbacksC0049q.f979r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0049q.f979r);
                    }
                    if (abstractComponentCallbacksC0049q.f980s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0049q.f980s);
                    }
                    if (abstractComponentCallbacksC0049q.f982u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0049q.f982u);
                    }
                    if (abstractComponentCallbacksC0049q.f969f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0049q.f969f);
                    }
                    if (abstractComponentCallbacksC0049q.f966b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0049q.f966b);
                    }
                    if (abstractComponentCallbacksC0049q.f967c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0049q.f967c);
                    }
                    if (abstractComponentCallbacksC0049q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0049q.d);
                    }
                    Object obj = abstractComponentCallbacksC0049q.f970g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0049q.f979r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0049q.h) == null) ? null : i.f810c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0049q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0048p c0048p = abstractComponentCallbacksC0049q.f954H;
                    printWriter.println(c0048p == null ? false : c0048p.f939a);
                    C0048p c0048p2 = abstractComponentCallbacksC0049q.f954H;
                    if ((c0048p2 == null ? 0 : c0048p2.f940b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0048p c0048p3 = abstractComponentCallbacksC0049q.f954H;
                        printWriter.println(c0048p3 == null ? 0 : c0048p3.f940b);
                    }
                    C0048p c0048p4 = abstractComponentCallbacksC0049q.f954H;
                    if ((c0048p4 == null ? 0 : c0048p4.f941c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0048p c0048p5 = abstractComponentCallbacksC0049q.f954H;
                        printWriter.println(c0048p5 == null ? 0 : c0048p5.f941c);
                    }
                    C0048p c0048p6 = abstractComponentCallbacksC0049q.f954H;
                    if ((c0048p6 == null ? 0 : c0048p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0048p c0048p7 = abstractComponentCallbacksC0049q.f954H;
                        printWriter.println(c0048p7 == null ? 0 : c0048p7.d);
                    }
                    C0048p c0048p8 = abstractComponentCallbacksC0049q.f954H;
                    if ((c0048p8 == null ? 0 : c0048p8.f942e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0048p c0048p9 = abstractComponentCallbacksC0049q.f954H;
                        printWriter.println(c0048p9 == null ? 0 : c0048p9.f942e);
                    }
                    if (abstractComponentCallbacksC0049q.f951D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0049q.f951D);
                    }
                    if (abstractComponentCallbacksC0049q.f952E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0049q.f952E);
                    }
                    if (abstractComponentCallbacksC0049q.h() != null) {
                        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0049q.c(), c0.a.f1515c).w(c0.a.class)).f1516b;
                        if (lVar.f3334c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3334c > 0) {
                                if (lVar.f3333b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3332a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0049q.f981t + ":");
                    abstractComponentCallbacksC0049q.f981t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) uVar.f746a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0049q2.toString());
            }
        }
        ArrayList arrayList2 = this.f811e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) this.f811e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0049q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0033a c0033a = (C0033a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0033a.toString());
                c0033a.d(e2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f808a) {
            try {
                int size4 = this.f808a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f808a.get(i5);
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
        printWriter.println(this.f824t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f825u);
        if (this.f826v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f826v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f823s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f800E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f801G);
        if (this.f799D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f799D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f824t == null) {
                if (!this.f801G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f800E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f808a) {
            try {
                if (this.f824t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f808a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f809b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f824t == null) {
            if (!this.f801G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f824t.f996g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f800E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f803I == null) {
            this.f803I = new ArrayList();
            this.f804J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f803I;
            ArrayList arrayList2 = this.f804J;
            synchronized (this.f808a) {
                if (this.f808a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f808a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f808a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f810c.f747b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f809b = true;
            try {
                P(this.f803I, this.f804J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T.u uVar;
        T.u uVar2;
        T.u uVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0033a) arrayList3.get(i)).f888o;
        ArrayList arrayList5 = this.f805K;
        if (arrayList5 == null) {
            this.f805K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f805K;
        T.u uVar4 = this.f810c;
        arrayList6.addAll(uVar4.j());
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f827w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.u uVar5 = uVar4;
                this.f805K.clear();
                if (!z2 && this.f823s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0033a) arrayList.get(i8)).f877a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = ((P) it.next()).f858b;
                            if (abstractComponentCallbacksC0049q2 == null || abstractComponentCallbacksC0049q2.f979r == null) {
                                uVar = uVar5;
                            } else {
                                uVar = uVar5;
                                uVar.m(f(abstractComponentCallbacksC0049q2));
                            }
                            uVar5 = uVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0033a c0033a = (C0033a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0033a.c(-1);
                        ArrayList arrayList7 = c0033a.f877a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = p2.f858b;
                            if (abstractComponentCallbacksC0049q3 != null) {
                                if (abstractComponentCallbacksC0049q3.f954H != null) {
                                    abstractComponentCallbacksC0049q3.f().f939a = z4;
                                }
                                int i10 = c0033a.f881f;
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
                                if (abstractComponentCallbacksC0049q3.f954H != null || i11 != 0) {
                                    abstractComponentCallbacksC0049q3.f();
                                    abstractComponentCallbacksC0049q3.f954H.f943f = i11;
                                }
                                abstractComponentCallbacksC0049q3.f();
                                abstractComponentCallbacksC0049q3.f954H.getClass();
                            }
                            int i13 = p2.f857a;
                            I i14 = c0033a.f889p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0049q3, true);
                                    i14.O(abstractComponentCallbacksC0049q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f857a);
                                case 3:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    i14.a(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    i14.T(abstractComponentCallbacksC0049q3, true);
                                    i14.E(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    i14.c(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f860e, p2.f861f, p2.f862g);
                                    i14.T(abstractComponentCallbacksC0049q3, true);
                                    i14.g(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0049q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0033a.c(1);
                        ArrayList arrayList8 = c0033a.f877a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q4 = p3.f858b;
                            if (abstractComponentCallbacksC0049q4 != null) {
                                if (abstractComponentCallbacksC0049q4.f954H != null) {
                                    abstractComponentCallbacksC0049q4.f().f939a = false;
                                }
                                int i16 = c0033a.f881f;
                                if (abstractComponentCallbacksC0049q4.f954H != null || i16 != 0) {
                                    abstractComponentCallbacksC0049q4.f();
                                    abstractComponentCallbacksC0049q4.f954H.f943f = i16;
                                }
                                abstractComponentCallbacksC0049q4.f();
                                abstractComponentCallbacksC0049q4.f954H.getClass();
                            }
                            int i17 = p3.f857a;
                            I i18 = c0033a.f889p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.T(abstractComponentCallbacksC0049q4, false);
                                    i18.a(abstractComponentCallbacksC0049q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f857a);
                                case 3:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.O(abstractComponentCallbacksC0049q4);
                                case 4:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.E(abstractComponentCallbacksC0049q4);
                                case 5:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.T(abstractComponentCallbacksC0049q4, false);
                                    X(abstractComponentCallbacksC0049q4);
                                case 6:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.g(abstractComponentCallbacksC0049q4);
                                case 7:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f860e, p3.f861f, p3.f862g);
                                    i18.T(abstractComponentCallbacksC0049q4, false);
                                    i18.c(abstractComponentCallbacksC0049q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0049q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0049q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0033a c0033a2 = (C0033a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0033a2.f877a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q5 = ((P) c0033a2.f877a.get(size3)).f858b;
                            if (abstractComponentCallbacksC0049q5 != null) {
                                f(abstractComponentCallbacksC0049q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0033a2.f877a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q6 = ((P) it2.next()).f858b;
                            if (abstractComponentCallbacksC0049q6 != null) {
                                f(abstractComponentCallbacksC0049q6).k();
                            }
                        }
                    }
                }
                J(this.f823s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0033a) arrayList.get(i20)).f877a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q7 = ((P) it3.next()).f858b;
                        if (abstractComponentCallbacksC0049q7 != null && (viewGroup = abstractComponentCallbacksC0049q7.f951D) != null) {
                            hashSet.add(C0041i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0041i c0041i = (C0041i) it4.next();
                    c0041i.d = booleanValue;
                    synchronized (c0041i.f917b) {
                        try {
                            c0041i.g();
                            c0041i.f919e = false;
                            int size4 = c0041i.f917b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0041i.f917b.get(size4);
                                    int c2 = V.c(u2.f873c.f952E);
                                    if (u2.f871a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0048p c0048p = u2.f873c.f954H;
                                        c0041i.f919e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0041i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0033a c0033a3 = (C0033a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0033a3.f891r >= 0) {
                        c0033a3.f891r = -1;
                    }
                    c0033a3.getClass();
                }
                return;
            }
            C0033a c0033a4 = (C0033a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                uVar2 = uVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f805K;
                ArrayList arrayList10 = c0033a4.f877a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f857a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0049q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0049q = p4.f858b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f858b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f858b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f805K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0033a4.f877a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f857a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f858b);
                                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q8 = p5.f858b;
                                    if (abstractComponentCallbacksC0049q8 == abstractComponentCallbacksC0049q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0049q8));
                                        i24++;
                                        uVar3 = uVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0049q = null;
                                    }
                                } else if (i25 == 7) {
                                    uVar3 = uVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0049q, 0));
                                    p5.f859c = true;
                                    i24++;
                                    abstractComponentCallbacksC0049q = p5.f858b;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q9 = p5.f858b;
                                int i26 = abstractComponentCallbacksC0049q9.f984w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.u uVar6 = uVar4;
                                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q10 = (AbstractComponentCallbacksC0049q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0049q10.f984w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0049q10 == abstractComponentCallbacksC0049q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0049q10 == abstractComponentCallbacksC0049q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0049q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0049q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0049q10, i5);
                                        p6.d = p5.d;
                                        p6.f861f = p5.f861f;
                                        p6.f860e = p5.f860e;
                                        p6.f862g = p5.f862g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0049q10);
                                        i24++;
                                        abstractComponentCallbacksC0049q = abstractComponentCallbacksC0049q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    uVar4 = uVar6;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f857a = 1;
                                    p5.f859c = true;
                                    arrayList11.add(abstractComponentCallbacksC0049q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            uVar4 = uVar3;
                        } else {
                            uVar3 = uVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f858b);
                        i24 += i3;
                        i7 = i3;
                        uVar4 = uVar3;
                    } else {
                        uVar2 = uVar4;
                    }
                }
            }
            z3 = z3 || c0033a4.f882g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            uVar4 = uVar2;
        }
    }
}
