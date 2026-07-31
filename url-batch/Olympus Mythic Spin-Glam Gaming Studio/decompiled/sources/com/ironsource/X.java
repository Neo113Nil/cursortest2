package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface X {

    public static final class a implements X {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final A7 b;

        public a(@NotNull JSONObject applicationConfig, @NotNull A7 epService) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            Intrinsics.checkNotNullParameter(epService, "epService");
            this.a = applicationConfig;
            this.b = epService;
        }

        @Override // com.ironsource.X
        @NotNull
        public String a() {
            String a = this.b.a();
            if (StringsKt.isBlank(a)) {
                a = null;
            }
            if (a != null) {
                return a;
            }
            String it = this.a.optString("controllerUrl");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String str = StringsKt.isBlank(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        @NotNull
        public JSONObject b() {
            JSONObject optJSONObject = this.a.optJSONObject("controllerConfig");
            return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
        }

        @Override // com.ironsource.X
        public int c() {
            int optInt = this.a.optInt("debugMode", 0);
            if (this.a.optBoolean(b.e, false)) {
                return 3;
            }
            return optInt;
        }
    }

    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "controllerUrl";

        @NotNull
        public static final String c = "controllerConfig";

        @NotNull
        public static final String d = "debugMode";

        @NotNull
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    @NotNull
    String a();

    @NotNull
    JSONObject b();

    int c();
}
