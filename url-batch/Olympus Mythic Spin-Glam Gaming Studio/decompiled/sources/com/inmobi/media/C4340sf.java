package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4340sf {
    public final String a;
    public final String b;

    public C4340sf(String hyperId, String spHost) {
        Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        Intrinsics.checkNotNullParameter("i6i", "sspId");
        Intrinsics.checkNotNullParameter(spHost, "spHost");
        Intrinsics.checkNotNullParameter("inmobi", "pubId");
        this.a = hyperId;
        this.b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4340sf)) {
            return false;
        }
        C4340sf c4340sf = (C4340sf) obj;
        return Intrinsics.areEqual(this.a, c4340sf.a) && Intrinsics.areEqual("i6i", "i6i") && Intrinsics.areEqual(this.b, c4340sf.b) && Intrinsics.areEqual("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (((this.a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.a + ", sspId=i6i, spHost=" + this.b + ", pubId=inmobi)";
    }
}
