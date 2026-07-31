package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div2.DivFontWeight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTypefaceResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a \u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a!\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"getTypeface", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "fontWeight", "Lcom/yandex/div2/DivFontWeight;", "fontWeightValue", "", "typefaceProvider", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "(Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Lcom/yandex/div/core/font/DivTypefaceProvider;)Landroid/graphics/Typeface;", "getTypefaceValue", "(Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;)I", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivTypefaceResolverKt {

    /* compiled from: DivTypefaceResolver.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i, @NotNull DivTypefaceProvider divTypefaceProvider) {
        Typeface typefaceFor = divTypefaceProvider.getTypefaceFor(i);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final Typeface getTypeface(@Nullable DivFontWeight divFontWeight, @Nullable Integer num, @NotNull DivTypefaceProvider divTypefaceProvider) {
        return getTypeface(getTypefaceValue(divFontWeight, num), divTypefaceProvider);
    }

    public static final int getTypefaceValue(@Nullable DivFontWeight divFontWeight, @Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i = divFontWeight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i == 1) {
            return 300;
        }
        if (i != 2) {
            if (i == 3) {
                return 500;
            }
            if (i == 4) {
                return 700;
            }
        }
        return 400;
    }
}
