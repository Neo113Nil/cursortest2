package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.WindowCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileActionSheet.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"FileActionSheet", "", "item", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "onRetryClick", "Lkotlin/Function0;", "onDeleteClick", "onStopUploading", ActionType.DISMISS, "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FileActionSheetUploadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "FileActionSheetQueuedPreview", "FileActionSheetPreviewForStatus", "uploadStatus", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileActionSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$6(Answer.MediaAnswer.MediaItem item, Function0 onRetryClick, Function0 onDeleteClick, Function0 onStopUploading, Function0 dismiss, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(onRetryClick, "$onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(onStopUploading, "$onStopUploading");
        Intrinsics.checkNotNullParameter(dismiss, "$dismiss");
        FileActionSheet(item, onRetryClick, onDeleteClick, onStopUploading, dismiss, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetPreviewForStatus$lambda$9(Answer.MediaAnswer.FileUploadStatus uploadStatus, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(uploadStatus, "$uploadStatus");
        FileActionSheetPreviewForStatus(uploadStatus, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetQueuedPreview$lambda$8(int i, Composer composer, int i2) {
        FileActionSheetQueuedPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetUploadingPreview$lambda$7(int i, Composer composer, int i2) {
        FileActionSheetUploadingPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FileActionSheet(final Answer.MediaAnswer.MediaItem item, final Function0<Unit> onRetryClick, Function0<Unit> onDeleteClick, final Function0<Unit> onStopUploading, final Function0<Unit> dismiss, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onStopUploading, "onStopUploading");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer startRestartGroup = composer.startRestartGroup(592767504);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onRetryClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onDeleteClick) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onStopUploading) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(dismiss) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceGroup(-984100944);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(item.getUploadStatus(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (!Intrinsics.areEqual(mutableState.getValue(), item.getUploadStatus())) {
                dismiss.invoke();
            }
            mutableState.setValue(item.getUploadStatus());
            Answer.MediaAnswer.FileUploadStatus uploadStatus = item.getUploadStatus();
            if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                startRestartGroup.startReplaceGroup(-442066387);
                int i3 = i2 << 3;
                FileUploadErrorComponentKt.FileUploadErrorComponent(item.getData().getFileName(), ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError(), onRetryClick, onDeleteClick, startRestartGroup, (i3 & 7168) | (i3 & 896) | 64);
                function0 = onDeleteClick;
                startRestartGroup.endReplaceGroup();
            } else {
                function0 = onDeleteClick;
                if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                    startRestartGroup.startReplaceGroup(-441779513);
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view = (View) consume;
                    ViewParent parent = view.getParent();
                    DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
                    final Window window = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
                    startRestartGroup.startReplaceGroup(-984074315);
                    if (window != null) {
                        EffectsKt.SideEffect(new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit FileActionSheet$lambda$2$lambda$1;
                                FileActionSheet$lambda$2$lambda$1 = FileActionSheetKt.FileActionSheet$lambda$2$lambda$1(window, view);
                                return FileActionSheet$lambda$2$lambda$1;
                            }
                        }, startRestartGroup, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5683getBlack0d7_KjU(), null, 2, null);
                    IntercomPreviewArgs intercomPreviewArgs = new IntercomPreviewArgs(CollectionsKt.listOf(new IntercomPreviewFile.LocalFile(item.getData().getUri())), DeleteType.Delete.INSTANCE, null, false, null, 28, null);
                    startRestartGroup.startReplaceGroup(-984055211);
                    boolean z = (i2 & 896) == 256;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FileActionSheet$lambda$4$lambda$3;
                                FileActionSheet$lambda$4$lambda$3 = FileActionSheetKt.FileActionSheet$lambda$4$lambda$3(Function0.this, (IntercomPreviewFile) obj);
                                return FileActionSheet$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    PreviewRootScreenKt.PreviewRootScreen(m262backgroundbw27NRU$default, intercomPreviewArgs, null, dismiss, (Function1) rememberedValue2, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FileActionSheet$lambda$5;
                            FileActionSheet$lambda$5 = FileActionSheetKt.FileActionSheet$lambda$5((List) obj);
                            return FileActionSheet$lambda$5;
                        }
                    }, startRestartGroup, (IntercomPreviewArgs.$stable << 3) | 196614 | ((i2 >> 3) & 7168), 4);
                    startRestartGroup = startRestartGroup;
                    startRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-440835873);
                    FileUploadProgressComponentKt.FileUploadProgressComponent(item.getData().getFileName(), onStopUploading, startRestartGroup, (i2 >> 6) & 112);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(-984092382);
                        startRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-440655298);
                    startRestartGroup.endReplaceGroup();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function0 = onDeleteClick;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0<Unit> function02 = function0;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileActionSheet$lambda$6;
                    FileActionSheet$lambda$6 = FileActionSheetKt.FileActionSheet$lambda$6(Answer.MediaAnswer.MediaItem.this, onRetryClick, function02, onStopUploading, dismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileActionSheet$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$2$lambda$1(Window window, View view) {
        Intrinsics.checkNotNullParameter(window, "$window");
        Intrinsics.checkNotNullParameter(view, "$view");
        WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$4$lambda$3(Function0 onDeleteClick, IntercomPreviewFile it) {
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(it, "it");
        onDeleteClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void FileActionSheetUploadingPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(31049684);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE, startRestartGroup, 6);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileActionSheetUploadingPreview$lambda$7;
                    FileActionSheetUploadingPreview$lambda$7 = FileActionSheetKt.FileActionSheetUploadingPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileActionSheetUploadingPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void FileActionSheetQueuedPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-61695068);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            FileActionSheetPreviewForStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_inbox_error_state_title, null, 2, null)))), startRestartGroup, 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileActionSheetQueuedPreview$lambda$8;
                    FileActionSheetQueuedPreview$lambda$8 = FileActionSheetKt.FileActionSheetQueuedPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileActionSheetQueuedPreview$lambda$8;
                }
            });
        }
    }

    private static final void FileActionSheetPreviewForStatus(final Answer.MediaAnswer.FileUploadStatus fileUploadStatus, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-915176137);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(fileUploadStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(193945980, true, new FileActionSheetKt$FileActionSheetPreviewForStatus$1(fileUploadStatus), startRestartGroup, 54), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileActionSheetPreviewForStatus$lambda$9;
                    FileActionSheetPreviewForStatus$lambda$9 = FileActionSheetKt.FileActionSheetPreviewForStatus$lambda$9(Answer.MediaAnswer.FileUploadStatus.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileActionSheetPreviewForStatus$lambda$9;
                }
            });
        }
    }
}
