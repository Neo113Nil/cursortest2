package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Map;

/* compiled from: LogSenderModel.java */
/* loaded from: classes6.dex */
public class a {
    private int a = 2;
    private int b = 15000;
    private int c = 0;
    private int d = 0;
    private int e = 50;
    private int f = 50;
    private int g = 604800000;
    private int h;
    private Map<String, Object> i;
    private Map<String, Object> j;
    private Map<String, Object> k;

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String valueOf = String.valueOf(map.get(c.c("181")));
                if (!TextUtils.isEmpty(valueOf) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf)) {
                    try {
                        this.a = Integer.parseInt(valueOf);
                    } catch (Exception e) {
                        q0.b("LogSenderModel", e.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String valueOf2 = String.valueOf(map.get(c.c("162")));
                if (!TextUtils.isEmpty(valueOf2) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf2)) {
                    try {
                        this.b = Integer.parseInt(valueOf2) * 1000;
                    } catch (Exception e2) {
                        q0.b("LogSenderModel", e2.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String valueOf3 = String.valueOf(map.get(c.c("182")));
                if (!TextUtils.isEmpty(valueOf3) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf3)) {
                    try {
                        this.c = Integer.parseInt(valueOf3);
                    } catch (Exception e3) {
                        q0.b("LogSenderModel", e3.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String valueOf4 = String.valueOf(map.get(c.c("183")));
                if (!TextUtils.isEmpty(valueOf4) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf4)) {
                    try {
                        this.d = Integer.parseInt(valueOf4);
                    } catch (Exception e4) {
                        q0.b("LogSenderModel", e4.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String valueOf5 = String.valueOf(map.get(c.c("174")));
                if (!TextUtils.isEmpty(valueOf5) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf5)) {
                    try {
                        this.e = Integer.parseInt(valueOf5);
                    } catch (Exception e5) {
                        q0.b("LogSenderModel", e5.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String valueOf6 = String.valueOf(map.get(c.c("184")));
                if (!TextUtils.isEmpty(valueOf6) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf6)) {
                    try {
                        this.f = Integer.parseInt(valueOf6);
                    } catch (Exception e6) {
                        q0.b("LogSenderModel", e6.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String valueOf7 = String.valueOf(map.get(c.c("185")));
                if (!TextUtils.isEmpty(valueOf7) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf7)) {
                    try {
                        this.g = Integer.parseInt(valueOf7) * 1000;
                    } catch (Exception e7) {
                        q0.b("LogSenderModel", e7.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String valueOf8 = String.valueOf(map.get(c.c("178")));
                if (!TextUtils.isEmpty(valueOf8) && !POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf8)) {
                    try {
                        this.h = Integer.parseInt(valueOf8);
                    } catch (Exception e8) {
                        q0.b("LogSenderModel", e8.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.b;
    }

    public String c() {
        Map<String, Object> map = this.i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String valueOf = String.valueOf(this.i.get(c.c("116")));
        return (TextUtils.isEmpty(valueOf) || POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf)) ? "" : valueOf;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        Map<String, Object> map = this.i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.e;
    }

    public Map<String, Object> h() {
        return this.k;
    }

    public String i() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String valueOf = String.valueOf(this.j.get(c.c("114")));
        return (TextUtils.isEmpty(valueOf) || POBCommonConstants.NULL_VALUE.equalsIgnoreCase(valueOf)) ? "" : valueOf;
    }

    public int j() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String valueOf = String.valueOf(this.j.get(c.c("172")));
        if (TextUtils.isEmpty(valueOf) || POBCommonConstants.NULL_VALUE.equals(valueOf)) {
            return 9377;
        }
        try {
            return Integer.parseInt(valueOf);
        } catch (Exception e) {
            q0.b("LogSenderModel", e.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.g;
    }

    public int a() {
        return this.a;
    }
}
