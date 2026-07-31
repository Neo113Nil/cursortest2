package com.mobilefuse.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.service.MobileFuseService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SensorService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0016J'\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u001aH\u0010¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u0018H\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/mobilefuse/sdk/SensorService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "lastPressure", "", "Ljava/lang/Float;", "pressureSensor", "Landroid/hardware/Sensor;", "pressureSensorListener", "Landroid/hardware/SensorEventListener;", "sensorManager", "Landroid/hardware/SensorManager;", "sensorRefreshTimestamp", "", "sensorValidTime", "getLastPressure", "()Ljava/lang/Float;", "initServiceImpl", "", "completeAction", "Lkotlin/Function2;", "initServiceImpl$mobilefuse_sdk_core_release", "resetImpl", "unregisterPressureSensor", "updateSensors", "context", "Landroid/content/Context;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class SensorService extends MobileFuseService {
    private static Float lastPressure = null;
    private static Sensor pressureSensor = null;
    private static SensorManager sensorManager = null;
    private static long sensorRefreshTimestamp = 0;
    private static final long sensorValidTime = 60000;

    @NotNull
    public static final SensorService INSTANCE = new SensorService();
    private static boolean enabled = true;
    private static final SensorEventListener pressureSensorListener = new SensorEventListener() { // from class: com.mobilefuse.sdk.SensorService$pressureSensorListener$1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@Nullable SensorEvent event) {
            float[] fArr;
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                SensorService sensorService = SensorService.INSTANCE;
                SensorService.lastPressure = (event == null || (fArr = event.values) == null) ? null : Float.valueOf(fArr[0]);
                sensorService.unregisterPressureSensor();
            } catch (Throwable th) {
                int i = SensorService$pressureSensorListener$1$onSensorChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    };

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterPressureSensor() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Sensor sensor = pressureSensor;
            if (sensor == null) {
                return;
            }
            SensorManager sensorManager2 = sensorManager;
            if (sensorManager2 != null) {
                sensorManager2.unregisterListener(pressureSensorListener, sensor);
            }
            pressureSensor = null;
        } catch (Throwable th) {
            int i = SensorService$unregisterPressureSensor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void updateSensors(@NotNull Context context) {
        SensorManager sensorManager2;
        Sensor defaultSensor;
        Intrinsics.checkNotNullParameter(context, "context");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (enabled) {
                long currentTimeMillis = System.currentTimeMillis();
                if ((currentTimeMillis - sensorRefreshTimestamp > 60000 || lastPressure == null) && (sensorManager2 = sensorManager) != null && (defaultSensor = sensorManager2.getDefaultSensor(6)) != null) {
                    pressureSensor = defaultSensor;
                    sensorRefreshTimestamp = currentTimeMillis;
                    SensorManager sensorManager3 = sensorManager;
                    if (sensorManager3 != null) {
                        sensorManager3.registerListener(pressureSensorListener, defaultSensor, 3);
                    }
                }
            }
        } catch (Throwable th) {
            int i = SensorService$updateSensors$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private SensorService() {
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final void setEnabled(boolean z) {
        enabled = z;
    }

    @Nullable
    public static final Float getLastPressure() {
        Either errorResult;
        Context globalContext;
        Float f;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            globalContext = AppLifecycleHelper.getGlobalContext();
            f = lastPressure;
        } catch (Throwable th) {
            if (SensorService$getLastPressure$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (f == null) {
            updateSensors(globalContext);
            return null;
        }
        updateSensors(globalContext);
        errorResult = new SuccessResult(f);
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((SuccessResult) errorResult).getValue();
        }
        return (Float) obj;
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2 completeAction) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Object systemService = AppLifecycleHelper.getGlobalContext().getSystemService("sensor");
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            sensorManager = (SensorManager) systemService;
            completeAction.invoke(INSTANCE, Boolean.TRUE);
            updateSensors(AppLifecycleHelper.getGlobalContext());
            errorResult = new SuccessResult(Unit.INSTANCE);
        } catch (Throwable th) {
            if (SensorService$initServiceImpl$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            completeAction.invoke(INSTANCE, Boolean.FALSE);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }
}
