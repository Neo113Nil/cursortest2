package com.composables.core.androidx.compose.foundation.gestures;

import com.composables.core.androidx.collection.ObjectFloatMap;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0010J\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J@\u0010\u001f\u001a\u00020 26\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020 0\"H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/MapUnstyledDraggableAnchors;", "T", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "anchors", "Lcom/composables/core/androidx/collection/ObjectFloatMap;", "<init>", "(Lcom/composables/core/androidx/collection/ObjectFloatMap;)V", "positionOf", "", "value", "(Ljava/lang/Object;)F", "hasAnchorFor", "", "(Ljava/lang/Object;)Z", "closestAnchor", ViewProps.POSITION, "(F)Ljava/lang/Object;", "searchUpwards", "(FZ)Ljava/lang/Object;", "minAnchor", "maxAnchor", "size", "", "getSize", "()I", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "forEach", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "anchor", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MapUnstyledDraggableAnchors<T> implements UnstyledDraggableAnchors<T> {
    private final ObjectFloatMap<T> anchors;

    public MapUnstyledDraggableAnchors(ObjectFloatMap<T> anchors) {
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.anchors = anchors;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public float positionOf(T value) {
        return this.anchors.getOrDefault(value, Float.NaN);
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public boolean hasAnchorFor(T value) {
        return this.anchors.containsKey(value);
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public T closestAnchor(float position) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        T t = null;
        if (length >= 0) {
            float f = Float.POSITIVE_INFINITY;
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            float abs = Math.abs(position - fArr[i4]);
                            if (abs <= f) {
                                f = abs;
                                t = (T) obj;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return t;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public T closestAnchor(float position, boolean searchUpwards) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        T t = null;
        if (length >= 0) {
            float f = Float.POSITIVE_INFINITY;
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            float f2 = fArr[i4];
                            float f3 = searchUpwards ? f2 - position : position - f2;
                            if (f3 < 0.0f) {
                                f3 = Float.POSITIVE_INFINITY;
                            }
                            if (f3 <= f) {
                                f = f3;
                                t = (T) obj;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return t;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public float minAnchor() {
        float minValueOrNaN;
        minValueOrNaN = AnchoredDraggableKt.minValueOrNaN(this.anchors);
        return minValueOrNaN;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public float maxAnchor() {
        float maxValueOrNaN;
        maxValueOrNaN = AnchoredDraggableKt.maxValueOrNaN(this.anchors);
        return maxValueOrNaN;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public int getSize() {
        return this.anchors.get_size();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MapUnstyledDraggableAnchors) {
            return Intrinsics.areEqual(this.anchors, ((MapUnstyledDraggableAnchors) other).anchors);
        }
        return false;
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ")";
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors
    public void forEach(Function2<? super T, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        block.invoke(objArr[i4], Float.valueOf(fArr[i4]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
