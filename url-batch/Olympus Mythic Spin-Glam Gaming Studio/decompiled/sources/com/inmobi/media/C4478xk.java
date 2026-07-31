package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4478xk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final double g;

    public C4478xk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List priorityEventsList, double d) {
        Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = priorityEventsList;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4478xk)) {
            return false;
        }
        C4478xk c4478xk = (C4478xk) obj;
        return this.a == c4478xk.a && this.b == c4478xk.b && this.c == c4478xk.c && this.d == c4478xk.d && this.e == c4478xk.e && Intrinsics.areEqual(this.f, c4478xk.f) && Double.compare(this.g, c4478xk.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((this.f.hashCode() + ((Boolean.hashCode(this.e) + ((Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.a + ", isImageEnabled=" + this.b + ", isGIFEnabled=" + this.c + ", isVideoEnabled=" + this.d + ", isGeneralEventsDisabled=" + this.e + ", priorityEventsList=" + this.f + ", samplingFactor=" + this.g + ")";
    }
}
