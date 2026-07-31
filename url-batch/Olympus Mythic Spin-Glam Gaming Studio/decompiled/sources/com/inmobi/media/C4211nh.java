package com.inmobi.media;

/* renamed from: com.inmobi.media.nh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4211nh {
    public int a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4211nh)) {
            return false;
        }
        C4211nh c4211nh = (C4211nh) obj;
        return this.a == c4211nh.a && this.b == c4211nh.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.a + ", noOfSubscriptions=" + this.b + ")";
    }
}
