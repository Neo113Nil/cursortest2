package com.google.gson.internal;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private boolean requireExpose;
    private double version = -1.0d;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List serializationStrategies = Collections.emptyList();
    private List deserializationStrategies = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m3731clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Excluder withVersion(double d) {
        Excluder m3731clone = m3731clone();
        m3731clone.version = d;
        return m3731clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m3731clone = m3731clone();
        m3731clone.modifiers = 0;
        for (int i : iArr) {
            m3731clone.modifiers = i | m3731clone.modifiers;
        }
        return m3731clone;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m3731clone = m3731clone();
        m3731clone.serializeInnerClasses = false;
        return m3731clone;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m3731clone = m3731clone();
        m3731clone.requireExpose = true;
        return m3731clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder m3731clone = m3731clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            m3731clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            m3731clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return m3731clone;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(final Gson gson, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean excludeClassChecks = excludeClassChecks(rawType);
        final boolean z = excludeClassChecks || excludeClassInStrategy(rawType, true);
        final boolean z2 = excludeClassChecks || excludeClassInStrategy(rawType, false);
        if (z || z2) {
            return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1
                private TypeAdapter delegate;

                @Override // com.google.gson.TypeAdapter
                public Object read(JsonReader jsonReader) {
                    if (z2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return delegate().read(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Object obj) {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, obj);
                    }
                }

                private TypeAdapter delegate() {
                    TypeAdapter typeAdapter = this.delegate;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
            };
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != -1.0d && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrLocal(field.getType())) {
            return true;
        }
        List list = z ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        new FieldAttributes(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        throw null;
    }

    private boolean excludeClassChecks(Class cls) {
        if (this.version == -1.0d || isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrLocal(cls);
        }
        return true;
    }

    public boolean excludeClass(Class cls, boolean z) {
        return excludeClassChecks(cls) || excludeClassInStrategy(cls, z);
    }

    private boolean excludeClassInStrategy(Class cls, boolean z) {
        Iterator it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
        if (!it.hasNext()) {
            return false;
        }
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        throw null;
    }

    private boolean isAnonymousOrLocal(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean isInnerClass(Class cls) {
        return cls.isMemberClass() && !isStatic(cls);
    }

    private boolean isStatic(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    private boolean isValidSince(Since since) {
        return since == null || since.value() <= this.version;
    }

    private boolean isValidUntil(Until until) {
        return until == null || until.value() > this.version;
    }
}
