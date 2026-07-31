package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVisibility.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivVisibility;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "VISIBLE", "INVISIBLE", "GONE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum DivVisibility {
    VISIBLE(VastAttributes.VISIBLE),
    INVISIBLE("invisible"),
    GONE("gone");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivVisibility$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivVisibility divVisibility) {
            return DivVisibility.INSTANCE.toString(divVisibility);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivVisibility$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivVisibility invoke(@NotNull String str) {
            return DivVisibility.INSTANCE.fromString(str);
        }
    };

    DivVisibility(String str) {
        this.value = str;
    }

    /* compiled from: DivVisibility.kt */
    /* renamed from: com.yandex.div2.DivVisibility$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivVisibility divVisibility) {
            return divVisibility.value;
        }

        public final DivVisibility fromString(String str) {
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (Intrinsics.areEqual(str, divVisibility.value)) {
                return divVisibility;
            }
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            if (Intrinsics.areEqual(str, divVisibility2.value)) {
                return divVisibility2;
            }
            DivVisibility divVisibility3 = DivVisibility.GONE;
            if (Intrinsics.areEqual(str, divVisibility3.value)) {
                return divVisibility3;
            }
            return null;
        }
    }
}
