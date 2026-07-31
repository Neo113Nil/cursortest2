package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹻ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1245 extends AbstractC1100 {
    static {
        StringFog.decrypt("FLw2sXA0uDMNtDSjaz4=\n", "YtlEwhlb1nA=\n");
        StringFog.decrypt("ndnpHFCD1uiI1fM6Tw==\n", "+rydXTzvhZw=\n");
        StringFog.decrypt("NHMpiYOwWf00cyWFjqho8DZl\n", "UxZdyO/cC5g=\n");
        StringFog.decrypt("j7bTfHdA5l+6tsBfZn/0X4u7\n", "6NOnOh4ylSs=\n");
        StringFog.decrypt("lrysPPvC86+Sv5kD4cHVpKy7mQ/81Q==\n", "/8/rZpKysMA=\n");
        StringFog.decrypt("MNm2YCL/+wwnz5JVJv/aHSbVu2g=\n", "VLzVD0+PiWk=\n");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static int m4498(ArrayList arrayList) {
        return AbstractC1246.m4506((String) AbstractC1100.m4401(arrayList, 0, String.class), (String) AbstractC1100.m4401(arrayList, 1, String.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m4499(ArrayList arrayList) {
        return AbstractC1246.m4505((String) AbstractC1100.m4401(arrayList, 0, String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m4500(ArrayList arrayList) {
        String str = (String) AbstractC1100.m4401(arrayList, 0, String.class);
        boolean booleanValue = arrayList.size() > 2 ? ((Boolean) AbstractC1100.m4401(arrayList, 2, Boolean.class)).booleanValue() : true;
        if (arrayList.get(1) instanceof String) {
            return AbstractC1246.m4508(str, (String) AbstractC1100.m4401(arrayList, 1, String.class), booleanValue);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1100.m4401(arrayList, 1, List.class));
        for (int i = 0; i < jSONArray.length(); i++) {
            String m4508 = AbstractC1246.m4508(str, jSONArray.optString(i), booleanValue);
            if (m4508 != null) {
                return m4508;
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m4501(ArrayList arrayList) {
        Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
        List list = (List) AbstractC1100.m4401(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC1100.m4401(arrayList, 2, Integer.class)).intValue();
        C0568 c0568 = C0860.m4221().f2085;
        c0568.getClass();
        C0611 c0611 = new C0611();
        C0628 c0628 = new C0628();
        C0635 c0635 = c0628.f1265;
        c0635.f1281 = -1;
        c0635.f1280 = -1;
        c0635.f1279 = -1;
        c0635.f1283 = -1;
        c0628.f1264 = c0611;
        c0628.f1263 = null;
        c0635.f1287 = list;
        c0635.f1286 = intValue;
        c0635.f1289 = C0611.class;
        c0635.f1288 = null;
        C0612 c0612 = new C0612(c0628);
        c0612.f1113 = true;
        c0568.m4061(m4401, c0612, 0, (C0658) null);
        return new ArrayList(c0612.f1112);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m4502(ArrayList arrayList) {
        String str = (String) AbstractC1100.m4401(arrayList, 0, String.class);
        if (arrayList.get(1) instanceof String) {
            return AbstractC1246.m4504(str, (String) AbstractC1100.m4401(arrayList, 1, String.class), false);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1100.m4401(arrayList, 1, List.class));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList2.addAll(AbstractC1246.m4504(str, jSONArray.optString(i), false));
        }
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4503(ArrayList arrayList) {
        return AbstractC1246.m4507((String) AbstractC1100.m4401(arrayList, 0, String.class));
    }
}
