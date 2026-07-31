package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUploadErrorComponent.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001aO\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"FileUploadErrorComponent", "", "title", "", "error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "onRetryClick", "Lkotlin/Function0;", "onDeleteClick", "(Ljava/lang/String;Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ActionRow", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "", "text", "contentDescription", "tint", "Landroidx/compose/ui/graphics/Color;", ViewProps.ON_CLICK, "ActionRow-FHprtrg", "(Landroidx/compose/ui/Modifier;IIIJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ErrorActionSheetContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "UploadFailedErrorActionSheetPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileUploadErrorComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionRow_FHprtrg$lambda$5(Modifier modifier, int i, int i2, int i3, long j, Function0 onClick, int i4, int i5, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m11827ActionRowFHprtrg(modifier, i, i2, i3, j, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorActionSheetContentPreview$lambda$6(int i, Composer composer, int i2) {
        ErrorActionSheetContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileUploadErrorComponent$lambda$1(String title, Answer.MediaAnswer.FileUploadError error, Function0 onRetryClick, Function0 onDeleteClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(onRetryClick, "$onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        FileUploadErrorComponent(title, error, onRetryClick, onDeleteClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFailedErrorActionSheetPreview$lambda$7(int i, Composer composer, int i2) {
        UploadFailedErrorActionSheetPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FileUploadErrorComponent(final String title, final Answer.MediaAnswer.FileUploadError error, final Function0<Unit> onRetryClick, final Function0<Unit> onDeleteClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer startRestartGroup = composer.startRestartGroup(725182893);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
        float f = 16;
        TextKt.m3581TextNvy7gAk(title, PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(f), 0.0f, 8, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, i & 14, 0, 131068);
        ErrorMessageLayoutKt.ErrorMessageLayout(PaddingKt.m838paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(8)), error.getErrorMessages(), startRestartGroup, 70, 0);
        float f2 = 4;
        IntercomDividerKt.IntercomDivider(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(f2), 1, null), startRestartGroup, 6, 0);
        if ((error instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || (error instanceof Answer.MediaAnswer.FileUploadError.UnsupportedFileType) || (error instanceof Answer.MediaAnswer.FileUploadError.FileTooLarge)) {
            startRestartGroup.startReplaceGroup(157589913);
            m11827ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, startRestartGroup, (i << 6) & 458752, 25);
            startRestartGroup.endReplaceGroup();
        } else {
            if (!(error instanceof Answer.MediaAnswer.FileUploadError.UploadFailed)) {
                startRestartGroup.startReplaceGroup(-549109013);
                startRestartGroup.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            startRestartGroup.startReplaceGroup(157902703);
            m11827ActionRowFHprtrg(null, io.intercom.android.sdk.R.drawable.intercom_ic_reload, io.intercom.android.sdk.R.string.intercom_try_again, 0, 0L, onRetryClick, startRestartGroup, (i << 9) & 458752, 25);
            IntercomDividerKt.IntercomDivider(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(f2), 1, null), startRestartGroup, 6, 0);
            m11827ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, startRestartGroup, (i << 6) & 458752, 25);
            startRestartGroup.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileUploadErrorComponent$lambda$1;
                    FileUploadErrorComponent$lambda$1 = FileUploadErrorComponentKt.FileUploadErrorComponent$lambda$1(title, error, onRetryClick, onDeleteClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileUploadErrorComponent$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* renamed from: ActionRow-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11827ActionRowFHprtrg(Modifier modifier, final int i, final int i2, int i3, long j, final Function0<Unit> onClick, Composer composer, final int i4, final int i5) {
        final Modifier modifier2;
        int i6;
        int i7;
        long j2;
        int i8;
        Modifier.Companion companion;
        boolean z;
        Object rememberedValue;
        int hashCode;
        Composer m4976constructorimpl;
        final int i9;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1845655864);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i6 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 14) == 0) {
            modifier2 = modifier;
            i6 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            if ((i5 & 8) == 0) {
                i7 = i3;
                if (startRestartGroup.changed(i7)) {
                    i11 = 2048;
                    i6 |= i11;
                }
            } else {
                i7 = i3;
            }
            i11 = 1024;
            i6 |= i11;
        } else {
            i7 = i3;
        }
        if ((57344 & i4) == 0) {
            if ((i5 & 16) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i10 = 16384;
                    i6 |= i10;
                }
            } else {
                j2 = j;
            }
            i10 = 8192;
            i6 |= i10;
        } else {
            j2 = j;
        }
        if ((i5 & 32) == 0) {
            if ((i4 & 458752) == 0) {
                i8 = startRestartGroup.changedInstance(onClick) ? 131072 : 65536;
            }
            if ((374491 & i6) == 74898 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i5 & 8) != 0) {
                        i6 &= -7169;
                        i7 = i2;
                    }
                    if ((i5 & 16) != 0) {
                        j2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
                        i6 &= -57345;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i5 & 8) != 0) {
                        i6 &= -7169;
                    }
                    if ((i5 & 16) != 0) {
                        i6 &= -57345;
                    }
                    companion = modifier2;
                }
                startRestartGroup.endDefaults();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(1130566626);
                z = (i6 & 458752) == 131072;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ActionRow_FHprtrg$lambda$3$lambda$2;
                            ActionRow_FHprtrg$lambda$3$lambda$2 = FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(Function0.this);
                            return ActionRow_FHprtrg$lambda$3$lambda$2;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                float f = 16;
                Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(ClickableKt.m303clickableoSLSa3U$default(fillMaxWidth$default, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(f));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m838paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier3 = companion;
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i13 = i6 >> 3;
                long j4 = j2;
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, i13 & 14), StringResources_androidKt.stringResource(i7, startRestartGroup, (i6 >> 9) & 14), (Modifier) null, j4, startRestartGroup, (i13 & 7168) | 8, 4);
                int i14 = i6 >> 6;
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(i2, startRestartGroup, i14 & 14), null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, i14 & 896, 0, 131066);
                startRestartGroup = startRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                modifier2 = modifier3;
                i9 = i7;
                j3 = j4;
            } else {
                startRestartGroup.skipToGroupEnd();
                i9 = i7;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ActionRow_FHprtrg$lambda$5;
                        ActionRow_FHprtrg$lambda$5 = FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(Modifier.this, i, i2, i9, j3, onClick, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                        return ActionRow_FHprtrg$lambda$5;
                    }
                });
                return;
            }
            return;
        }
        i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i6 |= i8;
        if ((374491 & i6) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        if ((i5 & 16) != 0) {
        }
        startRestartGroup.endDefaults();
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(1130566626);
        if ((i6 & 458752) == 131072) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ActionRow_FHprtrg$lambda$3$lambda$2;
                ActionRow_FHprtrg$lambda$3$lambda$2 = FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(Function0.this);
                return ActionRow_FHprtrg$lambda$3$lambda$2;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        float f2 = 16;
        Modifier m838paddingVpY3zN42 = PaddingKt.m838paddingVpY3zN4(ClickableKt.m303clickableoSLSa3U$default(fillMaxWidth$default2, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(f2), Dp.m8401constructorimpl(f2));
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m696spacedBy0680j_42 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m696spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m838paddingVpY3zN42);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier32 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i132 = i6 >> 3;
        long j42 = j2;
        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, i132 & 14), StringResources_androidKt.stringResource(i7, startRestartGroup, (i6 >> 9) & 14), (Modifier) null, j42, startRestartGroup, (i132 & 7168) | 8, 4);
        int i142 = i6 >> 6;
        TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(i2, startRestartGroup, i142 & 14), null, j42, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, i142 & 896, 0, 131066);
        startRestartGroup = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        modifier2 = modifier32;
        i9 = i7;
        j3 = j42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionRow_FHprtrg$lambda$3$lambda$2(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void ErrorActionSheetContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2121321299);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m11811getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ErrorActionSheetContentPreview$lambda$6;
                    ErrorActionSheetContentPreview$lambda$6 = FileUploadErrorComponentKt.ErrorActionSheetContentPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ErrorActionSheetContentPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void UploadFailedErrorActionSheetPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2130831888);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m11813getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UploadFailedErrorActionSheetPreview$lambda$7;
                    UploadFailedErrorActionSheetPreview$lambda$7 = FileUploadErrorComponentKt.UploadFailedErrorActionSheetPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UploadFailedErrorActionSheetPreview$lambda$7;
                }
            });
        }
    }
}
