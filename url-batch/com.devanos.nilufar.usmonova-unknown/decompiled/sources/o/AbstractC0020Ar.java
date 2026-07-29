package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.Ar, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0020Ar {
    public static final C1721pr[] a;
    public static final Map b;

    static {
        C1721pr c1721pr = new C1721pr(C1721pr.i, "");
        C1347k9 c1347k9 = C1721pr.f;
        C1721pr c1721pr2 = new C1721pr(c1347k9, "GET");
        C1721pr c1721pr3 = new C1721pr(c1347k9, "POST");
        C1347k9 c1347k92 = C1721pr.g;
        C1721pr c1721pr4 = new C1721pr(c1347k92, "/");
        C1721pr c1721pr5 = new C1721pr(c1347k92, "/index.html");
        C1347k9 c1347k93 = C1721pr.h;
        C1721pr c1721pr6 = new C1721pr(c1347k93, "http");
        C1721pr c1721pr7 = new C1721pr(c1347k93, "https");
        C1347k9 c1347k94 = C1721pr.e;
        C1721pr[] c1721prArr = {c1721pr, c1721pr2, c1721pr3, c1721pr4, c1721pr5, c1721pr6, c1721pr7, new C1721pr(c1347k94, "200"), new C1721pr(c1347k94, "204"), new C1721pr(c1347k94, "206"), new C1721pr(c1347k94, "304"), new C1721pr(c1347k94, "400"), new C1721pr(c1347k94, "404"), new C1721pr(c1347k94, "500"), new C1721pr("accept-charset", ""), new C1721pr("accept-encoding", "gzip, deflate"), new C1721pr("accept-language", ""), new C1721pr("accept-ranges", ""), new C1721pr("accept", ""), new C1721pr("access-control-allow-origin", ""), new C1721pr("age", ""), new C1721pr("allow", ""), new C1721pr("authorization", ""), new C1721pr("cache-control", ""), new C1721pr("content-disposition", ""), new C1721pr("content-encoding", ""), new C1721pr("content-language", ""), new C1721pr("content-length", ""), new C1721pr("content-location", ""), new C1721pr("content-range", ""), new C1721pr("content-type", ""), new C1721pr("cookie", ""), new C1721pr("date", ""), new C1721pr("etag", ""), new C1721pr("expect", ""), new C1721pr("expires", ""), new C1721pr(Constants.MessagePayloadKeys.FROM, ""), new C1721pr("host", ""), new C1721pr("if-match", ""), new C1721pr("if-modified-since", ""), new C1721pr("if-none-match", ""), new C1721pr("if-range", ""), new C1721pr("if-unmodified-since", ""), new C1721pr("last-modified", ""), new C1721pr("link", ""), new C1721pr("location", ""), new C1721pr("max-forwards", ""), new C1721pr("proxy-authenticate", ""), new C1721pr("proxy-authorization", ""), new C1721pr("range", ""), new C1721pr("referer", ""), new C1721pr("refresh", ""), new C1721pr("retry-after", ""), new C1721pr("server", ""), new C1721pr("set-cookie", ""), new C1721pr("strict-transport-security", ""), new C1721pr("transfer-encoding", ""), new C1721pr("user-agent", ""), new C1721pr("vary", ""), new C1721pr("via", ""), new C1721pr("www-authenticate", "")};
        a = c1721prArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c1721prArr[i].a)) {
                linkedHashMap.put(c1721prArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC0048Bt.m(unmodifiableMap, "unmodifiableMap(result)");
        b = unmodifiableMap;
    }

    public static void a(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "name");
        int b2 = c1347k9.b();
        for (int i = 0; i < b2; i++) {
            byte g = c1347k9.g(i);
            if (65 <= g && g < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c1347k9.o()));
            }
        }
    }
}
