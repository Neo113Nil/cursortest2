package io.intercom.android.sdk.models;

import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/models/HeaderBackdropType;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "COLORS", ShareConstants.IMAGE_URL, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeaderBackdropType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HeaderBackdropType[] $VALUES;

    @SerializedName("solid")
    public static final HeaderBackdropType SOLID = new HeaderBackdropType("SOLID", 0);

    @SerializedName("colors")
    public static final HeaderBackdropType COLORS = new HeaderBackdropType("COLORS", 1);

    @SerializedName("image")
    public static final HeaderBackdropType IMAGE = new HeaderBackdropType(ShareConstants.IMAGE_URL, 2);

    private static final /* synthetic */ HeaderBackdropType[] $values() {
        return new HeaderBackdropType[]{SOLID, COLORS, IMAGE};
    }

    public static EnumEntries<HeaderBackdropType> getEntries() {
        return $ENTRIES;
    }

    private HeaderBackdropType(String str, int i) {
    }

    static {
        HeaderBackdropType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HeaderBackdropType valueOf(String str) {
        return (HeaderBackdropType) Enum.valueOf(HeaderBackdropType.class, str);
    }

    public static HeaderBackdropType[] values() {
        return (HeaderBackdropType[]) $VALUES.clone();
    }
}
