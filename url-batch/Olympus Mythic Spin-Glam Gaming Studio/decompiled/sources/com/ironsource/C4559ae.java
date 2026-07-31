package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4559ae implements Ag {

    @Nullable
    private final Cb a;

    /* renamed from: com.ironsource.ae$a */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.d("Load task config is null");
        }
    }

    public C4559ae(@Nullable Cb cb) {
        this.a = cb;
    }

    @Override // com.ironsource.Ag
    public void a() {
        a(this.a != null, a.a);
    }
}
