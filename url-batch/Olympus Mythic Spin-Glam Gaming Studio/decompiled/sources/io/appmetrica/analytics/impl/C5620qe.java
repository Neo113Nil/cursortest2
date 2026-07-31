package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5620qe {
    public static final C5620qe a = new C5620qe();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.1.0", "50162358");

    public static final NetworkTask a(C5532n5 c5532n5) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C5518mh c5518mh = new C5518mh(aESRSARequestBodyEncrypter);
        Ub ub = new Ub(c5532n5);
        BlockingExecutor blockingExecutor = new BlockingExecutor();
        F5 f5 = new F5(c5532n5.a);
        C5620qe c5620qe = a;
        EnumC5567oe enumC5567oe = EnumC5567oe.a;
        synchronized (c5620qe) {
            try {
                LinkedHashMap linkedHashMap = b;
                Object obj = linkedHashMap.get(enumC5567oe);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Wa(Ka.I.y(), enumC5567oe), "REPORT");
                    linkedHashMap.put(enumC5567oe, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new NetworkTask(blockingExecutor, f5, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new Gh(c5532n5, c5518mh, ub, new FullUrlFormer(c5518mh, ub), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), aESRSARequestBodyEncrypter), CollectionsKt.listOf(new Co()), c);
    }

    public static final NetworkTask a(Rm rm, C5679sm c5679sm) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        C5575om c5575om = new C5575om(new Ce(), Ka.I.p());
        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c5679sm);
        SynchronizedBlockingExecutor synchronizedBlockingExecutor = new SynchronizedBlockingExecutor();
        F5 f5 = new F5(rm.a.a);
        C5620qe c5620qe = a;
        EnumC5567oe enumC5567oe = EnumC5567oe.b;
        synchronized (c5620qe) {
            try {
                LinkedHashMap linkedHashMap = b;
                Object obj = linkedHashMap.get(enumC5567oe);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Wa(Ka.I.y(), enumC5567oe), "STARTUP");
                    linkedHashMap.put(enumC5567oe, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new NetworkTask(synchronizedBlockingExecutor, f5, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new Pm(rm, new C5419im(), new FullUrlFormer(c5575om, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), CollectionsKt.emptyList(), c);
    }
}
