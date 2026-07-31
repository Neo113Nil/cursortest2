package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivContentAlignmentVertical.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivContentAlignmentVertical;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TOP", "CENTER", "BOTTOM", "BASELINE", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public enum DivContentAlignmentVertical {
    TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivContentAlignmentVertical divContentAlignmentVertical) {
            return DivContentAlignmentVertical.INSTANCE.toString(divContentAlignmentVertical);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivContentAlignmentVertical invoke(@NotNull String str) {
            return DivContentAlignmentVertical.INSTANCE.fromString(str);
        }
    };

    DivContentAlignmentVertical(String str) {
        this.value = str;
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    /* renamed from: com.yandex.div2.DivContentAlignmentVertical$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivContentAlignmentVertical divContentAlignmentVertical) {
            return divContentAlignmentVertical.value;
        }

        public final DivContentAlignmentVertical fromString(String str) {
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical.value)) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical2.value)) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical3.value)) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical4.value)) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical5.value)) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical6.value)) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (Intrinsics.areEqual(str, divContentAlignmentVertical7.value)) {
                return divContentAlignmentVertical7;
            }
            return null;
        }
    }
}
