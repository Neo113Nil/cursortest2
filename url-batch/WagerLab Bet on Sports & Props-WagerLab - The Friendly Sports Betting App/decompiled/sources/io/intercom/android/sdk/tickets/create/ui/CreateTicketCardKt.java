package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketCard.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\"\u0018\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"CreateTicketCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "blockRenderData", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", ViewProps.ENABLED, "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EnabledCreateTicketCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "DisabledCreateTicketCardPreview", "sampleBlock", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "kotlin.jvm.PlatformType", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateTicketCardKt {
    private static final Block sampleBlock = new Block.Builder().withType(BlockType.CREATETICKETCARD.getSerializedName()).withText("Admin has requested you to create a ticket").withTitle("Create ticket").withTicketTypeTitle("Bug").withTicketType(new TicketType(1234, "Bug", "🎟", CollectionsKt.emptyList(), false)).build();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketCard$lambda$0(Modifier modifier, BlockRenderData blockRenderData, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        CreateTicketCard(modifier, blockRenderData, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledCreateTicketCardPreview$lambda$2(int i, Composer composer, int i2) {
        DisabledCreateTicketCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnabledCreateTicketCardPreview$lambda$1(int i, Composer composer, int i2) {
        EnabledCreateTicketCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CreateTicketCard(Modifier modifier, final BlockRenderData blockRenderData, final boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Composer startRestartGroup = composer.startRestartGroup(-214450953);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Function0<Unit> function02 = (i2 & 8) != 0 ? null : function0;
        IntercomCardKt.IntercomCard(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), IntercomCardStyle.INSTANCE.m11975conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31), ComposableLambdaKt.rememberComposableLambda(1721044843, true, new CreateTicketCardKt$CreateTicketCard$1(z, function02, blockRenderData), startRestartGroup, 54), startRestartGroup, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0<Unit> function03 = function02;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketCard$lambda$0;
                    CreateTicketCard$lambda$0 = CreateTicketCardKt.CreateTicketCard$lambda$0(Modifier.this, blockRenderData, z, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketCard$lambda$0;
                }
            });
        }
    }

    private static final void EnabledCreateTicketCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1535832576);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m11906getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EnabledCreateTicketCardPreview$lambda$1;
                    EnabledCreateTicketCardPreview$lambda$1 = CreateTicketCardKt.EnabledCreateTicketCardPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EnabledCreateTicketCardPreview$lambda$1;
                }
            });
        }
    }

    private static final void DisabledCreateTicketCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1443652823);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m11907getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisabledCreateTicketCardPreview$lambda$2;
                    DisabledCreateTicketCardPreview$lambda$2 = CreateTicketCardKt.DisabledCreateTicketCardPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisabledCreateTicketCardPreview$lambda$2;
                }
            });
        }
    }
}
