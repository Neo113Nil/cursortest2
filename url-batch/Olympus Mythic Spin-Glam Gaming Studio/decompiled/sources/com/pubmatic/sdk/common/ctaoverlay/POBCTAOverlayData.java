package com.pubmatic.sdk.common.ctaoverlay;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.utility.POBUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J¢\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u001aR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010#¨\u0006I"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "", "", POBCTAOverlayData.KEY_CTA_DELAY, "endcardDelay", "isDismissible", X3.i.L, "", "ctaText", "ctaButtonBgColor", "ctaTextColor", "iconImageUrl", POBCTAOverlayData.KEY_CTA_HEADER, "title", "description", UnifiedMediationParams.KEY_CLICK_URL, "", "clickTrackers", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "copy", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDelay", "b", "getEndcardDelay", "c", "d", "getPosition", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getCtaText", InneractiveMediationDefs.GENDER_FEMALE, "getCtaButtonBgColor", "g", "getCtaTextColor", "h", "getIconImageUrl", "i", "getHeader", j.b, "getTitle", CampaignEx.JSON_KEY_AD_K, "getDescription", "l", "getClickUrl", "m", "Ljava/util/List;", "getClickTrackers", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class POBCTAOverlayData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_CTA_BUTTON_BG_COLOR = "#ffa41d";

    @NotNull
    public static final String DEFAULT_CTA_TEXT = "Get";

    @NotNull
    public static final String DEFAULT_CTA_TEXT_COLOR = "#000000";
    public static final int DEFAULT_DELAY = 0;
    public static final int DEFAULT_ENDCARD_DELAY = 0;

    @NotNull
    public static final String DEFAULT_HEADER = "Play Store";
    public static final int DEFAULT_IS_DISMISSIBLE = 1;
    public static final int DEFAULT_POSITION = 0;

    @NotNull
    public static final String KEY_CTA_BUTTON_BG_COLOR = "ctabuttonbgcolor";

    @NotNull
    public static final String KEY_CTA_CLICKTRACKERS = "clicktrackers";

    @NotNull
    public static final String KEY_CTA_CLICKURL = "clickurl";

    @NotNull
    public static final String KEY_CTA_DELAY = "delay";

    @NotNull
    public static final String KEY_CTA_DESCRIPTION = "description";

    @NotNull
    public static final String KEY_CTA_DISMISSIBLE = "dismissible";

    @NotNull
    public static final String KEY_CTA_ENDCARD_DELAY = "endcarddelay";

    @NotNull
    public static final String KEY_CTA_HEADER = "header";

    @NotNull
    public static final String KEY_CTA_ICON_IMAGE_URL = "iconimageurl";

    @NotNull
    public static final String KEY_CTA_POS = "pos";

    @NotNull
    public static final String KEY_CTA_TEXT = "ctacopy";

    @NotNull
    public static final String KEY_CTA_TEXT_COLOR = "ctacopycolor";

    @NotNull
    public static final String KEY_CTA_TITLE = "title";
    public static final int NON_DISMISSIBLE = 0;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final int delay;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final int endcardDelay;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final int isDismissible;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final int position;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    private final String ctaText;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    private final String ctaButtonBgColor;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    private final String ctaTextColor;

    /* renamed from: h, reason: from kotlin metadata and from toString */
    private final String iconImageUrl;

    /* renamed from: i, reason: from kotlin metadata and from toString */
    private final String header;

    /* renamed from: j, reason: from kotlin metadata and from toString */
    private final String title;

    /* renamed from: k, reason: from kotlin metadata and from toString */
    private final String description;

    /* renamed from: l, reason: from kotlin metadata and from toString */
    private final String clickUrl;

    /* renamed from: m, reason: from kotlin metadata and from toString */
    private final List clickTrackers;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0016\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData$Companion;", "", "()V", "DEFAULT_CTA_BUTTON_BG_COLOR", "", "DEFAULT_CTA_TEXT", "DEFAULT_CTA_TEXT_COLOR", "DEFAULT_DELAY", "", "DEFAULT_ENDCARD_DELAY", "DEFAULT_HEADER", "DEFAULT_IS_DISMISSIBLE", "DEFAULT_POSITION", "KEY_CTA_BUTTON_BG_COLOR", "KEY_CTA_CLICKTRACKERS", "KEY_CTA_CLICKURL", "KEY_CTA_DELAY", "KEY_CTA_DESCRIPTION", "KEY_CTA_DISMISSIBLE", "KEY_CTA_ENDCARD_DELAY", "KEY_CTA_HEADER", "KEY_CTA_ICON_IMAGE_URL", "KEY_CTA_POS", "KEY_CTA_TEXT", "KEY_CTA_TEXT_COLOR", "KEY_CTA_TITLE", "NON_DISMISSIBLE", "parse", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "ctaOverlayJsonObject", "Lorg/json/JSONObject;", "copyClickUrl", UnifiedMediationParams.KEY_CLICK_URL, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBCTAOverlayData copyClickUrl(@NotNull POBCTAOverlayData pOBCTAOverlayData, @Nullable String str) {
            Intrinsics.checkNotNullParameter(pOBCTAOverlayData, "<this>");
            return new POBCTAOverlayData(pOBCTAOverlayData.getDelay(), pOBCTAOverlayData.getEndcardDelay(), pOBCTAOverlayData.isDismissible(), pOBCTAOverlayData.getPosition(), pOBCTAOverlayData.getCtaText(), pOBCTAOverlayData.getCtaButtonBgColor(), pOBCTAOverlayData.getCtaTextColor(), pOBCTAOverlayData.getIconImageUrl(), pOBCTAOverlayData.getHeader(), pOBCTAOverlayData.getTitle(), pOBCTAOverlayData.getDescription(), str, null, 4096, null);
        }

        @NotNull
        public final POBCTAOverlayData parse(@NotNull JSONObject ctaOverlayJsonObject) {
            Intrinsics.checkNotNullParameter(ctaOverlayJsonObject, "ctaOverlayJsonObject");
            int optInt = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_DELAY, 0);
            int optInt2 = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_ENDCARD_DELAY, 0);
            int optInt3 = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_DISMISSIBLE, 1);
            int optInt4 = ctaOverlayJsonObject.optInt("pos", 0);
            String ctaText = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_TEXT, POBCTAOverlayData.DEFAULT_CTA_TEXT);
            String optString = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_BUTTON_BG_COLOR);
            if (optString.length() == 0) {
                optString = POBCTAOverlayData.DEFAULT_CTA_BUTTON_BG_COLOR;
            }
            String ctaButtonBgColor = optString;
            String optString2 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_TEXT_COLOR);
            if (optString2.length() == 0) {
                optString2 = POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR;
            }
            String ctaTextColor = optString2;
            String optString3 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_ICON_IMAGE_URL);
            if (StringsKt.isBlank(optString3)) {
                optString3 = null;
            }
            String str = optString3;
            String optString4 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_HEADER);
            if (optString4.length() == 0) {
                optString4 = POBCTAOverlayData.DEFAULT_HEADER;
            }
            String header = optString4;
            String optString5 = ctaOverlayJsonObject.optString("title");
            String optString6 = ctaOverlayJsonObject.optString("description");
            String optString7 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_CLICKURL);
            List<String> convertStringJsonArrayToList = POBUtils.convertStringJsonArrayToList(ctaOverlayJsonObject.optJSONArray("clicktrackers"));
            Intrinsics.checkNotNullExpressionValue(ctaText, "ctaText");
            Intrinsics.checkNotNullExpressionValue(ctaButtonBgColor, "ctaButtonBgColor");
            Intrinsics.checkNotNullExpressionValue(ctaTextColor, "ctaTextColor");
            Intrinsics.checkNotNullExpressionValue(header, "header");
            return new POBCTAOverlayData(optInt, optInt2, optInt3, optInt4, ctaText, ctaButtonBgColor, ctaTextColor, str, header, optString5, optString6, optString7, convertStringJsonArrayToList);
        }

        private Companion() {
        }
    }

    public POBCTAOverlayData() {
        this(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @NotNull
    public static final POBCTAOverlayData copyClickUrl(@NotNull POBCTAOverlayData pOBCTAOverlayData, @Nullable String str) {
        return INSTANCE.copyClickUrl(pOBCTAOverlayData, str);
    }

    @NotNull
    public static final POBCTAOverlayData parse(@NotNull JSONObject jSONObject) {
        return INSTANCE.parse(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    public final List<String> component13() {
        return this.clickTrackers;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndcardDelay() {
        return this.endcardDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsDismissible() {
        return this.isDismissible;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCtaButtonBgColor() {
        return this.ctaButtonBgColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final POBCTAOverlayData copy(int delay, int endcardDelay, int isDismissible, int position, @NotNull String ctaText, @NotNull String ctaButtonBgColor, @NotNull String ctaTextColor, @Nullable String iconImageUrl, @NotNull String header, @Nullable String title, @Nullable String description, @Nullable String clickUrl, @Nullable List<String> clickTrackers) {
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaButtonBgColor, "ctaButtonBgColor");
        Intrinsics.checkNotNullParameter(ctaTextColor, "ctaTextColor");
        Intrinsics.checkNotNullParameter(header, "header");
        return new POBCTAOverlayData(delay, endcardDelay, isDismissible, position, ctaText, ctaButtonBgColor, ctaTextColor, iconImageUrl, header, title, description, clickUrl, clickTrackers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POBCTAOverlayData)) {
            return false;
        }
        POBCTAOverlayData pOBCTAOverlayData = (POBCTAOverlayData) other;
        return this.delay == pOBCTAOverlayData.delay && this.endcardDelay == pOBCTAOverlayData.endcardDelay && this.isDismissible == pOBCTAOverlayData.isDismissible && this.position == pOBCTAOverlayData.position && Intrinsics.areEqual(this.ctaText, pOBCTAOverlayData.ctaText) && Intrinsics.areEqual(this.ctaButtonBgColor, pOBCTAOverlayData.ctaButtonBgColor) && Intrinsics.areEqual(this.ctaTextColor, pOBCTAOverlayData.ctaTextColor) && Intrinsics.areEqual(this.iconImageUrl, pOBCTAOverlayData.iconImageUrl) && Intrinsics.areEqual(this.header, pOBCTAOverlayData.header) && Intrinsics.areEqual(this.title, pOBCTAOverlayData.title) && Intrinsics.areEqual(this.description, pOBCTAOverlayData.description) && Intrinsics.areEqual(this.clickUrl, pOBCTAOverlayData.clickUrl) && Intrinsics.areEqual(this.clickTrackers, pOBCTAOverlayData.clickTrackers);
    }

    @Nullable
    public final List<String> getClickTrackers() {
        return this.clickTrackers;
    }

    @Nullable
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @NotNull
    public final String getCtaButtonBgColor() {
        return this.ctaButtonBgColor;
    }

    @NotNull
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    public final int getDelay() {
        return this.delay;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getEndcardDelay() {
        return this.endcardDelay;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.delay) * 31) + Integer.hashCode(this.endcardDelay)) * 31) + Integer.hashCode(this.isDismissible)) * 31) + Integer.hashCode(this.position)) * 31) + this.ctaText.hashCode()) * 31) + this.ctaButtonBgColor.hashCode()) * 31) + this.ctaTextColor.hashCode()) * 31;
        String str = this.iconImageUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.header.hashCode()) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.clickTrackers;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final int isDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public String toString() {
        return "POBCTAOverlayData(delay=" + this.delay + ", endcardDelay=" + this.endcardDelay + ", isDismissible=" + this.isDismissible + ", position=" + this.position + ", ctaText=" + this.ctaText + ", ctaButtonBgColor=" + this.ctaButtonBgColor + ", ctaTextColor=" + this.ctaTextColor + ", iconImageUrl=" + this.iconImageUrl + ", header=" + this.header + ", title=" + this.title + ", description=" + this.description + ", clickUrl=" + this.clickUrl + ", clickTrackers=" + this.clickTrackers + ')';
    }

    public POBCTAOverlayData(int i, int i2, int i3, int i4, @NotNull String ctaText, @NotNull String ctaButtonBgColor, @NotNull String ctaTextColor, @Nullable String str, @NotNull String header, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaButtonBgColor, "ctaButtonBgColor");
        Intrinsics.checkNotNullParameter(ctaTextColor, "ctaTextColor");
        Intrinsics.checkNotNullParameter(header, "header");
        this.delay = i;
        this.endcardDelay = i2;
        this.isDismissible = i3;
        this.position = i4;
        this.ctaText = ctaText;
        this.ctaButtonBgColor = ctaButtonBgColor;
        this.ctaTextColor = ctaTextColor;
        this.iconImageUrl = str;
        this.header = header;
        this.title = str2;
        this.description = str3;
        this.clickUrl = str4;
        this.clickTrackers = list;
    }

    public /* synthetic */ POBCTAOverlayData(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? DEFAULT_CTA_TEXT : str, (i5 & 32) != 0 ? DEFAULT_CTA_BUTTON_BG_COLOR : str2, (i5 & 64) != 0 ? DEFAULT_CTA_TEXT_COLOR : str3, (i5 & 128) != 0 ? null : str4, (i5 & 256) != 0 ? DEFAULT_HEADER : str5, (i5 & 512) != 0 ? null : str6, (i5 & 1024) != 0 ? null : str7, (i5 & 2048) != 0 ? null : str8, (i5 & 4096) == 0 ? list : null);
    }
}
