package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2070v7 {
    public final String a;
    public final Integer b;
    public final C1780qk c;
    public final long d;
    public final long e;
    public final Map f;

    public C2070v7(String str, Integer num, C1780qk c1780qk, long j, long j2, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = c1780qk;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C1343k5 c() {
        C1343k5 c1343k5 = new C1343k5();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c1343k5.h = str;
        c1343k5.i = this.b;
        C1780qk c1780qk = this.c;
        if (c1780qk == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c1343k5.j = c1780qk;
        c1343k5.k = Long.valueOf(this.d);
        c1343k5.l = Long.valueOf(this.e);
        c1343k5.m = new HashMap(this.f);
        return c1343k5;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2070v7) {
            C2070v7 c2070v7 = (C2070v7) obj;
            String str = c2070v7.a;
            Integer num2 = c2070v7.b;
            if (this.a.equals(str) && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c.equals(c2070v7.c) && this.d == c2070v7.d && this.e == c2070v7.e && this.f.equals(c2070v7.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
