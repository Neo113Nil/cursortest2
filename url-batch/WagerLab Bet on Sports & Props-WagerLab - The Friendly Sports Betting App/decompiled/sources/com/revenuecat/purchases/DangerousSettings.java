package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DangerousSettings.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "Landroid/os/Parcelable;", "autoSyncPurchases", "", "(Z)V", "customEntitlementComputation", "(ZZ)V", "getAutoSyncPurchases", "()Z", "getCustomEntitlementComputation$purchases_defaultsBc8Release", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DangerousSettings implements Parcelable {
    public static final Parcelable.Creator<DangerousSettings> CREATOR = new Creator();
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    /* compiled from: DangerousSettings.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DangerousSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DangerousSettings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DangerousSettings(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DangerousSettings[] newArray(int i) {
            return new DangerousSettings[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DangerousSettings() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.autoSyncPurchases) * 31) + Boolean.hashCode(this.customEntitlementComputation);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
    }

    public DangerousSettings(boolean z, boolean z2) {
        this.autoSyncPurchases = z;
        this.customEntitlementComputation = z2;
    }

    public /* synthetic */ DangerousSettings(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    /* renamed from: getCustomEntitlementComputation$purchases_defaultsBc8Release, reason: from getter */
    public final boolean getCustomEntitlementComputation() {
        return this.customEntitlementComputation;
    }

    public DangerousSettings(boolean z) {
        this(z, false);
    }

    public /* synthetic */ DangerousSettings(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
