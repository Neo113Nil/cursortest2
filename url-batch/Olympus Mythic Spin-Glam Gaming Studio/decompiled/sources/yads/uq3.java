package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class uq3 extends Lambda implements Function0 {
    public final /* synthetic */ vq3 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq3(vq3 vq3Var, String str) {
        super(0);
        this.b = vq3Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onBidderTokenLoaded(this.c);
        return Unit.INSTANCE;
    }
}
