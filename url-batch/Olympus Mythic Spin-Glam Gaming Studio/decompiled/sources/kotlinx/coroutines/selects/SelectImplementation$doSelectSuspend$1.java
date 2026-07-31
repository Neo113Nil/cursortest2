package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Select.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
/* loaded from: classes8.dex */
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectImplementation$doSelectSuspend$1(SelectImplementation selectImplementation, Continuation continuation) {
        super(continuation);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object doSelectSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doSelectSuspend = this.this$0.doSelectSuspend(this);
        return doSelectSuspend;
    }
}
