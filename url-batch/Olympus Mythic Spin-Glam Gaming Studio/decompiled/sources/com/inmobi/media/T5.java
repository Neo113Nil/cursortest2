package com.inmobi.media;

/* loaded from: classes13.dex */
public final class T5 {
    public final int a;
    public final int b;
    public final float c;

    public T5(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T5)) {
            return false;
        }
        T5 t5 = (T5) obj;
        return this.a == t5.a && this.b == t5.b && Float.compare(this.c, t5.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + Ai.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.a + ", height=" + this.b + ", density=" + this.c + ")";
    }
}
