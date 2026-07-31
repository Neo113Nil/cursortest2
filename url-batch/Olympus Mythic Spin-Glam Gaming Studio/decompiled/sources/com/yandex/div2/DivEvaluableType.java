package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivEvaluableType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/DivEvaluableType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "STRING", "INTEGER", "NUMBER", "BOOLEAN", "DATETIME", "COLOR", "URL", "DICT", "ARRAY", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum DivEvaluableType {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivEvaluableType$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivEvaluableType divEvaluableType) {
            return DivEvaluableType.INSTANCE.toString(divEvaluableType);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivEvaluableType$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivEvaluableType invoke(@NotNull String str) {
            return DivEvaluableType.INSTANCE.fromString(str);
        }
    };

    DivEvaluableType(String str) {
        this.value = str;
    }

    /* compiled from: DivEvaluableType.kt */
    /* renamed from: com.yandex.div2.DivEvaluableType$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivEvaluableType divEvaluableType) {
            return divEvaluableType.value;
        }

        public final DivEvaluableType fromString(String str) {
            DivEvaluableType divEvaluableType = DivEvaluableType.STRING;
            if (Intrinsics.areEqual(str, divEvaluableType.value)) {
                return divEvaluableType;
            }
            DivEvaluableType divEvaluableType2 = DivEvaluableType.INTEGER;
            if (Intrinsics.areEqual(str, divEvaluableType2.value)) {
                return divEvaluableType2;
            }
            DivEvaluableType divEvaluableType3 = DivEvaluableType.NUMBER;
            if (Intrinsics.areEqual(str, divEvaluableType3.value)) {
                return divEvaluableType3;
            }
            DivEvaluableType divEvaluableType4 = DivEvaluableType.BOOLEAN;
            if (Intrinsics.areEqual(str, divEvaluableType4.value)) {
                return divEvaluableType4;
            }
            DivEvaluableType divEvaluableType5 = DivEvaluableType.DATETIME;
            if (Intrinsics.areEqual(str, divEvaluableType5.value)) {
                return divEvaluableType5;
            }
            DivEvaluableType divEvaluableType6 = DivEvaluableType.COLOR;
            if (Intrinsics.areEqual(str, divEvaluableType6.value)) {
                return divEvaluableType6;
            }
            DivEvaluableType divEvaluableType7 = DivEvaluableType.URL;
            if (Intrinsics.areEqual(str, divEvaluableType7.value)) {
                return divEvaluableType7;
            }
            DivEvaluableType divEvaluableType8 = DivEvaluableType.DICT;
            if (Intrinsics.areEqual(str, divEvaluableType8.value)) {
                return divEvaluableType8;
            }
            DivEvaluableType divEvaluableType9 = DivEvaluableType.ARRAY;
            if (Intrinsics.areEqual(str, divEvaluableType9.value)) {
                return divEvaluableType9;
            }
            return null;
        }
    }
}
