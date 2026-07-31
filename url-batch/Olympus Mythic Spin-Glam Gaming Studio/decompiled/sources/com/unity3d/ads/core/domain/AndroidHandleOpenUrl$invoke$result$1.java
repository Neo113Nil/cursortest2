package com.unity3d.ads.core.domain;

import android.content.Intent;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: AndroidHandleOpenUrl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1", f = "AndroidHandleOpenUrl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AndroidHandleOpenUrl$invoke$result$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $useActivityForResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleOpenUrl$invoke$result$1(AdObject adObject, Intent intent, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$adObject = adObject;
        this.$intent = intent;
        this.$useActivityForResult = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidHandleOpenUrl$invoke$result$1(this.$adObject, this.$intent, this.$useActivityForResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((AndroidHandleOpenUrl$invoke$result$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AndroidHandleOpenUrl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1", f = "AndroidHandleOpenUrl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ boolean $useActivityForResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdObject adObject, Intent intent, boolean z, Continuation continuation) {
            super(2, continuation);
            this.$adObject = adObject;
            this.$intent = intent;
            this.$useActivityForResult = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                String uuid = ProtobufExtensionsKt.toUUID(this.$adObject.getOpportunityId()).toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                DisplayMessage.OpenUrl openUrl = new DisplayMessage.OpenUrl(uuid, this.$intent, this.$useActivityForResult);
                this.label = 1;
                if (displayMessages.emit(openUrl, this) == coroutine_suspended) {
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext()), null, null, new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
