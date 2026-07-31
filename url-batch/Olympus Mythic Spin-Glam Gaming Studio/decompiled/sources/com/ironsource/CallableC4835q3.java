package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class CallableC4835q3 implements Callable<C4906u3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC4870s3 d;
    private final InterfaceC4852r3 e;
    private final NetworkSettings f;

    /* renamed from: com.ironsource.q3$a */
    class a implements BiddingDataCallback {
        final /* synthetic */ C4658g5 a;
        final /* synthetic */ BlockingQueue b;

        a(C4658g5 c4658g5, BlockingQueue blockingQueue) {
            this.a = c4658g5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.b.add(new C4906u3(CallableC4835q3.this.d(), CallableC4835q3.this.c(), null, C4658g5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.b.add(new C4906u3(CallableC4835q3.this.d(), CallableC4835q3.this.c(), map, C4658g5.a(this.a), null));
        }
    }

    public CallableC4835q3(int i, String str, AdData adData, InterfaceC4870s3 interfaceC4870s3, InterfaceC4852r3 interfaceC4852r3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC4870s3;
        this.e = interfaceC4852r3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4906u3 call() throws Exception {
        C4658g5 c4658g5 = new C4658g5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c4658g5, arrayBlockingQueue));
        } catch (Exception e) {
            C4782n4.d().a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4852r3 interfaceC4852r3 = this.e;
            if (interfaceC4852r3 != null) {
                interfaceC4852r3.a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C4782n4.d().a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC4852r3 interfaceC4852r32 = this.e;
            if (interfaceC4852r32 != null) {
                interfaceC4852r32.a(str2);
            }
        }
        InterfaceC4852r3 interfaceC4852r33 = this.e;
        if (interfaceC4852r33 != null) {
            interfaceC4852r33.a(this.f);
        }
        return (C4906u3) arrayBlockingQueue.take();
    }

    public InterfaceC4870s3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
