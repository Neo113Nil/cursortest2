package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class gp3 {
    public final v3 a;
    public final yu2 b;
    public final bd3 c;
    public final pg3 d;
    public final i5 e;
    public final Context f;
    public int g;

    public gp3(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var, bd3 bd3Var, pg3 pg3Var) {
        this.a = v3Var;
        this.b = yu2Var;
        this.c = bd3Var;
        this.d = pg3Var;
        this.e = i5Var;
        this.f = context.getApplicationContext();
    }

    public final void a(Context context, List list, bh3 bh3Var, Object obj) {
        int i = this.g + 1;
        this.g = i;
        if (i > 5) {
            bh3Var.a();
            return;
        }
        ip3 ip3Var = new ip3(this.f, this.a, this.e, this.b, this.c, this.d);
        if (list.isEmpty()) {
            bh3Var.onSuccess(ip3Var.c);
            return;
        }
        ip3Var.d = bh3Var;
        ip3Var.a.a(h5.x, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe3 fe3Var = (fe3) it.next();
            ip3Var.e++;
            dp3 dp3Var = ip3Var.b;
            hp3 hp3Var = new hp3(ip3Var, list);
            dp3Var.getClass();
            ep3 ep3Var = new ep3(context, fe3Var, hp3Var);
            cf3 cf3Var = dp3Var.e;
            yu2 yu2Var = dp3Var.b;
            v3 v3Var = dp3Var.a;
            bd3 bd3Var = dp3Var.c;
            pg3 pg3Var = dp3Var.d;
            cf3Var.getClass();
            kd3 kd3Var = new kd3();
            String str = fe3Var.i;
            if (str == null) {
                str = "";
            }
            Uri parse = Uri.parse(str);
            String uri = CollectionsKt.contains((List) ue3.a.getValue(), parse.getHost()) ? ql2.a(parse, new jd3(kd3Var, bd3Var, v3Var, context)).toString() : str;
            np3 np3Var = new np3(pg3Var);
            qm3 qm3Var = new qm3(ep3Var);
            Context context2 = ((nt3) yu2Var).a;
            od3 od3Var = new od3(context, v3Var, pr.a(context2, context2), uri, qm3Var, fe3Var, np3Var);
            od3Var.q = obj;
            cf3Var.a.a(od3Var);
            ip3Var = ip3Var;
        }
    }
}
