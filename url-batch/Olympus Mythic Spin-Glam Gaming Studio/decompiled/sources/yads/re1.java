package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class re1 extends Lambda implements Function1 {
    public final /* synthetic */ ve1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re1(ve1 ve1Var) {
        super(1);
        this.b = ve1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g92.a(this.b.d.b).a(new bp2("light_bundle_js_request_tag"));
        return Unit.INSTANCE;
    }
}
