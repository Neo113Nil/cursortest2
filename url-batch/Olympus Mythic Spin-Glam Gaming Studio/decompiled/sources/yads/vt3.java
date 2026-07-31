package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes12.dex */
public final class vt3 {
    public final ka2 a;
    public final Object b;
    public final ArrayList c;

    public vt3(Context context) {
        ia2 ia2Var = ka2.g;
        ka2 ka2Var = ka2.i;
        if (ka2Var == null) {
            synchronized (ia2Var) {
                ka2Var = ka2.i;
                if (ka2Var == null) {
                    ka2Var = new ka2(context);
                    ka2.i = ka2Var;
                }
            }
        }
        this.a = ka2Var;
        this.b = new Object();
        this.c = new ArrayList();
    }

    public final void a(wd3 wd3Var) {
        synchronized (this.b) {
            this.c.add(wd3Var);
            this.a.b(wd3Var);
            Unit unit = Unit.INSTANCE;
        }
    }
}
