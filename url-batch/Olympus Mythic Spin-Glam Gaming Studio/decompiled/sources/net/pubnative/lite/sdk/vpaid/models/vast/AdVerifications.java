package net.pubnative.lite.sdk.vpaid.models.vast;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes6.dex */
public class AdVerifications {

    @Tag(VastTagName.VERIFICATION)
    private List<Verification> verificationList;

    public List<Verification> getVerificationList() {
        return this.verificationList;
    }
}
