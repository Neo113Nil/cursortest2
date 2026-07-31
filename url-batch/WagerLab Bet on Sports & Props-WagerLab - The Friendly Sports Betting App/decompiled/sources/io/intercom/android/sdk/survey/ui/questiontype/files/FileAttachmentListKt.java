package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileAttachmentList.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a>\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"FileAttachmentList", "", "items", "", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "mediaItem", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FileAttachmentListPreview", "(Landroidx/compose/runtime/Composer;I)V", "FileAttachmentListErrorPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileAttachmentListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$4(List items, Function1 onItemClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(items, "$items");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        FileAttachmentList(items, onItemClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListErrorPreview$lambda$6(int i, Composer composer, int i2) {
        FileAttachmentListErrorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListPreview$lambda$5(int i, Composer composer, int i2) {
        FileAttachmentListPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FileAttachmentList(final List<Answer.MediaAnswer.MediaItem> items, final Function1<? super Answer.MediaAnswer.MediaItem, Unit> onItemClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(-2107060022);
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        startRestartGroup.startReplaceGroup(1339367056);
        for (final Answer.MediaAnswer.MediaItem mediaItem : items) {
            if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                startRestartGroup.startReplaceGroup(-582474763);
                FIleAttachmentListKt.FailedFileAttached(ClickableKt.m303clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FileAttachmentList$lambda$3$lambda$2$lambda$0;
                        FileAttachmentList$lambda$3$lambda$2$lambda$0 = FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$0(Function1.this, mediaItem);
                        return FileAttachmentList$lambda$3$lambda$2$lambda$0;
                    }
                }, 15, null), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), startRestartGroup, 0, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-582164546);
                FIleAttachmentListKt.m11889FileAttachmentvRFhKjU(ClickableKt.m303clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FileAttachmentList$lambda$3$lambda$2$lambda$1;
                        FileAttachmentList$lambda$3$lambda$2$lambda$1 = FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$1(Function1.this, mediaItem);
                        return FileAttachmentList$lambda$3$lambda$2$lambda$1;
                    }
                }, 15, null), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(2007803062, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$FileAttachmentList$1$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FileAttachment, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(FileAttachment, "$this$FileAttachment");
                        if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                            Answer.MediaAnswer.FileUploadStatus uploadStatus = Answer.MediaAnswer.MediaItem.this.getUploadStatus();
                            if (Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                                ProgressIndicatorKt.m3156CircularProgressIndicator4lLiAd8(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), 0L, Dp.m8401constructorimpl(1), 0L, 0, 0.0f, composer2, 390, 58);
                                return;
                            } else {
                                if (!Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Queued)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return;
                            }
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572864, 56);
                startRestartGroup.endReplaceGroup();
            }
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileAttachmentList$lambda$4;
                    FileAttachmentList$lambda$4 = FileAttachmentListKt.FileAttachmentList$lambda$4(items, onItemClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileAttachmentList$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3$lambda$2$lambda$0(Function1 onItemClick, Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        Intrinsics.checkNotNullParameter(it, "$it");
        onItemClick.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3$lambda$2$lambda$1(Function1 onItemClick, Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        Intrinsics.checkNotNullParameter(it, "$it");
        onItemClick.invoke(it);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1973696025);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m11806getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileAttachmentListPreview$lambda$5;
                    FileAttachmentListPreview$lambda$5 = FileAttachmentListKt.FileAttachmentListPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileAttachmentListPreview$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void FileAttachmentListErrorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(232584117);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m11808getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileAttachmentListErrorPreview$lambda$6;
                    FileAttachmentListErrorPreview$lambda$6 = FileAttachmentListKt.FileAttachmentListErrorPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileAttachmentListErrorPreview$lambda$6;
                }
            });
        }
    }
}
