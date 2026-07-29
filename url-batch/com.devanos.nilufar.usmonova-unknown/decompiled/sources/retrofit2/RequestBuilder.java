package retrofit2;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.AbstractC0048Bt;
import o.AbstractC0868ct;
import o.AbstractC1888sN;
import o.C0140Fh;
import o.C0867cs;
import o.C0932ds;
import o.C1784qo;
import o.C1787qr;
import o.C1812rD;
import o.C1849ro;
import o.C1852rr;
import o.C1878sD;
import o.C1944tD;
import o.EN;
import o.G8;
import o.HY;
import o.JN;
import o.M8;
import o.NB;

/* loaded from: classes.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final C0932ds baseUrl;

    @Nullable
    private JN body;

    @Nullable
    private NB contentType;

    @Nullable
    private C1784qo formBuilder;
    private final boolean hasBody;
    private final C1787qr headersBuilder;
    private final String method;

    @Nullable
    private C1812rD multipartBuilder;

    @Nullable
    private String relativeUrl;
    private final EN requestBuilder = new EN();

    @Nullable
    private C0867cs urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public static class ContentTypeOverridingRequestBody extends JN {
        private final NB contentType;
        private final JN delegate;

        public ContentTypeOverridingRequestBody(JN jn, NB nb) {
            this.delegate = jn;
            this.contentType = nb;
        }

        @Override // o.JN
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // o.JN
        public NB contentType() {
            return this.contentType;
        }

        @Override // o.JN
        public void writeTo(M8 m8) {
            this.delegate.writeTo(m8);
        }
    }

    public RequestBuilder(String str, C0932ds c0932ds, @Nullable String str2, @Nullable C1852rr c1852rr, @Nullable NB nb, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = c0932ds;
        this.relativeUrl = str2;
        this.contentType = nb;
        this.hasBody = z;
        if (c1852rr != null) {
            this.headersBuilder = c1852rr.l();
        } else {
            this.headersBuilder = new C1787qr();
        }
        if (z2) {
            this.formBuilder = new C1784qo();
            return;
        }
        if (z3) {
            C1812rD c1812rD = new C1812rD();
            this.multipartBuilder = c1812rD;
            NB nb2 = C1944tD.f;
            AbstractC0048Bt.n(nb2, "type");
            if (nb2.b.equals("multipart")) {
                c1812rD.b = nb2;
            } else {
                throw new IllegalArgumentException(("multipart != " + nb2).toString());
            }
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                G8 g8 = new G8();
                g8.T(str, 0, i);
                canonicalizeForPath(g8, str, i, length, z);
                return g8.F();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            C1784qo c1784qo = this.formBuilder;
            c1784qo.getClass();
            AbstractC0048Bt.n(str, "name");
            AbstractC0048Bt.n(str2, "value");
            c1784qo.a.add(C0140Fh.t(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            c1784qo.b.add(C0140Fh.t(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            return;
        }
        C1784qo c1784qo2 = this.formBuilder;
        c1784qo2.getClass();
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "value");
        c1784qo2.a.add(C0140Fh.t(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
        c1784qo2.b.add(C0140Fh.t(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
    }

    public void addHeader(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = NB.d;
                this.contentType = AbstractC0868ct.v(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC1888sN.s("Malformed content type: ", str2), e);
            }
        }
        if (z) {
            this.headersBuilder.c(str, str2);
        } else {
            this.headersBuilder.a(str, str2);
        }
    }

    public void addHeaders(C1852rr c1852rr) {
        C1787qr c1787qr = this.headersBuilder;
        c1787qr.getClass();
        AbstractC0048Bt.n(c1852rr, "headers");
        int size = c1852rr.size();
        for (int i = 0; i < size; i++) {
            c1787qr.b(c1852rr.k(i), c1852rr.m(i));
        }
    }

    public void addPart(C1852rr c1852rr, JN jn) {
        C1812rD c1812rD = this.multipartBuilder;
        c1812rD.getClass();
        AbstractC0048Bt.n(jn, "body");
        if ((c1852rr != null ? c1852rr.j("Content-Type") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if ((c1852rr != null ? c1852rr.j("Content-Length") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        c1812rD.c.add(new C1878sD(c1852rr, jn));
    }

    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String canonicalizeForPath = canonicalizeForPath(str2, z);
        String replace = this.relativeUrl.replace("{" + str + "}", canonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(replace).matches()) {
            throw new IllegalArgumentException(AbstractC1888sN.s("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.relativeUrl = replace;
    }

    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            C0867cs f = this.baseUrl.f(str3);
            this.urlBuilder = f;
            if (f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z) {
            C0867cs c0867cs = this.urlBuilder;
            c0867cs.getClass();
            AbstractC0048Bt.n(str, "encodedName");
            if (c0867cs.g == null) {
                c0867cs.g = new ArrayList();
            }
            ArrayList arrayList = c0867cs.g;
            AbstractC0048Bt.k(arrayList);
            arrayList.add(C0140Fh.t(str, 0, 0, " \"'<>#&=", 211));
            ArrayList arrayList2 = c0867cs.g;
            AbstractC0048Bt.k(arrayList2);
            arrayList2.add(str2 != null ? C0140Fh.t(str2, 0, 0, " \"'<>#&=", 211) : null);
            return;
        }
        C0867cs c0867cs2 = this.urlBuilder;
        c0867cs2.getClass();
        AbstractC0048Bt.n(str, "name");
        if (c0867cs2.g == null) {
            c0867cs2.g = new ArrayList();
        }
        ArrayList arrayList3 = c0867cs2.g;
        AbstractC0048Bt.k(arrayList3);
        arrayList3.add(C0140Fh.t(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
        ArrayList arrayList4 = c0867cs2.g;
        AbstractC0048Bt.k(arrayList4);
        arrayList4.add(str2 != null ? C0140Fh.t(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
    }

    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.d(cls, t);
    }

    public EN get() {
        C0932ds a;
        C0867cs c0867cs = this.urlBuilder;
        if (c0867cs != null) {
            a = c0867cs.a();
        } else {
            C0932ds c0932ds = this.baseUrl;
            String str = this.relativeUrl;
            c0932ds.getClass();
            AbstractC0048Bt.n(str, "link");
            C0867cs f = c0932ds.f(str);
            a = f != null ? f.a() : null;
            if (a == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        JN jn = this.body;
        if (jn == null) {
            C1784qo c1784qo = this.formBuilder;
            if (c1784qo != null) {
                jn = new C1849ro(c1784qo.a, c1784qo.b);
            } else {
                C1812rD c1812rD = this.multipartBuilder;
                if (c1812rD != null) {
                    ArrayList arrayList = c1812rD.c;
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    jn = new C1944tD(c1812rD.a, c1812rD.b, HY.v(arrayList));
                } else if (this.hasBody) {
                    jn = JN.create((NB) null, new byte[0]);
                }
            }
        }
        NB nb = this.contentType;
        if (nb != null) {
            if (jn != null) {
                jn = new ContentTypeOverridingRequestBody(jn, nb);
            } else {
                this.headersBuilder.a("Content-Type", nb.a);
            }
        }
        EN en = this.requestBuilder;
        en.getClass();
        en.a = a;
        en.c = this.headersBuilder.d().l();
        en.c(this.method, jn);
        return en;
    }

    public void setBody(JN jn) {
        this.body = jn;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(C1878sD c1878sD) {
        C1812rD c1812rD = this.multipartBuilder;
        c1812rD.getClass();
        AbstractC0048Bt.n(c1878sD, "part");
        c1812rD.c.add(c1878sD);
    }

    private static void canonicalizeForPath(G8 g8, String str, int i, int i2, boolean z) {
        G8 g82 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    g8.U(codePointAt);
                } else {
                    if (g82 == null) {
                        g82 = new G8();
                    }
                    g82.U(codePointAt);
                    while (!g82.m()) {
                        byte readByte = g82.readByte();
                        g8.N(37);
                        char[] cArr = HEX_DIGITS;
                        g8.N(cArr[((readByte & 255) >> 4) & 15]);
                        g8.N(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
