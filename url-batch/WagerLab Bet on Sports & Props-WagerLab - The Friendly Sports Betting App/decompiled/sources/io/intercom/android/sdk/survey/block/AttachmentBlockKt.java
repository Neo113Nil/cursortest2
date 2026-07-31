package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachmentBlock.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"AttachmentBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "blockRenderData", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "isAdmin", "", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLandroidx/compose/runtime/Composer;II)V", "TextAttachmentBlock", "blockAttachment", "Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "TextAttachmentBlock-FNF3uiM", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;JLandroidx/compose/runtime/Composer;II)V", "VideoAttachmentBlock", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;Landroidx/compose/runtime/Composer;II)V", "AttachmentBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AttachmentBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachmentBlock$lambda$2(Modifier modifier, BlockRenderData blockRenderData, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        AttachmentBlock(modifier, blockRenderData, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachmentBlockPreview$lambda$7(int i, Composer composer, int i2) {
        AttachmentBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttachmentBlock_FNF3uiM$lambda$5(Modifier modifier, BlockAttachment blockAttachment, long j, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m11695TextAttachmentBlockFNF3uiM(modifier, blockAttachment, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoAttachmentBlock$lambda$6(Modifier modifier, BlockAttachment blockAttachment, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        VideoAttachmentBlock(modifier, blockAttachment, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AttachmentBlock(Modifier modifier, final BlockRenderData blockRenderData, final boolean z, Composer composer, final int i, final int i2) {
        long m5667unboximpl;
        Composer composer2;
        long j;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Composer startRestartGroup = composer.startRestartGroup(-1719159681);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Color m11712getTextColorQN2ZGVo = blockRenderData.getTextStyle().m11712getTextColorQN2ZGVo();
        if (m11712getTextColorQN2ZGVo == null) {
            m11712getTextColorQN2ZGVo = blockRenderData.m11700getTextColorQN2ZGVo();
        }
        startRestartGroup.startReplaceGroup(-1626976079);
        if (m11712getTextColorQN2ZGVo != null) {
            m5667unboximpl = m11712getTextColorQN2ZGVo.m5667unboximpl();
        } else {
            m5667unboximpl = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
        }
        long j2 = m5667unboximpl;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1626970016);
        List<BlockAttachment> attachments = blockRenderData.getBlock().getAttachments();
        Intrinsics.checkNotNullExpressionValue(attachments, "getAttachments(...)");
        for (BlockAttachment blockAttachment : attachments) {
            String contentType = blockAttachment.getContentType();
            Intrinsics.checkNotNullExpressionValue(contentType, "getContentType(...)");
            if (ContentTypeExtensionKt.isVideo(contentType)) {
                startRestartGroup.startReplaceGroup(1321275707);
                Intrinsics.checkNotNull(blockAttachment);
                VideoAttachmentBlock(ClipKt.clip(Modifier.INSTANCE, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), blockAttachment, startRestartGroup, 64, 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                j = j2;
            } else {
                String contentType2 = blockAttachment.getContentType();
                Intrinsics.checkNotNullExpressionValue(contentType2, "getContentType(...)");
                if (ContentTypeExtensionKt.isPdf(contentType2)) {
                    startRestartGroup.startReplaceGroup(1321435977);
                    Intrinsics.checkNotNull(blockAttachment);
                    composer2 = startRestartGroup;
                    j = j2;
                    PdfAttachmentBlockKt.m11734PdfAttachmentBlockww6aTOc(blockAttachment, z, null, j, composer2, ((i >> 3) & 112) | 8, 4);
                    composer2.endReplaceGroup();
                } else {
                    Composer composer3 = startRestartGroup;
                    long j3 = j2;
                    composer3.startReplaceGroup(1321554459);
                    Intrinsics.checkNotNull(blockAttachment);
                    m11695TextAttachmentBlockFNF3uiM(null, blockAttachment, j3, composer3, 64, 1);
                    composer2 = composer3;
                    j = j3;
                    composer2.endReplaceGroup();
                }
            }
            j2 = j;
            startRestartGroup = composer2;
        }
        Composer composer4 = startRestartGroup;
        composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.AttachmentBlockKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AttachmentBlock$lambda$2;
                    AttachmentBlock$lambda$2 = AttachmentBlockKt.AttachmentBlock$lambda$2(Modifier.this, blockRenderData, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AttachmentBlock$lambda$2;
                }
            });
        }
    }

    /* renamed from: TextAttachmentBlock-FNF3uiM, reason: not valid java name */
    public static final void m11695TextAttachmentBlockFNF3uiM(Modifier modifier, final BlockAttachment blockAttachment, long j, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        Composer startRestartGroup = composer.startRestartGroup(-1146554998);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 4) != 0) {
            j2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
            i3 = i & (-897);
        } else {
            j2 = j;
            i3 = i;
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(modifier2, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.AttachmentBlockKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TextAttachmentBlock_FNF3uiM$lambda$3;
                TextAttachmentBlock_FNF3uiM$lambda$3 = AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$3(BlockAttachment.this, context);
                return TextAttachmentBlock_FNF3uiM$lambda$3;
            }
        }, 15, null);
        final Modifier modifier3 = modifier2;
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        final long j3 = j2;
        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_attachment, startRestartGroup, 0), "Attachment Icon", (Modifier) null, j3, startRestartGroup, ((i3 << 3) & 7168) | 56, 4);
        String name = blockAttachment.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TextKt.m3581TextNvy7gAk(name, null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null), startRestartGroup, i3 & 896, 0, 131066);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.AttachmentBlockKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextAttachmentBlock_FNF3uiM$lambda$5;
                    TextAttachmentBlock_FNF3uiM$lambda$5 = AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$5(Modifier.this, blockAttachment, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TextAttachmentBlock_FNF3uiM$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttachmentBlock_FNF3uiM$lambda$3(BlockAttachment blockAttachment, Context context) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(blockAttachment.getUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }

    public static final void VideoAttachmentBlock(Modifier modifier, final BlockAttachment blockAttachment, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        Composer startRestartGroup = composer.startRestartGroup(-745319067);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        VideoFileBlockKt.VideoFileBlock(modifier2, url, null, startRestartGroup, (i & 14) | 384, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.AttachmentBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VideoAttachmentBlock$lambda$6;
                    VideoAttachmentBlock$lambda$6 = AttachmentBlockKt.VideoAttachmentBlock$lambda$6(Modifier.this, blockAttachment, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return VideoAttachmentBlock$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AttachmentBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-550090117);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttachmentBlockKt.INSTANCE.m11718getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.AttachmentBlockKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AttachmentBlockPreview$lambda$7;
                    AttachmentBlockPreview$lambda$7 = AttachmentBlockKt.AttachmentBlockPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AttachmentBlockPreview$lambda$7;
                }
            });
        }
    }
}
