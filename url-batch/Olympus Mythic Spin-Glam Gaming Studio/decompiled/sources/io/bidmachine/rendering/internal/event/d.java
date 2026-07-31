package io.bidmachine.rendering.internal.event;

import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventType;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
public interface d {
    void a(EventTaskParams eventTaskParams, EventType eventType, String str, List list, Function1 function1);

    void a(EventType eventType, EventTaskParams eventTaskParams, Object... objArr);
}
