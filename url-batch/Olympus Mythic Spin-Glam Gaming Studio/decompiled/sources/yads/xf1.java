package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes13.dex */
public final class xf1 {
    public final Context a;
    public final v3 b;
    public final rf c;
    public final qu1 d;

    public xf1(Context context, v3 v3Var) {
        rf rfVar = new rf(context);
        pu1 pu1Var = qu1.e;
        qu1 qu1Var = qu1.f;
        if (qu1Var == null) {
            synchronized (pu1Var) {
                qu1Var = qu1.f;
                if (qu1Var == null) {
                    qu1Var = new qu1();
                    qu1.f = qu1Var;
                }
            }
        }
        this.a = context;
        this.b = v3Var;
        this.c = rfVar;
        this.d = qu1Var;
    }

    public final List a() {
        d4 a;
        d4 a2;
        try {
            this.c.a();
            a = null;
        } catch (ja1 e) {
            d4 d4Var = e8.a;
            a = e8.a(1, e.getMessage(), e.c);
        }
        try {
            qu1 qu1Var = this.d;
            Context context = this.a;
            if (qu1Var.b) {
                synchronized (qu1Var.a) {
                    try {
                        if (qu1Var.b) {
                            if (pa.a(context)) {
                                qu1Var.c.a(context);
                                qu1Var.d.getClass();
                                uc2.a(context);
                            }
                            qu1Var.b = false;
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            a2 = null;
        } catch (ja1 e2) {
            d4 d4Var2 = e8.a;
            a2 = e8.a(1, e2.getMessage(), e2.c);
        }
        v3 v3Var = this.b;
        return CollectionsKt.listOfNotNull((Object[]) new d4[]{a, a2, v3Var.c.a == null ? e8.l : null, v3Var.e == null ? e8.i : null});
    }
}
