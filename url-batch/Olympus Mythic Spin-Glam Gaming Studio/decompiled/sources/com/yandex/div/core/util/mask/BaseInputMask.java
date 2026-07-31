package com.yandex.div.core.util.mask;

import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseInputMask.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003GHIB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010-\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0006H\u0004J\u0018\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0006H\u0004J\u0018\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0004J\u0018\u00105\u001a\u00020%2\u0006\u00101\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0004J\u0018\u00107\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0004J\u0010\u00108\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0004J\u0014\u00109\u001a\u00020%2\n\u0010:\u001a\u00060;j\u0002`<H&J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001fH\u0016J\u0018\u0010?\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u001fH\u0004J)\u0010@\u001a\u00020%2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0002\u0010BJ\u001a\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020FH\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006J"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask;", "", "initialMaskData", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "(Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;)V", "<set-?>", "", "cursorPosition", "getCursorPosition", "()I", "setCursorPosition", "(I)V", "destructedValue", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "getDestructedValue", "()Ljava/util/List;", "setDestructedValue", "(Ljava/util/List;)V", "filters", "", "", "Lkotlin/text/Regex;", "getFilters", "()Ljava/util/Map;", "firstEmptyHolderIndex", "getFirstEmptyHolderIndex", "maskData", "getMaskData", "()Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "value", "getValue", "applyChangeFrom", "", "newValue", X3.i.L, "(Ljava/lang/String;Ljava/lang/Integer;)V", "buildBodySubstring", "textDiff", "Lcom/yandex/div/core/util/mask/TextDiff;", "buildTailSubstring", "calculateCursorPosition", "tailStart", "calculateInsertableSubstring", "substring", "start", "calculateMaxShift", "string", "cleanup", "clearRange", "end", "collectValueRange", "firstHolderAfter", "onException", TelemetryCategory.EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "overrideRawValue", "newRawValue", "replaceBodyTail", "replaceChars", "count", "(Ljava/lang/String;ILjava/lang/Integer;)V", "updateMaskData", "newMaskData", "restoreValue", "", "MaskChar", "MaskData", "MaskKey", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    protected List<? extends MaskChar> destructedValue;

    @NotNull
    private final Map<Character, Regex> filters = new LinkedHashMap();

    @NotNull
    private MaskData maskData;

    public abstract void onException(@NotNull Exception exception);

    public BaseInputMask(@NotNull MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    @NotNull
    protected final MaskData getMaskData() {
        return this.maskData;
    }

    @NotNull
    protected final Map<Character, Regex> getFilters() {
        return this.filters;
    }

    @NotNull
    protected final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("destructedValue");
        return null;
    }

    protected final void setDestructedValue(@NotNull List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    protected final void setCursorPosition(int i) {
        this.cursorPosition = i;
    }

    @NotNull
    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    @NotNull
    public final String getValue() {
        StringBuilder sb = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            if (maskChar instanceof MaskChar.Static) {
                sb.append(((MaskChar.Static) maskChar).getChar());
            } else {
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        sb.append(dynamic.getChar());
                    }
                }
                if (!this.maskData.getAlwaysVisible()) {
                    break;
                }
                Intrinsics.checkNotNull(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            }
            arrayList.add(obj);
        }
        return sb.toString();
    }

    protected final int getFirstEmptyHolderIndex() {
        Iterator<MaskChar> it = getDestructedValue().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).getChar() == null) {
                break;
            }
            i++;
        }
        return i != -1 ? i : getDestructedValue().size();
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseInputMask.updateMaskData(maskData, z);
    }

    public void updateMaskData(@NotNull MaskData newMaskData, boolean restoreValue) {
        Object obj;
        MaskChar maskChar;
        String rawValue = (Intrinsics.areEqual(this.maskData, newMaskData) || !restoreValue) ? null : getRawValue();
        this.maskData = newMaskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e) {
                onException(e);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i = 0; i < pattern.length(); i++) {
            char charAt = pattern.charAt(i);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MaskKey) obj).getKey() == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) obj;
            if (maskKey2 != null) {
                maskChar = new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder());
            } else {
                maskChar = new MaskChar.Static(charAt);
            }
            arrayList.add(maskChar);
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }

    public void overrideRawValue(@NotNull String newRawValue) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, newRawValue, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) {
        TextDiff build = TextDiff.INSTANCE.build(getValue(), newValue);
        if (position != null) {
            build = new TextDiff(RangesKt.coerceAtLeast(position.intValue() - build.getAdded(), 0), build.getAdded(), build.getRemoved());
        }
        calculateCursorPosition(build, replaceBodyTail(build, newValue));
    }

    protected final int replaceBodyTail(@NotNull TextDiff textDiff, @NotNull String newValue) {
        String buildBodySubstring = buildBodySubstring(textDiff, newValue);
        String buildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(buildBodySubstring, firstEmptyHolderIndex, buildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(buildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, buildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    private final String buildBodySubstring(TextDiff textDiff, String newValue) {
        String substring = newValue.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String string, int start) {
        int i;
        if (this.filters.size() <= 1) {
            int i2 = 0;
            while (start < getDestructedValue().size()) {
                if (getDestructedValue().get(start) instanceof MaskChar.Dynamic) {
                    i2++;
                }
                start++;
            }
            i = i2 - string.length();
        } else {
            String calculateInsertableSubstring = calculateInsertableSubstring(string, start);
            int i3 = 0;
            while (i3 < getDestructedValue().size() && Intrinsics.areEqual(calculateInsertableSubstring, calculateInsertableSubstring(string, start + i3))) {
                i3++;
            }
            i = i3 - 1;
        }
        return RangesKt.coerceAtLeast(i, 0);
    }

    protected final void cleanup(@NotNull TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            int start = textDiff.getStart();
            while (true) {
                if (start < 0) {
                    break;
                }
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
                start--;
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    protected final void clearRange(int start, int end) {
        while (start < end && start < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(start);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            start++;
        }
    }

    protected final void calculateCursorPosition(@NotNull TextDiff textDiff, int tailStart) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(tailStart), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    @NotNull
    protected final String calculateInsertableSubstring(@NotNull String substring, int start) {
        StringBuilder sb = new StringBuilder();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = start;
        Function0 function0 = new Function0() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: invoke */
            public final Regex mo4828invoke() {
                while (Ref$IntRef.this.element < this.getDestructedValue().size() && !(this.getDestructedValue().get(Ref$IntRef.this.element) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    Ref$IntRef.this.element++;
                }
                Object orNull = CollectionsKt.getOrNull(this.getDestructedValue(), Ref$IntRef.this.element);
                BaseInputMask.MaskChar.Dynamic dynamic = orNull instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) orNull : null;
                if (dynamic != null) {
                    return dynamic.getFilter();
                }
                return null;
            }
        };
        for (int i = 0; i < substring.length(); i++) {
            char charAt = substring.charAt(i);
            Regex regex = (Regex) function0.mo4828invoke();
            if (regex != null && regex.matches(String.valueOf(charAt))) {
                sb.append(charAt);
                ref$IntRef.element++;
            }
        }
        return sb.toString();
    }

    @NotNull
    protected final String collectValueRange(int start, int end) {
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            MaskChar maskChar = getDestructedValue().get(start);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb.append(dynamic.getChar());
                }
            }
            start++;
        }
        return sb.toString();
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i, Integer num, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i, num);
    }

    protected final void replaceChars(@NotNull String substring, int start, @Nullable Integer count) {
        String calculateInsertableSubstring = calculateInsertableSubstring(substring, start);
        if (count != null) {
            calculateInsertableSubstring = StringsKt.take(calculateInsertableSubstring, count.intValue());
        }
        int i = 0;
        while (start < getDestructedValue().size() && i < calculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(start);
            char charAt = calculateInsertableSubstring.charAt(i);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(charAt));
                i++;
            }
            start++;
        }
    }

    protected final int firstHolderAfter(int start) {
        while (start < getDestructedValue().size() && !(getDestructedValue().get(start) instanceof MaskChar.Dynamic)) {
            start++;
        }
        return start;
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "", "key", "", "filter", "", "placeholder", "(CLjava/lang/String;C)V", "getFilter", "()Ljava/lang/String;", "getKey", "()C", "getPlaceholder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MaskKey {

        @Nullable
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c, @Nullable String str, char c2) {
            this.key = c;
            this.filter = str;
            this.placeholder = c2;
        }

        public final char getKey() {
            return this.key;
        }

        @Nullable
        public final String getFilter() {
            return this.filter;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "", "pattern", "", "decoding", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "alwaysVisible", "", "(Ljava/lang/String;Ljava/util/List;Z)V", "getAlwaysVisible", "()Z", "getDecoding", "()Ljava/util/List;", "getPattern", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MaskData {
        private final boolean alwaysVisible;

        @NotNull
        private final List<MaskKey> decoding;

        @NotNull
        private final String pattern;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MaskData copy$default(MaskData maskData, String str, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = maskData.pattern;
            }
            if ((i & 2) != 0) {
                list = maskData.decoding;
            }
            if ((i & 4) != 0) {
                z = maskData.alwaysVisible;
            }
            return maskData.copy(str, list, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        @NotNull
        public final List<MaskKey> component2() {
            return this.decoding;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        @NotNull
        public final MaskData copy(@NotNull String pattern, @NotNull List<MaskKey> decoding, boolean alwaysVisible) {
            return new MaskData(pattern, decoding, alwaysVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) other;
            return Intrinsics.areEqual(this.pattern, maskData.pattern) && Intrinsics.areEqual(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z = this.alwaysVisible;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }

        public MaskData(@NotNull String str, @NotNull List<MaskKey> list, boolean z) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        @NotNull
        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "", "()V", "Dynamic", "Static", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MaskChar {
        public /* synthetic */ MaskChar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BaseInputMask.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "char", "", "(C)V", "getChar", "()C", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Static extends MaskChar {
            private final char char;

            public static /* synthetic */ Static copy$default(Static r0, char c, int i, Object obj) {
                if ((i & 1) != 0) {
                    c = r0.char;
                }
                return r0.copy(c);
            }

            /* renamed from: component1, reason: from getter */
            public final char getChar() {
                return this.char;
            }

            @NotNull
            public final Static copy(char r2) {
                return new Static(r2);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Static) && this.char == ((Static) other).char;
            }

            public int hashCode() {
                return Character.hashCode(this.char);
            }

            @NotNull
            public String toString() {
                return "Static(char=" + this.char + ')';
            }

            public Static(char c) {
                super(null);
                this.char = c;
            }

            public final char getChar() {
                return this.char;
            }
        }

        private MaskChar() {
        }

        /* compiled from: BaseInputMask.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "char", "", "filter", "Lkotlin/text/Regex;", "placeholder", "(Ljava/lang/Character;Lkotlin/text/Regex;C)V", "getChar", "()Ljava/lang/Character;", "setChar", "(Ljava/lang/Character;)V", "Ljava/lang/Character;", "getFilter", "()Lkotlin/text/Regex;", "getPlaceholder", "()C", "component1", "component2", "component3", "copy", "(Ljava/lang/Character;Lkotlin/text/Regex;C)Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Dynamic extends MaskChar {

            @Nullable
            private Character char;

            @Nullable
            private final Regex filter;
            private final char placeholder;

            public static /* synthetic */ Dynamic copy$default(Dynamic dynamic, Character ch, Regex regex, char c, int i, Object obj) {
                if ((i & 1) != 0) {
                    ch = dynamic.char;
                }
                if ((i & 2) != 0) {
                    regex = dynamic.filter;
                }
                if ((i & 4) != 0) {
                    c = dynamic.placeholder;
                }
                return dynamic.copy(ch, regex, c);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Character getChar() {
                return this.char;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final Regex getFilter() {
                return this.filter;
            }

            /* renamed from: component3, reason: from getter */
            public final char getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            public final Dynamic copy(@Nullable Character r2, @Nullable Regex filter, char placeholder) {
                return new Dynamic(r2, filter, placeholder);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) other;
                return Intrinsics.areEqual(this.char, dynamic.char) && Intrinsics.areEqual(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            public int hashCode() {
                Character ch = this.char;
                int hashCode = (ch == null ? 0 : ch.hashCode()) * 31;
                Regex regex = this.filter;
                return ((hashCode + (regex != null ? regex.hashCode() : 0)) * 31) + Character.hashCode(this.placeholder);
            }

            @NotNull
            public String toString() {
                return "Dynamic(char=" + this.char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }

            public Dynamic(@Nullable Character ch, @Nullable Regex regex, char c) {
                super(null);
                this.char = ch;
                this.filter = regex;
                this.placeholder = c;
            }

            @Nullable
            public final Character getChar() {
                return this.char;
            }

            @Nullable
            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public final void setChar(@Nullable Character ch) {
                this.char = ch;
            }
        }
    }
}
