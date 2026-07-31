package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: deprecated.Menu.kt */
@Deprecated(message = "Switch to DropdownMenu")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/composables/core/MenuState;", "", "expanded", "", "<init>", "(Z)V", "<set-?>", "getExpanded", "()Z", "setExpanded", "expanded$delegate", "Landroidx/compose/runtime/MutableState;", "menuFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getMenuFocusRequester$core_release", "()Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/focus/FocusManager;", "currentFocusManager", "getCurrentFocusManager$core_release", "()Landroidx/compose/ui/focus/FocusManager;", "setCurrentFocusManager$core_release", "(Landroidx/compose/ui/focus/FocusManager;)V", "currentFocusManager$delegate", "hasMenuFocus", "getHasMenuFocus$core_release", "setHasMenuFocus$core_release", "hasMenuFocus$delegate", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MenuState {
    public static final int $stable = 0;

    /* renamed from: currentFocusManager$delegate, reason: from kotlin metadata */
    private final MutableState currentFocusManager;

    /* renamed from: expanded$delegate, reason: from kotlin metadata */
    private final MutableState expanded;

    /* renamed from: hasMenuFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasMenuFocus;
    private final FocusRequester menuFocusRequester;

    public MenuState() {
        this(false, 1, null);
    }

    public MenuState(boolean z) {
        this.expanded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.menuFocusRequester = new FocusRequester();
        this.currentFocusManager = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.hasMenuFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public /* synthetic */ MenuState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpanded() {
        return ((Boolean) this.expanded.getValue()).booleanValue();
    }

    public final void setExpanded(boolean z) {
        this.expanded.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getMenuFocusRequester$core_release, reason: from getter */
    public final FocusRequester getMenuFocusRequester() {
        return this.menuFocusRequester;
    }

    public final FocusManager getCurrentFocusManager$core_release() {
        return (FocusManager) this.currentFocusManager.getValue();
    }

    public final void setCurrentFocusManager$core_release(FocusManager focusManager) {
        this.currentFocusManager.setValue(focusManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasMenuFocus$core_release() {
        return ((Boolean) this.hasMenuFocus.getValue()).booleanValue();
    }

    public final void setHasMenuFocus$core_release(boolean z) {
        this.hasMenuFocus.setValue(Boolean.valueOf(z));
    }
}
