package net.pubnative.lite.sdk.vpaid.response;

import android.content.Context;
import android.text.TextUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseVerificationScriptResource;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.helpers.ErrorLog;
import net.pubnative.lite.sdk.vpaid.models.vast.Ad;
import net.pubnative.lite.sdk.vpaid.models.vast.AdVerifications;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.CreativeExtension;
import net.pubnative.lite.sdk.vpaid.models.vast.Error;
import net.pubnative.lite.sdk.vpaid.models.vast.Extension;
import net.pubnative.lite.sdk.vpaid.models.vast.HTMLResource;
import net.pubnative.lite.sdk.vpaid.models.vast.IFrameResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.models.vast.Impression;
import net.pubnative.lite.sdk.vpaid.models.vast.JavaScriptResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Linear;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.Verification;
import net.pubnative.lite.sdk.vpaid.models.vast.VerveCTAButton;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import net.pubnative.lite.sdk.vpaid.xml.XmlParser;

/* loaded from: classes13.dex */
public class VastProcessor {
    private static final String EXTENSION_TYPE_AD_VERIFICATION = "AdVerifications";
    private static final String LOG_TAG = "VastProcessor";
    private static final int UNWRAP_DEPTH = 5;
    private final Context mContext;
    private final AdSpotDimensions mParseParams;
    private final AdParams adParams = new AdParams();
    private int unwrapAttempt = 0;

    public interface Listener {
        void onParseError(PlayerInfo playerInfo);

        void onParseSuccess(AdParams adParams, String str);
    }

    public VastProcessor(Context context, AdSpotDimensions adSpotDimensions) {
        this.mContext = context;
        this.mParseParams = adSpotDimensions;
    }

    private Comparator<Companion> createCompanionComparator(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: net.pubnative.lite.sdk.vpaid.response.VastProcessor$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$createCompanionComparator$1;
                lambda$createCompanionComparator$1 = VastProcessor.lambda$createCompanionComparator$1(AdSpotDimensions.this, (Companion) obj, (Companion) obj2);
                return lambda$createCompanionComparator$1;
            }
        };
    }

    private Comparator<MediaFile> createComparator(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: net.pubnative.lite.sdk.vpaid.response.VastProcessor$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$createComparator$0;
                lambda$createComparator$0 = VastProcessor.lambda$createComparator$0(AdSpotDimensions.this, (MediaFile) obj, (MediaFile) obj2);
                return lambda$createComparator$0;
            }
        };
    }

    private void fillAdParams(Context context, VastAdSource vastAdSource, AdParams adParams, AdSpotDimensions adSpotDimensions, String str) {
        Linear linear;
        AdVerifications adVerifications;
        if (vastAdSource.getErrors() != null && !vastAdSource.getErrors().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Error error : vastAdSource.getErrors()) {
                if (!TextUtils.isEmpty(error.getText())) {
                    arrayList.add(error.getText().trim());
                }
            }
            ErrorLog.initErrorLog(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (vastAdSource.getImpressions() != null) {
            for (Impression impression : vastAdSource.getImpressions()) {
                if (!TextUtils.isEmpty(impression.getText())) {
                    arrayList2.add(impression.getText());
                }
            }
        }
        adParams.setImpressions(arrayList2);
        if (vastAdSource.getCategories() != null) {
            adParams.addAdCategories(vastAdSource.getCategories());
        }
        if (vastAdSource.getAdServingId() != null && !TextUtils.isEmpty(vastAdSource.getAdServingId().getText())) {
            adParams.addAdServingId(vastAdSource.getAdServingId());
        }
        ArrayList arrayList3 = new ArrayList();
        if (vastAdSource.getExtensions() != null && vastAdSource.getExtensions().getExtensions() != null) {
            for (Extension extension : vastAdSource.getExtensions().getExtensions()) {
                if (!TextUtils.isEmpty(extension.getType()) && extension.getType().equals("AdVerifications") && (adVerifications = extension.getAdVerifications()) != null && adVerifications.getVerificationList() != null) {
                    for (Verification verification : adVerifications.getVerificationList()) {
                        try {
                            if (verification.getJavaScriptResources() != null) {
                                for (JavaScriptResource javaScriptResource : verification.getJavaScriptResources()) {
                                    if (!TextUtils.isEmpty(javaScriptResource.getText())) {
                                        URL url = new URL(javaScriptResource.getText().trim());
                                        if (!TextUtils.isEmpty(verification.getVendor()) && verification.getVerificationParameters() != null && !TextUtils.isEmpty(verification.getVerificationParameters().getText())) {
                                            arrayList3.add(BaseVerificationScriptResource.createVerificationScriptResourceWithParameters(verification.getVendor(), url, verification.getVerificationParameters().getText()));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Logger.e(LOG_TAG, e.getMessage());
                        }
                    }
                }
            }
        }
        AdVerifications adVerifications2 = vastAdSource.getAdVerifications();
        if (adVerifications2 != null && adVerifications2.getVerificationList() != null) {
            for (Verification verification2 : adVerifications2.getVerificationList()) {
                try {
                    if (verification2.getJavaScriptResources() != null) {
                        for (JavaScriptResource javaScriptResource2 : verification2.getJavaScriptResources()) {
                            if (!TextUtils.isEmpty(javaScriptResource2.getText())) {
                                URL url2 = new URL(javaScriptResource2.getText().trim());
                                if (!TextUtils.isEmpty(verification2.getVendor()) && verification2.getVerificationParameters() != null && !TextUtils.isEmpty(verification2.getVerificationParameters().getText())) {
                                    arrayList3.add(BaseVerificationScriptResource.createVerificationScriptResourceWithParameters(verification2.getVendor(), url2, verification2.getVerificationParameters().getText()));
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    Logger.e(LOG_TAG, e2.getMessage());
                }
            }
        }
        adParams.addVerificationScriptResources(arrayList3);
        if (vastAdSource.getCreatives() == null || vastAdSource.getCreatives().getCreatives() == null) {
            return;
        }
        List<Creative> creatives = vastAdSource.getCreatives().getCreatives();
        Iterator<Creative> it = creatives.iterator();
        while (true) {
            if (!it.hasNext()) {
                linear = null;
                break;
            }
            Creative next = it.next();
            if (next.getLinear() != null) {
                linear = next.getLinear();
                break;
            }
        }
        try {
            List<Companion> sortedCompanions = getSortedCompanions(creatives, adSpotDimensions);
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < sortedCompanions.size() && arrayList4.isEmpty(); i++) {
                Companion companion = sortedCompanions.get(i);
                if (companion.getHtmlResources() != null && !companion.getHtmlResources().isEmpty()) {
                    for (HTMLResource hTMLResource : companion.getHtmlResources()) {
                        if (!TextUtils.isEmpty(hTMLResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.HTML_RESOURCE, hTMLResource.getText().trim()));
                        }
                    }
                }
                if (companion.getiFrameResources() != null && !companion.getiFrameResources().isEmpty()) {
                    for (IFrameResource iFrameResource : companion.getiFrameResources()) {
                        if (!TextUtils.isEmpty(iFrameResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.IFRAME_RESOURCE, iFrameResource.getText().trim()));
                        }
                    }
                }
                if (companion.getStaticResources() != null && !companion.getStaticResources().isEmpty()) {
                    for (StaticResource staticResource : companion.getStaticResources()) {
                        if (!TextUtils.isEmpty(staticResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.STATIC_RESOURCE, staticResource.getText().trim()));
                        }
                    }
                }
            }
            adParams.setEndCardList(arrayList4);
            if (!sortedCompanions.isEmpty()) {
                Companion companion2 = sortedCompanions.get(0);
                CompanionClickThrough companionClickThrough = companion2.getCompanionClickThrough();
                if (companionClickThrough != null && !TextUtils.isEmpty(companionClickThrough.getText())) {
                    adParams.setEndCardRedirectUrl(companionClickThrough.getText().trim());
                }
                if (companion2.getCompanionClickTrackingList() != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<CompanionClickTracking> it2 = companion2.getCompanionClickTrackingList().iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(it2.next().getText());
                    }
                    adParams.setEndCardClicks(arrayList5);
                }
                if (companion2.getTrackingEvents() != null && companion2.getTrackingEvents().getTrackingList() != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<Tracking> it3 = companion2.getTrackingEvents().getTrackingList().iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(it3.next().getText());
                    }
                    adParams.setCompanionCreativeViewEvents(arrayList6);
                }
            }
        } catch (Exception e3) {
            Logger.e(LOG_TAG, e3.getMessage());
        }
        if (linear != null) {
            if (!TextUtils.isEmpty(linear.getSkipOffset())) {
                adParams.setSkipTime(linear.getSkipOffset());
            }
            if (linear.getTrackingEvents() != null) {
                adParams.addEvents(linear.getTrackingEvents().getTrackingList());
            }
            adParams.setDuration(Utils.parseDuration(linear.getDuration() != null ? linear.getDuration().getText() : "00:00:10"));
            if (linear.getAdParameters() != null && !TextUtils.isEmpty(linear.getAdParameters().getText())) {
                adParams.setAdParams(linear.getAdParameters().getText().trim());
            }
            if (linear.getVideoClicks() != null) {
                ClickThrough clickThrough = linear.getVideoClicks().getClickThrough();
                if (clickThrough != null) {
                    adParams.setVideoRedirectUrl(clickThrough.getText());
                }
                List<ClickTracking> clickTrackingList = linear.getVideoClicks().getClickTrackingList();
                ArrayList arrayList7 = new ArrayList();
                if (clickTrackingList != null) {
                    Iterator<ClickTracking> it4 = clickTrackingList.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(it4.next().getText());
                    }
                }
                adParams.setVideoClicks(arrayList7);
            }
            if (linear.getMediaFiles() != null && linear.getMediaFiles().getMediaFiles() != null && !linear.getMediaFiles().getMediaFiles().isEmpty()) {
                List<MediaFile> mediaFiles = linear.getMediaFiles().getMediaFiles();
                String vpaidJsUrl = getVpaidJsUrl(mediaFiles);
                List<MediaFile> filterNonVpaid = filterNonVpaid(mediaFiles);
                if (TextUtils.isEmpty(vpaidJsUrl) || !filterNonVpaid.isEmpty()) {
                    List<MediaFile> sortedMediaFiles = sortedMediaFiles(filterNonVpaid, adSpotDimensions);
                    ArrayList arrayList8 = new ArrayList();
                    for (MediaFile mediaFile : sortedMediaFiles) {
                        if (mediaFile.getText() != null) {
                            arrayList8.add(mediaFile.getText().trim());
                        }
                    }
                    adParams.setVideoFileUrlsList(arrayList8);
                    if (arrayList8.isEmpty()) {
                        ErrorLog.postError(context, VastError.MEDIA_FILE_NO_SUPPORTED_TYPE);
                    }
                } else {
                    adParams.setVpaid();
                    adParams.setVpaidJsUrl(vpaidJsUrl);
                }
            }
            if (linear.getIcons() != null && linear.getIcons().getIcons() != null && !linear.getIcons().getIcons().isEmpty()) {
                List<Icon> icons = linear.getIcons().getIcons();
                Icon icon = null;
                for (int i2 = 0; i2 < icons.size() && icon == null; i2++) {
                    Icon icon2 = icons.get(i2);
                    if (icon2 != null && !TextUtils.isEmpty(icon2.getProgram()) && icon2.getStaticResources() != null && !icon2.getStaticResources().isEmpty()) {
                        icon = icon2;
                    }
                }
                if (icon != null) {
                    adParams.setAdIcon(icon);
                }
            }
            CreativeExtension creativeExtension = null;
            for (int i3 = 0; i3 < creatives.size() && creativeExtension == null; i3++) {
                Creative creative = creatives.get(i3);
                if (creative != null && creative.getCreativeExtensions() != null && creative.getCreativeExtensions().getCreativeExtensions() != null && !creative.getCreativeExtensions().getCreativeExtensions().isEmpty()) {
                    List<CreativeExtension> creativeExtensions = creative.getCreativeExtensions().getCreativeExtensions();
                    int i4 = 0;
                    VerveCTAButton verveCTAButton = null;
                    while (i4 < creativeExtensions.size() && verveCTAButton == null) {
                        creativeExtension = creativeExtensions.get(i4);
                        if (creativeExtension == null || !creativeExtension.getType().equals("Verve") || creativeExtension.getVerveCTAButton() == null) {
                            i4++;
                        } else {
                            verveCTAButton = creativeExtension.getVerveCTAButton();
                        }
                    }
                    if (verveCTAButton != null) {
                        if (verveCTAButton.getHtmlResource() != null && !TextUtils.isEmpty(verveCTAButton.getHtmlResource().getText())) {
                            adParams.setCtaExtensionHtml(verveCTAButton.getHtmlResource().getText());
                        }
                        if (verveCTAButton.getTrackingEvents() != null && verveCTAButton.getTrackingEvents().getTrackingList() != null && !verveCTAButton.getTrackingEvents().getTrackingList().isEmpty()) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Tracking tracking : verveCTAButton.getTrackingEvents().getTrackingList()) {
                                if (tracking != null && !TextUtils.isEmpty(tracking.getEvent()) && tracking.getEvent().equals("CTAClick") && !TextUtils.isEmpty(tracking.getText())) {
                                    arrayList9.add(tracking.getText());
                                }
                            }
                            adParams.setCtaExtensionClicks(arrayList9);
                        }
                    }
                }
            }
        }
    }

    private List<MediaFile> filterNonVpaid(List<MediaFile> list) {
        ArrayList arrayList = new ArrayList(list);
        for (MediaFile mediaFile : list) {
            if (mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                arrayList.remove(mediaFile);
            }
        }
        return arrayList;
    }

    private List<Companion> getSortedCompanions(List<Creative> list, AdSpotDimensions adSpotDimensions) {
        for (Creative creative : list) {
            if (creative.getCompanionAds() != null && creative.getCompanionAds().getCompanions() != null) {
                ArrayList arrayList = new ArrayList(creative.getCompanionAds().getCompanions());
                Collections.sort(arrayList, createCompanionComparator(adSpotDimensions));
                return arrayList;
            }
        }
        return new ArrayList();
    }

    private String getVpaidJsUrl(List<MediaFile> list) {
        for (MediaFile mediaFile : list) {
            if (mediaFile.getText() != null && mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                return mediaFile.getText().trim();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ int lambda$createCompanionComparator$1(AdSpotDimensions adSpotDimensions, Companion companion, Companion companion2) {
        double d;
        double d2;
        double d3;
        boolean z;
        double d4 = 0.0d;
        try {
            d = Double.parseDouble(companion.getWidth());
            try {
                d2 = Double.parseDouble(companion.getHeight());
                try {
                    d3 = Double.parseDouble(companion2.getWidth());
                } catch (RuntimeException e) {
                    e = e;
                    d3 = 0.0d;
                }
            } catch (RuntimeException e2) {
                e = e2;
                d2 = 0.0d;
                d3 = d2;
                Logger.w(LOG_TAG, e.getMessage());
                double d5 = d / d2;
                double d6 = d3 / d4;
                double width = adSpotDimensions.getWidth() / adSpotDimensions.getHeight();
                double min = Math.min(adSpotDimensions.getWidth() / d, adSpotDimensions.getHeight() / d2);
                double min2 = Math.min(adSpotDimensions.getWidth() / d3, adSpotDimensions.getHeight() / d4);
                if (d5 <= width) {
                }
                if (d6 <= width) {
                }
                if (!z) {
                }
                if (z) {
                }
                return Double.compare(min2, min);
            }
            try {
                d4 = Double.parseDouble(companion2.getHeight());
            } catch (RuntimeException e3) {
                e = e3;
                Logger.w(LOG_TAG, e.getMessage());
                double d52 = d / d2;
                double d62 = d3 / d4;
                double width2 = adSpotDimensions.getWidth() / adSpotDimensions.getHeight();
                double min3 = Math.min(adSpotDimensions.getWidth() / d, adSpotDimensions.getHeight() / d2);
                double min22 = Math.min(adSpotDimensions.getWidth() / d3, adSpotDimensions.getHeight() / d4);
                if (d52 <= width2) {
                }
                if (d62 <= width2) {
                }
                if (!z) {
                }
                if (z) {
                }
                return Double.compare(min22, min3);
            }
        } catch (RuntimeException e4) {
            e = e4;
            d = 0.0d;
            d2 = 0.0d;
        }
        double d522 = d / d2;
        double d622 = d3 / d4;
        double width22 = adSpotDimensions.getWidth() / adSpotDimensions.getHeight();
        double min32 = Math.min(adSpotDimensions.getWidth() / d, adSpotDimensions.getHeight() / d2);
        double min222 = Math.min(adSpotDimensions.getWidth() / d3, adSpotDimensions.getHeight() / d4);
        z = d522 <= width22;
        boolean z2 = d622 <= width22;
        if (!z && !z2) {
            return -1;
        }
        if (z && z2) {
            return 1;
        }
        return Double.compare(min222, min32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$createComparator$0(AdSpotDimensions adSpotDimensions, MediaFile mediaFile, MediaFile mediaFile2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        try {
            i2 = Integer.parseInt(mediaFile.getWidth());
            try {
                i = Integer.parseInt(mediaFile.getHeight());
                try {
                    i3 = Integer.parseInt(mediaFile2.getWidth());
                    try {
                        i4 = Integer.parseInt(mediaFile2.getHeight());
                    } catch (RuntimeException e) {
                        e = e;
                        Logger.w(LOG_TAG, e.getMessage());
                        return Integer.compare(Math.abs(adSpotDimensions.getWidth() - i2) + Math.abs(adSpotDimensions.getHeight() - i), Math.abs(adSpotDimensions.getWidth() - i3) + Math.abs(adSpotDimensions.getHeight() - i4));
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    i3 = 0;
                }
            } catch (RuntimeException e3) {
                e = e3;
                i = 0;
                i3 = 0;
            }
        } catch (RuntimeException e4) {
            e = e4;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return Integer.compare(Math.abs(adSpotDimensions.getWidth() - i2) + Math.abs(adSpotDimensions.getHeight() - i), Math.abs(adSpotDimensions.getWidth() - i3) + Math.abs(adSpotDimensions.getHeight() - i4));
    }

    private String parseAdParameters(Linear linear) {
        try {
            return linear.getAdParameters().getText().trim();
        } catch (Exception unused) {
            return "";
        }
    }

    private List<MediaFile> sortedMediaFiles(List<MediaFile> list, AdSpotDimensions adSpotDimensions) {
        ArrayList arrayList = new ArrayList();
        for (MediaFile mediaFile : list) {
            if (new HashSet(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/3gpp2", "video/x-m4v")).contains(mediaFile.getType())) {
                arrayList.add(mediaFile);
            }
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, createComparator(adSpotDimensions));
        }
        return arrayList;
    }

    public void parseResponse(String str, final Listener listener) {
        try {
            Vast vast = (Vast) XmlParser.parse(str, Vast.class);
            if (vast.getErrors() != null && !vast.getErrors().isEmpty() && vast.getAds() != null && !vast.getAds().isEmpty()) {
                if (vast.getErrors() != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Error error : vast.getErrors()) {
                        if (!TextUtils.isEmpty(error.getText())) {
                            arrayList.add(error.getText().trim());
                        }
                    }
                    ErrorLog.initErrorLog(arrayList);
                    ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                }
                if (listener != null) {
                    PlayerInfo playerInfo = new PlayerInfo("No ads found - An error has been detected on the root of the VAST response");
                    playerInfo.setNoAdsFound();
                    listener.onParseError(playerInfo);
                    return;
                }
                return;
            }
            if (vast.getAds() != null && !vast.getAds().isEmpty() && (vast.getErrors() == null || vast.getErrors().isEmpty())) {
                Ad ad = vast.getAds().get(0);
                this.adParams.setId(ad.getId());
                VastAdSource inLine = ad.getInLine();
                Wrapper wrapper = ad.getWrapper();
                if (inLine != null) {
                    fillAdParams(this.mContext, inLine, this.adParams, this.mParseParams, str);
                    if (listener != null) {
                        if (this.adParams.isVpaid()) {
                            PlayerInfo playerInfo2 = new PlayerInfo("No ads found - Unsupported ad format");
                            playerInfo2.setNoAdsFound();
                            listener.onParseError(playerInfo2);
                            return;
                        }
                        if (this.adParams.getVideoFileUrlsList() != null && !this.adParams.getVideoFileUrlsList().isEmpty()) {
                            listener.onParseSuccess(this.adParams, str);
                            return;
                        }
                        ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                        PlayerInfo playerInfo3 = new PlayerInfo("No video file found");
                        playerInfo3.setNoAdsFound();
                        listener.onParseError(playerInfo3);
                        return;
                    }
                    return;
                }
                if (wrapper == null) {
                    ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                    Logger.e(LOG_TAG, "Parse VAST failed: No ad source was received");
                    if (listener != null) {
                        listener.onParseError(new PlayerInfo("No VAST ad source was received"));
                        return;
                    }
                    return;
                }
                fillAdParams(this.mContext, wrapper, this.adParams, this.mParseParams, str);
                if (this.adParams.isVpaid()) {
                    if (listener != null) {
                        PlayerInfo playerInfo4 = new PlayerInfo("No ads found - Unsupported ad format");
                        playerInfo4.setNoAdsFound();
                        listener.onParseError(playerInfo4);
                        return;
                    }
                    return;
                }
                if (this.unwrapAttempt >= 5) {
                    ErrorLog.postError(this.mContext, VastError.WRAPPER_LIMIT);
                    Logger.e(LOG_TAG, "Parse VAST failed: Vast processor reached wrapper limit (5)");
                    if (listener != null) {
                        listener.onParseError(new PlayerInfo("Vast processor reached wrapper limit (5)"));
                        return;
                    }
                    return;
                }
                String text = wrapper.getVastAdTagURI().getText();
                HashMap hashMap = new HashMap();
                String userAgent = HyBid.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                PNHttpClient.makeRequest(this.mContext, text, hashMap, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.response.VastProcessor.1
                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFailure(Throwable th) {
                        ErrorLog.postError(VastProcessor.this.mContext, VastError.WRAPPER);
                        Logger.e(VastProcessor.LOG_TAG, "Parse VAST failed: ", th);
                        if (listener != null) {
                            listener.onParseError(new PlayerInfo("Parse VAST response failed " + th.getMessage()));
                        }
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onSuccess(String str2, Map<String, List<String>> map) {
                        VastProcessor.this.parseResponse(str2, listener);
                    }
                });
                this.unwrapAttempt++;
                return;
            }
            if (vast.getErrors() != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Error error2 : vast.getErrors()) {
                    if (!TextUtils.isEmpty(error2.getText())) {
                        arrayList2.add(error2.getText().trim());
                    }
                }
                ErrorLog.initErrorLog(arrayList2);
                ErrorLog.postError(this.mContext, VastError.XML_PARSING);
            }
            if (listener != null) {
                PlayerInfo playerInfo5 = new PlayerInfo("No ads found");
                playerInfo5.setNoAdsFound();
                listener.onParseError(playerInfo5);
            }
        } catch (Exception e) {
            ErrorLog.postError(this.mContext, VastError.XML_PARSING);
            Logger.e(LOG_TAG, "Parse VAST failed: ", e);
            if (listener != null) {
                listener.onParseError(new PlayerInfo("Parse VAST response failed" + e.getMessage()));
            }
        }
    }
}
