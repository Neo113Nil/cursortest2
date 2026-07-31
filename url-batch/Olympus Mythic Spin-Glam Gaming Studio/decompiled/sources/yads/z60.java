package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class z60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ng1((bf) this.b.n.getValue(), (sv2) this.b.q.getValue(), (es1) this.b.p.getValue(), (az) this.b.o.getValue(), (x30) this.b.l.getValue(), (hh1) this.b.m.getValue());
    }
}
