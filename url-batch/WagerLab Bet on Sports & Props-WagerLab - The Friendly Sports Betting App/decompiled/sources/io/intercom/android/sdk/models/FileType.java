package io.intercom.android.sdk.models;

import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Ticket.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/models/FileType;", "", "<init>", "(Ljava/lang/String;I)V", ShareConstants.IMAGE_URL, ShareConstants.VIDEO_URL, "ATTACHMENT", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileType[] $VALUES;

    @SerializedName("image")
    public static final FileType IMAGE = new FileType(ShareConstants.IMAGE_URL, 0);

    @SerializedName("video")
    public static final FileType VIDEO = new FileType(ShareConstants.VIDEO_URL, 1);

    @SerializedName("attachment")
    public static final FileType ATTACHMENT = new FileType("ATTACHMENT", 2);

    private static final /* synthetic */ FileType[] $values() {
        return new FileType[]{IMAGE, VIDEO, ATTACHMENT};
    }

    public static EnumEntries<FileType> getEntries() {
        return $ENTRIES;
    }

    private FileType(String str, int i) {
    }

    static {
        FileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FileType valueOf(String str) {
        return (FileType) Enum.valueOf(FileType.class, str);
    }

    public static FileType[] values() {
        return (FileType[]) $VALUES.clone();
    }
}
