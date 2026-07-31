package yads;

import java.util.Objects;
import java.util.Set;
import kotlin.collections.SetsKt;

/* loaded from: classes6.dex */
public abstract class hc3 {
    public static final void a(tt3 tt3Var, ho2 ho2Var) {
        String str;
        c a;
        try {
            c a2 = ho2Var.a();
            if (a2 != null) {
                str = a2.a();
                if (str == null) {
                }
                a = ho2Var.a();
                if (a != null || (r2 = a.b()) == null) {
                    Set emptySet = SetsKt.emptySet();
                }
                tt3Var.a(str);
                tt3Var.a(emptySet);
                Objects.toString(emptySet);
                boolean z = ob1.a;
            }
            str = "";
            a = ho2Var.a();
            if (a != null) {
            }
            Set emptySet2 = SetsKt.emptySet();
            tt3Var.a(str);
            tt3Var.a(emptySet2);
            Objects.toString(emptySet2);
            boolean z2 = ob1.a;
        } catch (Throwable th) {
            th.toString();
            boolean z3 = ob1.a;
        }
    }
}
