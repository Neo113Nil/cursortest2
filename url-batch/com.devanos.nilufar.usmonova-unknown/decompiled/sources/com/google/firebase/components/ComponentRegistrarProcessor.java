package com.google.firebase.components;

import java.util.List;
import o.C1574nc;

/* loaded from: classes.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new C1574nc(2);

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
