package com.yandex.div.internal.viewpool.optimization;

import com.yandex.div.internal.Log;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPreCreationProfileOptimizer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileOptimizer$optimize$2", f = "ViewPreCreationProfileOptimizer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ViewPreCreationProfileOptimizer$optimize$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ double $convergenceRate;
    final /* synthetic */ ViewPreCreationProfile $profile;
    final /* synthetic */ PerformanceDependentSession $session;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPreCreationProfileOptimizer$optimize$2(ViewPreCreationProfile viewPreCreationProfile, PerformanceDependentSession performanceDependentSession, double d, Continuation continuation) {
        super(2, continuation);
        this.$profile = viewPreCreationProfile;
        this.$session = performanceDependentSession;
        this.$convergenceRate = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new ViewPreCreationProfileOptimizer$optimize$2(this.$profile, this.$session, this.$convergenceRate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ViewPreCreationProfileOptimizer$optimize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ViewPreCreationProfile optimize;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewPreCreationProfileOptimizer viewPreCreationProfileOptimizer = ViewPreCreationProfileOptimizer.INSTANCE;
        optimize = viewPreCreationProfileOptimizer.optimize(this.$profile, this.$session.getViewObtainmentStatistics(), this.$convergenceRate);
        if (Log.isEnabled()) {
            viewPreCreationProfileOptimizer.log(this.$session, this.$profile, optimize);
        }
        return optimize;
    }
}
