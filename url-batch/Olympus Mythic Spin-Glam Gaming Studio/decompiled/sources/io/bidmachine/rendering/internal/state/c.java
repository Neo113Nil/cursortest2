package io.bidmachine.rendering.internal.state;

import io.bidmachine.rendering.internal.f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class c extends d {
    private final f p;
    private final Lazy q;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b mo4828invoke() {
            c cVar = c.this;
            return new b(cVar, cVar.q());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String parent, f coroutineDispatchers) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.p = coroutineDispatchers;
        this.q = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    public final f q() {
        return this.p;
    }

    public final b r() {
        return (b) this.q.getValue();
    }
}
