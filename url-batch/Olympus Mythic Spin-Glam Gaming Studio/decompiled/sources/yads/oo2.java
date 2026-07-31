package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class oo2 {
    public final jw0 a;
    public final l41 b;
    public final long c;
    public final List d;
    public final tl2 e;

    public oo2(jw0 jw0Var, l41 l41Var, yx2 yx2Var, ArrayList arrayList) {
        if (l41Var.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.a = jw0Var;
        this.b = l41.a(l41Var);
        this.d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.e = yx2Var.a(this);
        this.c = sb3.a(yx2Var.c, 1000000L, yx2Var.b);
    }

    public abstract String c();

    public abstract k30 d();

    public abstract tl2 e();
}
