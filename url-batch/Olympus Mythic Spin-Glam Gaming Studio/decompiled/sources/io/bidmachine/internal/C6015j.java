package io.bidmachine.internal;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.utils.BMError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.internal.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6015j implements ExpirationHandler.Listener {
    private final AdProcessCallback a;

    public C6015j(AdProcessCallback adProcessCallback) {
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        this.a = adProcessCallback;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.a.processLoadFail(new BMError(BMError.TimeoutError, -1, "Creative loading timeout reached"));
    }
}
