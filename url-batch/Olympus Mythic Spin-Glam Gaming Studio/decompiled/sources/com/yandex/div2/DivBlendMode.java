package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBlendMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivBlendMode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SOURCE_IN", "SOURCE_ATOP", "DARKEN", "LIGHTEN", "MULTIPLY", "SCREEN", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivBlendMode$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivBlendMode divBlendMode) {
            return DivBlendMode.INSTANCE.toString(divBlendMode);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivBlendMode$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivBlendMode invoke(@NotNull String str) {
            return DivBlendMode.INSTANCE.fromString(str);
        }
    };

    DivBlendMode(String str) {
        this.value = str;
    }

    /* compiled from: DivBlendMode.kt */
    /* renamed from: com.yandex.div2.DivBlendMode$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivBlendMode divBlendMode) {
            return divBlendMode.value;
        }

        public final DivBlendMode fromString(String str) {
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (Intrinsics.areEqual(str, divBlendMode.value)) {
                return divBlendMode;
            }
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            if (Intrinsics.areEqual(str, divBlendMode2.value)) {
                return divBlendMode2;
            }
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            if (Intrinsics.areEqual(str, divBlendMode3.value)) {
                return divBlendMode3;
            }
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            if (Intrinsics.areEqual(str, divBlendMode4.value)) {
                return divBlendMode4;
            }
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            if (Intrinsics.areEqual(str, divBlendMode5.value)) {
                return divBlendMode5;
            }
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            if (Intrinsics.areEqual(str, divBlendMode6.value)) {
                return divBlendMode6;
            }
            return null;
        }
    }
}
