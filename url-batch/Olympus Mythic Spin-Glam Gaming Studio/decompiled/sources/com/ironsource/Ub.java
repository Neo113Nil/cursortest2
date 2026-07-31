package com.ironsource;

import android.app.Activity;
import com.ironsource.D8;
import com.ironsource.Vb;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ub implements Vb {

    @NotNull
    private final String a;

    @NotNull
    private final com.ironsource.sdk.controller.e b;

    @NotNull
    private final U8 c;

    @NotNull
    private final InterfaceC4600d1 d;
    private final String e;

    @Nullable
    private Vb.a f;

    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "nativeAd.load";

        @NotNull
        public static final String c = "nativeAd.loadReport";

        @NotNull
        public static final String d = "nativeAd.register";

        @NotNull
        public static final String e = "nativeAd.click";

        @NotNull
        public static final String f = "nativeAd.privacyClick";

        @NotNull
        public static final String g = "nativeAd.visibilityChanged";

        @NotNull
        public static final String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Ub(@NotNull String id, @NotNull com.ironsource.sdk.controller.e controllerManager, @NotNull U8 imageLoader, @NotNull InterfaceC4600d1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.a = id;
        this.b = controllerManager;
        this.c = imageLoader;
        this.d = adViewManagement;
        this.e = Ub.class.getSimpleName();
        controllerManager.a(id, d());
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.Ub$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb) {
                Ub.a(Ub.this, nb);
            }
        };
    }

    private final JSONObject e() {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put(f.b.g, a.e).put("sdkCallback", X3.h.U);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    @Override // com.ironsource.Vb
    public void a(@Nullable Vb.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Vb
    @Nullable
    public Vb.a b() {
        return this.f;
    }

    @Override // com.ironsource.Vb
    public void c() {
        this.b.a(new f.c(this.a, a.f, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ub this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.Vb
    public void a(@NotNull final Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.b.a(activity);
        this.b.a(new f.c(this.a, a.b, loadParams), new l.a() { // from class: com.ironsource.Ub$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Ub.a(Ub.this, activity, aVar);
            }
        });
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle show on native ad: " + optString);
            return;
        }
        Vb.a b = b();
        if (b != null) {
            b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, Activity activity, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Vb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Vb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        D8.b a2 = new D8.a(this.c, this.d).a(activity, aVar.d());
        a(a2, a2.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ub(String str, com.ironsource.sdk.controller.e eVar, U8 u8, InterfaceC4600d1 interfaceC4600d1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, u8, interfaceC4600d1);
        u8 = (i & 4) != 0 ? new T8(null, 1, null) : u8;
        if ((i & 8) != 0) {
            interfaceC4600d1 = C4768m8.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC4600d1, "getInstance()");
        }
    }

    private final void a(D8.b bVar, final D8 d8) {
        this.b.a(new f.c(this.a, "nativeAd.loadReport." + this.a, bVar.b()), new l.a() { // from class: com.ironsource.Ub$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Ub.a(Ub.this, d8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, D8 adData, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(D8 d8, f.a aVar) {
        if (aVar.d() == null) {
            Vb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Vb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        Vb.a b3 = b();
        if (b3 != null) {
            b3.a(d8);
        }
    }

    @Override // com.ironsource.Vb
    public void a() {
        this.b.a(new f.c(this.a, a.h, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }

    @Override // com.ironsource.Vb
    public void a(@NotNull G8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = IronSourceNetworkBridge.jsonObjectInit().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.b.a(new f.c(str, a.d, params), (l.a) null);
    }

    @Override // com.ironsource.Vb
    public void a(@NotNull Hg viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.b.a(new f.c(this.a, a.g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.Ub$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Ub.b(Ub.this, aVar);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void a(@NotNull JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.b.a(new f.c(this.a, a.e, clickParams), new l.a() { // from class: com.ironsource.Ub$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Ub.a(Ub.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        Vb.a b = b();
        if (b != null) {
            b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, Nb msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.e)) {
            this$0.a(msg);
        }
    }

    private final void a(Nb nb) {
        if (nb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!nb.f().optBoolean("success", false)) {
            String optString = nb.f().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        Vb.a b = b();
        if (b != null) {
            b.e();
        }
    }
}
