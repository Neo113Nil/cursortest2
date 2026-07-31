package com.moloco.sdk.internal.error.crash;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.error.crash.b;
import java.lang.Thread;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class b implements com.moloco.sdk.internal.error.crash.a {
    public static final int c = 8;

    @NotNull
    public final c a;

    @Nullable
    public Thread.UncaughtExceptionHandler b;

    @DebugMetadata(c = "com.moloco.sdk.internal.error.crash.CrashDetectorServiceImpl$register$2", f = "CrashDetectorService.kt", l = {}, m = "invokeSuspend")
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
            return b.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (b.this.b == null) {
                b.this.b = Thread.getDefaultUncaughtExceptionHandler();
                final b bVar = b.this;
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.b$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        b.a.a(b.this, thread, th);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final void a(b bVar, Thread thread, Throwable th) {
            c cVar = bVar.a;
            Intrinsics.checkNotNull(th);
            cVar.a(th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = bVar.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
    }

    public b(@NotNull c crashHandler) {
        Intrinsics.checkNotNullParameter(crashHandler, "crashHandler");
        this.a = crashHandler;
    }

    @Override // com.moloco.sdk.internal.error.crash.a
    @Nullable
    public Object a(@NotNull Continuation continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new a(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
