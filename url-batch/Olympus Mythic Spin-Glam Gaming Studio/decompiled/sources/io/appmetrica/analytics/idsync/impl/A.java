package io.appmetrica.analytics.idsync.impl;

import com.facebook.login.LoginLogger;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class A {
    public static final z b;
    public static final A c;
    public static final A d;
    public static final A e;
    public static final /* synthetic */ A[] f;
    public final String a;

    static {
        A a = new A("NONE", 0, "none");
        c = a;
        A a2 = new A("SUCCESS", 1, "success");
        d = a2;
        A a3 = new A("INCOMPATIBLE_PRECONDITION", 2, "incompatible_precondition");
        A a4 = new A("FAILURE", 3, LoginLogger.EVENT_EXTRAS_FAILURE);
        e = a4;
        A[] aArr = {a, a2, a3, a4};
        f = aArr;
        EnumEntriesKt.enumEntries(aArr);
        b = new z();
    }

    public A(String str, int i, String str2) {
        this.a = str2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f.clone();
    }
}
