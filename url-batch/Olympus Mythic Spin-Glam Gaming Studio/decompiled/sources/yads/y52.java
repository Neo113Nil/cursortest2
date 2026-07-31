package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes15.dex */
public final class y52 {
    public final Context a;
    public final Lazy b = LazyKt.lazy(new x52(this));
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public y52(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(String str, kh3 kh3Var, String str2) {
        zj0 zj0Var = (zj0) this.b.getValue();
        if (zj0Var == null) {
            kh3Var.b();
            a();
            return;
        }
        Uri parse = Uri.parse(str);
        i41 i41Var = l41.c;
        ck0 ck0Var = new ck0(str2, parse, null, um2.f, null, null, null);
        this.c.put(str2, kh3Var);
        zj0Var.b.add(new tn3(str2, kh3Var));
        zj0Var.c++;
        zj0Var.a.obtainMessage(6, 0, 0, ck0Var).sendToTarget();
        if (zj0Var.d) {
            zj0Var.d = false;
            zj0Var.c++;
            zj0Var.a.obtainMessage(1, 0, 0).sendToTarget();
            boolean a = zj0Var.a();
            Iterator it = zj0Var.b.iterator();
            while (it.hasNext()) {
                ((xj0) it.next()).getClass();
            }
            if (a) {
                Iterator it2 = zj0Var.b.iterator();
                while (it2.hasNext()) {
                    ((xj0) it2.next()).getClass();
                }
            }
        }
    }

    public final void a() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            zj0 zj0Var = (zj0) this.b.getValue();
            if (zj0Var != null) {
                zj0Var.c++;
                zj0Var.a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.c.clear();
    }
}
