package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4173m6 {
    public final ArrayList a;
    public final String b;

    public C4173m6(String payload, ArrayList eventIDs) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.a = eventIDs;
        this.b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4173m6)) {
            return false;
        }
        C4173m6 c4173m6 = (C4173m6) obj;
        return Intrinsics.areEqual(this.a, c4173m6.a) && Intrinsics.areEqual(this.b, c4173m6.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.a + ", payload=" + this.b + ", shouldFlushOnFailure=false)";
    }
}
