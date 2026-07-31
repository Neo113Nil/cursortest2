package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class J6 extends K6 {
    public final Jl a;

    public J6() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J6) && Intrinsics.areEqual(this.a, ((J6) obj).a);
    }

    public final int hashCode() {
        Jl jl = this.a;
        if (jl == null) {
            return 0;
        }
        return jl.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.a + ")";
    }

    public J6(Jl jl) {
        this.a = jl;
    }
}
