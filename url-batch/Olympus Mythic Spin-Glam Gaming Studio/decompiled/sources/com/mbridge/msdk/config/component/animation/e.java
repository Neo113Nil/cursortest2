package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AnimationNodeSpec.java */
/* loaded from: classes6.dex */
public class e {
    private String a;
    private Map<String, Object> b;
    private List<e> c;

    public e() {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.b = map;
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public List<e> a() {
        return this.c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.c = list;
    }

    public void a(String str, Object obj) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, obj);
    }

    public e(String str) {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
        this.a = str;
    }
}
