package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class ih {
    public final oe a;
    public final CoroutineScope b;
    public final fh c;
    public final gh d;
    public final ce e;
    public final b20 f;
    public final ee g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public ih(oe oeVar, CoroutineScope coroutineScope, fh fhVar, gh ghVar, ce ceVar, mt1 mt1Var) {
        this.a = oeVar;
        this.b = coroutineScope;
        this.c = fhVar;
        this.d = ghVar;
        this.e = ceVar;
        this.f = new b20(mt1Var);
        this.g = new ee(oeVar.a);
    }

    public static final void a(ih ihVar, ArrayList arrayList) {
        Long l;
        ihVar.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((bc2) it.next()).a.a);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((bc2) it.next()).a.a);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            long b = ((qg1) ihVar.e.a).b("ExitInfoAnrLastReportedTimestamp");
            ce ceVar = ihVar.e;
            ((qg1) ceVar.a).a("ExitInfoAnrLastReportedTimestamp", Math.max(b, longValue));
        }
    }
}
