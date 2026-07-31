package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import io.appmetrica.analytics.impl.M2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBackgroundSpan.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/util/text/DivBackgroundSpan;", "Landroid/text/style/UnderlineSpan;", "border", "Lcom/yandex/div2/DivTextRangeBorder;", M2.g, "Lcom/yandex/div2/DivTextRangeBackground;", "(Lcom/yandex/div2/DivTextRangeBorder;Lcom/yandex/div2/DivTextRangeBackground;)V", "getBackground", "()Lcom/yandex/div2/DivTextRangeBackground;", "getBorder", "()Lcom/yandex/div2/DivTextRangeBorder;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    @Nullable
    private final DivTextRangeBackground background;

    @Nullable
    private final DivTextRangeBorder border;

    @Nullable
    public final DivTextRangeBorder getBorder() {
        return this.border;
    }

    @Nullable
    public final DivTextRangeBackground getBackground() {
        return this.background;
    }

    public DivBackgroundSpan(@Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        this.border = divTextRangeBorder;
        this.background = divTextRangeBackground;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        ds.setUnderlineText(false);
    }
}
