package androidx.room;

import android.os.CancellationSignal;
import java.util.Map;
import java.util.concurrent.Callable;
import o1.AbstractC0299p;
import o1.AbstractC0302t;
import o1.C0288e;
import o1.I;
import o1.J;
import o1.Y;
import o1.Z;

/* loaded from: classes.dex */
public abstract class f {
    public static final Object a(t tVar, CancellationSignal cancellationSignal, Callable callable, X0.d dVar) {
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.h().j(z.f1720a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new I(tVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        AbstractC0299p abstractC0299p = (AbstractC0299p) obj;
        C0288e c0288e = new C0288e(T.e.D(dVar));
        o1.A n2 = c0288e.n();
        if (n2 != null && !(C0288e.f3310g.get(c0288e) instanceof Z)) {
            n2.e();
            C0288e.h.set(c0288e, Y.f3303a);
        }
        c0288e.o(new d(cancellationSignal, 0, AbstractC0302t.i(J.f3286a, abstractC0299p, new e(callable, c0288e, null))));
        return c0288e.m();
    }

    public static final Object b(t tVar, Callable callable, X0.d dVar) {
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.h().j(z.f1720a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new I(tVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        return AbstractC0302t.n((AbstractC0299p) obj, new c(callable, null), dVar);
    }

    public static String c(String str, String str2) {
        g1.f.e(str, "tableName");
        g1.f.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
