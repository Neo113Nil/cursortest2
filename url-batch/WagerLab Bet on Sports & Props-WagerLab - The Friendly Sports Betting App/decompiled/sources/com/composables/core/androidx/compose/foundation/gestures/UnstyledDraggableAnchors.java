package com.composables.core.androidx.compose.foundation.gestures;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0002\u0010\fJ\u001f\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J@\u0010\u0011\u001a\u00020\u001226\u0010\u0013\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00120\u0014H&R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "T", "", "positionOf", "", "value", "(Ljava/lang/Object;)F", "hasAnchorFor", "", "(Ljava/lang/Object;)Z", "closestAnchor", ViewProps.POSITION, "(F)Ljava/lang/Object;", "searchUpwards", "(FZ)Ljava/lang/Object;", "minAnchor", "maxAnchor", "forEach", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "anchor", "size", "", "getSize", "()I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UnstyledDraggableAnchors<T> {
    T closestAnchor(float position);

    T closestAnchor(float position, boolean searchUpwards);

    void forEach(Function2<? super T, ? super Float, Unit> block);

    int getSize();

    boolean hasAnchorFor(T value);

    float maxAnchor();

    float minAnchor();

    float positionOf(T value);
}
