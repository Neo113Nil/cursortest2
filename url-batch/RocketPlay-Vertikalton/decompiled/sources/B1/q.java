package B1;

import K1.t;
import K1.v;
import W0.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import x1.r;

/* loaded from: classes.dex */
public final class q implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f224a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f225b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f226c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f227e;

    /* renamed from: f, reason: collision with root package name */
    public Object f228f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f229g;

    public q(x1.a aVar, A1.d dVar, j jVar) {
        List j2;
        i1.f.e(dVar, "routeDatabase");
        i1.f.e(jVar, "call");
        this.f225b = aVar;
        this.f226c = dVar;
        this.d = jVar;
        s sVar = s.f1284a;
        this.f227e = sVar;
        this.f228f = sVar;
        this.f229g = new ArrayList();
        x1.l lVar = aVar.h;
        i1.f.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = y1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f4472g.select(g2);
            j2 = (select == null || select.isEmpty()) ? y1.b.j(Proxy.NO_PROXY) : y1.b.v(select);
        }
        this.f227e = j2;
        this.f224a = 0;
    }

    @Override // C1.e
    public void a() {
        ((K1.o) this.f227e).flush();
    }

    @Override // C1.e
    public void b() {
        ((K1.o) this.f227e).flush();
    }

    @Override // C1.e
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((x1.j) eVar.d).a("Transfer-Encoding"))) {
            if (this.f224a == 1) {
                this.f224a = 2;
                return new D1.c(this);
            }
            throw new IllegalStateException(("state: " + this.f224a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f224a == 1) {
            this.f224a = 2;
            return new D1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f224a).toString());
    }

    @Override // C1.e
    public void cancel() {
        Socket socket = ((m) this.f226c).f205c;
        if (socket != null) {
            y1.b.c(socket);
        }
    }

    @Override // C1.e
    public long d(x1.s sVar) {
        if (!C1.f.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(x1.s.a("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return y1.b.i(sVar);
    }

    @Override // C1.e
    public void e(H.e eVar) {
        Proxy.Type type = ((m) this.f226c).f204b.f4611b.type();
        i1.f.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f546b);
        sb.append(' ');
        x1.l lVar = (x1.l) eVar.f547c;
        if (lVar.i || type != Proxy.Type.HTTP) {
            String b2 = lVar.b();
            String d = lVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(lVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        i1.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((x1.j) eVar.d, sb2);
    }

    @Override // C1.e
    public r f(boolean z2) {
        D1.a aVar = (D1.a) this.f228f;
        int i = this.f224a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f224a).toString());
        }
        try {
            String G2 = ((K1.p) aVar.f267c).G(aVar.f266b);
            aVar.f266b -= G2.length();
            B.d X2 = F1.d.X(G2);
            int i2 = X2.f60b;
            r rVar = new r();
            rVar.f4591b = (x1.q) X2.f61c;
            rVar.f4592c = i2;
            rVar.d = (String) X2.d;
            rVar.f4594f = aVar.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f224a = 3;
                return rVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f224a = 4;
                return rVar;
            }
            this.f224a = 3;
            return rVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f226c).f204b.f4610a.h.f()), e2);
        }
    }

    @Override // C1.e
    public m g() {
        return (m) this.f226c;
    }

    @Override // C1.e
    public v h(x1.s sVar) {
        if (!C1.f.a(sVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(x1.s.a("Transfer-Encoding", sVar))) {
            x1.l lVar = (x1.l) sVar.f4600a.f547c;
            if (this.f224a == 4) {
                this.f224a = 5;
                return new D1.d(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f224a).toString());
        }
        long i = y1.b.i(sVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f224a == 4) {
            this.f224a = 5;
            ((m) this.f226c).k();
            return new D1.g(this);
        }
        throw new IllegalStateException(("state: " + this.f224a).toString());
    }

    public boolean i() {
        return this.f224a < ((List) this.f227e).size() || !((ArrayList) this.f229g).isEmpty();
    }

    public D1.e j(long j2) {
        if (this.f224a == 4) {
            this.f224a = 5;
            return new D1.e(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f224a).toString());
    }

    public void k(x1.j jVar, String str) {
        i1.f.e(str, "requestLine");
        if (this.f224a != 0) {
            throw new IllegalStateException(("state: " + this.f224a).toString());
        }
        K1.o oVar = (K1.o) this.f227e;
        oVar.o(str);
        oVar.o("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            oVar.o(jVar.b(i));
            oVar.o(": ");
            oVar.o(jVar.d(i));
            oVar.o("\r\n");
        }
        oVar.o("\r\n");
        this.f224a = 1;
    }

    public q(x1.p pVar, m mVar, K1.p pVar2, K1.o oVar) {
        i1.f.e(mVar, "connection");
        i1.f.e(pVar2, "source");
        i1.f.e(oVar, "sink");
        this.f225b = pVar;
        this.f226c = mVar;
        this.d = pVar2;
        this.f227e = oVar;
        this.f228f = new D1.a(pVar2);
    }
}
