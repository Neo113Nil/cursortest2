package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5181a {
    public final List a;
    public final boolean b;

    public C5181a(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5181a)) {
            return false;
        }
        C5181a c5181a = (C5181a) obj;
        return Intrinsics.areEqual(this.a, c5181a.a) && this.b == c5181a.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.a + ", firstInappCheckOccurred=" + this.b + ')';
    }
}
