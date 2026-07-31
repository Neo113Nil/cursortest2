package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.TextKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Section.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/devmenu/compose/ui/Section;", "", "<init>", "()V", "Header", "", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Button", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Section {
    public static final int $stable = 0;
    public static final Section INSTANCE = new Section();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$1(Section section, String str, Function0 function0, int i, Composer composer, int i2) {
        section.Button(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$0(Section section, String str, int i, Composer composer, int i2) {
        section.Header(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private Section() {
    }

    public final void Header(final String text, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1437265247);
        ComposerKt.sourceInformation(startRestartGroup, "C(Header)14@449L4,15@497L4,18@582L6,12@390L220:Section.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1437265247, i2, -1, "expo.modules.devmenu.compose.ui.Section.Header (Section.kt:11)");
            }
            String upperCase = text.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.m10822NewTextnUFttAo(upperCase, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getSm(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMono(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777179, null), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getQuaternary(), 0, false, 0, (Modifier) null, startRestartGroup, 0, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.Section$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Header$lambda$0;
                    Header$lambda$0 = Section.Header$lambda$0(Section.this, text, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Header$lambda$0;
                }
            });
        }
    }

    public final void Button(final String text, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(2039236538);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)P(1)26@743L4,28@831L4,30@876L6,24@684L347:Section.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039236538, i2, -1, "expo.modules.devmenu.compose.ui.Section.Button (Section.kt:23)");
            }
            String upperCase = text.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            composer2 = startRestartGroup;
            TextKt.m10822NewTextnUFttAo(upperCase, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getSm(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMono(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777179, null), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getLink(), 0, false, 0, ClickableKt.m299clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, null, onClick, 28, null), composer2, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.Section$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Button$lambda$1;
                    Button$lambda$1 = Section.Button$lambda$1(Section.this, text, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Button$lambda$1;
                }
            });
        }
    }
}
