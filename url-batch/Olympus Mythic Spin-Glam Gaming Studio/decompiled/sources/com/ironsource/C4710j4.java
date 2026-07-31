package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC4675h4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4710j4 implements InterfaceC4910u7 {

    @NotNull
    private final C4657g4 a;

    @NotNull
    private final Function1 b;

    @NotNull
    private final InterfaceC5004z7 c;

    @NotNull
    private final InterfaceC4818p4 d;
    private final String e;

    @NotNull
    private C5005z8 f;
    private long g;

    @NotNull
    private final C4612dd h;

    @NotNull
    private String i;

    /* renamed from: com.ironsource.j4$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        a(Object obj) {
            super(1, obj, C4710j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((C4710j4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Result) obj).getValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.j4$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        b(Object obj) {
            super(1, obj, C4710j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((C4710j4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Result) obj).getValue());
            return Unit.INSTANCE;
        }
    }

    public C4710j4(@NotNull C4657g4 config, @NotNull Function1 onFinish, @NotNull InterfaceC5004z7 downloadManager, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = C4710j4.class.getSimpleName();
        this.f = new C5005z8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new C4612dd(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC4910u7
    @NotNull
    public C5005z8 c() {
        return this.f;
    }

    @NotNull
    public final Function1 d() {
        return this.b;
    }

    @NotNull
    public final InterfaceC4818p4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4910u7
    public void b() {
        this.g = this.d.a();
        new C4580c(new C4598d(this.h), this.a.d() + "/temp", this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC4910u7
    public boolean a(@NotNull C5005z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        if (Result.m8028isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            C4693i4 a2 = a(string);
            if (a2.j()) {
                C5005z8 k = a2.k();
                this.f = k;
                this.b.invoke(k);
                return;
            }
            a2.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.m8029isSuccessimpl(obj)) {
            C5005z8 c5005z8 = (C5005z8) (Result.m8028isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(c5005z8 != null ? c5005z8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    Intrinsics.checkNotNull(c5005z8);
                    FilesKt.copyTo$default(c5005z8, this.f, true, 0, 4, null);
                } catch (Exception e) {
                    C4782n4.d().a(e);
                    Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(c5005z8);
                this.f = c5005z8;
            }
            new InterfaceC4675h4.b(this.a.b(), this.g, this.d).a();
        } else {
            new InterfaceC4675h4.a(this.a.b()).a();
        }
        Function1 function1 = this.b;
        if (Result.m8028isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke(obj);
    }

    private final C4693i4 a(String str) {
        return new C4693i4(new Dg(this.h, str), this.a.d() + "/mobileController_" + str + ".html", this.c, new a(this));
    }
}
