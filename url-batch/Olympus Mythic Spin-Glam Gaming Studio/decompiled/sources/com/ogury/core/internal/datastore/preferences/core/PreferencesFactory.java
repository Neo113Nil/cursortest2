package com.ogury.core.internal.datastore.preferences.core;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a+\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"emptyPreferences", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "createEmpty", "mutablePreferencesOf", "Lcom/ogury/core/internal/datastore/preferences/core/MutablePreferences;", "pairs", "", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences$Pair;", "createMutable", "([Lcom/ogury/core/internal/datastore/preferences/core/Preferences$Pair;)Lcom/ogury/core/internal/datastore/preferences/core/MutablePreferences;", "preferencesOf", "create", "([Lcom/ogury/core/internal/datastore/preferences/core/Preferences$Pair;)Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "sdk-core_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreferencesFactory {
    @NotNull
    public static final Preferences create(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @NotNull
    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1, null);
    }

    @NotNull
    public static final MutablePreferences createMutable(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
