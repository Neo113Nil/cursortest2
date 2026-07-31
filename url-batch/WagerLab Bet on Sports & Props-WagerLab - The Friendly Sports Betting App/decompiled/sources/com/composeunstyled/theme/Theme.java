package com.composeunstyled.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0087\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/composeunstyled/theme/Theme;", "", "<init>", "()V", b.au, "Lcom/composeunstyled/theme/ThemeValues;", "T", "property", "Lcom/composeunstyled/theme/ThemeProperty;", "(Lcom/composeunstyled/theme/ThemeProperty;Landroidx/compose/runtime/Composer;I)Lcom/composeunstyled/theme/ThemeValues;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Theme {
    public static final int $stable = 0;
    public static final Theme INSTANCE = new Theme();

    private Theme() {
    }

    public final <T> ThemeValues<T> get(ThemeProperty<T> property, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(property, "property");
        composer.startReplaceGroup(2116515313);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2116515313, i, -1, "com.composeunstyled.theme.Theme.get (Theme.kt:15)");
        }
        ProvidableCompositionLocal<ResolvedTheme> localTheme = ThemeKt.getLocalTheme();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localTheme);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ResolvedTheme resolvedTheme = (ResolvedTheme) consume;
        Object obj = resolvedTheme.getProperties$core_release().get(property);
        ThemeValues<T> themeValues = obj instanceof ThemeValues ? (ThemeValues) obj : null;
        if (themeValues != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return themeValues;
        }
        throw new IllegalStateException(("There is no " + property.getName() + " property in the " + resolvedTheme.getName() + " theme. To fix this: 1. Create a design property: val " + property.getName() + " = ThemeProperty<Type>(" + property.getName() + "), 2. Pass it to your theme definition: buildTheme { properties -> properties[" + property.getName() + "] = TODO(\"Populate token values\") }").toString());
    }
}
