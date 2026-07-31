package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Flow.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "collect")
/* loaded from: classes15.dex */
final class AbstractFlow$collect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractFlow$collect$1(AbstractFlow abstractFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = abstractFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
