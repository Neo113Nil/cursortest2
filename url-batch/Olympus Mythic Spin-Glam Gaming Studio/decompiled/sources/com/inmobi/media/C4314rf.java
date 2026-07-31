package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4314rf {
    public final Map a;

    public C4314rf(Map requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4314rf) && Intrinsics.areEqual(this.a, ((C4314rf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.a + ")";
    }
}
