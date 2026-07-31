package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4888t3 {

    /* renamed from: com.ironsource.t3$a */
    class a implements WorkerManager.WorkEndedListener<C4906u3> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C4906u3>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C4906u3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C4906u3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC4835q3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC4835q3 callableC4835q3 = (CallableC4835q3) failed.callable;
                    arrayList2.add(new C4906u3(callableC4835q3.d(), callableC4835q3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C4888t3.this.a(arrayList2, arrayList, j);
            this.a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.a.onFailure(str2);
        }
    }

    /* renamed from: com.ironsource.t3$b */
    public interface b {
        void a(@NotNull List<C4906u3> list, long j, @NotNull List<String> list2);

        void onFailure(String str);
    }

    public void a(@NotNull List<CallableC4835q3> list, @NotNull b bVar, long j, @NotNull TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC4835q3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<C4906u3> list, List<String> list2, long j) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C4906u3 c4906u3 : list) {
            if (c4906u3.a() != null) {
                IronLog.INTERNAL.verbose(c4906u3.c() + " - success (" + c4906u3.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c4906u3.c() + " - failed (" + c4906u3.e() + " millis) error: " + c4906u3.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
