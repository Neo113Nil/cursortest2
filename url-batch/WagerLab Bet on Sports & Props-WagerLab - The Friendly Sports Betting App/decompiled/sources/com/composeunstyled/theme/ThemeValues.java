package com.composeunstyled.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.amazon.a.a.o.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\u0002¢\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/composeunstyled/theme/ThemeValues;", "T", "", "propertyName", "", "values", "", "Lcom/composeunstyled/theme/ThemeToken;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getPropertyName$core_release", "()Ljava/lang/String;", "getValues$core_release", "()Ljava/util/Map;", b.au, "token", "(Lcom/composeunstyled/theme/ThemeToken;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "copyWithUpdatedValue", "newValue", "copyWithUpdatedValue$core_release", "(Lcom/composeunstyled/theme/ThemeToken;Ljava/lang/Object;)Lcom/composeunstyled/theme/ThemeValues;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeValues<T> {
    public static final int $stable = 8;
    private final String propertyName;
    private final Map<ThemeToken<T>, T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeValues(String propertyName, Map<ThemeToken<T>, ? extends T> values) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.propertyName = propertyName;
        this.values = values;
    }

    /* renamed from: getPropertyName$core_release, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    public final Map<ThemeToken<T>, T> getValues$core_release() {
        return this.values;
    }

    public final T get(ThemeToken<T> token, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(token, "token");
        composer.startReplaceGroup(1630387854);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630387854, i, -1, "com.composeunstyled.theme.ThemeValues.get (Theme.kt:32)");
        }
        T t = this.values.get(token);
        if (t == null) {
            ProvidableCompositionLocal<ResolvedTheme> localTheme = ThemeKt.getLocalTheme();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTheme);
            ComposerKt.sourceInformationMarkerEnd(composer);
            String name = ((ResolvedTheme) consume).getName();
            throw new IllegalStateException(("Tried to access the value of the token called " + token.getName() + ", but no tokens with that name are defined within the " + this.propertyName + " property. You probably forgot to set a " + token.getName() + " token in your theme definition. The resolved theme was " + name).toString());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return t;
    }

    public final ThemeValues<T> copyWithUpdatedValue$core_release(ThemeToken<T> token, T newValue) {
        Intrinsics.checkNotNullParameter(token, "token");
        Map mutableMap = MapsKt.toMutableMap(this.values);
        mutableMap.put(token, newValue);
        return new ThemeValues<>(this.propertyName, mutableMap);
    }
}
