package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/composables/core/BottomSheetScope;", "", "state", "Lcom/composables/core/BottomSheetState;", ViewProps.ENABLED, "", "<init>", "(Lcom/composables/core/BottomSheetState;Z)V", "getState$core_release", "()Lcom/composables/core/BottomSheetState;", "<set-?>", "getEnabled$core_release", "()Z", "setEnabled$core_release", "(Z)V", "enabled$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetScope {
    public static final int $stable = 8;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private final BottomSheetState state;

    public BottomSheetScope(BottomSheetState state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    /* renamed from: getState$core_release, reason: from getter */
    public final BottomSheetState getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled$core_release() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    public final void setEnabled$core_release(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
    }
}
