package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivSizeUnit.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivSizeUnit;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "DP", "SP", "PX", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivSizeUnit {
    DP("dp"),
    SP("sp"),
    PX("px");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivSizeUnit$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivSizeUnit divSizeUnit) {
            return DivSizeUnit.INSTANCE.toString(divSizeUnit);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivSizeUnit$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivSizeUnit invoke(@NotNull String str) {
            return DivSizeUnit.INSTANCE.fromString(str);
        }
    };

    DivSizeUnit(String str) {
        this.value = str;
    }

    /* compiled from: DivSizeUnit.kt */
    /* renamed from: com.yandex.div2.DivSizeUnit$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivSizeUnit divSizeUnit) {
            return divSizeUnit.value;
        }

        public final DivSizeUnit fromString(String str) {
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (Intrinsics.areEqual(str, divSizeUnit.value)) {
                return divSizeUnit;
            }
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            if (Intrinsics.areEqual(str, divSizeUnit2.value)) {
                return divSizeUnit2;
            }
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            if (Intrinsics.areEqual(str, divSizeUnit3.value)) {
                return divSizeUnit3;
            }
            return null;
        }
    }
}
