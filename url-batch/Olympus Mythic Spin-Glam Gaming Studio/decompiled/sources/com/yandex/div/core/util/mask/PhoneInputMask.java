package com.yandex.div.core.util.mask;

import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.TextDiff;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhoneInputMask.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0014\u0010\u0012\u001a\u00020\u00062\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/util/mask/PhoneInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "onError", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Lkotlin/jvm/functions/Function1;)V", "applyChangeFrom", "newValue", "", X3.i.L, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "calculateCursorPositionBy", "dynamicDestination", "newMaskPatternFor", "rawValue", "onException", TelemetryCategory.EXCEPTION, "overrideRawValue", "newRawValue", "tryInvalidateMaskDataWith", "(Ljava/lang/String;)Lkotlin/Unit;", "updateMaskDataWith", "newPattern", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhoneInputMask extends BaseInputMask {

    @NotNull
    private final Function1 onError;

    public PhoneInputMask(@NotNull Function1 function1) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        this.onError = function1;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) {
        tryInvalidateMaskDataWith(newRawValue);
        super.overrideRawValue(newRawValue);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) {
        TextDiff.Companion companion = TextDiff.INSTANCE;
        TextDiff build = companion.build(getValue(), newValue);
        if (position != null) {
            build = new TextDiff(RangesKt.coerceAtLeast(position.intValue() - build.getAdded(), 0), build.getAdded(), build.getRemoved());
        }
        String rawValue = getRawValue();
        int replaceBodyTail = replaceBodyTail(build, newValue);
        String rawValue2 = getRawValue();
        String newMaskPatternFor = newMaskPatternFor(rawValue2);
        if (newMaskPatternFor == null) {
            calculateCursorPosition(build, replaceBodyTail);
            return;
        }
        updateMaskDataWith(newMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff build2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(build2.getStart() + build2.getAdded());
    }

    private final void calculateCursorPositionBy(int dynamicDestination) {
        int i = 0;
        int i2 = 0;
        while (i < getDestructedValue().size() && i2 < dynamicDestination) {
            int i3 = i + 1;
            if (getDestructedValue().get(i) instanceof BaseInputMask.MaskChar.Dynamic) {
                i2++;
            }
            i = i3;
        }
        setCursorPosition(firstHolderAfter(i));
    }

    private final Unit tryInvalidateMaskDataWith(String rawValue) {
        String newMaskPatternFor = newMaskPatternFor(rawValue);
        if (newMaskPatternFor == null) {
            return null;
        }
        updateMaskDataWith(newMaskPatternFor);
        return Unit.INSTANCE;
    }

    private final String newMaskPatternFor(String rawValue) {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(rawValue);
        if (Intrinsics.areEqual(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final void updateMaskDataWith(String newPattern) {
        updateMaskData(new BaseInputMask.MaskData(newPattern, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        this.onError.invoke(exception);
    }
}
