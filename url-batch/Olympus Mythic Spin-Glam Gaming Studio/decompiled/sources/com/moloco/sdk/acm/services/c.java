package com.moloco.sdk.acm.services;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c implements b {

    @NotNull
    public final Lifecycle a;

    @NotNull
    public final ApplicationLifecycleObserver b;

    @NotNull
    public AtomicBoolean c;

    @DebugMetadata(c = "com.moloco.sdk.acm.services.ApplicationLifecycleTrackerImpl$startObserving$2", f = "ApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (c.this.c.compareAndSet(false, true)) {
                e.a(e.a, d.a, "Start observing application lifecycle events", false, 4, null);
                c.this.a.addObserver(c.this.b);
            }
            return Unit.INSTANCE;
        }
    }

    public c(@NotNull Lifecycle lifecycle, @NotNull ApplicationLifecycleObserver bgListener) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(bgListener, "bgListener");
        this.a = lifecycle;
        this.b = bgListener;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.acm.services.b
    @Nullable
    public Object a(@NotNull Continuation continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new a(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @VisibleForTesting
    public final void a() {
        this.b.onStop(ProcessLifecycleOwner.INSTANCE.get());
    }
}
