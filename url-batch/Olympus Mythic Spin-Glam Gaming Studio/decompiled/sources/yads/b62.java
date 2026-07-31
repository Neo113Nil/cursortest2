package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b62 extends Lambda implements Function0 {
    public final /* synthetic */ d62 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b62(d62 d62Var) {
        super(0);
        this.b = d62Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        d62 d62Var = this.b;
        d62Var.b.a();
        d62Var.a.a.remove(d62Var);
        return Unit.INSTANCE;
    }
}
