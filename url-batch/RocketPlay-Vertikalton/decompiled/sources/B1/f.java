package B1;

import E1.C0000a;
import E1.E;
import W0.s;
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
import x1.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f178a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.a f179b;

    /* renamed from: c, reason: collision with root package name */
    public final j f180c;
    public p d;

    /* renamed from: e, reason: collision with root package name */
    public q f181e;

    /* renamed from: f, reason: collision with root package name */
    public int f182f;

    /* renamed from: g, reason: collision with root package name */
    public int f183g;
    public int h;
    public t i;

    public f(n nVar, x1.a aVar, j jVar) {
        i1.f.e(nVar, "connectionPool");
        i1.f.e(jVar, "call");
        this.f178a = nVar;
        this.f179b = aVar;
        this.f180c = jVar;
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
        A1.d dVar;
        Socket i5;
        while (!this.f180c.f198m) {
            m mVar = this.f180c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f209j && b(mVar.f204b.f4610a.h)) {
                            i5 = null;
                        }
                        i5 = this.f180c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f180c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        p pVar = this.d;
                        if (pVar != null ? pVar.c() : true) {
                            continue;
                        } else {
                            q qVar = this.f181e;
                            if (!(qVar != null ? qVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        y1.b.c(i5);
                    }
                    i1.f.e(this.f180c, "call");
                }
            }
            this.f182f = 0;
            this.f183g = 0;
            this.h = 0;
            if (this.f178a.a(this.f179b, this.f180c, null, false)) {
                mVar = this.f180c.h;
                i1.f.b(mVar);
                i1.f.e(this.f180c, "call");
            } else {
                t tVar = this.i;
                try {
                    if (tVar != null) {
                        this.i = null;
                    } else {
                        p pVar2 = this.d;
                        if (pVar2 == null || !pVar2.c()) {
                            q qVar2 = this.f181e;
                            if (qVar2 == null) {
                                x1.a aVar = this.f179b;
                                j jVar = this.f180c;
                                qVar2 = new q(aVar, jVar.f189a.f4583y, jVar);
                                this.f181e = qVar2;
                            }
                            if (!qVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (qVar2.f224a < ((List) qVar2.f227e).size()) {
                                boolean z4 = qVar2.f224a < ((List) qVar2.f227e).size();
                                x1.a aVar2 = (x1.a) qVar2.f225b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) qVar2.f227e));
                                }
                                List list2 = (List) qVar2.f227e;
                                int i6 = qVar2.f224a;
                                qVar2.f224a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                qVar2.f228f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    x1.l lVar = aVar2.h;
                                    str = lVar.d;
                                    i4 = lVar.f4537e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    i1.f.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    i1.f.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        i1.f.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        i1.f.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = y1.b.f4648a;
                                    i1.f.e(str, "<this>");
                                    i1.i iVar = y1.b.f4652f;
                                    iVar.getClass();
                                    if (((Pattern) iVar.f3051b).matcher(str).matches()) {
                                        list = F1.l.T(InetAddress.getByName(str));
                                    } else {
                                        i1.f.e((j) qVar2.d, "call");
                                        aVar2.f4467a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            i1.f.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new W0.g(allByName, false)) : F1.l.T(allByName[0]) : s.f1284a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f4467a + " returned no addresses for " + str);
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
                                Iterator it2 = qVar2.f228f.iterator();
                                while (it2.hasNext()) {
                                    t tVar2 = new t((x1.a) qVar2.f225b, proxy, (InetSocketAddress) it2.next());
                                    A1.d dVar2 = (A1.d) qVar2.f226c;
                                    synchronized (dVar2) {
                                        contains = ((LinkedHashSet) dVar2.f38b).contains(tVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) qVar2.f229g).add(tVar2);
                                    } else {
                                        arrayList.add(tVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                W0.p.u0(arrayList, (ArrayList) qVar2.f229g);
                                ((ArrayList) qVar2.f229g).clear();
                            }
                            p pVar3 = new p(arrayList);
                            this.d = pVar3;
                            if (this.f180c.f198m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f178a.a(this.f179b, this.f180c, arrayList, false)) {
                                mVar = this.f180c.h;
                                i1.f.b(mVar);
                                i1.f.e(this.f180c, "call");
                            } else {
                                if (!pVar3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = pVar3.f222a;
                                pVar3.f222a = i7 + 1;
                                tVar = (t) arrayList.get(i7);
                                mVar = new m(this.f178a, tVar);
                                this.f180c.f200o = mVar;
                                mVar.c(i, i2, i3, z2, this.f180c);
                                this.f180c.f200o = null;
                                dVar = this.f180c.f189a.f4583y;
                                synchronized (dVar) {
                                    ((LinkedHashSet) dVar.f38b).remove(tVar);
                                }
                                if (this.f178a.a(this.f179b, this.f180c, arrayList, true)) {
                                    m mVar2 = this.f180c.h;
                                    i1.f.b(mVar2);
                                    this.i = tVar;
                                    Socket socket = mVar.d;
                                    i1.f.b(socket);
                                    y1.b.c(socket);
                                    i1.f.e(this.f180c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f178a;
                                        nVar.getClass();
                                        byte[] bArr2 = y1.b.f4648a;
                                        nVar.d.add(mVar);
                                        nVar.f218b.c(nVar.f219c, 0L);
                                        this.f180c.b(mVar);
                                    }
                                    i1.f.e(this.f180c, "call");
                                }
                            }
                        } else {
                            p pVar4 = this.d;
                            i1.f.b(pVar4);
                            if (!pVar4.c()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = pVar4.f222a;
                            pVar4.f222a = i8 + 1;
                            tVar = (t) ((ArrayList) pVar4.f223b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f180c);
                    this.f180c.f200o = null;
                    dVar = this.f180c.f189a.f4583y;
                    synchronized (dVar) {
                    }
                } catch (Throwable th2) {
                    this.f180c.f200o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f178a, tVar);
                this.f180c.f200o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(x1.l lVar) {
        i1.f.e(lVar, "url");
        x1.l lVar2 = this.f179b.h;
        return lVar.f4537e == lVar2.f4537e && i1.f.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        i1.f.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof E) && ((E) iOException).f290a == 8) {
            this.f182f++;
        } else if (iOException instanceof C0000a) {
            this.f183g++;
        } else {
            this.h++;
        }
    }
}
