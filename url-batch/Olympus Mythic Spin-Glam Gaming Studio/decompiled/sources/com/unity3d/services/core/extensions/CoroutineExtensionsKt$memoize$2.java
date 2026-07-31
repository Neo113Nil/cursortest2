package com.unity3d.services.core.extensions;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: CoroutineExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class CoroutineExtensionsKt$memoize$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function1 $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2(Object obj, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$key = obj;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, continuation);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CoroutineExtensionsKt$memoize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Mutex mutex;
        Function1 function1;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                function1 = this.$action;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = function1;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj3;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$3;
                obj2 = this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            LinkedHashMap<Object, Deferred> deferreds = CoroutineExtensionsKt.getDeferreds();
            Deferred deferred = deferreds.get(obj2);
            if (deferred == null) {
                deferred = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                deferreds.put(obj2, deferred);
            }
            Deferred deferred2 = deferred;
            mutex.unlock(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            obj = deferred2.await(this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        InlineMarker.mark(10);
        Mutex mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        Function1 function1 = this.$action;
        InlineMarker.mark(0);
        mutex.lock(null, this);
        InlineMarker.mark(1);
        try {
            LinkedHashMap<Object, Deferred> deferreds = CoroutineExtensionsKt.getDeferreds();
            Deferred deferred = deferreds.get(obj2);
            if (deferred == null) {
                deferred = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                deferreds.put(obj2, deferred);
            }
            Deferred deferred2 = deferred;
            mutex.unlock(null);
            InlineMarker.mark(0);
            Object await = deferred2.await(this);
            InlineMarker.mark(1);
            return await;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
