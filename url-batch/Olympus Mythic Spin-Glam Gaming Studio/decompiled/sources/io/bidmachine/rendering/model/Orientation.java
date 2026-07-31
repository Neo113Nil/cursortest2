package io.bidmachine.rendering.model;

import io.bidmachine.util.KeyHolder;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/bidmachine/rendering/model/Orientation;", "", "Lio/bidmachine/util/KeyHolder;", "", "key", "", "activityOrientation", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "I", "getActivityOrientation", "()I", "Companion", "Portrait", "Landscape", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum Orientation implements KeyHolder {
    Portrait("portrait", 7),
    Landscape("landscape", 6);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String key;

    /* renamed from: b, reason: from kotlin metadata */
    private final int activityOrientation;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/Orientation$Companion;", "", "()V", "get", "Lio/bidmachine/rendering/model/Orientation;", "key", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Orientation get(@Nullable String key) {
            return (Orientation) UtilsKt.find(Orientation.values(), key);
        }

        private Companion() {
        }
    }

    Orientation(String str, int i) {
        this.key = str;
        this.activityOrientation = i;
    }

    @Nullable
    public static final Orientation get(@Nullable String str) {
        return INSTANCE.get(str);
    }

    public final int getActivityOrientation() {
        return this.activityOrientation;
    }

    @Override // io.bidmachine.util.KeyHolder
    @NotNull
    public String getKey() {
        return this.key;
    }
}
