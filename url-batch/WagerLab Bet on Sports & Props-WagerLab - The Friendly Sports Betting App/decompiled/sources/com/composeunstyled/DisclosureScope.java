package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disclosure.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/composeunstyled/DisclosureScope;", "", "state", "Lcom/composeunstyled/DisclosureState;", "<init>", "(Lcom/composeunstyled/DisclosureState;)V", "<set-?>", "getState$core_release", "()Lcom/composeunstyled/DisclosureState;", "setState$core_release", "state$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclosureScope {
    public static final int $stable = 0;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final MutableState state;

    public DisclosureScope(DisclosureState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(state, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DisclosureState getState$core_release() {
        return (DisclosureState) this.state.getValue();
    }

    public final void setState$core_release(DisclosureState disclosureState) {
        Intrinsics.checkNotNullParameter(disclosureState, "<set-?>");
        this.state.setValue(disclosureState);
    }
}
