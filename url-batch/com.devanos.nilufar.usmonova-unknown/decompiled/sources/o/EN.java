package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class EN {
    public C0932ds a;
    public JN d;
    public LinkedHashMap e = new LinkedHashMap();
    public String b = "GET";
    public C1787qr c = new C1787qr();

    public final FN a() {
        Map unmodifiableMap;
        C0932ds c0932ds = this.a;
        if (c0932ds == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.b;
        C1852rr d = this.c.d();
        JN jn = this.d;
        LinkedHashMap linkedHashMap = this.e;
        byte[] bArr = HY.a;
        AbstractC0048Bt.n(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = C1384kk.h;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC0048Bt.m(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new FN(c0932ds, str, d, jn, unmodifiableMap);
    }

    public final void b(String str, String str2) {
        AbstractC0048Bt.n(str2, "value");
        C1787qr c1787qr = this.c;
        c1787qr.getClass();
        AbstractC0048Bt.j(str);
        AbstractC0048Bt.o(str2, str);
        c1787qr.e(str);
        c1787qr.b(str, str2);
    }

    public final void c(String str, JN jn) {
        AbstractC0048Bt.n(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (jn == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC1888sN.k("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC0946e20.D(str)) {
            throw new IllegalArgumentException(AbstractC1888sN.k("method ", str, " must not have a request body.").toString());
        }
        this.b = str;
        this.d = jn;
    }

    public final void d(Class cls, Object obj) {
        AbstractC0048Bt.n(cls, "type");
        if (obj == null) {
            this.e.remove(cls);
            return;
        }
        if (this.e.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.e;
        Object cast = cls.cast(obj);
        AbstractC0048Bt.k(cast);
        linkedHashMap.put(cls, cast);
    }

    public final void e() {
        String str = "http://localhost/";
        if (AbstractC0778bU.B("http://localhost/", "ws:", true)) {
            str = "http:".concat("p://localhost/");
        } else if (AbstractC0778bU.B("http://localhost/", "wss:", true)) {
            str = "https:".concat("://localhost/");
        }
        AbstractC0048Bt.n(str, "<this>");
        C0867cs c0867cs = new C0867cs();
        c0867cs.c(null, str);
        this.a = c0867cs.a();
    }
}
