package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public final class rg {
    public final gg a;
    public final vk2 b;
    public final qh1 c;
    public final lh1 d;
    public final AtomicBoolean e;
    public final Lazy f;

    public rg(Context context, dx0 dx0Var, gg ggVar) {
        vk2 vk2Var = new vk2(dx0Var);
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        this.a = ggVar;
        this.b = vk2Var;
        this.c = qh1Var;
        this.d = a;
        this.e = new AtomicBoolean(false);
        this.f = LazyKt.lazy(new qg(this));
        ggVar.l = vk2Var;
    }
}
