package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4655g2 {

    @Nullable
    private List<String> a = new ArrayList();

    @Nullable
    private List<String> b = new ArrayList();

    @Nullable
    private List<String> c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.c;
    }

    @Nullable
    public final List<String> b() {
        return this.b;
    }

    @Nullable
    public final List<String> c() {
        return this.a;
    }

    public final void a(@Nullable List<String> list) {
        this.c = list;
    }

    public final void b(@Nullable List<String> list) {
        this.b = list;
    }

    public final void c(@Nullable List<String> list) {
        this.a = list;
    }
}
