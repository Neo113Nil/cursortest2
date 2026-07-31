package io.bidmachine.displays;

import com.explorestack.protobuf.adcom.Ad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/displays/DisplayAdObjectParams;", "Lio/bidmachine/displays/IabAdObjectParams;", "ad", "Lcom/explorestack/protobuf/adcom/Ad;", "(Lcom/explorestack/protobuf/adcom/Ad;)V", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public class DisplayAdObjectParams extends IabAdObjectParams {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayAdObjectParams(@NotNull Ad ad) {
        super(ad);
        Intrinsics.checkNotNullParameter(ad, "ad");
        prepareEvents(ad.getDisplay().getEventList());
    }
}
