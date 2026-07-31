package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class d72 extends Lambda implements Function0 {
    public final /* synthetic */ i72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d72(i72 i72Var) {
        super(0);
        this.b = i72Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return Long.valueOf(this.b.f);
    }
}
