package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4808oc {

    /* renamed from: com.ironsource.oc$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "SDKPluginType";

        @NotNull
        public static final String c = "sessionid";

        private a() {
        }
    }

    @NotNull
    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.b, pluginType);
        }
        String d = IronSourceUtils.d();
        if (d != null) {
            linkedHashMap.put("sessionid", d);
        }
        return linkedHashMap;
    }
}
