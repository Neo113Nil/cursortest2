package com.composables.core.androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragFinishedSignal;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AnchoredDragFinishedSignal extends CancellationException {
    public AnchoredDragFinishedSignal() {
        super("Drag finished");
    }
}
