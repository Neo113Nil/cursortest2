package com.inmobi.media;

/* renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4406v1 {
    public final int a;
    public final int b;

    public C4406v1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4406v1)) {
            return false;
        }
        C4406v1 c4406v1 = (C4406v1) obj;
        return this.a == c4406v1.a && this.b == c4406v1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BannerSize(widthDp=" + this.a + ", heightDp=" + this.b + ")";
    }
}
