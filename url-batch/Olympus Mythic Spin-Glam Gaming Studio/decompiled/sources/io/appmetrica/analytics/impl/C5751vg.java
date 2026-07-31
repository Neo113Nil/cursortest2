package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5751vg {
    public final String a;
    public final long b;
    public final long c;
    public final int d;

    public C5751vg(byte[] bArr) {
        C5777wg a = C5777wg.a(bArr);
        this.a = a.a;
        this.b = a.c;
        this.c = a.b;
        this.d = a(a.d);
    }

    public static int a(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5751vg.class != obj.getClass()) {
            return false;
        }
        C5751vg c5751vg = (C5751vg) obj;
        return this.b == c5751vg.b && this.c == c5751vg.c && this.a.equals(c5751vg.a) && this.d == c5751vg.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return AbstractC5251c8.a(this.d) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + AbstractC5725ug.b(this.d) + '}';
    }

    public final byte[] a() {
        C5777wg c5777wg = new C5777wg();
        c5777wg.a = this.a;
        c5777wg.c = this.b;
        c5777wg.b = this.c;
        int a = AbstractC5251c8.a(this.d);
        int i = 1;
        if (a != 1) {
            i = 2;
            if (a != 2) {
                i = 0;
            }
        }
        c5777wg.d = i;
        return MessageNano.toByteArray(c5777wg);
    }

    public C5751vg(String str, long j, long j2, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
    }
}
