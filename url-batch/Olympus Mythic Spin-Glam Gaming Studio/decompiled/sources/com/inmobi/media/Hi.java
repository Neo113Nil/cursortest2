package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* loaded from: classes12.dex */
public final class Hi {
    public final Bi a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public long h;

    public Hi(Bi renderViewMetaData) {
        Intrinsics.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.a = renderViewMetaData;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class);
        Gi gi = renderViewMetaData.k;
        this.f = new AtomicInteger(gi != null ? gi.a : telemetryConfig.getMaxTemplateEvents());
        this.g = new AtomicBoolean(false);
    }

    public final void a(int i) {
        short s;
        Context context = AbstractC4002fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Qa a = Pa.a(context, "im_telemetry_prefs");
            String str = E1.c;
            if (str == null) {
                str = "unknown";
            }
            Intrinsics.checkNotNullParameter("last_app_version", "key");
            if (Intrinsics.areEqual(a.a.getString("last_app_version", null), str)) {
                return;
            }
            Map a2 = a();
            switch (i) {
                case 8800:
                    s = 2365;
                    break;
                case 8801:
                default:
                    s = (short) i;
                    break;
                case 8802:
                    s = 2366;
                    break;
                case 8803:
                    s = 2367;
                    break;
                case 8804:
                    s = 2368;
                    break;
            }
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("VideoPlayerNotSupported", a2, EnumC4530zk.a);
            a.a("last_app_version", str, false);
        }
    }

    public final void b() {
        String a = a("WebViewLoadCalled");
        this.c = SystemClock.elapsedRealtime();
        Map a2 = a();
        if (Intrinsics.areEqual(a, "CompanionWebViewLoadCalled")) {
            long j = this.b;
            CoroutineScope coroutineScope = Hl.a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        } else {
            C4299r1 c4299r1 = this.a.j;
            if (c4299r1 != null) {
                long j2 = c4299r1.a.c;
                CoroutineScope coroutineScope2 = Hl.a;
                a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        a2.put("creativeId", this.a.g);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b(a, a2, EnumC4530zk.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (new org.json.JSONObject(r8).length() == 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String eventType, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.g.get()) {
            return;
        }
        if (this.f.decrementAndGet() <= 0) {
            this.g.set(true);
            Map a = a();
            long j = this.c;
            CoroutineScope coroutineScope = Hl.a;
            a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("TemplateEventDropped", a, EnumC4530zk.a);
            return;
        }
        if (str != null) {
            try {
            } catch (JSONException e) {
                Log.e(C4425vk.c, "Error parsing JSON: " + e);
            }
        }
        str2 = this.a.l;
        if (str2 == null) {
            str2 = "";
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, str2), TuplesKt.to("plType", String.valueOf(this.a.a.f)), TuplesKt.to("impressionId", this.a.c), TuplesKt.to("markupType", this.a.b), TuplesKt.to("networkType", F5.g()));
        if (str != null) {
            mutableMapOf.put("payload", str);
        }
        if (this.a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.a.d);
        }
        C4425vk.b(eventType, mutableMapOf, EnumC4530zk.b);
        str = null;
        str2 = this.a.l;
        if (str2 == null) {
        }
        Map mutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, str2), TuplesKt.to("plType", String.valueOf(this.a.a.f)), TuplesKt.to("impressionId", this.a.c), TuplesKt.to("markupType", this.a.b), TuplesKt.to("networkType", F5.g()));
        if (str != null) {
        }
        if (this.a.d.length() > 0) {
        }
        C4425vk.b(eventType, mutableMapOf2, EnumC4530zk.b);
    }

    public final void a(boolean z, short s) {
        String a = a("WebViewRenderProcessGoneEvent");
        String str = this.a.l;
        if (str == null) {
            str = "";
        }
        Pair pair = TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, str);
        long j = this.c;
        CoroutineScope coroutineScope = Hl.a;
        Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - j)), TuplesKt.to("source", "render_view_" + this.a.a.e), TuplesKt.to("isCrashed", Boolean.valueOf(z)), TuplesKt.to("creativeId", this.a.g), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b(a, mutableMapOf, EnumC4530zk.a);
    }

    public final void a(long j, Short sh) {
        Map a = a();
        CoroutineScope coroutineScope = Hl.a;
        a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (sh != null) {
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sh.shortValue()));
        }
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("HtmlUrlPrefetchCompleted", a, EnumC4530zk.a);
    }

    public final Map a() {
        String str = this.a.l;
        if (str == null) {
            str = "";
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, str), TuplesKt.to("plType", String.valueOf(this.a.a.f)), TuplesKt.to("plId", String.valueOf(this.a.a.a)), TuplesKt.to("adType", String.valueOf(this.a.a.e)), TuplesKt.to("markupType", this.a.b), TuplesKt.to("networkType", F5.g()), TuplesKt.to("retryCount", String.valueOf(this.a.e)), TuplesKt.to("creativeType", this.a.f), TuplesKt.to("adPosition", String.valueOf(this.a.i)), TuplesKt.to("isRewarded", String.valueOf(this.a.h)), TuplesKt.to("impressionId", this.a.c));
        if (this.a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.a.d);
        }
        return mutableMapOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String a(String str) {
        if (!Intrinsics.areEqual(this.a.l, "default")) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}
