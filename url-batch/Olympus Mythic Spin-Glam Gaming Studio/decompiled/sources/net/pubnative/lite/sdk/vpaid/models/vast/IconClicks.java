package net.pubnative.lite.sdk.vpaid.models.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes3.dex */
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
