package com.amazon.a.a.o.c.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: ValidatingObjectInputStream.java */
/* loaded from: classes3.dex */
public class f extends ObjectInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f605a;
    private final List<a> b;

    public f(InputStream inputStream) throws IOException {
        super(inputStream);
        this.f605a = new ArrayList();
        this.b = new ArrayList();
    }

    private void b(String str) throws InvalidClassException {
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(str)) {
                a(str);
            }
        }
        Iterator<a> it2 = this.f605a.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(str)) {
                return;
            }
        }
        a(str);
    }

    protected void a(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public f a(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f605a.add(new c(cls.getName()));
        }
        return this;
    }

    public f b(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.b.add(new c(cls.getName()));
        }
        return this;
    }

    public f a(String... strArr) {
        for (String str : strArr) {
            this.f605a.add(new g(str));
        }
        return this;
    }

    public f b(String... strArr) {
        for (String str : strArr) {
            this.b.add(new g(str));
        }
        return this;
    }

    public f a(Pattern pattern) {
        this.f605a.add(new e(pattern));
        return this;
    }

    public f b(Pattern pattern) {
        this.b.add(new e(pattern));
        return this;
    }

    public f a(a aVar) {
        this.f605a.add(aVar);
        return this;
    }

    public f b(a aVar) {
        this.b.add(aVar);
        return this;
    }
}
