package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class w60 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ r70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(Context context, r70 r70Var) {
        super(0);
        this.b = context;
        this.c = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new v51(this.b, (p51) this.c.y.getValue());
    }
}
