package io.bidmachine.utils;

import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SafeExecutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/bidmachine/utils/ClickPostMethod;", "Lio/bidmachine/util/SafeExecutable;", "Lio/bidmachine/util/ProcessUrlResult;", "callback", "Lio/bidmachine/unified/UnifiedAdCallback;", "iabClickCallback", "Lio/bidmachine/iab/utils/IabClickCallback;", "(Lio/bidmachine/unified/UnifiedAdCallback;Lio/bidmachine/iab/utils/IabClickCallback;)V", "onExecute", "", "input", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickPostMethod implements SafeExecutable<ProcessUrlResult> {

    @NotNull
    private final UnifiedAdCallback callback;

    @NotNull
    private final IabClickCallback iabClickCallback;

    public ClickPostMethod(@NotNull UnifiedAdCallback callback, @NotNull IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        this.callback = callback;
        this.iabClickCallback = iabClickCallback;
    }

    @Override // io.bidmachine.util.SafeExecutable
    public void onExecute(@NotNull ProcessUrlResult input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getIsSuccess()) {
            this.iabClickCallback.clickVerified();
            this.callback.onAdClicked(input.getSystemComponent());
        }
        this.iabClickCallback.clickHandled();
    }
}
