package com.smaato.sdk.ng.vpaid.response;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.vpaid.PlayerInfo;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import com.smaato.sdk.ng.vpaid.helpers.ErrorLog;
import com.smaato.sdk.ng.vpaid.models.vast.Ad;
import com.smaato.sdk.ng.vpaid.models.vast.AdVerifications;
import com.smaato.sdk.ng.vpaid.models.vast.ClickThrough;
import com.smaato.sdk.ng.vpaid.models.vast.ClickTracking;
import com.smaato.sdk.ng.vpaid.models.vast.Companion;
import com.smaato.sdk.ng.vpaid.models.vast.CompanionClickThrough;
import com.smaato.sdk.ng.vpaid.models.vast.CompanionClickTracking;
import com.smaato.sdk.ng.vpaid.models.vast.Creative;
import com.smaato.sdk.ng.vpaid.models.vast.CreativeExtension;
import com.smaato.sdk.ng.vpaid.models.vast.Error;
import com.smaato.sdk.ng.vpaid.models.vast.Extension;
import com.smaato.sdk.ng.vpaid.models.vast.HTMLResource;
import com.smaato.sdk.ng.vpaid.models.vast.IFrameResource;
import com.smaato.sdk.ng.vpaid.models.vast.Icon;
import com.smaato.sdk.ng.vpaid.models.vast.Impression;
import com.smaato.sdk.ng.vpaid.models.vast.JavaScriptResource;
import com.smaato.sdk.ng.vpaid.models.vast.Linear;
import com.smaato.sdk.ng.vpaid.models.vast.MediaFile;
import com.smaato.sdk.ng.vpaid.models.vast.StaticResource;
import com.smaato.sdk.ng.vpaid.models.vast.Tracking;
import com.smaato.sdk.ng.vpaid.models.vast.Vast;
import com.smaato.sdk.ng.vpaid.models.vast.VastAdSource;
import com.smaato.sdk.ng.vpaid.models.vast.Verification;
import com.smaato.sdk.ng.vpaid.models.vast.VerveCTAButton;
import com.smaato.sdk.ng.vpaid.models.vast.Wrapper;
import com.smaato.sdk.ng.vpaid.models.vpaid.AdSpotDimensions;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import com.smaato.sdk.ng.vpaid.xml.XmlParser;
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

/* loaded from: classes15.dex */
public class VastProcessor {
    private static final String e = "VastProcessor";
    private final Context a;
    private final AdSpotDimensions b;
    private final AdParams c = new AdParams();
    private int d = 0;

    public interface Listener {
        void onParseError(PlayerInfo playerInfo);

        void onParseSuccess(AdParams adParams, String str);
    }

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ Listener a;

        a(Listener listener) {
            this.a = listener;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            ErrorLog.postError(VastProcessor.this.a, VastError.WRAPPER);
            Logger.e(VastProcessor.e, "Parse VAST failed: ", th);
            if (this.a != null) {
                this.a.onParseError(new PlayerInfo("Parse VAST response failed " + th.getMessage()));
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            VastProcessor.this.parseResponse(str, this.a);
        }
    }

    public VastProcessor(Context context, AdSpotDimensions adSpotDimensions) {
        this.a = context;
        this.b = adSpotDimensions;
    }

    private void a(Context context, VastAdSource vastAdSource, AdParams adParams, AdSpotDimensions adSpotDimensions, String str) {
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
                        } catch (Exception e2) {
                            Logger.e(e, e2.getMessage());
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
                } catch (Exception e3) {
                    Logger.e(e, e3.getMessage());
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
            List<Companion> a2 = a(creatives, adSpotDimensions);
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < a2.size() && arrayList4.isEmpty(); i++) {
                Companion companion = a2.get(i);
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
            if (!a2.isEmpty()) {
                Companion companion2 = a2.get(0);
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
        } catch (Exception e4) {
            Logger.e(e, e4.getMessage());
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
                String b = b(mediaFiles);
                List<MediaFile> a3 = a(mediaFiles);
                if (TextUtils.isEmpty(b) || !a3.isEmpty()) {
                    List<MediaFile> b2 = b(a3, adSpotDimensions);
                    ArrayList arrayList8 = new ArrayList();
                    for (MediaFile mediaFile : b2) {
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
                    adParams.setVpaidJsUrl(b);
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

    private String b(List<MediaFile> list) {
        for (MediaFile mediaFile : list) {
            if (mediaFile.getText() != null && mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                return mediaFile.getText().trim();
            }
        }
        return null;
    }

    public void parseResponse(String str, Listener listener) {
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
                    ErrorLog.postError(this.a, VastError.XML_PARSING);
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
                this.c.setId(ad.getId());
                VastAdSource inLine = ad.getInLine();
                Wrapper wrapper = ad.getWrapper();
                if (inLine != null) {
                    a(this.a, inLine, this.c, this.b, str);
                    if (listener != null) {
                        if (this.c.isVpaid()) {
                            PlayerInfo playerInfo2 = new PlayerInfo("No ads found - Unsupported ad format");
                            playerInfo2.setNoAdsFound();
                            listener.onParseError(playerInfo2);
                            return;
                        }
                        if (this.c.getVideoFileUrlsList() != null && !this.c.getVideoFileUrlsList().isEmpty()) {
                            listener.onParseSuccess(this.c, str);
                            return;
                        }
                        ErrorLog.postError(this.a, VastError.XML_PARSING);
                        PlayerInfo playerInfo3 = new PlayerInfo("No video file found");
                        playerInfo3.setNoAdsFound();
                        listener.onParseError(playerInfo3);
                        return;
                    }
                    return;
                }
                if (wrapper == null) {
                    ErrorLog.postError(this.a, VastError.XML_PARSING);
                    Logger.e(e, "Parse VAST failed: No ad source was received");
                    if (listener != null) {
                        listener.onParseError(new PlayerInfo("No VAST ad source was received"));
                        return;
                    }
                    return;
                }
                a(this.a, wrapper, this.c, this.b, str);
                if (this.c.isVpaid()) {
                    if (listener != null) {
                        PlayerInfo playerInfo4 = new PlayerInfo("No ads found - Unsupported ad format");
                        playerInfo4.setNoAdsFound();
                        listener.onParseError(playerInfo4);
                        return;
                    }
                    return;
                }
                if (this.d >= 5) {
                    ErrorLog.postError(this.a, VastError.WRAPPER_LIMIT);
                    Logger.e(e, "Parse VAST failed: Vast processor reached wrapper limit (5)");
                    if (listener != null) {
                        listener.onParseError(new PlayerInfo("Vast processor reached wrapper limit (5)"));
                        return;
                    }
                    return;
                }
                String text = wrapper.getVastAdTagURI().getText();
                HashMap hashMap = new HashMap();
                String userAgent = NextGen.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                NGSDKHttpClient.makeRequest(this.a, text, hashMap, null, new a(listener));
                this.d++;
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
                ErrorLog.postError(this.a, VastError.XML_PARSING);
            }
            if (listener != null) {
                PlayerInfo playerInfo5 = new PlayerInfo("No ads found");
                playerInfo5.setNoAdsFound();
                listener.onParseError(playerInfo5);
            }
        } catch (Exception e2) {
            ErrorLog.postError(this.a, VastError.XML_PARSING);
            Logger.e(e, "Parse VAST failed: ", e2);
            if (listener != null) {
                listener.onParseError(new PlayerInfo("Parse VAST response failed" + e2.getMessage()));
            }
        }
    }

    private List<MediaFile> b(List<MediaFile> list, AdSpotDimensions adSpotDimensions) {
        ArrayList arrayList = new ArrayList();
        for (MediaFile mediaFile : list) {
            if (new HashSet(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/3gpp2", "video/x-m4v")).contains(mediaFile.getType())) {
                arrayList.add(mediaFile);
            }
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, b(adSpotDimensions));
        }
        return arrayList;
    }

    private Comparator<MediaFile> b(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: com.smaato.sdk.ng.vpaid.response.VastProcessor$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a2;
                a2 = VastProcessor.a(AdSpotDimensions.this, (MediaFile) obj, (MediaFile) obj2);
                return a2;
            }
        };
    }

    private List<MediaFile> a(List<MediaFile> list) {
        ArrayList arrayList = new ArrayList(list);
        for (MediaFile mediaFile : list) {
            if (mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                arrayList.remove(mediaFile);
            }
        }
        return arrayList;
    }

    private List<Companion> a(List<Creative> list, AdSpotDimensions adSpotDimensions) {
        for (Creative creative : list) {
            if (creative.getCompanionAds() != null && creative.getCompanionAds().getCompanions() != null) {
                ArrayList arrayList = new ArrayList(creative.getCompanionAds().getCompanions());
                Collections.sort(arrayList, a(adSpotDimensions));
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(AdSpotDimensions adSpotDimensions, MediaFile mediaFile, MediaFile mediaFile2) {
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
                    } catch (RuntimeException e2) {
                        e = e2;
                        Logger.w(e, e.getMessage());
                        return Integer.compare(Math.abs(adSpotDimensions.getWidth() - i2) + Math.abs(adSpotDimensions.getHeight() - i), Math.abs(adSpotDimensions.getWidth() - i3) + Math.abs(adSpotDimensions.getHeight() - i4));
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    i3 = 0;
                }
            } catch (RuntimeException e4) {
                e = e4;
                i = 0;
                i3 = 0;
            }
        } catch (RuntimeException e5) {
            e = e5;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return Integer.compare(Math.abs(adSpotDimensions.getWidth() - i2) + Math.abs(adSpotDimensions.getHeight() - i), Math.abs(adSpotDimensions.getWidth() - i3) + Math.abs(adSpotDimensions.getHeight() - i4));
    }

    private Comparator<Companion> a(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: com.smaato.sdk.ng.vpaid.response.VastProcessor$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a2;
                a2 = VastProcessor.a(AdSpotDimensions.this, (Companion) obj, (Companion) obj2);
                return a2;
            }
        };
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
    public static /* synthetic */ int a(AdSpotDimensions adSpotDimensions, Companion companion, Companion companion2) {
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
                } catch (RuntimeException e2) {
                    e = e2;
                    d3 = 0.0d;
                }
            } catch (RuntimeException e3) {
                e = e3;
                d2 = 0.0d;
                d3 = d2;
                Logger.w(e, e.getMessage());
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
            } catch (RuntimeException e4) {
                e = e4;
                Logger.w(e, e.getMessage());
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
        } catch (RuntimeException e5) {
            e = e5;
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
}
