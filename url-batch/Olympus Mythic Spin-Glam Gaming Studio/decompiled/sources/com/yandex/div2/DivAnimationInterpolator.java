package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivAnimationInterpolator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivAnimationInterpolator;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "LINEAR", "EASE", "EASE_IN", "EASE_OUT", "EASE_IN_OUT", "SPRING", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    @NotNull
    private final String value;

    /* renamed from: Converter, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
            return DivAnimationInterpolator.INSTANCE.toString(divAnimationInterpolator);
        }
    };

    @NotNull
    public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DivAnimationInterpolator invoke(@NotNull String str) {
            return DivAnimationInterpolator.INSTANCE.fromString(str);
        }
    };

    DivAnimationInterpolator(String str) {
        this.value = str;
    }

    /* compiled from: DivAnimationInterpolator.kt */
    /* renamed from: com.yandex.div2.DivAnimationInterpolator$Converter, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toString(DivAnimationInterpolator divAnimationInterpolator) {
            return divAnimationInterpolator.value;
        }

        public final DivAnimationInterpolator fromString(String str) {
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (Intrinsics.areEqual(str, divAnimationInterpolator.value)) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (Intrinsics.areEqual(str, divAnimationInterpolator2.value)) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (Intrinsics.areEqual(str, divAnimationInterpolator3.value)) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (Intrinsics.areEqual(str, divAnimationInterpolator4.value)) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (Intrinsics.areEqual(str, divAnimationInterpolator5.value)) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (Intrinsics.areEqual(str, divAnimationInterpolator6.value)) {
                return divAnimationInterpolator6;
            }
            return null;
        }
    }
}
