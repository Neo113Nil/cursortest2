package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes14.dex */
public final class so1 {
    public static final List g = CollectionsKt.listOf((Object[]) new fo2[]{fo2.k, fo2.l});
    public static final List h = CollectionsKt.listOf((Object[]) new fo2[]{fo2.m, fo2.n, fo2.x, fo2.y});
    public final v3 a;
    public final yu2 b;
    public final t8 c;
    public final ro1 d;
    public final yr1 e;
    public final vq2 f;

    public so1(v3 v3Var, yu2 yu2Var, t8 t8Var) {
        ro1 ro1Var = new ro1();
        yr1 yr1Var = new yr1();
        vq2 vq2Var = new vq2();
        this.a = v3Var;
        this.b = yu2Var;
        this.c = t8Var;
        this.d = ro1Var;
        this.e = yr1Var;
        this.f = vq2Var;
    }

    public final void a(Context context, er1 er1Var, Map map) {
        a(context, fo2.e, er1Var, null, map);
    }

    public final void a(Context context, fo2 fo2Var, er1 er1Var, String str, Map map) {
        io2 a;
        ro1 ro1Var = this.d;
        t8 t8Var = this.c;
        v3 v3Var = this.a;
        ro1Var.getClass();
        if ((t8Var != null ? t8Var.m : null) == nz.b) {
            Object obj = t8Var.t;
            a = ro1Var.b.a(v3Var, t8Var, obj instanceof s12 ? (s12) obj : null);
        } else {
            a = ro1Var.a.a(v3Var, t8Var);
        }
        this.e.getClass();
        io2 a2 = jo2.a(a, yr1.a(er1Var));
        a2.a.putAll(map);
        ho2 ho2Var = new ho2(fo2Var, a2.a, a2.b);
        this.b.getClass();
        ud.a(context, new dq3(((nt3) this.b).a)).a(ho2Var);
        new od(context).a(fo2Var, ho2Var.b, str, er1Var.g);
    }
}
