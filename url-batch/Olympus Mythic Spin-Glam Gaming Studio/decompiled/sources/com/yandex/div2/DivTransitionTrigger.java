package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTransitionTrigger.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivTransitionTrigger;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "DATA_CHANGE", "STATE_CHANGE", "VISIBILITY_CHANGE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivTransitionTrigger divTransitionTrigger) {
            return DivTransitionTrigger.INSTANCE.toString(divTransitionTrigger);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivTransitionTrigger invoke(@NotNull String str) {
            return DivTransitionTrigger.INSTANCE.fromString(str);
        }
    };

    DivTransitionTrigger(String str) {
        this.value = str;
    }

    /* compiled from: DivTransitionTrigger.kt */
    /* renamed from: com.yandex.div2.DivTransitionTrigger$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivTransitionTrigger divTransitionTrigger) {
            return divTransitionTrigger.value;
        }

        public final DivTransitionTrigger fromString(String str) {
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionTrigger.value)) {
                return divTransitionTrigger;
            }
            DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionTrigger2.value)) {
                return divTransitionTrigger2;
            }
            DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
            if (Intrinsics.areEqual(str, divTransitionTrigger3.value)) {
                return divTransitionTrigger3;
            }
            return null;
        }
    }
}
