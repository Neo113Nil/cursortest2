package com.amazon.a.a.o.c.a;

import java.util.regex.Pattern;

/* compiled from: RegexpClassNameMatcher.java */
/* loaded from: classes3.dex */
final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f604a;

    public e(String str) {
        this(Pattern.compile(str));
    }

    public e(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.f604a = pattern;
    }

    @Override // com.amazon.a.a.o.c.a.a
    public boolean a(String str) {
        return this.f604a.matcher(str).matches();
    }
}
