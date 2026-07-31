package expo.modules.devlauncher.launcher.errors;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import expo.modules.devlauncher.launcher.DevLauncherRecentlyOpenedAppsRegistry;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherErrorRegistry.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lexpo/modules/devlauncher/launcher/errors/DevLauncherErrorInstance;", "", "throwable", "", "timestamp", "", "<init>", "(Ljava/lang/Throwable;J)V", "getThrowable", "()Ljava/lang/Throwable;", "getTimestamp", "()J", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DevLauncherErrorInstance {
    public static final int $stable = 8;
    private final Throwable throwable;
    private final long timestamp;

    public static /* synthetic */ DevLauncherErrorInstance copy$default(DevLauncherErrorInstance devLauncherErrorInstance, Throwable th, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            th = devLauncherErrorInstance.throwable;
        }
        if ((i & 2) != 0) {
            j = devLauncherErrorInstance.timestamp;
        }
        return devLauncherErrorInstance.copy(th, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final DevLauncherErrorInstance copy(Throwable throwable, long timestamp) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new DevLauncherErrorInstance(throwable, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevLauncherErrorInstance)) {
            return false;
        }
        DevLauncherErrorInstance devLauncherErrorInstance = (DevLauncherErrorInstance) other;
        return Intrinsics.areEqual(this.throwable, devLauncherErrorInstance.throwable) && this.timestamp == devLauncherErrorInstance.timestamp;
    }

    public int hashCode() {
        return (this.throwable.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "DevLauncherErrorInstance(throwable=" + this.throwable + ", timestamp=" + this.timestamp + ")";
    }

    public DevLauncherErrorInstance(Throwable throwable, long j) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
        this.timestamp = j;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public /* synthetic */ DevLauncherErrorInstance(Throwable th, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? DevLauncherRecentlyOpenedAppsRegistry.TimeHelper.INSTANCE.getCurrentTime() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final WritableMap toWritableMap() {
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", this.timestamp);
        String message = this.throwable.getMessage();
        if (message == null) {
            message = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        bundle.putString("message", message);
        bundle.putString(StackTraceHelper.STACK_KEY, ExceptionsKt.stackTraceToString(this.throwable));
        return Arguments.fromBundle(bundle);
    }
}
