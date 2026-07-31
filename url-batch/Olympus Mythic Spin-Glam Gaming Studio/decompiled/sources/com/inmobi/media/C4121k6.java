package com.inmobi.media;

/* renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4121k6 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public String k;

    public C4121k6(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4121k6)) {
            return false;
        }
        C4121k6 c4121k6 = (C4121k6) obj;
        return this.a == c4121k6.a && this.b == c4121k6.b && this.c == c4121k6.c && this.d == c4121k6.d && this.e == c4121k6.e && this.f == c4121k6.f && this.g == c4121k6.g && this.h == c4121k6.h && this.i == c4121k6.i && this.j == c4121k6.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((Long.hashCode(this.i) + Ai.a(this.h, Ai.a(this.g, Ai.a(this.f, Ai.a(this.e, (Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.a + ", timeToLiveInSec=" + this.b + ", processingInterval=" + this.c + ", ingestionLatencyInSec=" + this.d + ", minBatchSizeWifi=" + this.e + ", maxBatchSizeWifi=" + this.f + ", minBatchSizeMobile=" + this.g + ", maxBatchSizeMobile=" + this.h + ", retryIntervalWifi=" + this.i + ", retryIntervalMobile=" + this.j + ")";
    }
}
