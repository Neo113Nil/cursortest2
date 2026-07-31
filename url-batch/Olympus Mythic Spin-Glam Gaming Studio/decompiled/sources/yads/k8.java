package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public final class k8 {
    public final xa a;
    public final zf2 b;
    public final nt2 c;

    public k8() {
        xa xaVar = new xa();
        zf2 zf2Var = new zf2();
        nt2 nt2Var = new nt2();
        this.a = xaVar;
        this.b = zf2Var;
        this.c = nt2Var;
    }

    public final io2 a(d8 d8Var) {
        String str;
        boolean z;
        io2 io2Var = new io2((Map) null, 3);
        if (d8Var != null) {
            Map map = d8Var.g;
            f00 f00Var = d8Var.l;
            this.a.getClass();
            HashMap hashMap = new HashMap();
            if (!TypeIntrinsics.isMutableMap(hashMap)) {
                hashMap = null;
            }
            if (hashMap == null) {
                hashMap = new LinkedHashMap();
            }
            if (f00Var != null) {
                String str2 = f00Var.a;
                if (str2 != null) {
                    hashMap.put("adapter_network_name", str2);
                }
                String str3 = f00Var.b;
                if (str3 != null) {
                    hashMap.put("adapter_version", str3);
                }
                String str4 = f00Var.c;
                if (str4 != null) {
                    hashMap.put("adapter_network_sdk_version", str4);
                }
            } else if (map != null) {
                String str5 = (String) map.get("adapter_network_name");
                String str6 = (String) map.get("adapter_version");
                String str7 = (String) map.get("adapter_network_sdk_version");
                if (str5 != null) {
                    hashMap.put("adapter_network_name", str5);
                }
                if (str6 != null) {
                    hashMap.put("adapter_version", str6);
                }
                if (str7 != null) {
                    hashMap.put("adapter_network_sdk_version", str7);
                }
            }
            this.b.getClass();
            wf2 wf2Var = (wf2) yf2.a.getValue();
            if (wf2Var != null) {
                int ordinal = wf2Var.ordinal();
                if (ordinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (ordinal == 1) {
                    str = "react-native";
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "unity";
                }
            } else {
                str = map != null ? (String) map.get("plugin_type") : null;
            }
            String str8 = map != null ? (String) map.get("plugin_version") : null;
            Map createMapBuilder = MapsKt.createMapBuilder();
            if (str != null) {
                createMapBuilder.put("plugin_type", str);
            }
            if (str8 != null) {
                createMapBuilder.put("plugin_version", str8);
            }
            Map build = MapsKt.build(createMapBuilder);
            String str9 = d8Var.k;
            nt2 nt2Var = this.c;
            nt2Var.getClass();
            HashMap hashMap2 = new HashMap();
            if (!TypeIntrinsics.isMutableMap(hashMap2)) {
                hashMap2 = null;
            }
            if (hashMap2 == null) {
                hashMap2 = new LinkedHashMap();
            }
            vw2 vw2Var = nt2Var.a;
            synchronized (vw2.k) {
                z = vw2Var.h;
            }
            hashMap2.put("app_ad_analytics_enabled", Boolean.valueOf(z));
            io2Var.a.putAll(hashMap);
            io2Var.a.putAll(build);
            io2Var.a(str9, "preload_type");
            io2Var.a.putAll(hashMap2);
        }
        String str10 = d8Var != null ? d8Var.h : null;
        if (str10 != null && str10.length() != 0) {
            io2Var.a("openbidding", "integration_type");
        }
        return io2Var;
    }
}
