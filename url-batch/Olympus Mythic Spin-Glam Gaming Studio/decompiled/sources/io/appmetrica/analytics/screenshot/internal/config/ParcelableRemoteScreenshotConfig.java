package io.appmetrica.analytics.screenshot.internal.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.core.di.ServiceProvider;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.g0;
import io.appmetrica.analytics.screenshot.impl.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\t\b\u0010¢\u0006\u0004\b\u0017\u0010\u0019B\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0017\u0010\u001cB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/config/ParcelableRemoteScreenshotConfig;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "toString", "", "a", "Z", "getEnabled", "()Z", "enabled", "Lio/appmetrica/analytics/screenshot/impl/D;", "b", "Lio/appmetrica/analytics/screenshot/impl/D;", "getConfig$screenshot_release", "()Lio/appmetrica/analytics/screenshot/impl/D;", "config", "<init>", "(ZLio/appmetrica/analytics/screenshot/impl/D;)V", "()V", "Lio/appmetrica/analytics/screenshot/impl/g0;", ServiceProvider.NAMED_REMOTE, "(Lio/appmetrica/analytics/screenshot/impl/g0;)V", "(Landroid/os/Parcel;)V", "CREATOR", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ParcelableRemoteScreenshotConfig implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private final D config;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/config/ParcelableRemoteScreenshotConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lio/appmetrica/analytics/screenshot/internal/config/ParcelableRemoteScreenshotConfig;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lio/appmetrica/analytics/screenshot/internal/config/ParcelableRemoteScreenshotConfig;", "screenshot_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: io.appmetrica.analytics.screenshot.internal.config.ParcelableRemoteScreenshotConfig$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<ParcelableRemoteScreenshotConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableRemoteScreenshotConfig createFromParcel(@NotNull Parcel parcel) {
            return new ParcelableRemoteScreenshotConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableRemoteScreenshotConfig[] newArray(int size) {
            return new ParcelableRemoteScreenshotConfig[size];
        }
    }

    public ParcelableRemoteScreenshotConfig(boolean z, @Nullable D d) {
        this.enabled = z;
        this.config = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: getConfig$screenshot_release, reason: from getter */
    public final D getConfig() {
        return this.config;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.enabled + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeByte(this.enabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.config, flags);
    }

    public ParcelableRemoteScreenshotConfig() {
        this(new g0());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ParcelableRemoteScreenshotConfig(@NotNull g0 g0Var) {
        this(r0, r3 != null ? new D(r3) : null);
        boolean b = g0Var.b();
        h0 a = g0Var.a();
    }

    public ParcelableRemoteScreenshotConfig(@NotNull Parcel parcel) {
        this(parcel.readByte() != 0, (D) parcel.readParcelable(D.class.getClassLoader()));
    }
}
