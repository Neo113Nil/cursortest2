package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4425vk implements Zf {
    public static final C4425vk a = new C4425vk();
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);
    public static final String c;
    public static final List d;
    public static final Lazy e;
    public static final AtomicBoolean f;
    public static C4358t6 g;
    public static volatile Ik h;
    public static final Function1 i;
    public static Ek j;

    static {
        String simpleName = C4425vk.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        c = simpleName;
        List mutableListOf = CollectionsKt.mutableListOf("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "BannerSetBannerSizeUsed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed", "HtmlUrlPrefetchStarted", "HtmlUrlPrefetchCompleted", "InAppBrowserLoaderShown", "InAppBrowserLoaderHidden");
        d = mutableListOf;
        e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4425vk.c();
            }
        });
        f = new AtomicBoolean(false);
        C4399uk c4399uk = new C4399uk();
        i = new Function1() { // from class: com.inmobi.media.vk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4425vk.a((N2) obj);
            }
        };
        TelemetryConfig b2 = b();
        h = new Ik(new C4478xk(b2.getEnabled(), b2.getAssetReporting().isImageEnabled(), b2.getAssetReporting().isGifEnabled(), b2.getAssetReporting().isVideoEnabled(), b2.getDisableAllGeneralEvents(), b2.getPriorityEventsList(), b2.getSamplingFactor()), CollectionsKt.toList(mutableListOf));
        AbstractC4015g4.a(TelemetryCategory.TELEMETRY, c4399uk);
    }

    public static final Unit a(N2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                    Ek ek = j;
                    if (ek != null) {
                        Map map = it.c;
                        Object obj = map != null ? map.get("data") : null;
                        ek.a("CrashEventOccurred", obj instanceof C3882b5 ? (C3882b5) obj : null);
                        break;
                    }
                    break;
                case 151:
                    Ek ek2 = j;
                    if (ek2 != null) {
                        Map map2 = it.c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        C4455wo c4455wo = obj2 instanceof C4455wo ? (C4455wo) obj2 : null;
                        if (c4455wo != null && Hl.a(c4455wo)) {
                            F5.a.getClass();
                            if (!F5.t()) {
                                ek2.a("MainThreadBlockedEvent", c4455wo);
                                break;
                            }
                        }
                    }
                    break;
                case 152:
                    Ek ek3 = j;
                    if (ek3 != null) {
                        Map map3 = it.c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        ek3.a(obj3 instanceof D1 ? (D1) obj3 : null);
                        break;
                    }
                    break;
            }
        } else {
            f.set(false);
            C4358t6 c4358t6 = g;
            if (c4358t6 != null) {
                c4358t6.f.set(false);
                c4358t6.g.set(true);
                Job job = c4358t6.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                c4358t6.j = null;
                c4358t6.i = null;
            }
            g = null;
            j = null;
            ((Kc) AbstractC4002fj.e.getValue()).a(i);
        }
        return Unit.INSTANCE;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC4530zk telemetryEventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4372tk(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final Ck c() {
        return new Ck(AbstractC4334s9.b());
    }

    public static TelemetryConfig b() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class);
    }

    public static boolean a(String eventType, Map keyValueMap, EnumC4530zk telemetryEventType) {
        boolean a2;
        Ik ik = h;
        if (ik == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
            ik = null;
        }
        ik.getClass();
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (ik.a.a) {
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a2 = ik.b.a(eventType, keyValueMap);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = true;
            }
        } else {
            a2 = false;
        }
        return !a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Dk dk, ContinuationImpl continuationImpl) {
        C4319rk c4319rk;
        int i2;
        Dk dk2;
        int i3;
        int intValue;
        String str;
        Object a2;
        if (continuationImpl instanceof C4319rk) {
            c4319rk = (C4319rk) continuationImpl;
            int i4 = c4319rk.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4319rk.e = i4 - Integer.MIN_VALUE;
                Object obj = c4319rk.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4319rk.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int maxEventsToPersist = b().getMaxEventsToPersist();
                    Ck ck = (Ck) e.getValue();
                    c4319rk.a = dk;
                    c4319rk.b = maxEventsToPersist;
                    c4319rk.e = 1;
                    Object a3 = ck.a(c4319rk);
                    if (a3 != coroutine_suspended) {
                        dk2 = dk;
                        i3 = maxEventsToPersist;
                        obj = a3;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    i3 = c4319rk.b;
                    dk2 = c4319rk.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    intValue = c4319rk.b;
                    dk2 = c4319rk.a;
                    ResultKt.throwOnFailure(obj);
                    int a4 = Ak.a() + intValue;
                    if (a4 != -1) {
                        Ak.b = a4;
                        Qa qa = Ak.a;
                        if (qa != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            qa.a("count", a4, false);
                        }
                    }
                    Ck ck2 = (Ck) e.getValue();
                    c4319rk.a = null;
                    c4319rk.e = 3;
                    C4308r9 c4308r9 = ck2.b;
                    String str2 = ck2.a;
                    dk2.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventType", dk2.a);
                    str = dk2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues.put("payload", str);
                    contentValues.put("eventSource", dk2.e);
                    contentValues.put("ts", String.valueOf(dk2.c));
                    a2 = c4308r9.a(str2, contentValues, 4, c4319rk);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                }
                intValue = (((Number) obj).intValue() + 1) - i3;
                if (intValue > 0) {
                    Ck ck3 = (Ck) e.getValue();
                    c4319rk.a = dk2;
                    c4319rk.b = intValue;
                    c4319rk.e = 2;
                }
                Ck ck22 = (Ck) e.getValue();
                c4319rk.a = null;
                c4319rk.e = 3;
                C4308r9 c4308r92 = ck22.b;
                String str22 = ck22.a;
                dk2.getClass();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("eventType", dk2.a);
                str = dk2.b;
                if (str == null) {
                }
                contentValues2.put("payload", str);
                contentValues2.put("eventSource", dk2.e);
                contentValues2.put("ts", String.valueOf(dk2.c));
                a2 = c4308r92.a(str22, contentValues2, 4, c4319rk);
                if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
            }
        }
        c4319rk = new C4319rk(this, continuationImpl);
        Object obj2 = c4319rk.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4319rk.e;
        if (i2 != 0) {
        }
        intValue = (((Number) obj2).intValue() + 1) - i3;
        if (intValue > 0) {
        }
        Ck ck222 = (Ck) e.getValue();
        c4319rk.a = null;
        c4319rk.e = 3;
        C4308r9 c4308r922 = ck222.b;
        String str222 = ck222.a;
        dk2.getClass();
        ContentValues contentValues22 = new ContentValues();
        contentValues22.put("eventType", dk2.a);
        str = dk2.b;
        if (str == null) {
        }
        contentValues22.put("payload", str);
        contentValues22.put("eventSource", dk2.e);
        contentValues22.put("ts", String.valueOf(dk2.c));
        a2 = c4308r922.a(str222, contentValues22, 4, c4319rk);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    public final void a() {
        if (f.get()) {
            C4121k6 eventConfig = b().getEventConfig();
            eventConfig.k = b().getTelemetryUrl();
            C4358t6 c4358t6 = g;
            if (c4358t6 == null) {
                g = new C4358t6(TelemetryCategory.TELEMETRY, (Ck) e.getValue(), this, eventConfig, this);
            } else {
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c4358t6.i = eventConfig;
            }
            C4358t6 c4358t62 = g;
            if (c4358t62 != null) {
                c4358t62.a(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4267pk c4267pk;
        Object obj;
        int i2;
        if (continuationImpl instanceof C4267pk) {
            c4267pk = (C4267pk) continuationImpl;
            int i3 = c4267pk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4267pk.c = i3 - Integer.MIN_VALUE;
                obj = c4267pk.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4267pk.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ck ck = (Ck) e.getValue();
                    c4267pk.c = 1;
                    obj = ck.a(c4267pk);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    a();
                }
                return Unit.INSTANCE;
            }
        }
        c4267pk = new C4267pk(this, continuationImpl);
        obj = c4267pk.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4267pk.c;
        if (i2 != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.Zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4293qk c4293qk;
        int i2;
        int a2;
        List<Dk> mutableList;
        String str;
        if (continuation instanceof C4293qk) {
            c4293qk = (C4293qk) continuation;
            int i3 = c4293qk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4293qk.c = i3 - Integer.MIN_VALUE;
                Object obj = c4293qk.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4293qk.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    F5.a.getClass();
                    if (F5.n() == 1) {
                        a2 = b().getWifiConfig().a();
                    } else {
                        a2 = b().getMobileConfig().a();
                    }
                    Ck ck = (Ck) e.getValue();
                    c4293qk.c = 1;
                    obj = ck.b(a2, c4293qk);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                mutableList = CollectionsKt.toMutableList((Collection) obj);
                if (!a("DatabaseMaxLimitReachedV2", MapsKt.emptyMap(), EnumC4530zk.a) && Ak.a() > 0) {
                    Ak.a();
                    int a3 = Ak.a();
                    Dk dk = new Dk("DatabaseMaxLimitReachedV2", null, "sdk");
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("eventId", uuid), TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), TuplesKt.to("samplingRate", 100), TuplesKt.to("isTemplateEvent", Boolean.FALSE), TuplesKt.to("eventLostCount", Integer.valueOf(a3)));
                    Intrinsics.checkNotNull(hashMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    String payload = new JSONObject(hashMapOf).toString();
                    Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    dk.b = payload;
                    Ak.c = Boxing.boxInt(dk.d);
                    mutableList.add(dk);
                }
                if (!mutableList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.boxInt(((Dk) it.next()).d));
                }
                try {
                    String str2 = AbstractC4002fj.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("im-accid", str2), TuplesKt.to("version", "4.0.0"), TuplesKt.to("mk-version", AbstractC4030gj.a()), TuplesKt.to("u-appbid", E1.a), TuplesKt.to("tp", AbstractC4030gj.b));
                    String str3 = AbstractC4030gj.a;
                    if (str3 != null) {
                        mutableMapOf.put("tp-v", str3);
                    }
                    Intrinsics.checkNotNull(mutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    JSONObject jSONObject = new JSONObject(mutableMapOf);
                    JSONArray jSONArray = new JSONArray();
                    for (Dk dk2 : mutableList) {
                        String str4 = dk2.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (StringsKt.trim(str4).toString().length() > 0) {
                            String str5 = dk2.b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            JSONObject jSONObject2 = new JSONObject(str5);
                            jSONObject2.put("dts", dk2.c);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("payload", jSONArray);
                    str = jSONObject.toString();
                } catch (JSONException unused) {
                    str = null;
                }
                if (str != null) {
                    return new C4173m6(str, arrayList);
                }
                return null;
            }
        }
        c4293qk = new C4293qk(this, (ContinuationImpl) continuation);
        Object obj2 = c4293qk.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4293qk.c;
        if (i2 != 0) {
        }
        mutableList = CollectionsKt.toMutableList((Collection) obj2);
        if (!a("DatabaseMaxLimitReachedV2", MapsKt.emptyMap(), EnumC4530zk.a)) {
            Ak.a();
            int a32 = Ak.a();
            Dk dk3 = new Dk("DatabaseMaxLimitReachedV2", null, "sdk");
            String uuid2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
            HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("eventId", uuid2), TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), TuplesKt.to("samplingRate", 100), TuplesKt.to("isTemplateEvent", Boolean.FALSE), TuplesKt.to("eventLostCount", Integer.valueOf(a32)));
            Intrinsics.checkNotNull(hashMapOf2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload2 = new JSONObject(hashMapOf2).toString();
            Intrinsics.checkNotNullExpressionValue(payload2, "toString(...)");
            Intrinsics.checkNotNullParameter(payload2, "payload");
            dk3.b = payload2;
            Ak.c = Boxing.boxInt(dk3.d);
            mutableList.add(dk3);
        }
        if (!mutableList.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ContinuationImpl continuationImpl) {
        C4345sk c4345sk;
        int i2;
        if (continuationImpl instanceof C4345sk) {
            c4345sk = (C4345sk) continuationImpl;
            int i3 = c4345sk.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4345sk.b = i3 - Integer.MIN_VALUE;
                Object obj = c4345sk.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4345sk.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!f.getAndSet(true)) {
                        C4425vk c4425vk = a;
                        c4345sk.b = 1;
                        if (c4425vk.a((ContinuationImpl) c4345sk) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 150, 152, 151}, i);
                j = new Ek(b());
                return Unit.INSTANCE;
            }
        }
        c4345sk = new C4345sk(continuationImpl);
        Object obj2 = c4345sk.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4345sk.b;
        if (i2 != 0) {
        }
        ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 150, 152, 151}, i);
        j = new Ek(b());
        return Unit.INSTANCE;
    }
}
