package com.ogury.ad.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v2 implements Serializable {
    public final hh a;
    public final hh b;

    public v2(hh hhVar) {
        this.a = hhVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.areEqual(this.a, v2Var.a) && Intrinsics.areEqual(this.b, v2Var.b);
    }

    public final int hashCode() {
        hh hhVar = this.a;
        int hashCode = (hhVar == null ? 0 : hhVar.hashCode()) * 31;
        hh hhVar2 = this.b;
        return hashCode + (hhVar2 != null ? hhVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EventBanner(requestedSize=" + this.a + ", creativeSize=" + this.b + ")";
    }

    public v2(hh hhVar, hh hhVar2) {
        this.a = hhVar;
        this.b = hhVar2;
    }
}
