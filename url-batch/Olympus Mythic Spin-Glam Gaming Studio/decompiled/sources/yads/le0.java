package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* loaded from: classes3.dex */
public final class le0 {
    public final i5 a;
    public final y52 b;
    public final p72 c;
    public final Object d;

    public le0(Context context, i5 i5Var) {
        y52 y52Var = new y52(context);
        p72 p72Var = new p72();
        this.a = i5Var;
        this.b = y52Var;
        this.c = p72Var;
        this.d = new Object();
    }

    public final void a(dz1 dz1Var, m62 m62Var, z30 z30Var) {
        synchronized (this.d) {
            s12 s12Var = dz1Var.a;
            p72 p72Var = this.c;
            p72Var.getClass();
            List<Pair> list = SequencesKt.toList(SequencesKt.map(SequencesKt.map(SequencesKt.mapNotNull(SequencesKt.flatMapIterable(CollectionsKt.asSequence(s12Var.a), new m72(p72Var)), n72.b), k72.b), l72.b));
            if (list.isEmpty()) {
                m62Var.a();
                return;
            }
            ke0 ke0Var = new ke0(this.a, list.size(), m62Var, z30Var);
            this.a.a(h5.q, null);
            for (Pair pair : list) {
                this.b.a((String) pair.component1(), ke0Var, (String) pair.component2());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(String str) {
        zj0 zj0Var;
        synchronized (this.d) {
            try {
                y52 y52Var = this.b;
                if (y52Var.c.containsKey(str) && (zj0Var = (zj0) y52Var.b.getValue()) != null) {
                    zj0Var.c++;
                    zj0Var.a.obtainMessage(3, 1, 0, str).sendToTarget();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
