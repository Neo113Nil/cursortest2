package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class ms3 extends Lambda implements Function0 {
    public final /* synthetic */ os3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms3(os3 os3Var) {
        super(0);
        this.b = os3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onAdClicked();
        return Unit.INSTANCE;
    }
}
