package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC5102b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C5101a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.protobuf.EventTypeExtended;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final String A = "CustomClick";

    @NotNull
    public static final String B = "Icons";

    @NotNull
    public static final String C = "Icon";

    @NotNull
    public static final String D = "StaticResource";

    @NotNull
    public static final String E = "IFrameResource";

    @NotNull
    public static final String F = "HTMLResource";

    @NotNull
    public static final String G = "IconClicks";

    @NotNull
    public static final String H = "IconClickThrough";

    @NotNull
    public static final String I = "IconClickTracking";

    @NotNull
    public static final String J = "IconViewTracking";

    @NotNull
    public static final String K = "AltText";

    @NotNull
    public static final String L = "CompanionAds";

    @NotNull
    public static final String M = "Companion";

    @NotNull
    public static final String N = "CompanionClickThrough";

    @NotNull
    public static final String O = "CompanionClickTracking";

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return k.a();
        }
    });
    public static final NumberFormat b = NumberFormat.getPercentInstance();

    @NotNull
    public static final String c = "Error";

    @NotNull
    public static final String d = "Ad";

    @NotNull
    public static final String e = "InLine";

    @NotNull
    public static final String f = "Wrapper";

    @NotNull
    public static final String g = "VASTAdTagURI";

    @NotNull
    public static final String h = "AdSystem";

    @NotNull
    public static final String i = "AdTitle";

    @NotNull
    public static final String j = "Description";

    @NotNull
    public static final String k = "Advertiser";

    @NotNull
    public static final String l = "Pricing";

    @NotNull
    public static final String m = "Survey";

    @NotNull
    public static final String n = "Impression";

    @NotNull
    public static final String o = "Creatives";

    @NotNull
    public static final String p = "Creative";

    @NotNull
    public static final String q = "Linear";

    @NotNull
    public static final String r = "AdParameters";

    @NotNull
    public static final String s = "Duration";

    @NotNull
    public static final String t = "MediaFiles";

    @NotNull
    public static final String u = "MediaFile";

    @NotNull
    public static final String v = "TrackingEvents";

    @NotNull
    public static final String w = "Tracking";

    @NotNull
    public static final String x = "VideoClicks";

    @NotNull
    public static final String y = "ClickThrough";

    @NotNull
    public static final String z = "ClickTracking";

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseInLineTag")
    public static final class A extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int j;

        public A(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return k.K(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseLinearTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {124, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, 127, 128, 129}, m = "invokeSuspend")
    public static final class B extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ List h;
        public final /* synthetic */ List i;
        public final /* synthetic */ Ref$ObjectRef j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, Ref$ObjectRef ref$ObjectRef4, boolean z, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = list;
            this.i = list2;
            this.j = ref$ObjectRef4;
            this.k = z;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((B) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            B b = new B(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            b.c = obj;
            return b;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
        /* JADX WARN: Type inference failed for: r6v19, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r6v40, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r] */
        /* JADX WARN: Type inference failed for: r6v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0096 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a0 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a8 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b9 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:7:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fb -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x011c -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x013a -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0161 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0181 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01a3 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01bc -> B:8:0x01c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Ref$ObjectRef ref$ObjectRef;
            Object obj2;
            String str;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            List list;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -2049897434:
                                    if (name.equals("VideoClicks")) {
                                        Ref$ObjectRef ref$ObjectRef2 = this.j;
                                        boolean z = this.k;
                                        this.c = ref$ObjectRef2;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? h = k.h(xmlPullParser, z, this);
                                        if (h != coroutine_suspended) {
                                            ref$ObjectRef2.element = h;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -1927368268:
                                    if (name.equals("Duration")) {
                                        ref$ObjectRef = this.g;
                                        this.c = ref$ObjectRef;
                                        this.a = depth;
                                        this.b = 2;
                                        Object P = k.P(xmlPullParser, this);
                                        obj2 = P;
                                        if (P == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (String) obj2;
                                        if (str != null) {
                                            ref$ObjectRef.element = null;
                                            break;
                                        } else {
                                            ref$ObjectRef.element = k.f(str);
                                            break;
                                        }
                                    }
                                    break;
                                case -1348833651:
                                    if (name.equals("AdParameters")) {
                                        Ref$ObjectRef ref$ObjectRef3 = this.f;
                                        this.c = ref$ObjectRef3;
                                        this.a = depth;
                                        this.b = 1;
                                        ?? y = k.y(xmlPullParser, this);
                                        if (y != coroutine_suspended) {
                                            ref$ObjectRef3.element = y;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -385055469:
                                    if (name.equals("MediaFiles")) {
                                        List list2 = this.h;
                                        this.c = list2;
                                        this.a = depth;
                                        this.b = 3;
                                        Object M = k.M(xmlPullParser, this);
                                        if (M != coroutine_suspended) {
                                            list2.addAll((Collection) M);
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 70476538:
                                    if (name.equals(k.B)) {
                                        list = this.l;
                                        this.c = list;
                                        this.a = depth;
                                        this.b = 6;
                                        Object I = k.I(xmlPullParser, this);
                                        obj3 = I;
                                        if (I == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        list.addAll((Collection) obj3);
                                        break;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals("TrackingEvents")) {
                                        List list3 = this.i;
                                        this.c = list3;
                                        this.a = depth;
                                        this.b = 4;
                                        Object Q = k.Q(xmlPullParser, this);
                                        if (Q != coroutine_suspended) {
                                            list3.addAll((Collection) Q);
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (k.k(this.d)) {
                        this.e.element = k.n(this.d);
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim(text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef4.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    ref$ObjectRef = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (String) obj2;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    List list4 = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    list4.addAll((Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    List list5 = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    list5.addAll((Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef5.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    list = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    list.addAll((Collection) obj3);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseLinearTag")
    public static final class C extends ContinuationImpl {
        public boolean a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int j;

        public C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return k.g(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFileTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class D extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ Ref$ObjectRef h;
        public final /* synthetic */ Ref$ObjectRef i;
        public final /* synthetic */ Ref$ObjectRef j;
        public final /* synthetic */ Ref$ObjectRef k;
        public final /* synthetic */ Ref$ObjectRef l;
        public final /* synthetic */ Ref$ObjectRef m;
        public final /* synthetic */ Ref$ObjectRef n;
        public final /* synthetic */ Ref$ObjectRef o;
        public final /* synthetic */ Ref$ObjectRef p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9, Ref$ObjectRef ref$ObjectRef10, Ref$ObjectRef ref$ObjectRef11, Ref$ObjectRef ref$ObjectRef12) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = ref$ObjectRef4;
            this.i = ref$ObjectRef5;
            this.j = ref$ObjectRef6;
            this.k = ref$ObjectRef7;
            this.l = ref$ObjectRef8;
            this.m = ref$ObjectRef9;
            this.n = ref$ObjectRef10;
            this.o = ref$ObjectRef11;
            this.p = ref$ObjectRef12;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((D) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            D d = new D(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
            d.c = obj;
            return d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    this.e.element = k.b(xmlPullParser, "id");
                    this.f.element = Boxing.boxBoolean(Intrinsics.areEqual(k.b(xmlPullParser, "delivery"), "progressive"));
                    this.g.element = k.b(xmlPullParser, "type");
                    Ref$ObjectRef ref$ObjectRef = this.h;
                    String b = k.b(xmlPullParser, "width");
                    ref$ObjectRef.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                    Ref$ObjectRef ref$ObjectRef2 = this.i;
                    String b2 = k.b(xmlPullParser, "height");
                    ref$ObjectRef2.element = b2 != null ? StringsKt.toIntOrNull(b2) : 0;
                    this.j.element = k.b(xmlPullParser, VastAttributes.CODEC);
                    Ref$ObjectRef ref$ObjectRef3 = this.k;
                    String b3 = k.b(xmlPullParser, VastAttributes.BITRATE);
                    ref$ObjectRef3.element = b3 != null ? StringsKt.toIntOrNull(b3) : 0;
                    Ref$ObjectRef ref$ObjectRef4 = this.l;
                    String b4 = k.b(xmlPullParser, VastAttributes.MIN_BITRATE);
                    ref$ObjectRef4.element = b4 != null ? StringsKt.toIntOrNull(b4) : 0;
                    Ref$ObjectRef ref$ObjectRef5 = this.m;
                    String b5 = k.b(xmlPullParser, VastAttributes.MAX_BITRATE);
                    ref$ObjectRef5.element = b5 != null ? StringsKt.toIntOrNull(b5) : 0;
                    Ref$ObjectRef ref$ObjectRef6 = this.n;
                    String b6 = k.b(xmlPullParser, VastAttributes.SCALABLE);
                    ref$ObjectRef6.element = b6 != null ? Boxing.boxBoolean(Boolean.parseBoolean(b6)) : 0;
                    this.o.element = k.b(xmlPullParser, VastAttributes.API_FRAMEWORK);
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.p.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseMediaFileTag")
    public static final class E extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public /* synthetic */ Object m;
        public int n;

        public E(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.m = obj;
            this.n |= Integer.MIN_VALUE;
            return k.L(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFilesTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class F extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((F) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            F f = new F(this.d, continuation, this.e);
            f.c = obj;
            return f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                q qVar = (q) obj;
                if (qVar != null) {
                    this.e.add(qVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), "MediaFile")) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.L(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        q qVar2 = (q) obj;
                        if (qVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseMediaFilesTag")
    public static final class G extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public G(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.M(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parsePricingTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class H extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((H) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            H h = new H(this.d, continuation, this.e, this.f);
            h.c = obj;
            return h;
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    this.e.element = k.b(xmlPullParser, "model");
                    this.f.element = k.b(xmlPullParser, "currency");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parsePricingTag")
    public static final class I extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public I(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.N(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseStaticResourceTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class J extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((J) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            J j = new J(this.d, continuation, this.e, this.f);
            j.c = obj;
            return j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref$ObjectRef ref$ObjectRef = this.e;
                    String b = k.b(xmlPullParser, "creativeType");
                    ref$ObjectRef.element = b != null ? k.e(b) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseStaticResourceTag")
    public static final class K extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public K(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.O(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTagsTextOnly$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class L extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((L) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            L l = new L(this.d, continuation, this.e);
            l.c = obj;
            return l;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    continue;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.e.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTagsTextOnly")
    public static final class M extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public M(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.P(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingEventsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class N extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((N) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            N n = new N(this.d, continuation, this.e);
            n.c = obj;
            return n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                u uVar = (u) obj;
                if (uVar != null) {
                    this.e.add(uVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), "Tracking")) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.R(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        u uVar2 = (u) obj;
                        if (uVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTrackingEventsTag")
    public static final class O extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public O(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.Q(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class P extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((P) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            P p = new P(this.d, continuation, this.e, this.f, this.g);
            p.c = obj;
            return p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref$ObjectRef ref$ObjectRef = this.e;
                    String b = k.b(xmlPullParser, "event");
                    ref$ObjectRef.element = b != null ? k.i(b) : 0;
                    Ref$ObjectRef ref$ObjectRef2 = this.f;
                    String b2 = k.b(xmlPullParser, "offset");
                    ref$ObjectRef2.element = b2 != null ? k.g(b2) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.g.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTrackingTag")
    public static final class Q extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public Q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.R(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVast$2", f = "VastParser.kt", l = {130}, m = "invokeSuspend")
    public static final class R extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ XmlPullParser b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(XmlPullParser xmlPullParser, Continuation continuation) {
            super(2, continuation);
            this.b = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((R) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new R(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                XmlPullParser xmlPullParser = this.b;
                this.a = 1;
                obj = k.T(xmlPullParser, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVastTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {124, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class S extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((S) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            S s = new S(this.d, continuation, this.e, this.f, this.g);
            s.c = obj;
            return s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
        /* JADX WARN: Type inference failed for: r7v34, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v39, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e1 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:9:0x00ff). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj2 = obj;
                C5101a c5101a = (C5101a) obj2;
                if (c5101a != null) {
                    this.g.add(c5101a);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (k.k(this.d)) {
                        this.e.element = k.b(this.d, "version");
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim(text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    String name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, "Error")) {
                        Ref$ObjectRef ref$ObjectRef2 = this.f;
                        this.c = ref$ObjectRef2;
                        this.a = depth;
                        this.b = 1;
                        ?? D = k.D(xmlPullParser, this);
                        if (D == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef2.element = D;
                    } else if (Intrinsics.areEqual(name, "Ad")) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object A = k.A(xmlPullParser, this);
                        obj2 = A;
                        if (A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        C5101a c5101a2 = (C5101a) obj2;
                        if (c5101a2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVastTag")
    public static final class T extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public T(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.T(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClickTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class U extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((U) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            U u = new U(this.d, continuation, this.e, this.f);
            u.c = obj;
            return u;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "id");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVideoClickTag")
    public static final class V extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public V(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.U(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124, 126}, m = "invokeSuspend")
    public static final class W extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, List list, List list2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = list;
            this.g = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((W) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            W w = new W(this.d, continuation, this.e, this.f, this.g);
            w.c = obj;
            return w;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00db  */
        /* JADX WARN: Type inference failed for: r10v38, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009a -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b9 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d4 -> B:7:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0102 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011c -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0135 -> B:10:0x013a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            z zVar;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                zVar = (z) obj2;
                if (zVar != null) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj3 = obj;
                z zVar2 = (z) obj3;
                if (zVar2 != null) {
                    this.g.add(zVar2);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                    int hashCode = name.hashCode();
                    if (hashCode == -617879491) {
                        if (name.equals("ClickThrough")) {
                            Ref$ObjectRef ref$ObjectRef2 = this.e;
                            this.c = ref$ObjectRef2;
                            this.a = depth;
                            this.b = 1;
                            ?? U = k.U(xmlPullParser, this);
                            if (U == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ref$ObjectRef2.element = U;
                        }
                    } else if (hashCode == -135761801) {
                        if (name.equals("CustomClick")) {
                            this.c = null;
                            this.a = depth;
                            this.b = 3;
                            Object U2 = k.U(xmlPullParser, this);
                            obj3 = U2;
                            if (U2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z zVar22 = (z) obj3;
                            if (zVar22 != null) {
                            }
                        }
                    } else if (hashCode == 2107600959 && name.equals("ClickTracking")) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object U3 = k.U(xmlPullParser, this);
                        obj2 = U3;
                        if (U3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zVar = (z) obj2;
                        if (zVar != null) {
                            this.f.add(zVar);
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVideoClicksTag")
    public static final class X extends ContinuationImpl {
        public boolean a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int f;

        public X(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return k.h(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseWrapperTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {126, 127, 128, 129, 130}, m = "invokeSuspend")
    public static final class Y extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ List h;
        public final /* synthetic */ List i;
        public final /* synthetic */ List j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Y(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = list;
            this.i = list2;
            this.j = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((Y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Y y = new Y(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            y.c = obj;
            return y;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
        
            r8.element = null;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
        /* JADX WARN: Type inference failed for: r11v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Boolean] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008d -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b0 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0111 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x012e -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013c -> B:9:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x017d -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0196 -> B:10:0x019b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            String str;
            Object obj3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef.element = obj;
                } else if (i == 2) {
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef2.element = obj;
                } else if (i == 3) {
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                        this.h.add(nVar);
                    }
                } else if (i == 4) {
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (String) obj2;
                    if (str != null) {
                        this.i.add(str);
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.j.addAll((List) obj4);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                        switch (name.hashCode()) {
                            case -1692490108:
                                if (name.equals("Creatives")) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 5;
                                    Object f = k.f(xmlPullParser, false, this);
                                    obj4 = f;
                                    if (f == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.j.addAll((List) obj4);
                                    break;
                                }
                                break;
                            case -1633884078:
                                if (name.equals("AdSystem")) {
                                    Ref$ObjectRef ref$ObjectRef3 = this.g;
                                    this.c = ref$ObjectRef3;
                                    this.a = depth;
                                    this.b = 2;
                                    ?? z = k.z(xmlPullParser, this);
                                    if (z != coroutine_suspended) {
                                        ref$ObjectRef3.element = z;
                                        break;
                                    } else {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            case -587420703:
                                if (name.equals("VASTAdTagURI")) {
                                    Ref$ObjectRef ref$ObjectRef4 = this.f;
                                    this.c = ref$ObjectRef4;
                                    this.a = depth;
                                    this.b = 1;
                                    ?? P = k.P(xmlPullParser, this);
                                    if (P != coroutine_suspended) {
                                        ref$ObjectRef4.element = P;
                                        break;
                                    } else {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            case 67232232:
                                if (name.equals("Error")) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 4;
                                    Object D = k.D(xmlPullParser, this);
                                    obj2 = D;
                                    if (D == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str = (String) obj2;
                                    if (str != null) {
                                    }
                                }
                                break;
                            case 2114088489:
                                if (name.equals("Impression")) {
                                    this.c = null;
                                    this.a = depth;
                                    this.b = 3;
                                    Object J = k.J(xmlPullParser, this);
                                    obj3 = J;
                                    if (J == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                                    if (nVar != null) {
                                    }
                                }
                                break;
                        }
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser2 = this.d;
                    Ref$ObjectRef ref$ObjectRef5 = this.e;
                    String b = k.b(xmlPullParser2, VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS);
                    if (b != null) {
                    }
                    ref$ObjectRef5.element = Boxing.boxBoolean(Boolean.parseBoolean(b));
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseWrapperTag")
    public static final class Z extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int h;

        public Z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            return k.V(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$iterateTag$2", f = "VastParser.kt", l = {102, 103, 111}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a, reason: case insensitive filesystem */
    public static final class C5076a extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Function2 e;
        public final /* synthetic */ Function3 f;
        public final /* synthetic */ Function2 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5076a(XmlPullParser xmlPullParser, Function2 function2, Function3 function3, Function2 function22, Continuation continuation) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = function2;
            this.f = function3;
            this.g = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5076a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5076a c5076a = new C5076a(this.d, this.e, this.f, this.g, continuation);
            c5076a.c = obj;
            return c5076a;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c8 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d1 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (k.k(this.d)) {
                        Function2 function2 = this.e;
                        XmlPullParser xmlPullParser = this.d;
                        this.a = depth;
                        this.b = 1;
                        if (function2.invoke(xmlPullParser, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        Function3 function3 = this.f;
                        XmlPullParser xmlPullParser2 = this.d;
                        String text2 = xmlPullParser2.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        String obj2 = StringsKt.trim(text2).toString();
                        this.a = depth;
                        this.b = 2;
                        if (function3.invoke(xmlPullParser2, obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    Function2 function22 = this.g;
                    XmlPullParser xmlPullParser3 = this.d;
                    this.a = depth;
                    this.b = 3;
                    if (function22.invoke(xmlPullParser3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }

        public final Object a(Object obj) {
            String text;
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && k.k(this.d)) {
                        this.g.invoke(this.d, this);
                    }
                } else if (k.k(this.d)) {
                    this.e.invoke(this.d, this);
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    Function3 function3 = this.f;
                    XmlPullParser xmlPullParser = this.d;
                    String text2 = xmlPullParser.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    function3.invoke(xmlPullParser, StringsKt.trim(text2).toString(), this);
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdParametersTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b, reason: case insensitive filesystem */
    public static final class C5077b extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5077b(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5077b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5077b c5077b = new C5077b(this.d, continuation, this.e, this.f);
            c5077b.c = obj;
            return c5077b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    Ref$ObjectRef ref$ObjectRef = this.e;
                    String b = k.b(xmlPullParser, "xmlEncoded");
                    ref$ObjectRef.element = b != null ? Boxing.boxBoolean(Boolean.parseBoolean(b)) : 0;
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdParametersTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c, reason: case insensitive filesystem */
    public static final class C5078c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C5078c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.y(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdSystemTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, reason: case insensitive filesystem */
    public static final class C5079d extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5079d(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5079d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5079d c5079d = new C5079d(this.d, continuation, this.e, this.f);
            c5079d.c = obj;
            return c5079d;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "version");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdSystemTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e, reason: case insensitive filesystem */
    public static final class C5080e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C5080e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.z(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {126, 127}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f, reason: case insensitive filesystem */
    public static final class C5081f extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5081f(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5081f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5081f c5081f = new C5081f(this.d, continuation, this.e, this.f, this.g);
            c5081f.c = obj;
            return c5081f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v10, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$b] */
        /* JADX WARN: Type inference failed for: r9v34, types: [T, java.lang.Integer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0080 -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b5 -> B:6:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ce -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fa -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0113 -> B:10:0x0118). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Ref$ObjectRef ref$ObjectRef;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                t = new AbstractC5102b.a((o) obj);
                ref$ObjectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) obj;
                if (b != null) {
                    t = new AbstractC5102b.C1638b(b);
                    ref$ObjectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (k.k(this.d)) {
                            XmlPullParser xmlPullParser = this.d;
                            this.e.element = k.b(xmlPullParser, "id");
                            this.f.element = k.m(xmlPullParser);
                        } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        ref$ObjectRef = this.g;
                        if (ref$ObjectRef.element == 0) {
                            String name = xmlPullParser2.getName();
                            if (Intrinsics.areEqual(name, "InLine")) {
                                this.c = ref$ObjectRef;
                                this.a = depth;
                                this.b = 1;
                                Object K = k.K(xmlPullParser2, this);
                                if (K == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                t = new AbstractC5102b.a((o) K);
                            } else if (Intrinsics.areEqual(name, "Wrapper")) {
                                this.c = ref$ObjectRef;
                                this.a = depth;
                                this.b = 2;
                                obj = k.V(xmlPullParser2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) obj;
                                if (b2 != null) {
                                }
                            }
                            ref$ObjectRef.element = t;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                ref$ObjectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g, reason: case insensitive filesystem */
    public static final class C5082g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public C5082g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return k.A(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionAdsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h, reason: case insensitive filesystem */
    public static final class C5083h extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5083h(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5083h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5083h c5083h = new C5083h(this.d, continuation, this.e);
            c5083h.c = obj;
            return c5083h;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                if (eVar != null) {
                    this.e.add(eVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), "Companion")) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.C(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                        if (eVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCompanionAdsTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i, reason: case insensitive filesystem */
    public static final class C5084i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C5084i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.B(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {128, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, ModuleDescriptor.MODULE_VERSION, 146, 147}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$j, reason: case insensitive filesystem */
    public static final class C5085j extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ Ref$ObjectRef h;
        public final /* synthetic */ Ref$ObjectRef i;
        public final /* synthetic */ Ref$ObjectRef j;
        public final /* synthetic */ List k;
        public final /* synthetic */ Ref$ObjectRef l;
        public final /* synthetic */ List m;
        public final /* synthetic */ List n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5085j(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, List list, Ref$ObjectRef ref$ObjectRef7, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = ref$ObjectRef4;
            this.i = ref$ObjectRef5;
            this.j = ref$ObjectRef6;
            this.k = list;
            this.l = ref$ObjectRef7;
            this.m = list2;
            this.n = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5085j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5085j c5085j = new C5085j(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            c5085j.c = obj;
            return c5085j;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0268, code lost:
        
            r3.element = null;
            r7.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(r8, io.bidmachine.iab.vast.tags.VastAttributes.API_FRAMEWORK);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00ff  */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v43, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v44, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v48, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v50, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v53, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0263 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a7 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00af -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b5 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d4 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d6 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e8 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f8 -> B:7:0x00fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010c -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012a -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013d -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013f -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0151 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0189 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0194 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b2 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01c6 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01c8 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01da -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x024a -> B:10:0x0268). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            List list;
            Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar;
            Object obj3;
            Object obj4;
            t tVar;
            Object obj5;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj6;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1348833651:
                                    if (name.equals("AdParameters")) {
                                        Ref$ObjectRef ref$ObjectRef = this.j;
                                        this.c = ref$ObjectRef;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? y = k.y(xmlPullParser, this);
                                        if (y == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        ref$ObjectRef.element = y;
                                        break;
                                    }
                                    break;
                                case -375340334:
                                    if (name.equals("IFrameResource")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 3;
                                        Object F = k.F(xmlPullParser, this);
                                        obj2 = F;
                                        if (F == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                                        if (kVar != null) {
                                            this.m.add(new y.b(kVar));
                                            break;
                                        }
                                    }
                                    break;
                                case -348198615:
                                    if (name.equals("CompanionClickThrough")) {
                                        Ref$ObjectRef ref$ObjectRef2 = this.l;
                                        this.c = ref$ObjectRef2;
                                        this.a = depth;
                                        this.b = 7;
                                        ?? P = k.P(xmlPullParser, this);
                                        if (P == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        ref$ObjectRef2.element = P;
                                        break;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals("TrackingEvents")) {
                                        list = this.k;
                                        this.c = list;
                                        this.a = depth;
                                        this.b = 6;
                                        Object Q = k.Q(xmlPullParser, this);
                                        obj3 = Q;
                                        if (Q == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj7 : (Iterable) obj3) {
                                            if (((u) obj7).d() == v.a) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                        list.addAll(arrayList);
                                        break;
                                    }
                                    break;
                                case 676623548:
                                    if (name.equals("StaticResource")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 1;
                                        Object O = k.O(xmlPullParser, this);
                                        obj4 = O;
                                        if (O == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        tVar = (t) obj4;
                                        if (tVar != null) {
                                            this.m.add(new y.c(tVar));
                                            break;
                                        }
                                    }
                                    break;
                                case 759877206:
                                    if (name.equals(k.K)) {
                                        Ref$ObjectRef ref$ObjectRef3 = this.i;
                                        this.c = ref$ObjectRef3;
                                        this.a = depth;
                                        this.b = 4;
                                        ?? P2 = k.P(xmlPullParser, this);
                                        if (P2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        ref$ObjectRef3.element = P2;
                                        break;
                                    }
                                    break;
                                case 1877773523:
                                    if (name.equals("CompanionClickTracking")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 8;
                                        Object P3 = k.P(xmlPullParser, this);
                                        obj6 = P3;
                                        if (P3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (String) obj6;
                                        if (str != null) {
                                            this.n.add(str);
                                            break;
                                        }
                                    }
                                    break;
                                case 1928285401:
                                    if (name.equals("HTMLResource")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 2;
                                        Object E = k.E(xmlPullParser, this);
                                        obj5 = E;
                                        if (E == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5;
                                        if (jVar != null) {
                                            this.m.add(new y.a(jVar));
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = k.b(xmlPullParser2, "id");
                        Ref$ObjectRef ref$ObjectRef4 = this.f;
                        String b = k.b(xmlPullParser2, "width");
                        ref$ObjectRef4.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                        Ref$ObjectRef ref$ObjectRef5 = this.g;
                        String b2 = k.b(xmlPullParser2, "height");
                        if (b2 != null) {
                        }
                        ref$ObjectRef5.element = StringsKt.toIntOrNull(b2);
                        this.h.element = k.b(xmlPullParser2, VastAttributes.API_FRAMEWORK);
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim(text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    tVar = (t) obj4;
                    if (tVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj5 = obj;
                    jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5;
                    if (jVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                    if (kVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    list = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    ArrayList arrayList2 = new ArrayList();
                    while (r8.hasNext()) {
                    }
                    list.addAll(arrayList2);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj6 = obj;
                    str = (String) obj6;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCompanionTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$k, reason: collision with other inner class name */
    public static final class C1637k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public /* synthetic */ Object k;
        public int l;

        public C1637k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.k = obj;
            this.l |= Integer.MIN_VALUE;
            return k.C(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativeTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {129, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l, reason: case insensitive filesystem */
    public static final class C5086l extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ Ref$ObjectRef h;
        public final /* synthetic */ Ref$ObjectRef i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5086l(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, boolean z) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = ref$ObjectRef4;
            this.i = ref$ObjectRef5;
            this.j = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5086l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5086l c5086l = new C5086l(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            c5086l.c = obj;
            return c5086l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00c7  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v36, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:12:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ba -> B:6:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00de -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011e -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0137 -> B:13:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d2 -> B:12:0x00d3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Ref$ObjectRef ref$ObjectRef;
            T t;
            p pVar;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                pVar = (p) obj;
                if (pVar != null) {
                }
                t = 0;
                ref$ObjectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                if (((List) obj).isEmpty()) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null) {
                    t = new h.a(list);
                    ref$ObjectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (k.k(this.d)) {
                            XmlPullParser xmlPullParser = this.d;
                            this.e.element = k.b(xmlPullParser, "id");
                            this.f.element = k.m(xmlPullParser);
                            this.g.element = k.b(xmlPullParser, VastAttributes.AD_ID);
                            this.h.element = k.b(xmlPullParser, VastAttributes.API_FRAMEWORK);
                        } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        ref$ObjectRef = this.i;
                        if (ref$ObjectRef.element == 0) {
                            String name = xmlPullParser2.getName();
                            if (Intrinsics.areEqual(name, "Linear")) {
                                boolean z = this.j;
                                this.c = ref$ObjectRef;
                                this.a = depth;
                                this.b = 1;
                                obj = k.g(xmlPullParser2, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pVar = (p) obj;
                                if (pVar != null) {
                                    t = new h.b(pVar);
                                    ref$ObjectRef.element = t;
                                }
                            } else if (Intrinsics.areEqual(name, "CompanionAds")) {
                                this.c = ref$ObjectRef;
                                this.a = depth;
                                this.b = 2;
                                obj = k.B(xmlPullParser2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((List) obj).isEmpty()) {
                                }
                                List list2 = (List) obj;
                                if (list2 != null) {
                                }
                            }
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                ref$ObjectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCreativeTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m, reason: case insensitive filesystem */
    public static final class C5087m extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int g;

        public C5087m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.g |= Integer.MIN_VALUE;
            return k.e(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativesTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n, reason: case insensitive filesystem */
    public static final class C5088n extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5088n(XmlPullParser xmlPullParser, Continuation continuation, boolean z, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = z;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5088n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5088n c5088n = new C5088n(this.d, continuation, this.e, this.f);
            c5088n.c = obj;
            return c5088n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007f -> B:5:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ac -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c5 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                if (gVar != null) {
                    this.f.add(gVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), "Creative")) {
                        boolean z = this.e;
                        this.a = depth;
                        this.b = 1;
                        obj = k.e(xmlPullParser, z, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                        if (gVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCreativesTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o, reason: case insensitive filesystem */
    public static final class C5089o extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C5089o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.f(null, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {799}, m = "parseHtmlResourceTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p, reason: case insensitive filesystem */
    public static final class C5090p extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public C5090p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return k.E(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {EventTypeExtended.EVENT_TYPE_EXTENDED_NURL_VALUE}, m = "parseIFrameResourceTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q, reason: case insensitive filesystem */
    public static final class C5091q extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public C5091q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return k.F(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r, reason: case insensitive filesystem */
    public static final class C5092r extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5092r(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5092r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5092r c5092r = new C5092r(this.d, continuation, this.e, this.f);
            c5092r.c = obj;
            return c5092r;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
        /* JADX WARN: Type inference failed for: r7v37, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bb -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d5 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ee -> B:9:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj2 = obj;
                String str = (String) obj2;
                if (str != null) {
                    this.f.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    String name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.H)) {
                        Ref$ObjectRef ref$ObjectRef2 = this.e;
                        this.c = ref$ObjectRef2;
                        this.a = depth;
                        this.b = 1;
                        ?? P = k.P(xmlPullParser, this);
                        if (P == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef2.element = P;
                    } else if (Intrinsics.areEqual(name, k.I)) {
                        this.c = null;
                        this.a = depth;
                        this.b = 2;
                        Object P2 = k.P(xmlPullParser, this);
                        obj2 = P2;
                        if (P2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconClicksTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s, reason: case insensitive filesystem */
    public static final class C5093s extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C5093s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.G(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {130, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 139, 140}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$t, reason: case insensitive filesystem */
    public static final class C5094t extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ Ref$ObjectRef h;
        public final /* synthetic */ Ref$ObjectRef i;
        public final /* synthetic */ Ref$ObjectRef j;
        public final /* synthetic */ Ref$ObjectRef k;
        public final /* synthetic */ Ref$ObjectRef l;
        public final /* synthetic */ List m;
        public Object n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5094t(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = ref$ObjectRef4;
            this.i = ref$ObjectRef5;
            this.j = ref$ObjectRef6;
            this.k = ref$ObjectRef7;
            this.l = ref$ObjectRef8;
            this.m = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5094t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5094t c5094t = new C5094t(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            c5094t.c = obj;
            return c5094t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
        /* JADX WARN: Type inference failed for: r13v17, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v46, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r9v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a1 -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ab -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x015e -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016c -> B:9:0x016f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01f8 -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0211 -> B:12:0x0216). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            XmlPullParser xmlPullParser;
            String name;
            Ref$ObjectRef ref$ObjectRef;
            T t;
            Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar;
            Object obj3;
            t tVar;
            Object obj4;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                tVar = (t) obj3;
                if (tVar != null) {
                }
                t = 0;
                ref$ObjectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj4 = obj;
                jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4;
                if (jVar != null) {
                }
                t = 0;
                ref$ObjectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 3) {
                depth = this.a;
                ref$ObjectRef = (Ref$ObjectRef) this.n;
                xmlPullParser = (XmlPullParser) this.c;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                if (kVar != null) {
                }
                t = 0;
                ref$ObjectRef.element = t;
                name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 4) {
                depth = this.a;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef2.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                Object obj5 = obj;
                String str = (String) obj5;
                if (str != null) {
                    this.m.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (k.k(this.d)) {
                        XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = k.b(xmlPullParser2, "program");
                        Ref$ObjectRef ref$ObjectRef3 = this.f;
                        String b = k.b(xmlPullParser2, "width");
                        ref$ObjectRef3.element = b != null ? StringsKt.toIntOrNull(b) : 0;
                        Ref$ObjectRef ref$ObjectRef4 = this.g;
                        String b2 = k.b(xmlPullParser2, "height");
                        ref$ObjectRef4.element = b2 != null ? StringsKt.toIntOrNull(b2) : 0;
                        this.h.element = k.b(xmlPullParser2, VastAttributes.API_FRAMEWORK);
                        Ref$ObjectRef ref$ObjectRef5 = this.i;
                        String b3 = k.b(xmlPullParser2, "offset");
                        ref$ObjectRef5.element = b3 != null ? k.g(b3) : 0;
                        Ref$ObjectRef ref$ObjectRef6 = this.j;
                        String b4 = k.b(xmlPullParser2, IronSourceConstants.EVENTS_DURATION);
                        if (b4 != null) {
                            ref$ObjectRef6.element = k.f(b4);
                        } else {
                            ref$ObjectRef6.element = null;
                        }
                    } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                        String text2 = this.d.getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        StringsKt.trim(text2).toString();
                    } else if (k.i(this.d)) {
                        return Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    xmlPullParser = this.d;
                    ref$ObjectRef = this.k;
                    if (ref$ObjectRef.element == 0) {
                        String name2 = xmlPullParser.getName();
                        if (name2 != null) {
                            int hashCode = name2.hashCode();
                            if (hashCode == -375340334) {
                                if (name2.equals("IFrameResource")) {
                                    this.c = xmlPullParser;
                                    this.n = ref$ObjectRef;
                                    this.a = depth;
                                    this.b = 3;
                                    Object F = k.F(xmlPullParser, this);
                                    obj2 = F;
                                    if (F == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                                    if (kVar != null) {
                                        t = new y.b(kVar);
                                        ref$ObjectRef.element = t;
                                    }
                                }
                            } else if (hashCode == 676623548) {
                                if (name2.equals("StaticResource")) {
                                    this.c = xmlPullParser;
                                    this.n = ref$ObjectRef;
                                    this.a = depth;
                                    this.b = 1;
                                    Object O = k.O(xmlPullParser, this);
                                    obj3 = O;
                                    if (O == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    tVar = (t) obj3;
                                    if (tVar != null) {
                                        t = new y.c(tVar);
                                        ref$ObjectRef.element = t;
                                    }
                                }
                            } else if (hashCode == 1928285401 && name2.equals("HTMLResource")) {
                                this.c = xmlPullParser;
                                this.n = ref$ObjectRef;
                                this.a = depth;
                                this.b = 2;
                                Object E = k.E(xmlPullParser, this);
                                obj4 = E;
                                if (E == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4;
                                if (jVar != null) {
                                    t = new y.a(jVar);
                                    ref$ObjectRef.element = t;
                                }
                            }
                        }
                        t = 0;
                        ref$ObjectRef.element = t;
                    }
                    name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, k.G)) {
                        Ref$ObjectRef ref$ObjectRef7 = this.l;
                        this.c = ref$ObjectRef7;
                        this.n = null;
                        this.a = depth;
                        this.b = 4;
                        ?? G = k.G(xmlPullParser, this);
                        if (G == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef7.element = G;
                    } else if (Intrinsics.areEqual(name, k.J)) {
                        this.c = null;
                        this.n = null;
                        this.a = depth;
                        this.b = 5;
                        Object P = k.P(xmlPullParser, this);
                        obj5 = P;
                        if (P == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String str2 = (String) obj5;
                        if (str2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$u, reason: case insensitive filesystem */
    public static final class C5095u extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int k;

        public C5095u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return k.H(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v, reason: case insensitive filesystem */
    public static final class C5096v extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5096v(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5096v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5096v c5096v = new C5096v(this.d, continuation, this.e);
            c5096v.c = obj;
            return c5096v;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                if (k.j(this.d)) {
                    this.d.nextTag();
                }
                if (k.h(this.d)) {
                    return Unit.INSTANCE;
                }
                if (!k.k(this.d)) {
                    throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.a;
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                if (lVar != null) {
                    this.e.add(lVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && k.k(this.d)) {
                    XmlPullParser xmlPullParser = this.d;
                    if (Intrinsics.areEqual(xmlPullParser.getName(), k.C)) {
                        this.a = depth;
                        this.b = 1;
                        obj = k.H(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                        if (lVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconsTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w, reason: case insensitive filesystem */
    public static final class C5097w extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C5097w(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return k.I(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseImpressionTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x, reason: case insensitive filesystem */
    public static final class C5098x extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5098x(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5098x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5098x c5098x = new C5098x(this.d, continuation, this.e, this.f);
            c5098x.c = obj;
            return c5098x;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
            if (k.j(this.d)) {
                this.d.nextTag();
            }
            if (k.h(this.d)) {
                return Unit.INSTANCE;
            }
            if (!k.k(this.d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.k(this.d);
                    }
                } else if (k.k(this.d)) {
                    this.e.element = k.b(this.d, "id");
                } else if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                    String text2 = this.d.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = StringsKt.trim(text2).toString();
                } else if (k.i(this.d)) {
                    return Unit.INSTANCE;
                }
                this.d.next();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseImpressionTag")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y, reason: case insensitive filesystem */
    public static final class C5099y extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public C5099y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return k.J(null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseInLineTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, 127, 128, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$z, reason: case insensitive filesystem */
    public static final class C5100z extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ XmlPullParser d;
        public final /* synthetic */ Ref$ObjectRef e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ Ref$ObjectRef g;
        public final /* synthetic */ Ref$ObjectRef h;
        public final /* synthetic */ Ref$ObjectRef i;
        public final /* synthetic */ List j;
        public final /* synthetic */ List k;
        public final /* synthetic */ List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5100z(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, List list, List list2, List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = ref$ObjectRef3;
            this.h = ref$ObjectRef4;
            this.i = ref$ObjectRef5;
            this.j = list;
            this.k = list2;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5100z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C5100z c5100z = new C5100z(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            c5100z.c = obj;
            return c5100z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
        /* JADX WARN: Type inference failed for: r7v41, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v42, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a0 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00aa -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b2 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c4 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d8 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e7 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0105 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0123 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0141 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0155 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0157 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0182 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x019f -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ae -> B:7:0x01b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01bf -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01d9 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01f2 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int depth;
            Object obj2;
            String str;
            Object obj3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar;
            String text;
            XmlPullParser xmlPullParser;
            String name;
            Object obj4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScopeKt.ensureActive((CoroutineScope) this.c);
                    if (k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (k.h(this.d)) {
                        return Unit.INSTANCE;
                    }
                    if (!k.k(this.d)) {
                        throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1692490108:
                                    if (name.equals("Creatives")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 8;
                                        Object f = k.f(xmlPullParser, true, this);
                                        obj4 = f;
                                        if (f == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        this.l.addAll((List) obj4);
                                        break;
                                    }
                                    break;
                                case -1633884078:
                                    if (name.equals("AdSystem")) {
                                        Ref$ObjectRef ref$ObjectRef = this.e;
                                        this.c = ref$ObjectRef;
                                        this.a = depth;
                                        this.b = 1;
                                        ?? z = k.z(xmlPullParser, this);
                                        if (z != coroutine_suspended) {
                                            ref$ObjectRef.element = z;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -56677412:
                                    if (name.equals(k.j)) {
                                        Ref$ObjectRef ref$ObjectRef2 = this.g;
                                        this.c = ref$ObjectRef2;
                                        this.a = depth;
                                        this.b = 3;
                                        ?? P = k.P(xmlPullParser, this);
                                        if (P != coroutine_suspended) {
                                            ref$ObjectRef2.element = P;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 67232232:
                                    if (name.equals("Error")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 7;
                                        Object D = k.D(xmlPullParser, this);
                                        obj2 = D;
                                        if (D == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (String) obj2;
                                        if (str != null) {
                                            this.k.add(str);
                                            break;
                                        }
                                    }
                                    break;
                                case 501930965:
                                    if (name.equals(k.i)) {
                                        Ref$ObjectRef ref$ObjectRef3 = this.f;
                                        this.c = ref$ObjectRef3;
                                        this.a = depth;
                                        this.b = 2;
                                        ?? P2 = k.P(xmlPullParser, this);
                                        if (P2 != coroutine_suspended) {
                                            ref$ObjectRef3.element = P2;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 1349597094:
                                    if (name.equals(k.l)) {
                                        Ref$ObjectRef ref$ObjectRef4 = this.i;
                                        this.c = ref$ObjectRef4;
                                        this.a = depth;
                                        this.b = 5;
                                        ?? N = k.N(xmlPullParser, this);
                                        if (N != coroutine_suspended) {
                                            ref$ObjectRef4.element = N;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 2065545547:
                                    if (name.equals(k.k)) {
                                        Ref$ObjectRef ref$ObjectRef5 = this.h;
                                        this.c = ref$ObjectRef5;
                                        this.a = depth;
                                        this.b = 4;
                                        ?? P3 = k.P(xmlPullParser, this);
                                        if (P3 != coroutine_suspended) {
                                            ref$ObjectRef5.element = P3;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 2114088489:
                                    if (name.equals("Impression")) {
                                        this.c = null;
                                        this.a = depth;
                                        this.b = 6;
                                        Object J = k.J(xmlPullParser, this);
                                        obj3 = J;
                                        if (J == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                                        if (nVar != null) {
                                            this.j.add(nVar);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (!k.k(this.d)) {
                        if (k.l(this.d) && (text = this.d.getText()) != null && !StringsKt.isBlank(text)) {
                            String text2 = this.d.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            StringsKt.trim(text2).toString();
                        } else if (k.i(this.d)) {
                            return Unit.INSTANCE;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef9.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.a;
                    Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) this.c;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef10.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (String) obj2;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.l.addAll((List) obj4);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(XmlPullParser xmlPullParser, Continuation continuation) {
        C5082g c5082g;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        AbstractC5102b abstractC5102b;
        if (continuation instanceof C5082g) {
            c5082g = (C5082g) continuation;
            int i3 = c5082g.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5082g.e = i3 - Integer.MIN_VALUE;
                Object obj = c5082g.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5082g.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    C5081f c5081f = new C5081f(xmlPullParser, null, ref$ObjectRef4, ref$ObjectRef5, ref$ObjectRef6);
                    c5082g.a = ref$ObjectRef4;
                    c5082g.b = ref$ObjectRef5;
                    c5082g.c = ref$ObjectRef6;
                    c5082g.e = 1;
                    if (CoroutineScopeKt.coroutineScope(c5081f, c5082g) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef4;
                    ref$ObjectRef2 = ref$ObjectRef5;
                    ref$ObjectRef3 = ref$ObjectRef6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef3 = (Ref$ObjectRef) c5082g.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) c5082g.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5082g.a;
                    ResultKt.throwOnFailure(obj);
                }
                abstractC5102b = (AbstractC5102b) ref$ObjectRef3.element;
                if (abstractC5102b == null) {
                    return new C5101a((String) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, abstractC5102b);
                }
                return null;
            }
        }
        c5082g = new C5082g(continuation);
        Object obj2 = c5082g.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5082g.e;
        if (i2 != 0) {
        }
        abstractC5102b = (AbstractC5102b) ref$ObjectRef3.element;
        if (abstractC5102b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(XmlPullParser xmlPullParser, Continuation continuation) {
        C5084i c5084i;
        int i2;
        if (continuation instanceof C5084i) {
            c5084i = (C5084i) continuation;
            int i3 = c5084i.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5084i.c = i3 - Integer.MIN_VALUE;
                Object obj = c5084i.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5084i.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c5084i.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C5083h c5083h = new C5083h(xmlPullParser, null, arrayList);
                c5084i.a = arrayList;
                c5084i.c = 1;
                return CoroutineScopeKt.coroutineScope(c5083h, c5084i) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c5084i = new C5084i(continuation);
        Object obj2 = c5084i.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5084i.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(XmlPullParser xmlPullParser, Continuation continuation) {
        C1637k c1637k;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        if (continuation instanceof C1637k) {
            c1637k = (C1637k) continuation;
            int i3 = c1637k.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1637k.l = i3 - Integer.MIN_VALUE;
                Object obj = c1637k.k;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c1637k.l;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Ref$ObjectRef ref$ObjectRef14 = new Ref$ObjectRef();
                    ArrayList arrayList5 = new ArrayList();
                    C5085j c5085j = new C5085j(xmlPullParser, null, ref$ObjectRef8, ref$ObjectRef9, ref$ObjectRef10, ref$ObjectRef12, ref$ObjectRef11, ref$ObjectRef13, arrayList3, ref$ObjectRef14, arrayList4, arrayList5);
                    c1637k.a = ref$ObjectRef8;
                    c1637k.b = ref$ObjectRef9;
                    c1637k.c = ref$ObjectRef10;
                    c1637k.d = ref$ObjectRef11;
                    c1637k.e = ref$ObjectRef12;
                    c1637k.f = ref$ObjectRef13;
                    c1637k.g = arrayList3;
                    c1637k.h = arrayList4;
                    c1637k.i = ref$ObjectRef14;
                    c1637k.j = arrayList5;
                    c1637k.l = 1;
                    if (CoroutineScopeKt.coroutineScope(c5085j, c1637k) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef8;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    list = arrayList5;
                    ref$ObjectRef2 = ref$ObjectRef10;
                    ref$ObjectRef3 = ref$ObjectRef11;
                    ref$ObjectRef4 = ref$ObjectRef13;
                    ref$ObjectRef5 = ref$ObjectRef12;
                    ref$ObjectRef6 = ref$ObjectRef9;
                    ref$ObjectRef7 = ref$ObjectRef14;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c1637k.j;
                    ref$ObjectRef7 = (Ref$ObjectRef) c1637k.i;
                    ?? r4 = (List) c1637k.h;
                    ?? r5 = (List) c1637k.g;
                    ref$ObjectRef4 = (Ref$ObjectRef) c1637k.f;
                    ref$ObjectRef5 = (Ref$ObjectRef) c1637k.e;
                    ref$ObjectRef3 = (Ref$ObjectRef) c1637k.d;
                    ref$ObjectRef2 = (Ref$ObjectRef) c1637k.c;
                    ref$ObjectRef6 = (Ref$ObjectRef) c1637k.b;
                    ref$ObjectRef = (Ref$ObjectRef) c1637k.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList2 = r4;
                    arrayList = r5;
                }
                String str = (String) ref$ObjectRef7.element;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f fVar = str == null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f(str, list) : null;
                if (arrayList2.isEmpty()) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e((String) ref$ObjectRef.element, (Integer) ref$ObjectRef6.element, (Integer) ref$ObjectRef2.element, (String) ref$ObjectRef3.element, (String) ref$ObjectRef5.element, fVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) ref$ObjectRef4.element, arrayList, arrayList2);
                }
                return null;
            }
        }
        c1637k = new C1637k(continuation);
        Object obj2 = c1637k.k;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c1637k.l;
        if (i2 != 0) {
        }
        String str2 = (String) ref$ObjectRef7.element;
        if (str2 == null) {
        }
        if (arrayList2.isEmpty()) {
        }
    }

    public static final Object D(XmlPullParser xmlPullParser, Continuation continuation) {
        return P(xmlPullParser, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(XmlPullParser xmlPullParser, Continuation continuation) {
        C5090p c5090p;
        int i2;
        String str;
        if (continuation instanceof C5090p) {
            c5090p = (C5090p) continuation;
            int i3 = c5090p.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5090p.b = i3 - Integer.MIN_VALUE;
                Object obj = c5090p.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5090p.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c5090p.b = 1;
                    obj = P(xmlPullParser, c5090p);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j(str);
                }
                return null;
            }
        }
        c5090p = new C5090p(continuation);
        Object obj2 = c5090p.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5090p.b;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(XmlPullParser xmlPullParser, Continuation continuation) {
        C5091q c5091q;
        int i2;
        String str;
        if (continuation instanceof C5091q) {
            c5091q = (C5091q) continuation;
            int i3 = c5091q.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5091q.b = i3 - Integer.MIN_VALUE;
                Object obj = c5091q.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5091q.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c5091q.b = 1;
                    obj = P(xmlPullParser, c5091q);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k(str);
                }
                return null;
            }
        }
        c5091q = new C5091q(continuation);
        Object obj2 = c5091q.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5091q.b;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(XmlPullParser xmlPullParser, Continuation continuation) {
        C5093s c5093s;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        List list;
        String str;
        if (continuation instanceof C5093s) {
            c5093s = (C5093s) continuation;
            int i3 = c5093s.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5093s.d = i3 - Integer.MIN_VALUE;
                Object obj = c5093s.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5093s.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ArrayList arrayList = new ArrayList();
                    C5092r c5092r = new C5092r(xmlPullParser, null, ref$ObjectRef2, arrayList);
                    c5093s.a = ref$ObjectRef2;
                    c5093s.b = arrayList;
                    c5093s.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c5092r, c5093s) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                    list = arrayList;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c5093s.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5093s.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ref$ObjectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m(str, list);
                }
                return null;
            }
        }
        c5093s = new C5093s(continuation);
        Object obj2 = c5093s.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5093s.d;
        if (i2 != 0) {
        }
        str = (String) ref$ObjectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(XmlPullParser xmlPullParser, Continuation continuation) {
        C5095u c5095u;
        int i2;
        ArrayList arrayList;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        y yVar;
        if (continuation instanceof C5095u) {
            c5095u = (C5095u) continuation;
            int i3 = c5095u.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5095u.k = i3 - Integer.MIN_VALUE;
                Object obj = c5095u.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5095u.k;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef14 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef15 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef16 = new Ref$ObjectRef();
                    ArrayList arrayList2 = new ArrayList();
                    C5094t c5094t = new C5094t(xmlPullParser, null, ref$ObjectRef9, ref$ObjectRef10, ref$ObjectRef11, ref$ObjectRef12, ref$ObjectRef13, ref$ObjectRef14, ref$ObjectRef16, ref$ObjectRef15, arrayList2);
                    c5095u.a = ref$ObjectRef9;
                    c5095u.b = ref$ObjectRef10;
                    c5095u.c = ref$ObjectRef11;
                    c5095u.d = ref$ObjectRef12;
                    c5095u.e = ref$ObjectRef13;
                    c5095u.f = ref$ObjectRef14;
                    c5095u.g = ref$ObjectRef15;
                    c5095u.h = ref$ObjectRef16;
                    arrayList = arrayList2;
                    c5095u.i = arrayList;
                    c5095u.k = 1;
                    if (CoroutineScopeKt.coroutineScope(c5094t, c5095u) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef9;
                    ref$ObjectRef2 = ref$ObjectRef10;
                    ref$ObjectRef3 = ref$ObjectRef16;
                    ref$ObjectRef4 = ref$ObjectRef13;
                    ref$ObjectRef5 = ref$ObjectRef15;
                    ref$ObjectRef6 = ref$ObjectRef11;
                    ref$ObjectRef7 = ref$ObjectRef14;
                    ref$ObjectRef8 = ref$ObjectRef12;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) c5095u.i;
                    ref$ObjectRef3 = (Ref$ObjectRef) c5095u.h;
                    ref$ObjectRef5 = (Ref$ObjectRef) c5095u.g;
                    ref$ObjectRef7 = (Ref$ObjectRef) c5095u.f;
                    ref$ObjectRef4 = (Ref$ObjectRef) c5095u.e;
                    ref$ObjectRef8 = (Ref$ObjectRef) c5095u.d;
                    ref$ObjectRef6 = (Ref$ObjectRef) c5095u.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) c5095u.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5095u.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList = r2;
                }
                yVar = (y) ref$ObjectRef3.element;
                if (yVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l((String) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef6.element, (String) ref$ObjectRef8.element, (r) ref$ObjectRef4.element, (Long) ref$ObjectRef7.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) ref$ObjectRef5.element, arrayList, yVar);
                }
                return null;
            }
        }
        c5095u = new C5095u(continuation);
        Object obj2 = c5095u.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5095u.k;
        if (i2 != 0) {
        }
        yVar = (y) ref$ObjectRef3.element;
        if (yVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(XmlPullParser xmlPullParser, Continuation continuation) {
        C5097w c5097w;
        int i2;
        if (continuation instanceof C5097w) {
            c5097w = (C5097w) continuation;
            int i3 = c5097w.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5097w.c = i3 - Integer.MIN_VALUE;
                Object obj = c5097w.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5097w.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c5097w.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C5096v c5096v = new C5096v(xmlPullParser, null, arrayList);
                c5097w.a = arrayList;
                c5097w.c = 1;
                return CoroutineScopeKt.coroutineScope(c5096v, c5097w) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c5097w = new C5097w(continuation);
        Object obj2 = c5097w.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5097w.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(XmlPullParser xmlPullParser, Continuation continuation) {
        C5099y c5099y;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        if (continuation instanceof C5099y) {
            c5099y = (C5099y) continuation;
            int i3 = c5099y.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5099y.d = i3 - Integer.MIN_VALUE;
                Object obj = c5099y.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5099y.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    C5098x c5098x = new C5098x(xmlPullParser, null, ref$ObjectRef3, ref$ObjectRef4);
                    c5099y.a = ref$ObjectRef3;
                    c5099y.b = ref$ObjectRef4;
                    c5099y.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c5098x, c5099y) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) c5099y.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5099y.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ref$ObjectRef2.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n((String) ref$ObjectRef.element, str);
                }
                return null;
            }
        }
        c5099y = new C5099y(continuation);
        Object obj2 = c5099y.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5099y.d;
        if (i2 != 0) {
        }
        str = (String) ref$ObjectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(XmlPullParser xmlPullParser, Continuation continuation) {
        A a2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        if (continuation instanceof A) {
            a2 = (A) continuation;
            int i3 = a2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2.j = i3 - Integer.MIN_VALUE;
                Object obj = a2.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = a2.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    C5100z c5100z = new C5100z(xmlPullParser, null, ref$ObjectRef6, ref$ObjectRef7, ref$ObjectRef8, ref$ObjectRef9, ref$ObjectRef10, arrayList4, arrayList5, arrayList6);
                    a2.a = ref$ObjectRef6;
                    a2.b = ref$ObjectRef7;
                    a2.c = ref$ObjectRef8;
                    a2.d = ref$ObjectRef9;
                    a2.e = ref$ObjectRef10;
                    a2.f = arrayList4;
                    a2.g = arrayList5;
                    a2.h = arrayList6;
                    a2.j = 1;
                    if (CoroutineScopeKt.coroutineScope(c5100z, a2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef6;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    ref$ObjectRef2 = ref$ObjectRef8;
                    ref$ObjectRef3 = ref$ObjectRef7;
                    ref$ObjectRef4 = ref$ObjectRef9;
                    ref$ObjectRef5 = ref$ObjectRef10;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) a2.h;
                    ?? r3 = (List) a2.g;
                    ?? r4 = (List) a2.f;
                    ref$ObjectRef5 = (Ref$ObjectRef) a2.e;
                    ref$ObjectRef4 = (Ref$ObjectRef) a2.d;
                    ref$ObjectRef2 = (Ref$ObjectRef) a2.c;
                    ref$ObjectRef3 = (Ref$ObjectRef) a2.b;
                    ref$ObjectRef = (Ref$ObjectRef) a2.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    arrayList = r4;
                }
                return new o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) ref$ObjectRef.element, (String) ref$ObjectRef3.element, (String) ref$ObjectRef2.element, (String) ref$ObjectRef4.element, (s) ref$ObjectRef5.element, arrayList, arrayList2, arrayList3);
            }
        }
        a2 = new A(continuation);
        Object obj2 = a2.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = a2.j;
        if (i2 != 0) {
        }
        return new o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) ref$ObjectRef.element, (String) ref$ObjectRef3.element, (String) ref$ObjectRef2.element, (String) ref$ObjectRef4.element, (s) ref$ObjectRef5.element, arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(XmlPullParser xmlPullParser, Continuation continuation) {
        E e2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        Ref$ObjectRef ref$ObjectRef9;
        Ref$ObjectRef ref$ObjectRef10;
        Ref$ObjectRef ref$ObjectRef11;
        Ref$ObjectRef ref$ObjectRef12;
        if (continuation instanceof E) {
            e2 = (E) continuation;
            int i3 = e2.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e2.n = i3 - Integer.MIN_VALUE;
                Object obj = e2.m;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = e2.n;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef14 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef15 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef16 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef17 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef18 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef19 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef20 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef21 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef23 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef24 = new Ref$ObjectRef();
                    D d2 = new D(xmlPullParser, null, ref$ObjectRef14, ref$ObjectRef15, ref$ObjectRef16, ref$ObjectRef17, ref$ObjectRef18, ref$ObjectRef19, ref$ObjectRef20, ref$ObjectRef21, ref$ObjectRef22, ref$ObjectRef23, ref$ObjectRef24, ref$ObjectRef13);
                    e2.a = ref$ObjectRef13;
                    e2.b = ref$ObjectRef14;
                    e2.c = ref$ObjectRef15;
                    e2.d = ref$ObjectRef16;
                    e2.e = ref$ObjectRef17;
                    e2.f = ref$ObjectRef18;
                    e2.g = ref$ObjectRef19;
                    e2.h = ref$ObjectRef20;
                    e2.i = ref$ObjectRef21;
                    e2.j = ref$ObjectRef22;
                    e2.k = ref$ObjectRef23;
                    e2.l = ref$ObjectRef24;
                    e2.n = 1;
                    if (CoroutineScopeKt.coroutineScope(d2, e2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef13;
                    ref$ObjectRef2 = ref$ObjectRef24;
                    ref$ObjectRef3 = ref$ObjectRef14;
                    ref$ObjectRef4 = ref$ObjectRef23;
                    ref$ObjectRef5 = ref$ObjectRef17;
                    ref$ObjectRef6 = ref$ObjectRef22;
                    ref$ObjectRef7 = ref$ObjectRef15;
                    ref$ObjectRef8 = ref$ObjectRef21;
                    ref$ObjectRef9 = ref$ObjectRef16;
                    ref$ObjectRef10 = ref$ObjectRef20;
                    ref$ObjectRef11 = ref$ObjectRef18;
                    ref$ObjectRef12 = ref$ObjectRef19;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) e2.l;
                    ref$ObjectRef4 = (Ref$ObjectRef) e2.k;
                    ref$ObjectRef6 = (Ref$ObjectRef) e2.j;
                    ref$ObjectRef8 = (Ref$ObjectRef) e2.i;
                    ref$ObjectRef10 = (Ref$ObjectRef) e2.h;
                    ref$ObjectRef12 = (Ref$ObjectRef) e2.g;
                    ref$ObjectRef11 = (Ref$ObjectRef) e2.f;
                    ref$ObjectRef5 = (Ref$ObjectRef) e2.e;
                    ref$ObjectRef9 = (Ref$ObjectRef) e2.d;
                    ref$ObjectRef7 = (Ref$ObjectRef) e2.c;
                    ref$ObjectRef3 = (Ref$ObjectRef) e2.b;
                    ref$ObjectRef = (Ref$ObjectRef) e2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$ObjectRef.element != 0 || ref$ObjectRef9.element == 0 || ref$ObjectRef7.element == 0) {
                    return null;
                }
                T t2 = ref$ObjectRef.element;
                Intrinsics.checkNotNull(t2);
                String str = (String) t2;
                String str2 = (String) ref$ObjectRef3.element;
                T t3 = ref$ObjectRef7.element;
                Intrinsics.checkNotNull(t3);
                boolean booleanValue = ((Boolean) t3).booleanValue();
                T t4 = ref$ObjectRef9.element;
                Intrinsics.checkNotNull(t4);
                return new q(str, str2, booleanValue, (String) t4, (Integer) ref$ObjectRef5.element, (Integer) ref$ObjectRef11.element, (String) ref$ObjectRef12.element, (Integer) ref$ObjectRef10.element, (Integer) ref$ObjectRef8.element, (Integer) ref$ObjectRef6.element, (Boolean) ref$ObjectRef4.element, (String) ref$ObjectRef2.element);
            }
        }
        e2 = new E(continuation);
        Object obj2 = e2.m;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = e2.n;
        if (i2 != 0) {
        }
        if (ref$ObjectRef.element != 0) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(XmlPullParser xmlPullParser, Continuation continuation) {
        G g2;
        int i2;
        if (continuation instanceof G) {
            g2 = (G) continuation;
            int i3 = g2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g2.c = i3 - Integer.MIN_VALUE;
                Object obj = g2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = g2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) g2.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                F f2 = new F(xmlPullParser, null, arrayList);
                g2.a = arrayList;
                g2.c = 1;
                return CoroutineScopeKt.coroutineScope(f2, g2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        g2 = new G(continuation);
        Object obj2 = g2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = g2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(XmlPullParser xmlPullParser, Continuation continuation) {
        I i2;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        if (continuation instanceof I) {
            i2 = (I) continuation;
            int i4 = i2.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i2.d = i4 - Integer.MIN_VALUE;
                Object obj = i2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = i2.d;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    H h2 = new H(xmlPullParser, null, ref$ObjectRef3, ref$ObjectRef4);
                    i2.a = ref$ObjectRef3;
                    i2.b = ref$ObjectRef4;
                    i2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(h2, i2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) i2.b;
                    ref$ObjectRef = (Ref$ObjectRef) i2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$ObjectRef.element == 0 || ref$ObjectRef2.element != 0) {
                    return new s((String) ref$ObjectRef.element, (String) ref$ObjectRef2.element);
                }
                return null;
            }
        }
        i2 = new I(continuation);
        Object obj2 = i2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = i2.d;
        if (i3 != 0) {
        }
        if (ref$ObjectRef.element == 0) {
        }
        return new s((String) ref$ObjectRef.element, (String) ref$ObjectRef2.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(XmlPullParser xmlPullParser, Continuation continuation) {
        K k2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        if (continuation instanceof K) {
            k2 = (K) continuation;
            int i3 = k2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k2.d = i3 - Integer.MIN_VALUE;
                Object obj = k2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = k2.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    J j2 = new J(xmlPullParser, null, ref$ObjectRef4, ref$ObjectRef3);
                    k2.a = ref$ObjectRef3;
                    k2.b = ref$ObjectRef4;
                    k2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(j2, k2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) k2.b;
                    ref$ObjectRef = (Ref$ObjectRef) k2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$ObjectRef.element == 0 && ref$ObjectRef2.element != 0) {
                    T t2 = ref$ObjectRef.element;
                    Intrinsics.checkNotNull(t2);
                    T t3 = ref$ObjectRef2.element;
                    Intrinsics.checkNotNull(t3);
                    return new t((String) t2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) t3);
                }
            }
        }
        k2 = new K(continuation);
        Object obj2 = k2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = k2.d;
        if (i2 != 0) {
        }
        return ref$ObjectRef.element == 0 ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(XmlPullParser xmlPullParser, Continuation continuation) {
        M m2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        if (continuation instanceof M) {
            m2 = (M) continuation;
            int i3 = m2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m2.c = i3 - Integer.MIN_VALUE;
                Object obj = m2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = m2.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    L l2 = new L(xmlPullParser, null, ref$ObjectRef2);
                    m2.a = ref$ObjectRef2;
                    m2.c = 1;
                    if (CoroutineScopeKt.coroutineScope(l2, m2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) m2.a;
                    ResultKt.throwOnFailure(obj);
                }
                return ref$ObjectRef.element;
            }
        }
        m2 = new M(continuation);
        Object obj2 = m2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = m2.c;
        if (i2 != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(XmlPullParser xmlPullParser, Continuation continuation) {
        O o2;
        int i2;
        if (continuation instanceof O) {
            o2 = (O) continuation;
            int i3 = o2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2.c = i3 - Integer.MIN_VALUE;
                Object obj = o2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = o2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) o2.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                N n2 = new N(xmlPullParser, null, arrayList);
                o2.a = arrayList;
                o2.c = 1;
                return CoroutineScopeKt.coroutineScope(n2, o2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        o2 = new O(continuation);
        Object obj2 = o2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = o2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(XmlPullParser xmlPullParser, Continuation continuation) {
        Q q2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        T t2;
        if (continuation instanceof Q) {
            q2 = (Q) continuation;
            int i3 = q2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q2.e = i3 - Integer.MIN_VALUE;
                Object obj = q2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = q2.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    P p2 = new P(xmlPullParser, null, ref$ObjectRef4, ref$ObjectRef6, ref$ObjectRef5);
                    q2.a = ref$ObjectRef4;
                    q2.b = ref$ObjectRef5;
                    q2.c = ref$ObjectRef6;
                    q2.e = 1;
                    if (CoroutineScopeKt.coroutineScope(p2, q2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef4;
                    ref$ObjectRef2 = ref$ObjectRef5;
                    ref$ObjectRef3 = ref$ObjectRef6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef3 = (Ref$ObjectRef) q2.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) q2.b;
                    ref$ObjectRef = (Ref$ObjectRef) q2.a;
                    ResultKt.throwOnFailure(obj);
                }
                t2 = ref$ObjectRef.element;
                if (t2 != 0 || ref$ObjectRef2.element == 0 || (t2 == v.n && ref$ObjectRef3.element == 0)) {
                    return null;
                }
                T t3 = ref$ObjectRef.element;
                Intrinsics.checkNotNull(t3);
                T t4 = ref$ObjectRef2.element;
                Intrinsics.checkNotNull(t4);
                return new u((v) t3, (String) t4, (r) ref$ObjectRef3.element);
            }
        }
        q2 = new Q(continuation);
        Object obj2 = q2.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = q2.e;
        if (i2 != 0) {
        }
        t2 = ref$ObjectRef.element;
        if (t2 != 0) {
        }
        return null;
    }

    public static final Object S(XmlPullParser xmlPullParser, Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new R(xmlPullParser, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(XmlPullParser xmlPullParser, Continuation continuation) {
        T t2;
        int i2;
        List list;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        if (continuation instanceof T) {
            t2 = (T) continuation;
            int i3 = t2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t2.e = i3 - Integer.MIN_VALUE;
                Object obj = t2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = t2.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    S s2 = new S(xmlPullParser, null, ref$ObjectRef3, ref$ObjectRef4, arrayList);
                    t2.a = arrayList;
                    t2.b = ref$ObjectRef3;
                    t2.c = ref$ObjectRef4;
                    t2.e = 1;
                    if (CoroutineScopeKt.coroutineScope(s2, t2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) t2.c;
                    ref$ObjectRef = (Ref$ObjectRef) t2.b;
                    list = (List) t2.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (list.isEmpty() || ref$ObjectRef2.element != 0) {
                    return new w(list, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element);
                }
                return null;
            }
        }
        t2 = new T(continuation);
        Object obj2 = t2.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = t2.e;
        if (i2 != 0) {
        }
        if (list.isEmpty()) {
        }
        return new w(list, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(XmlPullParser xmlPullParser, Continuation continuation) {
        V v2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        if (continuation instanceof V) {
            v2 = (V) continuation;
            int i3 = v2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2.d = i3 - Integer.MIN_VALUE;
                Object obj = v2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = v2.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    U u2 = new U(xmlPullParser, null, ref$ObjectRef3, ref$ObjectRef4);
                    v2.a = ref$ObjectRef3;
                    v2.b = ref$ObjectRef4;
                    v2.d = 1;
                    if (CoroutineScopeKt.coroutineScope(u2, v2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) v2.b;
                    ref$ObjectRef = (Ref$ObjectRef) v2.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ref$ObjectRef2.element;
                if (str == null) {
                    return new z((String) ref$ObjectRef.element, str);
                }
                return null;
            }
        }
        v2 = new V(continuation);
        Object obj2 = v2.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = v2.d;
        if (i2 != 0) {
        }
        str = (String) ref$ObjectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(XmlPullParser xmlPullParser, Continuation continuation) {
        Z z2;
        int i2;
        ArrayList arrayList;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Ref$ObjectRef ref$ObjectRef3;
        String str;
        if (continuation instanceof Z) {
            z2 = (Z) continuation;
            int i3 = z2.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.h = i3 - Integer.MIN_VALUE;
                Object obj = z2.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = z2.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Y y2 = new Y(xmlPullParser, null, ref$ObjectRef5, ref$ObjectRef4, ref$ObjectRef6, arrayList, arrayList4, arrayList5);
                    z2.a = ref$ObjectRef4;
                    z2.b = ref$ObjectRef5;
                    z2.c = ref$ObjectRef6;
                    z2.d = arrayList;
                    z2.e = arrayList4;
                    z2.f = arrayList5;
                    z2.h = 1;
                    if (CoroutineScopeKt.coroutineScope(y2, z2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef4;
                    ref$ObjectRef2 = ref$ObjectRef5;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    ref$ObjectRef3 = ref$ObjectRef6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (List) z2.f;
                    ?? r3 = (List) z2.e;
                    ?? r4 = (List) z2.d;
                    ref$ObjectRef3 = (Ref$ObjectRef) z2.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) z2.b;
                    ref$ObjectRef = (Ref$ObjectRef) z2.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    arrayList = r4;
                }
                str = (String) ref$ObjectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B(str, (Boolean) ref$ObjectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) ref$ObjectRef3.element, arrayList, arrayList2, arrayList3);
                }
                return null;
            }
        }
        z2 = new Z(continuation);
        Object obj2 = z2.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = z2.h;
        if (i2 != 0) {
        }
        str = (String) ref$ObjectRef.element;
        if (str == null) {
        }
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(XmlPullParser xmlPullParser, Continuation continuation) {
        C5078c c5078c;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        if (continuation instanceof C5078c) {
            c5078c = (C5078c) continuation;
            int i3 = c5078c.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5078c.d = i3 - Integer.MIN_VALUE;
                Object obj = c5078c.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5078c.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    C5077b c5077b = new C5077b(xmlPullParser, null, ref$ObjectRef4, ref$ObjectRef3);
                    c5078c.a = ref$ObjectRef3;
                    c5078c.b = ref$ObjectRef4;
                    c5078c.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c5077b, c5078c) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) c5078c.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5078c.a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ref$ObjectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c(str, (Boolean) ref$ObjectRef2.element);
                }
                return null;
            }
        }
        c5078c = new C5078c(continuation);
        Object obj2 = c5078c.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5078c.d;
        if (i2 != 0) {
        }
        str = (String) ref$ObjectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(XmlPullParser xmlPullParser, Continuation continuation) {
        C5080e c5080e;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        if (continuation instanceof C5080e) {
            c5080e = (C5080e) continuation;
            int i3 = c5080e.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5080e.d = i3 - Integer.MIN_VALUE;
                Object obj = c5080e.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5080e.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    C5079d c5079d = new C5079d(xmlPullParser, null, ref$ObjectRef4, ref$ObjectRef3);
                    c5080e.a = ref$ObjectRef3;
                    c5080e.b = ref$ObjectRef4;
                    c5080e.d = 1;
                    if (CoroutineScopeKt.coroutineScope(c5079d, c5080e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) c5080e.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5080e.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$ObjectRef.element == 0 || ref$ObjectRef2.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((String) ref$ObjectRef.element, (String) ref$ObjectRef2.element);
                }
                return null;
            }
        }
        c5080e = new C5080e(continuation);
        Object obj2 = c5080e.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5080e.d;
        if (i2 != 0) {
        }
        if (ref$ObjectRef.element == 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((String) ref$ObjectRef.element, (String) ref$ObjectRef2.element);
    }

    public static final boolean h(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    public static final boolean i(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static final boolean j(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    public static final boolean k(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static final boolean l(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final Integer m(XmlPullParser xmlPullParser) {
        String b2 = b(xmlPullParser, "sequence");
        if (b2 == null) {
            return null;
        }
        Integer intOrNull = StringsKt.toIntOrNull(b2);
        return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
    }

    public static final r n(XmlPullParser xmlPullParser) {
        String b2 = b(xmlPullParser, VastAttributes.SKIP_OFFSET);
        if (b2 != null) {
            return g(b2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(XmlPullParser xmlPullParser, boolean z2, Continuation continuation) {
        C5087m c5087m;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVar;
        if (continuation instanceof C5087m) {
            c5087m = (C5087m) continuation;
            int i3 = c5087m.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5087m.g = i3 - Integer.MIN_VALUE;
                Object obj = c5087m.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5087m.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                    C5086l c5086l = new C5086l(xmlPullParser, null, ref$ObjectRef6, ref$ObjectRef7, ref$ObjectRef8, ref$ObjectRef9, ref$ObjectRef10, z2);
                    c5087m.a = ref$ObjectRef6;
                    c5087m.b = ref$ObjectRef7;
                    c5087m.c = ref$ObjectRef8;
                    c5087m.d = ref$ObjectRef9;
                    c5087m.e = ref$ObjectRef10;
                    c5087m.g = 1;
                    if (CoroutineScopeKt.coroutineScope(c5086l, c5087m) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef6;
                    ref$ObjectRef2 = ref$ObjectRef7;
                    ref$ObjectRef3 = ref$ObjectRef10;
                    ref$ObjectRef4 = ref$ObjectRef8;
                    ref$ObjectRef5 = ref$ObjectRef9;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef3 = (Ref$ObjectRef) c5087m.e;
                    ref$ObjectRef5 = (Ref$ObjectRef) c5087m.d;
                    ref$ObjectRef4 = (Ref$ObjectRef) c5087m.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) c5087m.b;
                    ref$ObjectRef = (Ref$ObjectRef) c5087m.a;
                    ResultKt.throwOnFailure(obj);
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) ref$ObjectRef3.element;
                if (hVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g((String) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (String) ref$ObjectRef4.element, (String) ref$ObjectRef5.element, hVar);
                }
                return null;
            }
        }
        c5087m = new C5087m(continuation);
        Object obj2 = c5087m.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5087m.g;
        if (i2 != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) ref$ObjectRef3.element;
        if (hVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(XmlPullParser xmlPullParser, boolean z2, Continuation continuation) {
        C5089o c5089o;
        int i2;
        if (continuation instanceof C5089o) {
            c5089o = (C5089o) continuation;
            int i3 = c5089o.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c5089o.c = i3 - Integer.MIN_VALUE;
                Object obj = c5089o.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c5089o.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) c5089o.a;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                C5088n c5088n = new C5088n(xmlPullParser, null, z2, arrayList);
                c5089o.a = arrayList;
                c5089o.c = 1;
                return CoroutineScopeKt.coroutineScope(c5088n, c5089o) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c5089o = new C5089o(continuation);
        Object obj2 = c5089o.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c5089o.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(XmlPullParser xmlPullParser, boolean z2, Continuation continuation) {
        C c2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Ref$ObjectRef ref$ObjectRef4;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i3 = c2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.j = i3 - Integer.MIN_VALUE;
                Object obj = c2.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    ArrayList arrayList6 = new ArrayList();
                    B b2 = new B(xmlPullParser, null, ref$ObjectRef5, ref$ObjectRef, ref$ObjectRef6, arrayList4, arrayList5, ref$ObjectRef7, z2, arrayList6);
                    c2.b = ref$ObjectRef5;
                    c2.c = ref$ObjectRef;
                    c2.d = ref$ObjectRef6;
                    c2.e = arrayList4;
                    c2.f = arrayList5;
                    c2.g = ref$ObjectRef7;
                    c2.h = arrayList6;
                    c2.a = z2;
                    c2.j = 1;
                    if (CoroutineScopeKt.coroutineScope(b2, c2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef2 = ref$ObjectRef5;
                    ref$ObjectRef3 = ref$ObjectRef6;
                    arrayList = arrayList6;
                    z3 = z2;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList4;
                    ref$ObjectRef4 = ref$ObjectRef7;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = c2.a;
                    ?? r3 = (List) c2.h;
                    ref$ObjectRef4 = (Ref$ObjectRef) c2.g;
                    ?? r5 = (List) c2.f;
                    ?? r6 = (List) c2.e;
                    Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) c2.d;
                    Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) c2.c;
                    ref$ObjectRef2 = (Ref$ObjectRef) c2.b;
                    ResultKt.throwOnFailure(obj);
                    arrayList = r3;
                    ref$ObjectRef3 = ref$ObjectRef8;
                    ref$ObjectRef = ref$ObjectRef9;
                    arrayList2 = r5;
                    arrayList3 = r6;
                }
                if (z3 || !arrayList3.isEmpty()) {
                    return new p((r) ref$ObjectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) ref$ObjectRef.element, (Long) ref$ObjectRef3.element, arrayList3, arrayList2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) ref$ObjectRef4.element, arrayList);
                }
                return null;
            }
        }
        c2 = new C(continuation);
        Object obj2 = c2.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2.j;
        if (i2 != 0) {
        }
        if (z3) {
        }
        return new p((r) ref$ObjectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) ref$ObjectRef.element, (Long) ref$ObjectRef3.element, arrayList3, arrayList2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) ref$ObjectRef4.element, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer h(String str) {
        Object m8023constructorimpl;
        Number parse;
        Integer num;
        try {
            Result.Companion companion = Result.INSTANCE;
            parse = b.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (parse != null) {
            int floatValue = (int) (parse.floatValue() * 100);
            num = Integer.valueOf(floatValue);
            if (floatValue >= 0 && floatValue < 101) {
                m8023constructorimpl = Result.m8023constructorimpl(num);
                return (Integer) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
            }
        }
        num = null;
        m8023constructorimpl = Result.m8023constructorimpl(num);
        return (Integer) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final v i(String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals("midpoint")) {
                    return v.d;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return v.e;
                }
                return null;
            case -1001078227:
                if (str.equals("progress")) {
                    return v.n;
                }
                return null;
            case -934426579:
                if (str.equals("resume")) {
                    return v.k;
                }
                return null;
            case -934318917:
                if (str.equals("rewind")) {
                    return v.j;
                }
                return null;
            case -840405966:
                if (str.equals("unmute")) {
                    return v.h;
                }
                return null;
            case -599445191:
                if (str.equals("complete")) {
                    return v.f;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return v.l;
                }
                return null;
            case 3363353:
                if (str.equals("mute")) {
                    return v.g;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return v.m;
                }
                return null;
            case 106440182:
                if (str.equals("pause")) {
                    return v.i;
                }
                return null;
            case 109757538:
                if (str.equals("start")) {
                    return v.b;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return v.c;
                }
                return null;
            case 1778167540:
                if (str.equals("creativeView")) {
                    return v.a;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final i b() {
        return c();
    }

    public static final j c() {
        return (j) a.getValue();
    }

    public static final j a() {
        return new j();
    }

    public static final String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || StringsKt.isBlank(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    public static final Object a(XmlPullParser xmlPullParser, Function2 function2, Function3 function3, Function2 function22, Continuation continuation) {
        C5076a c5076a = new C5076a(xmlPullParser, function2, function3, function22, null);
        InlineMarker.mark(0);
        CoroutineScopeKt.coroutineScope(c5076a, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(XmlPullParser xmlPullParser, boolean z2, Continuation continuation) {
        X x2;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        List list;
        List list2;
        if (continuation instanceof X) {
            x2 = (X) continuation;
            int i3 = x2.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x2.f = i3 - Integer.MIN_VALUE;
                Object obj = x2.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = x2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    W w2 = new W(xmlPullParser, null, ref$ObjectRef2, arrayList, arrayList2);
                    x2.b = ref$ObjectRef2;
                    x2.c = arrayList;
                    x2.d = arrayList2;
                    x2.a = z2;
                    x2.f = 1;
                    if (CoroutineScopeKt.coroutineScope(w2, x2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                    list = arrayList;
                    list2 = arrayList2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = x2.a;
                    list2 = (List) x2.d;
                    list = (List) x2.c;
                    ref$ObjectRef = (Ref$ObjectRef) x2.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (z2 || ref$ObjectRef.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((z) ref$ObjectRef.element, list, list2);
                }
                return null;
            }
        }
        x2 = new X(continuation);
        Object obj2 = x2.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = x2.f;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((z) ref$ObjectRef.element, list, list2);
    }

    public static final r g(String str) {
        Long f2 = f(str);
        if (f2 != null) {
            return new r.b(f2.longValue());
        }
        Integer h2 = h(str);
        if (h2 != null) {
            return new r.a(h2.intValue());
        }
        return null;
    }

    public static final SimpleDateFormat e() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss.SSS");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i e(String str) {
        if (StringsKt.startsWith(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.a;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b;
        }
        return null;
    }

    public static final Long f(String str) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            Date parse = e().parse(str);
            m8023constructorimpl = Result.m8023constructorimpl(parse != null ? Long.valueOf(parse.getTime()) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Long l2 = (Long) m8023constructorimpl;
        if (l2 != null) {
            return l2;
        }
        try {
            Date parse2 = f().parse(str);
            m8023constructorimpl2 = Result.m8023constructorimpl(parse2 != null ? Long.valueOf(parse2.getTime()) : null);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        return (Long) (Result.m8028isFailureimpl(m8023constructorimpl2) ? null : m8023constructorimpl2);
    }

    public static final SimpleDateFormat f() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss");
    }
}
