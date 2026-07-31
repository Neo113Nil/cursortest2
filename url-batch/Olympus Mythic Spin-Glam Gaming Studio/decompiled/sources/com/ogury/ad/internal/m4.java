package com.ogury.ad.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class m4 {
    public static final List a(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
