package yads;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m21 {
    public final String a;
    public final Bitmap b;

    public m21(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m21)) {
            return false;
        }
        m21 m21Var = (m21) obj;
        return Intrinsics.areEqual(this.a, m21Var.a) && Intrinsics.areEqual(this.b, m21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.a + ", bitmap=" + this.b + ")";
    }
}
