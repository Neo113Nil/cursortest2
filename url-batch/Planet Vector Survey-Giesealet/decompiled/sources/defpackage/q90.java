package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q90 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(p90 p90Var) {
        p90Var.getClass();
        String x = d31.x(p90Var.getClass());
        if (x.length() <= 0) {
            g8.r("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        p90 p90Var2 = (p90) linkedHashMap.get(x);
        if (nz.l(p90Var2, p90Var)) {
            return;
        }
        if (p90Var2 != null && p90Var2.b) {
            g8.p("Navigator ", p90Var, " is replacing an already attached ", p90Var2);
        } else if (p90Var.b) {
            g8.h("Navigator ", p90Var, " is already attached to another NavController");
        }
    }

    public final p90 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            g8.r("navigator name cannot be an empty string");
            return null;
        }
        p90 p90Var = (p90) this.a.get(str);
        if (p90Var != null) {
            return p90Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
