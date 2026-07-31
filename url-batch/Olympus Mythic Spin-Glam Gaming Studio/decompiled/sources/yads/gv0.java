package yads;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class gv0 extends Lambda implements Function1 {
    public final /* synthetic */ kv0 b;
    public final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(kv0 kv0Var, UUID uuid) {
        super(1);
        this.b = kv0Var;
        this.c = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ep2 ep2Var = (ep2) this.b.b.getValue();
        UUID uuid = this.c;
        ep2Var.getClass();
        if (uuid == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        ep2Var.a(new bp2(uuid));
        return Unit.INSTANCE;
    }
}
