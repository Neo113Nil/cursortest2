package io.bidmachine;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.OS;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.C6018m;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.conversion.StringTypeConversion;
import io.bidmachine.utils.BluetoothUtils;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoSerializerKt;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006$"}, d2 = {"Lio/bidmachine/DeviceParams;", "", "Lio/bidmachine/DeviceConnectionParams;", "deviceConnectionParams", "<init>", "(Lio/bidmachine/DeviceConnectionParams;)V", "Landroid/content/Context;", "context", "Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;", "maskedSignalsBuilder", "Lio/bidmachine/internal/w;", "privacyGroupRestrictions", "Lio/bidmachine/internal/v;", "privacyDataMasker", "Lio/bidmachine/protobuf/sdk/Device$Builder;", "createDeviceBuilder", "(Landroid/content/Context;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/internal/v;)Lio/bidmachine/protobuf/sdk/Device$Builder;", "builder", "", "fillDeviceBuilder", "(Landroid/content/Context;Lio/bidmachine/protobuf/sdk/Device$Builder;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/internal/v;)V", "Lcom/explorestack/protobuf/adcom/ConnectionType;", "connectionType", "Lcom/explorestack/protobuf/adcom/Context$Device$Builder;", "createDeviceContextBuilder", "(Landroid/content/Context;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/internal/v;Lcom/explorestack/protobuf/adcom/ConnectionType;)Lcom/explorestack/protobuf/adcom/Context$Device$Builder;", "fillDeviceContextBuilder", "(Landroid/content/Context;Lcom/explorestack/protobuf/adcom/Context$Device$Builder;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/internal/v;Lcom/explorestack/protobuf/adcom/ConnectionType;)V", "Lio/bidmachine/protobuf/RequestTokenPayload$Builder;", "requestTokenPayloadBuilder", "build", "(Landroid/content/Context;Lio/bidmachine/protobuf/RequestTokenPayload$Builder;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/internal/v;)V", "Lcom/explorestack/protobuf/adcom/Context$Builder;", "contextBuilder", "(Landroid/content/Context;Lcom/explorestack/protobuf/adcom/Context$Builder;Lio/bidmachine/internal/w;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lio/bidmachine/internal/v;Lcom/explorestack/protobuf/adcom/ConnectionType;)V", "Lio/bidmachine/DeviceConnectionParams;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceParams {

    @NotNull
    private final DeviceConnectionParams deviceConnectionParams;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ io.bidmachine.k a;
        final /* synthetic */ Device.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.bidmachine.k kVar, Device.Builder builder) {
            super(0);
            this.a = kVar;
            this.b = builder;
        }

        public final void a() {
            String g = this.a.g();
            if (g != null) {
                Device.Builder builder = this.b;
                if (!StringsKt.isBlank(g)) {
                    builder.setIfv(g);
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0 {
        final /* synthetic */ io.bidmachine.k a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ io.bidmachine.internal.v c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.bidmachine.k kVar, MaskedSignals.Builder builder, io.bidmachine.internal.v vVar) {
            super(0);
            this.a = kVar;
            this.b = builder;
            this.c = vVar;
        }

        public final void a() {
            String g = this.a.g();
            if (g != null) {
                MaskedSignals.Builder builder = this.b;
                io.bidmachine.internal.v vVar = this.c;
                if (!StringsKt.isBlank(g)) {
                    builder.setIfv(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(g))));
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ Context a;
        final /* synthetic */ Device.Builder b;
        final /* synthetic */ io.bidmachine.k c;
        final /* synthetic */ DeviceInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, Device.Builder builder, io.bidmachine.k kVar, DeviceInfo deviceInfo) {
            super(0);
            this.a = context;
            this.b = builder;
            this.c = kVar;
            this.d = deviceInfo;
        }

        public final void a() {
            String str;
            Set<String> inputLanguageSet = DeviceUtils.getInputLanguageSet(this.a);
            Intrinsics.checkNotNullExpressionValue(inputLanguageSet, "getInputLanguageSet(context)");
            if (!inputLanguageSet.isEmpty()) {
                this.b.addAllInputlanguage(inputLanguageSet);
            }
            Double batteryLevel = DeviceUtils.getBatteryLevel(this.a);
            if (batteryLevel != null) {
                this.b.setBatterylevel((float) batteryLevel.doubleValue());
            }
            String deviceName = DeviceUtils.getDeviceName(this.a);
            if (deviceName != null) {
                Device.Builder builder = this.b;
                if (!StringsKt.isBlank(deviceName)) {
                    builder.setDevicename(deviceName);
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
            Double screenBrightnessRatio = DeviceUtils.getScreenBrightnessRatio(this.a);
            if (screenBrightnessRatio != null) {
                this.b.setScreenbright((float) screenBrightnessRatio.doubleValue());
            }
            this.b.setTime(TimeManager.currentTimeMillis());
            this.b.setLastbootup(SystemClock.elapsedRealtime());
            this.b.setLastbootupV2(this.c.i(this.a));
            Set<String> connectedHeadsets = BluetoothUtils.getConnectedHeadsets(this.a);
            if (connectedHeadsets != null) {
                if (connectedHeadsets.isEmpty()) {
                    connectedHeadsets = null;
                }
                if (connectedHeadsets != null && (str = (String) CollectionsKt.firstOrNull(connectedHeadsets)) != null) {
                    this.b.setHeadsetname(str);
                }
            }
            Long availableDiskSpaceInMB = this.d.getAvailableDiskSpaceInMB();
            if (availableDiskSpaceInMB != null) {
                this.b.setDiskspace(availableDiskSpaceInMB.longValue());
            }
            Long totalDiskSpaceInMB = this.d.getTotalDiskSpaceInMB();
            if (totalDiskSpaceInMB != null) {
                this.b.setTotaldisk(totalDiskSpaceInMB.longValue());
            }
            Long totalMemBytes = this.d.getRam().getTotalMemBytes();
            if (totalMemBytes != null) {
                this.b.setTotalmem(totalMemBytes.longValue());
            }
            Long freeMemBytes = this.d.getRam().getFreeMemBytes();
            if (freeMemBytes != null) {
                this.b.setFreemem(freeMemBytes.longValue());
            }
            String name = this.d.getCpu().getName();
            if (name != null) {
                if (name.length() <= 0) {
                    name = null;
                }
                if (name != null) {
                    this.b.setCpuname(name);
                }
            }
            String vendor = this.d.getCpu().getVendor();
            if (vendor != null) {
                if (vendor.length() <= 0) {
                    vendor = null;
                }
                if (vendor != null) {
                    this.b.setCpuvendor(vendor);
                }
            }
            String name2 = this.d.getGpu().getName();
            if (name2 != null) {
                if (name2.length() <= 0) {
                    name2 = null;
                }
                if (name2 != null) {
                    this.b.setGpuname(name2);
                }
            }
            String vendor2 = this.d.getGpu().getVendor();
            if (vendor2 != null) {
                if (vendor2.length() <= 0) {
                    vendor2 = null;
                }
                if (vendor2 != null) {
                    this.b.setGpuvendor(vendor2);
                }
            }
            String simCarrier = this.d.getSimCarrier();
            if (simCarrier != null) {
                String str2 = simCarrier.length() > 0 ? simCarrier : null;
                if (str2 != null) {
                    this.b.setSimCarrier(StringValue.of(str2));
                }
            }
            Float volumeLevel = this.d.getAudio().getVolumeLevel(this.a);
            if (volumeLevel != null) {
                this.b.setAudioContext(Context.Device.AudioContext.newBuilder().setVolumelevel(volumeLevel.floatValue()).build());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ io.bidmachine.internal.v c;
        final /* synthetic */ io.bidmachine.k d;
        final /* synthetic */ DeviceInfo e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(android.content.Context context, MaskedSignals.Builder builder, io.bidmachine.internal.v vVar, io.bidmachine.k kVar, DeviceInfo deviceInfo) {
            super(0);
            this.a = context;
            this.b = builder;
            this.c = vVar;
            this.d = kVar;
            this.e = deviceInfo;
        }

        public final void a() {
            String str;
            Set<String> inputLanguageSet = DeviceUtils.getInputLanguageSet(this.a);
            Intrinsics.checkNotNullExpressionValue(inputLanguageSet, "getInputLanguageSet(context)");
            if (!inputLanguageSet.isEmpty()) {
                this.b.setInputlanguage(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(inputLanguageSet))));
            }
            Double batteryLevel = DeviceUtils.getBatteryLevel(this.a);
            if (batteryLevel != null) {
                this.b.setBatterylevel(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize((float) batteryLevel.doubleValue()))));
            }
            String deviceName = DeviceUtils.getDeviceName(this.a);
            if (deviceName != null) {
                MaskedSignals.Builder builder = this.b;
                io.bidmachine.internal.v vVar = this.c;
                if (!StringsKt.isBlank(deviceName)) {
                    builder.setDevicename(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(deviceName))));
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
            Double screenBrightnessRatio = DeviceUtils.getScreenBrightnessRatio(this.a);
            if (screenBrightnessRatio != null) {
                this.b.setScreenbright(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize((float) screenBrightnessRatio.doubleValue()))));
            }
            this.b.setTime(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(TimeManager.currentTimeMillis()))));
            this.b.setLastbootup(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(SystemClock.elapsedRealtime()))));
            this.b.setLastbootupV2(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(this.d.i(this.a)))));
            Set<String> connectedHeadsets = BluetoothUtils.getConnectedHeadsets(this.a);
            if (connectedHeadsets != null) {
                if (connectedHeadsets.isEmpty()) {
                    connectedHeadsets = null;
                }
                if (connectedHeadsets != null && (str = (String) CollectionsKt.firstOrNull(connectedHeadsets)) != null) {
                    this.b.setHeadsetname(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(str))));
                }
            }
            Long availableDiskSpaceInMB = this.e.getAvailableDiskSpaceInMB();
            if (availableDiskSpaceInMB != null) {
                this.b.setDiskspace(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(availableDiskSpaceInMB.longValue()))));
            }
            Long totalDiskSpaceInMB = this.e.getTotalDiskSpaceInMB();
            if (totalDiskSpaceInMB != null) {
                this.b.setTotaldisk(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(totalDiskSpaceInMB.longValue()))));
            }
            Long totalMemBytes = this.e.getRam().getTotalMemBytes();
            if (totalMemBytes != null) {
                this.b.setTotalmem(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(totalMemBytes.longValue()))));
            }
            Long freeMemBytes = this.e.getRam().getFreeMemBytes();
            if (freeMemBytes != null) {
                this.b.setFreemem(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(freeMemBytes.longValue()))));
            }
            String name = this.e.getCpu().getName();
            if (name != null) {
                if (name.length() <= 0) {
                    name = null;
                }
                if (name != null) {
                    this.b.setCpuname(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(name))));
                }
            }
            String vendor = this.e.getCpu().getVendor();
            if (vendor != null) {
                if (vendor.length() <= 0) {
                    vendor = null;
                }
                if (vendor != null) {
                    this.b.setCpuvendor(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(vendor))));
                }
            }
            String name2 = this.e.getGpu().getName();
            if (name2 != null) {
                if (name2.length() <= 0) {
                    name2 = null;
                }
                if (name2 != null) {
                    this.b.setGpuname(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(name2))));
                }
            }
            String vendor2 = this.e.getGpu().getVendor();
            if (vendor2 != null) {
                if (vendor2.length() <= 0) {
                    vendor2 = null;
                }
                if (vendor2 != null) {
                    this.b.setGpuvendor(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(vendor2))));
                }
            }
            String simCarrier = this.e.getSimCarrier();
            if (simCarrier != null) {
                String str2 = simCarrier.length() > 0 ? simCarrier : null;
                if (str2 != null) {
                    this.b.setSimCarrier(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(str2))));
                }
            }
            Float volumeLevel = this.e.getAudio().getVolumeLevel(this.a);
            if (volumeLevel != null) {
                this.b.setVolumeLevel(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(volumeLevel.floatValue()))));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function0 {
        final /* synthetic */ Context.Device.Builder a;
        final /* synthetic */ DeviceInfo b;
        final /* synthetic */ android.content.Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context.Device.Builder builder, DeviceInfo deviceInfo, android.content.Context context) {
            super(0);
            this.a = builder;
            this.b = deviceInfo;
            this.c = context;
        }

        public final void a() {
            this.a.setPxratio(this.b.getScreenDensity());
            this.a.setPpi(this.b.getScreenDpi());
            this.a.setModel(this.b.getModel());
            String hwv = this.b.getHWV();
            if (hwv != null) {
                this.a.setHwv(hwv);
            }
            String userAgent = UserAgentManager.getUserAgent(this.c);
            if (userAgent != null) {
                Context.Device.Builder builder = this.a;
                if (!StringsKt.isBlank(userAgent)) {
                    builder.setUa(userAgent);
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class f extends Lambda implements Function0 {
        final /* synthetic */ MaskedSignals.Builder a;
        final /* synthetic */ io.bidmachine.internal.v b;
        final /* synthetic */ DeviceInfo c;
        final /* synthetic */ android.content.Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MaskedSignals.Builder builder, io.bidmachine.internal.v vVar, DeviceInfo deviceInfo, android.content.Context context) {
            super(0);
            this.a = builder;
            this.b = vVar;
            this.c = deviceInfo;
            this.d = context;
        }

        public final void a() {
            this.a.setPxratio(ProtoUtilsKt.toProtoStringValue(this.b.a(ProtoSerializerKt.protoSerialize(this.c.getScreenDensity()))));
            this.a.setPpi(ProtoUtilsKt.toProtoStringValue(this.b.a(ProtoSerializerKt.protoSerialize(this.c.getScreenDpi()))));
            this.a.setModel(ProtoUtilsKt.toProtoStringValue(this.b.a(ProtoSerializerKt.protoSerialize(this.c.getModel()))));
            String hwv = this.c.getHWV();
            if (hwv != null) {
                this.a.setHwv(ProtoUtilsKt.toProtoStringValue(this.b.a(ProtoSerializerKt.protoSerialize(hwv))));
            }
            String userAgent = UserAgentManager.getUserAgent(this.d);
            if (userAgent != null) {
                MaskedSignals.Builder builder = this.a;
                io.bidmachine.internal.v vVar = this.b;
                if (!StringsKt.isBlank(userAgent)) {
                    builder.setUa(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(userAgent))));
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class g extends Lambda implements Function0 {
        final /* synthetic */ Context.Device.Builder a;
        final /* synthetic */ android.content.Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context.Device.Builder builder, android.content.Context context) {
            super(0);
            this.a = builder;
            this.b = context;
        }

        public final void a() {
            this.a.setIfa(AdvertisingDataManager.a(this.b));
            this.a.setLmt(AdvertisingDataManager.a());
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class h extends Lambda implements Function0 {
        final /* synthetic */ Context.Device.Builder a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ io.bidmachine.internal.v c;
        final /* synthetic */ android.content.Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context.Device.Builder builder, MaskedSignals.Builder builder2, io.bidmachine.internal.v vVar, android.content.Context context) {
            super(0);
            this.a = builder;
            this.b = builder2;
            this.c = vVar;
            this.d = context;
        }

        public final void a() {
            this.a.setIfa(MobileFuseDefaults.ADVERTISING_ID_ZEROS);
            MaskedSignals.Builder builder = this.b;
            io.bidmachine.internal.v vVar = this.c;
            String a = AdvertisingDataManager.a(this.d);
            Intrinsics.checkNotNullExpressionValue(a, "getAdvertisingId(context)");
            builder.setIfa(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(a))));
            this.b.setLmt(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(AdvertisingDataManager.a()))));
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class i extends Lambda implements Function0 {
        final /* synthetic */ Context.Device.Builder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context.Device.Builder builder) {
            super(0);
            this.a = builder;
        }

        public final void a() {
            this.a.setIfa(MobileFuseDefaults.ADVERTISING_ID_ZEROS);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class j extends Lambda implements Function0 {
        final /* synthetic */ DeviceInfo a;
        final /* synthetic */ Context.Device.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(DeviceInfo deviceInfo, Context.Device.Builder builder) {
            super(0);
            this.a = deviceInfo;
            this.b = builder;
        }

        public final void a() {
            String phoneMCCMNC = this.a.getPhoneMCCMNC();
            if (phoneMCCMNC != null) {
                Context.Device.Builder builder = this.b;
                if (!StringsKt.isBlank(phoneMCCMNC)) {
                    builder.setMccmnc(phoneMCCMNC);
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
            String phoneCarrier = this.a.getPhoneCarrier();
            if (phoneCarrier != null) {
                Context.Device.Builder builder2 = this.b;
                if (!StringsKt.isBlank(phoneCarrier)) {
                    builder2.setCarrier(phoneCarrier);
                }
                List emptyList2 = CollectionsKt.emptyList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : emptyList2) {
                    if (obj2 instanceof StringTypeConversion) {
                        arrayList2.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class k extends Lambda implements Function0 {
        final /* synthetic */ DeviceInfo a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ io.bidmachine.internal.v c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(DeviceInfo deviceInfo, MaskedSignals.Builder builder, io.bidmachine.internal.v vVar) {
            super(0);
            this.a = deviceInfo;
            this.b = builder;
            this.c = vVar;
        }

        public final void a() {
            String phoneMCCMNC = this.a.getPhoneMCCMNC();
            if (phoneMCCMNC != null) {
                MaskedSignals.Builder builder = this.b;
                io.bidmachine.internal.v vVar = this.c;
                if (!StringsKt.isBlank(phoneMCCMNC)) {
                    builder.setMccmnc(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(phoneMCCMNC))));
                }
                List emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof StringTypeConversion) {
                        arrayList.add(obj);
                    }
                }
            }
            String phoneCarrier = this.a.getPhoneCarrier();
            if (phoneCarrier != null) {
                MaskedSignals.Builder builder2 = this.b;
                io.bidmachine.internal.v vVar2 = this.c;
                if (!StringsKt.isBlank(phoneCarrier)) {
                    builder2.setCarrier(ProtoUtilsKt.toProtoStringValue(vVar2.a(ProtoSerializerKt.protoSerialize(phoneCarrier))));
                }
                List emptyList2 = CollectionsKt.emptyList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : emptyList2) {
                    if (obj2 instanceof StringTypeConversion) {
                        arrayList2.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class l extends Lambda implements Function0 {
        final /* synthetic */ android.content.Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(android.content.Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Location mo4828invoke() {
            return UtilsKt.getLocation(this.a);
        }
    }

    public DeviceParams(@NotNull DeviceConnectionParams deviceConnectionParams) {
        Intrinsics.checkNotNullParameter(deviceConnectionParams, "deviceConnectionParams");
        this.deviceConnectionParams = deviceConnectionParams;
    }

    private final Device.Builder createDeviceBuilder(android.content.Context context, MaskedSignals.Builder maskedSignalsBuilder, io.bidmachine.internal.w privacyGroupRestrictions, io.bidmachine.internal.v privacyDataMasker) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Device.Builder newBuilder = Device.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "this");
            fillDeviceBuilder(context, newBuilder, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker);
            m8023constructorimpl = Result.m8023constructorimpl(newBuilder);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Device.Builder) m8023constructorimpl;
    }

    private final Context.Device.Builder createDeviceContextBuilder(android.content.Context context, MaskedSignals.Builder maskedSignalsBuilder, io.bidmachine.internal.w privacyGroupRestrictions, io.bidmachine.internal.v privacyDataMasker, ConnectionType connectionType) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context.Device.Builder newBuilder = Context.Device.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "this");
            fillDeviceContextBuilder(context, newBuilder, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker, connectionType);
            m8023constructorimpl = Result.m8023constructorimpl(newBuilder);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Context.Device.Builder) m8023constructorimpl;
    }

    private final void fillDeviceBuilder(android.content.Context context, Device.Builder builder, MaskedSignals.Builder maskedSignalsBuilder, io.bidmachine.internal.w privacyGroupRestrictions, io.bidmachine.internal.v privacyDataMasker) {
        io.bidmachine.k b2 = io.bidmachine.k.b();
        Intrinsics.checkNotNullExpressionValue(b2, "get()");
        DeviceInfo obtain = DeviceInfo.INSTANCE.obtain(context);
        obtain.updateHwInfo(context);
        builder.setBmIfv(b2.g(context));
        io.bidmachine.internal.w.a(privacyGroupRestrictions, new a(b2, builder), new b(b2, maskedSignalsBuilder, privacyDataMasker), null, 4, null);
        privacyGroupRestrictions.b(new c(context, builder, b2, obtain), new d(context, maskedSignalsBuilder, privacyDataMasker, b2, obtain));
        Boolean isCharging = DeviceUtils.isCharging(context);
        if (isCharging != null) {
            builder.setCharging(isCharging.booleanValue());
        }
        Boolean isHeadsetConnected = BluetoothUtils.isHeadsetConnected(context);
        if (isHeadsetConnected != null) {
            builder.setHeadset(isHeadsetConnected.booleanValue());
        }
        Boolean isBatterySaverEnabled = DeviceUtils.isBatterySaverEnabled(context);
        if (isBatterySaverEnabled != null) {
            builder.setBatterysaver(isBatterySaverEnabled.booleanValue());
        }
        builder.setDarkmode(DeviceUtils.isDarkModeEnabled(context));
        Boolean isAirplaneModeOn = DeviceUtils.isAirplaneModeOn(context);
        if (isAirplaneModeOn != null) {
            builder.setAirplane(isAirplaneModeOn.booleanValue());
        }
        Boolean isDoNotDisturbOn = DeviceUtils.isDoNotDisturbOn(context);
        if (isDoNotDisturbOn != null) {
            builder.setDnd(isDoNotDisturbOn.booleanValue());
        }
        ConnectionType connectionType = DeviceUtils.getConnectionType(context);
        Intrinsics.checkNotNullExpressionValue(connectionType, "getConnectionType(context)");
        this.deviceConnectionParams.build(context, builder, connectionType);
        builder.setApilevel(Build.VERSION.SDK_INT);
        String timezoneId = TimeManager.getTimezoneId();
        if (timezoneId != null) {
            if (timezoneId.length() <= 0) {
                timezoneId = null;
            }
            if (timezoneId != null) {
                builder.setTimezone(timezoneId);
            }
        }
        builder.setJailbreak(obtain.isDeviceRooted());
        Boolean isRingMuted = obtain.getAudio().isRingMuted(context);
        if (isRingMuted != null) {
            builder.setRingmute(isRingMuted.booleanValue());
        }
        String simCountry = obtain.getSimCountry();
        if (simCountry != null) {
            if (!StringsKt.isBlank(simCountry)) {
                builder.setSimCountry(StringValue.of(simCountry));
            }
            List emptyList = CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : emptyList) {
                if (obj instanceof StringTypeConversion) {
                    arrayList.add(obj);
                }
            }
        }
        Boolean isNetworkInRoaming = obtain.isNetworkInRoaming();
        if (isNetworkInRoaming != null) {
            builder.setNetworkRoaming(BoolValue.of(isNetworkInRoaming.booleanValue()));
        }
    }

    private final void fillDeviceContextBuilder(android.content.Context context, Context.Device.Builder builder, MaskedSignals.Builder maskedSignalsBuilder, io.bidmachine.internal.w privacyGroupRestrictions, io.bidmachine.internal.v privacyDataMasker, ConnectionType connectionType) {
        DeviceInfo obtain = DeviceInfo.INSTANCE.obtain(context);
        builder.setType(DeviceInfoKt.toProtobufDeviceType(obtain.getDeviceType()));
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(DeviceUtils.getOsVersion());
        builder.setMake(DeviceUtils.getManufacturer());
        String language = Locale.getDefault().getLanguage();
        if (language != null && !StringsKt.isBlank(language)) {
            builder.setLang(language);
        }
        List emptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : emptyList) {
            if (obj instanceof StringTypeConversion) {
                arrayList.add(obj);
            }
        }
        if (connectionType == null) {
            connectionType = DeviceUtils.getConnectionType(context);
            Intrinsics.checkNotNullExpressionValue(connectionType, "getConnectionType(context)");
        }
        builder.setContype(connectionType);
        this.deviceConnectionParams.build(context, builder, connectionType);
        Size screenSize = Utils.getScreenSize(context);
        Intrinsics.checkNotNullExpressionValue(screenSize, "getScreenSize(context)");
        builder.setW(screenSize.getWidth());
        builder.setH(screenSize.getHeight());
        privacyGroupRestrictions.b(new e(builder, obtain, context), new f(maskedSignalsBuilder, privacyDataMasker, obtain, context));
        privacyGroupRestrictions.a(new g(builder, context), new h(builder, maskedSignalsBuilder, privacyDataMasker, context), new i(builder));
        privacyGroupRestrictions.c(new j(obtain, builder), new k(obtain, maskedSignalsBuilder, privacyDataMasker));
        builder.setGeo(C6018m.a(maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker, new l(context)).build());
    }

    public final void build(@NotNull android.content.Context context, @NotNull RequestTokenPayload.Builder requestTokenPayloadBuilder, @NotNull MaskedSignals.Builder maskedSignalsBuilder, @NotNull io.bidmachine.internal.w privacyGroupRestrictions, @NotNull io.bidmachine.internal.v privacyDataMasker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestTokenPayloadBuilder, "requestTokenPayloadBuilder");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        Device.Builder createDeviceBuilder = createDeviceBuilder(context, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker);
        if (createDeviceBuilder != null) {
            requestTokenPayloadBuilder.setDeviceData(createDeviceBuilder);
        }
    }

    public final void build(@NotNull android.content.Context context, @NotNull Context.Builder contextBuilder, @NotNull io.bidmachine.internal.w privacyGroupRestrictions, @NotNull MaskedSignals.Builder maskedSignalsBuilder, @NotNull io.bidmachine.internal.v privacyDataMasker, @Nullable ConnectionType connectionType) {
        Device build;
        Any pack;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextBuilder, "contextBuilder");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        Context.Device.Builder createDeviceContextBuilder = createDeviceContextBuilder(context, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker, connectionType);
        if (createDeviceContextBuilder == null) {
            return;
        }
        Device.Builder createDeviceBuilder = createDeviceBuilder(context, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker);
        if (createDeviceBuilder != null && (build = createDeviceBuilder.build()) != null && (pack = Any.pack(build)) != null) {
            createDeviceContextBuilder.addExtProto(pack);
        }
        contextBuilder.setDevice(createDeviceContextBuilder.build());
    }
}
