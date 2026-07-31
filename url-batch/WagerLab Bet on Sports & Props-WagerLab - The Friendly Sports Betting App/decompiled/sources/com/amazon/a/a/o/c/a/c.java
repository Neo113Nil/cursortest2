package com.amazon.a.a.o.c.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: FullClassNameMatcher.java */
/* loaded from: classes3.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f602a;

    public c(String... strArr) {
        this.f602a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // com.amazon.a.a.o.c.a.a
    public boolean a(String str) {
        return this.f602a.contains(str);
    }
}
