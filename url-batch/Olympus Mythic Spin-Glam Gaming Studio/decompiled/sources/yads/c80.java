package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$string;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes15.dex */
public final class c80 {
    public final Context a;
    public final sq1 b;
    public final ur1 c;

    public c80(Context context, sq1 sq1Var, ur1 ur1Var) {
        this.a = context;
        this.b = sq1Var;
        this.c = ur1Var;
    }

    public final void a(List list, g50 g50Var) {
        k90 k90Var;
        if (g50Var.a() instanceof e50) {
            k90Var = new k90(this.a.getString(R$string.debug_panel_not_integrated), 0, null, 0, 14);
        } else {
            String f = g50Var.f();
            if (f == null || StringsKt.isBlank(f)) {
                k90Var = new k90(this.a.getString(R$string.debug_panel_sdk_undefined), 0, null, 0, 14);
            } else {
                String lowerCase = g50Var.f().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                k90Var = new k90("SDK " + lowerCase, 0, null, 0, 14);
            }
        }
        k90 k90Var2 = k90Var;
        f50 a = g50Var.a();
        sr1 sr1Var = (a instanceof d50 ? (d50) a : null) != null ? sr1.b : null;
        StringBuilder sb = new StringBuilder();
        if (g50Var.b() != null) {
            sb.append("Adapter " + g50Var.b() + "  ");
        }
        if (g50Var.c() != null) {
            sb.append("Latest " + g50Var.c());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String b = g50Var.b();
        list.add(new la0(g50Var.e(), g50Var.d(), k90Var2, new v50((b == null || StringsKt.isBlank(b) || this.b.a(g50Var.b(), g50Var.c())) ? R$attr.debug_panel_label_secondary : R$attr.debug_panel_color_orange, sb2), this.c.a(sr1Var), null, null, null, null, null, g50Var.f(), 992));
    }

    public final k90 a(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return new k90(this.a.getString(R$string.debug_panel_yes), 0, null, 0, 14);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return new k90(this.a.getString(R$string.debug_panel_no), 0, null, 0, 14);
        }
        if (bool == null) {
            return new k90(this.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
