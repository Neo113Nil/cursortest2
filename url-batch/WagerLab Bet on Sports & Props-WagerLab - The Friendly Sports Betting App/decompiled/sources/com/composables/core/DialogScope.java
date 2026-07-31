package com.composables.core;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/composables/core/DialogScope;", "", "state", "Lcom/composables/core/DialogState;", "<init>", "(Lcom/composables/core/DialogState;)V", "<set-?>", "dialogState", "getDialogState$core_release", "()Lcom/composables/core/DialogState;", "setDialogState$core_release", "dialogState$delegate", "Landroidx/compose/runtime/MutableState;", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "getVisibleState$core_release", "()Landroidx/compose/animation/core/MutableTransitionState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogScope {
    public static final int $stable = 0;

    /* renamed from: dialogState$delegate, reason: from kotlin metadata */
    private final MutableState dialogState;
    private final MutableTransitionState<Boolean> visibleState;

    public DialogScope(DialogState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.dialogState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(state, null, 2, null);
        this.visibleState = new MutableTransitionState<>(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DialogState getDialogState$core_release() {
        return (DialogState) this.dialogState.getValue();
    }

    public final void setDialogState$core_release(DialogState dialogState) {
        Intrinsics.checkNotNullParameter(dialogState, "<set-?>");
        this.dialogState.setValue(dialogState);
    }

    public final MutableTransitionState<Boolean> getVisibleState$core_release() {
        return this.visibleState;
    }
}
