package com.ironsource.sdk.controller;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface f {

    public static final class a {

        @NotNull
        public static final C1375a c = new C1375a(null);

        @NotNull
        private final String a;

        @Nullable
        private final JSONObject b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C1375a {
            public /* synthetic */ C1375a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@NotNull String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jsonStr);
                String id = jsonObjectInit.getString(b.b);
                JSONObject optJSONObject = jsonObjectInit.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id, "id");
                return new a(id, optJSONObject);
            }

            private C1375a() {
            }
        }

        public a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.a = msgId;
            this.b = jSONObject;
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @Nullable
        public final JSONObject b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @Nullable
        public final JSONObject d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            JSONObject jSONObject = this.b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.a + ", params=" + this.b + ")";
        }

        @NotNull
        public final a a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.b;
            }
            return aVar.a(str, jSONObject);
        }

        @NotNull
        public static final a a(@NotNull String str) throws JSONException {
            return c.a(str);
        }
    }

    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "msgId";

        @NotNull
        public static final String c = "adId";

        @NotNull
        public static final String d = "params";

        @NotNull
        public static final String e = "success";

        @NotNull
        public static final String f = "reason";

        @NotNull
        public static final String g = "command";

        private b() {
        }
    }

    public static final class c {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @NotNull
        private final JSONObject c;

        @NotNull
        private String d;

        public c(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.a = adId;
            this.b = command;
            this.c = params;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.d = uuid;
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final JSONObject c() {
            return this.c;
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        @NotNull
        public final String e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c.toString(), cVar.c.toString());
        }

        @NotNull
        public final String f() {
            return this.d;
        }

        @NotNull
        public final JSONObject g() {
            return this.c;
        }

        @NotNull
        public final String h() {
            String jSONObject = IronSourceNetworkBridge.jsonObjectInit().put(b.b, this.d).put("adId", this.a).put("params", this.c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n          .…ms)\n          .toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            return "MessageToController(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ")";
        }

        @NotNull
        public final c a(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.d = str;
        }
    }
}
