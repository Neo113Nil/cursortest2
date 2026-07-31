package com.inmobi.media;

import com.squareup.picasso.Callback;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4377u implements Callback {
    public final /* synthetic */ C4430w a;
    public final /* synthetic */ CancellableContinuationImpl b;

    public C4377u(C4430w c4430w, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = c4430w;
        this.b = cancellableContinuationImpl;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C4493y9 c4493y9 = this.a.d;
        if (c4493y9 != null) {
            c4493y9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        X4.a(this.b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C4493y9 c4493y9 = this.a.d;
        if (c4493y9 != null) {
            c4493y9.a("AdChoiceViewManager", "onSuccess Called");
        }
        X4.a(this.b, Boolean.TRUE);
    }
}
