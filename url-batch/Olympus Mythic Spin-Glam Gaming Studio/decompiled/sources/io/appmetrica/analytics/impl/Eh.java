package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Eh {
    public final long a;
    public final C5848z9 b;
    public final int c;

    public Eh(long j, C5848z9 c5848z9, int i) {
        this.a = j;
        this.b = c5848z9;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Eh)) {
            return false;
        }
        Eh eh = (Eh) obj;
        return this.a == eh.a && Intrinsics.areEqual(this.b, eh.b) && this.c == eh.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "SessionCandidate(sessionId=" + this.a + ", sessionDesc=" + this.b + ", sessionTypeCode=" + this.c + ')';
    }
}
