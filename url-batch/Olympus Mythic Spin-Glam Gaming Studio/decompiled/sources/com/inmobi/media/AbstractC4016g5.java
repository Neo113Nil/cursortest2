package com.inmobi.media;

import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4016g5 extends AbstractC3954e0 implements Bj {
    public final C4248p1 h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4016g5(C4248p1 adManagerComponent, Uc publisherCallbacks, Nc stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = adManagerComponent;
        this.i = publisherCallbacks;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
    }

    public final void a(byte[] bArr) {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, Charsets.UTF_8) : null));
        }
        C3903c0 c3903c0 = this.f;
        c3903c0.getClass();
        c3903c0.a = SystemClock.elapsedRealtime();
        C4167m0 c4167m0 = this.g;
        BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C3983f0(c4167m0, null), 3, null);
        if (b()) {
            C4493y9 c4493y92 = this.e;
            if (c4493y92 != null) {
                c4493y92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C4248p1 adManagerComponent = this.h;
        Nc stateMachine = this.j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C4232ob adUnitTimeout = new C4232ob(adManagerComponent, stateMachine);
        C4024gd c4024gd = (C4024gd) this;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        C4493y9 c4493y93 = c4024gd.e;
        if (c4493y93 != null) {
            c4493y93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        c4024gd.m.a(new Ad(bArr, c4024gd.k, adUnitTimeout, c4024gd.l, c4024gd.m), c4024gd);
    }

    public final boolean b() {
        try {
            Reflection.getOrCreateKotlinClass(Picasso.class).getSimpleName();
            try {
                Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.j.a(new C4284qb((short) 2007, inMobiAdRequestStatus, this.h, this.i, this.j), this);
    }
}
