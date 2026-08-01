package E1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.C0265n;

/* loaded from: classes.dex */
public final class r implements C1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f360g = y1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = y1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final B1.m f361a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.g f362b;

    /* renamed from: c, reason: collision with root package name */
    public final q f363c;
    public volatile y d;

    /* renamed from: e, reason: collision with root package name */
    public final x1.q f364e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f365f;

    public r(x1.p pVar, B1.m mVar, C1.g gVar, q qVar) {
        i1.f.e(mVar, "connection");
        i1.f.e(qVar, "http2Connection");
        this.f361a = mVar;
        this.f362b = gVar;
        this.f363c = qVar;
        x1.q qVar2 = x1.q.H2_PRIOR_KNOWLEDGE;
        this.f364e = pVar.f4576r.contains(qVar2) ? qVar2 : x1.q.HTTP_2;
    }

    @Override // C1.e
    public final void a() {
        y yVar = this.d;
        i1.f.b(yVar);
        yVar.f().close();
    }

    @Override // C1.e
    public final void b() {
        this.f363c.flush();
    }

    @Override // C1.e
    public final K1.t c(H.e eVar, long j2) {
        y yVar = this.d;
        i1.f.b(yVar);
        return yVar.f();
    }

    @Override // C1.e
    public final void cancel() {
        this.f365f = true;
        y yVar = this.d;
        if (yVar != null) {
            yVar.e(9);
        }
    }

    @Override // C1.e
    public final long d(x1.s sVar) {
        if (C1.f.a(sVar)) {
            return y1.b.i(sVar);
        }
        return 0L;
    }

    @Override // C1.e
    public final void e(H.e eVar) {
        int i;
        y yVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        x1.j jVar = (x1.j) eVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new C0002c(C0002c.f292f, (String) eVar.f546b));
        K1.i iVar = C0002c.f293g;
        x1.l lVar = (x1.l) eVar.f547c;
        i1.f.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0002c(iVar, b2));
        String a2 = ((x1.j) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0002c(C0002c.i, a2));
        }
        arrayList.add(new C0002c(C0002c.h, lVar.f4534a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            i1.f.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            i1.f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f360g.contains(lowerCase) || (lowerCase.equals("te") && i1.f.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new C0002c(lowerCase, jVar.d(i2)));
            }
        }
        q qVar = this.f363c;
        qVar.getClass();
        boolean z2 = !false;
        synchronized (qVar.f357w) {
            synchronized (qVar) {
                try {
                    if (qVar.f341e > 1073741823) {
                        qVar.i(8);
                    }
                    if (qVar.f342f) {
                        throw new C0000a();
                    }
                    i = qVar.f341e;
                    qVar.f341e = i + 2;
                    yVar = new y(i, qVar, z2, false, null);
                    if (yVar.h()) {
                        qVar.f339b.put(Integer.valueOf(i), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f357w.q(z2, i, arrayList);
        }
        qVar.f357w.flush();
        this.d = yVar;
        if (this.f365f) {
            y yVar2 = this.d;
            i1.f.b(yVar2);
            yVar2.e(9);
            throw new IOException("Canceled");
        }
        y yVar3 = this.d;
        i1.f.b(yVar3);
        x xVar = yVar3.f390k;
        long j2 = this.f362b.f258g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j2, timeUnit);
        y yVar4 = this.d;
        i1.f.b(yVar4);
        yVar4.f391l.g(this.f362b.h, timeUnit);
    }

    @Override // C1.e
    public final x1.r f(boolean z2) {
        x1.j jVar;
        y yVar = this.d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f390k.h();
            while (yVar.f388g.isEmpty() && yVar.f392m == 0) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f390k.k();
                    throw th;
                }
            }
            yVar.f390k.k();
            if (yVar.f388g.isEmpty()) {
                IOException iOException = yVar.f393n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = yVar.f392m;
                AbstractC0001b.h(i);
                throw new E(i);
            }
            Object removeFirst = yVar.f388g.removeFirst();
            i1.f.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (x1.j) removeFirst;
        }
        x1.q qVar = this.f364e;
        i1.f.e(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (i1.f.a(b2, ":status")) {
                dVar = F1.d.X("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                i1.f.e(b2, "name");
                i1.f.e(d, "value");
                arrayList.add(b2);
                arrayList.add(p1.d.a0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        x1.r rVar = new x1.r();
        rVar.f4591b = qVar;
        rVar.f4592c = dVar.f60b;
        rVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0265n c0265n = new C0265n(5);
        ArrayList arrayList2 = (ArrayList) c0265n.f3473a;
        i1.f.e(arrayList2, "<this>");
        i1.f.e(strArr, "elements");
        arrayList2.addAll(W0.i.r0(strArr));
        rVar.f4594f = c0265n;
        if (z2 && rVar.f4592c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // C1.e
    public final B1.m g() {
        return this.f361a;
    }

    @Override // C1.e
    public final K1.v h(x1.s sVar) {
        y yVar = this.d;
        i1.f.b(yVar);
        return yVar.i;
    }
}
