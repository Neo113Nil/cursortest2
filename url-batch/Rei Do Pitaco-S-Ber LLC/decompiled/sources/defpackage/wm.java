package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class wm {
    public static final mm[] a;
    public static final Map b;

    static {
        mm mmVar = new mm(mm.i, "");
        r8 r8Var = mm.f;
        mm mmVar2 = new mm(r8Var, "GET");
        mm mmVar3 = new mm(r8Var, "POST");
        r8 r8Var2 = mm.g;
        mm mmVar4 = new mm(r8Var2, "/");
        mm mmVar5 = new mm(r8Var2, "/index.html");
        r8 r8Var3 = mm.h;
        mm mmVar6 = new mm(r8Var3, "http");
        mm mmVar7 = new mm(r8Var3, "https");
        r8 r8Var4 = mm.e;
        mm[] mmVarArr = {mmVar, mmVar2, mmVar3, mmVar4, mmVar5, mmVar6, mmVar7, new mm(r8Var4, "200"), new mm(r8Var4, "204"), new mm(r8Var4, "206"), new mm(r8Var4, "304"), new mm(r8Var4, "400"), new mm(r8Var4, "404"), new mm(r8Var4, "500"), new mm("accept-charset", ""), new mm("accept-encoding", "gzip, deflate"), new mm("accept-language", ""), new mm("accept-ranges", ""), new mm("accept", ""), new mm("access-control-allow-origin", ""), new mm("age", ""), new mm("allow", ""), new mm("authorization", ""), new mm("cache-control", ""), new mm("content-disposition", ""), new mm("content-encoding", ""), new mm("content-language", ""), new mm("content-length", ""), new mm("content-location", ""), new mm("content-range", ""), new mm("content-type", ""), new mm("cookie", ""), new mm("date", ""), new mm("etag", ""), new mm("expect", ""), new mm("expires", ""), new mm("from", ""), new mm("host", ""), new mm("if-match", ""), new mm("if-modified-since", ""), new mm("if-none-match", ""), new mm("if-range", ""), new mm("if-unmodified-since", ""), new mm("last-modified", ""), new mm("link", ""), new mm("location", ""), new mm("max-forwards", ""), new mm("proxy-authenticate", ""), new mm("proxy-authorization", ""), new mm("range", ""), new mm("referer", ""), new mm("refresh", ""), new mm("retry-after", ""), new mm("server", ""), new mm("set-cookie", ""), new mm("strict-transport-security", ""), new mm("transfer-encoding", ""), new mm("user-agent", ""), new mm("vary", ""), new mm("via", ""), new mm("www-authenticate", "")};
        a = mmVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(mmVarArr[i].a)) {
                linkedHashMap.put(mmVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(r8 r8Var) {
        r8Var.getClass();
        int a2 = r8Var.a();
        for (int i = 0; i < a2; i++) {
            byte d = r8Var.d(i);
            if (65 <= d && d < 91) {
                l8.y("PROTOCOL_ERROR response malformed: mixed case name: ".concat(r8Var.h()));
                return;
            }
        }
    }
}
