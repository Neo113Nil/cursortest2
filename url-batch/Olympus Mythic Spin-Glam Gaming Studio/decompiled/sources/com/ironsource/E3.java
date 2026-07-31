package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4818p4;
import com.ironsource.InterfaceC4839q7;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class E3 implements InterfaceC4839q7, InterfaceC4839q7.a {

    @NotNull
    private final Yc a;

    @NotNull
    private final C4976xf b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC4839q7
    @NotNull
    public synchronized G3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        G3 a2 = this.a.a(identifier);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    public synchronized void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.a.b(identifier);
        this.b.b(identifier);
    }

    public E3(@NotNull InterfaceC4818p4 currentTimeProvider, @NotNull J7 pacingDataRepository, @NotNull Q8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.a = new Yc(currentTimeProvider, pacingDataRepository);
        this.b = new C4976xf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    @NotNull
    public synchronized Object a(@NotNull String identifier, @NotNull I3 cappingType, @NotNull InterfaceC4803o7 cappingConfig) {
        Object a2;
        try {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            int i = a.a[cappingType.ordinal()];
            if (i == 1) {
                a2 = this.a.a(identifier, cappingType, cappingConfig);
            } else if (i == 2) {
                a2 = this.b.a(identifier, cappingType, cappingConfig);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion = Result.INSTANCE;
                a2 = Result.m8023constructorimpl(Unit.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ E3(InterfaceC4818p4 interfaceC4818p4, J7 j7, Q8 q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4818p4, j7, q8);
        interfaceC4818p4 = (i & 1) != 0 ? new InterfaceC4818p4.a() : interfaceC4818p4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            j7 = new C4549ad(new C4882sf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            q8 = new C4940vf(new C4882sf(applicationContext2, "capping_service", null, 4, null));
        }
    }
}
