package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
public final class fv2 implements Runnable {
    public static final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final nt3 b;
    public final CoroutineScope c;
    public final iu1 d;
    public final i5 e;
    public final Context f;

    public fv2(Context context, nt3 nt3Var, CoroutineScope coroutineScope) {
        iu1 a = gu1.a(nt3Var);
        i5 i5Var = new i5();
        this.b = nt3Var;
        this.c = coroutineScope;
        this.d = a;
        this.e = i5Var;
        this.f = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        pv2 pv2Var = new pv2(this.f, this.b, this.c, this.e, null, null, 4194288);
        g.add(pv2Var);
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new ev2(pv2Var, this, null), 3, null);
    }
}
