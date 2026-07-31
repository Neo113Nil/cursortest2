package com.ogury.core;

import com.applovin.sdk.AppLovinEventTypes;
import com.ogury.core.internal.IntegrationLogger;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ogury/core/OguryLog;", "", "Lcom/ogury/core/OguryLog$Level;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", com.ironsource.mediationsdk.metadata.a.k, "(Lcom/ogury/core/OguryLog$Level;)V", "Level", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OguryLog {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ogury/core/OguryLog$Level;", "", "(Ljava/lang/String;I)V", "getLogPriority", "", "NONE", "DEBUG", "INFO", "ERROR", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new d();
        public static final Level DEBUG = new a();
        public static final Level INFO = new c();
        public static final Level ERROR = new b();

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, DEBUG, INFO, ERROR};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public /* synthetic */ Level(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        public abstract int getLogPriority();

        private Level(String str, int i) {
        }
    }

    public static final void enable(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        IntegrationLogger.setLevel(level.getLogPriority());
    }
}
