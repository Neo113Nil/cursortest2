package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVideoScale.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivVideoScale;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "FILL", "NO_SCALE", "FIT", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public enum DivVideoScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivVideoScale$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivVideoScale divVideoScale) {
            return DivVideoScale.INSTANCE.toString(divVideoScale);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivVideoScale$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivVideoScale invoke(@NotNull String str) {
            return DivVideoScale.INSTANCE.fromString(str);
        }
    };

    DivVideoScale(String str) {
        this.value = str;
    }

    /* compiled from: DivVideoScale.kt */
    /* renamed from: com.yandex.div2.DivVideoScale$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivVideoScale divVideoScale) {
            return divVideoScale.value;
        }

        public final DivVideoScale fromString(String str) {
            DivVideoScale divVideoScale = DivVideoScale.FILL;
            if (Intrinsics.areEqual(str, divVideoScale.value)) {
                return divVideoScale;
            }
            DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
            if (Intrinsics.areEqual(str, divVideoScale2.value)) {
                return divVideoScale2;
            }
            DivVideoScale divVideoScale3 = DivVideoScale.FIT;
            if (Intrinsics.areEqual(str, divVideoScale3.value)) {
                return divVideoScale3;
            }
            return null;
        }
    }
}
