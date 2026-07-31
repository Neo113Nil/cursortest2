package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.ky1;
import yads.sm3;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/instream/view/InstreamMuteView;", "Landroid/widget/ImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "muted", "", "setMuted", "(Z)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstreamMuteView extends ImageView {
    private final sm3 a;
    private boolean b;

    public InstreamMuteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_height_v2));
    }

    public void setMuted(boolean muted) {
        this.b = muted;
        this.a.a(this, muted);
    }

    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R$drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R$drawable.monetization_ads_internal_ic_sound_off_default);
        int i2 = R$string.monetization_ads_internal_instream_muted;
        int i3 = R$string.monetization_ads_internal_instream_unmuted;
        obtainStyledAttributes.recycle();
        this.a = new sm3(new ky1(resourceId2, resourceId, i2, i3));
        setMuted(this.b);
    }
}
