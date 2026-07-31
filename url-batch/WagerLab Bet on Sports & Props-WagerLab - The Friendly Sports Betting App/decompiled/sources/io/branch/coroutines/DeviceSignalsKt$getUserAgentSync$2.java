package io.branch.coroutines;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
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

/* compiled from: DeviceSignals.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.DeviceSignalsKt$getUserAgentSync$2", f = "DeviceSignals.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class DeviceSignalsKt$getUserAgentSync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSignalsKt$getUserAgentSync$2(Context context, Continuation<? super DeviceSignalsKt$getUserAgentSync$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSignalsKt$getUserAgentSync$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DeviceSignalsKt$getUserAgentSync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!TextUtils.isEmpty(Branch._userAgentString)) {
                BranchLogger.v("UserAgent cached " + Branch._userAgentString);
                return Branch._userAgentString;
            }
            String str = null;
            try {
                BranchLogger.v("Begin getUserAgentSync " + Thread.currentThread());
                WebView webView = new WebView(this.$context);
                str = webView.getSettings().getUserAgentString();
                webView.destroy();
                BranchLogger.v("End getUserAgentSync " + Thread.currentThread() + ' ' + str);
                return str;
            } catch (Exception e) {
                BranchLogger.e("Failed to retrieve userAgent string. " + e.getMessage());
                return str;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
