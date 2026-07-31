package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class N2 {
    public final int a;
    public final String b;
    public final Map c;

    public N2(int i, int i2, String str) {
        str = (i2 & 2) != 0 ? null : str;
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return false;
        }
        N2 n2 = (N2) obj;
        return this.a == n2.a && Intrinsics.areEqual(this.b, n2.b) && Intrinsics.areEqual(this.c, n2.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.a + ", eventMessage=" + this.b + ", eventData=" + this.c + ")";
    }

    public N2(int i, String str, Map map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }
}
