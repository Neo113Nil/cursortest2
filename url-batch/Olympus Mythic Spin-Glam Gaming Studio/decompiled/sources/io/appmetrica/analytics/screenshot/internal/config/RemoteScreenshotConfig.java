package io.appmetrica.analytics.screenshot.internal.config;

import io.appmetrica.analytics.screenshot.impl.O;
import io.appmetrica.analytics.screenshot.impl.T;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0010¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/config/RemoteScreenshotConfig;", "", "", "toString", "", "a", "Z", "getEnabled", "()Z", "enabled", "Lio/appmetrica/analytics/screenshot/impl/T;", "b", "Lio/appmetrica/analytics/screenshot/impl/T;", "getConfig$screenshot_release", "()Lio/appmetrica/analytics/screenshot/impl/T;", "config", "<init>", "(ZLio/appmetrica/analytics/screenshot/impl/T;)V", "()V", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RemoteScreenshotConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private final T config;

    public RemoteScreenshotConfig(boolean z, @NotNull T t) {
        this.enabled = z;
        this.config = t;
    }

    @NotNull
    /* renamed from: getConfig$screenshot_release, reason: from getter */
    public final T getConfig() {
        return this.config;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.enabled + ", config=" + this.config + ')';
    }

    public RemoteScreenshotConfig() {
        this(new O().a, new T());
    }
}
