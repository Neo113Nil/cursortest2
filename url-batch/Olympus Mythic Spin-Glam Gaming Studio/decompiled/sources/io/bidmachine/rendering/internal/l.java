package io.bidmachine.rendering.internal;

import io.bidmachine.rendering.model.MethodParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends u {
    private final MethodParams c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MethodParams methodParams, io.bidmachine.rendering.internal.event.b eventCallback) {
        super(eventCallback);
        Intrinsics.checkNotNullParameter(methodParams, "methodParams");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.c = methodParams;
    }

    @Override // io.bidmachine.rendering.internal.u
    public String o() {
        return this.c.getName();
    }

    public final MethodParams p() {
        return this.c;
    }
}
