package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Disclosure.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/composeunstyled/DisclosureState;", "", "expanded", "", "<init>", "(Z)V", "<set-?>", "getExpanded", "()Z", "setExpanded", "expanded$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclosureState {
    public static final int $stable = 0;

    /* renamed from: expanded$delegate, reason: from kotlin metadata */
    private final MutableState expanded;

    public DisclosureState() {
        this(false, 1, null);
    }

    public DisclosureState(boolean z) {
        this.expanded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    public /* synthetic */ DisclosureState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpanded() {
        return ((Boolean) this.expanded.getValue()).booleanValue();
    }

    public final void setExpanded(boolean z) {
        this.expanded.setValue(Boolean.valueOf(z));
    }
}
