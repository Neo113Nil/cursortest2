package com.amazon.a.a.n.a.a;

/* compiled from: MalformedResponseException.java */
/* loaded from: classes3.dex */
public class g extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f558a = "EMPTY";
    public static final String b = "MISSING_FIELD";
    private static final long c = 1;

    private g(String str, String str2) {
        super("MALFORMED_RESPONSE", str, str2);
    }

    public static final g d() {
        return new g(f558a, null);
    }

    public static final g a(String str) {
        return new g(b, str);
    }
}
