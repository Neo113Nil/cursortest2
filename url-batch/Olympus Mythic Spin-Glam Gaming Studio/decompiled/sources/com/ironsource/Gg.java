package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Gg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(C4643f8.k, Boolean.valueOf(Gg.this.b == 0));
            put(C4643f8.l, Boolean.valueOf(Gg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4643f8.m, bool);
            put(C4643f8.n, bool);
        }
    }

    Gg() {
    }

    void a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C4643f8.m, Boolean.valueOf(z));
        if ((this.a.get(C4643f8.l).booleanValue() || this.a.get(C4643f8.k).booleanValue()) && this.a.get(C4643f8.m).booleanValue()) {
            z2 = true;
        }
        this.a.put(C4643f8.n, Boolean.valueOf(z2));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
