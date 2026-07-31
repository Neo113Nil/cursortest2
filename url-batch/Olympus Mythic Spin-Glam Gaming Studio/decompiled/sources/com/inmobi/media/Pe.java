package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Pe {
    public final ViewGroup a;
    public final ImageView b;
    public final MediaView c;
    public final List d;
    public final Te e;

    public Pe(ViewGroup parentView, ImageView imageView, MediaView mediaView, List friendlyViews, Te nativeVisibilitySpec) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.a = parentView;
        this.b = imageView;
        this.c = mediaView;
        this.d = friendlyViews;
        this.e = nativeVisibilitySpec;
    }
}
