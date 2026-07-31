package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4379u1 {
    public final Map a;
    public final C4406v1 b;

    public C4379u1(Map map, C4406v1 c4406v1) {
        this.a = map;
        this.b = c4406v1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4379u1)) {
            return false;
        }
        C4379u1 c4379u1 = (C4379u1) obj;
        return Intrinsics.areEqual(this.a, c4379u1.a) && Intrinsics.areEqual(this.b, c4379u1.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        C4406v1 c4406v1 = this.b;
        return hashCode + (c4406v1 != null ? c4406v1.hashCode() : 0);
    }

    public final String toString() {
        return "BannerLoadResolution(extras=" + this.a + ", adaptiveSize=" + this.b + ")";
    }
}
