package yads;

import android.view.View;

/* loaded from: classes3.dex */
public final class wk3 {
    public final int a;
    public final int b;

    public wk3(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        this.a = width;
        this.b = height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk3)) {
            return false;
        }
        wk3 wk3Var = (wk3) obj;
        return this.a == wk3Var.a && this.b == wk3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
