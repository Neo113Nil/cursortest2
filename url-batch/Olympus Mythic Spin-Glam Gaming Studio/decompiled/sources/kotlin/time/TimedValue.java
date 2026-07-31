package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: measureTime.kt */
/* loaded from: classes15.dex */
public final class TimedValue {
    private final long duration;
    private final Object value;

    public /* synthetic */ TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    public final Object component1() {
        return this.value;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m8198component2UwyO8pc() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m8142equalsimpl0(this.duration, timedValue.duration);
    }

    public int hashCode() {
        Object obj = this.value;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + Duration.m8156hashCodeimpl(this.duration);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m8170toStringimpl(this.duration)) + ')';
    }

    private TimedValue(Object obj, long j) {
        this.value = obj;
        this.duration = j;
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m8199getDurationUwyO8pc() {
        return this.duration;
    }

    public final Object getValue() {
        return this.value;
    }
}
