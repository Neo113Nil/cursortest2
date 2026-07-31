package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* compiled from: JobSupport.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements Function3 {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((JobSupport) obj, (SelectInstance) obj2, obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(JobSupport jobSupport, SelectInstance selectInstance, Object obj) {
        jobSupport.registerSelectForOnJoin(selectInstance, obj);
    }
}
