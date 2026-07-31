package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: SignedToken.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f598a = ",";
    public static final String b = "=";
    public static final String c = "|";
    private static final com.amazon.a.a.o.c d = new com.amazon.a.a.o.c("SignedToken");
    private final Map<String, String> e = new HashMap();

    public f(String str, PublicKey publicKey) throws com.amazon.a.a.o.b.a.b, com.amazon.a.a.o.b.a.c {
        String b2 = b(str);
        int lastIndexOf = b2.lastIndexOf(c);
        if (lastIndexOf == -1) {
            throw com.amazon.a.a.o.b.a.b.d();
        }
        String substring = b2.substring(0, lastIndexOf);
        String substring2 = b2.substring(lastIndexOf + 1);
        if (com.amazon.a.a.o.c.f599a) {
            com.amazon.a.a.o.c cVar = d;
            cVar.a("Token data: " + substring);
            cVar.a("Signature: " + substring2);
        }
        a(substring, substring2, publicKey);
        c(substring);
    }

    private String b(String str) throws com.amazon.a.a.o.b.a.b {
        try {
            return new String(com.amazon.c.a.a.c.c(str.getBytes()));
        } catch (IOException e) {
            throw com.amazon.a.a.o.b.a.b.a((Throwable) e);
        }
    }

    private void a(String str, String str2, PublicKey publicKey) throws com.amazon.a.a.o.b.a.c {
        if (!e.a(str, str2, publicKey)) {
            throw new com.amazon.a.a.o.b.a.c();
        }
    }

    private void c(String str) throws com.amazon.a.a.o.b.a.b {
        StringTokenizer stringTokenizer = new StringTokenizer(str, f598a);
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            com.amazon.a.a.o.c cVar = d;
            cVar.a("Field: " + nextToken);
            int indexOf = nextToken.indexOf(b);
            if (indexOf == -1) {
                throw com.amazon.a.a.o.b.a.b.d();
            }
            String substring = nextToken.substring(0, indexOf);
            String substring2 = nextToken.substring(indexOf + 1);
            cVar.a("FieldName: " + substring);
            cVar.a("FieldValue: " + substring2);
            this.e.put(substring, substring2);
        }
    }

    public String a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, "key");
        return this.e.get(str);
    }

    public String toString() {
        return "Signed Token: " + this.e;
    }
}
