package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4000fh {
    public static Qg d;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(C4000fh.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), Reflection.property1(new PropertyReference1Impl(C4000fh.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};
    public static final C4000fh a = new C4000fh();
    public static final List c = CollectionsKt.listOf((Object[]) new String[]{"ban", com.safedk.android.analytics.brandsafety.m.w, "rew", "nat"});
    public static final M1 e = new M1(new JSONObject(), new Function0() { // from class: com.inmobi.media.fh$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return C4000fh.a();
        }
    }, true, true);
    public static final M1 f = new M1(new JSONObject(), new Function0() { // from class: com.inmobi.media.fh$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return C4000fh.f();
        }
    }, true, true);
    public static final Mutex g = MutexKt.Mutex$default(false, 1, null);

    public static final JSONObject a(C4000fh c4000fh) {
        c4000fh.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = a.b().keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next);
            if (StringsKt.startsWith$default(next, "obj_", false, 2, (Object) null) || StringsKt.startsWith$default(next, "auto_", false, 2, (Object) null) || StringsKt.startsWith$default(next, "dir_", false, 2, (Object) null)) {
                jSONObject.put(next, a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object b(C4000fh c4000fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3946dh c3946dh) {
        c4000fh.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Xb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple c2 = AbstractC4028gh.c(map, publisherConfig);
        String str = (String) c2.component1();
        JSONObject jSONObject = (JSONObject) c2.component2();
        String str2 = (String) c2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c4000fh.a(str2, "d_i_dep");
        Object a2 = c4000fh.a(AbstractC4028gh.a(c4000fh.b(), str, jSONObject, count), c3946dh);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static final Object c(C4000fh c4000fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3946dh c3946dh) {
        c4000fh.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Xb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getObj().getCount();
        Triple b2 = AbstractC4028gh.b(map, publisherConfig);
        String str = (String) b2.component1();
        JSONObject jSONObject = (JSONObject) b2.component2();
        String str2 = (String) b2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c4000fh.a(str2, "o_i_dep");
        Object a2 = c4000fh.a(AbstractC4028gh.a(c4000fh.b(), str, jSONObject, count), c3946dh);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static final JSONObject f() {
        a.getClass();
        Context context = AbstractC4002fj.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new Qg(context, "pub_signals_store");
            }
            Qg qg = d;
            if (qg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                qg = null;
            }
            String a2 = qg.a("imp_depth");
            if (a2 != null) {
                jSONObject = new JSONObject(a2);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap d() {
        JSONObject b2 = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = c;
        SignalsConfig.PublisherConfig c2 = c();
        for (String str : list) {
            AbstractC4028gh.a(AbstractC4028gh.a(AbstractC4028gh.a(linkedHashMap, b2, "obj_", str, AbstractC4028gh.c(allowedKeysAnd)), b2, "auto_", str, AbstractC4028gh.c(allowedKeys)), b2, "dir_", str, c2.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() {
        JSONObject b2 = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = b2.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next);
            if (!StringsKt.startsWith$default(next, "obj_", false, 2, (Object) null) && !StringsKt.startsWith$default(next, "auto_", false, 2, (Object) null) && !StringsKt.startsWith$default(next, "dir_", false, 2, (Object) null)) {
                jSONObject.put(next, b2.opt(next));
            }
        }
        for (String str : c) {
            a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                AbstractC4028gh.a(jSONObject, b2, str, "obj_", CollectionsKt.toSet(arrayList));
            }
            a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                AbstractC4028gh.a(jSONObject, b2, str, "auto_", CollectionsKt.toSet(arrayList2));
            }
            a.getClass();
            if (c().getDirect().getEnabled()) {
                AbstractC4028gh.a(jSONObject, b2, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(c().getObj(), "o_i_dep"), TuplesKt.to(c().getDirect(), "d_i_dep"), TuplesKt.to(c().getAuto(), "a_i_dep")})) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            String str2 = (String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                C4000fh c4000fh = a;
                c4000fh.getClass();
                JSONArray optJSONArray = ((JSONObject) f.getValue(c4000fh, b[1])).optJSONArray(str2);
                if (optJSONArray == null) {
                    Map map = AbstractC4028gh.a;
                    optJSONArray = new JSONArray();
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                }
                jSONObject.put(str2, optJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static SignalsConfig.PublisherConfig c() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getPublisher();
    }

    public final JSONObject b() {
        return (JSONObject) e.getValue(this, b[0]);
    }

    public static final Object a(C4000fh c4000fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3946dh c3946dh) {
        c4000fh.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple a2 = AbstractC4028gh.a(map, publisherConfig);
        String str = (String) a2.component1();
        JSONObject jSONObject = (JSONObject) a2.component2();
        String str2 = (String) a2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c4000fh.a(str2, "a_i_dep");
        Object a3 = c4000fh.a(AbstractC4028gh.a(c4000fh.b(), str, jSONObject, count), c3946dh);
        return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
    }

    public static final JSONObject a() {
        a.getClass();
        Context context = AbstractC4002fj.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new Qg(context, "pub_signals_store");
            }
            Qg qg = d;
            if (qg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                qg = null;
            }
            String a2 = qg.a("saved_signals");
            if (a2 != null) {
                jSONObject = new JSONObject(a2);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        try {
            SignalsConfig.PublisherConfig c2 = c();
            Map map = AbstractC4028gh.a;
            Intrinsics.checkNotNullParameter(c2, "<this>");
            if (!c2.getEnableMCO() && !c2.getEnableAB()) {
                Xb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(L9.e, null, null, new C3946dh(signals, c2, null), 3, null);
        } catch (Exception e2) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e2));
            Xb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0060, B:13:0x0064, B:14:0x006d), top: B:10:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        C3972eh c3972eh;
        int i;
        JSONObject jSONObject2;
        Mutex mutex;
        Qg qg;
        try {
            if (continuationImpl instanceof C3972eh) {
                c3972eh = (C3972eh) continuationImpl;
                int i2 = c3972eh.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3972eh.e = i2 - Integer.MIN_VALUE;
                    Object obj = c3972eh.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3972eh.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Context context = AbstractC4002fj.a;
                        if (context != null) {
                            a.getClass();
                            if (d == null) {
                                d = new Qg(context, "pub_signals_store");
                            }
                            Mutex mutex2 = g;
                            c3972eh.a = jSONObject;
                            c3972eh.b = mutex2;
                            c3972eh.e = 1;
                            if (mutex2.lock(null, c3972eh) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = c3972eh.b;
                    jSONObject2 = c3972eh.a;
                    ResultKt.throwOnFailure(obj);
                    qg = d;
                    if (qg == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        qg = null;
                    }
                    String value = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    qg.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    qg.a.a("saved_signals", value, true);
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    M1 m1 = e;
                    m1.c = m1.a.mo4828invoke();
                    Xb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
                    jSONObject2.toString();
                    return Unit.INSTANCE;
                }
            }
            qg = d;
            if (qg == null) {
            }
            String value2 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            qg.getClass();
            Intrinsics.checkNotNullParameter("saved_signals", "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            qg.a.a("saved_signals", value2, true);
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            M1 m12 = e;
            m12.c = m12.a.mo4828invoke();
            Xb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject2.toString();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c3972eh = new C3972eh(this, continuationImpl);
        Object obj2 = c3972eh.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3972eh.e;
        if (i != 0) {
        }
    }

    public static void a(JSONObject jSONObject, String key, JSONArray value) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        jSONObject.put(key, value);
        Context context = AbstractC4002fj.a;
        if (context != null) {
            a.getClass();
            if (d == null) {
                d = new Qg(context, "pub_signals_store");
            }
            jSONObject.toString();
            Qg qg = d;
            if (qg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                qg = null;
            }
            String value2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            qg.getClass();
            Intrinsics.checkNotNullParameter("imp_depth", "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            Qa qa = qg.a;
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa.a("imp_depth", value2, false);
            M1 m1 = f;
            m1.c = m1.a.mo4828invoke();
        }
    }

    public final void a(String adFormat, String key) {
        int i;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(key, "key");
        M1 m1 = f;
        m1.c = m1.a.mo4828invoke();
        JSONObject jSONObject = (JSONObject) m1.getValue(this, b[1]);
        JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            Map map = AbstractC4028gh.a;
            optJSONArray = new JSONArray();
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
        }
        int hashCode = adFormat.hashCode();
        if (hashCode == 97295) {
            if (adFormat.equals("ban")) {
                i = 0;
            }
            i = -1;
        } else if (hashCode == 104431) {
            if (adFormat.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                i = 1;
            }
            i = -1;
        } else if (hashCode != 108833) {
            if (hashCode == 112804 && adFormat.equals("rew")) {
                i = 2;
            }
            i = -1;
        } else {
            if (adFormat.equals("nat")) {
                i = 3;
            }
            i = -1;
        }
        if (i != -1) {
            optJSONArray.put(i, optJSONArray.optInt(i, 0) + 1);
            a(jSONObject, key, optJSONArray);
        }
    }
}
