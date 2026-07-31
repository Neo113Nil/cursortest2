package yads;

import android.content.Context;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class qx1 {
    public final t8 a;
    public final mt1 b;
    public boolean c;
    public boolean d;
    public boolean e;

    public qx1(Context context, t8 t8Var, yu2 yu2Var) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        this.a = t8Var;
        this.b = a;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final void a(String str) {
        fo2 fo2Var = fo2.c;
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("event_type", str));
        this.b.a(new ho2("multibanner_event", MapsKt.toMutableMap(hashMapOf), this.a.i));
    }
}
