package yads;

import com.ironsource.O6;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class bp {
    public final xr1 a;
    public final Json b;

    public bp() {
        xr1 xr1Var = new xr1();
        Json json = ad1.a;
        this.a = xr1Var;
        this.b = json;
    }

    public final ba a(JSONObject jSONObject) {
        String string;
        try {
            try {
                Json json = ad1.a;
                string = jSONObject.getString("ad_unit_id");
            } catch (JSONException unused) {
                Json json2 = ad1.a;
                string = jSONObject.getString("block_id");
                if (string == null || string.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string)) {
                    throw new JSONException("Json value can not be null or empty");
                }
            }
        } catch (JSONException unused2) {
            boolean z = ob1.a;
        }
        if (string == null || string.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(O6.E1);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                er1 b = this.a.b(optJSONArray.getJSONObject(i));
                if (b != null) {
                    arrayList.add(b);
                }
            }
            if (!arrayList.isEmpty()) {
                return new ba(string, jSONObject.toString(), arrayList);
            }
        }
        return null;
    }

    public final ap b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        vs1 vs1Var;
        String jSONObject3;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    ba a = a(optJSONArray.getJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            if (jSONObject2 != null && (jSONObject3 = jSONObject2.toString()) != null) {
                Json json = this.b;
                json.getSerializersModule();
                vs1Var = (vs1) json.decodeFromString(BuiltinSerializersKt.getNullable(vs1.CREATOR.serializer()), jSONObject3);
                if (arrayList.isEmpty() || vs1Var != null) {
                    return new ap(arrayList, vs1Var);
                }
                return null;
            }
            vs1Var = null;
            if (arrayList.isEmpty()) {
            }
            return new ap(arrayList, vs1Var);
        } catch (JSONException unused2) {
            boolean z = ob1.a;
            return null;
        }
    }
}
