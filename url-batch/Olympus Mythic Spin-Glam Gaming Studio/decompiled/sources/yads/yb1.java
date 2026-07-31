package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class yb1 extends Lambda implements Function0 {
    public final /* synthetic */ zb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(zb1 zb1Var) {
        super(0);
        this.b = zb1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.b.a.d();
    }
}
