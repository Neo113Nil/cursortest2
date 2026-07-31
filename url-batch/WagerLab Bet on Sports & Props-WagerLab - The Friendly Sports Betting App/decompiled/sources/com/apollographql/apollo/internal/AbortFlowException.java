package com.apollographql.apollo.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: flows.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "checkOwnership", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AbortFlowException extends CancellationException {
    private final FlowCollector<?> owner;

    public final FlowCollector<?> getOwner() {
        return this.owner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortFlowException(FlowCollector<?> owner) {
        super("Flow was aborted, no more elements needed");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    public final void checkOwnership(FlowCollector<?> owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.owner != owner) {
            throw this;
        }
    }
}
