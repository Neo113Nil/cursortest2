package com.yandex.div2;

import com.ironsource.Bd;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivLineStyle.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivLineStyle;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "SINGLE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE(Bd.d);


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivLineStyle$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivLineStyle divLineStyle) {
            return DivLineStyle.INSTANCE.toString(divLineStyle);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivLineStyle$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivLineStyle invoke(@NotNull String str) {
            return DivLineStyle.INSTANCE.fromString(str);
        }
    };

    DivLineStyle(String str) {
        this.value = str;
    }

    /* compiled from: DivLineStyle.kt */
    /* renamed from: com.yandex.div2.DivLineStyle$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivLineStyle divLineStyle) {
            return divLineStyle.value;
        }

        public final DivLineStyle fromString(String str) {
            DivLineStyle divLineStyle = DivLineStyle.NONE;
            if (Intrinsics.areEqual(str, divLineStyle.value)) {
                return divLineStyle;
            }
            DivLineStyle divLineStyle2 = DivLineStyle.SINGLE;
            if (Intrinsics.areEqual(str, divLineStyle2.value)) {
                return divLineStyle2;
            }
            return null;
        }
    }
}
