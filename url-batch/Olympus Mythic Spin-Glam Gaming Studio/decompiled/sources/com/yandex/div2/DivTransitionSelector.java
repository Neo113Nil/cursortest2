package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTransitionSelector.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivTransitionSelector;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "DATA_CHANGE", "STATE_CHANGE", "ANY_CHANGE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivTransitionSelector$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivTransitionSelector divTransitionSelector) {
            return DivTransitionSelector.INSTANCE.toString(divTransitionSelector);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivTransitionSelector$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivTransitionSelector invoke(@NotNull String str) {
            return DivTransitionSelector.INSTANCE.fromString(str);
        }
    };

    DivTransitionSelector(String str) {
        this.value = str;
    }

    /* compiled from: DivTransitionSelector.kt */
    /* renamed from: com.yandex.div2.DivTransitionSelector$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivTransitionSelector divTransitionSelector) {
            return divTransitionSelector.value;
        }

        public final DivTransitionSelector fromString(String str) {
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (Intrinsics.areEqual(str, divTransitionSelector.value)) {
                return divTransitionSelector;
            }
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionSelector2.value)) {
                return divTransitionSelector2;
            }
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionSelector3.value)) {
                return divTransitionSelector3;
            }
            DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionSelector4.value)) {
                return divTransitionSelector4;
            }
            return null;
        }
    }
}
