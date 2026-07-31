package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: MainDispatcherFactory.kt */
/* loaded from: classes6.dex */
public interface MainDispatcherFactory {
    MainCoroutineDispatcher createDispatcher(List list);

    int getLoadPriority();

    String hintOnError();
}
