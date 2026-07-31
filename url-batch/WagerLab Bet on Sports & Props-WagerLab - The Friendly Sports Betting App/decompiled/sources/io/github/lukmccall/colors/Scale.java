package io.github.lukmccall.colors;

import androidx.exifinterface.media.ExifInterface;
import io.ably.lib.transport.Defaults;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scale.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/github/lukmccall/colors/Scale;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, Defaults.ABLY_PROTOCOL_VERSION, "5", "6", "7", "8", "9", "10", "11", "12", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Scale {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Scale[] $VALUES;
    private final int value;

    /* renamed from: 1, reason: not valid java name */
    public static final Scale f811 = new Scale("1", 0, 0);

    /* renamed from: 2, reason: not valid java name */
    public static final Scale f852 = new Scale(ExifInterface.GPS_MEASUREMENT_2D, 1, 1);

    /* renamed from: 3, reason: not valid java name */
    public static final Scale f863 = new Scale(ExifInterface.GPS_MEASUREMENT_3D, 2, 2);

    /* renamed from: 4, reason: not valid java name */
    public static final Scale f874 = new Scale(Defaults.ABLY_PROTOCOL_VERSION, 3, 3);

    /* renamed from: 5, reason: not valid java name */
    public static final Scale f885 = new Scale("5", 4, 4);

    /* renamed from: 6, reason: not valid java name */
    public static final Scale f896 = new Scale("6", 5, 5);

    /* renamed from: 7, reason: not valid java name */
    public static final Scale f907 = new Scale("7", 6, 6);

    /* renamed from: 8, reason: not valid java name */
    public static final Scale f918 = new Scale("8", 7, 7);

    /* renamed from: 9, reason: not valid java name */
    public static final Scale f929 = new Scale("9", 8, 8);

    /* renamed from: 10, reason: not valid java name */
    public static final Scale f8210 = new Scale("10", 9, 9);

    /* renamed from: 11, reason: not valid java name */
    public static final Scale f8311 = new Scale("11", 10, 10);

    /* renamed from: 12, reason: not valid java name */
    public static final Scale f8412 = new Scale("12", 11, 11);

    private static final /* synthetic */ Scale[] $values() {
        return new Scale[]{f811, f852, f863, f874, f885, f896, f907, f918, f929, f8210, f8311, f8412};
    }

    public static EnumEntries<Scale> getEntries() {
        return $ENTRIES;
    }

    private Scale(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Scale[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) $VALUES.clone();
    }
}
