package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4832q0;
import com.ironsource.F0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public class L2 extends AbstractC4832q0 {

    @NotNull
    private final WeakReference<O2> i;

    @NotNull
    private final a j;

    @NotNull
    private final M2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(@NotNull C4814p0 tools, @NotNull M2 adUnitData, @NotNull O2 listener) {
        super(tools, adUnitData, listener);
        String format;
        int b;
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.i = new WeakReference<>(listener);
        this.j = new a();
        this.k = adUnitData;
        C4684hd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    private final ISBannerSize l() {
        return f().a(this.k.b().i());
    }

    @Override // com.ironsource.AbstractC4832q0
    @NotNull
    public C4867s0 b() {
        return new S2(this.k.b(), a(l()));
    }

    private final class a extends AbstractC4832q0.a implements D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.D2
        public void a(@NotNull B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.g();
            }
        }

        @Override // com.ironsource.AbstractC4832q0.a, com.ironsource.F
        public void b(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC4997z0 i = L2.this.i();
            if (i != null) {
                i.a(instance.e());
            }
        }

        @Override // com.ironsource.D2
        public void c(@NotNull B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.h();
            }
        }

        @Override // com.ironsource.D2
        public void b(@NotNull B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.j();
            }
        }
    }

    public final void a(@Nullable Fg fg, @NotNull InterfaceC4997z0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (fg != null) {
            a(new F2(fg), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC4832q0
    @NotNull
    protected E a() {
        return new E() { // from class: com.ironsource.L2$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c, I i) {
                B a2;
                a2 = L2.a(L2.this, c, i);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(L2 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new B2(new V0(this$0.f(), F0.b.PROVIDER), instanceData, adInstancePayload, this$0.j);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return ISBannerSize.BANNER;
    }
}
