package yads;

import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes5.dex */
public abstract class ge {
    public static final Lazy a = LazyKt.lazy(fe.b);

    public static String a(long j) {
        if (j < 1024) {
            return j + "B";
        }
        if (j < 1048576) {
            return (j / 1024) + "KB";
        }
        if (j < 1073741824) {
            return (j / 1048576) + "MB";
        }
        return (j / 1073741824) + "GB";
    }
}
