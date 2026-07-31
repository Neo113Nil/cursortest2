package io.bidmachine.media3.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.common.primitives.ImmutableIntArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.SniffFailure;

@UnstableApi
/* loaded from: classes14.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, @Nullable int[] iArr) {
        ImmutableIntArray of;
        this.majorBrand = i;
        if (iArr != null) {
            of = ImmutableIntArray.copyOf(iArr);
        } else {
            of = ImmutableIntArray.of();
        }
        this.compatibleBrands = of;
    }
}
