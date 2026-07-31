package expo.modules.imagepicker;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImagePickerOptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/imagepicker/JSMediaTypes;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMAGES", "VIDEOS", "LIVE_PHOTOS", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JSMediaTypes implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JSMediaTypes[] $VALUES;
    private final String value;
    public static final JSMediaTypes IMAGES = new JSMediaTypes("IMAGES", 0, "images");
    public static final JSMediaTypes VIDEOS = new JSMediaTypes("VIDEOS", 1, "videos");
    public static final JSMediaTypes LIVE_PHOTOS = new JSMediaTypes("LIVE_PHOTOS", 2, "livePhotos");

    private static final /* synthetic */ JSMediaTypes[] $values() {
        return new JSMediaTypes[]{IMAGES, VIDEOS, LIVE_PHOTOS};
    }

    public static EnumEntries<JSMediaTypes> getEntries() {
        return $ENTRIES;
    }

    private JSMediaTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        JSMediaTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static JSMediaTypes valueOf(String str) {
        return (JSMediaTypes) Enum.valueOf(JSMediaTypes.class, str);
    }

    public static JSMediaTypes[] values() {
        return (JSMediaTypes[]) $VALUES.clone();
    }
}
