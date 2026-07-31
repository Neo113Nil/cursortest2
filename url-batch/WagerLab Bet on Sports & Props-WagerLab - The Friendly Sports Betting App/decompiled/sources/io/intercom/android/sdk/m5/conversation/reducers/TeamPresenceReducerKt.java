package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeamPresenceReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"reduceTeamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "openMessengerResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TeamPresenceReducerKt {
    public static final TeamPresenceState reduceTeamPresenceState(Conversation conversation, OpenMessengerResponse openMessengerResponse) {
        Header.Expanded expanded;
        Header header;
        ExpandedTeamPresenceState expandedTeamPresenceState;
        String teamIntro;
        String specialNotice;
        Header header2;
        AvatarType avatarType;
        ArrayList emptyList;
        List<Avatar.Builder> avatars;
        Header header3;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (conversation == null || (header3 = conversation.getHeader()) == null || (expanded = header3.getExpanded()) == null) {
            expanded = (newConversationData == null || (header = newConversationData.getHeader()) == null) ? null : header.getExpanded();
        }
        if (expanded != null) {
            if (conversation == null || (header2 = conversation.getHeader()) == null) {
                header2 = newConversationData != null ? newConversationData.getHeader() : null;
            }
            String title = expanded.getTitle();
            List<Header.Expanded.Body> body = expanded.getBody();
            AvatarDetails avatarDetails = expanded.getAvatarDetails();
            if (avatarDetails == null || (avatarType = avatarDetails.getAvatarType()) == null) {
                avatarType = AvatarType.UNKNOWN;
            }
            AvatarType avatarType2 = avatarType;
            AvatarDetails avatarDetails2 = expanded.getAvatarDetails();
            if (avatarDetails2 == null || (avatars = avatarDetails2.getAvatars()) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<Avatar.Builder> list = avatars;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Avatar build = ((Avatar.Builder) it.next()).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    arrayList.add(new AvatarWrapper(build, false));
                }
                emptyList = arrayList;
            }
            expandedTeamPresenceState = new ExpandedTeamPresenceState(title, body, avatarType2, emptyList, expanded.getFooter(), expanded.getSocialAccounts(), header2 != null ? header2.getDisplayActiveIndicator() : false);
        } else {
            expandedTeamPresenceState = ExpandedTeamPresenceState.INSTANCE.getDefault();
        }
        String str = "";
        if (conversation == null || (teamIntro = conversation.getTeamIntro()) == null) {
            teamIntro = newConversationData != null ? newConversationData.getTeamIntro() : null;
            if (teamIntro == null) {
                teamIntro = "";
            }
        }
        if (conversation == null || (specialNotice = conversation.getSpecialNotice()) == null) {
            String specialNotice2 = newConversationData != null ? newConversationData.getSpecialNotice() : null;
            if (specialNotice2 != null) {
                str = specialNotice2;
            }
        } else {
            str = specialNotice;
        }
        return new TeamPresenceState(expandedTeamPresenceState, teamIntro, str);
    }
}
