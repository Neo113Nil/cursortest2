package com.moloco.sdk.internal.scheduling;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class d {

    @NotNull
    public static final CoroutineScope a = CoroutineScopeKt.CoroutineScope(b.a().getMainImmediate());

    @DebugMetadata(c = "com.moloco.sdk.internal.scheduling.RunOnMainDispatcherKt$runOnMainDispatcher$1", f = "RunOnMainDispatcher.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Function0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.mo4828invoke();
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Job a(@NotNull Function0 block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(a, null, null, new a(block, null), 3, null);
        return launch$default;
    }
}
