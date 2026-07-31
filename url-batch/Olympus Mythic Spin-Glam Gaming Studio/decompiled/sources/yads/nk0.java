package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class nk0 extends Lambda implements Function1 {
    public final /* synthetic */ ok0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(ok0 ok0Var, String str) {
        super(1);
        this.b = ok0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rk0 rk0Var = (rk0) obj;
        ok0 ok0Var = this.b;
        String str = this.c;
        lk0 lk0Var = (lk0) ok0Var.d.remove(str);
        if (lk0Var != null) {
            ok0Var.c.a(str, rk0Var.a, rk0Var.b);
            ok0Var.a(str, lk0Var, rk0Var.a, null);
        }
        return Unit.INSTANCE;
    }
}
