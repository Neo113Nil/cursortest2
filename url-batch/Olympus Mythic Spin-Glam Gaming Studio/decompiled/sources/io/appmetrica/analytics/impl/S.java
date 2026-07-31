package io.appmetrica.analytics.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class S extends Lambda implements Function0 {
    public final /* synthetic */ W a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(W w) {
        super(0);
        this.a = w;
    }

    public static final Void a(W w) {
        w.b();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FutureTask mo4828invoke() {
        final W w = this.a;
        return new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.S$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return S.a(W.this);
            }
        });
    }
}
