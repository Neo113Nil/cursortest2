package io.bidmachine.models;

import androidx.annotation.NonNull;
import com.my.tracker.MyTracker;
import io.bidmachine.banner.BannerSize;

/* loaded from: classes6.dex */
public interface IBannerRequestBuilder<SelfType> {
    @Deprecated(since = MyTracker.VERSION)
    SelfType setSize(@NonNull BannerSize bannerSize);
}
