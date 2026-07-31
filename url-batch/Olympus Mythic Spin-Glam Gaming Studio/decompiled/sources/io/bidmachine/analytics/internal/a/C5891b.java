package io.bidmachine.analytics.internal.a;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.analytics.internal.a.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5891b {
    private final Lazy a;
    private final Lazy b = LazyKt.lazy(a.a);

    /* renamed from: io.bidmachine.analytics.internal.a.b$a */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.a mo4828invoke() {
            return new io.bidmachine.analytics.internal.q.a();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.b$b, reason: collision with other inner class name */
    static final class C1731b extends Lambda implements Function0 {
        final /* synthetic */ io.bidmachine.analytics.internal.J.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1731b(io.bidmachine.analytics.internal.J.b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.b mo4828invoke() {
            return new io.bidmachine.analytics.internal.q.b(this.a);
        }
    }

    public C5891b(io.bidmachine.analytics.internal.J.b bVar) {
        this.a = LazyKt.lazy(new C1731b(bVar));
    }

    public final io.bidmachine.analytics.internal.q.a a() {
        return (io.bidmachine.analytics.internal.q.a) this.b.getValue();
    }

    public final io.bidmachine.analytics.internal.q.b b() {
        return (io.bidmachine.analytics.internal.q.b) this.a.getValue();
    }
}
