package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: o.Yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636Yk {
    public final QL a;
    public final C0683a2 b;
    public final NL c;
    public EI d;
    public L4 e;
    public int f;
    public int g;
    public int h;
    public RO i;

    public C0636Yk(QL ql, C0683a2 c0683a2, NL nl) {
        AbstractC0048Bt.n(ql, "connectionPool");
        this.a = ql;
        this.b = c0683a2;
        this.c = nl;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PL a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        C1818rJ c1818rJ;
        boolean z3;
        Socket h;
        while (!this.c.u) {
            PL pl = this.c.f72o;
            if (pl != null) {
                synchronized (pl) {
                    try {
                        if (!pl.j && b(pl.b.a.h)) {
                            h = null;
                        }
                        h = this.c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.f72o != null) {
                    if (h != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z3 = z2;
                    if (pl.i(z3)) {
                        return pl;
                    }
                    pl.k();
                    if (this.i == null) {
                        EI ei = this.d;
                        if (ei != null ? ei.a() : true) {
                            continue;
                        } else {
                            L4 l4 = this.e;
                            if (!(l4 != null ? l4.d() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else if (h != null) {
                    HY.d(h);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                pl = this.c.f72o;
                AbstractC0048Bt.k(pl);
            } else {
                RO ro = this.i;
                try {
                    if (ro != null) {
                        this.i = null;
                    } else {
                        EI ei2 = this.d;
                        if (ei2 == null || !ei2.a()) {
                            L4 l42 = this.e;
                            if (l42 == null) {
                                C0683a2 c0683a2 = this.b;
                                NL nl = this.c;
                                l42 = new L4(c0683a2, nl.h.F, nl);
                                this.e = l42;
                            }
                            if (!l42.d()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (l42.a < ((List) l42.d).size()) {
                                C0683a2 c0683a22 = (C0683a2) l42.b;
                                if (l42.a >= ((List) l42.d).size()) {
                                    throw new SocketException("No route to " + c0683a22.h.d + "; exhausted proxy configurations: " + ((List) l42.d));
                                }
                                List list2 = (List) l42.d;
                                int i5 = l42.a;
                                l42.a = i5 + 1;
                                Proxy proxy = (Proxy) list2.get(i5);
                                ArrayList arrayList2 = new ArrayList();
                                l42.e = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    C0932ds c0932ds = c0683a22.h;
                                    str = c0932ds.d;
                                    i4 = c0932ds.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    AbstractC0048Bt.m(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    AbstractC0048Bt.n(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        AbstractC0048Bt.m(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        AbstractC0048Bt.m(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = HY.a;
                                    AbstractC0048Bt.n(str, "<this>");
                                    C0705aN c0705aN = HY.f;
                                    c0705aN.getClass();
                                    if (c0705aN.h.matcher(str).matches()) {
                                        list = AbstractC0868ct.J(InetAddress.getByName(str));
                                    } else {
                                        c0683a22.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            AbstractC0048Bt.m(allByName, "getAllByName(hostname)");
                                            List t0 = P6.t0(allByName);
                                            if (t0.isEmpty()) {
                                                throw new UnknownHostException(c0683a22.a + " returned no addresses for " + str);
                                            }
                                            list = t0;
                                        } catch (NullPointerException e) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = l42.e.iterator();
                                while (it2.hasNext()) {
                                    RO ro2 = new RO((C0683a2) l42.b, proxy, (InetSocketAddress) it2.next());
                                    C1818rJ c1818rJ2 = (C1818rJ) l42.c;
                                    synchronized (c1818rJ2) {
                                        contains = ((LinkedHashSet) c1818rJ2.i).contains(ro2);
                                    }
                                    if (contains) {
                                        ((ArrayList) l42.f).add(ro2);
                                    } else {
                                        arrayList.add(ro2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                AbstractC1048fc.f0(arrayList, (ArrayList) l42.f);
                                ((ArrayList) l42.f).clear();
                            }
                            EI ei3 = new EI(arrayList);
                            this.d = ei3;
                            if (this.c.u) {
                                throw new IOException("Canceled");
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                pl = this.c.f72o;
                                AbstractC0048Bt.k(pl);
                            } else {
                                if (!ei3.a()) {
                                    throw new NoSuchElementException();
                                }
                                int i6 = ei3.b;
                                ei3.b = i6 + 1;
                                ro = (RO) arrayList.get(i6);
                                PL pl2 = new PL(this.a, ro);
                                this.c.w = pl2;
                                pl2.c(i, i2, i3, z, this.c);
                                this.c.w = null;
                                c1818rJ = this.c.h.F;
                                synchronized (c1818rJ) {
                                    ((LinkedHashSet) c1818rJ.i).remove(ro);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    pl = this.c.f72o;
                                    AbstractC0048Bt.k(pl);
                                    this.i = ro;
                                    Socket socket = pl2.d;
                                    AbstractC0048Bt.k(socket);
                                    HY.d(socket);
                                } else {
                                    synchronized (pl2) {
                                        QL ql = this.a;
                                        ql.getClass();
                                        byte[] bArr2 = HY.a;
                                        ((ConcurrentLinkedQueue) ql.d).add(pl2);
                                        ((QU) ql.b).c((C0409Pr) ql.c, 0L);
                                        this.c.b(pl2);
                                    }
                                    z3 = z2;
                                    pl = pl2;
                                    if (pl.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            EI ei4 = this.d;
                            AbstractC0048Bt.k(ei4);
                            if (!ei4.a()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList3 = ei4.a;
                            int i7 = ei4.b;
                            ei4.b = i7 + 1;
                            ro = (RO) arrayList3.get(i7);
                        }
                    }
                    pl2.c(i, i2, i3, z, this.c);
                    this.c.w = null;
                    c1818rJ = this.c.h.F;
                    synchronized (c1818rJ) {
                    }
                } catch (Throwable th2) {
                    this.c.w = null;
                    throw th2;
                }
                arrayList = null;
                PL pl22 = new PL(this.a, ro);
                this.c.w = pl22;
            }
            z3 = z2;
            if (pl.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(C0932ds c0932ds) {
        AbstractC0048Bt.n(c0932ds, "url");
        C0932ds c0932ds2 = this.b.h;
        return c0932ds.e == c0932ds2.e && AbstractC0048Bt.h(c0932ds.d, c0932ds2.d);
    }

    public final void c(IOException iOException) {
        AbstractC0048Bt.n(iOException, "e");
        this.i = null;
        if ((iOException instanceof QT) && ((QT) iOException).h == 8) {
            this.f++;
        } else if (iOException instanceof C0188Hd) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
