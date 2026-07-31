package io.intercom.android.sdk.m5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IntercomRootActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/IntercomDestination;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "MESSAGES", "HELP_CENTER", "CONVERSATION", "TICKETS", "TICKET_DETAIL", "CREATE_TICKET", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomDestination {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntercomDestination[] $VALUES;
    public static final IntercomDestination HOME = new IntercomDestination("HOME", 0);
    public static final IntercomDestination MESSAGES = new IntercomDestination("MESSAGES", 1);
    public static final IntercomDestination HELP_CENTER = new IntercomDestination("HELP_CENTER", 2);
    public static final IntercomDestination CONVERSATION = new IntercomDestination("CONVERSATION", 3);
    public static final IntercomDestination TICKETS = new IntercomDestination("TICKETS", 4);
    public static final IntercomDestination TICKET_DETAIL = new IntercomDestination("TICKET_DETAIL", 5);
    public static final IntercomDestination CREATE_TICKET = new IntercomDestination("CREATE_TICKET", 6);

    private static final /* synthetic */ IntercomDestination[] $values() {
        return new IntercomDestination[]{HOME, MESSAGES, HELP_CENTER, CONVERSATION, TICKETS, TICKET_DETAIL, CREATE_TICKET};
    }

    public static EnumEntries<IntercomDestination> getEntries() {
        return $ENTRIES;
    }

    private IntercomDestination(String str, int i) {
    }

    static {
        IntercomDestination[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static IntercomDestination valueOf(String str) {
        return (IntercomDestination) Enum.valueOf(IntercomDestination.class, str);
    }

    public static IntercomDestination[] values() {
        return (IntercomDestination[]) $VALUES.clone();
    }
}
