package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class wq2 extends Lambda implements Function0 {
    public final /* synthetic */ s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq2(s2 s2Var) {
        super(0);
        this.b = s2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return Long.valueOf(this.b.a());
    }
}
