package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٵ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0646 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f1306;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List f1307;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f1305 = new HashSet();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f1304 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f1303 = 0;

    public C0646(List list, int i) {
        this.f1307 = list;
        this.f1306 = i;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4125(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Number ? ((Number) obj).doubleValue() == 0.0d : obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4128(Collection collection) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("tA==\n", "72HOrhXn9A8=\n"));
        boolean z = true;
        for (Object obj : collection) {
            if (!m4125(obj)) {
                if (!z) {
                    sb.append(StringFog.decrypt("8g==\n", "3su7nZTABtk=\n"));
                }
                sb.append(m4127(obj));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("vA==\n", "4WbrIgHGUtg=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4129(Map map) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("UA==\n", "K/TCwNulkCM=\n"));
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!m4125(entry.getValue())) {
                if (!z) {
                    sb.append(StringFog.decrypt("QA==\n", "bBvC+VoJpfM=\n"));
                }
                sb.append(m4126(String.valueOf(entry.getKey())));
                sb.append(StringFog.decrypt("Qw==\n", "eeJNhXSuqVg=\n"));
                sb.append(m4127(entry.getValue()));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("AQ==\n", "fNjiL7xRpOg=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4126(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("vg==\n", "nNRFuvogPX4=\n"));
        sb.append(str.replace(StringFog.decrypt("lA==\n", "yO8owXWbvs4=\n"), StringFog.decrypt("eqQ=\n", "Jvjm2M7ogEA=\n")).replace(StringFog.decrypt("TA==\n", "bhPLYMD537Y=\n"), StringFog.decrypt("4Js=\n", "vLme45C1TrY=\n")).replace("\n", StringFog.decrypt("5wg=\n", "u2Z8lFNZ9Zc=\n")).replace("\r", StringFog.decrypt("BBc=\n", "WGXbWIbhWuM=\n")).replace("\t", StringFog.decrypt("gIo=\n", "3P7QBzrWovk=\n")));
        return AbstractC1293.m4543("mg==\n", "uLMXCX36zsE=\n", sb);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4127(Object obj) {
        String m4126;
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        } else if (obj instanceof AtomicReference) {
            obj = ((AtomicReference) obj).get();
        }
        if (obj == null) {
            return StringFog.decrypt("kOC9EA==\n", "/pXRfHaE1Ww=\n");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 30) {
                if (this.f1304.contains(str)) {
                    return StringFog.decrypt("yOjJ/7NAoQ==\n", "6tStisN+g9k=\n");
                }
                this.f1304.add(str);
            }
            return m4126(str);
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
            if (obj instanceof Character) {
                return m4126(String.valueOf(obj));
            }
            int i = 0;
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                while (i < jSONArray.length()) {
                    Object opt = jSONArray.opt(i);
                    if (opt != null) {
                        arrayList.add(opt);
                    }
                    i++;
                }
                return m4128((Collection) arrayList);
            }
            String str2 = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next, null));
                }
                return m4129((Map) hashMap);
            }
            if (obj instanceof Map) {
                return m4129((Map) obj);
            }
            if (obj instanceof Collection) {
                return m4128((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < Array.getLength(obj)) {
                    arrayList2.add(Array.get(obj, i));
                    i++;
                }
                return m4128((Collection) arrayList2);
            }
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                HashMap hashMap2 = new HashMap();
                for (String str3 : bundle.keySet()) {
                    hashMap2.put(str3, bundle.get(str3));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("8iGMevzC8wmrOfFb5c3kFuwh/zvPx+EO6CHp\n", "iQPTGZCjgHo=\n"));
                sb.append(m4129((Map) hashMap2));
                return AbstractC1293.m4543("3A==\n", "oaezTAKTzeg=\n", sb);
            }
            if (obj instanceof SharedPreferences) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(StringFog.decrypt("AzpbECg3O/1aIiYgLDc66xxIdhYiMzrrFnthAGZ6atEceXASZmw=\n", "eBgEc0RWSI4=\n"));
                sb2.append(m4129(((SharedPreferences) obj).getAll()));
                return AbstractC1293.m4543("vQ==\n", "wJgQaKHp3eI=\n", sb2);
            }
            if (AbstractC1226.m4479(obj.getClass(), this.f1307)) {
                if (this.f1303 <= this.f1306 && !this.f1305.contains(obj)) {
                    this.f1305.add(obj);
                    this.f1303++;
                    StringBuilder sb3 = new StringBuilder(StringFog.decrypt("WkaudJYWJyUDXg==\n", "IWTxF/p3VFY=\n"));
                    sb3.append(m4126(obj.getClass().getSimpleName()));
                    try {
                        String obj2 = obj.toString();
                        if (!TextUtils.isEmpty(obj2)) {
                            String hexString = Integer.toHexString(obj.hashCode());
                            if (!obj2.equals(obj.getClass().getName() + StringFog.decrypt("FQ==\n", "VaUvwSufGTs=\n") + hexString)) {
                                if (!obj2.equals(obj.getClass().getSimpleName() + StringFog.decrypt("Lg==\n", "boDvp13zjdY=\n") + hexString)) {
                                    str2 = obj2;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb3.append(StringFog.decrypt("oBAsNAA2bArlXBRiVQ==\n", "jDJzQG9lGHg=\n"));
                        if (str2.length() > 30) {
                            if (this.f1304.contains(str2)) {
                                m4126 = StringFog.decrypt("yOjJ/7NAoQ==\n", "6tStisN+g9k=\n");
                                sb3.append(m4126);
                            } else {
                                this.f1304.add(str2);
                            }
                        }
                        m4126 = m4126(str2);
                        sb3.append(m4126);
                    }
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        for (Class<?> cls = obj.getClass(); cls != null && AbstractC1226.m4479(cls, this.f1307); cls = cls.getSuperclass()) {
                            arrayList3.addAll(Arrays.asList(cls.getDeclaredFields()));
                        }
                        Field[] fieldArr = (Field[]) arrayList3.toArray(new Field[0]);
                        int length = fieldArr.length;
                        while (i < length) {
                            Field field = fieldArr[i];
                            if (Modifier.isStatic(field.getModifiers())) {
                                Class<?> type = field.getType();
                                if (!type.isPrimitive()) {
                                    if (type == String.class) {
                                    }
                                }
                                i++;
                            }
                            field.setAccessible(true);
                            Object obj3 = field.get(obj);
                            if (obj3 instanceof WeakReference) {
                                obj3 = ((WeakReference) obj3).get();
                            } else if (obj3 instanceof AtomicReference) {
                                obj3 = ((AtomicReference) obj3).get();
                            }
                            if (!m4125(obj3)) {
                                sb3.append(StringFog.decrypt("2wM=\n", "9yFrdUAKQWM=\n"));
                                sb3.append(field.getName());
                                sb3.append(StringFog.decrypt("h0c=\n", "pX1j17hZU00=\n"));
                                sb3.append(m4127(obj3));
                            }
                            i++;
                        }
                    } catch (Throwable unused2) {
                    }
                    this.f1303--;
                    sb3.append(StringFog.decrypt("Ug==\n", "L7yP0CmZApU=\n"));
                    return sb3.toString();
                }
                return m4126(obj.getClass().getSimpleName() + StringFog.decrypt("aw==\n", "KwdP7o5EdrY=\n") + Integer.toHexString(obj.hashCode()));
            }
            return m4126(obj.getClass().getSimpleName() + StringFog.decrypt("cg==\n", "Mp24NWhU4GM=\n") + Integer.toHexString(obj.hashCode()));
        }
        return String.valueOf(obj);
    }
}
