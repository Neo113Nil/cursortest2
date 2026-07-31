package com.ogury.ad.internal;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.ogury.core.OguryError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class zh implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ CancellableContinuationImpl a;
    public final /* synthetic */ Bitmap b;

    public zh(CancellableContinuationImpl cancellableContinuationImpl, Bitmap bitmap) {
        this.a = cancellableContinuationImpl;
        this.b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        try {
            if (this.a.isActive()) {
                if (i == 0) {
                    CancellableContinuationImpl cancellableContinuationImpl = this.a;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(this.b));
                } else {
                    CancellableContinuationImpl cancellableContinuationImpl2 = this.a;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new OguryError(103, "PixelCopy failed: " + i))));
                }
            }
        } catch (Exception e) {
            if (this.a.isActive()) {
                CancellableContinuationImpl cancellableContinuationImpl3 = this.a;
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuationImpl3.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new OguryError(104, "PixelCopy callback failed: " + e.getMessage()))));
            }
        }
    }
}
