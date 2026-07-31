package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes13.dex */
public final class Sh {
    public final F9 a;
    public final String b;
    public final C4435w4 c;

    public Sh(F9 configClient) {
        Intrinsics.checkNotNullParameter(configClient, "configClient");
        this.a = configClient;
        this.b = Sh.class.getSimpleName();
        this.c = new C4435w4();
    }

    public static final boolean a(Set set, C4382u4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AbstractC4461x4 a(C4409v4 c4409v4, C4382u4 c4382u4) {
        C4143l2 c4143l2;
        String configType = c4382u4.b.getType();
        Intrinsics.checkNotNullParameter(c4409v4, "<this>");
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    c4143l2 = c4409v4.b();
                    break;
                }
                c4143l2 = null;
                break;
            case 96432:
                if (configType.equals("ads")) {
                    c4143l2 = c4409v4.a();
                    break;
                }
                c4143l2 = null;
                break;
            case 3506402:
                if (configType.equals("root")) {
                    c4143l2 = c4409v4.c();
                    break;
                }
                c4143l2 = null;
                break;
            case 780346297:
                if (configType.equals(TelemetryCategory.TELEMETRY)) {
                    c4143l2 = c4409v4.e();
                    break;
                }
                c4143l2 = null;
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    c4143l2 = c4409v4.d();
                    break;
                }
                c4143l2 = null;
                break;
            default:
                c4143l2 = null;
                break;
        }
        if (c4143l2 == null) {
            return new C4093j4(5, c4382u4.b.getLastUpdateTimeStamp(), c4382u4.b.getType());
        }
        Il a = this.c.a(c4143l2, c4382u4);
        int i = a.a;
        if (i == 200) {
            Config config = a.b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            String tag = this.b;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4382u4.b.getType();
            return new C4488y4(200, config);
        }
        if (i != 304) {
            return new C4093j4(a.a, c4382u4.b.getLastUpdateTimeStamp(), c4382u4.b.getType());
        }
        Config config2 = a.b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        String tag2 = this.b;
        Intrinsics.checkNotNullExpressionValue(tag2, "tag");
        c4382u4.b.getType();
        return new C4488y4(304, config2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:116:0x04ba
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ed A[LOOP:4: B:78:0x03e7->B:80:0x03ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0376  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x049e -> B:13:0x04a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String r26, java.lang.String r27, com.inmobi.media.core.config.models.RootConfig r28, java.util.List r29, kotlinx.coroutines.channels.ProducerScope r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Sh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC3892bf interfaceC3892bf, List list, ContinuationImpl continuationImpl) {
        Rh rh;
        int i;
        ArrayList arrayList;
        C4409v4 c4409v4;
        if (continuationImpl instanceof Rh) {
            rh = (Rh) continuationImpl;
            int i2 = rh.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rh.e = i2 - Integer.MIN_VALUE;
                Object obj = rh.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rh.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        rh.a = list;
                        rh.b = arrayList2;
                        rh.e = 1;
                        Object a = interfaceC3892bf.a();
                        if (a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = a;
                        arrayList = arrayList2;
                    } catch (ClassCastException unused) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused2) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = rh.b;
                    list = rh.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (ClassCastException unused3) {
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused4) {
                        a(list, 2);
                        return arrayList;
                    }
                }
                c4409v4 = (C4409v4) obj;
                if (c4409v4 == null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c4409v4, (C4382u4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            }
        }
        rh = new Rh(this, continuationImpl);
        Object obj2 = rh.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rh.e;
        if (i != 0) {
        }
        c4409v4 = (C4409v4) obj2;
        if (c4409v4 == null) {
        }
    }

    public static void a(int i, List list, List list2) {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), TuplesKt.to("name", list), TuplesKt.to("lts", list2), TuplesKt.to("networkType", F5.o()));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("InvalidConfig", mutableMapOf, EnumC4530zk.a);
    }

    public static void a(List list, int i) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4382u4) it.next()).b.getType());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C4382u4) it2.next()).b.getLastUpdateTimeStamp()));
        }
        a(i, arrayList, arrayList2);
    }
}
