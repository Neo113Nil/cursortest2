package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVideoConstant;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class POBCompanion extends POBVastCreative implements POBAdDescriptor {
    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private List f;
    private String g;
    private List h;
    private POBResource i;
    private String j;
    private String k;
    private JSONArray l;

    private String a() {
        POBResource pOBResource = this.i;
        if (pOBResource == null) {
            return null;
        }
        if (pOBResource.getResourceType() == POBResource.a.HTML) {
            return this.i.getResource();
        }
        if (this.i.getResourceType() != POBResource.a.STATIC) {
            return String.format(POBVideoConstant.IFRAME_HTML, this.i.getResource());
        }
        return String.format(POBVideoConstant.ANCHOR_TAG, POBUtils.isNullOrEmpty(this.g) ? POBCommonConstants.PLACEHOLDER_CLICK_THROUGH : this.g, String.format(POBVideoConstant.COMPANION_STATIC_HTML, this.i.getResource()));
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.a = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(VastAttributes.ASSET_WIDTH));
        this.d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(VastAttributes.ASSET_HEIGHT));
        this.e = pOBNodeBuilder.getAttributeValue(VastAttributes.API_FRAMEWORK);
        this.f = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.g = pOBNodeBuilder.getNodeValue("CompanionClickThrough");
        this.h = pOBNodeBuilder.getStringList("CompanionClickTracking");
        this.k = pOBNodeBuilder.getAttributeValue("renderingMode");
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject("HTMLResource", POBResource.class);
        this.i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject("StaticResource", POBResource.class);
            this.i = pOBResource2;
            if (pOBResource2 == null) {
                this.i = (POBResource) pOBNodeBuilder.getNodeObject("IFrameResource", POBResource.class);
            }
        }
        this.j = pOBNodeBuilder.getNodeValue("../../UniversalAdId");
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i, int i2) {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        return false;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONArray getAdomains() {
        return this.l;
    }

    @Nullable
    public String getApiFramework() {
        return this.e;
    }

    public int getAssetHeight() {
        return this.d;
    }

    public int getAssetWidth() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBCTAOverlayData getCTAOverlayData() {
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public String getClickThroughURL() {
        return this.g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.h;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return POBVastCreative.CreativeType.COMPANION.name();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getExtension() {
        return null;
    }

    public int getHeight() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return POBImpressionCountingMethod.ON_LOAD;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return a();
    }

    @Nullable
    public String getRenderingMode() {
        return this.k;
    }

    @Nullable
    public POBResource getResource() {
        return this.i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.j;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.COMPANION;
    }

    public int getWidth() {
        return this.a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return true;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }

    public void setAdomains(@NonNull JSONArray jSONArray) {
        this.l = jSONArray;
    }

    public void setRenderingMode(@Nullable String str) {
        this.k = str;
    }

    @NonNull
    public String toString() {
        return "POBCompanion{width=" + this.a + ", height=" + this.b + ", renderingMode='" + this.k + "'}";
    }
}
