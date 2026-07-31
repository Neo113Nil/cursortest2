package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* loaded from: classes5.dex */
public interface ComponentContainer {
    Provider getProvider(Qualified qualified);

    Provider setOfProvider(Qualified qualified);

    default Object get(Class cls) {
        return get(Qualified.unqualified(cls));
    }

    default Provider getProvider(Class cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    default Set setOf(Class cls) {
        return setOf(Qualified.unqualified(cls));
    }

    default Object get(Qualified qualified) {
        Provider provider = getProvider(qualified);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    default Set setOf(Qualified qualified) {
        return (Set) setOfProvider(qualified).get();
    }
}
