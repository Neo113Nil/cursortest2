package kotlinx.coroutines.selects;

import kotlin.jvm.functions.Function3;

/* compiled from: Select.kt */
/* loaded from: classes10.dex */
public interface SelectClause {
    Object getClauseObject();

    Function3 getOnCancellationConstructor();

    Function3 getProcessResFunc();

    Function3 getRegFunc();
}
