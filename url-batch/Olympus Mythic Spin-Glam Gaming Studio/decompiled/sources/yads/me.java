package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class me extends Lambda implements Function1 {
    public final /* synthetic */ ne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ne neVar) {
        super(1);
        this.b = neVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.h.set(false);
        return Unit.INSTANCE;
    }
}
