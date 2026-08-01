package m1;

import Q0.q;
import f0.C0098b;
import i1.r;
import i1.s;
import i1.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0238n;
import v1.t;
import v1.v;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3268b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3269c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3270e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3271f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3272g;

    public p(i1.a aVar, C0238n c0238n, j jVar) {
        List j2;
        X0.d.e(c0238n, "routeDatabase");
        X0.d.e(jVar, "call");
        this.f3268b = aVar;
        this.f3269c = c0238n;
        this.d = jVar;
        q qVar = q.f668a;
        this.f3270e = qVar;
        this.f3271f = qVar;
        this.f3272g = new ArrayList();
        i1.n nVar = aVar.h;
        X0.d.e(nVar, "url");
        URI g2 = nVar.g();
        if (g2.getHost() == null) {
            j2 = j1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2393g.select(g2);
            j2 = (select == null || select.isEmpty()) ? j1.b.j(Proxy.NO_PROXY) : j1.b.u(select);
        }
        this.f3270e = j2;
        this.f3267a = 0;
    }

    @Override // n1.d
    public void a() {
        ((v1.o) this.f3270e).flush();
    }

    @Override // n1.d
    public void b() {
        ((v1.o) this.f3270e).flush();
    }

    @Override // n1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((i1.l) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3267a == 1) {
                this.f3267a = 2;
                return new o1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3267a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3267a == 1) {
            this.f3267a = 2;
            return new o1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3267a).toString());
    }

    @Override // n1.d
    public void cancel() {
        Socket socket = ((m) this.f3269c).f3250c;
        if (socket != null) {
            j1.b.c(socket);
        }
    }

    @Override // n1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3269c).f3249b.f2542b.type();
        X0.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f205b);
        sb.append(' ');
        i1.n nVar = (i1.n) eVar.f206c;
        if (nVar.i || type != Proxy.Type.HTTP) {
            String b2 = nVar.b();
            String d = nVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        X0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((i1.l) eVar.d, sb2);
    }

    @Override // n1.d
    public i1.t e(boolean z2) {
        C0098b c0098b = (C0098b) this.f3271f;
        int i = this.f3267a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3267a).toString());
        }
        try {
            String m2 = ((v1.p) c0098b.f2038c).m(c0098b.f2037b);
            c0098b.f2037b -= m2.length();
            B.d h = r.h(m2);
            int i2 = h.f16b;
            i1.t tVar = new i1.t();
            tVar.f2519b = (s) h.f17c;
            tVar.f2520c = i2;
            tVar.d = (String) h.d;
            tVar.f2522f = c0098b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3267a = 3;
                return tVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3267a = 4;
                return tVar;
            }
            this.f3267a = 3;
            return tVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3269c).f3249b.f2541a.h.f()), e2);
        }
    }

    @Override // n1.d
    public v f(u uVar) {
        if (!n1.e.a(uVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(u.e(uVar, "Transfer-Encoding"))) {
            i1.n nVar = (i1.n) uVar.f2528a.f206c;
            if (this.f3267a == 4) {
                this.f3267a = 5;
                return new o1.c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f3267a).toString());
        }
        long i = j1.b.i(uVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3267a == 4) {
            this.f3267a = 5;
            ((m) this.f3269c).k();
            return new o1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3267a).toString());
    }

    @Override // n1.d
    public m g() {
        return (m) this.f3269c;
    }

    @Override // n1.d
    public long h(u uVar) {
        if (!n1.e.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(u.e(uVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return j1.b.i(uVar);
    }

    public boolean i() {
        return this.f3267a < ((List) this.f3270e).size() || !((ArrayList) this.f3272g).isEmpty();
    }

    public o1.d j(long j2) {
        if (this.f3267a == 4) {
            this.f3267a = 5;
            return new o1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3267a).toString());
    }

    public void k(i1.l lVar, String str) {
        X0.d.e(str, "requestLine");
        if (this.f3267a != 0) {
            throw new IllegalStateException(("state: " + this.f3267a).toString());
        }
        v1.o oVar = (v1.o) this.f3270e;
        oVar.d(str);
        oVar.d("\r\n");
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            oVar.d(lVar.b(i));
            oVar.d(": ");
            oVar.d(lVar.d(i));
            oVar.d("\r\n");
        }
        oVar.d("\r\n");
        this.f3267a = 1;
    }

    public p(i1.q qVar, m mVar, v1.p pVar, v1.o oVar) {
        X0.d.e(mVar, "connection");
        X0.d.e(pVar, "source");
        X0.d.e(oVar, "sink");
        this.f3268b = qVar;
        this.f3269c = mVar;
        this.d = pVar;
        this.f3270e = oVar;
        this.f3271f = new C0098b(pVar);
    }
}
