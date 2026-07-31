package com.yandex.div.evaluable.types;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0005J\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0005J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/evaluable/types/Color;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "alpha", "alpha-impl", "blue", "blue-impl", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "green", "green-impl", "hashCode", "hashCode-impl", "red", "red-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Color {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* renamed from: alpha-impl, reason: not valid java name */
    public static final int m7322alphaimpl(int i) {
        return i >>> 24;
    }

    /* renamed from: blue-impl, reason: not valid java name */
    public static final int m7323blueimpl(int i) {
        return i & 255;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m7324boximpl(int i) {
        return new Color(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7325constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7326equalsimpl(int i, Object obj) {
        return (obj instanceof Color) && i == ((Color) obj).m7332unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7327equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: green-impl, reason: not valid java name */
    public static final int m7328greenimpl(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7329hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: red-impl, reason: not valid java name */
    public static final int m7330redimpl(int i) {
        return (i >> 16) & 255;
    }

    public boolean equals(Object obj) {
        return m7326equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7329hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7332unboximpl() {
        return this.value;
    }

    private /* synthetic */ Color(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return m7331toStringimpl(this.value);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7331toStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        String upperCase = StringsKt.padStart(hexString, 8, '0').toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase);
        return sb.toString();
    }

    /* compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/evaluable/types/Color$Companion;", "", "()V", "argb", "Lcom/yandex/div/evaluable/types/Color;", "alpha", "", "red", "green", "blue", "argb-H0kstlE", "(IIII)I", "parse", "colorString", "", "parse-C4zCDoM", "(Ljava/lang/String;)I", "rgb", "rgb-B7-1Z8I", "(III)I", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m7333argbH0kstlE(int alpha, int red, int green, int blue) {
            return Color.m7325constructorimpl((alpha << 24) | (red << 16) | (green << 8) | blue);
        }

        /* renamed from: rgb-B7-1Z8I, reason: not valid java name */
        public final int m7335rgbB71Z8I(int red, int green, int blue) {
            return m7333argbH0kstlE(255, red, green, blue);
        }

        /* renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m7334parseC4zCDoM(@NotNull String colorString) throws IllegalArgumentException, NumberFormatException {
            String str;
            Intrinsics.checkNotNullParameter(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException(("Unknown color " + colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char charAt = colorString.charAt(1);
                char charAt2 = colorString.charAt(2);
                char charAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
            } else if (length == 5) {
                char charAt4 = colorString.charAt(1);
                char charAt5 = colorString.charAt(2);
                char charAt6 = colorString.charAt(3);
                char charAt7 = colorString.charAt(4);
                str = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            } else if (length == 7) {
                StringBuilder sb = new StringBuilder();
                sb.append("ff");
                String substring = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (length == 9) {
                str = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            } else {
                throw new IllegalArgumentException("Unknown color " + colorString);
            }
            return Color.m7325constructorimpl((int) Long.parseLong(str, CharsKt.checkRadix(16)));
        }
    }
}
