package o;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0588Wo {
    public final C0140Fh A;
    public V1 B;
    public V1 C;
    public V1 D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public C0733ap N;
    public final R2 O;
    public boolean b;
    public ArrayList e;
    public YF g;
    public final ArrayList m;
    public final C2002u5 n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f126o;
    public final C0328Mo p;
    public final C0328Mo q;
    public final C0328Mo r;
    public final C0328Mo s;
    public final C0406Po t;
    public int u;
    public C0173Go v;
    public AbstractC1305jX w;
    public AbstractComponentCallbacksC0069Co x;
    public AbstractComponentCallbacksC0069Co y;
    public final C0432Qo z;
    public final ArrayList a = new ArrayList();
    public final C1334k c = new C1334k(8);
    public ArrayList d = new ArrayList();
    public final LayoutInflaterFactory2C0303Lo f = new LayoutInflaterFactory2C0303Lo(this);
    public Q7 h = null;
    public final C0380Oo i = new C0380Oo(this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [o.Mo] */
    /* JADX WARN: Type inference failed for: r0v16, types: [o.Mo] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.Mo] */
    /* JADX WARN: Type inference failed for: r0v18, types: [o.Mo] */
    public AbstractC0588Wo() {
        Collections.synchronizedMap(new HashMap());
        this.m = new ArrayList();
        this.n = new C2002u5(this);
        this.f126o = new CopyOnWriteArrayList();
        final int i = 0;
        this.p = new InterfaceC0655Zd(this) { // from class: o.Mo
            public final /* synthetic */ AbstractC0588Wo b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        AbstractC0588Wo abstractC0588Wo = this.b;
                        if (abstractC0588Wo.L()) {
                            abstractC0588Wo.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0588Wo abstractC0588Wo2 = this.b;
                        if (abstractC0588Wo2.L() && num.intValue() == 80) {
                            abstractC0588Wo2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1681pD c1681pD = (C1681pD) obj;
                        AbstractC0588Wo abstractC0588Wo3 = this.b;
                        if (abstractC0588Wo3.L()) {
                            boolean z = c1681pD.a;
                            abstractC0588Wo3.n(false);
                            break;
                        }
                        break;
                    default:
                        YH yh = (YH) obj;
                        AbstractC0588Wo abstractC0588Wo4 = this.b;
                        if (abstractC0588Wo4.L()) {
                            boolean z2 = yh.a;
                            abstractC0588Wo4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.q = new InterfaceC0655Zd(this) { // from class: o.Mo
            public final /* synthetic */ AbstractC0588Wo b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        AbstractC0588Wo abstractC0588Wo = this.b;
                        if (abstractC0588Wo.L()) {
                            abstractC0588Wo.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0588Wo abstractC0588Wo2 = this.b;
                        if (abstractC0588Wo2.L() && num.intValue() == 80) {
                            abstractC0588Wo2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1681pD c1681pD = (C1681pD) obj;
                        AbstractC0588Wo abstractC0588Wo3 = this.b;
                        if (abstractC0588Wo3.L()) {
                            boolean z = c1681pD.a;
                            abstractC0588Wo3.n(false);
                            break;
                        }
                        break;
                    default:
                        YH yh = (YH) obj;
                        AbstractC0588Wo abstractC0588Wo4 = this.b;
                        if (abstractC0588Wo4.L()) {
                            boolean z2 = yh.a;
                            abstractC0588Wo4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.r = new InterfaceC0655Zd(this) { // from class: o.Mo
            public final /* synthetic */ AbstractC0588Wo b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        AbstractC0588Wo abstractC0588Wo = this.b;
                        if (abstractC0588Wo.L()) {
                            abstractC0588Wo.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0588Wo abstractC0588Wo2 = this.b;
                        if (abstractC0588Wo2.L() && num.intValue() == 80) {
                            abstractC0588Wo2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1681pD c1681pD = (C1681pD) obj;
                        AbstractC0588Wo abstractC0588Wo3 = this.b;
                        if (abstractC0588Wo3.L()) {
                            boolean z = c1681pD.a;
                            abstractC0588Wo3.n(false);
                            break;
                        }
                        break;
                    default:
                        YH yh = (YH) obj;
                        AbstractC0588Wo abstractC0588Wo4 = this.b;
                        if (abstractC0588Wo4.L()) {
                            boolean z2 = yh.a;
                            abstractC0588Wo4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.s = new InterfaceC0655Zd(this) { // from class: o.Mo
            public final /* synthetic */ AbstractC0588Wo b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        AbstractC0588Wo abstractC0588Wo = this.b;
                        if (abstractC0588Wo.L()) {
                            abstractC0588Wo.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0588Wo abstractC0588Wo2 = this.b;
                        if (abstractC0588Wo2.L() && num.intValue() == 80) {
                            abstractC0588Wo2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1681pD c1681pD = (C1681pD) obj;
                        AbstractC0588Wo abstractC0588Wo3 = this.b;
                        if (abstractC0588Wo3.L()) {
                            boolean z = c1681pD.a;
                            abstractC0588Wo3.n(false);
                            break;
                        }
                        break;
                    default:
                        YH yh = (YH) obj;
                        AbstractC0588Wo abstractC0588Wo4 = this.b;
                        if (abstractC0588Wo4.L()) {
                            boolean z2 = yh.a;
                            abstractC0588Wo4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.t = new C0406Po(this);
        this.u = -1;
        this.z = new C0432Qo(this);
        this.A = new C0140Fh(7);
        this.E = new ArrayDeque();
        this.O = new R2(5, this);
    }

    public static HashSet E(Q7 q7) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < q7.a.size(); i++) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = ((C1258ip) q7.a.get(i)).b;
            if (abstractComponentCallbacksC0069Co != null && q7.g) {
                hashSet.add(abstractComponentCallbacksC0069Co);
            }
        }
        return hashSet;
    }

    public static boolean J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean K(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        abstractComponentCallbacksC0069Co.getClass();
        Iterator it = abstractComponentCallbacksC0069Co.B.c.w().iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = (AbstractComponentCallbacksC0069Co) it.next();
            if (abstractComponentCallbacksC0069Co2 != null) {
                z = K(abstractComponentCallbacksC0069Co2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (abstractComponentCallbacksC0069Co == null) {
            return true;
        }
        if (abstractComponentCallbacksC0069Co.J) {
            return abstractComponentCallbacksC0069Co.z == null || M(abstractComponentCallbacksC0069Co.C);
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (abstractComponentCallbacksC0069Co == null) {
            return true;
        }
        AbstractC0588Wo abstractC0588Wo = abstractComponentCallbacksC0069Co.z;
        return abstractComponentCallbacksC0069Co.equals(abstractC0588Wo.y) && N(abstractC0588Wo.x);
    }

    public static void b0(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0069Co);
        }
        if (abstractComponentCallbacksC0069Co.G) {
            abstractComponentCallbacksC0069Co.G = false;
            abstractComponentCallbacksC0069Co.P = !abstractComponentCallbacksC0069Co.P;
        }
    }

    public final boolean A(boolean z) {
        boolean z2;
        z(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((InterfaceC0510To) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                e0();
                v();
                ((HashMap) this.c.i).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                T(this.K, this.L);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        String str;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        ArrayList arrayList4;
        int i4;
        int i5;
        int i6 = i;
        C1334k c1334k = this.c;
        ArrayList arrayList5 = this.m;
        boolean z4 = ((Q7) arrayList.get(i6)).f88o;
        ArrayList arrayList6 = this.M;
        if (arrayList6 == null) {
            this.M = new ArrayList();
        } else {
            arrayList6.clear();
        }
        this.M.addAll(c1334k.y());
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.y;
        int i7 = i6;
        boolean z5 = false;
        while (i7 < i2) {
            Q7 q7 = (Q7) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                arrayList3 = arrayList5;
                z = z4;
                i3 = i7;
                z2 = z5;
                int i8 = 1;
                ArrayList arrayList7 = this.M;
                ArrayList arrayList8 = q7.a;
                int size = arrayList8.size() - 1;
                while (size >= 0) {
                    C1258ip c1258ip = (C1258ip) arrayList8.get(size);
                    int i9 = c1258ip.a;
                    if (i9 != i8) {
                        if (i9 != 3) {
                            switch (i9) {
                                case 8:
                                    abstractComponentCallbacksC0069Co = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0069Co = c1258ip.b;
                                    break;
                                case 10:
                                    c1258ip.i = c1258ip.h;
                                    break;
                            }
                            size--;
                            i8 = 1;
                        }
                        arrayList7.add(c1258ip.b);
                        size--;
                        i8 = 1;
                    }
                    arrayList7.remove(c1258ip.b);
                    size--;
                    i8 = 1;
                }
            } else {
                ArrayList arrayList9 = this.M;
                ArrayList arrayList10 = q7.a;
                int i10 = 0;
                while (i10 < arrayList10.size()) {
                    C1258ip c1258ip2 = (C1258ip) arrayList10.get(i10);
                    boolean z6 = z4;
                    int i11 = c1258ip2.a;
                    int i12 = i7;
                    int i13 = 1;
                    if (i11 != 1) {
                        z3 = z5;
                        if (i11 == 2) {
                            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = c1258ip2.b;
                            int i14 = abstractComponentCallbacksC0069Co2.E;
                            int size2 = arrayList9.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i15 = size2;
                                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = (AbstractComponentCallbacksC0069Co) arrayList9.get(size2);
                                ArrayList arrayList11 = arrayList5;
                                if (abstractComponentCallbacksC0069Co3.E != i14) {
                                    i4 = i14;
                                } else if (abstractComponentCallbacksC0069Co3 == abstractComponentCallbacksC0069Co2) {
                                    i4 = i14;
                                    z7 = true;
                                } else {
                                    if (abstractComponentCallbacksC0069Co3 == abstractComponentCallbacksC0069Co) {
                                        i4 = i14;
                                        arrayList10.add(i10, new C1258ip(9, abstractComponentCallbacksC0069Co3, 0));
                                        i10++;
                                        i5 = 0;
                                        abstractComponentCallbacksC0069Co = null;
                                    } else {
                                        i4 = i14;
                                        i5 = 0;
                                    }
                                    C1258ip c1258ip3 = new C1258ip(3, abstractComponentCallbacksC0069Co3, i5);
                                    c1258ip3.d = c1258ip2.d;
                                    c1258ip3.f = c1258ip2.f;
                                    c1258ip3.e = c1258ip2.e;
                                    c1258ip3.g = c1258ip2.g;
                                    arrayList10.add(i10, c1258ip3);
                                    arrayList9.remove(abstractComponentCallbacksC0069Co3);
                                    i10++;
                                    abstractComponentCallbacksC0069Co = abstractComponentCallbacksC0069Co;
                                }
                                size2 = i15 - 1;
                                i14 = i4;
                                arrayList5 = arrayList11;
                            }
                            arrayList4 = arrayList5;
                            i13 = 1;
                            if (z7) {
                                arrayList10.remove(i10);
                                i10--;
                            } else {
                                c1258ip2.a = 1;
                                c1258ip2.c = true;
                                arrayList9.add(abstractComponentCallbacksC0069Co2);
                            }
                        } else if (i11 == 3 || i11 == 6) {
                            arrayList9.remove(c1258ip2.b);
                            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co4 = c1258ip2.b;
                            if (abstractComponentCallbacksC0069Co4 == abstractComponentCallbacksC0069Co) {
                                arrayList10.add(i10, new C1258ip(9, abstractComponentCallbacksC0069Co4));
                                i10++;
                                arrayList4 = arrayList5;
                                abstractComponentCallbacksC0069Co = null;
                                i13 = 1;
                            }
                            arrayList4 = arrayList5;
                            i13 = 1;
                        } else if (i11 != 7) {
                            if (i11 == 8) {
                                arrayList10.add(i10, new C1258ip(9, abstractComponentCallbacksC0069Co, 0));
                                c1258ip2.c = true;
                                i10++;
                                arrayList4 = arrayList5;
                                abstractComponentCallbacksC0069Co = c1258ip2.b;
                                i13 = 1;
                            }
                            arrayList4 = arrayList5;
                            i13 = 1;
                        } else {
                            i13 = 1;
                        }
                        i10 += i13;
                        z4 = z6;
                        i7 = i12;
                        z5 = z3;
                        arrayList5 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList5;
                    arrayList9.add(c1258ip2.b);
                    i10 += i13;
                    z4 = z6;
                    i7 = i12;
                    z5 = z3;
                    arrayList5 = arrayList4;
                }
                arrayList3 = arrayList5;
                z = z4;
                i3 = i7;
                z2 = z5;
            }
            z5 = z2 || q7.g;
            i7 = i3 + 1;
            z4 = z;
            arrayList5 = arrayList3;
        }
        ArrayList arrayList12 = arrayList5;
        boolean z8 = z4;
        boolean z9 = z5;
        this.M.clear();
        if (!z8 && this.u >= 1) {
            for (int i16 = i6; i16 < i2; i16++) {
                Iterator it = ((Q7) arrayList.get(i16)).a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co5 = ((C1258ip) it.next()).b;
                    if (abstractComponentCallbacksC0069Co5 != null && abstractComponentCallbacksC0069Co5.z != null) {
                        c1334k.C(g(abstractComponentCallbacksC0069Co5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i6;
        while (i17 < i2) {
            Q7 q72 = (Q7) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                q72.c(-1);
                AbstractC0588Wo abstractC0588Wo = q72.p;
                ArrayList arrayList13 = q72.a;
                boolean z10 = true;
                for (int size3 = arrayList13.size() - 1; size3 >= 0; size3--) {
                    C1258ip c1258ip4 = (C1258ip) arrayList13.get(size3);
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co6 = c1258ip4.b;
                    if (abstractComponentCallbacksC0069Co6 != null) {
                        if (abstractComponentCallbacksC0069Co6.O != null) {
                            abstractComponentCallbacksC0069Co6.b().a = z10;
                        }
                        int i18 = q72.f;
                        int i19 = 8194;
                        int i20 = 4097;
                        if (i18 != 4097) {
                            if (i18 != 8194) {
                                i19 = 4100;
                                if (i18 != 8197) {
                                    i20 = 4099;
                                    if (i18 != 4099) {
                                        i19 = i18 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i19 = i20;
                        }
                        if (abstractComponentCallbacksC0069Co6.O != null || i19 != 0) {
                            abstractComponentCallbacksC0069Co6.b();
                            abstractComponentCallbacksC0069Co6.O.f = i19;
                        }
                        abstractComponentCallbacksC0069Co6.b();
                        abstractComponentCallbacksC0069Co6.O.getClass();
                    }
                    switch (c1258ip4.a) {
                        case 1:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            z10 = true;
                            abstractC0588Wo.X(abstractComponentCallbacksC0069Co6, true);
                            abstractC0588Wo.S(abstractComponentCallbacksC0069Co6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c1258ip4.a);
                        case 3:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            abstractC0588Wo.a(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case 4:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            abstractC0588Wo.getClass();
                            b0(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            abstractC0588Wo.X(abstractComponentCallbacksC0069Co6, true);
                            abstractC0588Wo.I(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            abstractC0588Wo.c(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            abstractComponentCallbacksC0069Co6.v(c1258ip4.d, c1258ip4.e, c1258ip4.f, c1258ip4.g);
                            abstractC0588Wo.X(abstractComponentCallbacksC0069Co6, true);
                            abstractC0588Wo.h(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case 8:
                            abstractC0588Wo.Z(null);
                            z10 = true;
                        case 9:
                            abstractC0588Wo.Z(abstractComponentCallbacksC0069Co6);
                            z10 = true;
                        case 10:
                            abstractC0588Wo.Y(abstractComponentCallbacksC0069Co6, c1258ip4.h);
                            z10 = true;
                    }
                }
            } else {
                q72.c(1);
                AbstractC0588Wo abstractC0588Wo2 = q72.p;
                ArrayList arrayList14 = q72.a;
                int size4 = arrayList14.size();
                int i21 = 0;
                while (i21 < size4) {
                    C1258ip c1258ip5 = (C1258ip) arrayList14.get(i21);
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co7 = c1258ip5.b;
                    if (abstractComponentCallbacksC0069Co7 != null) {
                        if (abstractComponentCallbacksC0069Co7.O != null) {
                            abstractComponentCallbacksC0069Co7.b().a = false;
                        }
                        int i22 = q72.f;
                        if (abstractComponentCallbacksC0069Co7.O != null || i22 != 0) {
                            abstractComponentCallbacksC0069Co7.b();
                            abstractComponentCallbacksC0069Co7.O.f = i22;
                        }
                        abstractComponentCallbacksC0069Co7.b();
                        abstractComponentCallbacksC0069Co7.O.getClass();
                    }
                    switch (c1258ip5.a) {
                        case 1:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.X(abstractComponentCallbacksC0069Co7, false);
                            abstractC0588Wo2.a(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c1258ip5.a);
                        case 3:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.S(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case 4:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.I(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.X(abstractComponentCallbacksC0069Co7, false);
                            b0(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.h(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = str2;
                            abstractComponentCallbacksC0069Co7.v(c1258ip5.d, c1258ip5.e, c1258ip5.f, c1258ip5.g);
                            abstractC0588Wo2.X(abstractComponentCallbacksC0069Co7, false);
                            abstractC0588Wo2.c(abstractComponentCallbacksC0069Co7);
                            i21++;
                            str2 = str;
                        case 8:
                            abstractC0588Wo2.Z(abstractComponentCallbacksC0069Co7);
                            str = str2;
                            i21++;
                            str2 = str;
                        case 9:
                            abstractC0588Wo2.Z(null);
                            str = str2;
                            i21++;
                            str2 = str;
                        case 10:
                            abstractC0588Wo2.Y(abstractComponentCallbacksC0069Co7, c1258ip5.i);
                            str = str2;
                            i21++;
                            str2 = str;
                    }
                }
            }
            i17++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList12.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(E((Q7) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList12.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList12.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i23 = i6; i23 < i2; i23++) {
            Q7 q73 = (Q7) arrayList.get(i23);
            if (booleanValue) {
                for (int size5 = q73.a.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co8 = ((C1258ip) q73.a.get(size5)).b;
                    if (abstractComponentCallbacksC0069Co8 != null) {
                        g(abstractComponentCallbacksC0069Co8).j();
                    }
                }
            } else {
                Iterator it7 = q73.a.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co9 = ((C1258ip) it7.next()).b;
                    if (abstractComponentCallbacksC0069Co9 != null) {
                        g(abstractComponentCallbacksC0069Co9).j();
                    }
                }
            }
        }
        O(this.u, true);
        Iterator it8 = f(arrayList, i6, i2).iterator();
        while (it8.hasNext()) {
            C0450Rg c0450Rg = (C0450Rg) it8.next();
            c0450Rg.d = booleanValue;
            synchronized (c0450Rg.b) {
                c0450Rg.g();
                ArrayList arrayList15 = c0450Rg.b;
                ListIterator listIterator = arrayList15.listIterator(arrayList15.size());
                if (listIterator.hasPrevious()) {
                    ((RS) listIterator.previous()).getClass();
                    throw null;
                }
                c0450Rg.e = false;
            }
            c0450Rg.c();
        }
        while (i6 < i2) {
            Q7 q74 = (Q7) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue() && q74.r >= 0) {
                q74.r = -1;
            }
            q74.getClass();
            i6++;
        }
        if (!z9 || arrayList12.size() <= 0) {
            return;
        }
        arrayList12.get(0).getClass();
        throw new ClassCastException();
    }

    public final AbstractComponentCallbacksC0069Co C(int i) {
        C1334k c1334k = this.c;
        ArrayList arrayList = (ArrayList) c1334k.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = (AbstractComponentCallbacksC0069Co) arrayList.get(size);
            if (abstractComponentCallbacksC0069Co != null && abstractComponentCallbacksC0069Co.D == i) {
                return abstractComponentCallbacksC0069Co;
            }
        }
        for (C0995ep c0995ep : ((HashMap) c1334k.i).values()) {
            if (c0995ep != null) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = c0995ep.c;
                if (abstractComponentCallbacksC0069Co2.D == i) {
                    return abstractComponentCallbacksC0069Co2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0450Rg c0450Rg = (C0450Rg) it.next();
            if (c0450Rg.e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0450Rg.e = false;
                c0450Rg.c();
            }
        }
    }

    public final ViewGroup F(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        ViewGroup viewGroup = abstractComponentCallbacksC0069Co.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0069Co.E <= 0 || !this.w.D()) {
            return null;
        }
        View C = this.w.C(abstractComponentCallbacksC0069Co.E);
        if (C instanceof ViewGroup) {
            return (ViewGroup) C;
        }
        return null;
    }

    public final C0432Qo G() {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.x;
        return abstractComponentCallbacksC0069Co != null ? abstractComponentCallbacksC0069Co.z.G() : this.z;
    }

    public final C0140Fh H() {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.x;
        return abstractComponentCallbacksC0069Co != null ? abstractComponentCallbacksC0069Co.z.H() : this.A;
    }

    public final void I(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0069Co);
        }
        if (abstractComponentCallbacksC0069Co.G) {
            return;
        }
        abstractComponentCallbacksC0069Co.G = true;
        abstractComponentCallbacksC0069Co.P = true ^ abstractComponentCallbacksC0069Co.P;
        a0(abstractComponentCallbacksC0069Co);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.x;
        if (abstractComponentCallbacksC0069Co == null) {
            return true;
        }
        return abstractComponentCallbacksC0069Co.A != null && abstractComponentCallbacksC0069Co.r && abstractComponentCallbacksC0069Co.e().L();
    }

    public final void O(int i, boolean z) {
        C0173Go c0173Go;
        if (this.v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.u) {
            this.u = i;
            C1334k c1334k = this.c;
            HashMap hashMap = (HashMap) c1334k.i;
            Iterator it = ((ArrayList) c1334k.j).iterator();
            while (it.hasNext()) {
                C0995ep c0995ep = (C0995ep) hashMap.get(((AbstractComponentCallbacksC0069Co) it.next()).l);
                if (c0995ep != null) {
                    c0995ep.j();
                }
            }
            for (C0995ep c0995ep2 : hashMap.values()) {
                if (c0995ep2 != null) {
                    c0995ep2.j();
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep2.c;
                    if (abstractComponentCallbacksC0069Co.s && !abstractComponentCallbacksC0069Co.i()) {
                        c1334k.D(c0995ep2);
                    }
                }
            }
            c0();
            if (this.F && (c0173Go = this.v) != null && this.u == 7) {
                c0173Go.v.invalidateMenu();
                this.F = false;
            }
        }
    }

    public final void P() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.g = false;
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.B.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.y;
        if (abstractComponentCallbacksC0069Co != null && abstractComponentCallbacksC0069Co.c().Q()) {
            return true;
        }
        boolean R = R(this.K, this.L, -1, 0);
        if (R) {
            this.b = true;
            try {
                T(this.K, this.L);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.c.i).values().removeAll(Collections.singleton(null));
        return R;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    Q7 q7 = (Q7) this.d.get(size);
                    if (i >= 0 && i == q7.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        Q7 q72 = (Q7) this.d.get(i3 - 1);
                        if (i < 0 || i != q72.r) {
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
            arrayList.add((Q7) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0069Co + " nesting=" + abstractComponentCallbacksC0069Co.y);
        }
        boolean i = abstractComponentCallbacksC0069Co.i();
        if (abstractComponentCallbacksC0069Co.H && i) {
            return;
        }
        C1334k c1334k = this.c;
        synchronized (((ArrayList) c1334k.j)) {
            ((ArrayList) c1334k.j).remove(abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.r = false;
        if (K(abstractComponentCallbacksC0069Co)) {
            this.F = true;
        }
        abstractComponentCallbacksC0069Co.s = true;
        a0(abstractComponentCallbacksC0069Co);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((Q7) arrayList.get(i)).f88o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((Q7) arrayList.get(i2)).f88o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void U(Bundle bundle) {
        C2002u5 c2002u5;
        int i;
        boolean z;
        int i2;
        C0995ep c0995ep;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.v.s.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.v.s.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        C1334k c1334k = this.c;
        HashMap hashMap2 = (HashMap) c1334k.k;
        HashMap hashMap3 = (HashMap) c1334k.i;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        C0640Yo c0640Yo = (C0640Yo) bundle.getParcelable("state");
        if (c0640Yo == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = c0640Yo.h.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c2002u5 = this.n;
            i = 2;
            if (!hasNext) {
                break;
            }
            Bundle H = c1334k.H((String) it.next(), null);
            if (H != null) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = (AbstractComponentCallbacksC0069Co) this.N.b.get(((C0929dp) H.getParcelable("state")).i);
                if (abstractComponentCallbacksC0069Co != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0069Co);
                    }
                    c0995ep = new C0995ep(c2002u5, c1334k, abstractComponentCallbacksC0069Co, H);
                } else {
                    c0995ep = new C0995ep(this.n, this.c, this.v.s.getClassLoader(), G(), H);
                }
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = c0995ep.c;
                abstractComponentCallbacksC0069Co2.i = H;
                abstractComponentCallbacksC0069Co2.z = this;
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0069Co2.l + "): " + abstractComponentCallbacksC0069Co2);
                }
                c0995ep.l(this.v.s.getClassLoader());
                c1334k.C(c0995ep);
                c0995ep.e = this.u;
            }
        }
        C0733ap c0733ap = this.N;
        c0733ap.getClass();
        Iterator it2 = new ArrayList(c0733ap.b.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = (AbstractComponentCallbacksC0069Co) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0069Co3.l) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0069Co3 + " that was not found in the set of active Fragments " + c0640Yo.h);
                }
                this.N.h(abstractComponentCallbacksC0069Co3);
                abstractComponentCallbacksC0069Co3.z = this;
                C0995ep c0995ep2 = new C0995ep(c2002u5, c1334k, abstractComponentCallbacksC0069Co3);
                c0995ep2.e = 1;
                c0995ep2.j();
                abstractComponentCallbacksC0069Co3.s = true;
                c0995ep2.j();
            }
        }
        ArrayList<String> arrayList = c0640Yo.i;
        ((ArrayList) c1334k.j).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0069Co g = c1334k.g(str3);
                if (g == null) {
                    throw new IllegalStateException(AbstractC1888sN.k("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + g);
                }
                c1334k.c(g);
            }
        }
        if (c0640Yo.j != null) {
            this.d = new ArrayList(c0640Yo.j.length);
            int i3 = 0;
            while (true) {
                R7[] r7Arr = c0640Yo.j;
                if (i3 >= r7Arr.length) {
                    break;
                }
                R7 r7 = r7Arr[i3];
                ArrayList arrayList2 = r7.i;
                Q7 q7 = new Q7(this);
                int[] iArr = r7.h;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C1258ip c1258ip = new C1258ip();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c1258ip.a = iArr[i4];
                    if (J(i7)) {
                        Log.v("FragmentManager", "Instantiate " + q7 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c1258ip.h = EnumC0080Cz.values()[r7.j[i5]];
                    c1258ip.i = EnumC0080Cz.values()[r7.k[i5]];
                    int i8 = i4 + 2;
                    c1258ip.c = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c1258ip.d = i9;
                    int i10 = iArr[i4 + 3];
                    c1258ip.e = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c1258ip.f = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c1258ip.g = i13;
                    q7.b = i9;
                    q7.c = i10;
                    q7.d = i12;
                    q7.e = i13;
                    q7.b(c1258ip);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                q7.f = r7.l;
                q7.h = r7.m;
                q7.g = true;
                q7.i = r7.f94o;
                q7.j = r7.p;
                q7.k = r7.q;
                q7.l = r7.r;
                q7.m = r7.s;
                q7.n = r7.t;
                q7.f88o = r7.u;
                q7.r = r7.n;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C1258ip) q7.a.get(i15)).b = c1334k.g(str4);
                    }
                }
                q7.c(1);
                if (J(i14)) {
                    StringBuilder i16 = AbstractC2188wx.i(i3, "restoreAllState: back stack #", " (index ");
                    i16.append(q7.r);
                    i16.append("): ");
                    i16.append(q7);
                    Log.v("FragmentManager", i16.toString());
                    PrintWriter printWriter = new PrintWriter(new C1087gB());
                    q7.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(q7);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.j.set(c0640Yo.k);
        String str5 = c0640Yo.l;
        if (str5 != null) {
            AbstractComponentCallbacksC0069Co g2 = c1334k.g(str5);
            this.y = g2;
            r(g2);
        }
        ArrayList arrayList3 = c0640Yo.m;
        if (arrayList3 != null) {
            for (int i17 = i2; i17 < arrayList3.size(); i17++) {
                this.k.put((String) arrayList3.get(i17), (S7) c0640Yo.n.get(i17));
            }
        }
        this.E = new ArrayDeque(c0640Yo.f134o);
    }

    public final Bundle V() {
        int i;
        ArrayList arrayList;
        R7[] r7Arr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        x();
        A(true);
        this.G = true;
        this.N.g = true;
        C1334k c1334k = this.c;
        c1334k.getClass();
        HashMap hashMap = (HashMap) c1334k.i;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0995ep c0995ep = (C0995ep) it.next();
            if (c0995ep != null) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
                String str = abstractComponentCallbacksC0069Co.l;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = c0995ep.c;
                if (abstractComponentCallbacksC0069Co2.h == -1 && (bundle = abstractComponentCallbacksC0069Co2.i) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C0929dp(abstractComponentCallbacksC0069Co2));
                if (abstractComponentCallbacksC0069Co2.h > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0069Co2.q(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c0995ep.a.L(abstractComponentCallbacksC0069Co2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0069Co2.V.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V = abstractComponentCallbacksC0069Co2.B.V();
                    if (!V.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0069Co2.j;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0069Co2.k;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0069Co2.m;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c1334k.H(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0069Co.l);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0069Co + ": " + abstractComponentCallbacksC0069Co.i);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.k;
        if (!hashMap2.isEmpty()) {
            C1334k c1334k2 = this.c;
            synchronized (((ArrayList) c1334k2.j)) {
                try {
                    if (((ArrayList) c1334k2.j).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c1334k2.j).size());
                        Iterator it2 = ((ArrayList) c1334k2.j).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = (AbstractComponentCallbacksC0069Co) it2.next();
                            arrayList.add(abstractComponentCallbacksC0069Co3.l);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0069Co3.l + "): " + abstractComponentCallbacksC0069Co3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                r7Arr = new R7[size];
                for (i = 0; i < size; i++) {
                    r7Arr[i] = new R7((Q7) this.d.get(i));
                    if (J(2)) {
                        StringBuilder i2 = AbstractC2188wx.i(i, "saveAllState: adding back stack #", ": ");
                        i2.append(this.d.get(i));
                        Log.v("FragmentManager", i2.toString());
                    }
                }
            } else {
                r7Arr = null;
            }
            C0640Yo c0640Yo = new C0640Yo();
            c0640Yo.l = null;
            ArrayList arrayList3 = new ArrayList();
            c0640Yo.m = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c0640Yo.n = arrayList4;
            c0640Yo.h = arrayList2;
            c0640Yo.i = arrayList;
            c0640Yo.j = r7Arr;
            c0640Yo.k = this.j.get();
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co4 = this.y;
            if (abstractComponentCallbacksC0069Co4 != null) {
                c0640Yo.l = abstractComponentCallbacksC0069Co4.l;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            c0640Yo.f134o = new ArrayList(this.E);
            bundle2.putParcelable("state", c0640Yo);
            for (String str2 : this.l.keySet()) {
                bundle2.putBundle(AbstractC1888sN.s("result_", str2), (Bundle) this.l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(AbstractC1888sN.s("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.t.removeCallbacks(this.O);
                    this.v.t.post(this.O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        ViewGroup F = F(abstractComponentCallbacksC0069Co);
        if (F == null || !(F instanceof C0251Jo)) {
            return;
        }
        ((C0251Jo) F).setDrawDisappearingViewsLast(!z);
    }

    public final void Y(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, EnumC0080Cz enumC0080Cz) {
        if (abstractComponentCallbacksC0069Co.equals(this.c.g(abstractComponentCallbacksC0069Co.l)) && (abstractComponentCallbacksC0069Co.A == null || abstractComponentCallbacksC0069Co.z == this)) {
            abstractComponentCallbacksC0069Co.S = enumC0080Cz;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0069Co + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (abstractComponentCallbacksC0069Co != null) {
            if (!abstractComponentCallbacksC0069Co.equals(this.c.g(abstractComponentCallbacksC0069Co.l)) || (abstractComponentCallbacksC0069Co.A != null && abstractComponentCallbacksC0069Co.z != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0069Co + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = this.y;
        this.y = abstractComponentCallbacksC0069Co;
        r(abstractComponentCallbacksC0069Co2);
        r(this.y);
    }

    public final C0995ep a(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        String str = abstractComponentCallbacksC0069Co.R;
        if (str != null) {
            AbstractC1193hp.c(abstractComponentCallbacksC0069Co, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0069Co);
        }
        C0995ep g = g(abstractComponentCallbacksC0069Co);
        abstractComponentCallbacksC0069Co.z = this;
        C1334k c1334k = this.c;
        c1334k.C(g);
        if (!abstractComponentCallbacksC0069Co.H) {
            c1334k.c(abstractComponentCallbacksC0069Co);
            abstractComponentCallbacksC0069Co.s = false;
            abstractComponentCallbacksC0069Co.P = false;
            if (K(abstractComponentCallbacksC0069Co)) {
                this.F = true;
            }
        }
        return g;
    }

    public final void a0(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        ViewGroup F = F(abstractComponentCallbacksC0069Co);
        if (F != null) {
            C0043Bo c0043Bo = abstractComponentCallbacksC0069Co.O;
            if ((c0043Bo == null ? 0 : c0043Bo.e) + (c0043Bo == null ? 0 : c0043Bo.d) + (c0043Bo == null ? 0 : c0043Bo.c) + (c0043Bo == null ? 0 : c0043Bo.b) > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0069Co);
                }
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = (AbstractComponentCallbacksC0069Co) F.getTag(R.id.visible_removing_fragment_view_tag);
                C0043Bo c0043Bo2 = abstractComponentCallbacksC0069Co.O;
                boolean z = c0043Bo2 != null ? c0043Bo2.a : false;
                if (abstractComponentCallbacksC0069Co2.O == null) {
                    return;
                }
                abstractComponentCallbacksC0069Co2.b().a = z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0173Go c0173Go, AbstractC1305jX abstractC1305jX, AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = c0173Go;
        this.w = abstractC1305jX;
        this.x = abstractComponentCallbacksC0069Co;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f126o;
        if (abstractComponentCallbacksC0069Co != 0) {
            copyOnWriteArrayList.add(new C0458Ro(abstractComponentCallbacksC0069Co));
        } else if (c0173Go != null) {
            copyOnWriteArrayList.add(c0173Go);
        }
        if (this.x != null) {
            e0();
        }
        if (c0173Go != null) {
            YF onBackPressedDispatcher = c0173Go.v.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            C0173Go c0173Go2 = abstractComponentCallbacksC0069Co != 0 ? abstractComponentCallbacksC0069Co : c0173Go;
            onBackPressedDispatcher.getClass();
            C0380Oo c0380Oo = this.i;
            AbstractC0048Bt.n(c0380Oo, "onBackPressedCallback");
            AbstractC0106Dz lifecycle = c0173Go2.getLifecycle();
            if (((C0417Pz) lifecycle).d != EnumC0080Cz.h) {
                c0380Oo.b.add(new WF(onBackPressedDispatcher, lifecycle, c0380Oo));
                onBackPressedDispatcher.d();
                c0380Oo.c = new J2(0, onBackPressedDispatcher, YF.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5);
            }
        }
        if (abstractComponentCallbacksC0069Co != 0) {
            C0733ap c0733ap = abstractComponentCallbacksC0069Co.z.N;
            HashMap hashMap = c0733ap.c;
            C0733ap c0733ap2 = (C0733ap) hashMap.get(abstractComponentCallbacksC0069Co.l);
            if (c0733ap2 == null) {
                c0733ap2 = new C0733ap(c0733ap.e);
                hashMap.put(abstractComponentCallbacksC0069Co.l, c0733ap2);
            }
            this.N = c0733ap2;
        } else if (c0173Go != null) {
            C0680a00 viewModelStore = c0173Go.v.getViewModelStore();
            AbstractC0048Bt.n(viewModelStore, "store");
            C0630Ye c0630Ye = C0630Ye.b;
            AbstractC0048Bt.n(c0630Ye, "defaultCreationExtras");
            ZZ zz = new ZZ(viewModelStore, C0733ap.h, c0630Ye);
            InterfaceC0517Tv G = AbstractC1473m3.G(C0733ap.class);
            String a = G.a();
            if (a == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.N = (C0733ap) zz.a(G, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a));
        } else {
            this.N = new C0733ap(false);
        }
        C0733ap c0733ap3 = this.N;
        c0733ap3.g = this.G || this.H;
        this.c.l = c0733ap3;
        C0173Go c0173Go3 = this.v;
        if (c0173Go3 != null && abstractComponentCallbacksC0069Co == 0) {
            KP savedStateRegistry = c0173Go3.v.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0095Do(3, (C0614Xo) this));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                U(a2);
            }
        }
        C0173Go c0173Go4 = this.v;
        if (c0173Go4 != null) {
            W1 activityResultRegistry = c0173Go4.v.getActivityResultRegistry();
            String s = AbstractC1888sN.s("FragmentManager:", abstractComponentCallbacksC0069Co != 0 ? AbstractC1888sN.l(new StringBuilder(), abstractComponentCallbacksC0069Co.l, ":") : "");
            C0614Xo c0614Xo = (C0614Xo) this;
            this.B = activityResultRegistry.c(AbstractC1888sN.j(s, "StartActivityForResult"), new O1(1), new C0354No(c0614Xo, 1));
            this.C = activityResultRegistry.c(AbstractC1888sN.j(s, "StartIntentSenderForResult"), new O1(2), new C0354No(c0614Xo, 2));
            this.D = activityResultRegistry.c(AbstractC1888sN.j(s, "RequestPermissions"), new O1(0), new C0354No(c0614Xo, 0));
        }
        C0173Go c0173Go5 = this.v;
        if (c0173Go5 != null) {
            c0173Go5.addOnConfigurationChangedListener(this.p);
        }
        C0173Go c0173Go6 = this.v;
        if (c0173Go6 != null) {
            c0173Go6.v.addOnTrimMemoryListener(this.q);
        }
        C0173Go c0173Go7 = this.v;
        if (c0173Go7 != null) {
            c0173Go7.v.addOnMultiWindowModeChangedListener(this.r);
        }
        C0173Go c0173Go8 = this.v;
        if (c0173Go8 != null) {
            c0173Go8.v.addOnPictureInPictureModeChangedListener(this.s);
        }
        C0173Go c0173Go9 = this.v;
        if (c0173Go9 == null || abstractComponentCallbacksC0069Co != 0) {
            return;
        }
        c0173Go9.v.addMenuProvider(this.t);
    }

    public final void c(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0069Co);
        }
        if (abstractComponentCallbacksC0069Co.H) {
            abstractComponentCallbacksC0069Co.H = false;
            if (abstractComponentCallbacksC0069Co.r) {
                return;
            }
            this.c.c(abstractComponentCallbacksC0069Co);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0069Co);
            }
            if (K(abstractComponentCallbacksC0069Co)) {
                this.F = true;
            }
        }
    }

    public final void c0() {
        Iterator it = this.c.t().iterator();
        while (it.hasNext()) {
            C0995ep c0995ep = (C0995ep) it.next();
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
            if (abstractComponentCallbacksC0069Co.M) {
                if (this.b) {
                    this.J = true;
                } else {
                    abstractComponentCallbacksC0069Co.M = false;
                    c0995ep.j();
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1087gB());
        C0173Go c0173Go = this.v;
        if (c0173Go == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c0173Go.v.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0450Rg c0450Rg;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.t().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0995ep) it.next()).c.L;
            if (viewGroup != null) {
                AbstractC0048Bt.n(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0450Rg) {
                    c0450Rg = (C0450Rg) tag;
                } else {
                    c0450Rg = new C0450Rg(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0450Rg);
                }
                hashSet.add(c0450Rg);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o.Tp, o.lp] */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.Tp, o.lp] */
    public final void e0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    C0380Oo c0380Oo = this.i;
                    c0380Oo.a = true;
                    ?? r2 = c0380Oo.c;
                    if (r2 != 0) {
                        r2.invoke();
                    }
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && N(this.x);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                C0380Oo c0380Oo2 = this.i;
                c0380Oo2.a = z;
                ?? r0 = c0380Oo2.c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((Q7) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = ((C1258ip) it.next()).b;
                if (abstractComponentCallbacksC0069Co != null && (viewGroup = abstractComponentCallbacksC0069Co.L) != null) {
                    hashSet.add(C0450Rg.e(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final C0995ep g(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        String str = abstractComponentCallbacksC0069Co.l;
        C1334k c1334k = this.c;
        C0995ep c0995ep = (C0995ep) ((HashMap) c1334k.i).get(str);
        if (c0995ep != null) {
            return c0995ep;
        }
        C0995ep c0995ep2 = new C0995ep(this.n, c1334k, abstractComponentCallbacksC0069Co);
        c0995ep2.l(this.v.s.getClassLoader());
        c0995ep2.e = this.u;
        return c0995ep2;
    }

    public final void h(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0069Co);
        }
        if (abstractComponentCallbacksC0069Co.H) {
            return;
        }
        abstractComponentCallbacksC0069Co.H = true;
        if (abstractComponentCallbacksC0069Co.r) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0069Co);
            }
            C1334k c1334k = this.c;
            synchronized (((ArrayList) c1334k.j)) {
                ((ArrayList) c1334k.j).remove(abstractComponentCallbacksC0069Co);
            }
            abstractComponentCallbacksC0069Co.r = false;
            if (K(abstractComponentCallbacksC0069Co)) {
                this.F = true;
            }
            a0(abstractComponentCallbacksC0069Co);
        }
    }

    public final void i(boolean z) {
        if (z && this.v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.K = true;
                if (z) {
                    abstractComponentCallbacksC0069Co.B.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.u >= 1) {
            for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
                if (abstractComponentCallbacksC0069Co != null) {
                    if (!abstractComponentCallbacksC0069Co.G ? abstractComponentCallbacksC0069Co.B.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null && M(abstractComponentCallbacksC0069Co)) {
                if (!abstractComponentCallbacksC0069Co.G ? abstractComponentCallbacksC0069Co.B.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0069Co);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = (AbstractComponentCallbacksC0069Co) this.e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0069Co2)) {
                    abstractComponentCallbacksC0069Co2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean z = true;
        this.I = true;
        A(true);
        x();
        C0173Go c0173Go = this.v;
        C1334k c1334k = this.c;
        if (c0173Go != null) {
            z = ((C0733ap) c1334k.l).f;
        } else {
            J4 j4 = c0173Go.s;
            if (j4 != null) {
                z = true ^ j4.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((S7) it.next()).h.iterator();
                while (it2.hasNext()) {
                    ((C0733ap) c1334k.l).e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0173Go c0173Go2 = this.v;
        if (c0173Go2 != null) {
            c0173Go2.v.removeOnTrimMemoryListener(this.q);
        }
        C0173Go c0173Go3 = this.v;
        if (c0173Go3 != null) {
            c0173Go3.removeOnConfigurationChangedListener(this.p);
        }
        C0173Go c0173Go4 = this.v;
        if (c0173Go4 != null) {
            c0173Go4.v.removeOnMultiWindowModeChangedListener(this.r);
        }
        C0173Go c0173Go5 = this.v;
        if (c0173Go5 != null) {
            c0173Go5.v.removeOnPictureInPictureModeChangedListener(this.s);
        }
        C0173Go c0173Go6 = this.v;
        if (c0173Go6 != null && this.x == null) {
            c0173Go6.v.removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            Iterator it3 = this.i.b.iterator();
            while (it3.hasNext()) {
                ((Z9) it3.next()).cancel();
            }
            this.g = null;
        }
        V1 v1 = this.B;
        if (v1 != null) {
            v1.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void m(boolean z) {
        if (z && this.v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.K = true;
                if (z) {
                    abstractComponentCallbacksC0069Co.B.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null && z) {
                abstractComponentCallbacksC0069Co.B.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.c.w().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = (AbstractComponentCallbacksC0069Co) it.next();
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.h();
                abstractComponentCallbacksC0069Co.B.o();
            }
        }
    }

    public final boolean p() {
        if (this.u >= 1) {
            for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
                if (abstractComponentCallbacksC0069Co != null) {
                    if (!abstractComponentCallbacksC0069Co.G ? abstractComponentCallbacksC0069Co.B.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null && !abstractComponentCallbacksC0069Co.G) {
                abstractComponentCallbacksC0069Co.B.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (abstractComponentCallbacksC0069Co != null) {
            if (abstractComponentCallbacksC0069Co.equals(this.c.g(abstractComponentCallbacksC0069Co.l))) {
                abstractComponentCallbacksC0069Co.z.getClass();
                boolean N = N(abstractComponentCallbacksC0069Co);
                Boolean bool = abstractComponentCallbacksC0069Co.q;
                if (bool == null || bool.booleanValue() != N) {
                    abstractComponentCallbacksC0069Co.q = Boolean.valueOf(N);
                    C0614Xo c0614Xo = abstractComponentCallbacksC0069Co.B;
                    c0614Xo.e0();
                    c0614Xo.r(c0614Xo.y);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.v != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null && z) {
                abstractComponentCallbacksC0069Co.B.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.u < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : this.c.y()) {
            if (abstractComponentCallbacksC0069Co != null && M(abstractComponentCallbacksC0069Co)) {
                if (!abstractComponentCallbacksC0069Co.G ? abstractComponentCallbacksC0069Co.B.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = this.x;
        if (abstractComponentCallbacksC0069Co != null) {
            sb.append(abstractComponentCallbacksC0069Co.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            C0173Go c0173Go = this.v;
            if (c0173Go != null) {
                sb.append(c0173Go.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (C0995ep c0995ep : ((HashMap) this.c.i).values()) {
                if (c0995ep != null) {
                    c0995ep.e = i;
                }
            }
            O(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0450Rg) it.next()).d();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.J) {
            this.J = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String j = AbstractC1888sN.j(str, "    ");
        C1334k c1334k = this.c;
        ArrayList arrayList = (ArrayList) c1334k.j;
        String j2 = AbstractC1888sN.j(str, "    ");
        HashMap hashMap = (HashMap) c1334k.i;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0995ep c0995ep : hashMap.values()) {
                printWriter.print(str);
                if (c0995ep != null) {
                    AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
                    printWriter.println(abstractComponentCallbacksC0069Co);
                    abstractComponentCallbacksC0069Co.getClass();
                    printWriter.print(j2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0069Co.D));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0069Co.E));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0069Co.F);
                    printWriter.print(j2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0069Co.h);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0069Co.l);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0069Co.y);
                    printWriter.print(j2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0069Co.r);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0069Co.s);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0069Co.u);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0069Co.v);
                    printWriter.print(j2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0069Co.G);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0069Co.H);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0069Co.J);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(j2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0069Co.I);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0069Co.N);
                    if (abstractComponentCallbacksC0069Co.z != null) {
                        printWriter.print(j2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0069Co.z);
                    }
                    if (abstractComponentCallbacksC0069Co.A != null) {
                        printWriter.print(j2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0069Co.A);
                    }
                    if (abstractComponentCallbacksC0069Co.C != null) {
                        printWriter.print(j2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0069Co.C);
                    }
                    if (abstractComponentCallbacksC0069Co.m != null) {
                        printWriter.print(j2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0069Co.m);
                    }
                    if (abstractComponentCallbacksC0069Co.i != null) {
                        printWriter.print(j2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0069Co.i);
                    }
                    if (abstractComponentCallbacksC0069Co.j != null) {
                        printWriter.print(j2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0069Co.j);
                    }
                    if (abstractComponentCallbacksC0069Co.k != null) {
                        printWriter.print(j2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0069Co.k);
                    }
                    Object obj = abstractComponentCallbacksC0069Co.n;
                    if (obj == null) {
                        AbstractC0588Wo abstractC0588Wo = abstractComponentCallbacksC0069Co.z;
                        obj = (abstractC0588Wo == null || (str2 = abstractComponentCallbacksC0069Co.f25o) == null) ? null : abstractC0588Wo.c.g(str2);
                    }
                    if (obj != null) {
                        printWriter.print(j2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0069Co.p);
                    }
                    printWriter.print(j2);
                    printWriter.print("mPopDirection=");
                    C0043Bo c0043Bo = abstractComponentCallbacksC0069Co.O;
                    printWriter.println(c0043Bo == null ? false : c0043Bo.a);
                    C0043Bo c0043Bo2 = abstractComponentCallbacksC0069Co.O;
                    if ((c0043Bo2 == null ? 0 : c0043Bo2.b) != 0) {
                        printWriter.print(j2);
                        printWriter.print("getEnterAnim=");
                        C0043Bo c0043Bo3 = abstractComponentCallbacksC0069Co.O;
                        printWriter.println(c0043Bo3 == null ? 0 : c0043Bo3.b);
                    }
                    C0043Bo c0043Bo4 = abstractComponentCallbacksC0069Co.O;
                    if ((c0043Bo4 == null ? 0 : c0043Bo4.c) != 0) {
                        printWriter.print(j2);
                        printWriter.print("getExitAnim=");
                        C0043Bo c0043Bo5 = abstractComponentCallbacksC0069Co.O;
                        printWriter.println(c0043Bo5 == null ? 0 : c0043Bo5.c);
                    }
                    C0043Bo c0043Bo6 = abstractComponentCallbacksC0069Co.O;
                    if ((c0043Bo6 == null ? 0 : c0043Bo6.d) != 0) {
                        printWriter.print(j2);
                        printWriter.print("getPopEnterAnim=");
                        C0043Bo c0043Bo7 = abstractComponentCallbacksC0069Co.O;
                        printWriter.println(c0043Bo7 == null ? 0 : c0043Bo7.d);
                    }
                    C0043Bo c0043Bo8 = abstractComponentCallbacksC0069Co.O;
                    if ((c0043Bo8 == null ? 0 : c0043Bo8.e) != 0) {
                        printWriter.print(j2);
                        printWriter.print("getPopExitAnim=");
                        C0043Bo c0043Bo9 = abstractComponentCallbacksC0069Co.O;
                        printWriter.println(c0043Bo9 != null ? c0043Bo9.e : 0);
                    }
                    if (abstractComponentCallbacksC0069Co.L != null) {
                        printWriter.print(j2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0069Co.L);
                    }
                    C0173Go c0173Go = abstractComponentCallbacksC0069Co.A;
                    if ((c0173Go != null ? c0173Go.s : null) != null) {
                        AA.a(abstractComponentCallbacksC0069Co).b(j2, printWriter);
                    }
                    printWriter.print(j2);
                    printWriter.println("Child " + abstractComponentCallbacksC0069Co.B + ":");
                    abstractComponentCallbacksC0069Co.B.w(AbstractC1888sN.j(j2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = (AbstractComponentCallbacksC0069Co) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0069Co2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = (AbstractComponentCallbacksC0069Co) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0069Co3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                Q7 q7 = (Q7) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(q7.toString());
                q7.f(j, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (InterfaceC0510To) this.a.get(i4);
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
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0450Rg) it.next()).d();
        }
    }

    public final void y(InterfaceC0510To interfaceC0510To, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.G || this.H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(interfaceC0510To);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.t.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.G || this.H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }
}
