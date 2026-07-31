package io.bidmachine.displays;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lio/bidmachine/displays/IabAdObjectParams;", "Lio/bidmachine/models/AdObjectParams;", "ad", "Lcom/explorestack/protobuf/adcom/Ad;", "(Lcom/explorestack/protobuf/adcom/Ad;)V", "isValid", "", "setCreativeAdm", "", UnifiedMediationParams.KEY_CREATIVE_ADM, "", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public class IabAdObjectParams extends AdObjectParams {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IabAdObjectParams(@NotNull Ad ad) {
        super(ad);
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        Object obj = getData().get(UnifiedMediationParams.KEY_CREATIVE_ADM);
        return (obj instanceof CharSequence) && ((CharSequence) obj).length() > 0;
    }

    public final void setCreativeAdm(@Nullable String creativeAdm) {
        if (creativeAdm == null || creativeAdm.length() == 0) {
            getData().remove(UnifiedMediationParams.KEY_CREATIVE_ADM);
        } else {
            getData().put(UnifiedMediationParams.KEY_CREATIVE_ADM, creativeAdm);
        }
    }
}
