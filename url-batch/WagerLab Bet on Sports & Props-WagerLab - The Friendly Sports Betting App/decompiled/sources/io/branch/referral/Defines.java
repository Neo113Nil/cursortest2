package io.branch.referral;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amazon.a.a.o.b;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.branch.referral.validators.LinkingValidatorConstants;

/* loaded from: classes7.dex */
public class Defines {

    public enum BranchAttributionLevel {
        FULL,
        REDUCED,
        MINIMAL,
        NONE
    }

    public enum Jsonkey {
        RandomizedBundleToken("randomized_bundle_token"),
        Identity(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY),
        RandomizedDeviceToken("randomized_device_token"),
        SessionID(SDKAnalyticsEvents.PARAMETER_SESSION_ID),
        LinkClickID("link_click_id"),
        GoogleSearchInstallReferrer("google_search_install_referrer"),
        GooglePlayInstallReferrer("install_referrer_extras"),
        ClickedReferrerTimeStamp("clicked_referrer_ts"),
        ClickedReferrerServerTimeStamp("clicked_referrer_server_ts"),
        Gclid("gclid"),
        IsDeeplinkGclid("is_deeplink_gclid"),
        ReferrerGclid("referrer_gclid"),
        ReferringUrlQueryParameters("bnc_referringUrlQueryParameters"),
        InstallBeginTimeStamp("install_begin_ts"),
        InstallBeginServerTimeStamp("install_begin_server_ts"),
        BranchLinkUsed("branch_used"),
        ReferringBranchIdentity("referring_branch_identity"),
        BranchIdentity("branch_identity"),
        BranchKey("branch_key"),
        BranchData("branch_data"),
        PlayAutoInstalls("play-auto-installs"),
        UTMCampaign("utm_campaign"),
        UTMMedium("utm_medium"),
        InitialReferrer("initial_referrer"),
        Bucket("bucket"),
        DefaultBucket("default"),
        Amount("amount"),
        CalculationType("calculation_type"),
        Location(FirebaseAnalytics.Param.LOCATION),
        Type("type"),
        CreationSource("creation_source"),
        Prefix("prefix"),
        Expiration("expiration"),
        Event(NotificationCompat.CATEGORY_EVENT),
        Metadata(TtmlNode.TAG_METADATA),
        CommerceData("commerce_data"),
        Total("total"),
        Unique("unique"),
        Length("length"),
        Direction("direction"),
        BeginAfterID("begin_after_id"),
        Link("link"),
        ReferringData("referring_data"),
        ReferringLink("referring_link"),
        IsFullAppConv("is_full_app_conversion"),
        Data("data"),
        OS("os"),
        HardwareID("hardware_id"),
        AndroidID("android_id"),
        UnidentifiedDevice("unidentified_device"),
        HardwareIDType("hardware_id_type"),
        HardwareIDTypeVendor("vendor_id"),
        HardwareIDTypeRandom("random"),
        IsHardwareIDReal("is_hardware_id_real"),
        AnonID("anon_id"),
        AppVersion("app_version"),
        APILevel("os_version"),
        Country(UserDataStore.COUNTRY),
        Language("language"),
        Update("update"),
        OriginalInstallTime("first_install_time"),
        FirstInstallTime("latest_install_time"),
        LastUpdateTime("latest_update_time"),
        PreviousUpdateTime("previous_update_time"),
        URIScheme("uri_scheme"),
        AppLinks("app_links"),
        AppIdentifier("app_identifier"),
        LinkIdentifier("link_identifier"),
        GoogleAdvertisingID("google_advertising_id"),
        AAID("aaid"),
        FireAdId("fire_ad_id"),
        OpenAdvertisingID("oaid"),
        LATVal("lat_val"),
        LimitedAdTracking("limit_ad_tracking"),
        limitFacebookTracking("limit_facebook_tracking"),
        Debug(b.ar),
        Brand("brand"),
        Model(DeviceRequestsHelper.DEVICE_INFO_MODEL),
        ScreenDpi("screen_dpi"),
        ScreenHeight("screen_height"),
        ScreenWidth("screen_width"),
        WiFi("wifi"),
        LocalIP("local_ip"),
        UserData("user_data"),
        AdvertisingIDs("advertising_ids"),
        DeveloperIdentity("developer_identity"),
        UserAgent("user_agent"),
        SDK(ServerProtocol.DIALOG_PARAM_SDK_VERSION),
        SdkVersion("sdk_version"),
        UIMode("ui_mode"),
        InstallMetadata("install_metadata"),
        LATDAttributionWindow("attribution_window"),
        Clicked_Branch_Link("+clicked_branch_link"),
        IsFirstSession("+is_first_session"),
        AndroidDeepLinkPath("$android_deeplink_path"),
        DeepLinkPath("$deeplink_path"),
        AndroidAppLinkURL("android_app_link_url"),
        AndroidPushNotificationKey("branch"),
        AndroidPushIdentifier("push_identifier"),
        CanonicalIdentifier("$canonical_identifier"),
        ContentTitle(Branch.OG_TITLE),
        ContentDesc(Branch.OG_DESC),
        ContentImgUrl(Branch.OG_IMAGE_URL),
        CanonicalUrl(LinkingValidatorConstants.canonicalUrlKey),
        ContentType("$content_type"),
        PublicallyIndexable("$publicly_indexable"),
        LocallyIndexable("$locally_indexable"),
        ContentKeyWords("$keywords"),
        ContentExpiryTime("$exp_date"),
        Params("params"),
        SharedLink("$shared_link"),
        ShareError("$share_error"),
        SharedChannel("$shared_channel"),
        URLSource("android"),
        External_Intent_URI("external_intent_uri"),
        External_Intent_Extra("external_intent_extra"),
        Last_Round_Trip_Time("lrtt"),
        Branch_Round_Trip_Time("brtt"),
        Branch_Instrumentation("instrumentation"),
        Queue_Wait_Time("qwt"),
        InstantDeepLinkSession("instant_dl_session"),
        Path("path"),
        ViewList("view_list"),
        ContentActionView(ViewHierarchyConstants.VIEW_KEY),
        ContentPath("content_path"),
        ContentNavPath("content_nav_path"),
        ReferralLink("referral_link"),
        ContentData("content_data"),
        ContentEvents("events"),
        ContentAnalyticsMode("content_analytics_mode"),
        Environment("environment"),
        InstantApp("INSTANT_APP"),
        NativeApp("FULL_APP"),
        CustomerEventAlias("customer_event_alias"),
        TransactionID(FirebaseAnalytics.Param.TRANSACTION_ID),
        Currency("currency"),
        Revenue("revenue"),
        Shipping(FirebaseAnalytics.Param.SHIPPING),
        Tax(FirebaseAnalytics.Param.TAX),
        Coupon(FirebaseAnalytics.Param.COUPON),
        Affiliation(FirebaseAnalytics.Param.AFFILIATION),
        Description("description"),
        SearchQuery("search_query"),
        AdType(AppEventsConstants.EVENT_PARAM_AD_TYPE),
        CPUType("cpu_type"),
        DeviceBuildId(InAppPurchaseConstants.METHOD_BUILD),
        Locale(Constants.LOCALE),
        ConnectionType("connection_type"),
        DeviceCarrier("device_carrier"),
        PluginName("plugin_name"),
        PluginVersion("plugin_version"),
        OSVersionAndroid("os_version_android"),
        Name("name"),
        CustomData("custom_data"),
        EventData("event_data"),
        ContentItems("content_items"),
        ContentSchema("$content_schema"),
        Price("$price"),
        PriceCurrency("$currency"),
        Quantity("$quantity"),
        SKU("$sku"),
        ProductName("$product_name"),
        ProductBrand("$product_brand"),
        ProductCategory("$product_category"),
        ProductVariant("$product_variant"),
        Rating("$rating"),
        RatingAverage("$rating_average"),
        RatingCount("$rating_count"),
        RatingMax("$rating_max"),
        AddressStreet("$address_street"),
        AddressCity("$address_city"),
        AddressRegion("$address_region"),
        AddressCountry("$address_country"),
        AddressPostalCode("$address_postal_code"),
        Latitude("$latitude"),
        Longitude("$longitude"),
        ImageCaptions("$image_captions"),
        Condition("$condition"),
        CreationTimestamp("$creation_timestamp"),
        TrackingDisabled("tracking_disabled"),
        DisableAdNetworkCallouts("disable_ad_network_callouts"),
        PartnerData("partner_data"),
        Instant("instant"),
        QRCodeTag("qr-code"),
        CodeColor("code_color"),
        BackgroundColor("background_color"),
        Width("width"),
        Margin(ViewProps.MARGIN),
        ImageFormat("image_format"),
        CenterLogo("center_logo_url"),
        QRCodeSettings("qr_code_settings"),
        QRCodeData("data"),
        QRCodeBranchKey("branch_key"),
        QRCodeResponseString("QRCodeString"),
        App_Store("app_store"),
        Google_Play_Store("PlayStore"),
        Huawei_App_Gallery("AppGallery"),
        Samsung_Galaxy_Store("GalaxyStore"),
        Xiaomi_Get_Apps("GetApps"),
        Meta_Install_Referrer("Meta"),
        DMA_EEA("dma_eea"),
        DMA_Ad_Personalization("dma_ad_personalization"),
        DMA_Ad_User_Data("dma_ad_user_data"),
        Is_Meta_Click_Through("is_meta_ct"),
        OperationalMetrics("operational_metrics"),
        Consumer_Protection_Attribution_Level("cpp_level"),
        Branch_Sdk_Request_Creation_Time_Stamp("branch_sdk_request_timestamp"),
        Branch_Sdk_Request_Uuid("branch_sdk_request_unique_id"),
        Invoke_Features("invoke_features"),
        IN_APP_WEBVIEW("IN_APP_WEBVIEW"),
        EXTERNAL_BROWSER("EXTERNAL_BROWSER"),
        Enhanced_Web_Link_UX("enhanced_web_link_ux"),
        Web_Link_Redirect_URL("web_link_redirect_url"),
        Web_Link_Context("web_link_context"),
        UX_Type("ux_type"),
        URL_Load_MS("url_load_ms");

        private final String key;

        Jsonkey(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum RequestPath {
        GetURL("v1/url"),
        GetApp("v1/app-link-settings"),
        RegisterInstall("v1/install"),
        RegisterOpen("v1/open"),
        ContentEvent("v1/content-events"),
        TrackStandardEvent("v2/event/standard"),
        TrackCustomEvent("v2/event/custom"),
        GetLATD("v1/cpid/latd"),
        QRCode("v1/qr-code");

        private final String key;

        RequestPath(String str) {
            this.key = str;
        }

        public String getPath() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum LinkParam {
        Tags("tags"),
        Alias("alias"),
        Type("type"),
        Duration(TypedValues.TransitionType.S_DURATION),
        Channel("channel"),
        Feature("feature"),
        Stage("stage"),
        Campaign("campaign"),
        Data("data"),
        URL("url");

        private final String key;

        LinkParam(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum PreinstallKey {
        campaign("preinstall_campaign"),
        partner("preinstall_partner");

        private final String key;

        PreinstallKey(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum IntentKeys {
        BranchData("branch_data"),
        ForceNewBranchSession("branch_force_new_session"),
        BranchLinkUsed("branch_used"),
        BranchURI("branch"),
        AutoDeepLinked("io.branch.sdk.auto_linked");

        private final String key;

        IntentKeys(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public enum HeaderKey {
        RequestId("X-Branch-Request-Id"),
        SendCloseRequest("X-Branch-Send-Close-Request");

        private final String key;

        HeaderKey(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }
}
