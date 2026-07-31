package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class NativeAdViewHolder {

    @Nullable
    private View a;

    @Nullable
    private View b;

    @Nullable
    private View c;

    @Nullable
    private View d;

    @Nullable
    private LevelPlayMediaView e;

    @Nullable
    private View f;

    @Nullable
    public final View getAdvertiserView() {
        return this.b;
    }

    @Nullable
    public final View getBodyView() {
        return this.d;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.f;
    }

    @Nullable
    public final View getIconView() {
        return this.c;
    }

    @Nullable
    public final LevelPlayMediaView getMediaView() {
        return this.e;
    }

    @Nullable
    public final View getTitleView() {
        return this.a;
    }

    public final void setAdvertiserView(@Nullable View view) {
        this.b = view;
    }

    public final void setBodyView(@Nullable View view) {
        this.d = view;
    }

    public final void setCallToActionView(@Nullable View view) {
        this.f = view;
    }

    public final void setIconView(@Nullable View view) {
        this.c = view;
    }

    public final void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.e = levelPlayMediaView;
    }

    public final void setTitleView(@Nullable View view) {
        this.a = view;
    }
}
