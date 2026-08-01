package p1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0286b[] f3423a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3424b;

    static {
        C0286b c0286b = new C0286b(C0286b.i, "");
        v1.i iVar = C0286b.f3406f;
        C0286b c0286b2 = new C0286b(iVar, "GET");
        C0286b c0286b3 = new C0286b(iVar, "POST");
        v1.i iVar2 = C0286b.f3407g;
        C0286b c0286b4 = new C0286b(iVar2, "/");
        C0286b c0286b5 = new C0286b(iVar2, "/index.html");
        v1.i iVar3 = C0286b.h;
        C0286b c0286b6 = new C0286b(iVar3, "http");
        C0286b c0286b7 = new C0286b(iVar3, "https");
        v1.i iVar4 = C0286b.f3405e;
        C0286b[] c0286bArr = {c0286b, c0286b2, c0286b3, c0286b4, c0286b5, c0286b6, c0286b7, new C0286b(iVar4, "200"), new C0286b(iVar4, "204"), new C0286b(iVar4, "206"), new C0286b(iVar4, "304"), new C0286b(iVar4, "400"), new C0286b(iVar4, "404"), new C0286b(iVar4, "500"), new C0286b("accept-charset", ""), new C0286b("accept-encoding", "gzip, deflate"), new C0286b("accept-language", ""), new C0286b("accept-ranges", ""), new C0286b("accept", ""), new C0286b("access-control-allow-origin", ""), new C0286b("age", ""), new C0286b("allow", ""), new C0286b("authorization", ""), new C0286b("cache-control", ""), new C0286b("content-disposition", ""), new C0286b("content-encoding", ""), new C0286b("content-language", ""), new C0286b("content-length", ""), new C0286b("content-location", ""), new C0286b("content-range", ""), new C0286b("content-type", ""), new C0286b("cookie", ""), new C0286b("date", ""), new C0286b("etag", ""), new C0286b("expect", ""), new C0286b("expires", ""), new C0286b("from", ""), new C0286b("host", ""), new C0286b("if-match", ""), new C0286b("if-modified-since", ""), new C0286b("if-none-match", ""), new C0286b("if-range", ""), new C0286b("if-unmodified-since", ""), new C0286b("last-modified", ""), new C0286b("link", ""), new C0286b("location", ""), new C0286b("max-forwards", ""), new C0286b("proxy-authenticate", ""), new C0286b("proxy-authorization", ""), new C0286b("range", ""), new C0286b("referer", ""), new C0286b("refresh", ""), new C0286b("retry-after", ""), new C0286b("server", ""), new C0286b("set-cookie", ""), new C0286b("strict-transport-security", ""), new C0286b("transfer-encoding", ""), new C0286b("user-agent", ""), new C0286b("vary", ""), new C0286b("via", ""), new C0286b("www-authenticate", "")};
        f3423a = c0286bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0286bArr[i].f3408a)) {
                linkedHashMap.put(c0286bArr[i].f3408a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X0.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f3424b = unmodifiableMap;
    }

    public static void a(v1.i iVar) {
        X0.d.e(iVar, "name");
        int a2 = iVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
