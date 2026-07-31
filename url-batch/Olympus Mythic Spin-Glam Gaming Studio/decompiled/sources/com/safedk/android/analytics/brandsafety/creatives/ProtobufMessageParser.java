package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ProtobufMessageParser {
    private static final String a = "ProtobufMessageParser";
    private static final String b = "array";
    private static final String c = "string";
    private static final String d = "undefined_key";
    private byte[] f = null;
    private int e = 0;

    public static class ProtobufParserException extends Exception {
    }

    private ProtobufMessageParser() {
    }

    public static JSONObject a(byte[] bArr, String str) {
        return new ProtobufMessageParser().b(bArr, str);
    }

    private JSONObject b(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0 || str == null || str.isEmpty()) {
            Logger.d(a, "parse protobuf message - invalid input");
            return new JSONObject();
        }
        this.e = 0;
        this.f = bArr;
        JSONObject jSONObject = new JSONObject();
        try {
            a(new JSONObject(str), jSONObject, bArr.length);
            return jSONObject;
        } catch (ProtobufParserException | JSONException e) {
            Logger.d(a, "parse protobuf message - invalid json template: ", str);
            return jSONObject;
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, int i) throws ProtobufParserException {
        while (this.e != i) {
            int c2 = c();
            String valueOf = String.valueOf(b(c2));
            int c3 = c(c2);
            Object opt = jSONObject.opt(valueOf);
            if (c3 == 0) {
                b(jSONObject2, opt);
            } else if (c3 == 1) {
                b();
            } else if (c3 == 2) {
                a(jSONObject2, opt);
            } else if (c3 == 5) {
                a();
            }
        }
    }

    private String a(JSONArray jSONArray) {
        String optString = jSONArray.optString(0);
        if (optString == null || optString.isEmpty()) {
            return d;
        }
        return optString;
    }

    private String b(JSONArray jSONArray) {
        return jSONArray.optString(1, "");
    }

    private Object c(JSONArray jSONArray) {
        return jSONArray.opt(2);
    }

    private String a(int i) {
        if (this.e + i <= this.f.length) {
            return new String(this.f, this.e, i);
        }
        return "";
    }

    private JSONArray a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        a(jSONObject, str, optJSONArray);
        return optJSONArray;
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
            }
        }
    }

    private void a(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        JSONObject jSONObject2;
        String str;
        int c2 = c();
        JSONArray jSONArray = null;
        if (!(obj instanceof JSONArray)) {
            jSONObject2 = jSONObject;
            str = null;
        } else {
            JSONArray jSONArray2 = (JSONArray) obj;
            str = a(jSONArray2);
            String b2 = b(jSONArray2);
            if (b2.equals(b)) {
                jSONArray = a(jSONObject, str);
                obj = c(jSONArray2);
                jSONObject2 = new JSONObject();
            } else if (!b2.equals(c)) {
                jSONObject2 = jSONObject;
            } else {
                obj = "";
                jSONObject2 = jSONObject;
            }
        }
        if (obj instanceof JSONObject) {
            if (jSONArray != null) {
                jSONArray.put(jSONObject2);
            }
            a((JSONObject) obj, jSONObject2, this.e + c2);
            return;
        }
        if (obj instanceof String) {
            String a2 = a(c2);
            if (jSONArray != null) {
                jSONArray.put(a2);
            } else if (str != null) {
                a(jSONObject, str, a2);
            }
        }
        this.e += c2;
    }

    private void b(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        int c2 = c();
        if (obj instanceof JSONArray) {
            a(jSONObject, a((JSONArray) obj), Integer.valueOf(c2));
        }
    }

    private void a() {
        this.e += 4;
    }

    private void b() {
        this.e += 8;
    }

    private int c() throws ProtobufParserException {
        byte d2;
        ArrayList arrayList = new ArrayList();
        do {
            d2 = d();
            arrayList.add(Byte.valueOf(d2));
        } while (!a(d2));
        Collections.reverse(arrayList);
        int i = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i = (i << 7) | ((byte) (((Byte) it.next()).byteValue() & Byte.MAX_VALUE));
        }
        return i;
    }

    private byte d() throws ProtobufParserException {
        int i = this.e;
        if (i >= 0) {
            byte[] bArr = this.f;
            if (i < bArr.length) {
                this.e = i + 1;
                return bArr[i];
            }
        }
        throw new ProtobufParserException();
    }

    private boolean a(byte b2) {
        return (b2 & 128) == 0;
    }

    private int b(int i) {
        return i >> 3;
    }

    private int c(int i) {
        return i & 7;
    }
}
