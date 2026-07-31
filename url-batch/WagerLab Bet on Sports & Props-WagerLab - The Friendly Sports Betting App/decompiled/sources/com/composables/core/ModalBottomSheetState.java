package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001cR!\u0010\u001f\u001a\u00020 8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b)\u0010$¨\u0006/"}, d2 = {"Lcom/composables/core/ModalBottomSheetState;", "", "bottomSheetDetent", "Lcom/composables/core/SheetDetent;", "bottomSheetState", "Lcom/composables/core/BottomSheetState;", "<init>", "(Lcom/composables/core/SheetDetent;Lcom/composables/core/BottomSheetState;)V", "getBottomSheetDetent$core_release", "()Lcom/composables/core/SheetDetent;", "getBottomSheetState$core_release", "()Lcom/composables/core/BottomSheetState;", "<set-?>", "modalDetent", "getModalDetent$core_release", "setModalDetent$core_release", "(Lcom/composables/core/SheetDetent;)V", "modalDetent$delegate", "Landroidx/compose/runtime/MutableState;", "value", "currentDetent", "getCurrentDetent", "setCurrentDetent", "targetDetent", "getTargetDetent", "setTargetDetent", "isIdle", "", "()Z", "isIdle$delegate", "Landroidx/compose/runtime/State;", "progress", "", "getProgress$annotations", "()V", "getProgress", "()F", "progress$delegate", "from", "to", "offset", "getOffset", "offset$delegate", "animateTo", "", "(Lcom/composables/core/SheetDetent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpTo", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalBottomSheetState {
    public static final int $stable = 8;
    private final SheetDetent bottomSheetDetent;
    private final BottomSheetState bottomSheetState;

    /* renamed from: isIdle$delegate, reason: from kotlin metadata */
    private final State isIdle;

    /* renamed from: modalDetent$delegate, reason: from kotlin metadata */
    private final MutableState modalDetent;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final State offset;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final State progress;

    @Deprecated(message = "Use the progress function and provide the detents you need instead.")
    public static /* synthetic */ void getProgress$annotations() {
    }

    public ModalBottomSheetState(SheetDetent bottomSheetDetent, BottomSheetState bottomSheetState) {
        Intrinsics.checkNotNullParameter(bottomSheetDetent, "bottomSheetDetent");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.bottomSheetDetent = bottomSheetDetent;
        this.bottomSheetState = bottomSheetState;
        this.modalDetent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bottomSheetDetent, null, 2, null);
        this.isIdle = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.ModalBottomSheetState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean isIdle_delegate$lambda$0;
                isIdle_delegate$lambda$0 = ModalBottomSheetState.isIdle_delegate$lambda$0(ModalBottomSheetState.this);
                return Boolean.valueOf(isIdle_delegate$lambda$0);
            }
        });
        this.progress = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.ModalBottomSheetState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float progress_delegate$lambda$1;
                progress_delegate$lambda$1 = ModalBottomSheetState.progress_delegate$lambda$1(ModalBottomSheetState.this);
                return Float.valueOf(progress_delegate$lambda$1);
            }
        });
        this.offset = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.ModalBottomSheetState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float offset_delegate$lambda$2;
                offset_delegate$lambda$2 = ModalBottomSheetState.offset_delegate$lambda$2(ModalBottomSheetState.this);
                return Float.valueOf(offset_delegate$lambda$2);
            }
        });
    }

    /* renamed from: getBottomSheetDetent$core_release, reason: from getter */
    public final SheetDetent getBottomSheetDetent() {
        return this.bottomSheetDetent;
    }

    /* renamed from: getBottomSheetState$core_release, reason: from getter */
    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SheetDetent getModalDetent$core_release() {
        return (SheetDetent) this.modalDetent.getValue();
    }

    public final void setModalDetent$core_release(SheetDetent sheetDetent) {
        Intrinsics.checkNotNullParameter(sheetDetent, "<set-?>");
        this.modalDetent.setValue(sheetDetent);
    }

    public final SheetDetent getCurrentDetent() {
        return getModalDetent$core_release();
    }

    @Deprecated(message = "This setter will go away in a future version of the library. Set the value to targetDetent instead", replaceWith = @ReplaceWith(expression = "targetDetent", imports = {}))
    public final void setCurrentDetent(SheetDetent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.bottomSheetState.getCurrentDetent(), SheetDetent.INSTANCE.getHidden()) || !Intrinsics.areEqual(this.bottomSheetState.getTargetDetent(), SheetDetent.INSTANCE.getHidden())) {
            this.bottomSheetState.setTargetDetent(value);
        } else {
            setModalDetent$core_release(value);
        }
    }

    public final SheetDetent getTargetDetent() {
        return this.bottomSheetState.getTargetDetent();
    }

    public final void setTargetDetent(SheetDetent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.bottomSheetState.getCurrentDetent(), SheetDetent.INSTANCE.getHidden()) || !Intrinsics.areEqual(this.bottomSheetState.getTargetDetent(), SheetDetent.INSTANCE.getHidden())) {
            this.bottomSheetState.setTargetDetent(value);
        } else {
            setModalDetent$core_release(value);
        }
    }

    public final boolean isIdle() {
        return ((Boolean) this.isIdle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isIdle_delegate$lambda$0(ModalBottomSheetState modalBottomSheetState) {
        return Intrinsics.areEqual(modalBottomSheetState.getCurrentDetent(), modalBottomSheetState.getTargetDetent()) && !modalBottomSheetState.bottomSheetState.getAnchoredDraggableState$core_release().isAnimationRunning();
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float progress_delegate$lambda$1(ModalBottomSheetState modalBottomSheetState) {
        return modalBottomSheetState.bottomSheetState.getProgress();
    }

    public final float progress(SheetDetent from, SheetDetent to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return this.bottomSheetState.progress(from, to);
    }

    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float offset_delegate$lambda$2(ModalBottomSheetState modalBottomSheetState) {
        return modalBottomSheetState.bottomSheetState.getOffset();
    }

    public final Object animateTo(SheetDetent sheetDetent, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(this.bottomSheetState.getCurrentDetent(), SheetDetent.INSTANCE.getHidden()) || !Intrinsics.areEqual(this.bottomSheetState.getTargetDetent(), SheetDetent.INSTANCE.getHidden())) {
            Object animateTo = this.bottomSheetState.animateTo(sheetDetent, continuation);
            return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
        }
        setModalDetent$core_release(sheetDetent);
        return Unit.INSTANCE;
    }

    public final void jumpTo(SheetDetent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.bottomSheetState.getCurrentDetent(), SheetDetent.INSTANCE.getHidden()) || !Intrinsics.areEqual(this.bottomSheetState.getTargetDetent(), SheetDetent.INSTANCE.getHidden())) {
            this.bottomSheetState.jumpTo(value);
        } else {
            setModalDetent$core_release(value);
        }
    }
}
