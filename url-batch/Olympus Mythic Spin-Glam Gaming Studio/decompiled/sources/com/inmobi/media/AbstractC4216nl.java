package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4216nl {
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4242ol a() {
        Hh hh = AbstractC4477xj.a;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new C4242ol();
        }
        if (c()) {
            return new C4242ol();
        }
        HashMap hashMap = new HashMap();
        JSONObject a = Q9.a();
        String str = null;
        Iterator<String> keys = a != null ? a.keys() : null;
        if (keys != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", a.get(next));
                    hashMap.put(next, jSONObject);
                } catch (JSONException e) {
                    StringsKt.trimMargin$default(" Error in looping through publisher provided unif id " + e.getMessage() + "\n                                        " + a.get(next) + "\n                    ", null, 1, null);
                }
            }
        }
        JSONObject b = Q9.b();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    JSONArray jSONArray = b.getJSONArray("ufids");
                    int length = jSONArray.length();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i < length) {
                        try {
                            String string = jSONArray.getJSONObject(i).has("src") ? jSONArray.getJSONObject(i).getString("src") : str;
                            String string2 = jSONArray.getJSONObject(i).has("envelope") ? jSONArray.getJSONObject(i).getString("envelope") : str;
                            if (System.currentTimeMillis() > jSONArray.getJSONObject(i).getLong("expiry")) {
                                z2 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                hashMap.put(string, jSONObject2);
                                z3 = true;
                            }
                            i++;
                            str = null;
                            z2 = z2;
                        } catch (JSONException e2) {
                            e = e2;
                            z = z3;
                            e.getMessage();
                            b.toString();
                            if (!hashMap.isEmpty()) {
                            }
                        }
                    }
                    if (z2) {
                        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4189ml(null), 3, null);
                    }
                    z = z3;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        if (!hashMap.isEmpty()) {
            return new C4242ol();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj : hashMap.values()) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            jSONArray2.put((JSONObject) obj);
        }
        return new C4242ol(jSONArray2.toString(), z);
    }

    public static boolean b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
        } catch (JSONException unused) {
        }
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean c(JSONObject ufids) {
        boolean z;
        Intrinsics.checkNotNullParameter(ufids, "ufids");
        try {
            if (ufids.has("ufids")) {
                JSONArray jSONArray = ufids.getJSONArray("ufids");
                int length = jSONArray.length();
                z = true;
                for (int i = 0; i < length; i++) {
                    try {
                        z &= System.currentTimeMillis() <= jSONArray.getJSONObject(i).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(ufids);
                        return !z;
                    }
                }
            } else {
                z = true;
            }
        } catch (JSONException unused2) {
            z = true;
        }
        return !z;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject b = Q9.b();
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    JSONArray jSONArray2 = b.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                b.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        C4458x1 c4458x1 = Yk.a;
        Boolean bool = c4458x1 != null ? c4458x1.c : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        if (booleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return booleanValue;
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        short s;
        String message = error != null ? error.getMessage() : null;
        if (Intrinsics.areEqual(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = Intrinsics.areEqual(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("FetchCallbackFailure", mutableMapOf, EnumC4530zk.a);
        }
        AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.nl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4216nl.b(InMobiUnifiedIdInterface.this, jSONObject, error);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        hashMap.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                hashMap.put(jSONArray3.getJSONObject(i2).getString("src"), jSONArray3.getJSONObject(i2));
            }
        }
        Collection values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
