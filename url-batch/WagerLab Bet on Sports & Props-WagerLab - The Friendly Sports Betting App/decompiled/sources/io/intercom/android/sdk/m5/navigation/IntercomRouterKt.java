package io.intercom.android.sdk.m5.navigation;

import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomRouter.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a,\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a*\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a0\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a&\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u001a \u0010\u0015\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a \u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a \u0010\u0017\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u0018"}, d2 = {"openConversation", "", "Landroidx/navigation/NavHostController;", "conversationId", "", "initialMessage", "isLaunchedProgrammatically", "", "articleId", "navOptions", "Landroidx/navigation/NavOptions;", "transitionArgs", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "openNewConversation", "openTicketDetailScreen", "showSubmissionCard", "ticketId", "from", "openCreateTicketsScreen", "ticketTypeData", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "openMessages", "openHelpCenter", "openTicketList", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomRouterKt {
    public static /* synthetic */ void openConversation$default(NavHostController navHostController, String str, String str2, boolean z, String str3, NavOptions navOptions, TransitionArgs transitionArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            navOptions = null;
        }
        if ((i & 32) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openConversation(navHostController, str, str2, z, str3, navOptions, transitionArgs);
    }

    public static final void openConversation(NavHostController navHostController, String str, String str2, boolean z, String str3, NavOptions navOptions, TransitionArgs transitionArgs) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavHostController navHostController2 = navHostController;
        if (str2 == null) {
            str2 = "";
        }
        NavController.navigate$default((NavController) navHostController2, new IntercomRootActivityArgs.ConversationScreenArgs(str, str2, z, str3, null, transitionArgs, 16, null).getRoute(), navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public static /* synthetic */ void openNewConversation$default(NavHostController navHostController, boolean z, NavOptions navOptions, TransitionArgs transitionArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openNewConversation(navHostController, z, navOptions, transitionArgs);
    }

    public static final void openNewConversation(NavHostController navHostController, boolean z, NavOptions navOptions, TransitionArgs transitionArgs) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        openConversation$default(navHostController, null, null, z, null, navOptions, transitionArgs, 11, null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(NavHostController navHostController, boolean z, TransitionArgs transitionArgs, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        openTicketDetailScreen(navHostController, z, transitionArgs, z2);
    }

    public static final void openTicketDetailScreen(NavHostController navHostController, boolean z, TransitionArgs transitionArgs, boolean z2) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavController.navigate$default((NavController) navHostController, "TICKET_DETAIL?show_submission_card=" + z + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z2, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(NavHostController navHostController, String str, String str2, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 8) != 0) {
            z = false;
        }
        openTicketDetailScreen(navHostController, str, str2, transitionArgs, z);
    }

    public static final void openTicketDetailScreen(NavHostController navHostController, String ticketId, String from, TransitionArgs transitionArgs, boolean z) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavController.navigate$default((NavController) navHostController, "TICKET_DETAIL/" + ticketId + "?from=" + from + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static final void openCreateTicketsScreen(NavHostController navHostController, TicketType ticketTypeData, String str, String from) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(ticketTypeData, "ticketTypeData");
        Intrinsics.checkNotNullParameter(from, "from");
        NavController.navigate$default((NavController) navHostController, "CREATE_TICKET/" + ticketTypeData.getId() + "?conversation_id=" + str + "?from=" + from, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static /* synthetic */ void openMessages$default(NavHostController navHostController, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openMessages(navHostController, transitionArgs, z);
    }

    public static final void openMessages(NavHostController navHostController, TransitionArgs transitionArgs, boolean z) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavController.navigate$default((NavController) navHostController, "MESSAGES?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static /* synthetic */ void openHelpCenter$default(NavHostController navHostController, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openHelpCenter(navHostController, transitionArgs, z);
    }

    public static final void openHelpCenter(NavHostController navHostController, TransitionArgs transitionArgs, boolean z) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavController.navigate$default((NavController) navHostController, "HELP_CENTER?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public static /* synthetic */ void openTicketList$default(NavHostController navHostController, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openTicketList(navHostController, transitionArgs, z);
    }

    public static final void openTicketList(NavHostController navHostController, TransitionArgs transitionArgs, boolean z) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        NavController.navigate$default((NavController) navHostController, "TICKETS?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }
}
