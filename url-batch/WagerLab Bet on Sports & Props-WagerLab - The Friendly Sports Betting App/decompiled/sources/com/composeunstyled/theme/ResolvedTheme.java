package com.composeunstyled.theme;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\u0004\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/composeunstyled/theme/ResolvedTheme;", "", "name", "", DiagnosticsEntry.PROPERTIES_KEY, "", "Lcom/composeunstyled/theme/ThemeProperty;", "Lcom/composeunstyled/theme/ThemeValues;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName$core_release", "()Ljava/lang/String;", "getProperties$core_release", "()Ljava/util/Map;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResolvedTheme {
    public static final int $stable = 8;
    private final String name;
    private final Map<ThemeProperty<?>, ThemeValues<?>> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedTheme() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedTheme(String name, Map<ThemeProperty<?>, ? extends ThemeValues<?>> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.name = name;
        this.properties = properties;
    }

    public /* synthetic */ ResolvedTheme(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ComposeTheme" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    /* renamed from: getName$core_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<ThemeProperty<?>, ThemeValues<?>> getProperties$core_release() {
        return this.properties;
    }
}
