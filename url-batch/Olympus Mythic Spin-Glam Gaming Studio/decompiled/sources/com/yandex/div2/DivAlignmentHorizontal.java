package com.yandex.div2;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivAlignmentHorizontal.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivAlignmentHorizontal;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "LEFT", "CENTER", "RIGHT", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "END", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum DivAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivAlignmentHorizontal divAlignmentHorizontal) {
            return DivAlignmentHorizontal.INSTANCE.toString(divAlignmentHorizontal);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivAlignmentHorizontal invoke(@NotNull String str) {
            return DivAlignmentHorizontal.INSTANCE.fromString(str);
        }
    };

    DivAlignmentHorizontal(String str) {
        this.value = str;
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    /* renamed from: com.yandex.div2.DivAlignmentHorizontal$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivAlignmentHorizontal divAlignmentHorizontal) {
            return divAlignmentHorizontal.value;
        }

        public final DivAlignmentHorizontal fromString(String str) {
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (Intrinsics.areEqual(str, divAlignmentHorizontal.value)) {
                return divAlignmentHorizontal;
            }
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            if (Intrinsics.areEqual(str, divAlignmentHorizontal2.value)) {
                return divAlignmentHorizontal2;
            }
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            if (Intrinsics.areEqual(str, divAlignmentHorizontal3.value)) {
                return divAlignmentHorizontal3;
            }
            DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
            if (Intrinsics.areEqual(str, divAlignmentHorizontal4.value)) {
                return divAlignmentHorizontal4;
            }
            DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
            if (Intrinsics.areEqual(str, divAlignmentHorizontal5.value)) {
                return divAlignmentHorizontal5;
            }
            return null;
        }
    }
}
