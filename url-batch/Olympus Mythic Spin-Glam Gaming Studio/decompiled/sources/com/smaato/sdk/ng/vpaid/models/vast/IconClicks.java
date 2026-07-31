package com.smaato.sdk.ng.vpaid.models.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes15.dex */
public class IconClicks {

    @Tag
    private IconClickFallbackImages iconClickFallbackImages;

    @Tag
    private IconClickThrough iconClickThrough;

    @Tag(k.I)
    private List<IconClickTracking> iconClickTrackingList;

    public IconClickFallbackImages getIconClickFallbackImages() {
        return this.iconClickFallbackImages;
    }

    public IconClickThrough getIconClickThrough() {
        return this.iconClickThrough;
    }

    public List<IconClickTracking> getIconClickTrackingList() {
        return this.iconClickTrackingList;
    }
}
