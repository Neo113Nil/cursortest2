package com.moloco.sdk.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C5026b;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$createBannerTablet$1", f = "Moloco.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class Moloco$createBannerTablet$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ Function2 $callback;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ String $watermarkString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$createBannerTablet$1(MediationInfo mediationInfo, String str, String str2, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$mediationInfo = mediationInfo;
        this.$adUnitId = str;
        this.$watermarkString = str2;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Moloco$createBannerTablet$1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C5026b adCreator;
        Pair pair;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MetricsRecorder create = MetricsRecorder.INSTANCE.create(this.$mediationInfo.getName());
            adCreator = Moloco.INSTANCE.getAdCreator();
            String name = this.$mediationInfo.getName();
            String str = this.$adUnitId;
            String str2 = this.$watermarkString;
            this.label = 1;
            obj = adCreator.b(name, str, create, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        x xVar = (x) obj;
        if (xVar instanceof x.b) {
            pair = TuplesKt.to(((x.b) xVar).a(), null);
        } else {
            if (!(xVar instanceof x.a)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(null, ((x.a) xVar).a());
        }
        Banner banner = (Banner) pair.component1();
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("Banner for adUnitId: ");
        sb.append(this.$adUnitId);
        sb.append(" has error: ");
        sb.append(banner == null);
        MolocoLogger.info$default(molocoLogger, "Moloco", sb.toString(), null, false, 12, null);
        this.$callback.invoke(banner, adCreateError);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Moloco$createBannerTablet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
