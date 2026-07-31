package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4538a2;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4028gh {
    public static final Map a = MapsKt.mapOf(TuplesKt.to("revenue", "getRevenue"), TuplesKt.to("revenue_precision", "getRevenuePrecision"), TuplesKt.to(BrandSafetyEvent.ad, "getNetworkName"), TuplesKt.to("dsp_name", "getDspName"), TuplesKt.to(BrandSafetyEvent.l, "getAdUnitId"), TuplesKt.to("network_placement", "getNetworkPlacement"));
    public static final Map b = MapsKt.mapOf(TuplesKt.to("BANNER", "ban"), TuplesKt.to(BrandSafetyUtils.o, "ban"), TuplesKt.to(BrandSafetyUtils.n, "ban"), TuplesKt.to(BrandSafetyUtils.j, com.safedk.android.analytics.brandsafety.m.w), TuplesKt.to(BrandSafetyUtils.k, "rew"), TuplesKt.to("REWARDED_INTER", "rew"), TuplesKt.to("NATIVE", "nat"));

    public static final Pair b(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (StringsKt.startsWith$default(str, "obj_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "auto_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "dir_", false, 2, (Object) null)) {
                linkedHashMap2.put(str, value);
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public static final LinkedHashMap c(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        r1.remove(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashMap d(Map map, SignalsConfig.PublisherConfig config) {
        Object a2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (Map.Entry<String, String> entry : config.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null && (a2 = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, a2);
            }
        }
        for (Map.Entry<String, String> entry2 : config.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str = key2 + "_ban";
            String str2 = key2 + "_int";
            String str3 = key2 + "_rew";
            String str4 = key2 + "_nat";
            Object obj2 = map.get(str);
            Object a3 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = map.get(str2);
            Object a4 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = map.get(str3);
            Object a5 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = map.get(str4);
            Object a6 = obj5 != null ? a(obj5, value2) : null;
            if (a3 != null || a4 != null || a5 != null || a6 != null) {
                if (a4 != null) {
                    linkedHashMap2.remove(str2);
                }
                if (a5 != null) {
                    linkedHashMap2.remove(str3);
                }
                if (a6 != null) {
                    linkedHashMap2.remove(str4);
                }
                JSONArray jSONArray = new JSONArray();
                if (a3 == null) {
                    a3 = a(value2);
                }
                JSONArray put = jSONArray.put(a3);
                if (a4 == null) {
                    a4 = a(value2);
                }
                JSONArray put2 = put.put(a4);
                if (a5 == null) {
                    a5 = a(value2);
                }
                JSONArray put3 = put2.put(a5);
                if (a6 == null) {
                    a6 = a(value2);
                }
                linkedHashMap.put(key2, put3.put(a6));
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((String) entry3.getKey()) + "=" + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }

    public static final JSONObject a(JSONObject jSONObject, String str, int i) {
        String prefix = str;
        int i2 = i;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (i2 <= 0) {
            return jSONObject;
        }
        String[] strArr = {"ban", com.safedk.android.analytics.brandsafety.m.w, "rew", "nat"};
        int i3 = 0;
        while (i3 < 4) {
            String str2 = prefix + strArr[i3];
            JSONArray optJSONArray = jSONObject.optJSONArray(str2);
            if (optJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                String tsKey = b(str);
                long currentTimeMillis = System.currentTimeMillis() - (i2 * 1000);
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject != null && optJSONObject.has(tsKey)) {
                        Intrinsics.checkNotNullParameter(optJSONObject, "<this>");
                        Intrinsics.checkNotNullParameter(tsKey, "tsKey");
                        if (optJSONObject.optLong(tsKey, 0L) >= currentTimeMillis) {
                            jSONArray.put(optJSONObject);
                        }
                    }
                }
                jSONObject.put(str2, jSONArray);
            }
            i3++;
            prefix = str;
            i2 = i;
        }
        return jSONObject;
    }

    public static final Triple c(Map map, SignalsConfig.PublisherConfig config) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("dir_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new Triple("", null, "");
        }
        Triple a2 = a(map, config.getDirect().getAllowedKeys(), config.getDirect().getPrecision(), config.getDirect().getStrLen());
        JSONObject jSONObject = (JSONObject) a2.component1();
        List list = (List) a2.component2();
        List list2 = (List) a2.component3();
        jSONObject.put(b("dir_"), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.areEqual((String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it.next()) + " not supported");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it2.next()) + " invalid type");
        }
        String str3 = "dir_" + str2;
        linkedHashMap.put(str3, jSONObject);
        return new Triple(str3, jSONObject, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r10.isAssignableFrom(r9) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Triple b(Map map, SignalsConfig.PublisherConfig config) {
        boolean z;
        String str;
        Object obj;
        Object invoke;
        String str2;
        Class<?> cls;
        boolean z2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (map.containsKey("obj_max")) {
            Object obj2 = map.get("obj_max");
            z = false;
            if (obj2 != null) {
                Intrinsics.checkNotNullParameter(obj2, "<this>");
                cls = obj2.getClass();
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    Class<?> cls2 = Class.forName("com.applovin.mediation.MaxAd", false, classLoader);
                    if (!cls2.isInstance(obj2)) {
                    }
                    z2 = true;
                } catch (Throwable unused) {
                }
                if (z2) {
                    z = true;
                }
            }
            if (z) {
                Object obj3 = map.get("obj_max");
                Intrinsics.checkNotNull(obj3);
                Intrinsics.checkNotNullParameter(obj3, "<this>");
                try {
                    invoke = obj3.getClass().getMethod("getFormat", null).invoke(obj3, null);
                } catch (Exception unused2) {
                    str = null;
                }
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getLabel", null).invoke(invoke, null);
                    if (invoke2 instanceof String) {
                        str2 = (String) invoke2;
                        Map map2 = b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        str = (String) map2.get(str2);
                        if (str != null) {
                            Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid format for MaxAd object: " + obj3);
                            return new Triple("", null, "");
                        }
                        Intrinsics.checkNotNullParameter(obj3, "<this>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        JSONObject jSONObject = new JSONObject();
                        Class<?> cls3 = obj3.getClass();
                        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : config.getObj().getAllowedKeysAnd().entrySet()) {
                            String key = entry.getKey();
                            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
                            String str3 = (String) a.get(key);
                            if (str3 != null) {
                                try {
                                    obj = cls3.getMethod(str3, null).invoke(obj3, null);
                                } catch (Exception unused3) {
                                    obj = null;
                                }
                                if (obj != null) {
                                    String name = value.getName();
                                    Object a2 = a(obj, value.getType(), config.getObj().getPrecision(), config.getObj().getStrLen());
                                    if (a2 == null) {
                                        a2 = a(value.getType());
                                    }
                                    jSONObject.put(name, a2);
                                } else {
                                    jSONObject.put(value.getName(), a(value.getType()));
                                }
                            }
                        }
                        jSONObject.put(b("obj_"), System.currentTimeMillis());
                        return new Triple("obj_" + str, jSONObject, str);
                    }
                }
                str2 = null;
                Map map22 = b;
                if (str2 == null) {
                }
                str = (String) map22.get(str2);
                if (str != null) {
                }
            }
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new Triple("", null, "");
        z2 = a(cls);
        if (z2) {
        }
        if (z) {
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new Triple("", null, "");
    }

    public static final Triple a(Map map, SignalsConfig.PublisherConfig config) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Object obj = map.get("auto_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            map.toString();
            return new Triple("", null, "");
        }
        JSONObject jSONObject = (JSONObject) a(map, c(config.getAuto().getAllowedKeys()), config.getAuto().getPrecision(), config.getAuto().getStrLen()).component1();
        jSONObject.put(b("auto_"), System.currentTimeMillis());
        return new Triple("auto_" + str2, jSONObject, str2);
    }

    public static final boolean a(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter("com.applovin.mediation.MaxAd", "targetFqcn");
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (Intrinsics.areEqual(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            Intrinsics.checkNotNull(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final Triple a(Map map, Map keys, int i, int i2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        JSONObject jSONObject = new JSONObject();
        Map mutableMap = MapsKt.toMutableMap(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : keys.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object a2 = a(obj, str2, i, i2);
                if (a2 != null) {
                    jSONObject.put(str, a2);
                    mutableMap.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new Triple(jSONObject, CollectionsKt.toList(mutableMap.keySet()), arrayList);
    }

    public static final JSONObject b(JSONObject jSONObject, SignalsConfig.PublisherConfig config) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (jSONObject.toString().length() <= config.getPayloadSize()) {
            return jSONObject;
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        Lazy lazy = AbstractC3861aa.a;
        AbstractC3861aa.a(new Q2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final String b(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (Intrinsics.areEqual(prefix, "auto_")) {
            return "auto_sts";
        }
        return Intrinsics.areEqual(prefix, "obj_") ? "obj_ts" : "dir_ts";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(Object obj, String type, int i, int i2) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                if (type.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (type.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double doubleValue = number.doubleValue();
                    if (Math.abs(doubleValue) <= Double.MAX_VALUE) {
                        int coerceIn = RangesKt.coerceIn(i, 0, 15);
                        if (coerceIn == 0) {
                            doubleValue = doubleValue > 0.0d ? Math.floor(doubleValue) : Math.ceil(doubleValue);
                        } else {
                            doubleValue = BigDecimal.valueOf(doubleValue).movePointRight(coerceIn).setScale(0, RoundingMode.DOWN).movePointLeft(coerceIn).doubleValue();
                        }
                    }
                    return Double.valueOf(doubleValue);
                }
                return null;
            case -891985903:
                if (type.equals("string")) {
                    String value = obj instanceof String ? (String) obj : null;
                    if (value == null) {
                        return null;
                    }
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.length() <= i2) {
                        return value;
                    }
                    String substring = value.substring(0, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    return substring;
                }
                return null;
            case 104431:
                if (type.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals(Constants.LONG)) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public static final JSONObject a(JSONObject jSONObject, String key, JSONObject newObj, int i) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newObj, "newObj");
        JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        optJSONArray.put(newObj);
        while (true) {
            Intrinsics.checkNotNullParameter(optJSONArray, "<this>");
            if (optJSONArray.length() > i) {
                optJSONArray.remove(0);
            } else {
                jSONObject.put(key, optJSONArray);
                return jSONObject;
            }
        }
    }

    public static final void a(JSONObject jSONObject, JSONObject cachedJson, String formatKey, String prefix, Set allowedKeys) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(cachedJson, "cachedJson");
        Intrinsics.checkNotNullParameter(formatKey, "formatKey");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(allowedKeys, "allowedKeys");
        JSONArray optJSONArray = cachedJson.optJSONArray(prefix + formatKey);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        Iterator it = allowedKeys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Object opt = optJSONObject.opt(str);
                    if (opt == null) {
                        opt = C4538a2.f;
                    }
                    jSONArray.put(opt);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(str);
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            jSONObject.put(str, optJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        if (r14.equals("string") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        r15 = r9.optString(r13, com.ironsource.C4538a2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        if (r14.equals("stringf") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map a(Map map, JSONObject cachedJson, String prefix, String format, Map configKeys) {
        JSONArray jSONArray;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArray2;
        Object opt;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(cachedJson, "cachedJson");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(configKeys, "configKeys");
        Map mutableMap = MapsKt.toMutableMap(configKeys);
        mutableMap.put(b(prefix), Constants.LONG);
        JSONArray optJSONArray = cachedJson.optJSONArray(prefix + format);
        if (optJSONArray != null) {
            IntRange until = RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = until.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(((IntIterator) it).nextInt());
                if (optJSONObject != null) {
                    Sequence asSequence = CollectionsKt.asSequence(mutableMap.keySet());
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj : asSequence) {
                        String str = (String) obj;
                        String str2 = (String) configKeys.get(str);
                        Object obj2 = C4538a2.f;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1881759115:
                                    jSONArray2 = optJSONArray;
                                    break;
                                case -1325958191:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals("double")) {
                                        obj2 = Double.valueOf(optJSONObject.optDouble(str, Double.parseDouble(C4538a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                        break;
                                    } else {
                                        obj2 = opt;
                                        break;
                                    }
                                case -891985903:
                                    jSONArray2 = optJSONArray;
                                    break;
                                case 104431:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                                        obj2 = Integer.valueOf(optJSONObject.optInt(str, Integer.parseInt(C4538a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                                case 3029738:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals("bool")) {
                                        obj2 = Boolean.valueOf(optJSONObject.optBoolean(str, Boolean.parseBoolean(C4538a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                                case 3327612:
                                    if (str2.equals(Constants.LONG)) {
                                        obj2 = Long.valueOf(optJSONObject.optLong(str, Long.parseLong(C4538a2.f)));
                                        jSONArray2 = optJSONArray;
                                        break;
                                    }
                                default:
                                    jSONArray2 = optJSONArray;
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                            }
                            linkedHashMap.put(obj, obj2);
                            optJSONArray = jSONArray2;
                        }
                        jSONArray2 = optJSONArray;
                        opt = optJSONObject.opt(str);
                        if (opt == null) {
                        }
                        linkedHashMap.put(obj, obj2);
                        optJSONArray = jSONArray2;
                    }
                    jSONArray = optJSONArray;
                } else {
                    jSONArray = optJSONArray;
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
                optJSONArray = jSONArray;
            }
            if (!arrayList.isEmpty()) {
                map.put(prefix + format, arrayList);
            }
        }
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r3.equals("string") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        return (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
    
        if (r3.equals("stringf") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Object obj, String type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                break;
            case -1325958191:
                if (type.equals("double")) {
                    if (obj instanceof Double) {
                        return (Double) obj;
                    }
                    if (obj instanceof Integer) {
                        return Double.valueOf(((Number) obj).intValue());
                    }
                    if (obj instanceof Float) {
                        return Double.valueOf(((Number) obj).floatValue());
                    }
                    return null;
                }
                return null;
            case -891985903:
                break;
            case 104431:
                if (type.equals(com.safedk.android.analytics.brandsafety.m.w) && (obj instanceof Integer)) {
                    return (Integer) obj;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals(Constants.LONG) && (obj instanceof Long)) {
                    return (Long) obj;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                type.equals("stringf");
                return C4538a2.f;
            case -1325958191:
                if (type.equals("double")) {
                    return Double.valueOf(Double.parseDouble(C4538a2.f));
                }
                return C4538a2.f;
            case -891985903:
                type.equals("string");
                return C4538a2.f;
            case 104431:
                if (type.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                    return Integer.valueOf(Integer.parseInt(C4538a2.f));
                }
                return C4538a2.f;
            case 3029738:
                type.equals("bool");
                return C4538a2.f;
            case 3327612:
                if (type.equals(Constants.LONG)) {
                    return Long.valueOf(Long.parseLong(C4538a2.f));
                }
                return C4538a2.f;
            default:
                return C4538a2.f;
        }
    }

    public static final JSONObject a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                Unit unit = Unit.INSTANCE;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final LinkedHashMap a(JSONObject jSONObject, SignalsConfig.PublisherConfig config) {
        Object valueOf;
        Object valueOf2;
        JSONObject jSONObject2 = jSONObject;
        Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : config.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            valueOf2 = Double.valueOf(jSONObject2.optDouble(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case -891985903:
                        if (value.equals("string")) {
                            valueOf2 = jSONObject2.optString(key);
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 104431:
                        if (value.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                            valueOf2 = Integer.valueOf(jSONObject2.optInt(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3029738:
                        if (value.equals("bool")) {
                            valueOf2 = Boolean.valueOf(jSONObject2.optBoolean(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3327612:
                        if (value.equals(Constants.LONG)) {
                            valueOf2 = Long.valueOf(jSONObject2.optLong(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        for (Map.Entry<String, String> entry2 : config.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray optJSONArray = jSONObject2.optJSONArray(key2);
            if (optJSONArray != null) {
                String[] strArr = {"ban", com.safedk.android.analytics.brandsafety.m.w, "rew", "nat"};
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String str = key2 + "_" + strArr[i];
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                valueOf = Double.valueOf(optJSONArray.optDouble(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case -891985903:
                            if (value2.equals("string")) {
                                valueOf = optJSONArray.optString(i);
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 104431:
                            if (value2.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                                valueOf = Integer.valueOf(optJSONArray.optInt(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3029738:
                            if (value2.equals("bool")) {
                                valueOf = Boolean.valueOf(optJSONArray.optBoolean(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3327612:
                            if (value2.equals(Constants.LONG)) {
                                valueOf = Long.valueOf(optJSONArray.optLong(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            jSONObject2 = jSONObject;
        }
        return linkedHashMap;
    }
}
