package yads;

import kotlin.Unit;

/* loaded from: classes14.dex */
public abstract class jv1 {
    public static final void a(boolean z) {
        qv1 qv1Var;
        ob1.a = z;
        ab1.c = z;
        if (z) {
            return;
        }
        qv1 qv1Var2 = qv1.b;
        if (qv1Var2 == null) {
            synchronized (qv1.c) {
                qv1Var = qv1.b;
                if (qv1Var == null) {
                    qv1Var = new qv1();
                    qv1.b = qv1Var;
                }
            }
            qv1Var2 = qv1Var;
        }
        qv1Var2.a();
        wu1.a().a();
    }

    public static final void b(boolean z) {
        vw2 a = uw2.a();
        synchronized (vw2.k) {
            a.c = Boolean.valueOf(z);
            Unit unit = Unit.INSTANCE;
        }
    }
}
