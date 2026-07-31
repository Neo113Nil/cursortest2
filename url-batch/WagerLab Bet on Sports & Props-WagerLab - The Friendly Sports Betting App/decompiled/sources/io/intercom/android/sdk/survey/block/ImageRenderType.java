package io.intercom.android.sdk.survey.block;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageBlock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/block/ImageRenderType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "CROPPED", "WITH_MAX_SIZE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageRenderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageRenderType[] $VALUES;
    public static final ImageRenderType FULL = new ImageRenderType("FULL", 0);
    public static final ImageRenderType CROPPED = new ImageRenderType("CROPPED", 1);
    public static final ImageRenderType WITH_MAX_SIZE = new ImageRenderType("WITH_MAX_SIZE", 2);

    private static final /* synthetic */ ImageRenderType[] $values() {
        return new ImageRenderType[]{FULL, CROPPED, WITH_MAX_SIZE};
    }

    public static EnumEntries<ImageRenderType> getEntries() {
        return $ENTRIES;
    }

    private ImageRenderType(String str, int i) {
    }

    static {
        ImageRenderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ImageRenderType valueOf(String str) {
        return (ImageRenderType) Enum.valueOf(ImageRenderType.class, str);
    }

    public static ImageRenderType[] values() {
        return (ImageRenderType[]) $VALUES.clone();
    }
}
