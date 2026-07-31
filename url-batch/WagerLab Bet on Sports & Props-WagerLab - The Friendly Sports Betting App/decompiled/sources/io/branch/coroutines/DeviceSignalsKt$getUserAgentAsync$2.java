package io.branch.coroutines;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: DeviceSignals.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.DeviceSignalsKt$getUserAgentAsync$2", f = "DeviceSignals.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class DeviceSignalsKt$getUserAgentAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSignalsKt$getUserAgentAsync$2(Context context, Continuation<? super DeviceSignalsKt$getUserAgentAsync$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSignalsKt$getUserAgentAsync$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DeviceSignalsKt$getUserAgentAsync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Context context;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = DeviceSignalsKt.getMutex();
            Context context2 = this.$context;
            this.L$0 = mutex;
            this.L$1 = context2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            context = context2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (!TextUtils.isEmpty(Branch._userAgentString)) {
                BranchLogger.v("UserAgent cached " + Branch._userAgentString);
                str = Branch._userAgentString;
            } else {
                try {
                    BranchLogger.v("Begin getUserAgentAsync " + Thread.currentThread());
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Exception e) {
                    e = e;
                    str = null;
                }
                try {
                    BranchLogger.v("End getUserAgentAsync " + Thread.currentThread() + ' ' + str);
                } catch (Exception e2) {
                    e = e2;
                    BranchLogger.e("Failed to retrieve userAgent string. " + e.getMessage());
                    return str;
                }
            }
            return str;
        } finally {
            mutex.unlock(null);
        }
    }
}
