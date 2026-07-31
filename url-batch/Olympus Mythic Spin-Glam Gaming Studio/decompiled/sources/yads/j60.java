package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class j60 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ r70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(Context context, r70 r70Var) {
        super(0);
        this.b = context;
        this.c = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new c80(this.b, (sq1) this.c.e.getValue(), new ur1(this.b));
    }
}
