package io.bidmachine.rendering.internal.adform.countdown;

import android.content.Context;
import android.view.View;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.internal.view.b;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.utils.Utils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    private final b s;

    /* renamed from: io.bidmachine.rendering.internal.adform.countdown.a$a, reason: collision with other inner class name */
    private final class C1778a implements b.d {
        public C1778a() {
        }

        @Override // io.bidmachine.rendering.internal.view.b.d
        public void a() {
            a.this.n().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, io.bidmachine.rendering.internal.event.b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        b bVar = new b(context);
        bVar.setListener(new C1778a());
        this.s = bVar;
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.t
    public void a(String str) {
        if (Utils.toIntOrNull(str) == null) {
            k.a("Can't obtain time to start", new Object[0]);
        } else {
            this.s.setDuration(r4.intValue());
            this.s.f();
        }
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        q().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void c() {
        this.s.e();
        super.c();
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void e() {
        super.e();
        this.s.g();
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        return this.s;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    protected void x() {
        this.s.b();
    }
}
