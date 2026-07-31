package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4210ng {
    public final C4053hg a;
    public final int b;
    public final String c;
    public final long d;

    public C4210ng(C4053hg ping, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.a = ping;
        this.b = i;
        this.c = str;
        this.d = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4210ng)) {
            return false;
        }
        C4210ng c4210ng = (C4210ng) obj;
        return Intrinsics.areEqual(this.a, c4210ng.a) && this.b == c4210ng.b && Intrinsics.areEqual(this.c, c4210ng.c) && this.d == c4210ng.d;
    }

    public final int hashCode() {
        int a = Ai.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Long.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.a + ", statusCode=" + this.b + ", error=" + this.c + ", timestamp=" + this.d + ")";
    }
}
