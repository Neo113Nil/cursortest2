package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class Pb {
    private String a;

    public Pb(String str) {
        this.a = str;
    }

    private C5005z8 a() throws Exception {
        C5005z8 c5005z8 = new C5005z8(this.a, "metadata.json");
        if (!c5005z8.exists()) {
            a(c5005z8);
        }
        return c5005z8;
    }

    synchronized JSONObject b() throws Exception {
        return IronSourceNetworkBridge.jsonObjectInit(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C5005z8 c5005z8) throws Exception {
        IronSourceStorageUtils.saveFile(IronSourceNetworkBridge.jsonObjectInit().toString().getBytes(), c5005z8.getPath());
    }

    synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        try {
            b = b();
            JSONObject optJSONObject = b.optJSONObject(str);
            if (optJSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                b.putOpt(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(b);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        b = b();
        b.put(str, jSONObject);
        return a(b);
    }

    synchronized boolean a(String str) throws Exception {
        JSONObject b = b();
        if (!b.has(str)) {
            return true;
        }
        b.remove(str);
        return a(b);
    }

    boolean a(ArrayList<C5005z8> arrayList) throws Exception {
        Iterator<C5005z8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}
