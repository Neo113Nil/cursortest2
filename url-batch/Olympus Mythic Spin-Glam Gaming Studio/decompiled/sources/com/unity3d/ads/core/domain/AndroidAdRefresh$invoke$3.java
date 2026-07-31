package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.selects.SelectImplementation;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidAdRefresh$invoke$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CoroutineScope $refreshScope;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidAdRefresh$invoke$3(CoroutineScope coroutineScope, AdObject adObject, AndroidAdRefresh androidAdRefresh, Continuation continuation) {
        super(2, continuation);
        this.$refreshScope = coroutineScope;
        this.$adObject = adObject;
        this.this$0 = androidAdRefresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidAdRefresh$invoke$3(this.$refreshScope, this.$adObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation continuation) {
        return ((AndroidAdRefresh$invoke$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AndroidAdRefresh.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ AdObject $adObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, Continuation continuation) {
            super(2, continuation);
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3, null);
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3, null);
                AdObject adObject = this.$adObject;
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                selectImplementation.invoke(async$default.getOnAwait(), new AndroidAdRefresh$invoke$3$1$1$1(async$default2, adObject, null));
                selectImplementation.invoke(async$default2.getOnAwait(), new AndroidAdRefresh$invoke$3$1$1$2(async$default, null));
                this.label = 1;
                if (selectImplementation.doSelect(this) == coroutine_suspended) {
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$refreshScope, null, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
