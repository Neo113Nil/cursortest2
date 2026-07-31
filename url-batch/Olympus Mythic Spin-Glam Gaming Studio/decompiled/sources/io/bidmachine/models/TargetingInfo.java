package io.bidmachine.models;

import android.location.Location;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.utils.Gender;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0014\u0010!\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lio/bidmachine/models/TargetingInfo;", "", POBConstants.KEY_CITY, "", "getCity", "()Ljava/lang/String;", "country", "getCountry", "deviceLocation", "Landroid/location/Location;", "getDeviceLocation", "()Landroid/location/Location;", "gender", "Lio/bidmachine/utils/Gender;", "getGender", "()Lio/bidmachine/utils/Gender;", "isPaid", "", "()Ljava/lang/Boolean;", "keywords", "", "getKeywords", "()Ljava/util/List;", "storeUrl", "getStoreUrl", "userAge", "", "getUserAge", "()Ljava/lang/Integer;", "userBirthdayYear", "getUserBirthdayYear", "userId", "getUserId", "zip", "getZip", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public interface TargetingInfo {
    @Nullable
    String getCity();

    @Nullable
    String getCountry();

    @Nullable
    Location getDeviceLocation();

    @Nullable
    Gender getGender();

    @Nullable
    List<String> getKeywords();

    @Nullable
    String getStoreUrl();

    @Nullable
    Integer getUserAge();

    @Nullable
    Integer getUserBirthdayYear();

    @Nullable
    String getUserId();

    @Nullable
    String getZip();

    @Nullable
    Boolean isPaid();
}
