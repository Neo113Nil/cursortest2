package io.ktor.client.plugins;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequest;", "cause"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$4 extends SuspendLambda implements Function3 {
    final /* synthetic */ List<Object> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCallValidatorKt$HttpCallValidator$2$4(List<Object> list, Continuation continuation) {
        super(3, continuation);
        this.$callExceptionHandlers = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequest httpRequest, Throwable th, Continuation continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, continuation);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = httpRequest;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object HttpCallValidator$lambda$2$processException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
            return th;
        }
        ResultKt.throwOnFailure(obj);
        HttpRequest httpRequest = (HttpRequest) this.L$0;
        Throwable unwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException((Throwable) this.L$1);
        List<Object> list = this.$callExceptionHandlers;
        this.L$0 = unwrapCancellationException;
        this.label = 1;
        HttpCallValidator$lambda$2$processException = HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(list, unwrapCancellationException, httpRequest, this);
        return HttpCallValidator$lambda$2$processException == coroutine_suspended ? coroutine_suspended : unwrapCancellationException;
    }
}
