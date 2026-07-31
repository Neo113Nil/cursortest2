package com.composeunstyled.theme;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00062\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0004\u0012\u0002H\f0\u000fH\u0086\u0002R(\u0010\u0004\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/composeunstyled/theme/MutableThemeProperties;", "", "<init>", "()V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lcom/composeunstyled/theme/ThemeProperty;", "Lcom/composeunstyled/theme/ThemeValues;", "getEntries$core_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "set", "", "T", "property", "values", "", "Lcom/composeunstyled/theme/ThemeToken;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MutableThemeProperties {
    public static final int $stable = 0;
    private final SnapshotStateMap<ThemeProperty<?>, ThemeValues<?>> entries = SnapshotStateKt.mutableStateMapOf();

    public final SnapshotStateMap<ThemeProperty<?>, ThemeValues<?>> getEntries$core_release() {
        return this.entries;
    }

    public final <T> void set(ThemeProperty<T> property, Map<ThemeToken<T>, ? extends T> values) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(values, "values");
        this.entries.put(property, new ThemeValues<>(property.getName(), values));
    }
}
