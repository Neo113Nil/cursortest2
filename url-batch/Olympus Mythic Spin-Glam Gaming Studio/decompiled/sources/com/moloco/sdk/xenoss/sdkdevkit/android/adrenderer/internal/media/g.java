package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class g implements f {
    public static final int d = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    public g(@NotNull Context appContext, @NotNull String cacheDir) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.a = appContext;
        this.b = cacheDir;
        this.c = "MediaCacheLocationProviderImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f
    @NotNull
    public x<File, com.moloco.sdk.internal.m> a() {
        try {
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, this.b);
                file.mkdir();
                if (file.exists()) {
                    return new x.b(file);
                }
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", null, false, 12, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 102));
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f
    @NotNull
    public x<File, com.moloco.sdk.internal.m> b() {
        try {
            if (this.a.getCacheDir() != null) {
                File file = new File(this.a.getCacheDir(), this.b);
                file.mkdir();
                if (file.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.c, "Able to write to internal storage cache directory", false, 4, null);
                    return new x.b(file);
                }
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in internal storage", null, false, 12, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 102));
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new x.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 200));
        }
    }

    @NotNull
    public final Context c() {
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }
}
