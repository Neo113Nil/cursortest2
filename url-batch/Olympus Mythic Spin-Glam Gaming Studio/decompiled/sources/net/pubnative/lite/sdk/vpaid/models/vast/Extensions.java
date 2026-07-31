package net.pubnative.lite.sdk.vpaid.models.vast;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes5.dex */
public class Extensions {

    @Tag(VastTagName.EXTENSION)
    private List<Extension> extensionList;

    public List<Extension> getExtensions() {
        return this.extensionList;
    }
}
