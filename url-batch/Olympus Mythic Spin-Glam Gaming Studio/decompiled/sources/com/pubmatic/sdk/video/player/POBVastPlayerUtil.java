package com.pubmatic.sdk.video.player;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.POBVideoConstant;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import com.pubmatic.sdk.video.vastmodels.POBCompanion;
import com.pubmatic.sdk.video.vastmodels.POBMediaFile;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class POBVastPlayerUtil {
    private static List a(List list, POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                POBMediaFile pOBMediaFile = (POBMediaFile) it.next();
                int length = supportedMediaTypeArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        POBVideoPlayer.SupportedMediaType supportedMediaType = supportedMediaTypeArr[i];
                        String type = pOBMediaFile.getType();
                        if (type == null || !type.contains(supportedMediaType.getValue())) {
                            i++;
                        } else {
                            arrayList.add(pOBMediaFile);
                            if (supportedMediaType != POBVideoPlayer.SupportedMediaType.MEDIA_WEBM) {
                                arrayList2.add(pOBMediaFile);
                            }
                        }
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        return (arrayList2 == null || !arrayList2.isEmpty()) ? arrayList2 : arrayList;
    }

    @Nullable
    public static POBMediaFile filterMediaFiles(@Nullable List<POBMediaFile> list, @NonNull POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr, int i, int i2, int i3) {
        List a = a(list, supportedMediaTypeArr);
        if (a == null || a.size() <= 0) {
            return null;
        }
        if (a.size() == 1) {
            return (POBMediaFile) a.get(0);
        }
        float f = i;
        float a2 = a((POBMediaFile) a.get(0), f, i2, i3);
        POBMediaFile pOBMediaFile = (POBMediaFile) a.get(0);
        for (int i4 = 1; i4 < a.size(); i4++) {
            POBMediaFile pOBMediaFile2 = (POBMediaFile) a.get(i4);
            float a3 = a(pOBMediaFile2, f, i2, i3);
            if (a3 < a2) {
                pOBMediaFile = pOBMediaFile2;
                a2 = a3;
            }
        }
        return pOBMediaFile;
    }

    @NonNull
    public static Map<String, String> generateErrorQueryParams(@NonNull Context context, @Nullable POBDeviceInfo pOBDeviceInfo, @Nullable POBMediaFile pOBMediaFile) {
        HashMap hashMap = new HashMap();
        if (pOBDeviceInfo != null) {
            String make = pOBDeviceInfo.getMake();
            if (make != null) {
                hashMap.put(POBVideoConstant.ERROR_TRACKER_KEY_MAKE, make);
            }
            String model = pOBDeviceInfo.getModel();
            if (model != null) {
                hashMap.put(POBVideoConstant.ERROR_TRACKER_KEY_MODEL, model);
            }
            String osVersion = pOBDeviceInfo.getOsVersion();
            if (osVersion != null) {
                hashMap.put("osv", osVersion);
            }
        }
        hashMap.put(POBVideoConstant.TRACKER_KEY_OW_VERSION, OpenWrapSDK.getVersion());
        hashMap.put(POBVideoConstant.ERROR_TRACKER_KEY_CONNECTION_TYPE, String.valueOf(POBInstanceProvider.getNetworkMonitor(context.getApplicationContext()).getConnectionType().getValue()));
        if (pOBMediaFile != null) {
            int bitrate = pOBMediaFile.getBitrate();
            if (bitrate != 0) {
                hashMap.put("br", String.valueOf(bitrate));
            }
            int width = pOBMediaFile.getWidth();
            int height = pOBMediaFile.getHeight();
            if (width != 0 && height != 0) {
                hashMap.put(POBVideoConstant.ERROR_TRACKER_KEY_CREATIVE_SIZE, width + VastAttributes.HORIZONTAL_POSITION + height);
            }
            String type = pOBMediaFile.getType();
            if (type != null) {
                hashMap.put("mt", type);
            }
        }
        return hashMap;
    }

    public static int getBitRate(boolean z, boolean z2) {
        if (z && !z2) {
            return 600;
        }
        if (z) {
            return 1000;
        }
        return z2 ? 2000 : 600;
    }

    @Nullable
    public static String getCustomProductPageClickUrl(@Nullable POBVastAd pOBVastAd, @Nullable String str) {
        if (pOBVastAd == null) {
            return null;
        }
        String closestClickThroughURL = pOBVastAd.getClosestClickThroughURL();
        if (POBUtils.isValidPlayStoreUrl(closestClickThroughURL)) {
            return closestClickThroughURL;
        }
        if (POBUtils.isNullOrEmpty(str)) {
            return null;
        }
        return String.format(POBCommonConstants.PLAY_STORE_URL, str);
    }

    public static int getScaleFactor(@NonNull Context context) {
        return context.getResources().getDisplayMetrics().density >= 2.0f ? 2 : 1;
    }

    public static double getSkipOffset(double d, @NonNull POBVastPlayerConfig pOBVastPlayerConfig, long j) {
        int skipAfter;
        if (pOBVastPlayerConfig.getSkip() == 0) {
            if (d < 0.0d || d > pOBVastPlayerConfig.getMaxDuration()) {
                skipAfter = pOBVastPlayerConfig.getMaxDuration();
                d = skipAfter;
            }
        } else if (pOBVastPlayerConfig.getSkip() != 1) {
            d = 0.0d;
        } else if (j > pOBVastPlayerConfig.getSkipMin()) {
            d = pOBVastPlayerConfig.getMaxDuration() > 0 ? pOBVastPlayerConfig.getMaxDuration() : j;
            if (!pOBVastPlayerConfig.isSkipAfterCompletionEnabled()) {
                skipAfter = pOBVastPlayerConfig.getSkipAfter();
                d = skipAfter;
            }
        } else {
            d = j;
        }
        return Math.floor(d > 0.0d ? Math.min(j, d) : 0.0d);
    }

    @Nullable
    public static POBCompanion getSuitableEndCardCompanion(@NonNull List<POBCompanion> list, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        float f3 = f / f2;
        for (POBCompanion pOBCompanion : list) {
            if (SafeDKWebAppInterface.e.equals(pOBCompanion.getRenderingMode())) {
                arrayList.add(pOBCompanion);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        float f4 = 9999.0f;
        float f5 = 2.1474836E9f;
        POBCompanion pOBCompanion2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            POBCompanion pOBCompanion3 = (POBCompanion) obj;
            int width = pOBCompanion3.getWidth();
            int height = pOBCompanion3.getHeight();
            float convertDpToPixelWithFloatPrecession = POBUtils.convertDpToPixelWithFloatPrecession(width);
            float convertDpToPixelWithFloatPrecession2 = POBUtils.convertDpToPixelWithFloatPrecession(height);
            POBLog.debug("POBVastPlayerUtil", "Companion: Width x Height dp = %d x %d px = %.3f x %.3f", Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(convertDpToPixelWithFloatPrecession), Float.valueOf(convertDpToPixelWithFloatPrecession2));
            float abs = Math.abs(1.0f - ((convertDpToPixelWithFloatPrecession / convertDpToPixelWithFloatPrecession2) / f3));
            float abs2 = Math.abs(convertDpToPixelWithFloatPrecession - f);
            if (abs < f4 || (abs == f4 && abs2 <= f5)) {
                pOBCompanion2 = pOBCompanion3;
                f4 = abs;
                f5 = abs2;
            }
        }
        return pOBCompanion2;
    }

    private static float a(POBMediaFile pOBMediaFile, float f, int i, int i2) {
        return Math.abs((pOBMediaFile.getBitrate() - f) / f) + Math.abs((pOBMediaFile.getWidth() - i) / i) + Math.abs((pOBMediaFile.getHeight() - i2) / i2);
    }
}
