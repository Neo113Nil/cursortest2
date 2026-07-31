package io.bidmachine.rendering.internal.state;

import io.bidmachine.rendering.internal.f;
import io.bidmachine.rendering.internal.state.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes15.dex */
public final class b implements CoroutineScope, a.b {
    private final a a;
    private final CoroutineContext b;

    public b(a adState, f coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.a = adState;
        this.b = SupervisorKt.SupervisorJob$default(null, 1, null).plus(coroutineDispatchers.e());
        if (adState.j()) {
            CoroutineScopeKt.cancel$default(this, null, 1, null);
        } else {
            adState.a(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a.b
    public void a(a source, a.EnumC1812a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == a.EnumC1812a.Destroyed && Intrinsics.areEqual(this.a, source)) {
            CoroutineScopeKt.cancel$default(this, null, 1, null);
            source.b(this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
