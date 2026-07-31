package io.bidmachine.internal;

import io.bidmachine.BidMachine;
import io.bidmachine.core.Logger;
import kotlin.KotlinVersion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: io.bidmachine.internal.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6020o {
    public static final C6020o a = new C6020o();
    private static final CoroutineScope b = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getDefault()));

    /* renamed from: io.bidmachine.internal.o$a */
    static final class a extends SuspendLambda implements Function2 {
        int a;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.d(BidMachine.NAME, "Kotlin runtime version is " + KotlinVersion.CURRENT);
            return Unit.INSTANCE;
        }
    }

    private C6020o() {
    }

    public static final void a() {
        Logger.d(BidMachine.NAME, "Init Kt");
        BuildersKt__Builders_commonKt.launch$default(b, null, null, new a(null), 3, null);
    }
}
