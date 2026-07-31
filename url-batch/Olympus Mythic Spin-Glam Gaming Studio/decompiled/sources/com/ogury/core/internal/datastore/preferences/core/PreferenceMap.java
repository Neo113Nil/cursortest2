package com.ogury.core.internal.datastore.preferences.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ogury/core/internal/datastore/preferences/core/PreferenceMap;", "", "preferences", "", "", "Lcom/ogury/core/internal/datastore/preferences/core/Value;", "(Ljava/util/Map;)V", "getPreferences", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PreferenceMap {

    @NotNull
    private final Map<String, Value> preferences;

    public PreferenceMap(@NotNull Map<String, Value> preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreferenceMap copy$default(PreferenceMap preferenceMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = preferenceMap.preferences;
        }
        return preferenceMap.copy(map);
    }

    @NotNull
    public final Map<String, Value> component1() {
        return this.preferences;
    }

    @NotNull
    public final PreferenceMap copy(@NotNull Map<String, Value> preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new PreferenceMap(preferences);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreferenceMap) && Intrinsics.areEqual(this.preferences, ((PreferenceMap) other).preferences);
    }

    @NotNull
    public final Map<String, Value> getPreferences() {
        return this.preferences;
    }

    public int hashCode() {
        return this.preferences.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreferenceMap(preferences=" + this.preferences + ")";
    }
}
