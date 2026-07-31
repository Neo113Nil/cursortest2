package com.yandex.div.core.util.mask;

import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.yandex.div.core.util.mask.BaseInputMask;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CurrencyInputMask.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u00020\b2\n\u0010(\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0015H\u0016J\u000e\u0010+\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003J\f\u0010,\u001a\u00020\u000b*\u00020\u000bH\u0002J\u0014\u0010-\u001a\u00020\u0015*\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/yandex/div/core/util/mask/CurrencyInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", CommonUrlParts.LOCALE, "Ljava/util/Locale;", "onError", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Ljava/util/Locale;Lkotlin/jvm/functions/Function1;)V", "currencyFormatter", "Ljava/text/NumberFormat;", "currencyKey", "", "decimalFormatSymbols", "Ljava/text/DecimalFormatSymbols;", "getDecimalFormatSymbols", "()Ljava/text/DecimalFormatSymbols;", "separators", "", "withNbsp", "", "getWithNbsp", "(Ljava/lang/String;)Ljava/lang/String;", "applyChangeFrom", "newValue", X3.i.L, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "formatPattern", "pattern", "inDiff", "", "diff", "Lcom/yandex/div/core/util/mask/TextDiff;", "index", "invalidateMaskDataForFormatted", "forValue", "", "onException", TelemetryCategory.EXCEPTION, "overrideRawValue", "newRawValue", "updateCurrencyParams", "clearFormatter", "toValidFormat", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurrencyInputMask extends BaseInputMask {

    @NotNull
    private NumberFormat currencyFormatter;
    private final char currencyKey;

    @NotNull
    private final Function1 onError;

    @NotNull
    private final List<Character> separators;

    public CurrencyInputMask(@NotNull Locale locale, @NotNull Function1 function1) {
        super(new BaseInputMask.MaskData("", CollectionsKt.emptyList(), false));
        this.onError = function1;
        this.currencyKey = (char) 164;
        this.separators = CollectionsKt.listOf((Object[]) new Character[]{'.', ','});
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        NumberFormat numberFormat = this.currencyFormatter;
        Intrinsics.checkNotNull(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
    }

    private final String getWithNbsp(String str) {
        return StringsKt.replace$default(str, ' ', (char) 160, false, 4, (Object) null);
    }

    public final void updateCurrencyParams(@NotNull Locale locale) {
        String replace$default = StringsKt.replace$default(getRawValue(), getDecimalFormatSymbols().getDecimalSeparator(), '.', false, 4, (Object) null);
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
        BaseInputMask.applyChangeFrom$default(this, StringsKt.replace$default(replace$default, '.', getDecimalFormatSymbols().getDecimalSeparator(), false, 4, (Object) null), null, 2, null);
    }

    private final void invalidateMaskDataForFormatted(Number forValue) {
        String formatPattern = formatPattern(this.currencyFormatter.format(forValue));
        BaseInputMask.MaskKey maskKey = new BaseInputMask.MaskKey('#', "\\d", '0');
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(getDecimalFormatSymbols().getDecimalSeparator());
        sb.append(']');
        updateMaskData(new BaseInputMask.MaskData(formatPattern, CollectionsKt.listOf((Object[]) new BaseInputMask.MaskKey[]{maskKey, new BaseInputMask.MaskKey(decimalSeparator, sb.toString(), getDecimalFormatSymbols().getDecimalSeparator())}), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) {
        Number parse = this.currencyFormatter.parse(newRawValue);
        if (parse == null) {
            parse = 0;
        }
        invalidateMaskDataForFormatted(parse);
        super.overrideRawValue(newRawValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) {
        boolean z;
        String validFormat;
        String valueOf;
        Number parse;
        int abs;
        TextDiff build = TextDiff.INSTANCE.build(getValue(), getWithNbsp(newValue));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length = value.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (value.charAt(length) == decimalSeparator) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        length = -1;
        int length2 = newValue.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (newValue.charAt(length2) == decimalSeparator) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
            z = length == length2 || (length == -1 && length2 == -1);
            validFormat = toValidFormat(newValue, build);
            NumberFormat numberFormat = this.currencyFormatter;
            if (!StringsKt.startsWith$default((CharSequence) validFormat, decimalSeparator, false, 2, (Object) null)) {
                valueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
            } else {
                valueOf = StringsKt.isBlank(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
            }
            parse = numberFormat.parse(valueOf);
            if (parse == null) {
                parse = 0;
            }
            cleanup(build);
            if (z) {
                invalidateMaskDataForFormatted(parse);
            }
            BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
            if (getValue().length() > build.getStart() || getValue().charAt(build.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
                abs = Math.abs(getValue().length() - (newValue.length() - (position == null ? position.intValue() : getCursorPosition())));
            } else {
                abs = position != null ? position.intValue() : getCursorPosition();
            }
            setCursorPosition(RangesKt.coerceAtMost(abs, getValue().length()));
        }
        length2 = -1;
        if (length == length2) {
        }
        validFormat = toValidFormat(newValue, build);
        NumberFormat numberFormat2 = this.currencyFormatter;
        if (!StringsKt.startsWith$default((CharSequence) validFormat, decimalSeparator, false, 2, (Object) null)) {
        }
        parse = numberFormat2.parse(valueOf);
        if (parse == null) {
        }
        cleanup(build);
        if (z) {
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() > build.getStart()) {
        }
        abs = Math.abs(getValue().length() - (newValue.length() - (position == null ? position.intValue() : getCursorPosition())));
        setCursorPosition(RangesKt.coerceAtMost(abs, getValue().length()));
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i = 0; i < length; i++) {
                char charAt = pattern.charAt(i);
                if (charAt != this.currencyKey) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            decimalFormat.applyPattern(StringsKt.trim(sb2).toString());
        }
        return numberFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127 A[EDGE_INSN: B:85:0x0127->B:76:0x0127 BREAK  A[LOOP:3: B:70:0x0112->B:73:0x0124], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toValidFormat(String str, TextDiff textDiff) {
        int i;
        int i2;
        int i3;
        int length;
        int length2;
        int i4;
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= str.length()) {
                i5 = -1;
                break;
            }
            if (str.charAt(i5) == decimalSeparator && !inDiff(textDiff, i5)) {
                break;
            }
            i5++;
        }
        if (textDiff.getAdded() == 1 && textDiff.getRemoved() == 0) {
            if (this.separators.contains(Character.valueOf(str.charAt(textDiff.getStart())))) {
                i2 = textDiff.getStart();
                int maximumFractionDigits = this.currencyFormatter.getMaximumFractionDigits();
                if (i5 == -1) {
                    i3 = maximumFractionDigits;
                    for (int i6 = i5; i6 < str.length(); i6++) {
                        if (Character.isDigit(str.charAt(i6)) && !inDiff(textDiff, i6)) {
                            i3--;
                        }
                    }
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    boolean z = false;
                    i3 = maximumFractionDigits;
                    while (i7 < str.length()) {
                        char charAt = str.charAt(i7);
                        int i9 = i8 + 1;
                        boolean inDiff = inDiff(textDiff, i8);
                        if (charAt == decimalSeparator) {
                            z = true;
                        } else if (!inDiff && z && Character.isDigit(charAt)) {
                            i3--;
                        }
                        i7++;
                        i8 = i9;
                    }
                }
                boolean z2 = (StringsKt.contains$default((CharSequence) str, decimalSeparator, false, 2, (Object) null) && i2 == -1) ? false : true;
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                for (length = str.length() - 1; length >= 0; length--) {
                    char charAt2 = str.charAt(length);
                    boolean z4 = sb.length() <= maximumFractionDigits;
                    if (Character.isDigit(charAt2)) {
                        if (!inDiff(textDiff, length) || z3 || !z2) {
                            sb.append(charAt2);
                        } else if (i3 > 0) {
                            sb.append(charAt2);
                            i3--;
                        }
                    } else if (z4 && i5 == -1 && length == i2) {
                        sb.append(decimalSeparator);
                        z3 = true;
                    } else if (z4 && charAt2 == decimalSeparator && (i5 == length || i5 == -1)) {
                        sb.append(decimalSeparator);
                        z3 = true;
                        i5 = length;
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                String obj = StringsKt.reversed(sb2).toString();
                length2 = obj.length();
                i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    if (obj.charAt(i4) != getDecimalFormatSymbols().getZeroDigit()) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i > 0) {
                    return obj;
                }
                if (obj.charAt(i) == getDecimalFormatSymbols().getDecimalSeparator()) {
                    return StringsKt.drop(obj, i - 1);
                }
                return StringsKt.drop(obj, i);
            }
        }
        i2 = -1;
        int maximumFractionDigits2 = this.currencyFormatter.getMaximumFractionDigits();
        if (i5 == -1) {
        }
        if (StringsKt.contains$default((CharSequence) str, decimalSeparator, false, 2, (Object) null)) {
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z32 = false;
        while (length >= 0) {
        }
        String sb22 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        String obj2 = StringsKt.reversed(sb22).toString();
        length2 = obj2.length();
        i4 = 0;
        while (true) {
            if (i4 >= length2) {
            }
            i4++;
        }
        if (i > 0) {
        }
    }

    private final boolean inDiff(TextDiff diff, int index) {
        return diff.getStart() <= index && index < diff.getStart() + diff.getAdded();
    }

    private final String formatPattern(String pattern) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char charAt = pattern.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        this.onError.invoke(exception);
    }
}
