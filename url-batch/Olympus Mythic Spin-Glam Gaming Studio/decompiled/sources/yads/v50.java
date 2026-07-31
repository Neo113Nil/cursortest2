package yads;

import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v50 {
    public final String a;
    public final int b;
    public final int c;

    public v50(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return Intrinsics.areEqual(this.a, v50Var.a) && this.b == v50Var.b && this.c == v50Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + yd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.a + ", color=" + this.b + ", style=" + this.c + ")";
    }

    public v50(int i, String str) {
        int i2 = R$style.DebugPanelText_Body2;
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
