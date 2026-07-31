package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a {
    public static final int g = 8;

    @NotNull
    public c a;

    @NotNull
    public final Flow b;

    @Nullable
    public Function1 c;

    @Nullable
    public Function2 d;

    @Nullable
    public Function1 e;

    @Nullable
    public Function1 f;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.MediaStreamListenerFlow$streamStatusFlow$1", f = "MediaStreamListenerFlow.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = b.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.b;
                b.this.c = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.a.a(ProducerScope.this, (File) obj2);
                    }
                };
                b.this.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return b.a.a(ProducerScope.this, (File) obj2, (c.d) obj3);
                    }
                };
                b.this.e = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.a.a(ProducerScope.this, (c.a) obj2);
                    }
                };
                b.this.f = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.a.a(ProducerScope.this, (c.b) obj2);
                    }
                };
                final b bVar = b.this;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b$a$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return b.a.a(b.this);
                    }
                };
                this.a = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        public static final Unit a(ProducerScope producerScope, File file) {
            producerScope.mo8216trySendJP2dKIU(new c.C1589c(file, new c.d(0L, 0L)));
            return Unit.INSTANCE;
        }

        public static final Unit a(ProducerScope producerScope, File file, c.d dVar) {
            producerScope.mo8216trySendJP2dKIU(new c.C1589c(file, dVar));
            return Unit.INSTANCE;
        }

        public static final Unit a(ProducerScope producerScope, c.a aVar) {
            producerScope.mo8216trySendJP2dKIU(aVar);
            return Unit.INSTANCE;
        }

        public static final Unit a(ProducerScope producerScope, c.b bVar) {
            producerScope.mo8216trySendJP2dKIU(bVar);
            return Unit.INSTANCE;
        }

        public static final Unit a(b bVar) {
            bVar.c = null;
            bVar.d = null;
            bVar.e = null;
            bVar.f = null;
            return Unit.INSTANCE;
        }
    }

    public b(@NotNull c initialStatus) {
        Intrinsics.checkNotNullParameter(initialStatus, "initialStatus");
        this.a = initialStatus;
        this.b = FlowKt.callbackFlow(new a(null));
    }

    @NotNull
    public final Flow b() {
        return this.b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    @NotNull
    public c a() {
        return this.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.a = new c.C1589c(file, new c.d(0L, 0L));
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(file);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(@NotNull File file, @NotNull c.d progress) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.a = new c.C1589c(file, progress);
        Function2 function2 = this.d;
        if (function2 != null) {
            function2.invoke(file, progress);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(@NotNull c.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = result;
        Function1 function1 = this.e;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(@NotNull c.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(error);
        }
    }
}
