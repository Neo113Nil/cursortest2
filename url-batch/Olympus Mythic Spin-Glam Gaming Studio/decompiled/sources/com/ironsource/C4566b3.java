package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4566b3 implements Ag {

    @Nullable
    private final Cb a;

    @Nullable
    private final AdSize b;

    /* renamed from: com.ironsource.b3$a */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.a("Load task config is null");
        }
    }

    /* renamed from: com.ironsource.b3$b */
    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.l();
        }
    }

    public C4566b3(@Nullable Cb cb, @Nullable AdSize adSize) {
        this.a = cb;
        this.b = adSize;
    }

    @Override // com.ironsource.Ag
    public void a() {
        a(this.a != null, a.a);
        a(this.b != null, b.a);
    }
}
