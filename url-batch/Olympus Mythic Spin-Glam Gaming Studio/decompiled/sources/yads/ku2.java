package yads;

import android.content.Context;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class ku2 {
    public static final Mutex d = MutexKt.Mutex$default(false, 1, null);
    public final i5 a;
    public final fy2 b;
    public final gu2 c;

    public ku2(Context context, i5 i5Var, ic icVar, pm0 pm0Var, mt1 mt1Var) {
        fy2 fy2Var = new fy2();
        gu2 gu2Var = new gu2(context.getApplicationContext(), i5Var, icVar, pm0Var, mt1Var);
        this.a = i5Var;
        this.b = fy2Var;
        this.c = gu2Var;
    }
}
