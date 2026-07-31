package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\rJ\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstants;", "", "barWidth", "Landroidx/compose/ui/unit/Dp;", "dotRadius", "minBarHeight", "amplitudeThreshold", "", "amplitudeDeadZone", "amplitudeSmoothingFactor", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBarWidth-D9Ej5fM", "()F", "F", "getDotRadius-D9Ej5fM", "getMinBarHeight-D9Ej5fM", "getAmplitudeThreshold", "getAmplitudeDeadZone", "getAmplitudeSmoothingFactor", "toPx", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstantsPx;", "density", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component5", "component6", "copy", "copy-yajeYGU", "(FFFFFF)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstants;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class DrawingConstants {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    public /* synthetic */ DrawingConstants(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: copy-yajeYGU$default, reason: not valid java name */
    public static /* synthetic */ DrawingConstants m11351copyyajeYGU$default(DrawingConstants drawingConstants, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = drawingConstants.barWidth;
        }
        if ((i & 2) != 0) {
            f2 = drawingConstants.dotRadius;
        }
        if ((i & 4) != 0) {
            f3 = drawingConstants.minBarHeight;
        }
        if ((i & 8) != 0) {
            f4 = drawingConstants.amplitudeThreshold;
        }
        if ((i & 16) != 0) {
            f5 = drawingConstants.amplitudeDeadZone;
        }
        if ((i & 32) != 0) {
            f6 = drawingConstants.amplitudeSmoothingFactor;
        }
        float f7 = f5;
        float f8 = f6;
        return drawingConstants.m11355copyyajeYGU(f, f2, f3, f4, f7, f8);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBarWidth() {
        return this.barWidth;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDotRadius() {
        return this.dotRadius;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinBarHeight() {
        return this.minBarHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final float getAmplitudeThreshold() {
        return this.amplitudeThreshold;
    }

    /* renamed from: component5, reason: from getter */
    public final float getAmplitudeDeadZone() {
        return this.amplitudeDeadZone;
    }

    /* renamed from: component6, reason: from getter */
    public final float getAmplitudeSmoothingFactor() {
        return this.amplitudeSmoothingFactor;
    }

    /* renamed from: copy-yajeYGU, reason: not valid java name */
    public final DrawingConstants m11355copyyajeYGU(float barWidth, float dotRadius, float minBarHeight, float amplitudeThreshold, float amplitudeDeadZone, float amplitudeSmoothingFactor) {
        return new DrawingConstants(barWidth, dotRadius, minBarHeight, amplitudeThreshold, amplitudeDeadZone, amplitudeSmoothingFactor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawingConstants)) {
            return false;
        }
        DrawingConstants drawingConstants = (DrawingConstants) other;
        return Dp.m8406equalsimpl0(this.barWidth, drawingConstants.barWidth) && Dp.m8406equalsimpl0(this.dotRadius, drawingConstants.dotRadius) && Dp.m8406equalsimpl0(this.minBarHeight, drawingConstants.minBarHeight) && Float.compare(this.amplitudeThreshold, drawingConstants.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstants.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstants.amplitudeSmoothingFactor) == 0;
    }

    public int hashCode() {
        return (((((((((Dp.m8407hashCodeimpl(this.barWidth) * 31) + Dp.m8407hashCodeimpl(this.dotRadius)) * 31) + Dp.m8407hashCodeimpl(this.minBarHeight)) * 31) + Float.hashCode(this.amplitudeThreshold)) * 31) + Float.hashCode(this.amplitudeDeadZone)) * 31) + Float.hashCode(this.amplitudeSmoothingFactor);
    }

    public String toString() {
        return "DrawingConstants(barWidth=" + ((Object) Dp.m8412toStringimpl(this.barWidth)) + ", dotRadius=" + ((Object) Dp.m8412toStringimpl(this.dotRadius)) + ", minBarHeight=" + ((Object) Dp.m8412toStringimpl(this.minBarHeight)) + ", amplitudeThreshold=" + this.amplitudeThreshold + ", amplitudeDeadZone=" + this.amplitudeDeadZone + ", amplitudeSmoothingFactor=" + this.amplitudeSmoothingFactor + ')';
    }

    private DrawingConstants(float f, float f2, float f3, float f4, float f5, float f6) {
        this.barWidth = f;
        this.dotRadius = f2;
        this.minBarHeight = f3;
        this.amplitudeThreshold = f4;
        this.amplitudeDeadZone = f5;
        this.amplitudeSmoothingFactor = f6;
    }

    /* renamed from: getBarWidth-D9Ej5fM, reason: not valid java name */
    public final float m11356getBarWidthD9Ej5fM() {
        return this.barWidth;
    }

    /* renamed from: getDotRadius-D9Ej5fM, reason: not valid java name */
    public final float m11357getDotRadiusD9Ej5fM() {
        return this.dotRadius;
    }

    /* renamed from: getMinBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m11358getMinBarHeightD9Ej5fM() {
        return this.minBarHeight;
    }

    public final float getAmplitudeThreshold() {
        return this.amplitudeThreshold;
    }

    public final float getAmplitudeDeadZone() {
        return this.amplitudeDeadZone;
    }

    public final float getAmplitudeSmoothingFactor() {
        return this.amplitudeSmoothingFactor;
    }

    public final DrawingConstantsPx toPx(float density) {
        return new DrawingConstantsPx(this.barWidth * density, this.dotRadius * density, this.minBarHeight * density, this.amplitudeThreshold, this.amplitudeDeadZone, this.amplitudeSmoothingFactor);
    }
}
