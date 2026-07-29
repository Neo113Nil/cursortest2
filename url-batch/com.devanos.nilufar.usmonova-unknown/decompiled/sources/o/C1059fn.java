package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059fn {
    public final ArrayList a = new ArrayList();

    public C1059fn(AbstractActivityC0560Vm abstractActivityC0560Vm, String[] strArr) {
        C1717pn c1717pn = (C1717pn) C0950e6.D().i;
        if (c1717pn.a) {
            return;
        }
        c1717pn.c(abstractActivityC0560Vm.getApplicationContext());
        c1717pn.a(abstractActivityC0560Vm.getApplicationContext(), strArr);
    }

    public final C0862cn a(C0584Wk c0584Wk) {
        C0862cn c0862cn;
        Context context = (Context) c0584Wk.c;
        C1117gf c1117gf = (C1117gf) c0584Wk.d;
        String str = (String) c0584Wk.e;
        List<String> list = (List) c0584Wk.f;
        DI di = new DI();
        boolean z = c0584Wk.a;
        boolean z2 = c0584Wk.b;
        if (c1117gf == null) {
            C1717pn c1717pn = (C1717pn) C0950e6.D().i;
            if (!c1717pn.a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c1117gf = new C1117gf((String) c1717pn.d.c, "main");
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            c0862cn = new C0862cn(context, null, di, z, z2);
            if (str != null) {
                c0862cn.i.a.E("setInitialRoute", str, null);
            }
            c0862cn.c.b(c1117gf, list);
        } else {
            C0862cn c0862cn2 = (C0862cn) arrayList.get(0);
            if (!c0862cn2.a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            c0862cn = new C0862cn(context, c0862cn2.a.spawn(c1117gf.c, c1117gf.b, str, list, C0862cn.y), di, z, z2);
        }
        arrayList.add(c0862cn);
        c0862cn.v.add(new C0993en(this, c0862cn));
        return c0862cn;
    }
}
