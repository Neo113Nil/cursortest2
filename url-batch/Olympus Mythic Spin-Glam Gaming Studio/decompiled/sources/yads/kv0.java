package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class kv0 {
    public final Context a;
    public final Lazy b = LazyKt.lazy(new jv0(this));

    public kv0(Context context) {
        this.a = context;
    }

    public final Object a(String str, lv0 lv0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(lv0Var), 1);
        cancellableContinuationImpl.initCancellability();
        vq vqVar = new vq(str, new hv0(cancellableContinuationImpl), new iv0(cancellableContinuationImpl));
        vqVar.j = false;
        UUID randomUUID = UUID.randomUUID();
        vqVar.q = randomUUID;
        ((ep2) this.b.getValue()).a(vqVar);
        cancellableContinuationImpl.invokeOnCancellation(new gv0(this, randomUUID));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(lv0Var);
        }
        return result;
    }
}
