package io.bidmachine;

import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/GeneralParams;", "", "dataRestrictions", "Lio/bidmachine/models/DataRestrictions;", "getDataRestrictions", "()Lio/bidmachine/models/DataRestrictions;", "isTestMode", "", "()Z", "targetingInfo", "Lio/bidmachine/models/TargetingInfo;", "getTargetingInfo", "()Lio/bidmachine/models/TargetingInfo;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public interface GeneralParams {
    @NotNull
    DataRestrictions getDataRestrictions();

    @NotNull
    TargetingInfo getTargetingInfo();

    boolean isTestMode();
}
