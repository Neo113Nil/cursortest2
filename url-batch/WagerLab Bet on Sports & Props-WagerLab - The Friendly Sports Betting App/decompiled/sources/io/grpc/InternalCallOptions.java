package io.grpc;

/* loaded from: classes7.dex */
public final class InternalCallOptions {
    private InternalCallOptions() {
    }

    public static Boolean getWaitForReady(CallOptions callOptions) {
        return callOptions.getWaitForReady();
    }
}
