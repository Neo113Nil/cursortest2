package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dialog.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tR+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/composables/core/DialogState;", "", "initiallyVisible", "", "<init>", "(Z)V", ViewProps.VISIBLE, "____deprecated_constructor", "", "(ZLkotlin/Unit;)V", "<set-?>", "getVisible", "()Z", "setVisible", "visible$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogState {
    public static final int $stable = 0;

    /* renamed from: visible$delegate, reason: from kotlin metadata */
    private final MutableState visible;

    public DialogState() {
        this(false, 1, null);
    }

    public DialogState(boolean z) {
        this.visible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    public /* synthetic */ DialogState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ DialogState(boolean z, Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, unit);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor will go away in future versions of the library. Use the respective remember function instead", replaceWith = @ReplaceWith(expression = "rememberDialogState(visible)", imports = {}))
    public DialogState(boolean z, Unit ____deprecated_constructor) {
        this(z);
        Intrinsics.checkNotNullParameter(____deprecated_constructor, "____deprecated_constructor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.visible.setValue(Boolean.valueOf(z));
    }
}
