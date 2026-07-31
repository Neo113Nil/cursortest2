package com.ironsource;

import android.view.View;
import com.ironsource.C8;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class G8 {

    @NotNull
    private C8 a;

    @Nullable
    private View b;

    @Nullable
    private View c;

    @Nullable
    private View d;

    @Nullable
    private View e;

    @Nullable
    private View f;

    @Nullable
    private View g;

    @NotNull
    private View h;

    @Nullable
    private a i;

    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull Hg hg);
    }

    public enum b {
        Title("title"),
        Advertiser(X3.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(X3.i.J0);


        @NotNull
        private final String a;

        b(String str) {
            this.a = str;
        }

        @NotNull
        public final String b() {
            return this.a;
        }
    }

    public static final class c implements C8.a {
        c() {
        }

        @Override // com.ironsource.C8.a
        public void a(@NotNull Hg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a n = G8.this.n();
            if (n != null) {
                n.a(viewVisibilityParams);
            }
        }
    }

    public G8(@NotNull C8 containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.a = containerView;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.b, b.Title);
        a(this, this.c, b.Advertiser);
        a(this, this.e, b.Body);
        a(this, this.g, b.Cta);
        a(this, this.d, b.Icon);
        a(this, this.a, b.Container);
        a(this, this.h, b.PrivacyIcon);
    }

    private final void s() {
        this.a.setListener$mediationsdk_release(new c());
    }

    @NotNull
    public final C8 a() {
        return this.a;
    }

    @Nullable
    public final View b() {
        return this.b;
    }

    @Nullable
    public final View c() {
        return this.c;
    }

    @Nullable
    public final View d() {
        return this.d;
    }

    @Nullable
    public final View e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g8 = (G8) obj;
        return Intrinsics.areEqual(this.a, g8.a) && Intrinsics.areEqual(this.b, g8.b) && Intrinsics.areEqual(this.c, g8.c) && Intrinsics.areEqual(this.d, g8.d) && Intrinsics.areEqual(this.e, g8.e) && Intrinsics.areEqual(this.f, g8.f) && Intrinsics.areEqual(this.g, g8.g) && Intrinsics.areEqual(this.h, g8.h);
    }

    @Nullable
    public final View f() {
        return this.f;
    }

    @Nullable
    public final View g() {
        return this.g;
    }

    @NotNull
    public final View h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        View view = this.b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    @Nullable
    public final View i() {
        return this.c;
    }

    @Nullable
    public final View j() {
        return this.e;
    }

    @NotNull
    public final C8 k() {
        return this.a;
    }

    @Nullable
    public final View l() {
        return this.g;
    }

    @Nullable
    public final View m() {
        return this.d;
    }

    @Nullable
    public final a n() {
        return this.i;
    }

    @Nullable
    public final View o() {
        return this.f;
    }

    @NotNull
    public final View p() {
        return this.h;
    }

    @Nullable
    public final View q() {
        return this.b;
    }

    @NotNull
    public final JSONObject t() {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put("title", this.b != null).put(X3.i.F0, this.c != null).put("body", this.e != null).put("cta", this.g != null).put("media", this.f != null).put("icon", this.d != null);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    @NotNull
    public final G8 a(@NotNull C8 containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new G8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void b(@Nullable View view) {
        this.e = view;
    }

    public final void c(@Nullable View view) {
        this.g = view;
    }

    public final void d(@Nullable View view) {
        this.d = view;
    }

    public final void e(@Nullable View view) {
        this.f = view;
    }

    public final void f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.h = view;
    }

    public final void g(@Nullable View view) {
        this.b = view;
    }

    public final void a(@NotNull C8 c8) {
        Intrinsics.checkNotNullParameter(c8, "<set-?>");
        this.a = c8;
    }

    public final void a(@Nullable View view) {
        this.c = view;
    }

    public final void a(@Nullable a aVar) {
        this.i = aVar;
    }

    private static final void a(final G8 g8, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.G8$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    G8.a(G8.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(G8 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    public /* synthetic */ G8(C8 c8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }
}
