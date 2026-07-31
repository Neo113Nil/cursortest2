package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivAlignmentVertical.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivAlignmentVertical;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TOP", "CENTER", "BOTTOM", "BASELINE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public enum DivAlignmentVertical {
    TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivAlignmentVertical divAlignmentVertical) {
            return DivAlignmentVertical.INSTANCE.toString(divAlignmentVertical);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivAlignmentVertical invoke(@NotNull String str) {
            return DivAlignmentVertical.INSTANCE.fromString(str);
        }
    };

    DivAlignmentVertical(String str) {
        this.value = str;
    }

    /* compiled from: DivAlignmentVertical.kt */
    /* renamed from: com.yandex.div2.DivAlignmentVertical$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivAlignmentVertical divAlignmentVertical) {
            return divAlignmentVertical.value;
        }

        public final DivAlignmentVertical fromString(String str) {
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (Intrinsics.areEqual(str, divAlignmentVertical.value)) {
                return divAlignmentVertical;
            }
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            if (Intrinsics.areEqual(str, divAlignmentVertical2.value)) {
                return divAlignmentVertical2;
            }
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            if (Intrinsics.areEqual(str, divAlignmentVertical3.value)) {
                return divAlignmentVertical3;
            }
            DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
            if (Intrinsics.areEqual(str, divAlignmentVertical4.value)) {
                return divAlignmentVertical4;
            }
            return null;
        }
    }
}
