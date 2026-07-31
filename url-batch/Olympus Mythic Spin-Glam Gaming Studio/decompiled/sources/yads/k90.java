package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k90 {
    public final String a;
    public final int b;
    public final Integer c;
    public final int d;

    public k90(String str, int i, Integer num, int i2, int i3) {
        i = (i3 & 2) != 0 ? R$attr.debug_panel_label_primary : i;
        num = (i3 & 4) != 0 ? null : num;
        i2 = (i3 & 8) != 0 ? R$style.DebugPanelText_Body1 : i2;
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return Intrinsics.areEqual(this.a, k90Var.a) && this.b == k90Var.b && Intrinsics.areEqual(this.c, k90Var.c) && this.d == k90Var.d;
    }

    public final int hashCode() {
        int a = yd3.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.a + ", color=" + this.b + ", icon=" + this.c + ", style=" + this.d + ")";
    }
}
