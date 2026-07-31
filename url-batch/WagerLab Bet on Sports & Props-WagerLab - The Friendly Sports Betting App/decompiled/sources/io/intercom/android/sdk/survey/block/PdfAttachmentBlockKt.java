package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import coil.compose.SubcomposeAsyncImageKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PdfAttachmentBlock.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"PdfAttachmentBlock", "", "blockAttachment", "Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;", "isAdmin", "", "modifier", "Landroidx/compose/ui/Modifier;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "PdfAttachmentBlock-ww6aTOc", "(Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;ZLandroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "PdfDetails", "Landroidx/compose/foundation/layout/RowScope;", "PdfDetails-FNF3uiM", "(Landroidx/compose/foundation/layout/RowScope;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;JZLandroidx/compose/runtime/Composer;I)V", "PdfThumbnail", "context", "Landroid/content/Context;", "cacheKey", "", "density", "Landroidx/compose/ui/unit/Density;", "pdfSize", "Landroidx/compose/ui/unit/Dp;", "PdfThumbnail-3xixttE", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;Landroidx/compose/ui/unit/Density;FLandroidx/compose/runtime/Composer;I)V", "PdfAttachmentBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PdfAttachmentBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlockPreview$lambda$8(int i, Composer composer, int i2) {
        PdfAttachmentBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlock_ww6aTOc$lambda$2(BlockAttachment blockAttachment, boolean z, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m11734PdfAttachmentBlockww6aTOc(blockAttachment, z, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfDetails_FNF3uiM$lambda$4(RowScope this_PdfDetails, BlockAttachment blockAttachment, long j, boolean z, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(this_PdfDetails, "$this_PdfDetails");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m11735PdfDetailsFNF3uiM(this_PdfDetails, blockAttachment, j, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfThumbnail_3xixttE$lambda$7(Context context, String str, BlockAttachment blockAttachment, Density density, float f, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(density, "$density");
        m11736PdfThumbnail3xixttE(context, str, blockAttachment, density, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: PdfAttachmentBlock-ww6aTOc, reason: not valid java name */
    public static final void m11734PdfAttachmentBlockww6aTOc(final BlockAttachment blockAttachment, final boolean z, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        Composer composer2;
        long j3;
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        Composer startRestartGroup = composer.startRestartGroup(369048797);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
        } else {
            j2 = j;
            i3 = i;
        }
        float m8401constructorimpl = Dp.m8401constructorimpl(90);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume2;
        final String stringResource = StringResources_androidKt.stringResource(R.string.intercom_permission_denied, startRestartGroup, 0);
        final String stringResource2 = StringResources_androidKt.stringResource(R.string.intercom_file_saved, startRestartGroup, 0);
        final String stringResource3 = StringResources_androidKt.stringResource(R.string.intercom_something_went_wrong_try_again, startRestartGroup, 0);
        final String stringResource4 = StringResources_androidKt.stringResource(R.string.intercom_saving, startRestartGroup, 0);
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        String str = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) url, new String[]{"?"}, false, 0, 6, (Object) null));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        float f = 4;
        Modifier m840paddingqDBjuR0 = PaddingKt.m840paddingqDBjuR0(ClickableKt.m303clickableoSLSa3U$default(SizeKt.wrapContentSize$default(modifier2, null, false, 3, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit PdfAttachmentBlock_ww6aTOc$lambda$0;
                PdfAttachmentBlock_ww6aTOc$lambda$0 = PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$0(context, blockAttachment, stringResource4, stringResource2, stringResource3, stringResource);
                return PdfAttachmentBlock_ww6aTOc$lambda$0;
            }
        }, 15, null), Dp.m8401constructorimpl(z ? 16 : 4), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(z ? 4 : 16), Dp.m8401constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m840paddingqDBjuR0);
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
        if (z) {
            startRestartGroup.startReplaceGroup(189348674);
            composer2 = startRestartGroup;
            long j4 = j2;
            m11735PdfDetailsFNF3uiM(rowScopeInstance, blockAttachment, j4, true, composer2, 3142 | ((i3 >> 3) & 896));
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer2, 6);
            m11736PdfThumbnail3xixttE(context, str, blockAttachment, density, m8401constructorimpl, composer2, 25096);
            composer2.endReplaceGroup();
            j3 = j4;
        } else {
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(189553057);
            m11736PdfThumbnail3xixttE(context, str, blockAttachment, density, m8401constructorimpl, composer2, 25096);
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer2, 6);
            j3 = j2;
            m11735PdfDetailsFNF3uiM(rowScopeInstance, blockAttachment, j3, false, composer2, 3142 | ((i3 >> 3) & 896));
            composer2.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final long j5 = j3;
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PdfAttachmentBlock_ww6aTOc$lambda$2;
                    PdfAttachmentBlock_ww6aTOc$lambda$2 = PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$2(BlockAttachment.this, z, modifier3, j5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PdfAttachmentBlock_ww6aTOc$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlock_ww6aTOc$lambda$0(Context context, BlockAttachment blockAttachment, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(fileSavingText, "$fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "$fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "$saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "$permissionDeniedText");
        IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.INSTANCE;
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        List listOf = CollectionsKt.listOf(new IntercomPreviewFile.NetworkFile(url, "application/pdf"));
        String url2 = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
        context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listOf, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: PdfDetails-FNF3uiM, reason: not valid java name */
    private static final void m11735PdfDetailsFNF3uiM(final RowScope rowScope, final BlockAttachment blockAttachment, final long j, final boolean z, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1205911716);
        Modifier weight = rowScope.weight(Modifier.INSTANCE, 1.0f, false);
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Horizontal start = z ? companion.getStart() : companion.getEnd();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, start, startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, weight);
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
        String name = blockAttachment.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        int i2 = i & 896;
        TextKt.m3581TextNvy7gAk(name, null, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, i2, 24960, 110586);
        String humanFileSize = blockAttachment.getHumanFileSize();
        Intrinsics.checkNotNullExpressionValue(humanFileSize, "getHumanFileSize(...)");
        TextKt.m3581TextNvy7gAk(humanFileSize, null, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), startRestartGroup, i2, 24960, 110586);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PdfDetails_FNF3uiM$lambda$4;
                    PdfDetails_FNF3uiM$lambda$4 = PdfAttachmentBlockKt.PdfDetails_FNF3uiM$lambda$4(RowScope.this, blockAttachment, j, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PdfDetails_FNF3uiM$lambda$4;
                }
            });
        }
    }

    /* renamed from: PdfThumbnail-3xixttE, reason: not valid java name */
    private static final void m11736PdfThumbnail3xixttE(final Context context, final String str, final BlockAttachment blockAttachment, final Density density, final float f, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1296049859);
        SubcomposeAsyncImageKt.m9203SubcomposeAsyncImageTCQMD7g(new ImageRequest.Builder(context).memoryCacheKey(str).diskCacheKey(str).data(blockAttachment.getUrl()).size((int) density.mo424toPx0680j_4(f), (int) density.mo424toPx0680j_4(f)).crossfade(true).error(R.drawable.intercom_image_load_failed).build(), blockAttachment.getName(), IntercomImageLoaderKt.getImageLoader(context), SizeKt.m889size3ABfNKs(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(5))), f), null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m11721getLambda1$intercom_sdk_base_release(), null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m11722getLambda2$intercom_sdk_base_release(), null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, startRestartGroup, 12780040, 384, 257872);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PdfThumbnail_3xixttE$lambda$7;
                    PdfThumbnail_3xixttE$lambda$7 = PdfAttachmentBlockKt.PdfThumbnail_3xixttE$lambda$7(context, str, blockAttachment, density, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PdfThumbnail_3xixttE$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PdfAttachmentBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1883421095);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m11724getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PdfAttachmentBlockPreview$lambda$8;
                    PdfAttachmentBlockPreview$lambda$8 = PdfAttachmentBlockKt.PdfAttachmentBlockPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PdfAttachmentBlockPreview$lambda$8;
                }
            });
        }
    }
}
