package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gi {
    public final xx a;
    public final z1 b;
    public final tx c;
    public g2 d;
    public y1 e;
    public int f;
    public int g;
    public int h;
    public i00 i;

    public gi(xx xxVar, z1 z1Var, tx txVar) {
        xxVar.getClass();
        this.a = xxVar;
        this.b = z1Var;
        this.c = txVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wx a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        uv uvVar;
        boolean z3;
        Socket i5;
        while (!this.c.r) {
            wx wxVar = this.c.m;
            if (wxVar != null) {
                synchronized (wxVar) {
                    try {
                        if (!wxVar.j) {
                            xn xnVar = wxVar.b.a.h;
                            xnVar.getClass();
                            xn xnVar2 = this.b.h;
                            if (xnVar.e == xnVar2.e && oo.b(xnVar.d, xnVar2.d)) {
                                i5 = null;
                            }
                        }
                        i5 = this.c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.m != null) {
                    if (i5 != null) {
                        l8.u("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (wxVar.i(z3)) {
                        return wxVar;
                    }
                    wxVar.k();
                    if (this.i == null) {
                        g2 g2Var = this.d;
                        if (g2Var != null ? g2Var.c() : true) {
                            continue;
                        } else {
                            y1 y1Var = this.e;
                            if (!(y1Var != null ? y1Var.j() : true)) {
                                l8.y("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i5 != null) {
                    z60.c(i5);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                wxVar = this.c.m;
                wxVar.getClass();
            } else {
                i00 i00Var = this.i;
                try {
                    if (i00Var != null) {
                        this.i = null;
                    } else {
                        g2 g2Var2 = this.d;
                        if (g2Var2 == null || !g2Var2.c()) {
                            y1 y1Var2 = this.e;
                            if (y1Var2 == null) {
                                z1 z1Var = this.b;
                                tx txVar = this.c;
                                y1Var2 = new y1(z1Var, txVar.f.D, txVar);
                                this.e = y1Var2;
                            }
                            if (!y1Var2.j()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (y1Var2.a < ((List) y1Var2.e).size()) {
                                z1 z1Var2 = (z1) y1Var2.b;
                                if (y1Var2.a >= ((List) y1Var2.e).size()) {
                                    throw new SocketException("No route to " + z1Var2.h.d + "; exhausted proxy configurations: " + ((List) y1Var2.e));
                                }
                                List list2 = (List) y1Var2.e;
                                int i6 = y1Var2.a;
                                y1Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                y1Var2.f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    xn xnVar3 = z1Var2.h;
                                    str = xnVar3.d;
                                    i4 = xnVar3.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        str.getClass();
                                    } else {
                                        str = address2.getHostAddress();
                                        str.getClass();
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = z60.a;
                                    str.getClass();
                                    gz gzVar = z60.f;
                                    gzVar.getClass();
                                    if (((Pattern) gzVar.g).matcher(str).matches()) {
                                        list = oo.x(InetAddress.getByName(str));
                                    } else {
                                        z1Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new d6(allByName, false)) : oo.x(allByName[0]) : uh.f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(z1Var2.a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
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
                                Iterator it2 = ((List) y1Var2.f).iterator();
                                while (it2.hasNext()) {
                                    i00 i00Var2 = new i00((z1) y1Var2.b, proxy, (InetSocketAddress) it2.next());
                                    uv uvVar2 = (uv) y1Var2.d;
                                    synchronized (uvVar2) {
                                        contains = ((LinkedHashSet) uvVar2.f).contains(i00Var2);
                                    }
                                    if (contains) {
                                        ((ArrayList) y1Var2.c).add(i00Var2);
                                    } else {
                                        arrayList.add(i00Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                ab.Z(arrayList, (ArrayList) y1Var2.c);
                                ((ArrayList) y1Var2.c).clear();
                            }
                            g2 g2Var3 = new g2(arrayList, 3);
                            this.d = g2Var3;
                            if (this.c.r) {
                                l8.y("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                wxVar = this.c.m;
                                wxVar.getClass();
                            } else {
                                if (!g2Var3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = g2Var3.f;
                                g2Var3.f = i7 + 1;
                                i00Var = (i00) arrayList.get(i7);
                                wx wxVar2 = new wx(this.a, i00Var);
                                this.c.t = wxVar2;
                                wxVar2.c(i, i2, i3, z, this.c);
                                this.c.t = null;
                                uvVar = this.c.f.D;
                                synchronized (uvVar) {
                                    ((LinkedHashSet) uvVar.f).remove(i00Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    wx wxVar3 = this.c.m;
                                    wxVar3.getClass();
                                    this.i = i00Var;
                                    Socket socket = wxVar2.d;
                                    socket.getClass();
                                    z60.c(socket);
                                    wxVar = wxVar3;
                                } else {
                                    synchronized (wxVar2) {
                                        xx xxVar = this.a;
                                        xxVar.getClass();
                                        byte[] bArr2 = z60.a;
                                        xxVar.d.add(wxVar2);
                                        xxVar.b.c(xxVar.c, 0L);
                                        this.c.b(wxVar2);
                                    }
                                    z3 = z2;
                                    wxVar = wxVar2;
                                    if (wxVar.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            g2 g2Var4 = this.d;
                            g2Var4.getClass();
                            if (!g2Var4.c()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) g2Var4.g;
                            int i8 = g2Var4.f;
                            g2Var4.f = i8 + 1;
                            i00Var = (i00) arrayList4.get(i8);
                        }
                    }
                    wxVar2.c(i, i2, i3, z, this.c);
                    this.c.t = null;
                    uvVar = this.c.f.D;
                    synchronized (uvVar) {
                    }
                } catch (Throwable th2) {
                    this.c.t = null;
                    throw th2;
                }
                arrayList = null;
                wx wxVar22 = new wx(this.a, i00Var);
                this.c.t = wxVar22;
            }
            z3 = z2;
            if (wxVar.i(z3)) {
            }
        }
        l8.y("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof l30) && ((l30) iOException).f == 8) {
            this.f++;
        } else if (iOException instanceof ub) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
