package o;

import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;

/* renamed from: o.Hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202Hr implements InterfaceC0610Xk {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public C0202Hr(EnumC0571Vx enumC0571Vx, C1527mv c1527mv, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        AbstractC0048Bt.n(enumC0571Vx, "kind");
        this.c = enumC0571Vx;
        this.d = c1527mv;
        this.e = strArr;
        this.f = strArr2;
        this.g = strArr3;
        this.h = str;
        this.b = i;
    }

    @Override // o.InterfaceC0610Xk
    public void a() {
        ((M8) this.f).flush();
    }

    @Override // o.InterfaceC0610Xk
    public void b() {
        ((M8) this.f).flush();
    }

    @Override // o.InterfaceC0610Xk
    public YR c(FN fn, long j) {
        JN jn = fn.d;
        if (jn != null && jn.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(fn.c.j("Transfer-Encoding"))) {
            if (this.b == 1) {
                this.b = 2;
                return new C0072Cr(this);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.b == 1) {
            this.b = 2;
            return new C0150Fr(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override // o.InterfaceC0610Xk
    public void cancel() {
        Socket socket = ((PL) this.d).c;
        if (socket != null) {
            HY.d(socket);
        }
    }

    @Override // o.InterfaceC0610Xk
    public HS d(C0968eO c0968eO) {
        if (!AbstractC0736as.a(c0968eO)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(C0968eO.b("Transfer-Encoding", c0968eO))) {
            C0932ds c0932ds = c0968eO.h.a;
            if (this.b == 4) {
                this.b = 5;
                return new C0098Dr(this, c0932ds);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        long i = HY.i(c0968eO);
        if (i != -1) {
            return i(i);
        }
        if (this.b == 4) {
            this.b = 5;
            ((PL) this.d).k();
            return new C0176Gr(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override // o.InterfaceC0610Xk
    public long e(C0968eO c0968eO) {
        if (!AbstractC0736as.a(c0968eO)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C0968eO.b("Transfer-Encoding", c0968eO))) {
            return -1L;
        }
        return HY.i(c0968eO);
    }

    @Override // o.InterfaceC0610Xk
    public void f(FN fn) {
        Proxy.Type type = ((PL) this.d).b.b.type();
        AbstractC0048Bt.m(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(fn.b);
        sb.append(' ');
        C0932ds c0932ds = fn.a;
        if (c0932ds.j || type != Proxy.Type.HTTP) {
            String b = c0932ds.b();
            String d = c0932ds.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(c0932ds);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        j(fn.c, sb2);
    }

    @Override // o.InterfaceC0610Xk
    public C0903dO g(boolean z) {
        C1918sr c1918sr = (C1918sr) this.g;
        int i = this.b;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        try {
            String u = c1918sr.a.u(c1918sr.b);
            c1918sr.b -= u.length();
            C1739q5 n = ON.n(u);
            int i2 = n.b;
            C0903dO c0903dO = new C0903dO();
            c0903dO.b = (EnumC1359kL) n.c;
            c0903dO.c = i2;
            c0903dO.d = (String) n.d;
            c0903dO.f = c1918sr.a().l();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.b = 3;
                return c0903dO;
            }
            if (102 > i2 || i2 >= 200) {
                this.b = 4;
                return c0903dO;
            }
            this.b = 3;
            return c0903dO;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((PL) this.d).b.a.h.g()), e);
        }
    }

    @Override // o.InterfaceC0610Xk
    public PL h() {
        return (PL) this.d;
    }

    public C0124Er i(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new C0124Er(this, j);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public void j(C1852rr c1852rr, String str) {
        M8 m8 = (M8) this.f;
        AbstractC0048Bt.n(str, "requestLine");
        if (this.b != 0) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        m8.z(str).z("\r\n");
        int size = c1852rr.size();
        for (int i = 0; i < size; i++) {
            m8.z(c1852rr.k(i)).z(": ").z(c1852rr.m(i)).z("\r\n");
        }
        m8.z("\r\n");
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((EnumC0571Vx) this.c) + " version=" + ((C1527mv) this.d);
            default:
                return super.toString();
        }
    }

    public C0202Hr(EF ef, PL pl, JL jl, IL il) {
        AbstractC0048Bt.n(jl, Constants.ScionAnalytics.PARAM_SOURCE);
        AbstractC0048Bt.n(il, "sink");
        this.c = ef;
        this.d = pl;
        this.e = jl;
        this.f = il;
        this.g = new C1918sr(jl);
    }
}
