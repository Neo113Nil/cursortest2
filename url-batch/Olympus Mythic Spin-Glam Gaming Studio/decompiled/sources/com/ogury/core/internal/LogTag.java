package com.ogury.core.internal;

import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/ogury/core/internal/LogTag;", "", "tag", "", "color", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getColor", "()I", "getTag", "()Ljava/lang/String;", "INTERNAL", "PUBLISHER", "CALLBACKS", "MONITORING", MraidAdRenderer.LOG_TAG, "REQUESTS", "QUALITY", "Companion", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogTag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int color;

    @NotNull
    private final String tag;
    public static final LogTag INTERNAL = new LogTag("INTERNAL", 0, "OGURY-INTERNAL", -16711936);
    public static final LogTag PUBLISHER = new LogTag("PUBLISHER", 1, "OGURY-PUBLISHER", -65536);
    public static final LogTag CALLBACKS = new LogTag("CALLBACKS", 2, "OGURY-CALLBACKS", -16776961);
    public static final LogTag MONITORING = new LogTag("MONITORING", 3, "OGURY-MONITORING", -65281);
    public static final LogTag MRAID = new LogTag(MraidAdRenderer.LOG_TAG, 4, "OGURY-MRAID", -16711681);
    public static final LogTag REQUESTS = new LogTag("REQUESTS", 5, "OGURY-REQUESTS", -256);
    public static final LogTag QUALITY = new LogTag("QUALITY", 6, "OGURY-QUALITY", -3355444);

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ogury/core/internal/LogTag$Companion;", "", "()V", "getColorForTag", "", "tag", "", "defaultColor", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ int getColorForTag$default(Companion companion, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = -16777216;
            }
            return companion.getColorForTag(str, i);
        }

        public final int getColorForTag(@NotNull String tag, int defaultColor) {
            Object obj;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Iterator<E> it = LogTag.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((LogTag) obj).getTag(), tag)) {
                    break;
                }
            }
            LogTag logTag = (LogTag) obj;
            return logTag != null ? logTag.getColor() : defaultColor;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LogTag[] $values() {
        return new LogTag[]{INTERNAL, PUBLISHER, CALLBACKS, MONITORING, MRAID, REQUESTS, QUALITY};
    }

    static {
        LogTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private LogTag(String str, int i, String str2, int i2) {
        this.tag = str2;
        this.color = i2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LogTag valueOf(String str) {
        return (LogTag) Enum.valueOf(LogTag.class, str);
    }

    public static LogTag[] values() {
        return (LogTag[]) $VALUES.clone();
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}
