package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class L {
    public final M a;
    public final M b;
    public final M c;

    public L(M m, M m2, M m3) {
        this.a = m;
        this.b = m2;
        this.c = m3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(L.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        L l = (L) obj;
        return this.a == l.a && this.b == l.b && this.c == l.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + this.a + ", canTrackHoaid=" + this.b + ", canTrackYandexAdvId=" + this.c + ')';
    }
}
