package yads;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes6.dex */
public abstract class w10 {
    public static CoroutineDispatcher a() {
        return Dispatchers.getIO();
    }

    public static MainCoroutineDispatcher b() {
        return Dispatchers.getMain().getImmediate();
    }
}
