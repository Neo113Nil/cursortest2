package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class nn extends Lambda implements Function1 {
    public final /* synthetic */ ln b;
    public final /* synthetic */ bx0 c;
    public final /* synthetic */ pn d;
    public final /* synthetic */ d8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(ln lnVar, bx0 bx0Var, pn pnVar, d8 d8Var) {
        super(1);
        this.b = lnVar;
        this.c = bx0Var;
        this.d = pnVar;
        this.e = d8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ln lnVar = this.b;
        mn mnVar = new mn(this.c, this.d, this.e);
        if (lnVar.f.compareAndSet(false, true)) {
            mnVar.mo4828invoke();
        }
        return Unit.INSTANCE;
    }
}
