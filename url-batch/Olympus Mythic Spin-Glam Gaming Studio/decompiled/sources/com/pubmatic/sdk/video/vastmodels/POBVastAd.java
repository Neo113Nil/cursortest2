package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes10.dex */
public class POBVastAd implements POBXMLNodeListener {
    private POBVastAdType a = POBVastAdType.NO_ADS;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private List i;
    private String j;
    private List k;
    private List l;
    private List m;
    private List n;
    private POBVastCreative o;
    private List p;
    private POBVastAd q;
    private List r;

    public enum POBVastAdParameter {
        IMPRESSIONS("impression"),
        ERRORS("errors"),
        VIEWABLE_IMPRESSIONS("viewable_impressions"),
        NOT_VIEWABLE_IMPRESSIONS("non_viewable_impressions"),
        VIEW_UNDETERMINED_IMPRESSIONS("view_undermined_impressions"),
        CLICKTRACKING("clickTracking"),
        PROGRESS_TRACKING_EVENT("progress"),
        COMPANIONS("companions"),
        CLICK_THROUGH("clickThrough"),
        ICON("icon");

        private final String a;

        POBVastAdParameter(String str) {
            this.a = str;
        }

        @NonNull
        public String getValue() {
            return this.a;
        }
    }

    public enum POBVastAdType {
        INLINE,
        WRAPPER,
        NO_ADS
    }

    class a implements g {
        final /* synthetic */ POBVastCreative.POBEventTypes a;

        a(POBVastCreative.POBEventTypes pOBEventTypes) {
            this.a = pOBEventTypes;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getCreative() != null) {
                return pOBVastAd.getCreative().getTrackingEventUrls(this.a);
            }
            return null;
        }
    }

    class b implements g {
        final /* synthetic */ POBVastAdParameter a;

        b(POBVastAdParameter pOBVastAdParameter) {
            this.a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            return pOBVastAd.a(pOBVastAd, this.a);
        }
    }

    class c implements g {
        c() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            return pOBVastAd.getCompanions();
        }
    }

    class d implements g {
        final /* synthetic */ POBVastAdParameter a;

        d(POBVastAdParameter pOBVastAdParameter) {
            this.a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            List b = pOBVastAd.b(pOBVastAd, this.a);
            if (b != null) {
                return new ArrayList(b);
            }
            return null;
        }
    }

    class e implements g {
        e() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getAdVerification() != null) {
                return new ArrayList(pOBVastAd.getAdVerification());
            }
            return null;
        }
    }

    static /* synthetic */ class f {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBVastAdParameter.values().length];
            a = iArr;
            try {
                iArr[POBVastAdParameter.CLICK_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBVastAdParameter.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBVastAdParameter.IMPRESSIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBVastAdParameter.ERRORS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBVastAdParameter.VIEWABLE_IMPRESSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[POBVastAdParameter.NOT_VIEWABLE_IMPRESSIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[POBVastAdParameter.VIEW_UNDETERMINED_IMPRESSIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[POBVastAdParameter.CLICKTRACKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[POBVastAdParameter.PROGRESS_TRACKING_EVENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[POBVastAdParameter.COMPANIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private interface g {
        List a(POBVastAd pOBVastAd);
    }

    private Object c(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        List<POBIcon> iconList;
        POBVastCreative creative = pOBVastAd.getCreative();
        int i = f.a[pOBVastAdParameter.ordinal()];
        if (i != 1) {
            if (i == 2 && creative != null && creative.getVastCreativeType() == POBVastCreative.CreativeType.LINEAR && (iconList = ((POBLinear) creative).getIconList()) != null && iconList.size() > 0) {
                return iconList.get(0);
            }
        } else if (creative != null) {
            return creative.getClickThroughURL();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        String nodeValue;
        POBVastAdType a2 = a(pOBNodeBuilder);
        if (a2 != null) {
            this.a = a2;
        }
        try {
            Node node = pOBNodeBuilder.getNode("/VAST/Ad");
            if (node != null && (nodeValue = node.getAttributes().getNamedItem("sequence").getNodeValue()) != null) {
                this.h = Integer.parseInt(nodeValue);
            }
        } catch (Exception unused) {
            POBLog.error("POBVastAd", POBVideoLogConstants.MSG_AD_SEQUENCE_NOT_FOUND, new Object[0]);
        }
        if (this.h < 1) {
            this.h = -1;
        }
        this.b = pOBNodeBuilder.getNodeValue("AdSystem");
        this.c = pOBNodeBuilder.getNodeValue(k.i);
        this.d = pOBNodeBuilder.getNodeValue("AdServingId");
        this.e = pOBNodeBuilder.getNodeValue(k.j);
        this.f = pOBNodeBuilder.getNodeValue(k.l);
        this.g = POBUtils.getIntegerValue(pOBNodeBuilder.getNodeValue("Expires"));
        this.i = pOBNodeBuilder.getStringList("Error");
        this.j = pOBNodeBuilder.getNodeValue("VASTAdTagURI");
        this.k = pOBNodeBuilder.getStringList("Impression");
        this.l = pOBNodeBuilder.getStringList("ViewableImpression/Viewable");
        this.m = pOBNodeBuilder.getStringList("ViewableImpression/NotViewable");
        this.n = pOBNodeBuilder.getStringList("ViewableImpression/ViewUndetermined");
        POBVastCreative pOBVastCreative = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/Linear", POBLinear.class);
        this.o = pOBVastCreative;
        if (pOBVastCreative == null) {
            this.o = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/NonLinearAds/NonLinear", POBNonLinear.class);
        }
        if (this.o != null) {
            this.o.setCreativeExtensions(pOBNodeBuilder.getObjectList("Creatives/Creative/CreativeExtensions/CreativeExtension", POBVastCreativeExtension.class));
        }
        this.p = pOBNodeBuilder.getObjectList("Creatives/Creative/CompanionAds/Companion", POBCompanion.class);
        List objectList = pOBNodeBuilder.getObjectList("AdVerifications/Verification", POBAdVerification.class);
        this.r = objectList;
        if (objectList == null || objectList.isEmpty()) {
            this.r = pOBNodeBuilder.getObjectList("Extensions/Extension/AdVerifications/Verification", POBAdVerification.class);
        }
    }

    public int getAdSequence() {
        return this.h;
    }

    @Nullable
    public String getAdServingId() {
        return this.d;
    }

    @Nullable
    public String getAdSystem() {
        return this.b;
    }

    @Nullable
    public String getAdTitle() {
        return this.c;
    }

    @Nullable
    public POBVastAdType getAdType() {
        return this.a;
    }

    @Nullable
    public List<POBAdVerification> getAdVerification() {
        return this.r;
    }

    @Nullable
    public String getClosestClickThroughURL() {
        return (String) a(POBVastAdParameter.CLICK_THROUGH);
    }

    @Nullable
    public POBIcon getClosestIcon() {
        return (POBIcon) a(POBVastAdParameter.ICON);
    }

    @Nullable
    public List<POBCompanion> getCombinedCompanions() {
        return a(this, new c());
    }

    @NonNull
    public List<String> getCombinedList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return a(this, new b(pOBVastAdParameter));
    }

    public List<POBXMLNodeListener> getCombinedObjectList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return a(this, new d(pOBVastAdParameter));
    }

    @NonNull
    public List<String> getCombinedTrackingEventList(@NonNull POBVastCreative.POBEventTypes pOBEventTypes) {
        return a(this, new a(pOBEventTypes));
    }

    public List<POBVerificationScriptResource> getCombinedVerificationList() {
        return a(this, new e());
    }

    @Nullable
    public List<POBCompanion> getCompanions() {
        return this.p;
    }

    @Nullable
    public POBVastCreative getCreative() {
        return this.o;
    }

    @Nullable
    public String getDescription() {
        return this.e;
    }

    @Nullable
    public List<String> getErrorURLs() {
        return this.i;
    }

    public int getExpires() {
        return this.g;
    }

    @Nullable
    public List<String> getImpressions() {
        return this.k;
    }

    @Nullable
    public List<String> getNotViewableImpressions() {
        return this.m;
    }

    @Nullable
    public String getPricing() {
        return this.f;
    }

    @Nullable
    public String getVASTAdTagURI() {
        return this.j;
    }

    @Nullable
    public List<String> getViewUndeterminedImpressions() {
        return this.n;
    }

    @Nullable
    public List<String> getViewableImpressions() {
        return this.l;
    }

    @Nullable
    public POBVastAd getWrapper() {
        return this.q;
    }

    public void setWrapper(@Nullable POBVastAd pOBVastAd) {
        this.q = pOBVastAd;
    }

    private Object a(POBVastAdParameter pOBVastAdParameter) {
        for (POBVastAd pOBVastAd = this; pOBVastAd != null; pOBVastAd = pOBVastAd.getWrapper()) {
            Object c2 = c(pOBVastAd, pOBVastAdParameter);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List b(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        int i = f.a[pOBVastAdParameter.ordinal()];
        if (i != 9) {
            if (i != 10) {
                return null;
            }
            return pOBVastAd.getCompanions();
        }
        if (pOBVastAd.getCreative() != null) {
            return pOBVastAd.getCreative().getTrackingEvents(POBVastCreative.POBEventTypes.PROGRESS);
        }
        return null;
    }

    private POBVastAdType a(POBNodeBuilder pOBNodeBuilder) {
        if (pOBNodeBuilder.getNodeName() == null) {
            return null;
        }
        if (pOBNodeBuilder.getNodeName().equals("InLine")) {
            return POBVastAdType.INLINE;
        }
        if (pOBNodeBuilder.getNodeName().equals("Wrapper")) {
            return POBVastAdType.WRAPPER;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        switch (f.a[pOBVastAdParameter.ordinal()]) {
            case 3:
                return pOBVastAd.getImpressions();
            case 4:
                return pOBVastAd.getErrorURLs();
            case 5:
                return pOBVastAd.getViewableImpressions();
            case 6:
                return pOBVastAd.getNotViewableImpressions();
            case 7:
                return pOBVastAd.getViewUndeterminedImpressions();
            case 8:
                ArrayList arrayList = new ArrayList();
                POBVastCreative creative = pOBVastAd.getCreative();
                if (creative != null && creative.getClickTrackers() != null) {
                    arrayList.addAll(creative.getClickTrackers());
                }
                return arrayList;
            default:
                return null;
        }
    }

    private List a(POBVastAd pOBVastAd, g gVar) {
        ArrayList arrayList = new ArrayList();
        while (pOBVastAd != null) {
            List a2 = gVar.a(pOBVastAd);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
            pOBVastAd = pOBVastAd.getWrapper();
        }
        return arrayList;
    }
}
