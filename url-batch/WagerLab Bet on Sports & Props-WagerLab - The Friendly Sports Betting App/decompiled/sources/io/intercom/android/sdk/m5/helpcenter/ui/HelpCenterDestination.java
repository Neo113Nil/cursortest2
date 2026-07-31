package io.intercom.android.sdk.m5.helpcenter.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HelpCenterScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterDestination;", "", "<init>", "(Ljava/lang/String;I)V", "COLLECTIONS", "COLLECTION_DETAILS", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterDestination {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HelpCenterDestination[] $VALUES;
    public static final HelpCenterDestination COLLECTIONS = new HelpCenterDestination("COLLECTIONS", 0);
    public static final HelpCenterDestination COLLECTION_DETAILS = new HelpCenterDestination("COLLECTION_DETAILS", 1);

    private static final /* synthetic */ HelpCenterDestination[] $values() {
        return new HelpCenterDestination[]{COLLECTIONS, COLLECTION_DETAILS};
    }

    public static EnumEntries<HelpCenterDestination> getEntries() {
        return $ENTRIES;
    }

    private HelpCenterDestination(String str, int i) {
    }

    static {
        HelpCenterDestination[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HelpCenterDestination valueOf(String str) {
        return (HelpCenterDestination) Enum.valueOf(HelpCenterDestination.class, str);
    }

    public static HelpCenterDestination[] values() {
        return (HelpCenterDestination[]) $VALUES.clone();
    }
}
