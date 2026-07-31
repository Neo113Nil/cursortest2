package yads;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class y6 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ z6 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ AdQualityVerificationAdConfiguration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, Continuation continuation) {
        super(2, continuation);
        this.c = z6Var;
        this.d = context;
        this.e = adQualityVerificationAdConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new y6(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z6 z6Var = this.c;
            AdQualityVerifierAdapter adQualityVerifierAdapter = z6Var.a;
            Context context = this.d;
            AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = z6Var.b;
            AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = this.e;
            this.b = 1;
            obj = adQualityVerifierAdapter.verifyAd(context, adQualityVerifierAdapterConfiguration, adQualityVerificationAdConfiguration, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
