package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PoweredBy.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/models/PoweredBy;", "", "icon", "Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "linkUrl", "", "text", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "getLinkUrl", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "PoweredByIconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PoweredBy {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final PoweredByIconType icon;

    @SerializedName("link_url")
    private final String linkUrl;

    @SerializedName("text")
    private final String text;

    public static /* synthetic */ PoweredBy copy$default(PoweredBy poweredBy, PoweredByIconType poweredByIconType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            poweredByIconType = poweredBy.icon;
        }
        if ((i & 2) != 0) {
            str = poweredBy.linkUrl;
        }
        if ((i & 4) != 0) {
            str2 = poweredBy.text;
        }
        return poweredBy.copy(poweredByIconType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final PoweredBy copy(PoweredByIconType icon, String linkUrl, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        return new PoweredBy(icon, linkUrl, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoweredBy)) {
            return false;
        }
        PoweredBy poweredBy = (PoweredBy) other;
        return this.icon == poweredBy.icon && Intrinsics.areEqual(this.linkUrl, poweredBy.linkUrl) && Intrinsics.areEqual(this.text, poweredBy.text);
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "PoweredBy(icon=" + this.icon + ", linkUrl=" + this.linkUrl + ", text=" + this.text + ')';
    }

    public PoweredBy(PoweredByIconType icon, String linkUrl, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
        this.linkUrl = linkUrl;
        this.text = text;
    }

    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PoweredBy.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "", "<init>", "(Ljava/lang/String;I)V", "INTERCOM", "FIN", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PoweredByIconType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PoweredByIconType[] $VALUES;

        @SerializedName("intercom")
        public static final PoweredByIconType INTERCOM = new PoweredByIconType("INTERCOM", 0);

        @SerializedName("fin")
        public static final PoweredByIconType FIN = new PoweredByIconType("FIN", 1);

        private static final /* synthetic */ PoweredByIconType[] $values() {
            return new PoweredByIconType[]{INTERCOM, FIN};
        }

        public static EnumEntries<PoweredByIconType> getEntries() {
            return $ENTRIES;
        }

        private PoweredByIconType(String str, int i) {
        }

        static {
            PoweredByIconType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static PoweredByIconType valueOf(String str) {
            return (PoweredByIconType) Enum.valueOf(PoweredByIconType.class, str);
        }

        public static PoweredByIconType[] values() {
            return (PoweredByIconType[]) $VALUES.clone();
        }
    }
}
