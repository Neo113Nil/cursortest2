package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class Serialization {
    static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void writeMultiset(Multiset multiset, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }

    static void populateMultiset(Multiset multiset, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static void writeMultimap(Multimap multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static void populateMultimap(Multimap multimap, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    static FieldSetter getFieldSetter(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    static final class FieldSetter {
        private final Field field;

        private FieldSetter(Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        void set(Object obj, Object obj2) {
            try {
                this.field.set(obj, obj2);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        void set(Object obj, int i) {
            try {
                this.field.set(obj, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
