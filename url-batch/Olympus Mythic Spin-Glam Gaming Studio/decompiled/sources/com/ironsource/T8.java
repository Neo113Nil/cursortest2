package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class T8 implements U8 {

    @NotNull
    private final Q3 a;

    /* JADX WARN: Multi-variable type inference failed */
    public T8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("file does not exists")));
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        if (createFromPath != null) {
            return Result.m8023constructorimpl(createFromPath);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
    }

    private final Object c(String str) {
        InputStream a = this.a.a(str);
        try {
            Drawable createFromStream = Drawable.createFromStream(a, new File(str).getName());
            CloseableKt.closeFinally(a, null);
            if (createFromStream != null) {
                return Result.m8023constructorimpl(createFromStream);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(a, th);
                throw th2;
            }
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.U8
    @NotNull
    public Object a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e) {
            C4782n4.d().a(e);
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e));
        }
    }

    public T8(@NotNull Q3 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.a = connectionFactory;
    }

    public /* synthetic */ T8(Q3 q3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? H4.a : q3);
    }
}
