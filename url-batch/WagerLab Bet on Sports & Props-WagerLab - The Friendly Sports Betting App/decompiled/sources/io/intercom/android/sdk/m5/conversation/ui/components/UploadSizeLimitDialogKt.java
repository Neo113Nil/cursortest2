package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.DialogProperties;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadSizeLimitDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"UploadSizeLimitDialog", "", "title", "", "message", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UploadSizeLimitDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadSizeLimitDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialog$lambda$3(String title, String message, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(message, "$message");
        UploadSizeLimitDialog(title, message, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialogPreview$lambda$4(int i, Composer composer, int i2) {
        UploadSizeLimitDialogPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UploadSizeLimitDialog(final String title, final String message, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        final Function0<Unit> function04;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Composer startRestartGroup = composer.startRestartGroup(-2057533015);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(message) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                function03 = i4 == 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                } : function02;
                long m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null);
                startRestartGroup.startReplaceGroup(-537314259);
                z = (i3 & 896) != 256;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit UploadSizeLimitDialog$lambda$2$lambda$1;
                            UploadSizeLimitDialog$lambda$2$lambda$1 = UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(Function0.this);
                            return UploadSizeLimitDialog$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                AndroidAlertDialog_androidKt.m2299AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(582096881, true, new UploadSizeLimitDialogKt$UploadSizeLimitDialog$3(function03), startRestartGroup, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-905132043, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                            TextStyle type03 = IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType03();
                            TextKt.m3581TextNvy7gAk(title, null, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, composer3, 0, 0, 131066);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-203197450, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                            TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04();
                            TextKt.m3581TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), null, m12152getBackground0d7_KjU, 0L, 0L, 0L, 0.0f, dialogProperties, composer2, 1769520, 3072, 7836);
                function04 = function03;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                function04 = function02;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit UploadSizeLimitDialog$lambda$3;
                        UploadSizeLimitDialog$lambda$3 = UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3(title, message, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return UploadSizeLimitDialog$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        long m12152getBackground0d7_KjU2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
        DialogProperties dialogProperties2 = new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null);
        startRestartGroup.startReplaceGroup(-537314259);
        if ((i3 & 896) != 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit UploadSizeLimitDialog$lambda$2$lambda$1;
                UploadSizeLimitDialog$lambda$2$lambda$1 = UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(Function0.this);
                return UploadSizeLimitDialog$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        AndroidAlertDialog_androidKt.m2299AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(582096881, true, new UploadSizeLimitDialogKt$UploadSizeLimitDialog$3(function03), startRestartGroup, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-905132043, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i5) {
                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                    TextStyle type03 = IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType03();
                    TextKt.m3581TextNvy7gAk(title, null, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, composer3, 0, 0, 131066);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-203197450, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i5) {
                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                    TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04();
                    TextKt.m3581TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), null, m12152getBackground0d7_KjU2, 0L, 0L, 0L, 0.0f, dialogProperties2, composer2, 1769520, 3072, 7836);
        function04 = function03;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialog$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void UploadSizeLimitDialogPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-532105575);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m11270getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UploadSizeLimitDialogPreview$lambda$4;
                    UploadSizeLimitDialogPreview$lambda$4 = UploadSizeLimitDialogKt.UploadSizeLimitDialogPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UploadSizeLimitDialogPreview$lambda$4;
                }
            });
        }
    }
}
