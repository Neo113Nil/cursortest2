package io.bidmachine;

import io.bidmachine.util.MimeTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/bidmachine/Constants;", "", "()V", "IMAGE_MIME_TYPES", "", "", "VIDEO_LINEARITY", "", "VIDEO_MAXBITR", "VIDEO_MAXDUR", "VIDEO_MIME_TYPES", "VIDEO_MINBITR", "VIDEO_MINDUR", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Constants {
    public static final int VIDEO_LINEARITY = 1;
    public static final int VIDEO_MAXBITR = 4096;
    public static final int VIDEO_MAXDUR = 30;
    public static final int VIDEO_MINBITR = 56;
    public static final int VIDEO_MINDUR = 5;

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final List<String> VIDEO_MIME_TYPES = CollectionsKt.listOf((Object[]) new String[]{"video/mp4", "video/3gpp"});

    @NotNull
    public static final List<String> IMAGE_MIME_TYPES = CollectionsKt.listOf((Object[]) new String[]{"image/jpeg", "image/jpg", MimeTypes.IMAGE_GIF, "image/png"});

    private Constants() {
    }
}
