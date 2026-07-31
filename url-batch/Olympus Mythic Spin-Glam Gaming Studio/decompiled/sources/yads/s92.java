package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class s92 implements hw0 {
    public final jx1 a;

    public s92(jx1 jx1Var) {
        this.a = jx1Var;
    }

    @Override // yads.hw0
    public final void a() {
        jx1 jx1Var = this.a;
        synchronized (jx1Var) {
            try {
                jx1Var.p.size();
                boolean z = ob1.a;
                jx1Var.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = jx1Var.p.iterator();
                while (it.hasNext()) {
                    s83 s83Var = (s83) it.next();
                    ec3 a = jx1Var.a(s83Var);
                    if (a instanceof cc3) {
                        it.remove();
                        jx1Var.a(s83Var, (cc3) a);
                    } else if (a instanceof bc3) {
                        bc3 bc3Var = (bc3) a;
                        jx1Var.d.a(s83Var.d, bc3Var);
                        arrayList.add(new t92(s83Var, bc3Var));
                    }
                }
                jx1Var.d.a(arrayList);
                jx1Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
