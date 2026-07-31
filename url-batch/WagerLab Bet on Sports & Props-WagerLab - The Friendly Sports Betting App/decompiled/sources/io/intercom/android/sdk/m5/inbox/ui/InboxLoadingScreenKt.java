package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxLoadingScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"InboxLoadingScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "HomeLoadingContentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InboxLoadingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLoadingContentPreview$lambda$1(int i, Composer composer, int i2) {
        HomeLoadingContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxLoadingScreen$lambda$0(int i, Composer composer, int i2) {
        InboxLoadingScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InboxLoadingScreen(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1280547936);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_inbox_loading_state, startRestartGroup, 0, 1);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxLoadingScreen$lambda$0;
                    InboxLoadingScreen$lambda$0 = InboxLoadingScreenKt.InboxLoadingScreen$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxLoadingScreen$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void HomeLoadingContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1591477138);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            InboxLoadingScreen(startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxLoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeLoadingContentPreview$lambda$1;
                    HomeLoadingContentPreview$lambda$1 = InboxLoadingScreenKt.HomeLoadingContentPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeLoadingContentPreview$lambda$1;
                }
            });
        }
    }
}
