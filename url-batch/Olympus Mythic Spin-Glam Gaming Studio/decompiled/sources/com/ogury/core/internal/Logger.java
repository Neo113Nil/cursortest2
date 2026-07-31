package com.ogury.core.internal;

import android.util.Log;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ogury/core/internal/Logger;", "", "()V", "enabled", "", "d", "", "tag", "Lcom/ogury/core/internal/LogTag;", "source", "Lcom/ogury/core/internal/SourceTag;", "message", "", "disableLogs", EidRequestBuilder.REQUEST_FIELD_EMAIL, "error", "", "print", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "logTag", "w", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Logger {

    @NotNull
    public static final Logger INSTANCE = new Logger();
    private static boolean enabled = DebugUtils.INSTANCE.isDebug();

    private Logger() {
    }

    private final void print(int priority, LogTag logTag, SourceTag source, String message) {
        Log.println(priority, X3.j.d + logTag.getTag() + "][" + source.getTag() + X3.j.e, message);
    }

    public final void d(@NotNull LogTag tag, @NotNull SourceTag source, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        if (enabled) {
            print(3, tag, source, message);
        }
    }

    public final void disableLogs() {
        enabled = false;
    }

    public final void e(@NotNull LogTag tag, @NotNull SourceTag source, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        if (enabled) {
            print(6, tag, source, message);
        }
    }

    public final void w(@NotNull LogTag tag, @NotNull SourceTag source, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        if (enabled) {
            print(5, tag, source, message);
        }
    }

    public final void e(@NotNull LogTag tag, @NotNull SourceTag source, @NotNull String message, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        if (enabled) {
            print(6, tag, source, message + "\n" + Log.getStackTraceString(error));
        }
    }

    public final void e(@NotNull LogTag tag, @NotNull SourceTag source, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(error, "error");
        if (enabled) {
            print(6, tag, source, error.getMessage() + "\n" + Log.getStackTraceString(error));
        }
    }
}
