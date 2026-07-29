package o;

import java.util.ArrayList;

/* renamed from: o.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2268y7 extends AbstractC0955eB {
    public final long a;
    public final long b;
    public final C1872s7 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public C2268y7(long j, long j2, C1872s7 c1872s7, Integer num, String str, ArrayList arrayList) {
        EnumC1689pL enumC1689pL = EnumC1689pL.h;
        this.a = j;
        this.b = j2;
        this.c = c1872s7;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0955eB)) {
            return false;
        }
        C2268y7 c2268y7 = (C2268y7) ((AbstractC0955eB) obj);
        if (this.a != c2268y7.a) {
            return false;
        }
        c2268y7.getClass();
        Object obj2 = EnumC1689pL.h;
        ArrayList arrayList = c2268y7.f;
        String str = c2268y7.e;
        Integer num = c2268y7.d;
        C1872s7 c1872s7 = c2268y7.c;
        if (this.b != c2268y7.b || !this.c.equals(c1872s7)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ EnumC1689pL.h.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + EnumC1689pL.h + "}";
    }
}
