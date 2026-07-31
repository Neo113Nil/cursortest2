package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExternalLinkCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ExternalLinkCardKt$ExternalLinkCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeCards.HomeExternalLinkData $homeExternalLinkData;

    ExternalLinkCardKt$ExternalLinkCard$1(HomeCards.HomeExternalLinkData homeExternalLinkData, Context context) {
        this.$homeExternalLinkData = homeExternalLinkData;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        HomeCards.HomeExternalLinkData homeExternalLinkData;
        Context context;
        String str;
        Object obj;
        String str2;
        Object obj2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            HomeCards.HomeExternalLinkData homeExternalLinkData2 = this.$homeExternalLinkData;
            Context context2 = this.$context;
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-433115947);
            String cardTitle = homeExternalLinkData2.getCardTitle();
            if (cardTitle == null || StringsKt.isBlank(cardTitle)) {
                homeExternalLinkData = homeExternalLinkData2;
                context = context2;
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                obj = null;
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            } else {
                homeExternalLinkData = homeExternalLinkData2;
                context = context2;
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                obj = null;
                TextKt.m3581TextNvy7gAk(homeExternalLinkData2.getCardTitle(), PaddingKt.m841paddingqDBjuR0$default(PaddingKt.m839paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8401constructorimpl(16), 0.0f, 2, null), 0.0f, Dp.m8401constructorimpl(12), 0.0f, Dp.m8401constructorimpl(4), 5, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04SemiBold(), composer, 48, 0, 131068);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-433100991);
            int i2 = 0;
            for (Object obj3 : homeExternalLinkData.getLinks()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Link link = (Link) obj3;
                final Context context3 = context;
                float f = 16;
                Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(ClickableKt.m303clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$ExternalLinkCard$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2$lambda$0;
                        invoke$lambda$3$lambda$2$lambda$0 = ExternalLinkCardKt$ExternalLinkCard$1.invoke$lambda$3$lambda$2$lambda$0(Link.this, context3);
                        return invoke$lambda$3$lambda$2$lambda$0;
                    }
                }, 15, null), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(12));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                String str3 = str;
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str3);
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m838paddingVpY3zN4);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                String str4 = str2;
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer2);
                Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                context = context3;
                int i4 = i2;
                str2 = str4;
                TextKt.m3581TextNvy7gAk(link.getLabel(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer, 1572864, 24960, 241596);
                composer2 = composer;
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer2, 6);
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_open_help_center, composer2, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), composer2, 440, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-433061728);
                if (i4 != homeExternalLinkData.getLinks().size() - 1) {
                    obj2 = null;
                    IntercomDividerKt.IntercomDivider(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(f), 0.0f, 2, null), composer2, 6, 0);
                } else {
                    obj2 = null;
                }
                composer2.endReplaceGroup();
                obj = obj2;
                i2 = i3;
                str = str3;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$0(Link item, Context context) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(context, "$context");
        Injector.get().getMetricTracker().clickedExternalLinkCard();
        LinkOpener.handleUrl(item.getUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }
}
