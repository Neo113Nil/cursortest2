package p1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0281b[] f3422a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3423b;

    static {
        C0281b c0281b = new C0281b(C0281b.i, "");
        v1.i iVar = C0281b.f3405f;
        C0281b c0281b2 = new C0281b(iVar, "GET");
        C0281b c0281b3 = new C0281b(iVar, "POST");
        v1.i iVar2 = C0281b.f3406g;
        C0281b c0281b4 = new C0281b(iVar2, "/");
        C0281b c0281b5 = new C0281b(iVar2, "/index.html");
        v1.i iVar3 = C0281b.h;
        C0281b c0281b6 = new C0281b(iVar3, "http");
        C0281b c0281b7 = new C0281b(iVar3, "https");
        v1.i iVar4 = C0281b.f3404e;
        C0281b[] c0281bArr = {c0281b, c0281b2, c0281b3, c0281b4, c0281b5, c0281b6, c0281b7, new C0281b(iVar4, "200"), new C0281b(iVar4, "204"), new C0281b(iVar4, "206"), new C0281b(iVar4, "304"), new C0281b(iVar4, "400"), new C0281b(iVar4, "404"), new C0281b(iVar4, "500"), new C0281b("accept-charset", ""), new C0281b("accept-encoding", "gzip, deflate"), new C0281b("accept-language", ""), new C0281b("accept-ranges", ""), new C0281b("accept", ""), new C0281b("access-control-allow-origin", ""), new C0281b("age", ""), new C0281b("allow", ""), new C0281b("authorization", ""), new C0281b("cache-control", ""), new C0281b("content-disposition", ""), new C0281b("content-encoding", ""), new C0281b("content-language", ""), new C0281b("content-length", ""), new C0281b("content-location", ""), new C0281b("content-range", ""), new C0281b("content-type", ""), new C0281b("cookie", ""), new C0281b("date", ""), new C0281b("etag", ""), new C0281b("expect", ""), new C0281b("expires", ""), new C0281b("from", ""), new C0281b("host", ""), new C0281b("if-match", ""), new C0281b("if-modified-since", ""), new C0281b("if-none-match", ""), new C0281b("if-range", ""), new C0281b("if-unmodified-since", ""), new C0281b("last-modified", ""), new C0281b("link", ""), new C0281b("location", ""), new C0281b("max-forwards", ""), new C0281b("proxy-authenticate", ""), new C0281b("proxy-authorization", ""), new C0281b("range", ""), new C0281b("referer", ""), new C0281b("refresh", ""), new C0281b("retry-after", ""), new C0281b("server", ""), new C0281b("set-cookie", ""), new C0281b("strict-transport-security", ""), new C0281b("transfer-encoding", ""), new C0281b("user-agent", ""), new C0281b("vary", ""), new C0281b("via", ""), new C0281b("www-authenticate", "")};
        f3422a = c0281bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0281bArr[i].f3407a)) {
                linkedHashMap.put(c0281bArr[i].f3407a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X0.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f3423b = unmodifiableMap;
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
