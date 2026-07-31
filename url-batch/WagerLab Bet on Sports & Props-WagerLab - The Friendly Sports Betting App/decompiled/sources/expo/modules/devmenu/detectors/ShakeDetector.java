package expo.modules.devmenu.detectors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShakeDetector.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lexpo/modules/devmenu/detectors/ShakeDetector;", "Landroid/hardware/SensorEventListener;", "shakeListener", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "accelerationX", "", "accelerationY", "accelerationZ", "sensorManager", "Landroid/hardware/SensorManager;", "numShakes", "", "lastDispatchedShakeTimestamp", "", "minRecordedShakes", "getMinRecordedShakes", "()I", "setMinRecordedShakes", "(I)V", "start", "manager", "stop", "onSensorChanged", "sensorEvent", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "i", "reset", "atLeastRequiredForce", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShakeDetector implements SensorEventListener {
    public static final int $stable = 8;
    private float accelerationX;
    private float accelerationY;
    private float accelerationZ;
    private long lastDispatchedShakeTimestamp;
    private int minRecordedShakes;
    private int numShakes;
    private SensorManager sensorManager;
    private final Function0<Unit> shakeListener;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    public ShakeDetector(Function0<Unit> shakeListener) {
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
        this.shakeListener = shakeListener;
        this.minRecordedShakes = 3;
    }

    public final int getMinRecordedShakes() {
        return this.minRecordedShakes;
    }

    public final void setMinRecordedShakes(int i) {
        this.minRecordedShakes = i;
    }

    public final void start(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.sensorManager = manager;
            manager.registerListener(this, defaultSensor, 2);
            this.lastDispatchedShakeTimestamp = 0L;
            reset();
        }
    }

    public final void stop() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.sensorManager = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        Intrinsics.checkNotNullParameter(sensorEvent, "sensorEvent");
        long j2 = sensorEvent.timestamp - this.lastDispatchedShakeTimestamp;
        j = ShakeDetectorKt.MIN_TIME_AFTER_SHAKE_NS;
        if (j2 < j) {
            return;
        }
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2] - 9.80665f;
        if (atLeastRequiredForce(f) && this.accelerationX * f <= 0.0f) {
            this.numShakes++;
            this.accelerationX = f;
        } else if (atLeastRequiredForce(f2) && this.accelerationY * f2 <= 0.0f) {
            this.numShakes++;
            this.accelerationY = f2;
        } else if (atLeastRequiredForce(f3) && this.accelerationZ * f3 <= 0.0f) {
            this.numShakes++;
            this.accelerationZ = f3;
        }
        if (this.numShakes >= this.minRecordedShakes) {
            reset();
            this.shakeListener.invoke();
            this.lastDispatchedShakeTimestamp = sensorEvent.timestamp;
        }
    }

    private final void reset() {
        this.numShakes = 0;
        this.accelerationX = 0.0f;
        this.accelerationY = 0.0f;
        this.accelerationZ = 0.0f;
    }

    private final boolean atLeastRequiredForce(float a2) {
        return Math.abs(a2) > 13.042845f;
    }
}
