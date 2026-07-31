package io.bidmachine.iab.vast.processor;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdContentTag;
import io.bidmachine.iab.vast.tags.AdTag;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionAdsCreativeTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.CreativeContentTag;
import io.bidmachine.iab.vast.tags.CreativeTag;
import io.bidmachine.iab.vast.tags.ExtensionTag;
import io.bidmachine.iab.vast.tags.InLineAdTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VastParser;
import io.bidmachine.iab.vast.tags.VastTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import io.bidmachine.iab.vast.tags.WrapperAdTag;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes6.dex */
public class VastProcessor {
    private final VastRequest a;
    private final VastMediaPicker b;
    final int c;
    final Stack d;
    private int e;

    public VastProcessor(@NonNull VastRequest vastRequest, @NonNull VastMediaPicker<MediaFileTag> vastMediaPicker) {
        this(vastRequest, vastMediaPicker, 5);
    }

    private VastProcessorResult a(AdContentTag adContentTag, VastTag vastTag, a aVar) {
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        for (int i = 0; i < vastTag.getAdTagList().size(); i++) {
            AdTag adTag = vastTag.getAdTagList().get(i);
            if (adTag != null && adTag.getAdContentTag() != null) {
                AdContentTag adContentTag2 = adTag.getAdContentTag();
                if (adContentTag2 instanceof InLineAdTag) {
                    VastProcessorResult b = b((InLineAdTag) adContentTag2);
                    if (b.hasVastAd()) {
                        return b;
                    }
                    a(b.a());
                    if (adContentTag == null) {
                        vastProcessorResult.a(b.getVastSpecError());
                    } else if (b.b()) {
                        VastSpecError vastSpecError = b.getVastSpecError();
                        if (vastSpecError == null) {
                            vastSpecError = VastSpecError.UNKNOWN;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError);
                    }
                } else if ((adContentTag2 instanceof WrapperAdTag) && aVar.c()) {
                    VastProcessorResult a = a((WrapperAdTag) adContentTag2);
                    if (a.hasVastAd()) {
                        return a;
                    }
                    a(a.a());
                    if (adContentTag == null) {
                        vastProcessorResult.a(VastSpecError.WRAPPER_RESPONSE_NO_AD);
                    } else if (a.b()) {
                        VastSpecError vastSpecError2 = a.getVastSpecError();
                        if (vastSpecError2 == null) {
                            vastSpecError2 = VastSpecError.UNKNOWN;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError2);
                    } else {
                        vastProcessorResult.a(adContentTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
                    }
                    if (i == 0 && !aVar.b()) {
                        return vastProcessorResult;
                    }
                }
                b(adContentTag2);
            }
        }
        if (vastProcessorResult.getVastSpecError() == null && adContentTag != null) {
            vastProcessorResult.a(adContentTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
        }
        return vastProcessorResult;
    }

    private VastProcessorResult b(InLineAdTag inLineAdTag) {
        this.d.push(inLineAdTag);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        Pair a = a(inLineAdTag);
        if (a == null) {
            vastProcessorResult.a(inLineAdTag, VastSpecError.XML_VALIDATE);
        } else if (a.first == null && a.second == null) {
            vastProcessorResult.a(inLineAdTag, VastSpecError.BAD_FILE);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> arrayList3 = new ArrayList<>();
            EnumMap enumMap = new EnumMap(TrackingEvent.class);
            ArrayList arrayList4 = new ArrayList();
            AppodealExtensionTag appodealExtensionTag = null;
            if (!this.d.empty()) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    AdContentTag adContentTag = (AdContentTag) it.next();
                    if (adContentTag != null) {
                        if (adContentTag.getImpressionUrlList() != null) {
                            arrayList.addAll(adContentTag.getImpressionUrlList());
                        }
                        List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
                        if (creativeTagList != null) {
                            for (CreativeTag creativeTag : creativeTagList) {
                                if (creativeTag != null) {
                                    CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                                    if (creativeContentTag instanceof LinearCreativeTag) {
                                        LinearCreativeTag linearCreativeTag = (LinearCreativeTag) creativeContentTag;
                                        VideoClicksTag videoClicksTag = linearCreativeTag.getVideoClicksTag();
                                        if (videoClicksTag != null && videoClicksTag.getClickTrackingUrlList() != null) {
                                            arrayList2.addAll(videoClicksTag.getClickTrackingUrlList());
                                        }
                                        a(enumMap, linearCreativeTag.getTrackingEventListMap());
                                    } else if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                                        a(arrayList3, (CompanionAdsCreativeTag) creativeContentTag);
                                    }
                                }
                            }
                        }
                        List<ExtensionTag> extensionTagList = adContentTag.getExtensionTagList();
                        if (extensionTagList != null) {
                            for (ExtensionTag extensionTag : extensionTagList) {
                                if (extensionTag instanceof AppodealExtensionTag) {
                                    if (appodealExtensionTag == null) {
                                        appodealExtensionTag = (AppodealExtensionTag) extensionTag;
                                    }
                                } else if (extensionTag instanceof AdVerificationsExtensionTag) {
                                    arrayList4.add((AdVerificationsExtensionTag) extensionTag);
                                }
                            }
                        }
                    }
                }
            }
            VastAd vastAd = new VastAd((LinearCreativeTag) a.first, (MediaFileTag) a.second);
            vastAd.d(arrayList);
            vastAd.c(a());
            vastAd.a(arrayList2);
            vastAd.setWrapperCompanionClickTrackingUrlList(arrayList3);
            vastAd.a(enumMap);
            vastAd.b(a((AdContentTag) inLineAdTag));
            vastAd.a(appodealExtensionTag);
            vastAd.setAdVerificationsExtensionList(arrayList4);
            vastProcessorResult.a(vastAd);
        }
        return vastProcessorResult;
    }

    @NonNull
    public VastProcessorResult process(@Nullable String str) {
        VastLog.d("VastProcessor", "process", new Object[0]);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        try {
            VastTag parseVast = VastParser.parseVast(str);
            if (parseVast != null && parseVast.hasAd()) {
                return a(null, parseVast, new a());
            }
            vastProcessorResult.a(VastSpecError.XML_VALIDATE);
            return vastProcessorResult;
        } catch (Exception unused) {
            vastProcessorResult.a(VastSpecError.XML_PARSING);
            return vastProcessorResult;
        }
    }

    VastProcessor(VastRequest vastRequest, VastMediaPicker vastMediaPicker, int i) {
        this.e = 0;
        this.a = vastRequest;
        this.b = vastMediaPicker;
        this.c = i;
        this.d = new Stack();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    VastProcessorResult a(WrapperAdTag wrapperAdTag) {
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        if (b()) {
            VastLog.e("VastProcessor", "VAST wrapping exceeded max limit of %d", Integer.valueOf(this.c));
            vastProcessorResult.a(wrapperAdTag, VastSpecError.EXCEEDED_WRAPPER_LIMIT);
            return vastProcessorResult;
        }
        this.e++;
        this.d.push(wrapperAdTag);
        if (TextUtils.isEmpty(wrapperAdTag.getVastAdTagUri())) {
            VastLog.e("VastProcessor", "VASTAdTagURI is null or empty", new Object[0]);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
            return vastProcessorResult;
        }
        a aVar = new a(wrapperAdTag);
        InputStream inputStream = null;
        try {
            try {
                try {
                    URLConnection openConnection = new URL(wrapperAdTag.getVastAdTagUri()).openConnection();
                    int httpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode((HttpURLConnection) openConnection);
                    if (httpUrlConnectionGetResponseCode != 200) {
                        if (httpUrlConnectionGetResponseCode != 204) {
                            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                            return vastProcessorResult;
                        }
                        VastLog.e("VastProcessor", "Wrapper response code: 204", new Object[0]);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
                        return vastProcessorResult;
                    }
                    InputStream urlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(openConnection);
                    VastTag parseVast = VastParser.parseVast(urlConnectionGetInputStream);
                    if (parseVast == null) {
                        VastLog.e("VastProcessor", "Invalid Vast", new Object[0]);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.XML_VALIDATE);
                        if (urlConnectionGetInputStream != null) {
                            try {
                                urlConnectionGetInputStream.close();
                            } catch (Exception e) {
                                VastLog.e("VastProcessor", e);
                            }
                        }
                        return vastProcessorResult;
                    }
                    if (!parseVast.hasAd()) {
                        VastLog.e("VastProcessor", "Vast has no ad", new Object[0]);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
                        if (urlConnectionGetInputStream != null) {
                            try {
                                urlConnectionGetInputStream.close();
                            } catch (Exception e2) {
                                VastLog.e("VastProcessor", e2);
                            }
                        }
                        return vastProcessorResult;
                    }
                    if (parseVast.getAdTagList().size() > 1 && !aVar.a()) {
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.GENERAL_WRAPPER);
                        if (urlConnectionGetInputStream != null) {
                            try {
                                urlConnectionGetInputStream.close();
                            } catch (Exception e3) {
                                VastLog.e("VastProcessor", e3);
                            }
                        }
                        return vastProcessorResult;
                    }
                    VastProcessorResult a = a(wrapperAdTag, parseVast, aVar);
                    a.a(false);
                    if (urlConnectionGetInputStream != null) {
                        try {
                            urlConnectionGetInputStream.close();
                        } catch (Exception e4) {
                            VastLog.e("VastProcessor", e4);
                        }
                    }
                    return a;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e5) {
                            VastLog.e("VastProcessor", e5);
                        }
                    }
                    throw th;
                }
            } catch (MalformedURLException e6) {
                VastLog.e("VastProcessor", e6);
                vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e7) {
                        VastLog.e("VastProcessor", e7);
                    }
                }
                return vastProcessorResult;
            } catch (IOException e8) {
                VastLog.e("VastProcessor", e8);
                vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e9) {
                        VastLog.e("VastProcessor", e9);
                    }
                }
                return vastProcessorResult;
            }
        } catch (SocketTimeoutException e10) {
            e = e10;
            VastLog.e("VastProcessor", e);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    VastLog.e("VastProcessor", e11);
                }
            }
            return vastProcessorResult;
        } catch (UnknownHostException e12) {
            e = e12;
            VastLog.e("VastProcessor", e);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
            if (0 != 0) {
            }
            return vastProcessorResult;
        } catch (SSLException e13) {
            e = e13;
            VastLog.e("VastProcessor", e);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
            if (0 != 0) {
            }
            return vastProcessorResult;
        } catch (ConnectTimeoutException e14) {
            e = e14;
            VastLog.e("VastProcessor", e);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
            if (0 != 0) {
            }
            return vastProcessorResult;
        } catch (Exception e15) {
            VastLog.e("VastProcessor", e15);
            vastProcessorResult.a(wrapperAdTag, VastSpecError.XML_PARSING);
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e16) {
                    VastLog.e("VastProcessor", e16);
                }
            }
            return vastProcessorResult;
        }
    }

    private boolean b() {
        return this.e >= this.c;
    }

    void b(AdContentTag adContentTag) {
        if (this.d.empty()) {
            return;
        }
        int search = this.d.search(adContentTag);
        for (int i = 0; i < search; i++) {
            this.d.pop();
        }
    }

    private ArrayList a(AdContentTag adContentTag) {
        ArrayList arrayList = new ArrayList();
        List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
        if (creativeTagList == null) {
            return arrayList;
        }
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                    arrayList.addAll(((CompanionAdsCreativeTag) creativeContentTag).getCompanionTagList());
                }
            }
        }
        return arrayList;
    }

    private ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.empty()) {
            return arrayList;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            AdContentTag adContentTag = (AdContentTag) it.next();
            if (adContentTag != null && adContentTag.getErrorUrlList() != null) {
                arrayList.addAll(adContentTag.getErrorUrlList());
            }
        }
        return arrayList;
    }

    private Pair a(InLineAdTag inLineAdTag) {
        LinearCreativeTag linearCreativeTag;
        List<MediaFileTag> mediaFileTagList;
        List<CreativeTag> creativeTagList = inLineAdTag.getCreativeTagList();
        if (creativeTagList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if ((creativeContentTag instanceof LinearCreativeTag) && (mediaFileTagList = (linearCreativeTag = (LinearCreativeTag) creativeContentTag).getMediaFileTagList()) != null && !mediaFileTagList.isEmpty()) {
                    Iterator<MediaFileTag> it = mediaFileTagList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(linearCreativeTag, it.next()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pickVideo = this.b.pickVideo(arrayList);
        return pickVideo != null ? pickVideo : new Pair(null, null);
    }

    private void a(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            TrackingEvent trackingEvent = (TrackingEvent) entry.getKey();
            List list = (List) map.get(trackingEvent);
            if (list == null) {
                list = new ArrayList();
                map.put(trackingEvent, list);
            }
            list.addAll((Collection) entry.getValue());
        }
    }

    private void a(List list, CompanionAdsCreativeTag companionAdsCreativeTag) {
        List<String> companionClickTrackingList;
        for (CompanionTag companionTag : companionAdsCreativeTag.getCompanionTagList()) {
            if (!companionTag.hasCreative() && (companionClickTrackingList = companionTag.getCompanionClickTrackingList()) != null) {
                list.addAll(companionClickTrackingList);
            }
        }
    }

    void a(List list) {
        this.a.fireErrorUrls(list, null);
    }
}
