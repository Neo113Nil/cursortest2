package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVideoConstant;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class POBIcon implements POBXMLNodeListener, POBAdDescriptor {
    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private int f;
    private int g;
    private String h;
    private POBResource i;

    @Nullable
    protected String mClickThroughURL;

    @Nullable
    protected List<String> mClickTrackers;

    @Nullable
    protected List<String> mViewTrackers;

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
        return String.format(POBVideoConstant.ANCHOR_TAG, POBUtils.isNullOrEmpty(this.mClickThroughURL) ? POBCommonConstants.PLACEHOLDER_CLICK_THROUGH : this.mClickThroughURL, String.format(POBVideoConstant.STATIC_HTML, this.i.getResource()));
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.a = pOBNodeBuilder.getAttributeValue("program");
        this.b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.d = pOBNodeBuilder.getAttributeValue("xPosition");
        this.e = pOBNodeBuilder.getAttributeValue("yPosition");
        String attributeValue = pOBNodeBuilder.getAttributeValue(IronSourceConstants.EVENTS_DURATION);
        if (attributeValue != null) {
            this.f = (int) POBUtils.getSeconds(attributeValue);
        }
        String attributeValue2 = pOBNodeBuilder.getAttributeValue("offset");
        if (attributeValue2 != null) {
            this.g = (int) POBUtils.getSeconds(attributeValue2);
        }
        this.h = pOBNodeBuilder.getAttributeValue(VastAttributes.API_FRAMEWORK);
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("IconClicks/IconClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("IconClicks/IconClickTracking");
        this.mViewTrackers = pOBNodeBuilder.getStringList(k.J);
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject("StaticResource", POBResource.class);
        this.i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject("HTMLResource", POBResource.class);
            this.i = pOBResource2;
            if (pOBResource2 == null) {
                this.i = (POBResource) pOBNodeBuilder.getNodeObject("IFrameResource", POBResource.class);
            }
        }
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
        return null;
    }

    @Nullable
    public String getApiFramework() {
        return this.h;
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

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    public int getDuration() {
        return this.f;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getExtension() {
        return null;
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

    public int getOffset() {
        return this.g;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
    }

    @Nullable
    public String getProgram() {
        return this.a;
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

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public List<String> getViewTrackers() {
        return this.mViewTrackers;
    }

    @Nullable
    public String getXPosition() {
        return this.d;
    }

    @Nullable
    public String getYPosition() {
        return this.e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }
}
