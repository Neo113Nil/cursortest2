package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "", "name", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TicketProgressRowState {
    public static final int $stable = 0;
    private final String name;
    private final String status;

    public static /* synthetic */ TicketProgressRowState copy$default(TicketProgressRowState ticketProgressRowState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketProgressRowState.name;
        }
        if ((i & 2) != 0) {
            str2 = ticketProgressRowState.status;
        }
        return ticketProgressRowState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final TicketProgressRowState copy(String name, String status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TicketProgressRowState(name, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketProgressRowState)) {
            return false;
        }
        TicketProgressRowState ticketProgressRowState = (TicketProgressRowState) other;
        return Intrinsics.areEqual(this.name, ticketProgressRowState.name) && Intrinsics.areEqual(this.status, ticketProgressRowState.status);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "TicketProgressRowState(name=" + this.name + ", status=" + this.status + ')';
    }

    public TicketProgressRowState(String name, String status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        this.name = name;
        this.status = status;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStatus() {
        return this.status;
    }
}
