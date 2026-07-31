package com.google.gson.internal;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes12.dex */
public final class ConstructorConstructor {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final Map instanceCreators;

    public ConstructorConstructor(Map map) {
        this.instanceCreators = map;
    }

    public ObjectConstructor get(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.instanceCreators.get(type));
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.instanceCreators.get(rawType));
        ObjectConstructor newDefaultConstructor = newDefaultConstructor(rawType);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        ObjectConstructor newDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        return newDefaultImplementationConstructor != null ? newDefaultImplementationConstructor : newUnsafeAllocator(type, rawType);
    }

    private ObjectConstructor newDefaultConstructor(Class cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                this.accessor.makeAccessible(declaredConstructor);
            }
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.3
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private ObjectConstructor newDefaultImplementationConstructor(final Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.4
                    @Override // com.google.gson.internal.ObjectConstructor
                    public Object construct() {
                        return new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.5
                    @Override // com.google.gson.internal.ObjectConstructor
                    public Object construct() {
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.6
                    @Override // com.google.gson.internal.ObjectConstructor
                    public Object construct() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.7
                    @Override // com.google.gson.internal.ObjectConstructor
                    public Object construct() {
                        return new ArrayDeque();
                    }
                };
            }
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.8
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    return new ArrayList();
                }
            };
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.9
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    return new ConcurrentSkipListMap();
                }
            };
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.10
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    return new ConcurrentHashMap();
                }
            };
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.11
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    return new TreeMap();
                }
            };
        }
        if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.12
                @Override // com.google.gson.internal.ObjectConstructor
                public Object construct() {
                    return new LinkedHashMap();
                }
            };
        }
        return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.13
            @Override // com.google.gson.internal.ObjectConstructor
            public Object construct() {
                return new LinkedTreeMap();
            }
        };
    }

    private ObjectConstructor newUnsafeAllocator(final Type type, final Class cls) {
        return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor.14
            private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();

            @Override // com.google.gson.internal.ObjectConstructor
            public Object construct() {
                try {
                    return this.unsafeAllocator.newInstance(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}
