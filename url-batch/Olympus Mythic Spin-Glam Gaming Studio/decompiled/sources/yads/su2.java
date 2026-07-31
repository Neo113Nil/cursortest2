package yads;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class su2 {
    public final mt1 a;
    public final t43 b;
    public final q53 c;
    public final mm0 d;
    public final bp e;
    public final fn0 f;
    public final s6 g;
    public final a43 h;
    public final sy2 i;
    public final ae2 j;

    public su2(mt1 mt1Var) {
        t43 t43Var = new t43();
        q53 q53Var = new q53();
        mm0 mm0Var = new mm0();
        bp bpVar = new bp();
        fn0 fn0Var = new fn0();
        s6 s6Var = new s6();
        a43 a43Var = new a43();
        sy2 sy2Var = new sy2();
        ae2 ae2Var = new ae2();
        this.a = mt1Var;
        this.b = t43Var;
        this.c = q53Var;
        this.d = mm0Var;
        this.e = bpVar;
        this.f = fn0Var;
        this.g = s6Var;
        this.h = a43Var;
        this.i = sy2Var;
        this.j = ae2Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object m8023constructorimpl;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static List a(JSONArray jSONArray) {
        ii2 ii2Var;
        Object obj;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("ad_unit_id", null);
                if (optString.length() <= 0) {
                    optString = null;
                }
                if (optString != null) {
                    hi2 hi2Var = ii2.Companion;
                    String optString2 = optJSONObject.optString(POBConstants.KEY_FORMAT, null);
                    hi2Var.getClass();
                    if (optString2 != null) {
                        if (optString2.length() <= 0) {
                            optString2 = null;
                        }
                        if (optString2 != null) {
                            Iterator<E> it = ii2.e.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (Intrinsics.areEqual(((ii2) obj).b, optString2)) {
                                    break;
                                }
                            }
                            ii2Var = (ii2) obj;
                            if (ii2Var != null && linkedHashSet.add(TuplesKt.to(optString, ii2Var))) {
                                createListBuilder.add(new fi2(optString, ii2Var));
                            }
                        }
                    }
                    ii2Var = null;
                    if (ii2Var != null) {
                        createListBuilder.add(new fi2(optString, ii2Var));
                    }
                }
            }
        }
        List build = CollectionsKt.build(createListBuilder);
        if (build.isEmpty()) {
            return null;
        }
        return build;
    }
}
