package io.bidmachine;

import android.location.Location;
import com.ironsource.C4834q2;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.ITargetingParams;
import io.bidmachine.models.RequestParams;
import io.bidmachine.utils.Gender;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b#\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001OB\u001d\b\u0010\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\r\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\r\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cJ\r\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\b\u0010%\u001a\u0004\u0018\u00010\u000bJ\u0013\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010'¢\u0006\u0002\u0010(J\b\u0010)\u001a\u0004\u0018\u00010\u000bJ\b\u0010*\u001a\u0004\u0018\u00010\u000bJ\b\u0010+\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0000H\u0016J\b\u0010/\u001a\u00020\u0006H\u0002J\u0017\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u00102J\u0012\u00103\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u00105\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u00107\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u00109\u001a\u00020\u00002\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J\u0012\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010=\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010 H\u0016J%\u0010?\u001a\u00020\u00002\u0016\u0010@\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0'\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010AJ\u0017\u0010B\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0002\u0010DJ\u0012\u0010E\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010\u000bH\u0016J%\u0010G\u001a\u00020\u00002\u0016\u0010H\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0'\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010AJ\u0012\u0010I\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010K\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010M\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lio/bidmachine/TargetingParams;", "Lio/bidmachine/models/RequestParams;", "Lio/bidmachine/models/ITargetingParams;", "data", "Lio/bidmachine/TargetingParams$Data;", "blockedParams", "Lio/bidmachine/BlockedParams;", "(Lio/bidmachine/TargetingParams$Data;Lio/bidmachine/BlockedParams;)V", "()V", "addBlockedAdvertiserDomain", "domain", "", "addBlockedAdvertiserIABCategory", "category", "addBlockedApplication", "bundleOrPackage", "getBirthdayYear", "", "()Ljava/lang/Integer;", "getBlockedParams", "getBlockedParams$bidmachine_android_sdk_ba_3_7_1", "getCity", "getCountry", "getData", "getData$bidmachine_android_sdk_ba_3_7_1", "getDeviceLocation", "Landroid/location/Location;", "getExternalUserIdList", "", "Lio/bidmachine/ExternalUserId;", "getFramework", "getGender", "Lio/bidmachine/utils/Gender;", "getKeywords", "getPaid", "", "()Ljava/lang/Boolean;", "getStoreCategory", "getStoreSubCategories", "", "()[Ljava/lang/String;", "getStoreUrl", "getUserId", "getZip", "merge", "", C4834q2.p, "prepareBlockParams", "setBirthdayYear", "birthdayYear", "(Ljava/lang/Integer;)Lio/bidmachine/TargetingParams;", "setCity", POBConstants.KEY_CITY, "setCountry", "country", "setDeviceLocation", "location", "setExternalUserIds", "externalUserIdList", "setFramework", "framework", "setGender", "gender", "setKeywords", "keywords", "([Ljava/lang/String;)Lio/bidmachine/TargetingParams;", "setPaid", POBConstants.KEY_PAID, "(Ljava/lang/Boolean;)Lio/bidmachine/TargetingParams;", "setStoreCategory", "storeCategory", "setStoreSubCategories", "storeSubCategories", "setStoreUrl", "url", "setUserId", "userId", "setZip", "zip", "Data", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TargetingParams extends RequestParams<TargetingParams> implements ITargetingParams<TargetingParams> {

    @Nullable
    private BlockedParams blockedParams;

    @NotNull
    private Data data;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0080\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\t¢\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010%J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÈ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0007HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0013\u0010%R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c¨\u0006A"}, d2 = {"Lio/bidmachine/TargetingParams$Data;", "", "userId", "", "gender", "Lio/bidmachine/utils/Gender;", "birthdayYear", "", "keywords", "", "deviceLocation", "Landroid/location/Location;", "country", POBConstants.KEY_CITY, "zip", "storeUrl", "storeCategory", "storeSubCategories", "framework", "isPaid", "", "externalUserIdList", "Lio/bidmachine/ExternalUserId;", "(Ljava/lang/String;Lio/bidmachine/utils/Gender;Ljava/lang/Integer;Ljava/util/List;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getBirthdayYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCity", "()Ljava/lang/String;", "getCountry", "getDeviceLocation", "()Landroid/location/Location;", "getExternalUserIdList", "()Ljava/util/List;", "getFramework", "getGender", "()Lio/bidmachine/utils/Gender;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKeywords", "getStoreCategory", "getStoreSubCategories", "getStoreUrl", "getUserId", "getZip", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lio/bidmachine/utils/Gender;Ljava/lang/Integer;Ljava/util/List;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lio/bidmachine/TargetingParams$Data;", "equals", "other", "hashCode", "toString", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private final Integer birthdayYear;

        @Nullable
        private final String city;

        @Nullable
        private final String country;

        @Nullable
        private final Location deviceLocation;

        @Nullable
        private final List<ExternalUserId> externalUserIdList;

        @Nullable
        private final String framework;

        @Nullable
        private final Gender gender;

        @Nullable
        private final Boolean isPaid;

        @Nullable
        private final List<String> keywords;

        @Nullable
        private final String storeCategory;

        @Nullable
        private final List<String> storeSubCategories;

        @Nullable
        private final String storeUrl;

        @Nullable
        private final String userId;

        @Nullable
        private final String zip;

        public Data() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, Gender gender, Integer num, List list, Location location, String str2, String str3, String str4, String str5, String str6, List list2, String str7, Boolean bool, List list3, int i, Object obj) {
            return data.copy((i & 1) != 0 ? data.userId : str, (i & 2) != 0 ? data.gender : gender, (i & 4) != 0 ? data.birthdayYear : num, (i & 8) != 0 ? data.keywords : list, (i & 16) != 0 ? data.deviceLocation : location, (i & 32) != 0 ? data.country : str2, (i & 64) != 0 ? data.city : str3, (i & 128) != 0 ? data.zip : str4, (i & 256) != 0 ? data.storeUrl : str5, (i & 512) != 0 ? data.storeCategory : str6, (i & 1024) != 0 ? data.storeSubCategories : list2, (i & 2048) != 0 ? data.framework : str7, (i & 4096) != 0 ? data.isPaid : bool, (i & 8192) != 0 ? data.externalUserIdList : list3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final String getStoreCategory() {
            return this.storeCategory;
        }

        @Nullable
        public final List<String> component11() {
            return this.storeSubCategories;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final String getFramework() {
            return this.framework;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final Boolean getIsPaid() {
            return this.isPaid;
        }

        @Nullable
        public final List<ExternalUserId> component14() {
            return this.externalUserIdList;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Gender getGender() {
            return this.gender;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getBirthdayYear() {
            return this.birthdayYear;
        }

        @Nullable
        public final List<String> component4() {
            return this.keywords;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Location getDeviceLocation() {
            return this.deviceLocation;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getZip() {
            return this.zip;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final String getStoreUrl() {
            return this.storeUrl;
        }

        @NotNull
        public final Data copy(@Nullable String userId, @Nullable Gender gender, @Nullable Integer birthdayYear, @Nullable List<String> keywords, @Nullable Location deviceLocation, @Nullable String country, @Nullable String city, @Nullable String zip, @Nullable String storeUrl, @Nullable String storeCategory, @Nullable List<String> storeSubCategories, @Nullable String framework, @Nullable Boolean isPaid, @Nullable List<? extends ExternalUserId> externalUserIdList) {
            return new Data(userId, gender, birthdayYear, keywords, deviceLocation, country, city, zip, storeUrl, storeCategory, storeSubCategories, framework, isPaid, externalUserIdList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.userId, data.userId) && this.gender == data.gender && Intrinsics.areEqual(this.birthdayYear, data.birthdayYear) && Intrinsics.areEqual(this.keywords, data.keywords) && Intrinsics.areEqual(this.deviceLocation, data.deviceLocation) && Intrinsics.areEqual(this.country, data.country) && Intrinsics.areEqual(this.city, data.city) && Intrinsics.areEqual(this.zip, data.zip) && Intrinsics.areEqual(this.storeUrl, data.storeUrl) && Intrinsics.areEqual(this.storeCategory, data.storeCategory) && Intrinsics.areEqual(this.storeSubCategories, data.storeSubCategories) && Intrinsics.areEqual(this.framework, data.framework) && Intrinsics.areEqual(this.isPaid, data.isPaid) && Intrinsics.areEqual(this.externalUserIdList, data.externalUserIdList);
        }

        @Nullable
        public final Integer getBirthdayYear() {
            return this.birthdayYear;
        }

        @Nullable
        public final String getCity() {
            return this.city;
        }

        @Nullable
        public final String getCountry() {
            return this.country;
        }

        @Nullable
        public final Location getDeviceLocation() {
            return this.deviceLocation;
        }

        @Nullable
        public final List<ExternalUserId> getExternalUserIdList() {
            return this.externalUserIdList;
        }

        @Nullable
        public final String getFramework() {
            return this.framework;
        }

        @Nullable
        public final Gender getGender() {
            return this.gender;
        }

        @Nullable
        public final List<String> getKeywords() {
            return this.keywords;
        }

        @Nullable
        public final String getStoreCategory() {
            return this.storeCategory;
        }

        @Nullable
        public final List<String> getStoreSubCategories() {
            return this.storeSubCategories;
        }

        @Nullable
        public final String getStoreUrl() {
            return this.storeUrl;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        public final String getZip() {
            return this.zip;
        }

        public int hashCode() {
            String str = this.userId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Gender gender = this.gender;
            int hashCode2 = (hashCode + (gender == null ? 0 : gender.hashCode())) * 31;
            Integer num = this.birthdayYear;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            List<String> list = this.keywords;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Location location = this.deviceLocation;
            int hashCode5 = (hashCode4 + (location == null ? 0 : location.hashCode())) * 31;
            String str2 = this.country;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.city;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zip;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.storeUrl;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.storeCategory;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            List<String> list2 = this.storeSubCategories;
            int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str7 = this.framework;
            int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.isPaid;
            int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<ExternalUserId> list3 = this.externalUserIdList;
            return hashCode13 + (list3 != null ? list3.hashCode() : 0);
        }

        @Nullable
        public final Boolean isPaid() {
            return this.isPaid;
        }

        @NotNull
        public String toString() {
            return "Data(userId=" + this.userId + ", gender=" + this.gender + ", birthdayYear=" + this.birthdayYear + ", keywords=" + this.keywords + ", deviceLocation=" + this.deviceLocation + ", country=" + this.country + ", city=" + this.city + ", zip=" + this.zip + ", storeUrl=" + this.storeUrl + ", storeCategory=" + this.storeCategory + ", storeSubCategories=" + this.storeSubCategories + ", framework=" + this.framework + ", isPaid=" + this.isPaid + ", externalUserIdList=" + this.externalUserIdList + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(@Nullable String str, @Nullable Gender gender, @Nullable Integer num, @Nullable List<String> list, @Nullable Location location, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list2, @Nullable String str7, @Nullable Boolean bool, @Nullable List<? extends ExternalUserId> list3) {
            this.userId = str;
            this.gender = gender;
            this.birthdayYear = num;
            this.keywords = list;
            this.deviceLocation = location;
            this.country = str2;
            this.city = str3;
            this.zip = str4;
            this.storeUrl = str5;
            this.storeCategory = str6;
            this.storeSubCategories = list2;
            this.framework = str7;
            this.isPaid = bool;
            this.externalUserIdList = list3;
        }

        public /* synthetic */ Data(String str, Gender gender, Integer num, List list, Location location, String str2, String str3, String str4, String str5, String str6, List list2, String str7, Boolean bool, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : gender, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : location, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : bool, (i & 8192) == 0 ? list3 : null);
        }
    }

    public TargetingParams() {
        this.data = new Data(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    private final BlockedParams prepareBlockParams() {
        BlockedParams blockedParams = this.blockedParams;
        if (blockedParams != null) {
            return blockedParams;
        }
        BlockedParams blockedParams2 = new BlockedParams();
        this.blockedParams = blockedParams2;
        return blockedParams2;
    }

    @Nullable
    public final Integer getBirthdayYear() {
        return this.data.getBirthdayYear();
    }

    /* renamed from: getBlockedParams$bidmachine_android_sdk_ba_3_7_1, reason: from getter */
    public final /* synthetic */ BlockedParams getBlockedParams() {
        return this.blockedParams;
    }

    @Nullable
    public final String getCity() {
        return this.data.getCity();
    }

    @Nullable
    public final String getCountry() {
        return this.data.getCountry();
    }

    /* renamed from: getData$bidmachine_android_sdk_ba_3_7_1, reason: from getter */
    public final /* synthetic */ Data getData() {
        return this.data;
    }

    @Nullable
    public final Location getDeviceLocation() {
        return this.data.getDeviceLocation();
    }

    @Nullable
    public final List<ExternalUserId> getExternalUserIdList() {
        return this.data.getExternalUserIdList();
    }

    @Nullable
    public final String getFramework() {
        return this.data.getFramework();
    }

    @Nullable
    public final Gender getGender() {
        return this.data.getGender();
    }

    @Nullable
    public final List<String> getKeywords() {
        return this.data.getKeywords();
    }

    @Nullable
    public final Boolean getPaid() {
        return this.data.isPaid();
    }

    @Nullable
    public final String getStoreCategory() {
        return this.data.getStoreCategory();
    }

    @Nullable
    public final String[] getStoreSubCategories() {
        List<String> storeSubCategories = this.data.getStoreSubCategories();
        if (storeSubCategories != null) {
            return (String[]) storeSubCategories.toArray(new String[0]);
        }
        return null;
    }

    @Nullable
    public final String getStoreUrl() {
        return this.data.getStoreUrl();
    }

    @Nullable
    public final String getUserId() {
        return this.data.getUserId();
    }

    @Nullable
    public final String getZip() {
        return this.data.getZip();
    }

    @Override // io.bidmachine.models.ITargetingParams
    public /* bridge */ /* synthetic */ TargetingParams setExternalUserIds(List list) {
        return setExternalUserIds((List<? extends ExternalUserId>) list);
    }

    @Override // io.bidmachine.models.IBlockedParams
    @NotNull
    public TargetingParams addBlockedAdvertiserDomain(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        prepareBlockParams().addBlockedAdvertiserDomain(domain);
        return this;
    }

    @Override // io.bidmachine.models.IBlockedParams
    @NotNull
    public TargetingParams addBlockedAdvertiserIABCategory(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        prepareBlockParams().addBlockedAdvertiserIABCategory(category);
        return this;
    }

    @Override // io.bidmachine.models.IBlockedParams
    @NotNull
    public TargetingParams addBlockedApplication(@NotNull String bundleOrPackage) {
        Intrinsics.checkNotNullParameter(bundleOrPackage, "bundleOrPackage");
        prepareBlockParams().addBlockedApplication(bundleOrPackage);
        return this;
    }

    @Override // io.bidmachine.models.RequestParams
    public void merge(@NotNull TargetingParams instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Data data = this.data;
        String userId = data.getUserId();
        if (userId == null) {
            userId = instance.data.getUserId();
        }
        String str = userId;
        Gender gender = data.getGender();
        if (gender == null) {
            gender = instance.data.getGender();
        }
        Gender gender2 = gender;
        Integer birthdayYear = data.getBirthdayYear();
        if (birthdayYear == null) {
            birthdayYear = instance.data.getBirthdayYear();
        }
        Integer num = birthdayYear;
        List<String> keywords = data.getKeywords();
        if (keywords == null) {
            keywords = instance.data.getKeywords();
        }
        List<String> list = keywords;
        Location deviceLocation = data.getDeviceLocation();
        if (deviceLocation == null) {
            deviceLocation = instance.data.getDeviceLocation();
        }
        Location location = deviceLocation;
        String country = data.getCountry();
        if (country == null) {
            country = instance.data.getCountry();
        }
        String str2 = country;
        String city = data.getCity();
        if (city == null) {
            city = instance.data.getCity();
        }
        String str3 = city;
        String zip = data.getZip();
        if (zip == null) {
            zip = instance.data.getZip();
        }
        String str4 = zip;
        String storeUrl = data.getStoreUrl();
        if (storeUrl == null) {
            storeUrl = instance.data.getStoreUrl();
        }
        String str5 = storeUrl;
        String storeCategory = data.getStoreCategory();
        if (storeCategory == null) {
            storeCategory = instance.data.getStoreCategory();
        }
        String str6 = storeCategory;
        List<String> storeSubCategories = data.getStoreSubCategories();
        if (storeSubCategories == null) {
            storeSubCategories = instance.data.getStoreSubCategories();
        }
        List<String> list2 = storeSubCategories;
        String framework = data.getFramework();
        if (framework == null) {
            framework = instance.data.getFramework();
        }
        String str7 = framework;
        Boolean isPaid = data.isPaid();
        if (isPaid == null) {
            isPaid = instance.data.isPaid();
        }
        Boolean bool = isPaid;
        List<ExternalUserId> externalUserIdList = data.getExternalUserIdList();
        if (externalUserIdList == null) {
            externalUserIdList = instance.data.getExternalUserIdList();
        }
        this.data = data.copy(str, gender2, num, list, location, str2, str3, str4, str5, str6, list2, str7, bool, externalUserIdList);
        BlockedParams blockedParams = instance.blockedParams;
        if (blockedParams != null) {
            if (this.blockedParams == null) {
                this.blockedParams = new BlockedParams();
            }
            BlockedParams blockedParams2 = this.blockedParams;
            if (blockedParams2 != null) {
                blockedParams2.merge(blockedParams);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setBirthdayYear(@Nullable Integer birthdayYear) {
        if (birthdayYear == null || Utils.isYearValid(birthdayYear.intValue())) {
            this.data = Data.copy$default(this.data, null, null, birthdayYear, null, null, null, null, null, null, null, null, null, null, null, 16379, null);
        } else {
            Logger.e("Birthday Year should be 4-digit integer, more or equal 1900 and less or equal than current year");
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setCity(@Nullable String city) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, city, null, null, null, null, null, null, null, 16319, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setCountry(@Nullable String country) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, country, null, null, null, null, null, null, null, null, 16351, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setDeviceLocation(@Nullable Location location) {
        this.data = Data.copy$default(this.data, null, null, null, null, location, null, null, null, null, null, null, null, null, null, 16367, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setExternalUserIds(@Nullable List<? extends ExternalUserId> externalUserIdList) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, null, null, null, null, null, externalUserIdList != null ? CollectionsKt.toList(externalUserIdList) : null, 8191, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setFramework(@Nullable String framework) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, null, null, null, framework, null, null, 14335, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setGender(@Nullable Gender gender) {
        this.data = Data.copy$default(this.data, null, gender, null, null, null, null, null, null, null, null, null, null, null, null, 16381, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setKeywords(@NotNull String... keywords) {
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.data = Data.copy$default(this.data, null, null, null, ArraysKt.filterNotNull(keywords), null, null, null, null, null, null, null, null, null, null, 16375, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setPaid(@Nullable Boolean paid) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, null, null, null, null, paid, null, 12287, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setStoreCategory(@Nullable String storeCategory) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, null, storeCategory, null, null, null, null, 15871, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setStoreSubCategories(@NotNull String... storeSubCategories) {
        Intrinsics.checkNotNullParameter(storeSubCategories, "storeSubCategories");
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, null, null, ArraysKt.filterNotNull(storeSubCategories), null, null, null, 15359, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setStoreUrl(@Nullable String url) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, null, url, null, null, null, null, null, 16127, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setUserId(@Nullable String userId) {
        this.data = Data.copy$default(this.data, userId, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ITargetingParams
    @NotNull
    public TargetingParams setZip(@Nullable String zip) {
        this.data = Data.copy$default(this.data, null, null, null, null, null, null, null, zip, null, null, null, null, null, null, 16255, null);
        return this;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ TargetingParams(io.bidmachine.TargetingParams.Data r19, io.bidmachine.BlockedParams r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r18 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L1d
            io.bidmachine.TargetingParams$Data r0 = new io.bidmachine.TargetingParams$Data
            r1 = r0
            r16 = 16383(0x3fff, float:2.2957E-41)
            r17 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L1f
        L1d:
            r0 = r19
        L1f:
            r1 = r21 & 2
            if (r1 == 0) goto L27
            r1 = 0
            r2 = r18
            goto L2b
        L27:
            r2 = r18
            r1 = r20
        L2b:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.TargetingParams.<init>(io.bidmachine.TargetingParams$Data, io.bidmachine.BlockedParams, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetingParams(@NotNull Data data, @Nullable BlockedParams blockedParams) {
        this();
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.blockedParams = blockedParams;
    }
}
