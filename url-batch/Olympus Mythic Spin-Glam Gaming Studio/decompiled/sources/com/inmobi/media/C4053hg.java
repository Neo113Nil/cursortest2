package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4053hg {
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final long i;
    public final Long j;
    public final Bi k;

    public C4053hg(String url, String id, Map headers, boolean z, String priority, boolean z2, int i, String ownerId, long j, Long l, Bi bi) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.a = url;
        this.b = id;
        this.c = headers;
        this.d = z;
        this.e = priority;
        this.f = z2;
        this.g = i;
        this.h = ownerId;
        this.i = j;
        this.j = l;
        this.k = bi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4053hg)) {
            return false;
        }
        C4053hg c4053hg = (C4053hg) obj;
        return Intrinsics.areEqual(this.a, c4053hg.a) && Intrinsics.areEqual(this.b, c4053hg.b) && Intrinsics.areEqual(this.c, c4053hg.c) && this.d == c4053hg.d && Intrinsics.areEqual(this.e, c4053hg.e) && this.f == c4053hg.f && this.g == c4053hg.g && Intrinsics.areEqual(this.h, c4053hg.h) && this.i == c4053hg.i && Intrinsics.areEqual(this.j, c4053hg.j) && Intrinsics.areEqual(this.k, c4053hg.k);
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.i) + ((this.h.hashCode() + Ai.a(this.g, (Boolean.hashCode(this.f) + ((this.e.hashCode() + ((Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l = this.j;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Bi bi = this.k;
        return hashCode2 + (bi != null ? bi.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.a + ", id=" + this.b + ", headers=" + this.c + ", allowRedirects=" + this.d + ", priority=" + this.e + ", ackRequired=" + this.f + ", retryCount=" + this.g + ", ownerId=" + this.h + ", createdAt=" + this.i + ", retryAfterTimestamp=" + this.j + ", telemetryData=" + this.k + ")";
    }
}
