package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class zf0 extends Lambda implements Function1 {
    public final /* synthetic */ y1 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(y1 y1Var, long j) {
        super(1);
        this.b = y1Var;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.a(this.c);
        return Unit.INSTANCE;
    }
}
