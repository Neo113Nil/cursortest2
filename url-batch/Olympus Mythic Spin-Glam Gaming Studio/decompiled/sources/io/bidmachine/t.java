package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.OS;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.bidmachine.ApiRequest;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapter;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.C6025u;
import io.bidmachine.internal.I;
import io.bidmachine.internal.J;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.t;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoSerializerKt;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.ProtoUtilsKt;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class t {
    private static final long k;
    private static final long l;
    private static final long m;
    private final Context a;
    private final String b;
    private final Queue e;
    private final Queue f;
    private c g;
    private ApiRequest h;
    private final J j;
    private long i = 0;
    private final TrackingObject c = new BidMachineTrackingObject();
    private final Runnable d = new b(this);

    class a implements Runnable {

        /* renamed from: io.bidmachine.t$a$a, reason: collision with other inner class name */
        class C1816a implements NetworkRequest.Callback {
            C1816a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String a(long j) {
                return String.format("reschedule init request (%s)", Long.valueOf(j));
            }

            @Override // io.bidmachine.core.NetworkRequest.Callback
            public void onFail(BMError bMError) {
                final long j;
                t.this.h = null;
                if (t.this.f.isEmpty()) {
                    j = t.this.a();
                    Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.t$a$a$$ExternalSyntheticLambda0
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String a;
                            a = t.a.C1816a.a(j);
                            return a;
                        }
                    });
                    if (t.this.g != null) {
                        t.this.g.onFail(bMError);
                    }
                } else {
                    j = 0;
                }
                Utils.onBackgroundThread(t.this.d, j);
                t.this.c.eventFinish(TrackEventType.InitLoading, null, null, bMError);
            }

            @Override // io.bidmachine.core.NetworkRequest.Callback
            public void onSuccess(InitResponse initResponse) {
                t.this.h = null;
                t.this.i = 0L;
                Utils.cancelBackgroundThreadTask(t.this.d);
                if (t.this.g != null) {
                    t.this.g.onSuccess(initResponse);
                }
                t.this.c.eventFinish(TrackEventType.InitLoading, null, null, null);
                t.this.j.a();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.h = new ApiRequest.Builder().url(t.this.d()).setDataBinder(new ApiRequest.ApiInitDataBinder()).setRequestData(t.this.b()).setCallback(new C1816a()).request();
        }
    }

    private static class b implements Runnable {
        private final WeakReference a;

        public b(t tVar) {
            this.a = new WeakReference(tVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = (t) this.a.get();
            if (tVar != null) {
                tVar.e();
            }
        }
    }

    interface c extends NetworkRequest.Callback {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = timeUnit.toMillis(2L);
        l = timeUnit.toMillis(128L);
        m = TimeUnit.DAYS.toMillis(7L);
    }

    public t(Context context, String str, Queue queue) {
        this.a = context;
        this.b = str;
        this.e = new LinkedList(queue);
        this.f = new LinkedList(queue);
        this.j = new J(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InitRequest b() {
        final k b2 = k.b();
        C6025u b3 = b2.b(this.a);
        final io.bidmachine.internal.v c2 = b3.c();
        TargetingParams q = b2.q();
        final InitRequest.Builder newBuilder = InitRequest.newBuilder();
        final MaskedSignals.Builder newBuilder2 = MaskedSignals.newBuilder();
        io.bidmachine.internal.w d = b3.d();
        newBuilder.setBmIfv(b2.g(this.a));
        d.a(new Runnable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                t.this.a(newBuilder, b2);
            }
        }, new Runnable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                t.this.a(newBuilder, newBuilder2, c2, b2);
            }
        }, new Runnable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                InitRequest.Builder.this.setIfa(MobileFuseDefaults.ADVERTISING_ID_ZEROS);
            }
        });
        String packageName = this.a.getPackageName();
        if (packageName != null) {
            newBuilder.setBundle(packageName);
        }
        newBuilder.setSellerId(this.b);
        newBuilder.setOs(OS.OS_ANDROID);
        newBuilder.setOsv(DeviceUtils.getOsVersion());
        String appVersion = Utils.getAppVersion(this.a);
        if (appVersion != null) {
            newBuilder.setAppVer(appVersion);
        }
        newBuilder.setSdk(BidMachine.NAME);
        newBuilder.setSdkver("3.7.1");
        newBuilder.setSessionId(b3.h());
        final DeviceInfo obtain = DeviceInfo.obtain(this.a);
        d.a(new Runnable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                t.a(DeviceInfo.this, newBuilder);
            }
        }, new Runnable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                t.a(DeviceInfo.this, newBuilder2, c2);
            }
        });
        newBuilder.setMake(obtain.getManufacturer());
        newBuilder.setDeviceType(DeviceInfoKt.toProtobufDeviceType(obtain.getDeviceType()));
        ConnectionType connectionType = DeviceUtils.getConnectionType(this.a);
        newBuilder.setContype(connectionType);
        newBuilder.setContext(RequestDataRetriever.createContext(this.a, b2, b3, q, newBuilder2, connectionType, null));
        newBuilder.setAndroid(c(this.a));
        newBuilder.setExt(a(this.a));
        return newBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        if (this.f.isEmpty()) {
            this.f.addAll(this.e);
        }
        return (String) this.f.poll();
    }

    void c() {
        this.g = null;
        this.h = null;
    }

    void e() {
        this.c.eventStart(TrackEventType.InitLoading, null);
        Utils.onBackgroundThread(new a());
    }

    private InitRequest.AndroidPlatformData c(Context context) {
        PlatformData platformData = PlatformData.get(context);
        final InitRequest.AndroidPlatformData.Builder newBuilder = InitRequest.AndroidPlatformData.newBuilder();
        Integer minSdkVersion = platformData.getMinSdkVersion();
        Objects.requireNonNull(newBuilder);
        Utils.ifNotNull(minSdkVersion, new Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                InitRequest.AndroidPlatformData.Builder.this.setMinApiLevel(((Integer) obj).intValue());
            }
        });
        Utils.ifNotNull(platformData.kotlinVersion, new Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda1
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                InitRequest.AndroidPlatformData.Builder.this.setKotlinVersion((String) obj);
            }
        });
        for (I i : this.j.a(TimeManager.currentTimeMillis() - m)) {
            newBuilder.addContentProviderStartupMetrics(InitRequest.AndroidPlatformData.ContentProviderStartupMetrics.newBuilder().setStartInitTime(ProtoUtils.msToTimestamp(i.b())).setInitDuration(i.a()).setInitCompleted(i.c()).build());
        }
        return newBuilder.build();
    }

    void a(c cVar) {
        this.g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InitRequest.Builder builder, k kVar) {
        AdvertisingDataManager.c(this.a);
        builder.setIfa(AdvertisingDataManager.a(this.a));
        String g = kVar.g();
        if (TextUtils.isEmpty(g)) {
            return;
        }
        builder.setIfv(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InitRequest.Builder builder, MaskedSignals.Builder builder2, io.bidmachine.internal.v vVar, k kVar) {
        AdvertisingDataManager.c(this.a);
        builder.setIfa(MobileFuseDefaults.ADVERTISING_ID_ZEROS);
        builder2.setIfa(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(AdvertisingDataManager.a(this.a)))));
        String g = kVar.g();
        if (TextUtils.isEmpty(g)) {
            return;
        }
        builder2.setIfv(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(g))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(DeviceInfo deviceInfo, final InitRequest.Builder builder) {
        String model = deviceInfo.getModel();
        Objects.requireNonNull(builder);
        io.bidmachine.util.Utils.ifNotNull(model, new io.bidmachine.util.Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda2
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                InitRequest.Builder.this.setModel((String) obj);
            }
        });
        io.bidmachine.util.Utils.ifNotNull(deviceInfo.getHWV(), new io.bidmachine.util.Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda3
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                InitRequest.Builder.this.setHwv((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(DeviceInfo deviceInfo, final MaskedSignals.Builder builder, final io.bidmachine.internal.v vVar) {
        io.bidmachine.util.Utils.ifNotNull(deviceInfo.getModel(), new io.bidmachine.util.Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda9
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                t.a(MaskedSignals.Builder.this, vVar, (String) obj);
            }
        });
        io.bidmachine.util.Utils.ifNotNull(deviceInfo.getHWV(), new io.bidmachine.util.Executable() { // from class: io.bidmachine.t$$ExternalSyntheticLambda10
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                t.b(MaskedSignals.Builder.this, vVar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MaskedSignals.Builder builder, io.bidmachine.internal.v vVar, String str) {
        builder.setModel(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(str))));
    }

    private Struct a(Context context) {
        Struct.Builder newBuilder = Struct.newBuilder();
        newBuilder.putFields("networks_info", Value.newBuilder().setListValue(b(context)).build());
        return newBuilder.build();
    }

    private Value a(String str, String str2, String str3) {
        Value build = Value.newBuilder().setStringValue(str).build();
        Value build2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", build).putFields("network_version", build2).putFields("network_adapter_version", Value.newBuilder().setStringValue(str3).build()).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a() {
        long j = this.i;
        if (j <= 0) {
            this.i = k;
        } else {
            long j2 = j * 2;
            this.i = j2;
            long j3 = l;
            if (j2 >= j3) {
                this.i = j3;
            }
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(MaskedSignals.Builder builder, io.bidmachine.internal.v vVar, String str) {
        builder.setHwv(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(str))));
    }

    private ListValue.Builder b(Context context) {
        ListValue.Builder newBuilder = ListValue.newBuilder();
        for (x xVar : w.b(context).values()) {
            newBuilder.addValues(a(xVar.c(), xVar.d(), xVar.a()));
        }
        newBuilder.addValues(a("mraid", "3.7.1", "3.7.1.1"));
        newBuilder.addValues(a("vast", "3.7.1", "3.7.1.1"));
        newBuilder.addValues(a(NastAdapter.KEY, NastAdapter.ADAPTER_SDK_VERSION_NAME, "3.7.1.1"));
        newBuilder.addValues(a(AdaptiveRenderingAdapter.KEY, "3.7.1", "3.7.1.1"));
        return newBuilder;
    }
}
