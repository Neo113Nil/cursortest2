package yads;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class g1 {
    public static final /* synthetic */ KProperty[] m = {ra.a(g1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};
    public final v3 a;
    public final t8 b;
    public final hq0 c;
    public final k8 d;
    public final mt1 e;
    public final oq0 f;
    public final lq0 g;
    public final boolean h;
    public final qm2 i;
    public f1 j;
    public w22 k;
    public long l;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6.J == true) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g1(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, e1 e1Var, hq0 hq0Var) {
        vw2 vw2Var;
        k8 k8Var = new k8();
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        oq0 oq0Var = hq0Var != null ? new oq0(context, v3Var, yu2Var, hq0Var) : null;
        lq0 a2 = kq0.a(context);
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a3 = vw2Var2.a(context);
        boolean z = a3 != null;
        this.a = v3Var;
        this.b = t8Var;
        this.c = hq0Var;
        this.d = k8Var;
        this.e = a;
        this.f = oq0Var;
        this.g = a2;
        this.h = z;
        this.i = new qm2(e1Var);
    }

    public final void a(f1 f1Var) {
        Objects.toString(f1Var);
        boolean z = ob1.a;
        if (this.l == 0 || this.j != f1Var) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        this.e.a(a(f1Var, lc1.a(currentTimeMillis)));
        qm2 qm2Var = this.i;
        KProperty kProperty = m[0];
        e1 e1Var = (e1) qm2Var.a.get();
        if (e1Var != null) {
            e1Var.onReturnedToApplication();
        }
        oq0 oq0Var = this.f;
        if (oq0Var != null) {
            oq0Var.a(currentTimeMillis);
        }
        if (this.h) {
            this.g.a(this.l);
        }
        this.l = 0L;
        this.j = null;
    }

    public final void b(f1 f1Var) {
        Objects.toString(f1Var);
        boolean z = ob1.a;
        this.l = System.currentTimeMillis();
        this.j = f1Var;
        if (f1Var == f1.c && this.h) {
            Map b = a(f1Var, null).b();
            t8 t8Var = this.b;
            this.g.a(new iq0(this.a.a(), this.l, f1Var, this.c, b, t8Var != null ? t8Var.a() : null));
        }
    }

    public final ho2 a(f1 f1Var, String str) {
        io2 a = this.d.a(this.a.e);
        a.b(f1Var.b, "type");
        a.b(this.a.a.b, "ad_type");
        a.b(this.a.c.a, "ad_unit_id");
        a.b(str, "interval");
        w22 w22Var = this.k;
        if (w22Var != null) {
            a = jo2.a(a, w22Var.a());
        }
        fo2 fo2Var = fo2.c;
        Map map = a.a;
        t8 t8Var = this.b;
        return new ho2("returned_to_app", MapsKt.toMutableMap(map), t8Var != null ? t8Var.i : null);
    }
}
