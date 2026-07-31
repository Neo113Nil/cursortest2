package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class ok3 extends Lambda implements Function2 {
    public final /* synthetic */ tk3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok3(tk3 tk3Var) {
        super(2);
        this.b = tk3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (nk3.a[((ma0) obj).ordinal()] == 1) {
            this.b.a.invoke(new p90(booleanValue));
        }
        return Unit.INSTANCE;
    }
}
