package o;

import java.util.Arrays;

/* renamed from: o.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2202x7 extends AbstractC0759bB {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final AbstractC1879sE g;

    public C2202x7(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC1879sE abstractC1879sE) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = abstractC1879sE;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC1879sE abstractC1879sE;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0759bB) {
            AbstractC0759bB abstractC0759bB = (AbstractC0759bB) obj;
            if (this.a == ((C2202x7) abstractC0759bB).a && ((num = this.b) != null ? num.equals(((C2202x7) abstractC0759bB).b) : ((C2202x7) abstractC0759bB).b == null)) {
                C2202x7 c2202x7 = (C2202x7) abstractC0759bB;
                AbstractC1879sE abstractC1879sE2 = c2202x7.g;
                String str2 = c2202x7.e;
                if (this.c == c2202x7.c) {
                    if (Arrays.equals(this.d, abstractC0759bB instanceof C2202x7 ? ((C2202x7) abstractC0759bB).d : c2202x7.d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f == c2202x7.f && ((abstractC1879sE = this.g) != null ? abstractC1879sE.equals(abstractC1879sE2) : abstractC1879sE2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC1879sE abstractC1879sE = this.g;
        return i2 ^ (abstractC1879sE != null ? abstractC1879sE.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
