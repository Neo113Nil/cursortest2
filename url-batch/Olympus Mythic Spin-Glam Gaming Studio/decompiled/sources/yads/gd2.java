package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class gd2 {
    public final id2 a(Context context) {
        id2 id2Var = id2.i;
        if (id2Var == null) {
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Executor a = lg1.a().a();
                id2 id2Var2 = id2.i;
                if (id2Var2 == null) {
                    id2Var2 = new id2(applicationContext, a);
                    id2.i = id2Var2;
                }
                id2Var = id2Var2;
            }
        }
        return id2Var;
    }
}
