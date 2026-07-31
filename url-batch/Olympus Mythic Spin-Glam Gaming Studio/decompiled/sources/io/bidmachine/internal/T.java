package io.bidmachine.internal;

import io.bidmachine.util.version.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class T {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final JSONArray a(List versionMilestoneList) {
        Intrinsics.checkNotNullParameter(versionMilestoneList, "versionMilestoneList");
        JSONArray jSONArray = new JSONArray();
        Iterator it = versionMilestoneList.iterator();
        while (it.hasNext()) {
            jSONArray.put(a((S) it.next()));
        }
        return jSONArray;
    }

    public final JSONObject a(S versionMilestone) {
        Intrinsics.checkNotNullParameter(versionMilestone, "versionMilestone");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ver", versionMilestone.f().toString());
        jSONObject.put("scn", versionMilestone.e());
        jSONObject.put("fst", versionMilestone.b());
        jSONObject.put("lst", versionMilestone.d());
        jSONObject.put("csd", versionMilestone.a());
        jSONObject.put("lsd", versionMilestone.c());
        return jSONObject;
    }

    public final List a(JSONArray jsonArray) {
        S a2;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jsonArray.optJSONObject(i);
            if (optJSONObject != null && (a2 = a(optJSONObject)) != null) {
                arrayList.add(a2);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    public final S a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            Version parseVersion = Version.INSTANCE.parseVersion(jsonObject.getString("ver"));
            if (parseVersion != null) {
                return new S(parseVersion, jsonObject.getInt("scn"), jsonObject.getLong("fst"), jsonObject.getLong("lst"), jsonObject.getLong("csd"), jsonObject.getLong("lsd"));
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable unused) {
            return null;
        }
    }
}
