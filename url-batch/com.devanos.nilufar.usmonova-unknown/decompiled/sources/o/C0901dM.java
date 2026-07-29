package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.dM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901dM extends AbstractC1838rd {
    public static final ET v = AbstractC1305jX.d(WH.k);
    public static final AtomicReference w = new AtomicReference(Boolean.FALSE);
    public final D8 a;
    public final Object b;
    public InterfaceC0075Cu c;
    public Throwable d;
    public final ArrayList e;
    public Object f;
    public QD g;
    public final YD h;
    public final ArrayList i;
    public final ArrayList j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public ArrayList m;
    public LinkedHashSet n;

    /* renamed from: o, reason: collision with root package name */
    public C0849ca f157o;
    public C1818rJ p;
    public boolean q;
    public final ET r;
    public final C0127Eu s;
    public final InterfaceC0189He t;
    public final C0218Ih u;

    public C0901dM(InterfaceC0189He interfaceC0189He) {
        D8 d8 = new D8(new LE(5, this));
        this.a = d8;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new QD();
        this.h = new YD(new C2036ud[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.r = AbstractC1305jX.d(XL.j);
        C0127Eu c0127Eu = new C0127Eu((InterfaceC0075Cu) interfaceC0189He.k(C0460Rq.K));
        c0127Eu.B(new C2084vL(1, this));
        this.s = c0127Eu;
        this.t = interfaceC0189He.D(d8).D(c0127Eu);
        this.u = new C0218Ih(20);
    }

    public static final C2036ud a(C0901dM c0901dM, C2036ud c2036ud, QD qd) {
        LinkedHashSet linkedHashSet;
        SD B;
        if (!c2036ud.x.C && !c2036ud.y && ((linkedHashSet = c0901dM.n) == null || !linkedHashSet.contains(c2036ud))) {
            C2084vL c2084vL = new C2084vL(2, c2036ud);
            C0810c0 c0810c0 = new C0810c0(c2036ud, 15, qd);
            AbstractC1696pS k = AbstractC2025uS.k();
            SD sd = k instanceof SD ? (SD) k : null;
            if (sd == null || (B = sd.B(c2084vL, c0810c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1696pS j = B.j();
                if (qd != null) {
                    try {
                        if (qd.h()) {
                            K2 k2 = new K2(qd, 20, c2036ud);
                            C1575nd c1575nd = c2036ud.x;
                            if (c1575nd.C) {
                                EB.h("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            c1575nd.C = true;
                            try {
                                k2.invoke();
                                c1575nd.C = false;
                            } catch (Throwable th) {
                                c1575nd.C = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC1696pS.p(j);
                        throw th2;
                    }
                }
                boolean q = c2036ud.q();
                AbstractC1696pS.p(j);
                if (q) {
                    return c2036ud;
                }
            } finally {
                c(B);
            }
        }
        return null;
    }

    public static final boolean b(C0901dM c0901dM) {
        List h;
        synchronized (c0901dM.b) {
            boolean z = true;
            if (c0901dM.g.g()) {
                if (!c0901dM.h.l() && !c0901dM.f()) {
                    z = false;
                }
                return z;
            }
            YP yp = new YP(c0901dM.g);
            c0901dM.g = new QD();
            synchronized (c0901dM.b) {
                h = c0901dM.h();
            }
            try {
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    ((C2036ud) h.get(i)).r(yp);
                    if (((XL) c0901dM.r.getValue()).compareTo(XL.i) <= 0) {
                        break;
                    }
                }
                synchronized (c0901dM.b) {
                    c0901dM.g = new QD();
                }
                synchronized (c0901dM.b) {
                    if (c0901dM.e() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!c0901dM.h.l() && !c0901dM.f()) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (c0901dM.b) {
                    QD qd = c0901dM.g;
                    qd.getClass();
                    for (Object obj : yp) {
                        qd.b[qd.d(obj)] = obj;
                    }
                    throw th;
                }
            }
        }
    }

    public static void c(SD sd) {
        try {
            if (sd.v() instanceof C1762qS) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            sd.c();
        }
    }

    public static final void i(ArrayList arrayList, C0901dM c0901dM, C2036ud c2036ud) {
        arrayList.clear();
        synchronized (c0901dM.b) {
            Iterator it = c0901dM.j.iterator();
            if (it.hasNext()) {
                ((AbstractC1549nD) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void d() {
        synchronized (this.b) {
            if (((XL) this.r.getValue()).compareTo(XL.l) >= 0) {
                ET et = this.r;
                XL xl = XL.i;
                et.getClass();
                et.f(null, xl);
            }
        }
        this.s.c(null);
    }

    public final InterfaceC0718aa e() {
        ET et = this.r;
        int compareTo = ((XL) et.getValue()).compareTo(XL.i);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        YD yd = this.h;
        if (compareTo <= 0) {
            this.e.clear();
            this.f = C1318jk.h;
            this.g = new QD();
            yd.h();
            arrayList2.clear();
            arrayList.clear();
            this.m = null;
            C0849ca c0849ca = this.f157o;
            if (c0849ca != null) {
                c0849ca.m(null);
            }
            this.f157o = null;
            this.p = null;
            return null;
        }
        C1818rJ c1818rJ = this.p;
        XL xl = XL.m;
        XL xl2 = XL.j;
        if (c1818rJ == null) {
            if (this.c == null) {
                this.g = new QD();
                yd.h();
                if (f()) {
                    xl2 = XL.k;
                }
            } else {
                xl2 = (yd.l() || this.g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || f()) ? xl : XL.l;
            }
        }
        et.getClass();
        et.f(null, xl2);
        if (xl2 != xl) {
            return null;
        }
        C0849ca c0849ca2 = this.f157o;
        this.f157o = null;
        return c0849ca2;
    }

    public final boolean f() {
        return (this.q || this.a.m.get() == 0) ? false : true;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            if (!this.g.h() && !this.h.l()) {
                z = f();
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List h() {
        Object obj = this.f;
        ?? r0 = obj;
        if (obj == null) {
            ArrayList arrayList = this.e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? C1318jk.h : new ArrayList(arrayList);
            this.f = arrayList2;
            r0 = arrayList2;
        }
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r4 >= r3) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (((o.C1619oH) r10.get(r4)).i == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        if (r8 >= r4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r11 = (o.C1619oH) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        if (r11.i != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        r11 = (o.AbstractC1549nD) r11.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r4 = r17.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:
    
        o.AbstractC1048fc.f0(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        if (r8 >= r4) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        if (((o.C1619oH) r11).i == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0155, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0158, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j(List list, QD qd) {
        SD B;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            ((AbstractC1549nD) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C2036ud c2036ud = (C2036ud) entry.getKey();
            List list2 = (List) entry.getValue();
            EB.T(!c2036ud.x.C);
            C2084vL c2084vL = new C2084vL(2, c2036ud);
            C0810c0 c0810c0 = new C0810c0(c2036ud, 15, qd);
            AbstractC1696pS k = AbstractC2025uS.k();
            Object obj4 = null;
            SD sd = k instanceof SD ? (SD) k : null;
            if (sd == null || (B = sd.B(c2084vL, c0810c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1696pS j = B.j();
                try {
                    synchronized (this.b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i3 = i;
                        while (i3 < size2) {
                            AbstractC1549nD abstractC1549nD = (AbstractC1549nD) list2.get(i3);
                            LinkedHashMap linkedHashMap = this.k;
                            abstractC1549nD.getClass();
                            List list3 = (List) linkedHashMap.get(obj4);
                            if (list3 == null) {
                                obj4 = null;
                                obj = null;
                            } else {
                                if (list3.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                Object remove = list3.remove(i);
                                if (list3.isEmpty()) {
                                    obj4 = null;
                                    linkedHashMap.remove(null);
                                } else {
                                    obj4 = null;
                                }
                                obj = remove;
                            }
                            arrayList.add(new C1619oH(abstractC1549nD, obj));
                            i3++;
                            i = 0;
                        }
                    }
                    int size3 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size3) {
                            break;
                        }
                        if (((C1619oH) arrayList.get(i4)).i != null) {
                            break;
                        }
                        i4++;
                    }
                    c2036ud.l(arrayList);
                    AbstractC1696pS.p(j);
                    c(B);
                    i = 0;
                } catch (Throwable th) {
                    AbstractC1696pS.p(j);
                    throw th;
                }
            } catch (Throwable th2) {
                c(B);
                throw th2;
            }
        }
        return AbstractC0720ac.J0(hashMap.keySet());
    }

    public final void k(Exception exc, C2036ud c2036ud) {
        int i = 3;
        if (!((Boolean) w.get()).booleanValue() || (exc instanceof C1049fd)) {
            synchronized (this.b) {
                C1818rJ c1818rJ = this.p;
                if (c1818rJ != null) {
                    throw ((Exception) c1818rJ.i);
                }
                this.p = new C1818rJ(i, exc);
            }
            throw exc;
        }
        synchronized (this.b) {
            try {
                int i2 = X1.b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.i.clear();
                this.h.h();
                this.g = new QD();
                this.j.clear();
                this.k.clear();
                this.l.clear();
                this.p = new C1818rJ(i, exc);
                if (c2036ud != null) {
                    l(c2036ud);
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(C2036ud c2036ud) {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.m = arrayList;
        }
        if (!arrayList.contains(c2036ud)) {
            arrayList.add(c2036ud);
        }
        this.e.remove(c2036ud);
        this.f = null;
    }
}
