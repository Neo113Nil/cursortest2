package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x {
    public static final void a(@NotNull final MolocoInitializationListener molocoInitializationListener, @NotNull final MolocoInitStatus initStatus) {
        Intrinsics.checkNotNullParameter(molocoInitializationListener, "<this>");
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        com.moloco.sdk.internal.scheduling.d.a(new Function0() { // from class: com.moloco.sdk.internal.publisher.x$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return x.b(MolocoInitializationListener.this, initStatus);
            }
        });
    }

    public static final Unit b(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus molocoInitStatus) {
        molocoInitializationListener.onMolocoInitializationStatus(molocoInitStatus);
        return Unit.INSTANCE;
    }
}
