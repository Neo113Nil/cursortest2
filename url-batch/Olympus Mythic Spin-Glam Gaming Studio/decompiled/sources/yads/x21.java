package yads;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes11.dex */
public final class x21 implements z31 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public x21(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // yads.z31
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.z31
    public final void a(Map map) {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new a41(map)));
    }
}
