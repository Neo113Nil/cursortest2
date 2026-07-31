package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;

/* loaded from: classes5.dex */
public class BasicMarkerFactory implements IMarkerFactory {
    private final ConcurrentMap markerMap = new ConcurrentHashMap();
}
