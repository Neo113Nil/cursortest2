package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public final class MraidResizeProperties {
    public boolean allowOffscreen;

    @NonNull
    public ViewPosition customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;

    public MraidResizeProperties() {
        this(0, 0, 0, 0, ViewPosition.TopRight, true);
    }

    @NonNull
    public String toString() {
        return "MRAIDResizeProperties{width=" + this.width + ", height=" + this.height + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", customClosePosition=" + this.customClosePosition + ", allowOffscreen=" + this.allowOffscreen + '}';
    }

    public MraidResizeProperties(int i, int i2, int i3, int i4, @NonNull ViewPosition viewPosition, boolean z) {
        this.width = i;
        this.height = i2;
        this.offsetX = i3;
        this.offsetY = i4;
        this.customClosePosition = viewPosition;
        this.allowOffscreen = z;
    }
}
