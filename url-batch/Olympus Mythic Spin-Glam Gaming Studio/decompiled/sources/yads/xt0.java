package yads;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class xt0 {
    /* JADX INFO: Access modifiers changed from: private */
    @DoNotInline
    public static boolean a(@Nullable Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
