package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public interface q {

    public static final class a {

        @NotNull
        private final String a;

        public a(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        @Nullable
        public final IronSourceError a(@NotNull h loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.j.f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b = bVar.b();
            if ((b == null || b.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    public static final class b {

        @NotNull
        private final String a;

        public b(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        @Nullable
        public final IronSourceError a(@NotNull h.d loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.d() == null) {
                return new IronSourceError(1060, this.a + " was initialized and loaded without Activity");
            }
            if (loadParams.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b = loadParams.b();
            if ((b == null || b.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Nullable
    IronSourceError a();
}
