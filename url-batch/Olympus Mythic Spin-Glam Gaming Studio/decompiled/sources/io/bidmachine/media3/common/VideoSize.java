package io.bidmachine.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_WIDTH = 0;

    @IntRange
    public final int height;

    @FloatRange
    public final float pixelWidthHeightRatio;

    @IntRange
    @Deprecated
    public final int unappliedRotationDegrees;

    @IntRange
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(3);

    @UnstableApi
    public VideoSize(@IntRange int i, @IntRange int i2) {
        this(i, i2, 1.0f);
    }

    @UnstableApi
    public VideoSize(@IntRange int i, @IntRange int i2, @FloatRange float f) {
        this.width = i;
        this.height = i2;
        this.unappliedRotationDegrees = 0;
        this.pixelWidthHeightRatio = f;
    }

    @UnstableApi
    @Deprecated
    public VideoSize(@IntRange int i, @IntRange int i2, @IntRange int i3, @FloatRange float f) {
        this(i, i2, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio;
    }

    public int hashCode() {
        return ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.width) * 31) + this.height) * 31) + Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.width;
        if (i != 0) {
            bundle.putInt(FIELD_WIDTH, i);
        }
        int i2 = this.height;
        if (i2 != 0) {
            bundle.putInt(FIELD_HEIGHT, i2);
        }
        float f = this.pixelWidthHeightRatio;
        if (f != 1.0f) {
            bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, f);
        }
        return bundle;
    }

    @UnstableApi
    public static VideoSize fromBundle(Bundle bundle) {
        return new VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }
}
