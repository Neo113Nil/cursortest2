package io.intercom.android.sdk.m5.components.avatar;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarIcon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AvatarShape {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarShape[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerializedName(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)
    public static final AvatarShape CIRCLE = new AvatarShape("CIRCLE", 0);

    @SerializedName("squircle")
    public static final AvatarShape SQUIRCLE = new AvatarShape("SQUIRCLE", 1);

    private static final /* synthetic */ AvatarShape[] $values() {
        return new AvatarShape[]{CIRCLE, SQUIRCLE};
    }

    public static EnumEntries<AvatarShape> getEntries() {
        return $ENTRIES;
    }

    private AvatarShape(String str, int i) {
    }

    static {
        AvatarShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: AvatarIcon.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion;", "", "<init>", "()V", "fromName", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "shape", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AvatarShape fromName(String shape) {
            Object obj;
            Intrinsics.checkNotNullParameter(shape, "shape");
            Iterator<E> it = AvatarShape.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals(((AvatarShape) obj).name(), shape, true)) {
                    break;
                }
            }
            AvatarShape avatarShape = (AvatarShape) obj;
            return avatarShape == null ? AvatarShape.CIRCLE : avatarShape;
        }
    }

    public static AvatarShape valueOf(String str) {
        return (AvatarShape) Enum.valueOf(AvatarShape.class, str);
    }

    public static AvatarShape[] values() {
        return (AvatarShape[]) $VALUES.clone();
    }
}
