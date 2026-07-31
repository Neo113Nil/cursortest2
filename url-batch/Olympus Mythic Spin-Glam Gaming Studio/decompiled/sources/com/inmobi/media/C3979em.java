package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.video.POBVastError;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.inmobi.media.em, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3979em {
    public final AdConfig.VastVideoConfig a;
    public final Ml b;
    public final C4493y9 c;
    public int d;
    public boolean e;
    public String f;
    public String g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;

    public C3979em(AdConfig.VastVideoConfig vastVideoConfig, Ml vastEventProcessor, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(vastEventProcessor, "vastEventProcessor");
        this.a = vastVideoConfig;
        this.b = vastEventProcessor;
        this.c = c4493y9;
        this.f = "";
        this.g = "";
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = "";
        this.k = "";
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3979em c3979em, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Vl vl;
        int i;
        String str;
        Ref$BooleanRef ref$BooleanRef;
        c3979em.getClass();
        if (continuationImpl instanceof Vl) {
            vl = (Vl) continuationImpl;
            int i2 = vl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vl.d = i2 - Integer.MIN_VALUE;
                Object obj = vl.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = vl.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    try {
                        str = xmlPullParser.getAttributeValue(null, "adType").toString();
                    } catch (Exception unused) {
                        str = "video";
                    }
                    if (!Intrinsics.areEqual(str, "video")) {
                        throw new Sl((short) 1125);
                    }
                    Function1 wl = new Wl(c3979em, null, ref$BooleanRef2, xmlPullParser);
                    vl.a = ref$BooleanRef2;
                    vl.d = 1;
                    if (c3979em.a(xmlPullParser, "Ad", wl, vl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = vl.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$BooleanRef.element) {
                    throw new Sl((short) 1101);
                }
                return Unit.INSTANCE;
            }
        }
        vl = new Vl(c3979em, continuationImpl);
        Object obj2 = vl.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = vl.d;
        if (i != 0) {
        }
        if (ref$BooleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C3979em c3979em, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Zl zl;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        c3979em.getClass();
        if (continuationImpl instanceof Zl) {
            zl = (Zl) continuationImpl;
            int i2 = zl.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zl.e = i2 - Integer.MIN_VALUE;
                Object obj = zl.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zl.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                    Ref$BooleanRef ref$BooleanRef4 = new Ref$BooleanRef();
                    Function1 c3873am = new C3873am(xmlPullParser, c3979em, ref$BooleanRef4, ref$BooleanRef3, null);
                    zl.a = ref$BooleanRef3;
                    zl.b = ref$BooleanRef4;
                    zl.e = 1;
                    if (c3979em.a(xmlPullParser, VastTagName.VAST, c3873am, zl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$BooleanRef = ref$BooleanRef3;
                    ref$BooleanRef2 = ref$BooleanRef4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef2 = zl.b;
                    ref$BooleanRef = zl.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!ref$BooleanRef.element) {
                    return Unit.INSTANCE;
                }
                if (ref$BooleanRef2.element) {
                    throw new Sl((short) 1124);
                }
                throw new Sl((short) 1102);
            }
        }
        zl = new Zl(c3979em, continuationImpl);
        Object obj2 = zl.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zl.e;
        if (i != 0) {
        }
        if (!ref$BooleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C3979em c3979em, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        C3925cm c3925cm;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        c3979em.getClass();
        if (continuationImpl instanceof C3925cm) {
            c3925cm = (C3925cm) continuationImpl;
            int i2 = c3925cm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3925cm.d = i2 - Integer.MIN_VALUE;
                Object obj = c3925cm.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3925cm.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i3 = c3979em.d + 1;
                    c3979em.d = i3;
                    if (i3 > c3979em.a.getMaxWrapperLimit()) {
                        throw new Sl((short) 1107);
                    }
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Function1 c3951dm = new C3951dm(c3979em, null, ref$BooleanRef2, xmlPullParser);
                    c3925cm.a = ref$BooleanRef2;
                    c3925cm.d = 1;
                    if (c3979em.a(xmlPullParser, "Wrapper", c3951dm, c3925cm) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = c3925cm.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (ref$BooleanRef.element) {
                    throw new Sl((short) 1121);
                }
                return Unit.INSTANCE;
            }
        }
        c3925cm = new C3925cm(c3979em, continuationImpl);
        Object obj2 = c3925cm.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3925cm.d;
        if (i != 0) {
        }
        if (ref$BooleanRef.element) {
        }
    }

    public static final Unit d(XmlPullParser xmlPullParser, C3979em c3979em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, "CompanionClickTracking")) {
            String b = Nl.b(c3979em.v(xmlPullParser));
            if (!Nl.a(b)) {
                b = null;
            }
            Je je = b != null ? new Je(b, "click") : null;
            if (je != null) {
                c3979em.m.add(je);
            }
        } else if (Intrinsics.areEqual(name, "TrackingEvents")) {
            c3979em.m.addAll(c3979em.o(xmlPullParser));
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit e(XmlPullParser xmlPullParser, C3979em c3979em) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Companion")) {
            c3979em.q(xmlPullParser);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit h(XmlPullParser xmlPullParser, C3979em c3979em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, "TrackingEvents")) {
            c3979em.i.addAll(c3979em.o(xmlPullParser));
        } else if (Intrinsics.areEqual(name, "VideoClicks")) {
            c3979em.a(xmlPullParser, false);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public final void g(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, "InLine", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, ref$BooleanRef);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new Sl((short) 1122);
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        a(xmlPullParser, "CompanionAds", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, ref$IntRef);
            }
        });
        if (this.n.size() != 0) {
            if (this.e) {
                C4493y9 c4493y9 = this.c;
                if (c4493y9 != null) {
                    c4493y9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map a = Hk.a(this.b.a);
                a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("VastParseEvent", a, EnumC4530zk.a);
                return;
            }
            return;
        }
        if (this.e) {
            HashMap hashMap = new HashMap();
            hashMap.put("[ERRORCODE]", String.valueOf(604));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap, this.i, this.c);
            Map a2 = Hk.a(this.b.a);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            C4425vk c4425vk2 = C4425vk.a;
            C4425vk.b("VastParseEvent", a2, EnumC4530zk.a);
            return;
        }
        if (ref$IntRef.element > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[ERRORCODE]", String.valueOf(600));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap2, this.i, this.c);
            Map a3 = Hk.a(this.b.a);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            C4425vk c4425vk3 = C4425vk.a;
            C4425vk.b("VastParseEvent", a3, EnumC4530zk.a);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, "Creative", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.b(xmlPullParser, this, ref$BooleanRef);
            }
        });
        return ref$BooleanRef.element;
    }

    public final void k(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "Creatives", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, ref$BooleanRef, this, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new Sl((short) 1112);
        }
        if (!ref$BooleanRef2.element) {
            throw new Sl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "Linear", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, ref$BooleanRef, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new Sl((short) 1116);
        }
        if (!ref$BooleanRef2.element) {
            throw new Sl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "MediaFiles", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, ref$BooleanRef2, ref$BooleanRef, arrayList);
            }
        });
        if (!ref$BooleanRef2.element) {
            throw new Sl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new Sl((short) 1119);
        }
        if (ref$BooleanRef.element) {
            Map a = Hk.a(this.b.a);
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("VastParseEvent", a, EnumC4530zk.a);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 == null) {
                return -1;
            }
            c4493y9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C4493y9 c4493y92 = this.c;
            if (c4493y92 == null) {
                return -1;
            }
            c4493y92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "TrackingEvents", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, VastAttributes.VENDOR);
        if (attributeValue == null) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 != null) {
                c4493y9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, VastTagName.VERIFICATION, new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, ref$BooleanRef, this, ref$ObjectRef, ref$ObjectRef2, arrayList);
            }
        });
        if (!ref$BooleanRef.element) {
            HashMap hashMap = new HashMap();
            hashMap.put("[REASON]", String.valueOf(2));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap, arrayList, this.c);
            return;
        }
        if (!Nl.a((String) ref$ObjectRef.element)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[REASON]", String.valueOf(3));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap2, arrayList, this.c);
            return;
        }
        this.i.add(new Nf(attributeValue, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element));
        C4493y9 c4493y92 = this.c;
        if (c4493y92 != null) {
            c4493y92.a("VastParser", "OMID ADVerification URL : " + ref$ObjectRef.element);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Companion", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "CompanionAds", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creative", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creatives", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Linear", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int n = n(xmlPullParser);
        if ((n == 4 || n == 5) && (text = xmlPullParser.getText()) != null && N3.a(text)) {
            return text;
        }
        return null;
    }

    public final void f(XmlPullParser xmlPullParser) {
        String b = Nl.b(v(xmlPullParser));
        if (b.length() != 0) {
            if (!Nl.a(b)) {
                b = null;
            }
            if (b == null) {
                return;
            }
            this.i.add(new Je(b, "Impression"));
            return;
        }
        C4493y9 c4493y9 = this.c;
        if (c4493y9 != null) {
            c4493y9.b("VastParser", "Vast Tracker Error: Impression");
        }
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSIONS, new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.c(xmlPullParser, this);
            }
        });
    }

    public static final Unit f(XmlPullParser xmlPullParser, C3979em c3979em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, "Linear")) {
            c3979em.u(xmlPullParser);
        } else if (Intrinsics.areEqual(name, "CompanionAds")) {
            c3979em.r(xmlPullParser);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        a(xmlPullParser, "Companion", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this, arrayList, ref$ObjectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 != null) {
                c4493y9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.n.add(new Ll(arrayList, arrayList2, this.m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSION, new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.b(xmlPullParser, this);
            }
        });
    }

    public static final Unit g(XmlPullParser xmlPullParser, C3979em c3979em) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Creative")) {
            c3979em.s(xmlPullParser);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(XmlPullParser xmlPullParser, C3979em c3979em, Ref$BooleanRef ref$BooleanRef) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2018804923) {
                if (hashCode != 1150879268) {
                    if (hashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String v = c3979em.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        c3979em.f = v;
                    }
                } else if (name.equals("CompanionAds")) {
                    c3979em.i(xmlPullParser);
                }
            } else if (name.equals("Linear")) {
                ref$BooleanRef.element = true;
                c3979em.l(xmlPullParser);
            }
            return Unit.INSTANCE;
        }
        c3979em.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final Je b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            return null;
        }
        if (Intrinsics.areEqual(attributeValue, "progress")) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) && !new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                C4493y9 c4493y9 = this.c;
                if (c4493y9 != null) {
                    c4493y9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new W5(b, attributeValue2);
            }
        } else {
            if (AbstractC4006fm.a.contains(attributeValue)) {
                Intrinsics.checkNotNull(attributeValue);
                return new Je(b, attributeValue);
            }
            C4493y9 c4493y92 = this.c;
            if (c4493y92 != null) {
                c4493y92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.em] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList urls, ContinuationImpl continuationImpl) {
        Ul ul;
        int i;
        try {
            if (continuationImpl instanceof Ul) {
                ul = (Ul) continuationImpl;
                int i2 = ul.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ul.d = i2 - Integer.MIN_VALUE;
                    Object obj = ul.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ul.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ul.a = urls;
                        ul.d = 1;
                        urls = urls;
                        if (a(str, ul) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = ul.a;
                        ResultKt.throwOnFailure(obj);
                        urls = r13;
                    }
                    return new Pl(this.f, this.g, this.i, this.j, this.k, this.n, this.l);
                }
            }
            if (i != 0) {
            }
            return new Pl(this.f, this.g, this.i, this.j, this.k, this.n, this.l);
        } catch (Sl e) {
            short s = e.a;
            HashMap macros = MapsKt.hashMapOf(TuplesKt.to("[ERRORCODE]", String.valueOf((s == 1100 || s == 1102) ? POBVastError.NO_VAST_RESPONSE : (s == 1101 || s == 1124 || s == 1125 || s == 1103 || s == 1120 || s == 1121 || s == 1123 || s == 1122 || s == 1112 || s == 1109 || s == 1115 || s == 1116 || s == 1117) ? 101 : s == 1104 ? 100 : (s == 1105 || s == 1106) ? POBVastError.UNDEFINED_ERROR : s == 1107 ? 302 : (s == 1108 || s == 1114) ? 300 : s == 1111 ? 201 : s == 1113 ? 301 : s == 1118 ? 401 : s == 1119 ? 403 : 0)), TuplesKt.to("[ADSERVINGID]", this.g), TuplesKt.to("[UNIVERSALADID]", this.f));
            short s2 = e.a;
            if (s2 != 1102 && s2 != 1124) {
                Ml.a(macros, this.i, this.c);
            } else {
                Ml.a(macros, CollectionsKt.plus((Collection) this.h, (Iterable) this.i), this.c);
            }
            C4493y9 c4493y9 = this.c;
            Intrinsics.checkNotNullParameter(macros, "macros");
            Intrinsics.checkNotNullParameter(urls, "urls");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(urls, 10));
            for (String str2 : urls) {
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String str3 = str2;
                for (Map.Entry entry : macros.entrySet()) {
                    str3 = StringsKt.replace$default(str3, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                }
                arrayList.add(str3);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String url = (String) it.next();
                E3 e3 = E3.a;
                Rg priority = Rg.b;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(priority, "priority");
                Ug.a(priority, new C4408v3(url, c4493y9, null));
            }
            throw e;
        }
        ul = new Ul(this, continuationImpl);
        Object obj2 = ul.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ul.d;
    }

    public static final Unit b(XmlPullParser xmlPullParser, C3979em c3979em) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "AdVerifications")) {
            c3979em.c(xmlPullParser);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, this);
            }
        });
    }

    public static final Unit c(XmlPullParser xmlPullParser, C3979em c3979em) {
        String str;
        if (Intrinsics.areEqual(xmlPullParser.getName(), VastTagName.EXTENSION)) {
            try {
                str = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                str = "";
            }
            if (Intrinsics.areEqual(str, "AdVerifications")) {
                c3979em.d(xmlPullParser);
            }
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C3899bm c3899bm;
        int i;
        try {
            if (continuationImpl instanceof C3899bm) {
                c3899bm = (C3899bm) continuationImpl;
                int i2 = c3899bm.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3899bm.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3899bm.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3899bm.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (TextUtils.isEmpty(str)) {
                            C4493y9 c4493y9 = this.c;
                            if (c4493y9 != null) {
                                c4493y9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                            }
                            throw new Sl((short) 1100);
                        }
                        try {
                            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                            F5.a.getClass();
                            if (!F5.s()) {
                                newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                            }
                            XmlPullParser newPullParser = newInstance.newPullParser();
                            newPullParser.setInput(new StringReader(str));
                            Intrinsics.checkNotNullExpressionValue(newPullParser, "apply(...)");
                            c3899bm.c = 1;
                            if (a(newPullParser, c3899bm) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (XmlPullParserException unused) {
                            C4493y9 c4493y92 = this.c;
                            if (c4493y92 != null) {
                                c4493y92.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                            }
                            throw new Sl((short) 1104);
                        } catch (Exception unused2) {
                            C4493y9 c4493y93 = this.c;
                            if (c4493y93 != null) {
                                c4493y93.b("VastParser", "VAST Schema validation error: (Exception)");
                            }
                            throw new Sl((short) 1105);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Sl e) {
            C4493y9 c4493y94 = this.c;
            if (c4493y94 != null) {
                c4493y94.b("VastParser", "VAST Schema validation error: " + ((int) e.a));
            }
            throw e;
        } catch (Exception e2) {
            C4493y9 c4493y95 = this.c;
            if (c4493y95 != null) {
                String arrays = Arrays.toString(e2.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                c4493y95.b("VastParser", "VAST Schema validation error: (Exception) " + arrays);
            }
            throw new Sl((short) 1106);
        }
        c3899bm = new C3899bm(this, continuationImpl);
        Object obj2 = c3899bm.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3899bm.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Xl xl;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        if (continuationImpl instanceof Xl) {
            xl = (Xl) continuationImpl;
            int i2 = xl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xl.d = i2 - Integer.MIN_VALUE;
                Object obj = xl.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = xl.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Function1 yl = new Yl(this, null, ref$BooleanRef2, xmlPullParser);
                    xl.a = ref$BooleanRef2;
                    xl.d = 1;
                    if (a(xmlPullParser, VastTagName.VAST, yl, xl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = xl.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!ref$BooleanRef.element) {
                    return Unit.INSTANCE;
                }
                throw new Sl((short) 1103);
            }
        }
        xl = new Xl(this, continuationImpl);
        Object obj2 = xl.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = xl.d;
        if (i != 0) {
        }
        if (!ref$BooleanRef.element) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, Ref$BooleanRef ref$BooleanRef) {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2077435339:
                    if (name.equals("AdVerifications")) {
                        c3979em.c(xmlPullParser);
                        break;
                    }
                    break;
                case -1692490108:
                    if (name.equals("Creatives")) {
                        ref$BooleanRef.element = true;
                        c3979em.k(xmlPullParser);
                        break;
                    }
                    break;
                case -1499090620:
                    if (name.equals("AdServingId")) {
                        String v = c3979em.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        c3979em.g = v;
                        break;
                    }
                    break;
                case 67232232:
                    if (name.equals("Error")) {
                        Je a = c3979em.a("error", xmlPullParser);
                        if (a != null) {
                            c3979em.i.add(a);
                            break;
                        }
                    }
                    break;
                case 184043572:
                    if (name.equals(VastTagName.EXTENSIONS)) {
                        c3979em.e(xmlPullParser);
                        break;
                    }
                    break;
                case 2114088489:
                    if (name.equals("Impression")) {
                        c3979em.f(xmlPullParser);
                        break;
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
        c3979em.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, C3979em c3979em, Ref$BooleanRef ref$BooleanRef2) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Creative")) {
            ref$BooleanRef.element = true;
            if (c3979em.j(xmlPullParser)) {
                ref$BooleanRef2.element = true;
            }
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2049897434) {
                if (hashCode != -1927368268) {
                    if (hashCode != -385055469) {
                        if (hashCode == 611554000 && name.equals("TrackingEvents")) {
                            c3979em.i.addAll(c3979em.o(xmlPullParser));
                        }
                    } else if (name.equals("MediaFiles")) {
                        ref$BooleanRef2.element = true;
                        c3979em.l.addAll(c3979em.m(xmlPullParser));
                    }
                } else if (name.equals("Duration")) {
                    c3979em.k = c3979em.a(xmlPullParser);
                    ref$BooleanRef.element = true;
                }
            } else if (name.equals("VideoClicks")) {
                c3979em.a(xmlPullParser, true);
            }
            return Unit.INSTANCE;
        }
        c3979em.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final String a(XmlPullParser xmlPullParser) {
        String v = v(xmlPullParser);
        if (v != null) {
            if (TextUtils.isEmpty(v) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(v)) {
                return v;
            }
        }
        C4493y9 c4493y9 = this.c;
        if (c4493y9 != null) {
            c4493y9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new Sl((short) 1115);
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, Ref$IntRef ref$IntRef) {
        int i;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), "Companion")) {
            c3979em.getClass();
            w(xmlPullParser);
            return Unit.INSTANCE;
        }
        ref$IntRef.element++;
        int i2 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C4493y9 c4493y9 = c3979em.c;
            if (c4493y9 != null) {
                c4493y9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue2, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C4493y9 c4493y92 = c3979em.c;
            if (c4493y92 != null) {
                c4493y92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i > 0 && i2 > 0) {
            c3979em.h(xmlPullParser);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, List list, Ref$ObjectRef ref$ObjectRef, List list2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -348198615) {
                if (hashCode != 611554000) {
                    if (hashCode != 676623548) {
                        if (hashCode == 1877773523 && name.equals("CompanionClickTracking")) {
                            String b = Nl.b(c3979em.v(xmlPullParser));
                            if (!Nl.a(b)) {
                                b = null;
                            }
                            Je je = b != null ? new Je(b, "click") : null;
                            if (je != null) {
                                list2.add(je);
                            }
                        }
                    } else if (name.equals("StaticResource")) {
                        c3979em.a(xmlPullParser, list);
                    }
                } else if (name.equals("TrackingEvents")) {
                    list2.addAll(c3979em.o(xmlPullParser));
                }
            } else if (name.equals("CompanionClickThrough")) {
                ?? b2 = Nl.b(c3979em.v(xmlPullParser));
                if (Nl.a(b2)) {
                    ref$ObjectRef.element = b2;
                } else {
                    C4493y9 c4493y9 = c3979em.c;
                    if (c4493y9 != null) {
                        c4493y9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            }
            return Unit.INSTANCE;
        }
        c3979em.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 != null) {
                c4493y9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || StringsKt.isBlank(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), attributeValue, true)) {
                    list.add(new Qi(b));
                    return;
                }
            }
        }
        C4493y9 c4493y92 = this.c;
        if (c4493y92 != null) {
            c4493y92.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.e = true;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, List list) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Tracking")) {
            Je b = c3979em.b(xmlPullParser);
            if (b != null) {
                list.add(b);
            }
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z) {
        a(xmlPullParser, "VideoClicks", new Function0() { // from class: com.inmobi.media.em$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3979em.a(xmlPullParser, z, this);
            }
        });
    }

    public static final Unit a(XmlPullParser xmlPullParser, boolean z, C3979em c3979em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, "ClickThrough")) {
            if (z) {
                String b = Nl.b(c3979em.v(xmlPullParser));
                if (Nl.a(b)) {
                    c3979em.j = b;
                }
            }
        } else if (Intrinsics.areEqual(name, "ClickTracking")) {
            Je a = c3979em.a("click", xmlPullParser);
            if (a != null) {
                c3979em.i.add(a);
            }
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final boolean a(int i, int i2, String str, String str2, int i3) {
        if (Nl.a(str) && i > 0 && i2 > 0) {
            if (this.a.getBitRate().getBitrate_mandatory() && i3 <= 0) {
                C4493y9 c4493y9 = this.c;
                if (c4493y9 != null) {
                    c4493y9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i3);
                }
                return false;
            }
            if (StringsKt.equals(str2, "Progressive", true)) {
                return true;
            }
            C4493y9 c4493y92 = this.c;
            if (c4493y92 != null) {
                c4493y92.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        C4493y9 c4493y93 = this.c;
        if (c4493y93 != null) {
            c4493y93.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + " " + i + ", " + i2);
        }
        return false;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, List list) {
        int i;
        int i2;
        int i3;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), "MediaFile")) {
            c3979em.getClass();
            w(xmlPullParser);
            return Unit.INSTANCE;
        }
        ref$BooleanRef.element = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C4493y9 c4493y9 = c3979em.c;
            if (c4493y9 != null) {
                c4493y9.b("VastParser", "Invalid Value for BitRate.");
            }
            i = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue4, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C4493y9 c4493y92 = c3979em.c;
            if (c4493y92 != null) {
                c4493y92.b("VastParser", "Invalid Value for Media Width.");
            }
            i2 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue5, "getAttributeValue(...)");
            i3 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C4493y9 c4493y93 = c3979em.c;
            if (c4493y93 != null) {
                c4493y93.b("VastParser", "Invalid Value for Media Height.");
            }
            i3 = 0;
        }
        String b = Nl.b(c3979em.v(xmlPullParser));
        if (!c3979em.a(i2, i3, b, attributeValue, i)) {
            return Unit.INSTANCE;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = c3979em.a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (StringsKt.equals((String) it.next(), attributeValue2, true)) {
                        Intrinsics.checkNotNull(attributeValue);
                        Intrinsics.checkNotNull(attributeValue2);
                        list.add(new Ol(i2, i3, b, attributeValue, attributeValue2, i));
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        C4493y9 c4493y94 = c3979em.c;
        if (c4493y94 != null) {
            c4493y94.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (N3.a(attributeValue2)) {
            ref$BooleanRef2.element = true;
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3979em c3979em) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), VastTagName.VERIFICATION)) {
            c3979em.p(xmlPullParser);
        } else {
            c3979em.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, C3979em c3979em, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != 611554000) {
                if (hashCode != 1561251035) {
                    if (hashCode == 1749252741 && name.equals(VastTagName.VERIFICATION_PARAMETERS)) {
                        ref$ObjectRef2.element = Nl.b(c3979em.v(xmlPullParser));
                    }
                } else if (name.equals(VastTagName.JAVA_SCRIPT_RESOURCE)) {
                    if (ref$BooleanRef.element) {
                        c3979em.getClass();
                        w(xmlPullParser);
                        return Unit.INSTANCE;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
                    if (attributeValue != null && StringsKt.startsWith$default(attributeValue, CampaignEx.KEY_OMID, false, 2, (Object) null)) {
                        ref$BooleanRef.element = true;
                        ref$ObjectRef.element = Nl.b(c3979em.v(xmlPullParser));
                    }
                }
            } else if (name.equals("TrackingEvents")) {
                list.addAll(c3979em.o(xmlPullParser));
            }
            return Unit.INSTANCE;
        }
        c3979em.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final Je a(String str, XmlPullParser xmlPullParser) {
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 == null) {
                return null;
            }
            c4493y9.b("VastParser", "Vast Tracker Error: " + str + " " + b);
            return null;
        }
        return new Je(b, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.mo4828invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, String str, Function1 function1, ContinuationImpl continuationImpl) {
        Tl tl;
        int i;
        if (continuationImpl instanceof Tl) {
            tl = (Tl) continuationImpl;
            int i2 = tl.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tl.f = i2 - Integer.MIN_VALUE;
                Object obj = tl.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tl.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function1 function12 = tl.c;
                str = tl.b;
                XmlPullParser xmlPullParser2 = tl.a;
                ResultKt.throwOnFailure(obj);
                function1 = function12;
                xmlPullParser = xmlPullParser2;
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getName() != null && Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3)) {
                    return Unit.INSTANCE;
                }
                if (xmlPullParser.getEventType() == 2) {
                    tl.a = xmlPullParser;
                    tl.b = str;
                    tl.c = function1;
                    tl.f = 1;
                    if (function1.invoke(tl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1) {
                    if (xmlPullParser.getEventType() == 2) {
                    }
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        tl = new Tl(this, continuationImpl);
        Object obj2 = tl.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tl.f;
        if (i != 0) {
        }
    }
}
