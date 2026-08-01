package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j50 {
    public final mf a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public j50(mf mfVar) {
        this.a = mfVar;
    }

    public final void a() {
        this.b.remove((Object) null);
        i50 i50Var = (i50) this.c.remove(null);
        if (i50Var != null) {
            i50Var.a.b(i50Var.b);
            i50Var.b = null;
        }
        this.a.run();
    }
}
