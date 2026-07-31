package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.util.ConvertUtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParsingConverters.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\u001a(\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004H\u0007\u001a$\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006`\u0004H\u0007\u001a$\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u0004H\u0007\u001a$\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0001j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\u0004H\u0007\u001a$\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u0001j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e`\u0004H\u0007\u001a,\u0010\u0017\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b`\u0004H\u0007\u001a$\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0001j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006`\u0004H\u0007\u001a$\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0001j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\u0004H\u0007\u001aH\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001b*\"\u0012\u0004\u0012\u0002H\u001c\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0\u0001j\u0010\u0012\u0004\u0012\u0002H\u001c\u0012\u0006\u0012\u0004\u0018\u0001H\u001b`\u00042\u0006\u0010\u001d\u001a\u0002H\u001cH\u0081\b¢\u0006\u0002\u0010\u001e\"0\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0001j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u0001j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"4\u0010\u000f\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0001j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\",\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0001j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000*.\u0010\u001f\u001a\u0004\b\u0000\u0010\u001c\u001a\u0004\b\u0001\u0010\u001b\"\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001b0\u00012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001b0\u0001¨\u0006 "}, d2 = {"ANY_TO_BOOLEAN", "Lkotlin/Function1;", "", "", "Lcom/yandex/div/internal/parser/Converter;", "ANY_TO_URI", "Landroid/net/Uri;", "COLOR_INT_TO_STRING", "", "", "NUMBER_TO_DOUBLE", "", "", "NUMBER_TO_INT", "", "STRING_TO_COLOR_INT", "STRING_TO_URI", "URI_TO_STRING", "getANY_TO_BOOLEAN", "getANY_TO_URI", "getCOLOR_INT_TO_STRING", "getNUMBER_TO_DOUBLE", "getNUMBER_TO_INT", "getSTRING_TO_COLOR_INT", "getSTRING_TO_URI", "getURI_TO_STRING", "tryConvert", "R", "T", "value", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "Converter", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParsingConvertersKt {

    @NotNull
    public static final Function1 COLOR_INT_TO_STRING = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$COLOR_INT_TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        @NotNull
        public final String invoke(int i) {
            return Color.m7331toStringimpl(Color.m7325constructorimpl(i));
        }
    };

    @NotNull
    public static final Function1 STRING_TO_COLOR_INT = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_COLOR_INT$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Integer invoke(@Nullable Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(Color.Companion.m7334parseC4zCDoM((String) obj));
            }
            if (obj instanceof Color) {
                return Integer.valueOf(((Color) obj).m7332unboximpl());
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1 URI_TO_STRING = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$URI_TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull Uri uri) {
            return uri.toString();
        }
    };

    @NotNull
    public static final Function1 STRING_TO_URI = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_URI$1
        @Override // kotlin.jvm.functions.Function1
        public final Uri invoke(@NotNull String str) {
            return Uri.parse(str);
        }
    };

    @NotNull
    public static final Function1 ANY_TO_URI = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_URI$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Uri invoke(@NotNull Object obj) {
            if (obj instanceof String) {
                return Uri.parse((String) obj);
            }
            if (obj instanceof Url) {
                return Uri.parse(((Url) obj).m7342unboximpl());
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1 ANY_TO_BOOLEAN = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_BOOLEAN$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Boolean invoke(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return ConvertUtilsKt.toBoolean((Number) obj);
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1 NUMBER_TO_DOUBLE = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_DOUBLE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Double invoke(@NotNull Number number) {
            return Double.valueOf(number.doubleValue());
        }
    };

    @NotNull
    public static final Function1 NUMBER_TO_INT = new Function1() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_INT$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Long invoke(@NotNull Number number) {
            return Long.valueOf(number.longValue());
        }
    };

    @Nullable
    public static final <T, R> R tryConvert(@NotNull Function1 function1, T t) {
        try {
            return (R) function1.invoke(t);
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    @NotNull
    public static final Function1 getCOLOR_INT_TO_STRING() {
        return COLOR_INT_TO_STRING;
    }

    @Deprecated
    @NotNull
    public static final Function1 getSTRING_TO_COLOR_INT() {
        return STRING_TO_COLOR_INT;
    }

    @Deprecated
    @NotNull
    public static final Function1 getURI_TO_STRING() {
        return URI_TO_STRING;
    }

    @Deprecated
    @NotNull
    public static final Function1 getSTRING_TO_URI() {
        return STRING_TO_URI;
    }

    @Deprecated
    @NotNull
    public static final Function1 getANY_TO_URI() {
        return ANY_TO_URI;
    }

    @Deprecated
    @NotNull
    public static final Function1 getANY_TO_BOOLEAN() {
        return ANY_TO_BOOLEAN;
    }

    @Deprecated
    @NotNull
    public static final Function1 getNUMBER_TO_DOUBLE() {
        return NUMBER_TO_DOUBLE;
    }

    @Deprecated
    @NotNull
    public static final Function1 getNUMBER_TO_INT() {
        return NUMBER_TO_INT;
    }
}
