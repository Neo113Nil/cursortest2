package p1;

import X.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3468g = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final m1.m f3469a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.f f3470b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3471c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.s f3472e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3473f;

    public p(i1.q qVar, m1.m mVar, n1.f fVar, o oVar) {
        X0.d.e(mVar, "connection");
        X0.d.e(oVar, "http2Connection");
        this.f3469a = mVar;
        this.f3470b = fVar;
        this.f3471c = oVar;
        i1.s sVar = i1.s.H2_PRIOR_KNOWLEDGE;
        this.f3472e = qVar.f2502r.contains(sVar) ? sVar : i1.s.HTTP_2;
    }

    @Override // n1.d
    public final void a() {
        w wVar = this.d;
        X0.d.b(wVar);
        wVar.f().close();
    }

    @Override // n1.d
    public final void b() {
        this.f3471c.flush();
    }

    @Override // n1.d
    public final v1.t c(H.e eVar, long j2) {
        w wVar = this.d;
        X0.d.b(wVar);
        return wVar.f();
    }

    @Override // n1.d
    public final void cancel() {
        this.f3473f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // n1.d
    public final void d(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        i1.l lVar = (i1.l) eVar.d;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new C0281b(C0281b.f3405f, (String) eVar.f205b));
        v1.i iVar = C0281b.f3406g;
        i1.n nVar = (i1.n) eVar.f206c;
        X0.d.e(nVar, "url");
        String b2 = nVar.b();
        String d = nVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0281b(iVar, b2));
        String a2 = ((i1.l) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0281b(C0281b.i, a2));
        }
        arrayList.add(new C0281b(C0281b.h, nVar.f2462a));
        int size = lVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = lVar.b(i2);
            Locale locale = Locale.US;
            X0.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            X0.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3468g.contains(lowerCase) || (lowerCase.equals("te") && X0.d.a(lVar.d(i2), "trailers"))) {
                arrayList.add(new C0281b(lowerCase, lVar.d(i2)));
            }
        }
        o oVar = this.f3471c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3465w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3449e > 1073741823) {
                        oVar.h(8);
                    }
                    if (oVar.f3450f) {
                        throw new C0280a();
                    }
                    i = oVar.f3449e;
                    oVar.f3449e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f3447b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3465w.i(z2, i, arrayList);
        }
        oVar.f3465w.flush();
        this.d = wVar;
        if (this.f3473f) {
            w wVar2 = this.d;
            X0.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        X0.d.b(wVar3);
        v vVar = wVar3.f3498k;
        long j2 = this.f3470b.f3298g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        X0.d.b(wVar4);
        wVar4.f3499l.g(this.f3470b.h, timeUnit);
    }

    @Override // n1.d
    public final i1.t e(boolean z2) {
        i1.l lVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3498k.h();
            while (wVar.f3496g.isEmpty() && wVar.f3500m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3498k.k();
                    throw th;
                }
            }
            wVar.f3498k.k();
            if (wVar.f3496g.isEmpty()) {
                IOException iOException = wVar.f3501n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3500m;
                V.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3496g.removeFirst();
            X0.d.d(removeFirst, "headersQueue.removeFirst()");
            lVar = (i1.l) removeFirst;
        }
        i1.s sVar = this.f3472e;
        X0.d.e(sVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = lVar.b(i2);
            String d = lVar.d(i2);
            if (X0.d.a(b2, ":status")) {
                dVar = i1.r.h("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                X0.d.e(b2, "name");
                X0.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(e1.d.w0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i1.t tVar = new i1.t();
        tVar.f2519b = sVar;
        tVar.f2520c = dVar.f16b;
        tVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C.g gVar = new C.g(26);
        ArrayList arrayList2 = (ArrayList) gVar.f62b;
        X0.d.e(arrayList2, "<this>");
        X0.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        tVar.f2522f = gVar;
        if (z2 && tVar.f2520c == 100) {
            return null;
        }
        return tVar;
    }

    @Override // n1.d
    public final v1.v f(i1.u uVar) {
        w wVar = this.d;
        X0.d.b(wVar);
        return wVar.i;
    }

    @Override // n1.d
    public final m1.m g() {
        return this.f3469a;
    }

    @Override // n1.d
    public final long h(i1.u uVar) {
        if (n1.e.a(uVar)) {
            return j1.b.i(uVar);
        }
        return 0L;
    }
}
