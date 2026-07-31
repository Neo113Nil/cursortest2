package io.grpc.internal;

import javax.annotation.Nullable;

/* loaded from: classes7.dex */
interface TransportProvider {
    @Nullable
    ClientTransport obtainActiveTransport();
}
