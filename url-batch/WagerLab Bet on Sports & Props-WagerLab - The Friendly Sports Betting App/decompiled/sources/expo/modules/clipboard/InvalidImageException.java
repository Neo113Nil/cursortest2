package expo.modules.clipboard;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClipboardExceptions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/clipboard/InvalidImageException;", "Lexpo/modules/kotlin/exception/CodedException;", "image", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InvalidImageException extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidImageException(String image, Throwable th) {
        super("Invalid base64 image: " + ((Object) (r0 + (image.length() > 32 ? "..." : ""))), th);
        Intrinsics.checkNotNullParameter(image, "image");
        String substring = image.substring(0, Math.min(image.length(), 32));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
    }
}
