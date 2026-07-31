package com.composeunstyled;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.RadioGroup.kt */
@Deprecated(message = "Use the RadioGroup overload that takes the value directly instead")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/composeunstyled/RadioGroupScope;", "", "state", "Lcom/composeunstyled/RadioGroupState;", "<init>", "(Lcom/composeunstyled/RadioGroupState;)V", "getState", "()Lcom/composeunstyled/RadioGroupState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioGroupScope {
    public static final int $stable = 0;
    private final RadioGroupState state;

    public RadioGroupScope(RadioGroupState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public final RadioGroupState getState() {
        return this.state;
    }
}
