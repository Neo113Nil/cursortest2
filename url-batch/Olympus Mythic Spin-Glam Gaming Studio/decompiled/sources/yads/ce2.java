package yads;

import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class ce2 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce2(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.resume((AppSetIdInfo) obj, (Function1) null);
        return Unit.INSTANCE;
    }
}
