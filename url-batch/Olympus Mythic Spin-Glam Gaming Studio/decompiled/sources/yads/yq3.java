package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class yq3 extends Lambda implements Function0 {
    public final /* synthetic */ zq3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq3(zq3 zq3Var) {
        super(0);
        this.b = zq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onInitializationCompleted();
        return Unit.INSTANCE;
    }
}
