package com.ogury.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final boolean b;

    public a(String id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.a = id;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdInfo(id=" + this.a + ", isLimitAdTrackingEnabled=" + this.b + ")";
    }
}
