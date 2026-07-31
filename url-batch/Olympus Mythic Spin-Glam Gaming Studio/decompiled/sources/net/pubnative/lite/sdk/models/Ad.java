package net.pubnative.lite.sdk.models;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.utils.AdExperienceManager;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.ClickThroughTimerManager;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Ad extends JsonModel implements Serializable, Comparable<Ad> {
    public static final String CONTENT_INFO_ICON_URL = "https://cdn.pubnative.net/static/adserver/contentinfo.png";
    public static final String CONTENT_INFO_LINK_URL = "https://pubnative.net/content-info";
    public static final String CONTENT_INFO_TEXT = "Learn about this ad";
    private static final String DATA_CONTENTINFO_ICON_KEY = "icon";
    private static final String DATA_CONTENTINFO_LINK_KEY = "link";
    private static final String DATA_POINTS_NUMBER_KEY = "number";
    private static final String DATA_TEXT_KEY = "text";
    public static final Integer HTML_REWARDED_DEFAULT_SKIP_OFFSET = 3;
    private static final int MIN_POINTS = 10;
    private static final String SDK_IMPRESSION_QUERY_PARAM = "t";
    private static final String SDK_IMPRESSION_URL = "got.pubnative.net";
    private static final String TAG = "Ad";
    private String adSourceName;

    @BindField
    public int assetgroupid;

    @BindField
    public List<AdData> assets;

    @BindField
    public List<AdData> beacons;
    private boolean hasEndCard;

    @BindField
    public String link;

    @BindField
    public List<AdData> meta;
    private String sessiondId;
    private String zoneId;

    public enum AdType {
        HTML,
        VIDEO
    }

    public interface Beacon {
        public static final String CLICK = "click";
        public static final String COMPANION_AD_EVENT = "companion_ad_event";
        public static final String CUSTOM_CTA_CLICK = "custom_cta_click";
        public static final String CUSTOM_CTA_ENDCARD_CLICK = "custom_cta_endcard_click";
        public static final String CUSTOM_CTA_SHOW = "custom_cta_show";
        public static final String CUSTOM_ENDCARD_EVENT = "custom_endcard_event";
        public static final String CUSTOM_END_CARD_CLICK = "custom_endcard_click";
        public static final String CUSTOM_END_CARD_IMPRESSION = "custom_endcard_impression";
        public static final String IMPRESSION = "impression";
        public static final String SDK_EVENT = "sdk_event";
    }

    public Ad() {
        this.hasEndCard = false;
    }

    private Integer getBcEndCardCloseDelay() {
        Integer num = (Integer) getRemoteConfig(RemoteConfig.BC_END_CARD_CLOSE_DELAY);
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? SkipOffsetManager.getMaximumEndcardCloseDelay() : num : SkipOffsetManager.getDefaultBCEndcardSkipOffset();
    }

    private Integer getBcVideoRewardedSkipOffset() {
        return getSkipOffset(RemoteConfig.BC_REWARDED_VIDEO_SKIP_OFFSET);
    }

    private Integer getBcVideoSkipOffset() {
        return getSkipOffset(RemoteConfig.BC_VIDEO_SKIP_OFFSET);
    }

    private PNAPIContentInfoView getCustomContentInfo(Context context, ContentInfo contentInfo, PNAPIContentInfoView.ContentInfoListener contentInfoListener) {
        if (contentInfo == null || TextUtils.isEmpty(contentInfo.getIconUrl())) {
            return null;
        }
        PNAPIContentInfoView pNAPIContentInfoView = new PNAPIContentInfoView(context, getContentInfoIconXPosition());
        pNAPIContentInfoView.setIconId(R.id.ic_context_icon_custom);
        pNAPIContentInfoView.setIconUrl(contentInfo.getIconUrl());
        pNAPIContentInfoView.setIconClickUrl(contentInfo.getLinkUrl());
        pNAPIContentInfoView.setIconClickTrackers(contentInfo.getClickTrackers());
        if (TextUtils.isEmpty(contentInfo.getText())) {
            pNAPIContentInfoView.setContextText("Learn about this ad");
        } else {
            pNAPIContentInfoView.setContextText(contentInfo.getText());
        }
        if (contentInfo.getWidth() != -1 && contentInfo.getHeight() != -1) {
            pNAPIContentInfoView.setDpDimensions(contentInfo);
        }
        final ContentInfoIconAction contentInfoIconAction = getContentInfoIconAction();
        pNAPIContentInfoView.setContentInfoDisplay(getContentInfoDisplay());
        pNAPIContentInfoView.setContentInfoListener(contentInfoListener);
        pNAPIContentInfoView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.models.Ad$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ad.lambda$getCustomContentInfo$1(ContentInfoIconAction.this, view);
            }
        });
        return pNAPIContentInfoView;
    }

    private PNAPIContentInfoView getDefaultContentInfo(Context context, boolean z, PNAPIContentInfoView.ContentInfoListener contentInfoListener) {
        final PNAPIContentInfoView pNAPIContentInfoView = new PNAPIContentInfoView(context, getContentInfoIconXPosition());
        pNAPIContentInfoView.setIconUrl(CONTENT_INFO_ICON_URL, true);
        pNAPIContentInfoView.setIconClickUrl(CONTENT_INFO_LINK_URL);
        pNAPIContentInfoView.setContextText("Learn about this ad");
        pNAPIContentInfoView.setContentInfoListener(contentInfoListener);
        final ContentInfoIconAction contentInfoIconAction = getContentInfoIconAction();
        pNAPIContentInfoView.setContentInfoDisplay(getContentInfoDisplay());
        pNAPIContentInfoView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.models.Ad$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ad.lambda$getDefaultContentInfo$2(PNAPIContentInfoView.this, view);
            }
        });
        pNAPIContentInfoView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.models.Ad$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ad.lambda$getDefaultContentInfo$3(ContentInfoIconAction.this, view);
            }
        });
        return pNAPIContentInfoView;
    }

    private Integer getPcEndCardCloseDelay() {
        Integer num = (Integer) getRemoteConfig(RemoteConfig.PC_END_CARD_CLOSE_DELAY);
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? SkipOffsetManager.getMaximumEndcardCloseDelay() : num : SkipOffsetManager.getDefaultPCEndcardSkipOffset();
    }

    private Integer getPcHtmlSkipOffset() {
        Integer num = (Integer) getRemoteConfig(RemoteConfig.PC_HTML_SKIP_OFFSET);
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? SkipOffsetManager.getMaximumEndcardCloseDelay() : num : SkipOffsetManager.getDefaultPCHTMLSkipOffset();
    }

    private Integer getPcMraidRewardedSkipOffset() {
        Integer num = (Integer) getRemoteConfig(RemoteConfig.PC_REWARDED_HTML_SKIP_OFFSET);
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? SkipOffsetManager.getMaximumEndcardCloseDelay() : num : SkipOffsetManager.getDefaultPCRewardedHTMLSkipOffset();
    }

    private Integer getPcVideoRewardedSkipOffset() {
        return getSkipOffset(RemoteConfig.PC_REWARDED_VIDEO_SKIP_OFFSET);
    }

    private Integer getPcVideoSkipOffset() {
        return getSkipOffset(RemoteConfig.PC_VIDEO_SKIP_OFFSET);
    }

    private Integer getSkipOffset(RemoteConfig remoteConfig) {
        return (Integer) getRemoteConfig(remoteConfig);
    }

    private Boolean isPcEndCardEnabled() {
        return (Boolean) getRemoteConfig(RemoteConfig.PC_END_CARD_ENABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getContentInfo$0(ContentInfoIconAction contentInfoIconAction, View view) {
        if (contentInfoIconAction == ContentInfoIconAction.OPEN) {
            ((PNAPIContentInfoView) view).openLink();
        } else {
            ((PNAPIContentInfoView) view).openLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCustomContentInfo$1(ContentInfoIconAction contentInfoIconAction, View view) {
        if (contentInfoIconAction == ContentInfoIconAction.OPEN) {
            ((PNAPIContentInfoView) view).openLink();
        } else {
            ((PNAPIContentInfoView) view).openLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDefaultContentInfo$2(PNAPIContentInfoView pNAPIContentInfoView, View view) {
        if (TextUtils.isEmpty(pNAPIContentInfoView.getIconClickURL())) {
            return;
        }
        ((PNAPIContentInfoView) view).openLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDefaultContentInfo$3(ContentInfoIconAction contentInfoIconAction, View view) {
        if (contentInfoIconAction == ContentInfoIconAction.OPEN) {
            ((PNAPIContentInfoView) view).openLink();
        } else {
            ((PNAPIContentInfoView) view).openLayout();
        }
    }

    protected AdData find(String str, List<AdData> list) {
        if (list == null) {
            return null;
        }
        for (AdData adData : list) {
            if (str.equals(adData.type)) {
                return adData;
            }
        }
        return null;
    }

    protected List<AdData> findAll(String str, List<AdData> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (AdData adData : list) {
                if (str.equals(adData.type)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(adData);
                }
            }
        }
        return arrayList;
    }

    public String getAdExperience() {
        AdData meta = getMeta("adexperience");
        if (meta == null) {
            return "";
        }
        String stringField = meta.getStringField("text");
        return (TextUtils.isEmpty(stringField) || !(stringField.equalsIgnoreCase("brand") || stringField.equalsIgnoreCase("performance"))) ? "" : stringField;
    }

    public String getAdSourceName() {
        return this.adSourceName;
    }

    public AdData getAsset(String str) {
        return find(str, this.assets);
    }

    public int getAssetHeight(String str) {
        AdData asset = getAsset(str);
        if (asset != null) {
            return asset.getHeight();
        }
        return -1;
    }

    public String getAssetHtml(String str) {
        AdData asset = getAsset(str);
        if (asset != null) {
            return asset.getHtml();
        }
        return null;
    }

    public String getAssetUrl(String str) {
        AdData asset = getAsset(str);
        if (asset != null) {
            return asset.getURL();
        }
        return null;
    }

    public int getAssetWidth(String str) {
        AdData asset = getAsset(str);
        if (asset != null) {
            return asset.getWidth();
        }
        return -1;
    }

    public String getAudioState() {
        return (String) getRemoteConfig(RemoteConfig.AUDIO_STATE);
    }

    public String getBcLearnMoreLocation() {
        String str = (String) getRemoteConfig(RemoteConfig.BC_LEARN_MORE_LOCATION);
        return TextUtils.isEmpty(str) ? LearnMoreLocation.DEFAULT.getLocationName() : str;
    }

    public String getBcLearnMoreSize() {
        String str = (String) getRemoteConfig(RemoteConfig.BC_LEARN_MORE_SIZE);
        return TextUtils.isEmpty(str) ? LearnMoreSize.DEFAULT.getSizeName() : str;
    }

    public List<AdData> getBeacons(String str) {
        return findAll(str, this.beacons);
    }

    public String getBundleId() {
        AdData meta = getMeta("bundleid");
        if (meta == null) {
            return "";
        }
        String stringField = meta.getStringField("text");
        return TextUtils.isEmpty(stringField) ? "" : stringField;
    }

    public BuyerSignals getBuyerSignals() {
        AdData meta = getMeta("pa_buyer_signals");
        if (meta != null && meta.hasField("jsondata").booleanValue()) {
            try {
                return new BuyerSignals(meta.getJSONObjectField("jsondata"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String getCampaignId() {
        AdData meta = getMeta("campaignid");
        if (meta == null) {
            return "";
        }
        String stringField = meta.getStringField("text");
        return TextUtils.isEmpty(stringField) ? "" : stringField;
    }

    public int getClickThroughTimer() {
        return isPerformanceAd() ? ClickThroughTimerManager.getClickThroughTimer((Integer) getRemoteConfig(RemoteConfig.PC_CLICK_THROUGH_TIMER)) : isBrandAd() ? ClickThroughTimerManager.getClickThroughTimer((Integer) getRemoteConfig(RemoteConfig.BC_CLICK_THROUGH_TIMER)) : ClickThroughTimerManager.getClickThroughTimer((Integer) getRemoteConfig(RemoteConfig.CLICK_THROUGH_TIMER));
    }

    public String getConfigId() {
        List<Integer> configIds;
        RemoteConfigsDebug remoteConfigDebug = getRemoteConfigDebug();
        return (remoteConfigDebug == null || (configIds = remoteConfigDebug.getConfigIds()) == null || configIds.isEmpty()) ? "" : configIds.get(0).toString();
    }

    public View getContentInfo(Context context, PNAPIContentInfoView.ContentInfoListener contentInfoListener) {
        boolean z;
        if (context == null) {
            return null;
        }
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_URL);
        String str2 = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_ICON_URL);
        String str3 = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_TEXT);
        final ContentInfoIconAction contentInfoIconAction = getContentInfoIconAction();
        ContentInfoDisplay contentInfoDisplay = getContentInfoDisplay();
        AdData meta = getMeta("contentinfo");
        if (TextUtils.isEmpty(str)) {
            str = (meta == null || TextUtils.isEmpty(meta.getStringField("link"))) ? CONTENT_INFO_LINK_URL : meta.getStringField("link");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = (meta == null || TextUtils.isEmpty(meta.getStringField("icon"))) ? CONTENT_INFO_ICON_URL : meta.getStringField("icon");
            z = false;
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = (meta == null || TextUtils.isEmpty(meta.getText())) ? "Learn about this ad" : meta.getText();
        }
        PNAPIContentInfoView pNAPIContentInfoView = new PNAPIContentInfoView(context, getContentInfoIconXPosition());
        pNAPIContentInfoView.setIconUrl(str2, false, z);
        pNAPIContentInfoView.setIconClickUrl(str);
        pNAPIContentInfoView.setContextText(str3);
        pNAPIContentInfoView.setContentInfoListener(contentInfoListener);
        pNAPIContentInfoView.setContentInfoDisplay(contentInfoDisplay);
        pNAPIContentInfoView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.models.Ad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ad.lambda$getContentInfo$0(ContentInfoIconAction.this, view);
            }
        });
        return pNAPIContentInfoView;
    }

    public String getContentInfoClickUrl() {
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_URL);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AdData meta = getMeta("contentinfo");
        if (meta != null) {
            return meta.getStringField("link");
        }
        return null;
    }

    public FrameLayout getContentInfoContainer(Context context, PNAPIContentInfoView.ContentInfoListener contentInfoListener) {
        return getContentInfoContainer(context, null, contentInfoListener);
    }

    public ContentInfoDisplay getContentInfoDisplay() {
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_DISPLAY);
        return TextUtils.isEmpty(str) ? ContentInfoDisplay.SYSTEM_BROWSER : ContentInfoDisplay.fromString(str);
    }

    public ContentInfoIconAction getContentInfoIconAction() {
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_ICON_CLICK_ACTION);
        return TextUtils.isEmpty(str) ? ContentInfoIconAction.EXPAND : ContentInfoIconAction.fromString(str);
    }

    public String getContentInfoIconUrl() {
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_ICON_URL);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AdData meta = getMeta("contentinfo");
        if (meta != null) {
            return meta.getStringField("icon");
        }
        return null;
    }

    public ContentInfoIconXPosition getContentInfoIconXPosition() {
        return ContentInfoIconXPosition.getDefaultXPosition();
    }

    public ContentInfoIconYPosition getContentInfoIconYPosition() {
        return ContentInfoIconYPosition.getDefaultYPosition();
    }

    public String getContentInfoText() {
        String str = (String) getRemoteConfig(RemoteConfig.CONTENT_INFO_TEXT);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AdData meta = getMeta("contentinfo");
        return (meta == null || TextUtils.isEmpty(meta.getText())) ? "Learn about this ad" : meta.getText();
    }

    public String getCreativeId() {
        AdData meta = getMeta("creativeid");
        if (meta == null) {
            return "";
        }
        String stringField = meta.getStringField("text");
        return TextUtils.isEmpty(stringField) ? "" : stringField;
    }

    public Integer getCustomCTADelay() {
        return (Integer) getRemoteConfig(RemoteConfig.CUSTOM_CTA_DELAY);
    }

    public String getCustomCTAType() {
        return (String) getRemoteConfig(RemoteConfig.CUSTOM_CTA_TYPE);
    }

    public CustomCTAData getCustomCta(Context context, boolean z) {
        AdData asset = getAsset("custom_cta");
        if (asset != null && !TextUtils.isEmpty(asset.getStringField("icon"))) {
            return new CustomCTAData(asset.getStringField("icon"), context.getResources().getString(R.string.custom_cta_button));
        }
        if (z) {
            return null;
        }
        return new CustomCTAData(null, context.getResources().getString(R.string.custom_cta_button));
    }

    public EndCardData getCustomEndCard() {
        HashMap<String, String> atomJSData = AtomManager.getInstance().getAtomJSData();
        if (atomJSData != null && !atomJSData.isEmpty()) {
            return new EndCardData(EndCardData.Type.HTML_RESOURCE, atomJSData.get("SurveyHtml"), Boolean.TRUE);
        }
        AdData asset = getAsset("custom_endcard");
        if (asset == null || asset.getStringField("html") == null) {
            return null;
        }
        return new EndCardData(EndCardData.Type.HTML_RESOURCE, asset.getStringField("html"), Boolean.TRUE);
    }

    public CustomEndCardDisplay getCustomEndCardDisplay() {
        return CustomEndCardDisplay.fromString((String) getRemoteConfig(RemoteConfig.CUSTOM_END_CARD_DISPLAY));
    }

    public Integer getECPM() {
        AdData meta = getMeta("points");
        if (meta == null) {
            return 10;
        }
        Integer intField = meta.getIntField(DATA_POINTS_NUMBER_KEY);
        return Integer.valueOf(intField != null ? intField.intValue() : 10);
    }

    public Integer getEndCardCloseDelay() {
        if (isPerformanceAd()) {
            return getPcEndCardCloseDelay();
        }
        if (isBrandAd()) {
            return getBcEndCardCloseDelay();
        }
        Integer num = (Integer) getRemoteConfig(RemoteConfig.END_CARD_CLOSE_DELAY);
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? SkipOffsetManager.getMaximumEndcardCloseDelay() : num : SkipOffsetManager.getDefaultEndcardCloseDelay();
    }

    public Boolean getFullScreenClickability() {
        return (Boolean) getRemoteConfig(RemoteConfig.FULL_SCREEN_CLICKABILITY);
    }

    public Integer getHtmlSkipOffset() {
        return isPerformanceAd() ? getPcHtmlSkipOffset() : getSkipOffset(RemoteConfig.HTML_SKIP_OFFSET);
    }

    public String getImpressionId() {
        List<AdData> beacons = getBeacons("impression");
        String str = "";
        if (beacons != null) {
            boolean z = false;
            for (int i = 0; i < beacons.size() && !z; i++) {
                AdData adData = beacons.get(i);
                if (!TextUtils.isEmpty(adData.getURL())) {
                    Uri parse = Uri.parse(adData.getURL());
                    if (parse.getAuthority() != null && parse.getAuthority().equals(SDK_IMPRESSION_URL)) {
                        String queryParameter = parse.getQueryParameter(SDK_IMPRESSION_QUERY_PARAM);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            z = true;
                            str = queryParameter;
                        }
                    }
                }
            }
        }
        return str;
    }

    public Integer getImpressionMinVisibleTime() {
        Integer num = (Integer) getRemoteConfig(RemoteConfig.IMP_TRACKING_VISIBLE_TIME);
        if (num == null || num.intValue() < 0) {
            return null;
        }
        return num;
    }

    public String getImpressionTrackingMethod() {
        return (String) getRemoteConfig(RemoteConfig.IMP_TRACKING_METHOD);
    }

    public Double getImpressionVisiblePercent() {
        Double d = (Double) getRemoteConfig(RemoteConfig.IMP_TRACKING_VISIBLE_PERCENT);
        if (d == null || d.doubleValue() < 0.0d) {
            return null;
        }
        return d;
    }

    public LearnMoreData getLearnMoreData() {
        return new LearnMoreData(getBcLearnMoreSize(), getBcLearnMoreLocation());
    }

    public String getLink() {
        if (TextUtils.isEmpty(this.link)) {
            return null;
        }
        return this.link;
    }

    public AdData getMeta(String str) {
        return find(str, this.meta);
    }

    public Boolean getMraidExpand() {
        return (Boolean) getRemoteConfig(RemoteConfig.MRAID_EXPAND);
    }

    public Integer getMraidRewardedSkipOffset() {
        return isPerformanceAd() ? getPcMraidRewardedSkipOffset() : getSkipOffset(RemoteConfig.REWARDED_HTML_SKIP_OFFSET);
    }

    public Integer getNativeCloseButtonDelay() {
        return (Integer) getRemoteConfig(RemoteConfig.NATIVE_CLOSE_BUTTON_DELAY);
    }

    public String getNavigationMode() {
        return (String) getRemoteConfig(RemoteConfig.NAVIGATION_MODE);
    }

    public <T> T getRemoteConfig(RemoteConfig remoteConfig) {
        JSONObject jSONObjectField;
        AdData meta = getMeta("remoteconfigs");
        if (meta != null && meta.hasField("jsondata").booleanValue() && (jSONObjectField = meta.getJSONObjectField("jsondata")) != null && jSONObjectField.has(remoteConfig.fieldName)) {
            try {
                Class<?> cls = remoteConfig.type;
                if (cls == String.class) {
                    return (T) jSONObjectField.getString(remoteConfig.fieldName);
                }
                if (cls == Integer.class) {
                    return (T) Integer.valueOf(jSONObjectField.getInt(remoteConfig.fieldName));
                }
                if (cls == Double.class) {
                    return (T) Double.valueOf(jSONObjectField.getDouble(remoteConfig.fieldName));
                }
                if (cls == Boolean.class) {
                    return (T) Boolean.valueOf(jSONObjectField.getBoolean(remoteConfig.fieldName));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public RemoteConfigsDebug getRemoteConfigDebug() {
        AdData meta = getMeta("remoteconfigsdebug");
        if (meta != null && meta.hasField("jsondata").booleanValue()) {
            try {
                return new RemoteConfigsDebug(meta.getJSONObjectField("jsondata"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String getSessionId() {
        String impressionId = getImpressionId();
        if (impressionId != null && !impressionId.isEmpty()) {
            return impressionId;
        }
        if (this.sessiondId == null) {
            this.sessiondId = String.valueOf(UUID.randomUUID());
        }
        return this.sessiondId;
    }

    public String getVast() {
        AdData asset = getAsset("vast2");
        if (asset != null) {
            return asset.getStringField("vast2");
        }
        return null;
    }

    public Integer getVideoRewardedSkipOffset() {
        return isPerformanceAd() ? getPcVideoRewardedSkipOffset() : isBrandAd() ? getBcVideoRewardedSkipOffset() : getSkipOffset(RemoteConfig.REWARDED_VIDEO_SKIP_OFFSET);
    }

    public Integer getVideoSkipOffset() {
        return isPerformanceAd() ? getPcVideoSkipOffset() : isBrandAd() ? getBcVideoSkipOffset() : getSkipOffset(RemoteConfig.VIDEO_SKIP_OFFSET);
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public boolean hasCustomCTA() {
        return getAsset("custom_cta") != null;
    }

    public boolean hasCustomEndCard() {
        try {
            if (getAsset("custom_endcard") != null) {
                return true;
            }
            HashMap<String, String> atomJSData = AtomManager.getInstance().getAtomJSData();
            if (atomJSData == null) {
                return false;
            }
            String str = atomJSData.get("SurveyHtml");
            if (str != null && !str.isEmpty() && str.trim().length() >= 5) {
                return true;
            }
            Logger.d(TAG, "No survey data found in Atom");
            return false;
        } catch (Exception unused) {
            Logger.d(TAG, "Error checking survey data found in Atom");
            return false;
        }
    }

    public boolean hasEndCard() {
        return this.hasEndCard;
    }

    public boolean hasHiddenUxControls() {
        Boolean bool = (Boolean) getRemoteConfig(RemoteConfig.BC_HIDE_CONTROLS);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public Boolean isAtomEnabled() {
        return (Boolean) getRemoteConfig(RemoteConfig.ATOM_ENABLED);
    }

    public boolean isBrandAd() {
        return AdExperienceManager.isBrandAd(Integer.valueOf(this.assetgroupid), getAdExperience());
    }

    public Boolean isCustomCTAEnabled() {
        return (Boolean) getRemoteConfig(RemoteConfig.CUSTOM_CTA_ENABLED);
    }

    public Boolean isCustomEndCardEnabled() {
        return (Boolean) getRemoteConfig(RemoteConfig.CUSTOM_END_CARD_ENABLED);
    }

    public Boolean isEndCardEnabled() {
        return isPerformanceAd() ? isPcEndCardEnabled() : (Boolean) getRemoteConfig(RemoteConfig.END_CARD_ENABLED);
    }

    public Boolean isIconSizeReduced() {
        return (Boolean) getRemoteConfig(RemoteConfig.PC_REDUCED_ICON_SIZES);
    }

    public Boolean isLandingPage() {
        return (Boolean) getRemoteConfig(RemoteConfig.LANDING_PAGE);
    }

    public boolean isPerformanceAd() {
        return AdExperienceManager.isPerformanceAd(Integer.valueOf(this.assetgroupid), getAdExperience());
    }

    public Boolean isTopicsAPIEnabled() {
        return (Boolean) getRemoteConfig(RemoteConfig.TOPICS_API_ENABLED);
    }

    public Boolean needCloseInterAfterFinish() {
        return (Boolean) getRemoteConfig(RemoteConfig.CLOSE_INTER_AFTER_FINISH);
    }

    public Boolean needCloseRewardAfterFinish() {
        return (Boolean) getRemoteConfig(RemoteConfig.CLOSE_REWARD_AFTER_FINISH);
    }

    public void setAdSourceName(String str) {
        this.adSourceName = str;
    }

    public void setHasEndCard(boolean z) {
        this.hasEndCard = z;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad) {
        return (ad.getECPM() != null ? ad.getECPM().intValue() : 0) - (getECPM() != null ? getECPM().intValue() : 0);
    }

    public FrameLayout getContentInfoContainer(Context context, ContentInfo contentInfo, PNAPIContentInfoView.ContentInfoListener contentInfoListener) {
        int i;
        String str;
        int i2;
        String str2;
        View customContentInfo = getCustomContentInfo(context, contentInfo, contentInfoListener);
        if (customContentInfo == null) {
            customContentInfo = getContentInfo(context, contentInfoListener);
        }
        if (customContentInfo == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (getContentInfoIconXPosition() == null || getContentInfoIconXPosition() != ContentInfoIconXPosition.RIGHT) {
            i = 8388611;
            str = "left";
        } else {
            i = 8388613;
            str = "right";
        }
        if (getContentInfoIconYPosition() == null || getContentInfoIconYPosition() != ContentInfoIconYPosition.BOTTOM) {
            i2 = 48;
            str2 = ViewHierarchyConstants.DIMENSION_TOP_KEY;
        } else {
            i2 = 80;
            str2 = "bottom";
        }
        layoutParams.gravity = i | i2;
        frameLayout.setContentDescription(context.getResources().getString(R.string.content_info_icon) + " - " + str2 + " " + str);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(customContentInfo);
        return frameLayout;
    }

    public Ad(JSONObject jSONObject) {
        this.hasEndCard = false;
        fromJson(jSONObject);
    }

    public Ad(int i, String str, AdType adType) {
        AdData adData;
        this.hasEndCard = false;
        this.assetgroupid = i;
        this.assets = new ArrayList();
        if (adType == AdType.VIDEO) {
            adData = new AdData("vast2", "vast2", str);
        } else {
            adData = new AdData("html", "htmlbanner", str);
        }
        this.assets.add(adData);
    }
}
