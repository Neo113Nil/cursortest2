package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4093j4 extends AbstractC4461x4 {
    public final String a;
    public final int b;
    public final long c;

    public C4093j4(int i, long j, String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        this.a = configType;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4093j4)) {
            return false;
        }
        C4093j4 c4093j4 = (C4093j4) obj;
        return Intrinsics.areEqual(this.a, c4093j4.a) && this.b == c4093j4.b && this.c == c4093j4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + Ai.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.a + ", errorCode=" + this.b + ", lastUpdatedTimestamp=" + this.c + ")";
    }
}
