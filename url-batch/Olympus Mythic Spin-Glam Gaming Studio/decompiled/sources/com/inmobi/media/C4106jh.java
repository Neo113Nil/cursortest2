package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4106jh {
    public final InMobiNativeViewData a;
    public final MediaView b;
    public final View c;

    public C4106jh(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(pubView, "pubView");
        this.a = pubView;
        this.b = mediaView;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4106jh)) {
            return false;
        }
        C4106jh c4106jh = (C4106jh) obj;
        return Intrinsics.areEqual(this.a, c4106jh.a) && Intrinsics.areEqual(this.b, c4106jh.b) && Intrinsics.areEqual(this.c, c4106jh.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MediaView mediaView = this.b;
        int hashCode2 = (hashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.c;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }
}
