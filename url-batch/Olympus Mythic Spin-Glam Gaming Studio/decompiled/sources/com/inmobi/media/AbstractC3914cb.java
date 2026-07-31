package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import io.bidmachine.util.network.NetworkUtils;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3914cb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String telemetryEventName, C4152lb c4152lb, String reason, Long l) {
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(telemetryEventName, "telemetryEventName");
        if (c4152lb != null) {
            if (reason != null) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                switch (reason.hashCode()) {
                    case -1519854342:
                        if (reason.equals("PAGE_COMMIT_VISIBLE")) {
                            i = 2404;
                            break;
                        }
                        i = 0;
                        break;
                    case -404561643:
                        if (reason.equals("LOADER_TIMEOUT")) {
                            i = 2405;
                            break;
                        }
                        i = 0;
                        break;
                    case -229348854:
                        if (reason.equals("RECEIVED_ERROR")) {
                            i = 2403;
                            break;
                        }
                        i = 0;
                        break;
                    case 433141802:
                        if (reason.equals("UNKNOWN")) {
                            i = 2407;
                            break;
                        }
                        i = 0;
                        break;
                    case 1893734552:
                        if (reason.equals("RENDER_PROCESS_GONE")) {
                            i = 2401;
                            break;
                        }
                        i = 0;
                        break;
                    case 2032004239:
                        if (reason.equals("RECEIVED_HTTP_ERROR")) {
                            i = 2402;
                            break;
                        }
                        i = 0;
                        break;
                    case 2109630258:
                        if (reason.equals("ACTIVITY_STOP")) {
                            i = 2406;
                            break;
                        }
                        i = 0;
                        break;
                    default:
                        i = 0;
                        break;
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            LinkedHashMap a = a(c4152lb, num);
            if (l != null) {
                a.put("latency", Long.valueOf(l.longValue()));
            }
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C3888bb(a, telemetryEventName, null), 3, null);
        }
    }

    public static void a(Za funnelState, C4152lb c4152lb, Integer num, Function2 function2) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        if (c4152lb == null || funnelState.c <= c4152lb.e) {
            return;
        }
        LinkedHashMap a = a(c4152lb, num);
        long j = c4152lb.d;
        if (j != 0) {
            CoroutineScope coroutineScope = Hl.a;
            a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
        c4152lb.e = funnelState.c;
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C3862ab(a, funnelState, null), 3, null);
        int i = c4152lb.c;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (i > ((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        String str = funnelState.b;
        String str2 = c4152lb.f;
        if (str2 == null) {
            str2 = c4152lb.a.i;
        }
        function2.invoke(str, MapsKt.mapOf(TuplesKt.to("$OPENMODE", str2), TuplesKt.to("$URLTYPE", c4152lb.b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
            return "invalid";
        }
        if (StringsKt.startsWith(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (StringsKt.startsWith(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (StringsKt.startsWith(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u, true)) {
            return "https";
        }
        if (StringsKt.startsWith(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, true)) {
            return "http";
        }
        return StringsKt.startsWith(str, "market://", true) ? NetworkUtils.PROTOCOL_MARKET : "deeplink";
    }

    public static LinkedHashMap a(C4152lb c4152lb, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", c4152lb.a.c);
        linkedHashMap.put("impressionId", c4152lb.a.b);
        linkedHashMap.put("plId", Long.valueOf(c4152lb.a.a));
        linkedHashMap.put("adType", c4152lb.a.d);
        linkedHashMap.put("markupType", c4152lb.a.e);
        linkedHashMap.put("creativeType", c4152lb.a.f);
        linkedHashMap.put("metadataBlob", c4152lb.a.g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(c4152lb.a.h));
        String str = c4152lb.f;
        if (str == null) {
            str = c4152lb.a.i;
        }
        linkedHashMap.put(DivActionHandler.DivActionReason.TRIGGER, str);
        linkedHashMap.put("urlType", c4152lb.b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        return linkedHashMap;
    }
}
