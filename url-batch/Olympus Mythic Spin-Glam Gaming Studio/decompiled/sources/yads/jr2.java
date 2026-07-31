package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class jr2 extends Lambda implements Function0 {
    public final /* synthetic */ kr2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr2(kr2 kr2Var) {
        super(0);
        this.b = kr2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.b.a.d();
    }
}
