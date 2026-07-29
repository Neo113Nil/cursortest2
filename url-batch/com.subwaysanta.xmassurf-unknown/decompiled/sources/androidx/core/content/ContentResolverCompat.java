package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.OperationCanceledException;
import androidx.core.os.CancellationSignal;

/* loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
    }

    public static Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Object cancellationSignalObject;
        if (cancellationSignal != null) {
            try {
                cancellationSignalObject = cancellationSignal.getCancellationSignalObject();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e;
            }
        } else {
            cancellationSignalObject = null;
        }
        android.os.CancellationSignal cancellationSignal2 = (android.os.CancellationSignal) cancellationSignalObject;
        android.os.CancellationSignal cancellationSignal3 = cancellationSignal2;
        return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal2);
    }
}
