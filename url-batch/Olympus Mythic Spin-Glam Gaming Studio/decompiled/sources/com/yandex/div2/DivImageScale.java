package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivImageScale.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivImageScale;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "FILL", "NO_SCALE", "FIT", "STRETCH", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivImageScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivImageScale$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivImageScale divImageScale) {
            return DivImageScale.INSTANCE.toString(divImageScale);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivImageScale$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivImageScale invoke(@NotNull String str) {
            return DivImageScale.INSTANCE.fromString(str);
        }
    };

    DivImageScale(String str) {
        this.value = str;
    }

    /* compiled from: DivImageScale.kt */
    /* renamed from: com.yandex.div2.DivImageScale$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivImageScale divImageScale) {
            return divImageScale.value;
        }

        public final DivImageScale fromString(String str) {
            DivImageScale divImageScale = DivImageScale.FILL;
            if (Intrinsics.areEqual(str, divImageScale.value)) {
                return divImageScale;
            }
            DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
            if (Intrinsics.areEqual(str, divImageScale2.value)) {
                return divImageScale2;
            }
            DivImageScale divImageScale3 = DivImageScale.FIT;
            if (Intrinsics.areEqual(str, divImageScale3.value)) {
                return divImageScale3;
            }
            DivImageScale divImageScale4 = DivImageScale.STRETCH;
            if (Intrinsics.areEqual(str, divImageScale4.value)) {
                return divImageScale4;
            }
            return null;
        }
    }
}
