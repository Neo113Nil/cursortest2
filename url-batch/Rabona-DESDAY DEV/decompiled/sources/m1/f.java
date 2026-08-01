package m1;

import Q0.q;
import i1.w;
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
import java.util.regex.Pattern;
import l.C0249n;
import p1.B;
import p1.C0285a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3220a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.a f3221b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3222c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3223e;

    /* renamed from: f, reason: collision with root package name */
    public int f3224f;

    /* renamed from: g, reason: collision with root package name */
    public int f3225g;
    public int h;
    public w i;

    public f(n nVar, i1.a aVar, j jVar) {
        X0.d.e(nVar, "connectionPool");
        X0.d.e(jVar, "call");
        this.f3220a = nVar;
        this.f3221b = aVar;
        this.f3222c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x036a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(int i, int i2, int i3, boolean z2, boolean z3) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        C0249n c0249n;
        Socket i5;
        while (!this.f3222c.f3240m) {
            m mVar = this.f3222c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3251j && b(mVar.f3246b.f2538a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3222c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3222c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        H.j jVar = this.d;
                        if (jVar != null ? jVar.d() : true) {
                            continue;
                        } else {
                            p pVar = this.f3223e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        j1.b.c(i5);
                    }
                    X0.d.e(this.f3222c, "call");
                }
            }
            this.f3224f = 0;
            this.f3225g = 0;
            this.h = 0;
            if (this.f3220a.a(this.f3221b, this.f3222c, null, false)) {
                mVar = this.f3222c.h;
                X0.d.b(mVar);
                X0.d.e(this.f3222c, "call");
            } else {
                w wVar = this.i;
                try {
                    if (wVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3223e;
                            if (pVar2 == null) {
                                i1.a aVar = this.f3221b;
                                j jVar3 = this.f3222c;
                                pVar2 = new p(aVar, jVar3.f3231a.f2503z, jVar3);
                                this.f3223e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3264a < ((List) pVar2.f3267e).size()) {
                                boolean z4 = pVar2.f3264a < ((List) pVar2.f3267e).size();
                                i1.a aVar2 = (i1.a) pVar2.f3265b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3267e));
                                }
                                List list2 = (List) pVar2.f3267e;
                                int i6 = pVar2.f3264a;
                                pVar2.f3264a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3268f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    i1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f2458e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    X0.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    X0.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        X0.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        X0.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = j1.b.f2606a;
                                    X0.d.e(str, "<this>");
                                    X0.g gVar = j1.b.f2609e;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f1020b).matcher(str).matches()) {
                                        list = q1.d.X(InetAddress.getByName(str));
                                    } else {
                                        X0.d.e((j) pVar2.d, "call");
                                        aVar2.f2385a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            X0.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new Q0.e(allByName, false)) : q1.d.X(allByName[0]) : q.f670a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f2385a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
                                        } catch (NullPointerException e2) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e2);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = pVar2.f3268f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((i1.a) pVar2.f3265b, proxy, (InetSocketAddress) it2.next());
                                    C0249n c0249n2 = (C0249n) pVar2.f3266c;
                                    synchronized (c0249n2) {
                                        contains = ((LinkedHashSet) c0249n2.f3035a).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3269g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                Q0.n.x0(arrayList, (ArrayList) pVar2.f3269g);
                                ((ArrayList) pVar2.f3269g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3222c.f3240m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3220a.a(this.f3221b, this.f3222c, arrayList, false)) {
                                mVar = this.f3222c.h;
                                X0.d.b(mVar);
                                X0.d.e(this.f3222c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f227a;
                                jVar4.f227a = i7 + 1;
                                wVar = (w) arrayList.get(i7);
                                mVar = new m(this.f3220a, wVar);
                                this.f3222c.f3242o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3222c);
                                this.f3222c.f3242o = null;
                                c0249n = this.f3222c.f3231a.f2503z;
                                synchronized (c0249n) {
                                    ((LinkedHashSet) c0249n.f3035a).remove(wVar);
                                }
                                if (this.f3220a.a(this.f3221b, this.f3222c, arrayList, true)) {
                                    m mVar3 = this.f3222c.h;
                                    X0.d.b(mVar3);
                                    this.i = wVar;
                                    Socket socket = mVar.d;
                                    X0.d.b(socket);
                                    j1.b.c(socket);
                                    X0.d.e(this.f3222c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3220a;
                                        nVar.getClass();
                                        byte[] bArr2 = j1.b.f2606a;
                                        nVar.d.add(mVar);
                                        nVar.f3260b.c(nVar.f3261c, 0L);
                                        this.f3222c.b(mVar);
                                    }
                                    X0.d.e(this.f3222c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            X0.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f227a;
                            jVar5.f227a = i8 + 1;
                            wVar = (w) ((ArrayList) jVar5.f228b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3222c);
                    this.f3222c.f3242o = null;
                    c0249n = this.f3222c.f3231a.f2503z;
                    synchronized (c0249n) {
                    }
                } catch (Throwable th2) {
                    this.f3222c.f3242o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3220a, wVar);
                this.f3222c.f3242o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(i1.m mVar) {
        X0.d.e(mVar, "url");
        i1.m mVar2 = this.f3221b.h;
        return mVar.f2458e == mVar2.f2458e && X0.d.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        X0.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3404a == 8) {
            this.f3224f++;
        } else if (iOException instanceof C0285a) {
            this.f3225g++;
        } else {
            this.h++;
        }
    }
}
