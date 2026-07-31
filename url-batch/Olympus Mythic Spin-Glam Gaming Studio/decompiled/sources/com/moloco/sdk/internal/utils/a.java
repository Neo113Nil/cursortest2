package com.moloco.sdk.internal.utils;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class a {

    @DebugMetadata(c = "com.moloco.sdk.internal.utils.CoroutineUtilsKt$withReentrantLock$2", f = "CoroutineUtils.kt", l = {54, 37}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.utils.a$a, reason: collision with other inner class name */
    public static final class C1560a extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ Mutex d;
        public final /* synthetic */ Function1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1560a(Mutex mutex, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.d = mutex;
            this.e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1560a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1560a(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            Function1 function1;
            Mutex mutex2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = this.d;
                    function1 = this.e;
                    this.a = mutex;
                    this.b = function1;
                    this.c = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    function1 = (Function1) this.b;
                    Mutex mutex3 = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                this.a = mutex;
                this.b = null;
                this.c = 2;
                Object invoke = function1.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                obj = invoke;
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(CoroutineScope coroutineScope, CoroutineContext context, CoroutineStart start, Function2 block, int i, Object obj) {
        if ((i & 1) != 0) {
            context = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            start = CoroutineStart.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt.launch(coroutineScope, context, start, block);
    }

    public static final void a(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext context, @NotNull CoroutineStart start, @NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt.launch(coroutineScope, context, start, block);
    }

    @Nullable
    public static final <T> Object a(@NotNull Mutex mutex, @NotNull Function1 function1, @NotNull Continuation continuation) {
        d dVar = new d(mutex);
        return continuation.getContext().get(dVar) != null ? function1.invoke(continuation) : BuildersKt.withContext(new c(dVar), new C1560a(mutex, function1, null), continuation);
    }
}
