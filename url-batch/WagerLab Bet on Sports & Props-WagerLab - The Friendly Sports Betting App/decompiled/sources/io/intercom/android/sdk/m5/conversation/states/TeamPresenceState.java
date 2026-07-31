package io.intercom.android.sdk.m5.conversation.states;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "", "expandedTeamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "teamIntro", "", "specialNotice", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;Ljava/lang/String;Ljava/lang/String;)V", "getExpandedTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "getTeamIntro", "()Ljava/lang/String;", "getSpecialNotice", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TeamPresenceState {
    public static final int $stable = 8;
    private final ExpandedTeamPresenceState expandedTeamPresenceState;
    private final String specialNotice;
    private final String teamIntro;

    public TeamPresenceState(ExpandedTeamPresenceState expandedTeamPresenceState, String teamIntro, String specialNotice) {
        Intrinsics.checkNotNullParameter(expandedTeamPresenceState, "expandedTeamPresenceState");
        Intrinsics.checkNotNullParameter(teamIntro, "teamIntro");
        Intrinsics.checkNotNullParameter(specialNotice, "specialNotice");
        this.expandedTeamPresenceState = expandedTeamPresenceState;
        this.teamIntro = teamIntro;
        this.specialNotice = specialNotice;
    }

    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }
}
