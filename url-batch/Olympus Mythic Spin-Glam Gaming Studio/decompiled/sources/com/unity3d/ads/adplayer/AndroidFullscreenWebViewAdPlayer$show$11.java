package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidFullscreenWebViewAdPlayer$show$11 extends SuspendLambda implements Function2 {
    final /* synthetic */ int $defaultIntentFlags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ CompletableDeferred $listenerStarted;
    final /* synthetic */ int $selectedIntentFlags;
    final /* synthetic */ ShowOptions $showOptions;
    final /* synthetic */ Context $startContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$11(CompletableDeferred completableDeferred, Context context, Intent intent, int i, int i2, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
        super(2, continuation);
        this.$listenerStarted = completableDeferred;
        this.$startContext = context;
        this.$intent = intent;
        this.$selectedIntentFlags = i;
        this.$defaultIntentFlags = i2;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.unity3d.ads");
        p0.startActivity(p1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidFullscreenWebViewAdPlayer$show$11 androidFullscreenWebViewAdPlayer$show$11 = new AndroidFullscreenWebViewAdPlayer$show$11(this.$listenerStarted, this.$startContext, this.$intent, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$showOptions, continuation);
        androidFullscreenWebViewAdPlayer$show$11.L$0 = obj;
        return androidFullscreenWebViewAdPlayer$show$11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$show$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        Intent intent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CompletableDeferred completableDeferred = this.$listenerStarted;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context = this.$startContext;
        Intent intent2 = this.$intent;
        try {
            Result.Companion companion = Result.INSTANCE;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        int i2 = this.$selectedIntentFlags;
        int i3 = this.$defaultIntentFlags;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        Context context2 = this.$startContext;
        ShowOptions showOptions = this.$showOptions;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            if (i2 != i3) {
                intent = androidFullscreenWebViewAdPlayer.getIntent(context2, (AndroidShowOptions) showOptions, i3);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
            } else {
                throw m8026exceptionOrNullimpl;
            }
        }
        return Unit.INSTANCE;
    }
}
