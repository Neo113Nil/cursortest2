package io.intercom.android.sdk.tickets;

import androidx.compose.ui.graphics.ColorKt;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TicketDetailReducer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketStatus;", "", "color", "Landroidx/compose/ui/graphics/Color;", "iconRes", "", "<init>", "(Ljava/lang/String;IJI)V", "getColor-0d7_KjU", "()J", "J", "getIconRes", "()I", "Submitted", "InProgress", "WaitingOnCustomer", "Resolved", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TicketStatus[] $VALUES;
    private final long color;
    private final int iconRes;
    public static final TicketStatus Submitted = new TicketStatus("Submitted", 0, ColorKt.Color(4278212607L), R.drawable.intercom_ticket_submitted_icon);
    public static final TicketStatus InProgress = new TicketStatus("InProgress", 1, ColorKt.Color(4278212607L), R.drawable.intercom_ticket_submitted_icon);
    public static final TicketStatus WaitingOnCustomer = new TicketStatus("WaitingOnCustomer", 2, ColorKt.Color(4291644690L), R.drawable.intercom_ticket_waiting_icon);
    public static final TicketStatus Resolved = new TicketStatus("Resolved", 3, ColorKt.Color(4279072050L), R.drawable.intercom_ticket_resolved_icon);

    private static final /* synthetic */ TicketStatus[] $values() {
        return new TicketStatus[]{Submitted, InProgress, WaitingOnCustomer, Resolved};
    }

    public static EnumEntries<TicketStatus> getEntries() {
        return $ENTRIES;
    }

    private TicketStatus(String str, int i, long j, int i2) {
        this.color = j;
        this.iconRes = i2;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    static {
        TicketStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TicketStatus valueOf(String str) {
        return (TicketStatus) Enum.valueOf(TicketStatus.class, str);
    }

    public static TicketStatus[] values() {
        return (TicketStatus[]) $VALUES.clone();
    }
}
