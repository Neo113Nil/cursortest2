package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: deprecated.RadioGroup.kt */
@Deprecated(message = "Use the RadioGroup overload that takes the value directly instead")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/composeunstyled/RadioGroupState;", "", "selectedOption", "", "<init>", "(Ljava/lang/String;)V", "<set-?>", "getSelectedOption", "()Ljava/lang/String;", "setSelectedOption", "selectedOption$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioGroupState {
    public static final int $stable = 0;

    /* renamed from: selectedOption$delegate, reason: from kotlin metadata */
    private final MutableState selectedOption;

    /* JADX WARN: Multi-variable type inference failed */
    public RadioGroupState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RadioGroupState(String str) {
        this.selectedOption = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
    }

    public /* synthetic */ RadioGroupState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedOption() {
        return (String) this.selectedOption.getValue();
    }

    public final void setSelectedOption(String str) {
        this.selectedOption.setValue(str);
    }
}
