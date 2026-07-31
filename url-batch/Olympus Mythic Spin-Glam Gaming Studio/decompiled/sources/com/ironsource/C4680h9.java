package com.ironsource;

import android.content.Context;
import com.ironsource.We;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4680h9 {

    @NotNull
    public static final a a = new a(null);

    /* renamed from: com.ironsource.h9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return IronSourceNetworkBridge.jsonObjectInit(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }

        public final boolean b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C4964x3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        @Nullable
        public final We c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C4964x3 d = d(context);
            if (d.d().length() <= 0 || d.e().length() <= 0) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            We we = new We(context, d.d(), d.f(), d.e());
            we.a(We.a.CACHE);
            return we;
        }

        @NotNull
        public final C4964x3 d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject a = a(context);
            String cachedAppKey = a.optString("appKey");
            String cachedUserId = a.optString("userId");
            String cachedSettings = a.optString("response");
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C4964x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    public static final boolean a(@NotNull Context context) {
        return a.b(context);
    }

    @Nullable
    public static final We b(@NotNull Context context) {
        return a.c(context);
    }

    @NotNull
    public static final C4964x3 c(@NotNull Context context) {
        return a.d(context);
    }
}
