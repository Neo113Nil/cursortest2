package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.Menu.kt */
@Deprecated(message = "Switch to DropdownMenu")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/composables/core/MenuScope;", "", "state", "Lcom/composables/core/MenuState;", "<init>", "(Lcom/composables/core/MenuState;)V", "<set-?>", "menuState", "getMenuState$core_release", "()Lcom/composables/core/MenuState;", "setMenuState$core_release", "menuState$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MenuScope {
    public static final int $stable = 0;

    /* renamed from: menuState$delegate, reason: from kotlin metadata */
    private final MutableState menuState;

    public MenuScope(MenuState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(state, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MenuState getMenuState$core_release() {
        return (MenuState) this.menuState.getValue();
    }

    public final void setMenuState$core_release(MenuState menuState) {
        Intrinsics.checkNotNullParameter(menuState, "<set-?>");
        this.menuState.setValue(menuState);
    }
}
