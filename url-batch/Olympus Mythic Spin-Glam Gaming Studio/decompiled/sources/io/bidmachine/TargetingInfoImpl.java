package io.bidmachine;

import android.location.Location;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.utils.Gender;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u0016\u0010$\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\b¨\u0006&"}, d2 = {"Lio/bidmachine/TargetingInfoImpl;", "Lio/bidmachine/models/TargetingInfo;", "targetingParams", "Lio/bidmachine/TargetingParams;", "(Lio/bidmachine/TargetingParams;)V", POBConstants.KEY_CITY, "", "getCity", "()Ljava/lang/String;", "country", "getCountry", "deviceLocation", "Landroid/location/Location;", "getDeviceLocation", "()Landroid/location/Location;", "gender", "Lio/bidmachine/utils/Gender;", "getGender", "()Lio/bidmachine/utils/Gender;", "isPaid", "", "()Ljava/lang/Boolean;", "keywords", "", "getKeywords", "()Ljava/util/List;", "storeUrl", "getStoreUrl", "userAge", "", "getUserAge", "()Ljava/lang/Integer;", "userBirthdayYear", "getUserBirthdayYear", "userId", "getUserId", "zip", "getZip", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class TargetingInfoImpl implements TargetingInfo {

    @NotNull
    private final TargetingParams targetingParams;

    public TargetingInfoImpl(@NotNull TargetingParams targetingParams) {
        Intrinsics.checkNotNullParameter(targetingParams, "targetingParams");
        this.targetingParams = targetingParams;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getCity() {
        return this.targetingParams.getCity();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getCountry() {
        return this.targetingParams.getCountry();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Location getDeviceLocation() {
        return this.targetingParams.getDeviceLocation();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Gender getGender() {
        return this.targetingParams.getGender();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public List<String> getKeywords() {
        return this.targetingParams.getKeywords();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getStoreUrl() {
        return this.targetingParams.getStoreUrl();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Integer getUserAge() {
        Integer userBirthdayYear = getUserBirthdayYear();
        if (userBirthdayYear == null) {
            return null;
        }
        return Integer.valueOf(Calendar.getInstance().get(1) - userBirthdayYear.intValue());
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Integer getUserBirthdayYear() {
        return this.targetingParams.getBirthdayYear();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getUserId() {
        return this.targetingParams.getUserId();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getZip() {
        return this.targetingParams.getZip();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Boolean isPaid() {
        return this.targetingParams.getPaid();
    }
}
