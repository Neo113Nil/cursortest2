package com.moloco.sdk.internal.services.events;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.UserIntent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.A;
import com.moloco.sdk.internal.services.AbstractC5040c;
import com.moloco.sdk.internal.services.B;
import com.moloco.sdk.internal.services.C5047j;
import com.moloco.sdk.internal.services.E;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.InterfaceC5041d;
import com.moloco.sdk.internal.services.InterfaceC5048k;
import com.moloco.sdk.internal.services.proto.a;
import com.moloco.sdk.internal.services.usertracker.f;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a {
    public static final int j = 0;

    @NotNull
    public final InterfaceC5048k a;

    @NotNull
    public final B b;

    @NotNull
    public final y c;

    @NotNull
    public final F d;

    @NotNull
    public final f e;

    @NotNull
    public final InterfaceC5041d f;

    @NotNull
    public final com.moloco.sdk.internal.services.proto.a g;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h;

    @NotNull
    public final String i;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", l = {67}, m = "userAdInteractionExt")
    /* renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    public static final class C1557a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public C1557a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return a.this.a(0L, (a.AbstractC1677a) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", l = {52}, m = "userAdInteractionExtAsQueryParameter")
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.a(0L, (a.AbstractC1677a) null, (String) null, this);
        }
    }

    public a(@NotNull InterfaceC5048k appInfoService, @NotNull B networkInfoService, @NotNull y deviceInfoService, @NotNull F screenInfoService, @NotNull f userIdentifierService, @NotNull InterfaceC5041d adDataService, @NotNull com.moloco.sdk.internal.services.proto.a encoderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c userEventConfigService, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        Intrinsics.checkNotNullParameter(userIdentifierService, "userIdentifierService");
        Intrinsics.checkNotNullParameter(adDataService, "adDataService");
        Intrinsics.checkNotNullParameter(encoderService, "encoderService");
        Intrinsics.checkNotNullParameter(userEventConfigService, "userEventConfigService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.a = appInfoService;
        this.b = networkInfoService;
        this.c = deviceInfoService;
        this.d = screenInfoService;
        this.e = userIdentifierService;
        this.f = adDataService;
        this.g = encoderService;
        this.h = userEventConfigService;
        this.i = sdkVersion;
    }

    @NotNull
    public final InterfaceC5048k b() {
        return this.a;
    }

    @NotNull
    public final y c() {
        return this.c;
    }

    @NotNull
    public final com.moloco.sdk.internal.services.proto.a d() {
        return this.g;
    }

    @NotNull
    public final B e() {
        return this.b;
    }

    @NotNull
    public final F f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        return this.i;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h() {
        return this.h;
    }

    @NotNull
    public final f i() {
        return this.e;
    }

    @NotNull
    public final InterfaceC5041d a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j2, @NotNull a.AbstractC1677a abstractC1677a, @NotNull String str, @NotNull Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.h.c()) {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.events.b.a, "Event reporting config disabled, UserAdInteractionExt not reporting", false, 4, null);
                        return str;
                    }
                    bVar.a = str;
                    bVar.d = 1;
                    obj = a(j2, abstractC1677a, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                String uri = Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (String) obj).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return uri;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        String uri2 = Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (String) obj2).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j2, a.AbstractC1677a abstractC1677a, Continuation continuation) {
        C1557a c1557a;
        int i;
        UserIntent.UserAdInteractionExt.Builder newBuilder;
        a aVar;
        UserIntent.UserAdInteractionExt.Builder builder;
        a.AbstractC1677a abstractC1677a2;
        UserIntent.UserAdInteractionExt.Builder builder2;
        UserIntent.UserAdInteractionExt.Builder builder3;
        AbstractC5040c a;
        if (continuation instanceof C1557a) {
            c1557a = (C1557a) continuation;
            int i2 = c1557a.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1557a.i = i2 - Integer.MIN_VALUE;
                Object obj = c1557a.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1557a.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    newBuilder = UserIntent.UserAdInteractionExt.newBuilder();
                    if (this.h.b()) {
                        f fVar = this.e;
                        c1557a.a = this;
                        c1557a.b = abstractC1677a;
                        c1557a.c = newBuilder;
                        c1557a.d = newBuilder;
                        c1557a.e = newBuilder;
                        c1557a.f = j2;
                        c1557a.i = 1;
                        Object b2 = fVar.b(c1557a);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        abstractC1677a2 = abstractC1677a;
                        builder2 = newBuilder;
                        builder3 = builder2;
                        builder = builder3;
                        obj = b2;
                        aVar = this;
                    } else {
                        aVar = this;
                        builder = newBuilder;
                        a = aVar.f.a();
                        if (a instanceof AbstractC5040c.a) {
                            newBuilder.setAdvertisingId(((AbstractC5040c.a) a).b());
                        } else if (!(a instanceof AbstractC5040c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        newBuilder.setClientTimestamp(j2);
                        Intrinsics.checkNotNull(newBuilder);
                        aVar.a(newBuilder);
                        aVar.a(newBuilder, abstractC1677a, aVar.d.invoke());
                        aVar.a(newBuilder, aVar.a.invoke());
                        aVar.a(newBuilder, aVar.c.invoke());
                        aVar.a(newBuilder, aVar.b.invoke());
                        UserIntent.UserAdInteractionExt build = builder.build();
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.a, "Encoding protobuf UserAdInteractionExt: " + build, false, 4, null);
                        com.moloco.sdk.internal.services.proto.a aVar2 = aVar.g;
                        Intrinsics.checkNotNull(build);
                        String a2 = a.C1558a.a(aVar2, build, 0, 2, null);
                        MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.a, "Successfully built userAdInteractionExt as base64 string: " + a2, false, 4, null);
                        return a2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = c1557a.f;
                    builder2 = (UserIntent.UserAdInteractionExt.Builder) c1557a.e;
                    builder3 = (UserIntent.UserAdInteractionExt.Builder) c1557a.d;
                    builder = (UserIntent.UserAdInteractionExt.Builder) c1557a.c;
                    abstractC1677a2 = (a.AbstractC1677a) c1557a.b;
                    aVar = (a) c1557a.a;
                    ResultKt.throwOnFailure(obj);
                }
                builder2.setMref((String) obj);
                newBuilder = builder3;
                abstractC1677a = abstractC1677a2;
                a = aVar.f.a();
                if (a instanceof AbstractC5040c.a) {
                }
                newBuilder.setClientTimestamp(j2);
                Intrinsics.checkNotNull(newBuilder);
                aVar.a(newBuilder);
                aVar.a(newBuilder, abstractC1677a, aVar.d.invoke());
                aVar.a(newBuilder, aVar.a.invoke());
                aVar.a(newBuilder, aVar.c.invoke());
                aVar.a(newBuilder, aVar.b.invoke());
                UserIntent.UserAdInteractionExt build2 = builder.build();
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.a, "Encoding protobuf UserAdInteractionExt: " + build2, false, 4, null);
                com.moloco.sdk.internal.services.proto.a aVar22 = aVar.g;
                Intrinsics.checkNotNull(build2);
                String a22 = a.C1558a.a(aVar22, build2, 0, 2, null);
                MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.a, "Successfully built userAdInteractionExt as base64 string: " + a22, false, 4, null);
                return a22;
            }
        }
        c1557a = new C1557a(continuation);
        Object obj2 = c1557a.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1557a.i;
        if (i != 0) {
        }
        builder2.setMref((String) obj2);
        newBuilder = builder3;
        abstractC1677a = abstractC1677a2;
        a = aVar.f.a();
        if (a instanceof AbstractC5040c.a) {
        }
        newBuilder.setClientTimestamp(j2);
        Intrinsics.checkNotNull(newBuilder);
        aVar.a(newBuilder);
        aVar.a(newBuilder, abstractC1677a, aVar.d.invoke());
        aVar.a(newBuilder, aVar.a.invoke());
        aVar.a(newBuilder, aVar.c.invoke());
        aVar.a(newBuilder, aVar.b.invoke());
        UserIntent.UserAdInteractionExt build22 = builder.build();
        MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.a, "Encoding protobuf UserAdInteractionExt: " + build22, false, 4, null);
        com.moloco.sdk.internal.services.proto.a aVar222 = aVar.g;
        Intrinsics.checkNotNull(build22);
        String a222 = a.C1558a.a(aVar222, build22, 0, 2, null);
        MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.a, "Successfully built userAdInteractionExt as base64 string: " + a222, false, 4, null);
        return a222;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder) {
        UserIntent.UserAdInteractionExt.MolocoSDK.Builder newBuilder = UserIntent.UserAdInteractionExt.MolocoSDK.newBuilder();
        newBuilder.setCoreVer(this.i);
        builder.setSdk(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, x xVar) {
        UserIntent.UserAdInteractionExt.Device.Builder newBuilder = UserIntent.UserAdInteractionExt.Device.newBuilder();
        newBuilder.setOsVer(xVar.x());
        newBuilder.setModel(xVar.v());
        newBuilder.setOs(UserIntent.UserAdInteractionExt.Device.OsType.ANDROID);
        newBuilder.setScreenScale(xVar.y());
        builder.setDevice(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, A a) {
        UserIntent.UserAdInteractionExt.Network.Builder newBuilder = UserIntent.UserAdInteractionExt.Network.newBuilder();
        if (a instanceof A.a) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.CELLULAR);
            newBuilder.setCarrier(((A.a) a).a());
        } else if (Intrinsics.areEqual(a, A.b.b)) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.UNKNOWN);
        } else if (Intrinsics.areEqual(a, A.c.b)) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.WIFI);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        builder.setNetwork(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, C5047j c5047j) {
        UserIntent.UserAdInteractionExt.App.Builder newBuilder = UserIntent.UserAdInteractionExt.App.newBuilder();
        newBuilder.setId(c5047j.b());
        newBuilder.setVer(c5047j.c());
        builder.setApp(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, a.AbstractC1677a abstractC1677a, E e) {
        if (abstractC1677a instanceof a.AbstractC1677a.e) {
            builder.setImpInteraction(UserIntent.UserAdInteractionExt.ImpressionInteraction.newBuilder().build());
        } else if (abstractC1677a instanceof a.AbstractC1677a.d) {
            UserIntent.UserAdInteractionExt.ClickInteraction.Builder newBuilder = UserIntent.UserAdInteractionExt.ClickInteraction.newBuilder();
            a.AbstractC1677a.d dVar = (a.AbstractC1677a.d) abstractC1677a;
            newBuilder.setClickPos(com.moloco.sdk.internal.services.events.b.a(dVar.b()));
            newBuilder.setScreenSize(com.moloco.sdk.internal.services.events.b.a(e));
            a.AbstractC1677a.g d = dVar.d();
            if (d != null) {
                newBuilder.setViewSize(com.moloco.sdk.internal.services.events.b.a(d));
            }
            a.AbstractC1677a.f c = dVar.c();
            if (c != null) {
                newBuilder.setViewPos(com.moloco.sdk.internal.services.events.b.a(c));
            }
            List<a.AbstractC1677a.c> a = dVar.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
            for (a.AbstractC1677a.c cVar : a) {
                UserIntent.UserAdInteractionExt.Button.Builder newBuilder2 = UserIntent.UserAdInteractionExt.Button.newBuilder();
                newBuilder2.setType(com.moloco.sdk.internal.services.events.b.a(cVar.d()));
                newBuilder2.setPos(com.moloco.sdk.internal.services.events.b.a(cVar.e()));
                newBuilder2.setSize(com.moloco.sdk.internal.services.events.b.a(cVar.f()));
                arrayList.add(newBuilder2.build());
            }
            newBuilder.addAllButtons(arrayList);
            builder.setClickInteraction((UserIntent.UserAdInteractionExt.ClickInteraction) newBuilder.build());
        } else if (abstractC1677a instanceof a.AbstractC1677a.b) {
            UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder newBuilder3 = UserIntent.UserAdInteractionExt.AppForegroundingInteraction.newBuilder();
            newBuilder3.setBgTsMs(((a.AbstractC1677a.b) abstractC1677a).b());
            builder.setAppForegroundingInteraction(newBuilder3.build());
        } else if (abstractC1677a instanceof a.AbstractC1677a.C1678a) {
            builder.setAppBackgroundingInteraction(UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.newBuilder().build());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return builder;
    }
}
