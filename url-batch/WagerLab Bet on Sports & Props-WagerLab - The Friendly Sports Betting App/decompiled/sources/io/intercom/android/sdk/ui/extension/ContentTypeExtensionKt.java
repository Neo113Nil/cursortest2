package io.intercom.android.sdk.ui.extension;

import androidx.media3.common.MimeTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ContentTypeExtension.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isVideo", "", "", "isImage", "isAudio", "isDocument", "isPdf", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContentTypeExtensionKt {
    public static final boolean isVideo(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "video", false, 2, (Object) null);
    }

    public static final boolean isImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "image", false, 2, (Object) null);
    }

    public static final boolean isAudio(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) MimeTypes.BASE_TYPE_AUDIO, false, 2, (Object) null);
    }

    public static final boolean isDocument(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) MimeTypes.BASE_TYPE_APPLICATION, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "text", false, 2, (Object) null);
    }

    public static final boolean isPdf(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "pdf", false, 2, (Object) null);
    }
}
