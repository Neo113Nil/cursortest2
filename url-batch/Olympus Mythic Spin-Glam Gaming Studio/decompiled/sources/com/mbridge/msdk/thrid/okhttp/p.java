package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FormBody.java */
/* loaded from: classes13.dex */
public final class p extends z {
    private static final u c = u.a("application/x-www-form-urlencoded");
    private final List<String> a;
    private final List<String> b;

    /* compiled from: FormBody.java */
    public static final class a {
        private final List<String> a;
        private final List<String> b;
        private final Charset c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
            this.b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
            return this;
        }

        public a(Charset charset) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = charset;
        }

        public p a() {
            return new p(this.a, this.b);
        }
    }

    p(List<String> list, List<String> list2) {
        this.a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z) {
        com.mbridge.msdk.thrid.okio.c a2;
        if (z) {
            a2 = new com.mbridge.msdk.thrid.okio.c();
        } else {
            a2 = dVar.a();
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a2.writeByte(38);
            }
            a2.a(this.a.get(i));
            a2.writeByte(61);
            a2.a(this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = a2.size();
        a2.k();
        return size2;
    }
}
