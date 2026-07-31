package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraInputButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputType;", "", "<init>", "(Ljava/lang/String;I)V", ShareConstants.VIDEO_URL, "PHOTO", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CameraInputType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraInputType[] $VALUES;
    public static final CameraInputType VIDEO = new CameraInputType(ShareConstants.VIDEO_URL, 0);
    public static final CameraInputType PHOTO = new CameraInputType("PHOTO", 1);

    private static final /* synthetic */ CameraInputType[] $values() {
        return new CameraInputType[]{VIDEO, PHOTO};
    }

    public static EnumEntries<CameraInputType> getEntries() {
        return $ENTRIES;
    }

    private CameraInputType(String str, int i) {
    }

    static {
        CameraInputType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CameraInputType valueOf(String str) {
        return (CameraInputType) Enum.valueOf(CameraInputType.class, str);
    }

    public static CameraInputType[] values() {
        return (CameraInputType[]) $VALUES.clone();
    }
}
