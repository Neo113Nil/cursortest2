package io.appmetrica.analytics.modulesapi.internal.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\fH&J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH&J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0013"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/ModulePreferences;", "", "flushAsync", "", "getBoolean", "", "key", "", "fallback", "getInt", "", "getLong", "", "getString", "putBoolean", "value", "putInt", "putLong", "putString", "modules-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ModulePreferences {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return modulePreferences.getInt(str, i);
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            return modulePreferences.getLong(str, j);
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    void flushAsync();

    boolean getBoolean(@NotNull String key, boolean fallback);

    int getInt(@NotNull String key, int fallback);

    long getLong(@NotNull String key, long fallback);

    @Nullable
    String getString(@NotNull String key, @Nullable String fallback);

    void putBoolean(@NotNull String key, boolean value);

    void putInt(@NotNull String key, int value);

    void putLong(@NotNull String key, long value);

    void putString(@NotNull String key, @Nullable String value);
}
