package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class a1 {
    public final mt1 a;
    public final v3 b;
    public final t8 c;
    public final lx d;

    public a1(mt1 mt1Var, v3 v3Var, t8 t8Var) {
        lx lxVar = new lx();
        this.a = mt1Var;
        this.b = v3Var;
        this.c = t8Var;
        this.d = lxVar;
    }

    public final void a() {
        a("on_pause");
    }

    public final void b() {
        a("on_resume");
    }

    public final void a(String str) {
        Object obj;
        io2 a = this.d.a(this.b, this.c);
        wf2 wf2Var = (wf2) yf2.a.getValue();
        if (wf2Var != null) {
            int ordinal = wf2Var.ordinal();
            if (ordinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (ordinal == 1) {
                obj = "react-native";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = "unity";
            }
        } else {
            obj = a.a.get("plugin_type");
        }
        fo2 fo2Var = fo2.c;
        Map plus = MapsKt.plus(a.a, MapsKt.mapOf(TuplesKt.to("activity_event", str), TuplesKt.to("plugin_type", obj)));
        this.a.a(new ho2("activity_action", MapsKt.toMutableMap(plus), a.b));
    }
}
