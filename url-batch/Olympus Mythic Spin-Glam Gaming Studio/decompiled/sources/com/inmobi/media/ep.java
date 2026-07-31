package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ep extends H2 {
    public final Map a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public /* synthetic */ ep(Map map, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? CollectionsKt.emptyList() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return Intrinsics.areEqual(this.a, epVar.a) && Intrinsics.areEqual(this.b, epVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.a + ", trackers=" + this.b + ")";
    }

    public ep(Map macros, List trackers) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = macros;
        this.b = trackers;
    }
}
