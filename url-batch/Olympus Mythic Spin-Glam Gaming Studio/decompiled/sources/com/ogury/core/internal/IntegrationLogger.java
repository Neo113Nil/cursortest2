package com.ogury.core.internal;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ogury/core/internal/IntegrationLogger;", "", "()V", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "getLevel$annotations", "getLevel", "()I", "setLevel", "(I)V", "d", "", "logTag", "Lcom/ogury/core/internal/LogTag;", "sourceTag", "Lcom/ogury/core/internal/SourceTag;", "message", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "throwable", "", "i", "print", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "source", "w", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IntegrationLogger {

    @NotNull
    public static final IntegrationLogger INSTANCE = new IntegrationLogger();
    private static int level = 4;

    private IntegrationLogger() {
    }

    public static final void d(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.print(3, logTag, sourceTag, message);
    }

    public static final void e(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.print(6, logTag, sourceTag, message);
    }

    public static final int getLevel() {
        return level;
    }

    public static /* synthetic */ void getLevel$annotations() {
    }

    public static final void i(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.print(4, logTag, sourceTag, message);
    }

    private final void print(int priority, LogTag logTag, SourceTag source, String message) {
        if (priority >= level) {
            Log.println(priority, X3.j.d + logTag.getTag() + "][" + source.getTag() + X3.j.e, message);
        }
    }

    public static final void setLevel(int i) {
        level = i;
    }

    public static final void w(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.print(5, logTag, sourceTag, message);
    }

    public static final void e(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.print(6, logTag, sourceTag, throwable.getMessage() + "\n" + Log.getStackTraceString(throwable));
    }

    public static final void i(@NotNull LogTag logTag, @NotNull SourceTag sourceTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        INSTANCE.print(4, logTag, sourceTag, "error\n" + Log.getStackTraceString(throwable));
    }
}
