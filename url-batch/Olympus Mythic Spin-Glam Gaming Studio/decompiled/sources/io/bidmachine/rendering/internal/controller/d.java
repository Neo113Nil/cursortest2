package io.bidmachine.rendering.internal.controller;

import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends CancelableTask {
    private final io.bidmachine.rendering.internal.b b;

    public d(io.bidmachine.rendering.internal.b adElement) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        this.b = adElement;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
    public void runTask() {
        try {
            this.b.b();
        } catch (Throwable th) {
            k.b(th);
        }
    }
}
