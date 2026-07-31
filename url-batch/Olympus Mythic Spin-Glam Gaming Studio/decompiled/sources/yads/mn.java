package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class mn extends Lambda implements Function0 {
    public final /* synthetic */ bx0 b;
    public final /* synthetic */ pn c;
    public final /* synthetic */ d8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(bx0 bx0Var, pn pnVar, d8 d8Var) {
        super(0);
        this.b = bx0Var;
        this.c = pnVar;
        this.d = d8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.c();
        this.c.c.a(this.d, null);
        return Unit.INSTANCE;
    }
}
