package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstantsPx;", "", "barWidth", "", "dotRadius", "minBarHeight", "amplitudeThreshold", "amplitudeDeadZone", "amplitudeSmoothingFactor", "<init>", "(FFFFFF)V", "getBarWidth", "()F", "getDotRadius", "getMinBarHeight", "getAmplitudeThreshold", "getAmplitudeDeadZone", "getAmplitudeSmoothingFactor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class DrawingConstantsPx {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    public static /* synthetic */ DrawingConstantsPx copy$default(DrawingConstantsPx drawingConstantsPx, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = drawingConstantsPx.barWidth;
        }
        if ((i & 2) != 0) {
            f2 = drawingConstantsPx.dotRadius;
        }
        if ((i & 4) != 0) {
            f3 = drawingConstantsPx.minBarHeight;
        }
        if ((i & 8) != 0) {
            f4 = drawingConstantsPx.amplitudeThreshold;
        }
        if ((i & 16) != 0) {
            f5 = drawingConstantsPx.amplitudeDeadZone;
        }
        if ((i & 32) != 0) {
            f6 = drawingConstantsPx.amplitudeSmoothingFactor;
        }
        float f7 = f5;
        float f8 = f6;
        return drawingConstantsPx.copy(f, f2, f3, f4, f7, f8);
    }

    /* renamed from: component1, reason: from getter */
    public final float getBarWidth() {
        return this.barWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDotRadius() {
        return this.dotRadius;
    }

    /* renamed from: component3, reason: from getter */
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

    public final DrawingConstantsPx copy(float barWidth, float dotRadius, float minBarHeight, float amplitudeThreshold, float amplitudeDeadZone, float amplitudeSmoothingFactor) {
        return new DrawingConstantsPx(barWidth, dotRadius, minBarHeight, amplitudeThreshold, amplitudeDeadZone, amplitudeSmoothingFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawingConstantsPx)) {
            return false;
        }
        DrawingConstantsPx drawingConstantsPx = (DrawingConstantsPx) other;
        return Float.compare(this.barWidth, drawingConstantsPx.barWidth) == 0 && Float.compare(this.dotRadius, drawingConstantsPx.dotRadius) == 0 && Float.compare(this.minBarHeight, drawingConstantsPx.minBarHeight) == 0 && Float.compare(this.amplitudeThreshold, drawingConstantsPx.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstantsPx.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstantsPx.amplitudeSmoothingFactor) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.barWidth) * 31) + Float.hashCode(this.dotRadius)) * 31) + Float.hashCode(this.minBarHeight)) * 31) + Float.hashCode(this.amplitudeThreshold)) * 31) + Float.hashCode(this.amplitudeDeadZone)) * 31) + Float.hashCode(this.amplitudeSmoothingFactor);
    }

    public String toString() {
        return "DrawingConstantsPx(barWidth=" + this.barWidth + ", dotRadius=" + this.dotRadius + ", minBarHeight=" + this.minBarHeight + ", amplitudeThreshold=" + this.amplitudeThreshold + ", amplitudeDeadZone=" + this.amplitudeDeadZone + ", amplitudeSmoothingFactor=" + this.amplitudeSmoothingFactor + ')';
    }

    public DrawingConstantsPx(float f, float f2, float f3, float f4, float f5, float f6) {
        this.barWidth = f;
        this.dotRadius = f2;
        this.minBarHeight = f3;
        this.amplitudeThreshold = f4;
        this.amplitudeDeadZone = f5;
        this.amplitudeSmoothingFactor = f6;
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final float getMinBarHeight() {
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
}
