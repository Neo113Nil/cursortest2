package com.inmobi.media;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Pf {
    public final String a;
    public final Set b;

    public Pf(String appVersion, Set reportedEvents) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(reportedEvents, "reportedEvents");
        this.a = appVersion;
        this.b = reportedEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pf)) {
            return false;
        }
        Pf pf = (Pf) obj;
        return Intrinsics.areEqual(this.a, pf.a) && Intrinsics.areEqual(this.b, pf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReporterState(appVersion=" + this.a + ", reportedEvents=" + this.b + ")";
    }
}
