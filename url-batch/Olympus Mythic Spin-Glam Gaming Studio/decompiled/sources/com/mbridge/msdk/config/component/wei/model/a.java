package com.mbridge.msdk.config.component.wei.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;

/* compiled from: WebViewModel.java */
/* loaded from: classes4.dex */
public class a {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private AdSession f;
    private boolean g;
    private String h;
    private List<Map<String, Object>> i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.h;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.a;
    }

    public String h() {
        return this.e;
    }

    public boolean i() {
        return this.g;
    }

    public AdSession a() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public void c(String str) {
        this.b = str;
    }

    public String d() {
        return this.c;
    }

    public List<Map<String, Object>> e() {
        return this.i;
    }

    public void a(List<Map<String, Object>> list) {
        this.i = list;
    }

    public void a(Map<String, Object> map) {
        b a;
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                if (valueOf.contains(".zip") && (a = com.mbridge.msdk.config.component.common.file.a.a(valueOf, 1, null)) != null && a.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(valueOf, a.d()));
                }
                if (valueOf.startsWith("assets://")) {
                    valueOf = valueOf.replace("assets://", "file:///android_asset/");
                }
                d(valueOf);
            }
            Object obj2 = map.get(c.c("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
