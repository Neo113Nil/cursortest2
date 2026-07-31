package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes13.dex */
public final class Sd implements G8 {
    public final G8 a;

    public Sd(CoroutineScope scope, AbstractC4075ic mrC50Model, MutableStateFlow lifecycleObserver) {
        G8 wd;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        if (mrC50Model instanceof S5) {
            wd = new Rd(scope, (S5) mrC50Model, lifecycleObserver);
        } else {
            if (!(mrC50Model instanceof C4191mn)) {
                throw new NoWhenBranchMatchedException();
            }
            wd = new Wd((C4191mn) mrC50Model);
        }
        this.a = wd;
    }

    @Override // com.inmobi.media.G8
    public final void a() {
        this.a.a();
    }

    @Override // com.inmobi.media.G8
    public final Flow b() {
        return this.a.b();
    }
}
