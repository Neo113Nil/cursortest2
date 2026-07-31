package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: MapWithDefault.kt */
/* loaded from: classes11.dex */
interface MapWithDefault extends Map, KMappedMarker {
    Map getMap();

    Object getOrImplicitDefault(Object obj);
}
