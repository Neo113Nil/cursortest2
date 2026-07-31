package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* compiled from: TransformModel.java */
/* loaded from: classes14.dex */
public class a {
    private String a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.c("118"))) == null) {
            return;
        }
        a(String.valueOf(obj));
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }
}
