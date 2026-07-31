package com.yandex.div2;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivContentAlignmentHorizontal.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/DivContentAlignmentHorizontal;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "LEFT", "CENTER", "RIGHT", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "END", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return DivContentAlignmentHorizontal.INSTANCE.toString(divContentAlignmentHorizontal);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivContentAlignmentHorizontal invoke(@NotNull String str) {
            return DivContentAlignmentHorizontal.INSTANCE.fromString(str);
        }
    };

    DivContentAlignmentHorizontal(String str) {
        this.value = str;
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    /* renamed from: com.yandex.div2.DivContentAlignmentHorizontal$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return divContentAlignmentHorizontal.value;
        }

        public final DivContentAlignmentHorizontal fromString(String str) {
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal.value)) {
                return divContentAlignmentHorizontal;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal2.value)) {
                return divContentAlignmentHorizontal2;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal3.value)) {
                return divContentAlignmentHorizontal3;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal4.value)) {
                return divContentAlignmentHorizontal4;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal5.value)) {
                return divContentAlignmentHorizontal5;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal6.value)) {
                return divContentAlignmentHorizontal6;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal7.value)) {
                return divContentAlignmentHorizontal7;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
            if (Intrinsics.areEqual(str, divContentAlignmentHorizontal8.value)) {
                return divContentAlignmentHorizontal8;
            }
            return null;
        }
    }
}
