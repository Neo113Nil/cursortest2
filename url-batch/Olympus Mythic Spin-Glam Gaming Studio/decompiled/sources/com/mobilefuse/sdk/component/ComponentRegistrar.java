package com.mobilefuse.sdk.component;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class ComponentRegistrar {
    private static Map<ComponentType, AdRendererComponent> registeredComponents = new HashMap();

    public static void registerComponent(ComponentType componentType, AdRendererComponent adRendererComponent) throws Throwable {
        registeredComponents.put(componentType, adRendererComponent);
    }

    public static AdRendererComponent getRegisteredComponent(ComponentType componentType) throws Throwable {
        return registeredComponents.get(componentType);
    }
}
