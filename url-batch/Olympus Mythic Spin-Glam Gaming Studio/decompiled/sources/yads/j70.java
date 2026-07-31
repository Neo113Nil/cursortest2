package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class j70 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ r70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(Context context, r70 r70Var) {
        super(0);
        this.b = context;
        this.c = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new en2(this.b, (ap2) this.c.u.getValue(), (qa0) this.c.v.getValue(), new x51());
    }
}
