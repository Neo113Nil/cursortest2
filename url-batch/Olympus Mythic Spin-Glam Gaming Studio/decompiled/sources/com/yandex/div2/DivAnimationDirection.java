package com.yandex.div2;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivAnimationDirection.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivAnimationDirection;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NORMAL", "REVERSE", "ALTERNATE", "ALTERNATE_REVERSE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivAnimationDirection {
    NORMAL(Constants.NORMAL),
    REVERSE("reverse"),
    ALTERNATE(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE),
    ALTERNATE_REVERSE("alternate_reverse");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAnimationDirection$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivAnimationDirection divAnimationDirection) {
            return DivAnimationDirection.INSTANCE.toString(divAnimationDirection);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAnimationDirection$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivAnimationDirection invoke(@NotNull String str) {
            return DivAnimationDirection.INSTANCE.fromString(str);
        }
    };

    DivAnimationDirection(String str) {
        this.value = str;
    }

    /* compiled from: DivAnimationDirection.kt */
    /* renamed from: com.yandex.div2.DivAnimationDirection$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivAnimationDirection divAnimationDirection) {
            return divAnimationDirection.value;
        }

        public final DivAnimationDirection fromString(String str) {
            DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
            if (Intrinsics.areEqual(str, divAnimationDirection.value)) {
                return divAnimationDirection;
            }
            DivAnimationDirection divAnimationDirection2 = DivAnimationDirection.REVERSE;
            if (Intrinsics.areEqual(str, divAnimationDirection2.value)) {
                return divAnimationDirection2;
            }
            DivAnimationDirection divAnimationDirection3 = DivAnimationDirection.ALTERNATE;
            if (Intrinsics.areEqual(str, divAnimationDirection3.value)) {
                return divAnimationDirection3;
            }
            DivAnimationDirection divAnimationDirection4 = DivAnimationDirection.ALTERNATE_REVERSE;
            if (Intrinsics.areEqual(str, divAnimationDirection4.value)) {
                return divAnimationDirection4;
            }
            return null;
        }
    }
}
