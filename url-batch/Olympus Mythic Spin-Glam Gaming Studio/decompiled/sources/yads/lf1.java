package yads;

import android.content.Context;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lf1 {
    public final o0 a;

    public lf1(Context context, mt1 mt1Var) {
        this.a = new o0(context.getApplicationContext(), mt1Var);
    }

    public final kf1 a(JSONObject jSONObject, dm dmVar) {
        ArrayList arrayList;
        List list;
        Object m8023constructorimpl;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                o0 o0Var = this.a;
                o0Var.getClass();
                String optString = jSONObject2.optString("type");
                if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
                    throw new o12("Native Ad json has not required attributes");
                }
                Map map = o0Var.f;
                if (map == null) {
                    map = MapsKt.mapOf(TuplesKt.to("adtune", new jb(o0Var.b, o0Var.c)), TuplesKt.to("divkit_adtune", new ei0(o0Var.d, o0Var.e, o0Var.c, dmVar.b)), TuplesKt.to("close", new xv()), TuplesKt.to("deeplink", new lb0(o0Var.a, o0Var.b)));
                    o0Var.f = map;
                }
                n0 n0Var = (n0) map.get(optString);
                if (n0Var != null) {
                    arrayList2.add(n0Var.a(jSONObject2));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String a = a("falseClickUrl", jSONObject);
        hq0 hq0Var = a != null ? new hq0(a, jSONObject.optLong("falseClickInterval", 0L)) : null;
        Set createSetBuilder = SetsKt.createSetBuilder();
        String a2 = a("trackingUrl", jSONObject);
        if (a2 != null) {
            createSetBuilder.add(a2);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (optJSONArray2 != null) {
            List createListBuilder = CollectionsKt.createListBuilder();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(optJSONArray2.getString(i2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                    createListBuilder.add((String) m8023constructorimpl);
                }
            }
            list = CollectionsKt.build(createListBuilder);
        } else {
            list = null;
        }
        if (list != null) {
            createSetBuilder.addAll(list);
        }
        return new kf1(arrayList, hq0Var, CollectionsKt.toList(SetsKt.build(createSetBuilder)), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L), jSONObject.optBoolean("webViewEnabled", false));
    }

    public static String a(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        return optString;
    }
}
