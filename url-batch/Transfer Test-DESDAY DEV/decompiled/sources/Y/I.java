package Y;

import K.C0014m;
import a.InterfaceC0057c;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0072m;
import com.football.transfertrivia.R;
import d0.C0089a;
import i0.C0141d;
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
    public B.j f949A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f950B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f951C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f952D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f953E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f954G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f955H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f956I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f957J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f958K;

    /* renamed from: L, reason: collision with root package name */
    public L f959L;

    /* renamed from: M, reason: collision with root package name */
    public final Q.b f960M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f962b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f964e;

    /* renamed from: g, reason: collision with root package name */
    public a.w f966g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f969l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f970m;

    /* renamed from: n, reason: collision with root package name */
    public final y f971n;

    /* renamed from: o, reason: collision with root package name */
    public final y f972o;

    /* renamed from: p, reason: collision with root package name */
    public final y f973p;

    /* renamed from: q, reason: collision with root package name */
    public final y f974q;

    /* renamed from: r, reason: collision with root package name */
    public final B f975r;

    /* renamed from: s, reason: collision with root package name */
    public int f976s;

    /* renamed from: t, reason: collision with root package name */
    public C0052u f977t;

    /* renamed from: u, reason: collision with root package name */
    public T.e f978u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f979v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0049q f980w;

    /* renamed from: x, reason: collision with root package name */
    public final C f981x;

    /* renamed from: y, reason: collision with root package name */
    public final O0.e f982y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f983z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f961a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U.v f963c = new U.v(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f965f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f967j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f968k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f969l = new B.j(this);
        this.f970m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f971n = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1159b;

            {
                this.f1159b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1159b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1159b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1159b;
                        if (i4.G()) {
                            i4.m(fVar.f4087a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1159b;
                        if (i5.G()) {
                            i5.r(gVar.f4088a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f972o = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1159b;

            {
                this.f1159b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1159b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1159b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1159b;
                        if (i4.G()) {
                            i4.m(fVar.f4087a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1159b;
                        if (i5.G()) {
                            i5.r(gVar.f4088a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f973p = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1159b;

            {
                this.f1159b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1159b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1159b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1159b;
                        if (i4.G()) {
                            i4.m(fVar.f4087a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1159b;
                        if (i5.G()) {
                            i5.r(gVar.f4088a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f974q = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1159b;

            {
                this.f1159b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1159b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1159b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1159b;
                        if (i42.G()) {
                            i42.m(fVar.f4087a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1159b;
                        if (i5.G()) {
                            i5.r(gVar.f4088a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f975r = new B(this);
        this.f976s = -1;
        this.f981x = new C(this);
        this.f982y = new O0.e(15);
        this.f951C = new ArrayDeque();
        this.f960M = new Q.b(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        abstractComponentCallbacksC0049q.getClass();
        Iterator it = abstractComponentCallbacksC0049q.f1134t.f963c.g().iterator();
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
        return abstractComponentCallbacksC0049q.f1102B && (abstractComponentCallbacksC0049q.f1132r == null || H(abstractComponentCallbacksC0049q.f1135u));
    }

    public static boolean I(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0049q.f1132r;
        return abstractComponentCallbacksC0049q.equals(i.f980w) && I(i.f979v);
    }

    public static void X(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f1139y) {
            abstractComponentCallbacksC0049q.f1139y = false;
            abstractComponentCallbacksC0049q.f1108I = !abstractComponentCallbacksC0049q.f1108I;
        }
    }

    public final AbstractComponentCallbacksC0049q A(int i) {
        U.v vVar = this.f963c;
        ArrayList arrayList = (ArrayList) vVar.f849a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) arrayList.get(size);
            if (abstractComponentCallbacksC0049q != null && abstractComponentCallbacksC0049q.f1136v == i) {
                return abstractComponentCallbacksC0049q;
            }
        }
        for (O o2 : ((HashMap) vVar.f850b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f1008c;
                if (abstractComponentCallbacksC0049q2.f1136v == i) {
                    return abstractComponentCallbacksC0049q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0049q.f1104D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0049q.f1137w > 0 && this.f978u.I()) {
            View H2 = this.f978u.H(abstractComponentCallbacksC0049q.f1137w);
            if (H2 instanceof ViewGroup) {
                return (ViewGroup) H2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f979v;
        return abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f1132r.C() : this.f981x;
    }

    public final O0.e D() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f979v;
        return abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f1132r.D() : this.f982y;
    }

    public final void E(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f1139y) {
            return;
        }
        abstractComponentCallbacksC0049q.f1139y = true;
        abstractComponentCallbacksC0049q.f1108I = true ^ abstractComponentCallbacksC0049q.f1108I;
        W(abstractComponentCallbacksC0049q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f979v;
        if (abstractComponentCallbacksC0049q == null) {
            return true;
        }
        return abstractComponentCallbacksC0049q.m() && this.f979v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0052u c0052u;
        if (this.f977t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f976s) {
            this.f976s = i;
            U.v vVar = this.f963c;
            Iterator it = ((ArrayList) vVar.f849a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) vVar.f850b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0049q) it.next()).f1121e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o3.f1008c;
                    if (abstractComponentCallbacksC0049q.f1126l && !abstractComponentCallbacksC0049q.o()) {
                        vVar.j(o3);
                    }
                }
            }
            Y();
            if (this.f952D && (c0052u = this.f977t) != null && this.f976s == 7) {
                c0052u.f1150e.invalidateOptionsMenu();
                this.f952D = false;
            }
        }
    }

    public final void K() {
        if (this.f977t == null) {
            return;
        }
        this.f953E = false;
        this.F = false;
        this.f959L.f995g = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f1134t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f980w;
        if (abstractComponentCallbacksC0049q != null && i < 0 && abstractComponentCallbacksC0049q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f956I, this.f957J, i, i2);
        if (N2) {
            this.f962b = true;
            try {
                P(this.f956I, this.f957J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f963c.f850b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0033a.f1044r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0033a c0033a2 = (C0033a) this.d.get(size - 1);
                            if (i < 0 || i != c0033a2.f1044r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0049q + " nesting=" + abstractComponentCallbacksC0049q.f1131q);
        }
        boolean o2 = abstractComponentCallbacksC0049q.o();
        if (abstractComponentCallbacksC0049q.f1140z && o2) {
            return;
        }
        U.v vVar = this.f963c;
        synchronized (((ArrayList) vVar.f849a)) {
            ((ArrayList) vVar.f849a).remove(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1125k = false;
        if (F(abstractComponentCallbacksC0049q)) {
            this.f952D = true;
        }
        abstractComponentCallbacksC0049q.f1126l = true;
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
            if (!((C0033a) arrayList.get(i)).f1041o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0033a) arrayList.get(i2)).f1041o) {
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
                bundle2.setClassLoader(this.f977t.f1148b.getClassLoader());
                this.f968k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f977t.f1148b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        U.v vVar = this.f963c;
        HashMap hashMap = (HashMap) vVar.f851c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f997b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) vVar.f850b;
        hashMap2.clear();
        Iterator it2 = j2.f984a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f969l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) vVar.f851c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) this.f959L.f991b.get(n3.f997b);
                if (abstractComponentCallbacksC0049q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0049q);
                    }
                    o2 = new O(jVar, vVar, abstractComponentCallbacksC0049q, n3);
                } else {
                    o2 = new O(this.f969l, this.f963c, this.f977t.f1148b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f1008c;
                abstractComponentCallbacksC0049q2.f1132r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0049q2.f1121e + "): " + abstractComponentCallbacksC0049q2);
                }
                o2.m(this.f977t.f1148b.getClassLoader());
                vVar.i(o2);
                o2.f1009e = this.f976s;
            }
        }
        L l2 = this.f959L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f991b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0049q3.f1121e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0049q3 + " that was not found in the set of active Fragments " + j2.f984a);
                }
                this.f959L.e(abstractComponentCallbacksC0049q3);
                abstractComponentCallbacksC0049q3.f1132r = this;
                O o3 = new O(jVar, vVar, abstractComponentCallbacksC0049q3);
                o3.f1009e = 1;
                o3.k();
                abstractComponentCallbacksC0049q3.f1126l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f985b;
        ((ArrayList) vVar.f849a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0049q c2 = vVar.c(str3);
                if (c2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c2);
                }
                vVar.a(c2);
            }
        }
        if (j2.f986c != null) {
            this.d = new ArrayList(j2.f986c.length);
            int i3 = 0;
            while (true) {
                C0034b[] c0034bArr = j2.f986c;
                if (i3 >= c0034bArr.length) {
                    break;
                }
                C0034b c0034b = c0034bArr[i3];
                c0034b.getClass();
                C0033a c0033a = new C0033a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0034b.f1045a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1010a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0033a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0072m.values()[c0034b.f1047c[i5]];
                    p2.i = EnumC0072m.values()[c0034b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1012c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1013e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1014f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1015g = i12;
                    c0033a.f1031b = i8;
                    c0033a.f1032c = i9;
                    c0033a.d = i11;
                    c0033a.f1033e = i12;
                    c0033a.b(p2);
                    i5++;
                    i = 2;
                }
                c0033a.f1034f = c0034b.f1048e;
                c0033a.h = c0034b.f1049f;
                c0033a.f1035g = true;
                c0033a.i = c0034b.h;
                c0033a.f1036j = c0034b.i;
                c0033a.f1037k = c0034b.f1051j;
                c0033a.f1038l = c0034b.f1052k;
                c0033a.f1039m = c0034b.f1053l;
                c0033a.f1040n = c0034b.f1054m;
                c0033a.f1041o = c0034b.f1055n;
                c0033a.f1044r = c0034b.f1050g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0034b.f1046b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0033a.f1030a.get(i13)).f1011b = vVar.c(str4);
                    }
                    i13++;
                }
                c0033a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0033a.f1044r + "): " + c0033a);
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
        String str5 = j2.f987e;
        if (str5 != null) {
            AbstractComponentCallbacksC0049q c3 = vVar.c(str5);
            this.f980w = c3;
            q(c3);
        }
        ArrayList arrayList4 = j2.f988f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f967j.put((String) arrayList4.get(i14), (C0035c) j2.f989g.get(i14));
            }
        }
        this.f951C = new ArrayDeque(j2.h);
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
            if (c0041i.f1072e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0041i.f1072e = false;
                c0041i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0041i) it2.next()).e();
        }
        y(true);
        this.f953E = true;
        this.f959L.f995g = true;
        U.v vVar = this.f963c;
        vVar.getClass();
        HashMap hashMap = (HashMap) vVar.f850b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
                N n2 = new N(abstractComponentCallbacksC0049q);
                if (abstractComponentCallbacksC0049q.f1118a <= -1 || n2.f1005m != null) {
                    n2.f1005m = abstractComponentCallbacksC0049q.f1119b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0049q.x(bundle2);
                    abstractComponentCallbacksC0049q.f1115P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0049q.f1134t.R());
                    o2.f1006a.r(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0049q.f1105E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0049q.f1120c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0049q.f1120c);
                    }
                    if (abstractComponentCallbacksC0049q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0049q.d);
                    }
                    if (!abstractComponentCallbacksC0049q.f1106G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0049q.f1106G);
                    }
                    n2.f1005m = bundle2;
                    if (abstractComponentCallbacksC0049q.h != null) {
                        if (bundle2 == null) {
                            n2.f1005m = new Bundle();
                        }
                        n2.f1005m.putString("android:target_state", abstractComponentCallbacksC0049q.h);
                        int i2 = abstractComponentCallbacksC0049q.i;
                        if (i2 != 0) {
                            n2.f1005m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f1008c;
                arrayList2.add(abstractComponentCallbacksC0049q2.f1121e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0049q2 + ": " + abstractComponentCallbacksC0049q2.f1119b);
                }
            }
        }
        U.v vVar2 = this.f963c;
        vVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) vVar2.f851c).values());
        if (!arrayList3.isEmpty()) {
            U.v vVar3 = this.f963c;
            synchronized (((ArrayList) vVar3.f849a)) {
                try {
                    if (((ArrayList) vVar3.f849a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) vVar3.f849a).size());
                        Iterator it3 = ((ArrayList) vVar3.f849a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0049q3.f1121e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0049q3.f1121e + "): " + abstractComponentCallbacksC0049q3);
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
            j2.f987e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f988f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f989g = arrayList6;
            j2.f984a = arrayList2;
            j2.f985b = arrayList;
            j2.f986c = c0034bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q4 = this.f980w;
            if (abstractComponentCallbacksC0049q4 != null) {
                j2.f987e = abstractComponentCallbacksC0049q4.f1121e;
            }
            arrayList5.addAll(this.f967j.keySet());
            arrayList6.addAll(this.f967j.values());
            j2.h = new ArrayList(this.f951C);
            bundle.putParcelable("state", j2);
            for (String str : this.f968k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f968k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f997b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f961a) {
            try {
                if (this.f961a.size() == 1) {
                    this.f977t.f1149c.removeCallbacks(this.f960M);
                    this.f977t.f1149c.post(this.f960M);
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

    public final void U(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, EnumC0072m enumC0072m) {
        if (abstractComponentCallbacksC0049q.equals(this.f963c.c(abstractComponentCallbacksC0049q.f1121e)) && (abstractComponentCallbacksC0049q.f1133s == null || abstractComponentCallbacksC0049q.f1132r == this)) {
            abstractComponentCallbacksC0049q.f1111L = enumC0072m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0049q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q != null) {
            if (!abstractComponentCallbacksC0049q.equals(this.f963c.c(abstractComponentCallbacksC0049q.f1121e)) || (abstractComponentCallbacksC0049q.f1133s != null && abstractComponentCallbacksC0049q.f1132r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0049q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = this.f980w;
        this.f980w = abstractComponentCallbacksC0049q;
        q(abstractComponentCallbacksC0049q2);
        q(this.f980w);
    }

    public final void W(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0049q);
        if (B2 != null) {
            C0048p c0048p = abstractComponentCallbacksC0049q.f1107H;
            if ((c0048p == null ? 0 : c0048p.f1095e) + (c0048p == null ? 0 : c0048p.d) + (c0048p == null ? 0 : c0048p.f1094c) + (c0048p == null ? 0 : c0048p.f1093b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0049q);
                }
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0048p c0048p2 = abstractComponentCallbacksC0049q.f1107H;
                boolean z2 = c0048p2 != null ? c0048p2.f1092a : false;
                if (abstractComponentCallbacksC0049q2.f1107H == null) {
                    return;
                }
                abstractComponentCallbacksC0049q2.f().f1092a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f963c.f().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
            if (abstractComponentCallbacksC0049q.F) {
                if (this.f962b) {
                    this.f955H = true;
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
        C0052u c0052u = this.f977t;
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
            c0052u.f1150e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str = abstractComponentCallbacksC0049q.f1110K;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0049q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0049q);
        }
        O f2 = f(abstractComponentCallbacksC0049q);
        abstractComponentCallbacksC0049q.f1132r = this;
        U.v vVar = this.f963c;
        vVar.i(f2);
        if (!abstractComponentCallbacksC0049q.f1140z) {
            vVar.a(abstractComponentCallbacksC0049q);
            abstractComponentCallbacksC0049q.f1126l = false;
            if (abstractComponentCallbacksC0049q.f1105E == null) {
                abstractComponentCallbacksC0049q.f1108I = false;
            }
            if (F(abstractComponentCallbacksC0049q)) {
                this.f952D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f961a) {
            try {
                if (!this.f961a.isEmpty()) {
                    A a2 = this.h;
                    a2.f937a = true;
                    a.v vVar = a2.f939c;
                    if (vVar != null) {
                        vVar.c();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f937a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f979v);
                a.v vVar2 = a3.f939c;
                if (vVar2 != null) {
                    vVar2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0052u c0052u, T.e eVar, AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str;
        if (this.f977t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f977t = c0052u;
        this.f978u = eVar;
        this.f979v = abstractComponentCallbacksC0049q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f970m;
        if (abstractComponentCallbacksC0049q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0049q));
        } else if (c0052u != null) {
            copyOnWriteArrayList.add(c0052u);
        }
        if (this.f979v != null) {
            a0();
        }
        if (c0052u != null) {
            a.w i = c0052u.f1150e.i();
            this.f966g = i;
            C0052u c0052u2 = abstractComponentCallbacksC0049q != 0 ? abstractComponentCallbacksC0049q : c0052u;
            i.getClass();
            A a2 = this.h;
            g1.f.e(a2, "onBackPressedCallback");
            androidx.lifecycle.v d = c0052u2.d();
            if (d.d != EnumC0072m.f1517a) {
                a2.f938b.add(new a.t(i, d, a2));
                i.d();
                a2.f939c = new a.v(0, i, a.w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }
        }
        if (abstractComponentCallbacksC0049q != 0) {
            L l2 = abstractComponentCallbacksC0049q.f1132r.f959L;
            HashMap hashMap = l2.f992c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0049q.f1121e);
            if (l3 == null) {
                l3 = new L(l2.f993e);
                hashMap.put(abstractComponentCallbacksC0049q.f1121e, l3);
            }
            this.f959L = l3;
        } else if (c0052u != null) {
            this.f959L = (L) new A0.h(c0052u.f1150e.c(), L.h).x(L.class);
        } else {
            this.f959L = new L(false);
        }
        L l4 = this.f959L;
        l4.f995g = this.f953E || this.F;
        this.f963c.d = l4;
        C0052u c0052u3 = this.f977t;
        if (c0052u3 != null && abstractComponentCallbacksC0049q == 0) {
            C0141d b2 = c0052u3.b();
            b2.e("android:support:fragments", new r(1, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0052u c0052u4 = this.f977t;
        if (c0052u4 != null) {
            a.j jVar = c0052u4.f1150e.h;
            if (abstractComponentCallbacksC0049q != 0) {
                str = abstractComponentCallbacksC0049q.f1121e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f983z = jVar.b(V.f(str2, "StartActivityForResult"), new E(2), new z(this, 1));
            this.f949A = jVar.b(V.f(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f950B = jVar.b(V.f(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0052u c0052u5 = this.f977t;
        if (c0052u5 != null) {
            c0052u5.f1150e.g(this.f971n);
        }
        C0052u c0052u6 = this.f977t;
        if (c0052u6 != null) {
            FragmentActivity fragmentActivity = c0052u6.f1150e;
            y yVar = this.f972o;
            fragmentActivity.getClass();
            g1.f.e(yVar, "listener");
            fragmentActivity.f1243j.add(yVar);
        }
        C0052u c0052u7 = this.f977t;
        if (c0052u7 != null) {
            FragmentActivity fragmentActivity2 = c0052u7.f1150e;
            y yVar2 = this.f973p;
            fragmentActivity2.getClass();
            g1.f.e(yVar2, "listener");
            fragmentActivity2.f1245l.add(yVar2);
        }
        C0052u c0052u8 = this.f977t;
        if (c0052u8 != null) {
            FragmentActivity fragmentActivity3 = c0052u8.f1150e;
            y yVar3 = this.f974q;
            fragmentActivity3.getClass();
            g1.f.e(yVar3, "listener");
            fragmentActivity3.f1246m.add(yVar3);
        }
        C0052u c0052u9 = this.f977t;
        if (c0052u9 == null || abstractComponentCallbacksC0049q != 0) {
            return;
        }
        FragmentActivity fragmentActivity4 = c0052u9.f1150e;
        B b3 = this.f975r;
        fragmentActivity4.getClass();
        g1.f.e(b3, "provider");
        C0014m c0014m = fragmentActivity4.f1239c;
        ((CopyOnWriteArrayList) c0014m.f425b).add(b3);
        ((Runnable) c0014m.f424a).run();
    }

    public final void c(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f1140z) {
            abstractComponentCallbacksC0049q.f1140z = false;
            if (abstractComponentCallbacksC0049q.f1125k) {
                return;
            }
            this.f963c.a(abstractComponentCallbacksC0049q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0049q);
            }
            if (F(abstractComponentCallbacksC0049q)) {
                this.f952D = true;
            }
        }
    }

    public final void d() {
        this.f962b = false;
        this.f957J.clear();
        this.f956I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f963c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1008c.f1104D;
            if (viewGroup != null) {
                hashSet.add(C0041i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        String str = abstractComponentCallbacksC0049q.f1121e;
        U.v vVar = this.f963c;
        O o2 = (O) ((HashMap) vVar.f850b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f969l, vVar, abstractComponentCallbacksC0049q);
        o3.m(this.f977t.f1148b.getClassLoader());
        o3.f1009e = this.f976s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0049q);
        }
        if (abstractComponentCallbacksC0049q.f1140z) {
            return;
        }
        abstractComponentCallbacksC0049q.f1140z = true;
        if (abstractComponentCallbacksC0049q.f1125k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0049q);
            }
            U.v vVar = this.f963c;
            synchronized (((ArrayList) vVar.f849a)) {
                ((ArrayList) vVar.f849a).remove(abstractComponentCallbacksC0049q);
            }
            abstractComponentCallbacksC0049q.f1125k = false;
            if (F(abstractComponentCallbacksC0049q)) {
                this.f952D = true;
            }
            W(abstractComponentCallbacksC0049q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f977t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f1103C = true;
                if (z2) {
                    abstractComponentCallbacksC0049q.f1134t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f976s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                if (!abstractComponentCallbacksC0049q.f1139y ? abstractComponentCallbacksC0049q.f1134t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f976s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null && H(abstractComponentCallbacksC0049q)) {
                if (!abstractComponentCallbacksC0049q.f1139y ? abstractComponentCallbacksC0049q.f1134t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0049q);
                    z2 = true;
                }
            }
        }
        if (this.f964e != null) {
            for (int i = 0; i < this.f964e.size(); i++) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = (AbstractComponentCallbacksC0049q) this.f964e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0049q2)) {
                    abstractComponentCallbacksC0049q2.getClass();
                }
            }
        }
        this.f964e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f954G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0041i) it.next()).e();
        }
        C0052u c0052u = this.f977t;
        U.v vVar = this.f963c;
        if (c0052u != null) {
            z2 = ((L) vVar.d).f994f;
        } else {
            FragmentActivity fragmentActivity = c0052u.f1148b;
            if (fragmentActivity != null) {
                z2 = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f967j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0035c) it2.next()).f1056a) {
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
        C0052u c0052u2 = this.f977t;
        if (c0052u2 != null) {
            FragmentActivity fragmentActivity2 = c0052u2.f1150e;
            y yVar = this.f972o;
            fragmentActivity2.getClass();
            g1.f.e(yVar, "listener");
            fragmentActivity2.f1243j.remove(yVar);
        }
        C0052u c0052u3 = this.f977t;
        if (c0052u3 != null) {
            FragmentActivity fragmentActivity3 = c0052u3.f1150e;
            y yVar2 = this.f971n;
            fragmentActivity3.getClass();
            g1.f.e(yVar2, "listener");
            fragmentActivity3.i.remove(yVar2);
        }
        C0052u c0052u4 = this.f977t;
        if (c0052u4 != null) {
            FragmentActivity fragmentActivity4 = c0052u4.f1150e;
            y yVar3 = this.f973p;
            fragmentActivity4.getClass();
            g1.f.e(yVar3, "listener");
            fragmentActivity4.f1245l.remove(yVar3);
        }
        C0052u c0052u5 = this.f977t;
        if (c0052u5 != null) {
            FragmentActivity fragmentActivity5 = c0052u5.f1150e;
            y yVar4 = this.f974q;
            fragmentActivity5.getClass();
            g1.f.e(yVar4, "listener");
            fragmentActivity5.f1246m.remove(yVar4);
        }
        C0052u c0052u6 = this.f977t;
        if (c0052u6 != null) {
            FragmentActivity fragmentActivity6 = c0052u6.f1150e;
            B b2 = this.f975r;
            fragmentActivity6.getClass();
            g1.f.e(b2, "provider");
            C0014m c0014m = fragmentActivity6.f1239c;
            ((CopyOnWriteArrayList) c0014m.f425b).remove(b2);
            if (((HashMap) c0014m.f426c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0014m.f424a).run();
        }
        this.f977t = null;
        this.f978u = null;
        this.f979v = null;
        if (this.f966g != null) {
            Iterator it3 = this.h.f938b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0057c) it3.next()).cancel();
            }
            this.f966g = null;
        }
        B.j jVar = this.f983z;
        if (jVar != null) {
            jVar.K();
            this.f949A.K();
            this.f950B.K();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f977t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.f1103C = true;
                if (z2) {
                    abstractComponentCallbacksC0049q.f1134t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f977t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null && z3) {
                abstractComponentCallbacksC0049q.f1134t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f963c.g().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) it.next();
            if (abstractComponentCallbacksC0049q != null) {
                abstractComponentCallbacksC0049q.n();
                abstractComponentCallbacksC0049q.f1134t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f976s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                if (!abstractComponentCallbacksC0049q.f1139y ? abstractComponentCallbacksC0049q.f1134t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f976s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null && !abstractComponentCallbacksC0049q.f1139y) {
                abstractComponentCallbacksC0049q.f1134t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (abstractComponentCallbacksC0049q != null) {
            if (abstractComponentCallbacksC0049q.equals(this.f963c.c(abstractComponentCallbacksC0049q.f1121e))) {
                abstractComponentCallbacksC0049q.f1132r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0049q);
                Boolean bool = abstractComponentCallbacksC0049q.f1124j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0049q.f1124j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0049q.f1134t;
                    i.a0();
                    i.q(i.f980w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f977t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null && z3) {
                abstractComponentCallbacksC0049q.f1134t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f976s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : this.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null && H(abstractComponentCallbacksC0049q)) {
                if (!abstractComponentCallbacksC0049q.f1139y ? abstractComponentCallbacksC0049q.f1134t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f962b = true;
            for (O o2 : ((HashMap) this.f963c.f850b).values()) {
                if (o2 != null) {
                    o2.f1009e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0041i) it.next()).e();
            }
            this.f962b = false;
            y(true);
        } catch (Throwable th) {
            this.f962b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f979v;
        if (abstractComponentCallbacksC0049q != null) {
            sb.append(abstractComponentCallbacksC0049q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f979v)));
            sb.append("}");
        } else {
            C0052u c0052u = this.f977t;
            if (c0052u != null) {
                sb.append(c0052u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f977t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f955H) {
            this.f955H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = V.f(str, "    ");
        U.v vVar = this.f963c;
        vVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) vVar.f850b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
                    printWriter.println(abstractComponentCallbacksC0049q);
                    abstractComponentCallbacksC0049q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0049q.f1136v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0049q.f1137w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0049q.f1138x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1118a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1121e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0049q.f1131q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1125k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1126l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1127m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0049q.f1128n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1139y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1140z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1102B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0049q.f1101A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0049q.f1106G);
                    if (abstractComponentCallbacksC0049q.f1132r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1132r);
                    }
                    if (abstractComponentCallbacksC0049q.f1133s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1133s);
                    }
                    if (abstractComponentCallbacksC0049q.f1135u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1135u);
                    }
                    if (abstractComponentCallbacksC0049q.f1122f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1122f);
                    }
                    if (abstractComponentCallbacksC0049q.f1119b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1119b);
                    }
                    if (abstractComponentCallbacksC0049q.f1120c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1120c);
                    }
                    if (abstractComponentCallbacksC0049q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0049q.d);
                    }
                    Object obj = abstractComponentCallbacksC0049q.f1123g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0049q.f1132r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0049q.h) == null) ? null : i.f963c.c(str2);
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
                    C0048p c0048p = abstractComponentCallbacksC0049q.f1107H;
                    printWriter.println(c0048p == null ? false : c0048p.f1092a);
                    C0048p c0048p2 = abstractComponentCallbacksC0049q.f1107H;
                    if ((c0048p2 == null ? 0 : c0048p2.f1093b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0048p c0048p3 = abstractComponentCallbacksC0049q.f1107H;
                        printWriter.println(c0048p3 == null ? 0 : c0048p3.f1093b);
                    }
                    C0048p c0048p4 = abstractComponentCallbacksC0049q.f1107H;
                    if ((c0048p4 == null ? 0 : c0048p4.f1094c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0048p c0048p5 = abstractComponentCallbacksC0049q.f1107H;
                        printWriter.println(c0048p5 == null ? 0 : c0048p5.f1094c);
                    }
                    C0048p c0048p6 = abstractComponentCallbacksC0049q.f1107H;
                    if ((c0048p6 == null ? 0 : c0048p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0048p c0048p7 = abstractComponentCallbacksC0049q.f1107H;
                        printWriter.println(c0048p7 == null ? 0 : c0048p7.d);
                    }
                    C0048p c0048p8 = abstractComponentCallbacksC0049q.f1107H;
                    if ((c0048p8 == null ? 0 : c0048p8.f1095e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0048p c0048p9 = abstractComponentCallbacksC0049q.f1107H;
                        printWriter.println(c0048p9 == null ? 0 : c0048p9.f1095e);
                    }
                    if (abstractComponentCallbacksC0049q.f1104D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1104D);
                    }
                    if (abstractComponentCallbacksC0049q.f1105E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0049q.f1105E);
                    }
                    if (abstractComponentCallbacksC0049q.h() != null) {
                        o.l lVar = ((C0089a) new A0.h(abstractComponentCallbacksC0049q.c(), C0089a.f2100c).x(C0089a.class)).f2101b;
                        if (lVar.f3189c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3189c > 0) {
                                if (lVar.f3188b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3187a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0049q.f1134t + ":");
                    abstractComponentCallbacksC0049q.f1134t.v(V.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) vVar.f849a;
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
        ArrayList arrayList2 = this.f964e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = (AbstractComponentCallbacksC0049q) this.f964e.get(i3);
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
                c0033a.d(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f961a) {
            try {
                int size4 = this.f961a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f961a.get(i5);
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
        printWriter.println(this.f977t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f978u);
        if (this.f979v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f979v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f976s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f953E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f954G);
        if (this.f952D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f952D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f977t == null) {
                if (!this.f954G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f953E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f961a) {
            try {
                if (this.f977t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f961a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f962b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f977t == null) {
            if (!this.f954G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f977t.f1149c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f953E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f956I == null) {
            this.f956I = new ArrayList();
            this.f957J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f956I;
            ArrayList arrayList2 = this.f957J;
            synchronized (this.f961a) {
                if (this.f961a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f961a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f961a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f963c.f850b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f962b = true;
            try {
                P(this.f956I, this.f957J);
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
        boolean z2 = ((C0033a) arrayList3.get(i)).f1041o;
        ArrayList arrayList5 = this.f958K;
        if (arrayList5 == null) {
            this.f958K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f958K;
        U.v vVar4 = this.f963c;
        arrayList6.addAll(vVar4.h());
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f980w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                U.v vVar5 = vVar4;
                this.f958K.clear();
                if (!z2 && this.f976s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0033a) arrayList.get(i8)).f1030a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = ((P) it.next()).f1011b;
                            if (abstractComponentCallbacksC0049q2 == null || abstractComponentCallbacksC0049q2.f1132r == null) {
                                vVar = vVar5;
                            } else {
                                vVar = vVar5;
                                vVar.i(f(abstractComponentCallbacksC0049q2));
                            }
                            vVar5 = vVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0033a c0033a = (C0033a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0033a.c(-1);
                        ArrayList arrayList7 = c0033a.f1030a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = p2.f1011b;
                            if (abstractComponentCallbacksC0049q3 != null) {
                                if (abstractComponentCallbacksC0049q3.f1107H != null) {
                                    abstractComponentCallbacksC0049q3.f().f1092a = z4;
                                }
                                int i10 = c0033a.f1034f;
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
                                if (abstractComponentCallbacksC0049q3.f1107H != null || i11 != 0) {
                                    abstractComponentCallbacksC0049q3.f();
                                    abstractComponentCallbacksC0049q3.f1107H.f1096f = i11;
                                }
                                abstractComponentCallbacksC0049q3.f();
                                abstractComponentCallbacksC0049q3.f1107H.getClass();
                            }
                            int i13 = p2.f1010a;
                            I i14 = c0033a.f1042p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0049q3, true);
                                    i14.O(abstractComponentCallbacksC0049q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1010a);
                                case 3:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
                                    i14.a(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
                                    i14.T(abstractComponentCallbacksC0049q3, true);
                                    i14.E(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
                                    i14.c(abstractComponentCallbacksC0049q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0049q3.E(p2.d, p2.f1013e, p2.f1014f, p2.f1015g);
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
                        ArrayList arrayList8 = c0033a.f1030a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q4 = p3.f1011b;
                            if (abstractComponentCallbacksC0049q4 != null) {
                                if (abstractComponentCallbacksC0049q4.f1107H != null) {
                                    abstractComponentCallbacksC0049q4.f().f1092a = false;
                                }
                                int i16 = c0033a.f1034f;
                                if (abstractComponentCallbacksC0049q4.f1107H != null || i16 != 0) {
                                    abstractComponentCallbacksC0049q4.f();
                                    abstractComponentCallbacksC0049q4.f1107H.f1096f = i16;
                                }
                                abstractComponentCallbacksC0049q4.f();
                                abstractComponentCallbacksC0049q4.f1107H.getClass();
                            }
                            int i17 = p3.f1010a;
                            I i18 = c0033a.f1042p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
                                    i18.T(abstractComponentCallbacksC0049q4, false);
                                    i18.a(abstractComponentCallbacksC0049q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1010a);
                                case 3:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
                                    i18.O(abstractComponentCallbacksC0049q4);
                                case 4:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
                                    i18.E(abstractComponentCallbacksC0049q4);
                                case 5:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
                                    i18.T(abstractComponentCallbacksC0049q4, false);
                                    X(abstractComponentCallbacksC0049q4);
                                case 6:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
                                    i18.g(abstractComponentCallbacksC0049q4);
                                case 7:
                                    abstractComponentCallbacksC0049q4.E(p3.d, p3.f1013e, p3.f1014f, p3.f1015g);
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
                        for (int size3 = c0033a2.f1030a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q5 = ((P) c0033a2.f1030a.get(size3)).f1011b;
                            if (abstractComponentCallbacksC0049q5 != null) {
                                f(abstractComponentCallbacksC0049q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0033a2.f1030a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q6 = ((P) it2.next()).f1011b;
                            if (abstractComponentCallbacksC0049q6 != null) {
                                f(abstractComponentCallbacksC0049q6).k();
                            }
                        }
                    }
                }
                J(this.f976s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0033a) arrayList.get(i20)).f1030a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q7 = ((P) it3.next()).f1011b;
                        if (abstractComponentCallbacksC0049q7 != null && (viewGroup = abstractComponentCallbacksC0049q7.f1104D) != null) {
                            hashSet.add(C0041i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0041i c0041i = (C0041i) it4.next();
                    c0041i.d = booleanValue;
                    synchronized (c0041i.f1070b) {
                        try {
                            c0041i.g();
                            c0041i.f1072e = false;
                            int size4 = c0041i.f1070b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0041i.f1070b.get(size4);
                                    int c2 = V.c(u2.f1026c.f1105E);
                                    if (u2.f1024a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0048p c0048p = u2.f1026c.f1107H;
                                        c0041i.f1072e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0033a3.f1044r >= 0) {
                        c0033a3.f1044r = -1;
                    }
                    c0033a3.getClass();
                }
                return;
            }
            C0033a c0033a4 = (C0033a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                vVar2 = vVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f958K;
                ArrayList arrayList10 = c0033a4.f1030a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1010a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0049q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0049q = p4.f1011b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1011b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1011b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f958K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0033a4.f1030a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1010a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1011b);
                                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q8 = p5.f1011b;
                                    if (abstractComponentCallbacksC0049q8 == abstractComponentCallbacksC0049q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0049q8));
                                        i24++;
                                        vVar3 = vVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0049q = null;
                                    }
                                } else if (i25 == 7) {
                                    vVar3 = vVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0049q, 0));
                                    p5.f1012c = true;
                                    i24++;
                                    abstractComponentCallbacksC0049q = p5.f1011b;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q9 = p5.f1011b;
                                int i26 = abstractComponentCallbacksC0049q9.f1137w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    U.v vVar6 = vVar4;
                                    AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q10 = (AbstractComponentCallbacksC0049q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0049q10.f1137w != i26) {
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
                                        p6.f1014f = p5.f1014f;
                                        p6.f1013e = p5.f1013e;
                                        p6.f1015g = p5.f1015g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0049q10);
                                        i24++;
                                        abstractComponentCallbacksC0049q = abstractComponentCallbacksC0049q;
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
                                    p5.f1010a = 1;
                                    p5.f1012c = true;
                                    arrayList11.add(abstractComponentCallbacksC0049q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            vVar4 = vVar3;
                        } else {
                            vVar3 = vVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1011b);
                        i24 += i3;
                        i7 = i3;
                        vVar4 = vVar3;
                    } else {
                        vVar2 = vVar4;
                    }
                }
            }
            z3 = z3 || c0033a4.f1035g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            vVar4 = vVar2;
        }
    }
}
