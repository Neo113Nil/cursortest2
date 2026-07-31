package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadioGroup.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRC\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/composeunstyled/InnerRadioGroupState;", "", "<init>", "()V", "<set-?>", "", "value", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function1;", "", "onValueChange", "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange$delegate", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class InnerRadioGroupState {

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onValueChange$delegate, reason: from kotlin metadata */
    private final MutableState onValueChange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function1() { // from class: com.composeunstyled.InnerRadioGroupState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit onValueChange_delegate$lambda$0;
            onValueChange_delegate$lambda$0 = InnerRadioGroupState.onValueChange_delegate$lambda$0((String) obj);
            return onValueChange_delegate$lambda$0;
        }
    }, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final String getValue() {
        return (String) this.value.getValue();
    }

    public final void setValue(String str) {
        this.value.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onValueChange_delegate$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnValueChange() {
        return (Function1) this.onValueChange.getValue();
    }

    public final void setOnValueChange(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange.setValue(function1);
    }
}
