package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* compiled from: ForEachModel.java */
/* loaded from: classes11.dex */
public class a {
    private Object a;
    private String b;
    private String c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.c("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.b;
    }

    public Object c() {
        return this.a;
    }

    public void b(String str) {
        this.b = str;
    }

    public void a(Object obj) {
        this.a = obj;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }
}
