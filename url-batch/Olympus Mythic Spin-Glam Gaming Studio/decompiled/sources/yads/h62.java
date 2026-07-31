package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class h62 extends Lambda implements Function0 {
    public final /* synthetic */ i62 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(i62 i62Var) {
        super(0);
        this.b = i62Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        s3 s3Var = this.b.b;
        if (s3Var != null) {
            s3Var.a();
        }
        this.b.b = null;
        return Unit.INSTANCE;
    }
}
