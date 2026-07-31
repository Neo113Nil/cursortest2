package com.ironsource;

import android.app.Activity;
import com.ironsource.C4703ie;
import com.ironsource.C4822p8;
import com.ironsource.F8;
import com.ironsource.G8;
import com.ironsource.Vb;
import com.ironsource.X3;
import com.ironsource.sdk.IronSourceNetwork;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class B8 implements F8 {

    @NotNull
    public static final a j = new a(null);

    @NotNull
    private final String a;

    @NotNull
    private final Vb b;

    @NotNull
    private final InterfaceC4875s8 c;

    @Nullable
    private D8 d;

    @Nullable
    private String e;

    @Nullable
    private String f;

    @Nullable
    private Long g;

    @Nullable
    private F8.a h;

    @Nullable
    private G8 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final B8 a() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new B8(uuid, new Ub(uuid, controllerManager, null, null, 12, null), new C4893t8());
        }

        private a() {
        }
    }

    public B8(@NotNull String id, @NotNull Vb controller, @NotNull InterfaceC4875s8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4857r8 d() {
        C4857r8 a2 = new C4857r8().a(B5.x, this.f).a(B5.v, this.e).a("producttype", C4822p8.e.NativeAd.toString()).a(B5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(a2, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a2;
    }

    @NotNull
    public static final B8 e() {
        return j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    @Nullable
    public final String h() {
        return this.e;
    }

    @Nullable
    public final String i() {
        return this.f;
    }

    @Override // com.ironsource.F8
    @Nullable
    public F8.a b() {
        return this.h;
    }

    @Override // com.ironsource.F8
    @Nullable
    public D8 c() {
        return this.d;
    }

    public static final class b implements Vb.a {
        b() {
        }

        @Override // com.ironsource.Vb.a
        public void a(@NotNull D8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            B8.this.d = adData;
            InterfaceC4875s8 interfaceC4875s8 = B8.this.c;
            C4703ie.a loadAdSuccess = C4703ie.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> a = B8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(a, "baseEventParams().data");
            interfaceC4875s8.a(loadAdSuccess, a);
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Vb.a
        public void e() {
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Vb.a
        public void a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C4857r8 a = B8.this.d().a(B5.A, reason);
            InterfaceC4875s8 interfaceC4875s8 = B8.this.c;
            C4703ie.a loadAdFailed = C4703ie.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> a2 = a.a();
            Intrinsics.checkNotNullExpressionValue(a2, "eventParams.data");
            interfaceC4875s8.a(loadAdFailed, a2);
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Vb.a
        public void a() {
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.F8
    public void a(@Nullable F8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.F8
    public void a(@NotNull Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        InterfaceC4875s8 interfaceC4875s8 = this.c;
        C4703ie.a loadAd = C4703ie.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        interfaceC4875s8.a(loadAd, a2);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(loadParams.toString());
        jsonObjectInit.put(X3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jsonObjectInit);
    }

    public static final class c implements G8.a {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[G8.b.values().length];
                try {
                    iArr[G8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.G8.a
        public void a(@NotNull G8.b viewName) {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.a[viewName.ordinal()] == 1) {
                B8.this.b.c();
                return;
            }
            JSONObject clickParams = IronSourceNetworkBridge.jsonObjectInit().put("viewName", viewName.b());
            Vb vb = B8.this.b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            vb.a(clickParams);
        }

        @Override // com.ironsource.G8.a
        public void a(@NotNull Hg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            B8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.F8
    public void a(@NotNull G8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        linkedHashMap.putAll(a2);
        String jSONObject = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(B5.y, jSONObject);
        InterfaceC4875s8 interfaceC4875s8 = this.c;
        C4703ie.a registerAd = C4703ie.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC4875s8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.F8
    public void a() {
        G8 g8 = this.i;
        if (g8 != null) {
            g8.a((G8.a) null);
        }
        this.b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ B8(String str, Vb vb, InterfaceC4875s8 interfaceC4875s8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vb, interfaceC4875s8);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }
}
