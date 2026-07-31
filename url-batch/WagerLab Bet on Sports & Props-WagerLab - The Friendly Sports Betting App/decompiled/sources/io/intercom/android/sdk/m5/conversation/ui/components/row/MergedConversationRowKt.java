package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MergedConversationRow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MergedConversationRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "description", "", "conversationId", "onConversationClick", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MergedConversationRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MergedConversationRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$4(Modifier modifier, String description, String conversationId, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(description, "$description");
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        MergedConversationRow(modifier, description, conversationId, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRowPreview$lambda$5(int i, Composer composer, int i2) {
        MergedConversationRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MergedConversationRow(Modifier modifier, final String description, String str, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super String, Unit> function12;
        int hashCode;
        Composer m4976constructorimpl;
        Function1<? super String, Unit> function13;
        Modifier modifier3;
        boolean z;
        Object rememberedValue;
        final Function1<? super String, Unit> function14;
        Composer composer2;
        final Function1<? super String, Unit> function15;
        ScopeUpdateScope endRestartGroup;
        final String conversationId = str;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Composer startRestartGroup = composer.startRestartGroup(-635122177);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(description) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(conversationId) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    function12 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MergedConversationRow$lambda$0;
                            MergedConversationRow$lambda$0 = MergedConversationRowKt.MergedConversationRow$lambda$0((String) obj);
                            return MergedConversationRow$lambda$0;
                        }
                    };
                }
                Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(companion, Dp.m8401constructorimpl(16), 0.0f, 2, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                function13 = function12;
                int i6 = i3;
                modifier3 = companion;
                TextKt.m3581TextNvy7gAk(description, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, (i3 >> 3) & 14, 0, 130042);
                SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4)), startRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                startRestartGroup.startReplaceGroup(-1680452062);
                z = ((i6 & 7168) != 2048) | ((i6 & 896) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    conversationId = str;
                    function14 = function13;
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MergedConversationRow$lambda$3$lambda$2$lambda$1;
                            MergedConversationRow$lambda$3$lambda$2$lambda$1 = MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(Function1.this, conversationId);
                            return MergedConversationRow$lambda$3$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                } else {
                    conversationId = str;
                    function14 = function13;
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_view_conversation, startRestartGroup, 0), ClickableKt.m303clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) rememberedValue, 15, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 130040);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                function15 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                function15 = function12;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final String str2 = conversationId;
                final Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MergedConversationRow$lambda$4;
                        MergedConversationRow$lambda$4 = MergedConversationRowKt.MergedConversationRow$lambda$4(Modifier.this, description, str2, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MergedConversationRow$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        Modifier m839paddingVpY3zN4$default2 = PaddingKt.m839paddingVpY3zN4$default(companion, Dp.m8401constructorimpl(16), 0.0f, 2, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        function13 = function12;
        int i62 = i3;
        modifier3 = companion;
        TextKt.m3581TextNvy7gAk(description, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, (i3 >> 3) & 14, 0, 130042);
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4)), startRestartGroup, 6);
        Modifier.Companion companion22 = Modifier.INSTANCE;
        startRestartGroup.startReplaceGroup(-1680452062);
        z = ((i62 & 7168) != 2048) | ((i62 & 896) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (z) {
        }
        conversationId = str;
        function14 = function13;
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MergedConversationRow$lambda$3$lambda$2$lambda$1;
                MergedConversationRow$lambda$3$lambda$2$lambda$1 = MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(Function1.this, conversationId);
                return MergedConversationRow$lambda$3$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_view_conversation, startRestartGroup, 0), ClickableKt.m303clickableoSLSa3U$default(companion22, false, null, null, null, (Function0) rememberedValue, 15, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 130040);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        function15 = function14;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$3$lambda$2$lambda$1(Function1 function1, String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        function1.invoke(conversationId);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void MergedConversationRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-243500111);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MergedConversationRowKt.INSTANCE.m11410getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MergedConversationRowPreview$lambda$5;
                    MergedConversationRowPreview$lambda$5 = MergedConversationRowKt.MergedConversationRowPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MergedConversationRowPreview$lambda$5;
                }
            });
        }
    }
}
