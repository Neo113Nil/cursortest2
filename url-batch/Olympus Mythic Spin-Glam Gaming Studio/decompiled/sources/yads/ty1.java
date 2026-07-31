package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class ty1 {
    public final mt1 a;
    public final hi b;

    public ty1(Context context, yu2 yu2Var, c5 c5Var, e00 e00Var, String str) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        hi hiVar = new hi(c5Var, e00Var, str);
        this.a = a;
        this.b = hiVar;
    }

    public final void a(ArrayList arrayList, fo2 fo2Var) {
        io2 a = this.b.a();
        a.b(arrayList, "assets");
        Map map = a.a;
        this.a.a(new ho2(fo2Var.b, MapsKt.toMutableMap(map), a.b));
    }
}
