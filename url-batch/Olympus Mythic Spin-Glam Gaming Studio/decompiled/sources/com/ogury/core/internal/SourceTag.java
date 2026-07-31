package com.ogury.core.internal;

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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/ogury/core/internal/SourceTag;", "", "tag", "", "color", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getColor", "()I", "getTag", "()Ljava/lang/String;", "ADS", "CORE", "WRAPPER", "Companion", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SourceTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SourceTag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int color;

    @NotNull
    private final String tag;
    public static final SourceTag ADS = new SourceTag("ADS", 0, "ADS", -16711936);
    public static final SourceTag CORE = new SourceTag("CORE", 1, "CORE", -65536);
    public static final SourceTag WRAPPER = new SourceTag("WRAPPER", 2, "WRAPPER", -16776961);

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ogury/core/internal/SourceTag$Companion;", "", "()V", "getColorForTag", "", "tag", "", "defaultColor", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            Iterator<E> it = SourceTag.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((SourceTag) obj).getTag(), tag)) {
                    break;
                }
            }
            SourceTag sourceTag = (SourceTag) obj;
            return sourceTag != null ? sourceTag.getColor() : defaultColor;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SourceTag[] $values() {
        return new SourceTag[]{ADS, CORE, WRAPPER};
    }

    static {
        SourceTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SourceTag(String str, int i, String str2, int i2) {
        this.tag = str2;
        this.color = i2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SourceTag valueOf(String str) {
        return (SourceTag) Enum.valueOf(SourceTag.class, str);
    }

    public static SourceTag[] values() {
        return (SourceTag[]) $VALUES.clone();
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}
