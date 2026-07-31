package yads;

import android.content.Context;
import com.ironsource.X3;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al3 {
    public final k8 a;
    public final mt1 b;
    public final lb2 c;

    public al3(Context context, yu2 yu2Var) {
        k8 k8Var = new k8();
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        lb2 lb2Var = new lb2();
        this.a = k8Var;
        this.b = a;
        this.c = lb2Var;
    }

    public final void a(yk3 yk3Var, v3 v3Var) {
        k03 b;
        d8 d8Var = v3Var.e;
        io2 a = d8Var != null ? this.a.a(d8Var) : new io2((Map) null, 3);
        d8 d8Var2 = v3Var.e;
        if (d8Var2 != null) {
            jo2.a(a, this.a.a(d8Var2));
        }
        a.b(v3Var.c.a, "ad_unit_id");
        lb2 lb2Var = this.c;
        int i = v3Var.n;
        lb2Var.getClass();
        a.b(i != 1 ? i != 2 ? "undefined" : "landscape" : "portrait", X3.i.n);
        l03 l03Var = v3Var.d.a;
        a.a((l03Var == null || (b = l03Var.b()) == null) ? null : b.b, "size_type");
        l03 l03Var2 = v3Var.d.a;
        a.a(l03Var2 != null ? Integer.valueOf(l03Var2.getWidth()) : null, "size_info_width");
        l03 l03Var3 = v3Var.d.a;
        a.a(l03Var3 != null ? Integer.valueOf(l03Var3.getHeight()) : null, "size_info_height");
        a.b(Integer.valueOf(yk3Var.a.a), "view_width");
        a.b(Integer.valueOf(yk3Var.a.b), "view_height");
        a.a(yk3Var.b.a, "layout_width");
        a.a(yk3Var.b.b, "layout_height");
        a.b(Integer.valueOf(yk3Var.c.a.a), "measured_width");
        String name = yk3Var.c.a.b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        a.b(lowerCase, "measured_width_mode");
        a.b(Integer.valueOf(yk3Var.c.b.a), "measured_height");
        String lowerCase2 = yk3Var.c.b.b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        a.b(lowerCase2, "measured_height_mode");
        fo2 fo2Var = fo2.c;
        this.b.a(new ho2("ad_view_size_info", MapsKt.toMutableMap(a.a), a.b));
    }
}
