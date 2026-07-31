package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AbstractComposeView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeamPresenceComponent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u001a\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001cR/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponent;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "teamPresenceState", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "setTeamPresenceState", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "teamPresenceState$delegate", "Landroidx/compose/runtime/MutableState;", "", "needsChatBubble", "getNeedsChatBubble", "()Z", "setNeedsChatBubble", "(Z)V", "needsChatBubble$delegate", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TeamPresenceComponent extends AbstractComposeView {
    public static final int $stable = 0;

    /* renamed from: needsChatBubble$delegate, reason: from kotlin metadata */
    private final MutableState needsChatBubble;

    /* renamed from: teamPresenceState$delegate, reason: from kotlin metadata */
    private final MutableState teamPresenceState;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(TeamPresenceComponent tmp1_rcvr, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(tmp1_rcvr, "$tmp1_rcvr");
        tmp1_rcvr.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ TeamPresenceComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.teamPresenceState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.needsChatBubble = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.teamPresenceState.getValue();
    }

    public final void setTeamPresenceState(ArticleViewState.TeamPresenceState teamPresenceState) {
        this.teamPresenceState.setValue(teamPresenceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNeedsChatBubble() {
        return ((Boolean) this.needsChatBubble.getValue()).booleanValue();
    }

    public final void setNeedsChatBubble(boolean z) {
        this.needsChatBubble.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1850798977);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            final ArticleViewState.TeamPresenceState teamPresenceState = getTeamPresenceState();
            if (teamPresenceState != null) {
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, ComposableLambdaKt.rememberComposableLambda(-1302062926, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent$Content$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                            if (TeamPresenceComponent.this.getNeedsChatBubble()) {
                                composer2.startReplaceGroup(-365619251);
                                TeamPresenceComponentKt.TeamPresenceComponentWithBubble(teamPresenceState, composer2, 0);
                                composer2.endReplaceGroup();
                                return;
                            } else {
                                composer2.startReplaceGroup(-365539209);
                                TeamPresenceComponentKt.TeamPresenceComponent(teamPresenceState, false, null, composer2, 0, 6);
                                composer2.endReplaceGroup();
                                return;
                            }
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, 56);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Content$lambda$1;
                    Content$lambda$1 = TeamPresenceComponent.Content$lambda$1(TeamPresenceComponent.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Content$lambda$1;
                }
            });
        }
    }
}
