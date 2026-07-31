package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4693i4 implements InterfaceC4640f5<C5005z8> {

    @NotNull
    private final Y5 a;

    @NotNull
    private final String b;

    @NotNull
    private final InterfaceC5004z7 c;

    @NotNull
    private final Function1 d;

    @NotNull
    private C5005z8 e;

    public C4693i4(@NotNull Y5 fileUrl, @NotNull String destinationPath, @NotNull InterfaceC5004z7 downloadManager, @NotNull Function1 onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C5005z8(c());
    }

    @Override // com.ironsource.Pc
    public void a(@NotNull C5005z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        i().invoke(Result.m8022boximpl(Result.m8023constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC4640f5
    public void b(@NotNull C5005z8 c5005z8) {
        Intrinsics.checkNotNullParameter(c5005z8, "<set-?>");
        this.e = c5005z8;
    }

    @Override // com.ironsource.InterfaceC4640f5
    @NotNull
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4640f5
    @NotNull
    public Y5 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4640f5
    @NotNull
    public Function1 i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4640f5
    @NotNull
    public C5005z8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC4640f5
    @NotNull
    public InterfaceC5004z7 l() {
        return this.c;
    }

    @Override // com.ironsource.Pc
    public void a(@Nullable C5005z8 c5005z8, @NotNull C4840q8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1 i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
