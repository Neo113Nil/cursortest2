package com.unity3d.coherence;

import android.content.Context;

/* loaded from: classes12.dex */
public final class CoherenceLibrary {
    private static volatile CoherenceLibrary instance;
    private final long apiPtr;
    private final AttributesProvider attributesProvider;
    private final CoherenceProvider coherenceProvider;
    private final IdentityProvider identityProvider;

    private CoherenceLibrary(Context context, int i) {
        long init = CoherenceBridge.init(new Coherence(context, context.getSharedPreferences("com.unity3d.coherence.prefs", 0)), "0.1.0", i);
        if (init == 0) {
            throw new IllegalStateException("unity_coherence_library_init returned null (source=" + i + ")");
        }
        this.apiPtr = init;
        this.identityProvider = new NativeIdentityProvider(this);
        this.attributesProvider = new NativeAttributesProvider(this);
        this.coherenceProvider = new NativeCoherenceProvider(this);
    }

    public static void init(CoherenceInitConfig coherenceInitConfig) {
        if (coherenceInitConfig == null) {
            throw new IllegalArgumentException("config must not be null");
        }
        if (instance == null) {
            synchronized (CoherenceLibrary.class) {
                try {
                    if (instance == null) {
                        instance = new CoherenceLibrary(coherenceInitConfig.getContext(), coherenceInitConfig.getSource());
                    }
                } finally {
                }
            }
        }
    }

    public static CoherenceLibrary getInstance() {
        CoherenceLibrary coherenceLibrary = instance;
        if (coherenceLibrary != null) {
            return coherenceLibrary;
        }
        throw new IllegalStateException("CoherenceLibrary not initialized — call CoherenceLibrary.init(CoherenceInitConfig) first");
    }

    long apiPtr() {
        return this.apiPtr;
    }

    public AttributesProvider getAttributesProvider() {
        return this.attributesProvider;
    }
}
