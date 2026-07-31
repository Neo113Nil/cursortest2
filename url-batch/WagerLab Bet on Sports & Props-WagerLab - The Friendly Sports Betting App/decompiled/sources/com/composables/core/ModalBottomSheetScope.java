package com.composables.core;

import androidx.compose.animation.core.MutableTransitionState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/composables/core/ModalBottomSheetScope;", "", "modalState", "Lcom/composables/core/ModalBottomSheetState;", "sheetState", "Lcom/composables/core/BottomSheetState;", "<init>", "(Lcom/composables/core/ModalBottomSheetState;Lcom/composables/core/BottomSheetState;)V", "getModalState$core_release", "()Lcom/composables/core/ModalBottomSheetState;", "getSheetState$core_release", "()Lcom/composables/core/BottomSheetState;", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "getVisibleState$core_release", "()Landroidx/compose/animation/core/MutableTransitionState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalBottomSheetScope {
    public static final int $stable = 8;
    private final ModalBottomSheetState modalState;
    private final BottomSheetState sheetState;
    private final MutableTransitionState<Boolean> visibleState;

    public ModalBottomSheetScope(ModalBottomSheetState modalState, BottomSheetState sheetState) {
        Intrinsics.checkNotNullParameter(modalState, "modalState");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        this.modalState = modalState;
        this.sheetState = sheetState;
        this.visibleState = new MutableTransitionState<>(false);
    }

    /* renamed from: getModalState$core_release, reason: from getter */
    public final ModalBottomSheetState getModalState() {
        return this.modalState;
    }

    /* renamed from: getSheetState$core_release, reason: from getter */
    public final BottomSheetState getSheetState() {
        return this.sheetState;
    }

    public final MutableTransitionState<Boolean> getVisibleState$core_release() {
        return this.visibleState;
    }
}
