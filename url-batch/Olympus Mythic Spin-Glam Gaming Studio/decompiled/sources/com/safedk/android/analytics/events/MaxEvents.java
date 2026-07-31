package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.d;
import com.safedk.android.utils.f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MaxEvents extends ArrayList<a> implements f {
    private static final String a = "MaxEvents";
    private int b;

    public MaxEvents() {
        this.b = 10;
    }

    public MaxEvents(int capacity) {
        this.b = 10;
        this.b = capacity;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(a aVar) {
        if (size() >= this.b) {
            remove(0);
        }
        return super.add(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, a aVar) {
        super.add(i, aVar);
    }

    public ArrayList<Bundle> a() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Iterator<a> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        Logger.d(a, "MaxEvents toBundle : ", arrayList.toString());
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<a> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString() + StringUtils.COMMA);
        }
        return sb.toString();
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capacity", this.b);
        jSONObject.put("maxEvents", d.a(this));
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.b = jSONObject.optInt("capacity", 10);
            JSONArray optJSONArray = jSONObject.optJSONArray("maxEvents");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    a aVar = new a();
                    aVar.a(optJSONArray.getJSONObject(i));
                    add(aVar);
                }
            }
        }
    }
}
