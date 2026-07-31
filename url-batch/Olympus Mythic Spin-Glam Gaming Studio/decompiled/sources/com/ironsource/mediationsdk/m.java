package com.ironsource.mediationsdk;

import com.ironsource.U7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m {

    @NotNull
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull ISBannerSize bannerSize, @NotNull U7 containerParams) {
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            Intrinsics.checkNotNullParameter(containerParams, "containerParams");
            bannerSize.a(containerParams);
        }

        private a() {
        }
    }
}
