package com.inmobi.media;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes10.dex */
public final class Cl implements Callback {
    public final /* synthetic */ CancellableContinuationImpl a;

    public Cl(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "e");
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        if (cancellableContinuationImpl.isActive()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(t)));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        X4.a(this.a, response);
    }
}
