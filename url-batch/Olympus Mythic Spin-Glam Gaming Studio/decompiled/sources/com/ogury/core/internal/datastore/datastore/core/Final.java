package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/Final;", "T", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "finalException", "", "(Ljava/lang/Throwable;)V", "getFinalException", "()Ljava/lang/Throwable;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Final<T> extends State<T> {

    @NotNull
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(@NotNull Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.finalException = finalException;
    }

    @NotNull
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
