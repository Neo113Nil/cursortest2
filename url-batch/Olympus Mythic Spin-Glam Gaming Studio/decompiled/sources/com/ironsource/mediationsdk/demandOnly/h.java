package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC4705j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public interface h extends q {

    public static abstract class a implements h {

        @Nullable
        private final String a;

        @Nullable
        private final String b;
        private final boolean c;

        public a(@Nullable String str, @Nullable String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String b() {
            return this.b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String e() {
            return this.a;
        }
    }

    public static final class b extends a {

        @NotNull
        private final String d;

        @Nullable
        private final Activity e;

        @Nullable
        private final ISDemandOnlyBannerLayout f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError a = new q.a(this.d).a(this);
            if (a != null) {
                return a;
            }
            return null;
        }

        @Nullable
        public final Activity f() {
            return this.e;
        }

        @Nullable
        public final ISDemandOnlyBannerLayout g() {
            return this.f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
            this.f = iSDemandOnlyBannerLayout;
        }
    }

    public static final class c {

        @NotNull
        private String a = "";

        @Nullable
        private Activity b;

        @Nullable
        private String c;
        private boolean d;

        @Nullable
        private String e;

        @Nullable
        private ISDemandOnlyBannerLayout f;

        @NotNull
        public final c a(@NotNull IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String aVar = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(aVar, "adFormat.toString()");
            this.a = aVar;
            return this;
        }

        @NotNull
        public final c b(@Nullable String str) {
            this.c = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity) {
            this.b = activity;
            return this;
        }

        @NotNull
        public final d b() {
            return new d(this.a, this.b, this.c, this.e, this.d);
        }

        @NotNull
        public final c a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.b = activity;
            return this;
        }

        @NotNull
        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public final c a(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        public final b a() {
            return new b(this.a, this.b, this.c, this.f, this.e, this.d);
        }
    }

    public static final class d extends a implements InterfaceC4705j {

        @NotNull
        private final String d;

        @Nullable
        private final Activity e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError a = new q.b(this.d).a(this);
            if (a != null) {
                return a;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC4705j
        @Nullable
        public Activity d() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
        }
    }

    @Nullable
    String b();

    boolean c();

    @Nullable
    String e();
}
