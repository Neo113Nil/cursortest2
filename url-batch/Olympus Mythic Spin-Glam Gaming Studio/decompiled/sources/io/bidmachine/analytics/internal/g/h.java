package io.bidmachine.analytics.internal.g;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class h {
    private final String a;
    private final a b;
    private final String c;

    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public h(String str, a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final a c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.a, hVar.a) && this.b == hVar.b && Intrinsics.areEqual(this.c, hVar.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TrackerError(name=" + this.a + ", type=" + this.b + ", reason=" + this.c + ')';
    }

    public /* synthetic */ h(String str, a aVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, (i & 4) != 0 ? "" : str2);
    }
}
