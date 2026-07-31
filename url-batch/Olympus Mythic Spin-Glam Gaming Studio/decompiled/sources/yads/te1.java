package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes5.dex */
public final class te1 extends Lambda implements Function1 {
    public final /* synthetic */ ve1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te1(ve1 ve1Var) {
        super(1);
        this.b = ve1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CompletableDeferred completableDeferred = this.b.f.a;
        if (completableDeferred != null) {
            completableDeferred.complete(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
