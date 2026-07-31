package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: Deferred.kt */
/* loaded from: classes3.dex */
public interface Deferred extends Job {
    Object await(Continuation continuation);

    Object getCompleted();

    SelectClause1 getOnAwait();
}
