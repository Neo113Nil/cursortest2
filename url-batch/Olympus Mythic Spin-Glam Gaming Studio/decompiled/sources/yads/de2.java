package yads;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class de2 implements OnFailureListener {
    public final /* synthetic */ CancellableContinuationImpl a;

    public de2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.a.resume((Object) null, (Function1) null);
    }
}
