package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$style;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final class ya1 extends SuspendLambda implements Function2 {
    public x70 b;
    public Object c;
    public int d;
    public final /* synthetic */ za1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(za1 za1Var, Continuation continuation) {
        super(2, continuation);
        this.e = za1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ya1(this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ya1(this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0416 A[LOOP:3: B:70:0x0410->B:72:0x0416, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0232  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x70 x70Var;
        Object a;
        x70 x70Var2;
        Object a2;
        List a3;
        Object a4;
        la laVar;
        Object a5;
        c80 c80Var;
        Object value;
        List list;
        List createListBuilder;
        ia0 ia0Var;
        int ordinal;
        k90 k90Var;
        b40 b40Var;
        String str;
        String str2;
        String str3;
        i50 i50Var;
        Iterator it;
        k40 k40Var;
        List build;
        h50 h50Var;
        Object value2;
        Object value3;
        g50 g50Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            x70Var = ((ca0) this.e.m.getValue()).b;
            if (((ca0) this.e.m.getValue()).d.isEmpty()) {
                za1 za1Var = this.e;
                ca0 a6 = ca0.a((ca0) za1Var.m.getValue(), null, null, true, null, 11);
                MutableStateFlow mutableStateFlow = za1Var.m;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, a6));
            }
            if (x70Var instanceof v70) {
                za1 za1Var2 = this.e;
                c80 c80Var2 = za1Var2.h;
                jy0 jy0Var = za1Var2.d;
                this.b = x70Var;
                this.c = c80Var2;
                this.d = 1;
                a5 = jy0Var.a(this);
                if (a5 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c80Var = c80Var2;
                a80 a80Var = (a80) a5;
                c80Var.getClass();
                createListBuilder = CollectionsKt.createListBuilder();
                r50 r50Var = a80Var.b;
                ia0Var = ia0.a;
                createListBuilder.add(ia0Var);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_application_info)));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_app_id), r50Var.a));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_app_version), r50Var.b));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_system), r50Var.c));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_api_level), r50Var.d));
                h90 h90Var = a80Var.c;
                createListBuilder.add(ia0Var);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_sdk_integration)));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_ads_sdk_version), h90Var.a));
                ordinal = h90Var.b.a.ordinal();
                if (ordinal != 0) {
                }
                j90 j90Var = h90Var.b;
                if (j90Var.a != i90.b) {
                }
                List list2 = j90Var.b;
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_sdk_integration_status), k90Var, list2 == null ? new v50(r8, CollectionsKt.joinToString$default(list2, "\n", null, null, 0, null, null, 62, null)) : null));
                b40Var = a80Var.d;
                if (b40Var.a == null) {
                }
                createListBuilder.add(ia0Var);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_advertisement_network_settings)));
                str = b40Var.a;
                if (str != null) {
                }
                str2 = b40Var.b;
                if (str2 != null) {
                }
                str3 = b40Var.c;
                if (str3 != null) {
                }
                createListBuilder.add(fa0.a);
                i50Var = a80Var.e;
                if (!i50Var.a.isEmpty()) {
                }
                y50 y50Var = a80Var.f;
                ia0 ia0Var2 = ia0.a;
                createListBuilder.add(ia0Var2);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_user_privacy)));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_age_restricted_user), c80Var.a(y50Var.b)));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_has_location_consent), c80Var.a(Boolean.valueOf(y50Var.a))));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_has_user_consent), c80Var.a(y50Var.c)));
                createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_tcf_consent), !y50Var.d ? new k90(c80Var.a.getString(R$string.debug_panel_provided), 0, null, 0, 14) : new k90(c80Var.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14)));
                z70 z70Var = a80Var.g;
                createListBuilder.add(ia0Var2);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_features)));
                ma0 ma0Var = ma0.b;
                createListBuilder.add(new na0(z70Var.a));
                a3 = CollectionsKt.build(createListBuilder);
                list = a3;
            } else if (x70Var instanceof u70) {
                za1 za1Var3 = this.e;
                la laVar2 = za1Var3.i;
                hy0 hy0Var = za1Var3.e;
                this.b = x70Var;
                this.c = laVar2;
                this.d = 2;
                a4 = hy0Var.a(this);
                if (a4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                laVar = laVar2;
                laVar.getClass();
                ArrayList arrayList = ((a50) a4).a;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                list = arrayList2;
            } else if (x70Var instanceof t70) {
                fa faVar = this.e.k;
                la0 la0Var = ((t70) x70Var).b;
                faVar.getClass();
                a3 = fa.a(la0Var);
                list = a3;
            } else if (x70Var instanceof s70) {
                fy0 fy0Var = this.e.f;
                String str4 = ((s70) x70Var).b;
                this.b = x70Var;
                this.d = 3;
                a2 = fy0Var.a(str4, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x70Var2 = x70Var;
                k40Var = (k40) a2;
                if (k40Var != null) {
                }
                x70Var = x70Var2;
                list = null;
            } else {
                if (!(x70Var instanceof w70)) {
                    throw new NoWhenBranchMatchedException();
                }
                my0 my0Var = this.e.g;
                String str5 = ((w70) x70Var).b;
                this.b = x70Var;
                this.d = 4;
                a = my0Var.a(str5, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x70Var2 = x70Var;
                g50Var = (g50) a;
                if (g50Var != null) {
                }
                x70Var = x70Var2;
                list = null;
            }
        } else if (i == 1) {
            c80Var = (c80) this.c;
            x70Var = this.b;
            ResultKt.throwOnFailure(obj);
            a5 = obj;
            a80 a80Var2 = (a80) a5;
            c80Var.getClass();
            createListBuilder = CollectionsKt.createListBuilder();
            r50 r50Var2 = a80Var2.b;
            ia0Var = ia0.a;
            createListBuilder.add(ia0Var);
            createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_application_info)));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_app_id), r50Var2.a));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_app_version), r50Var2.b));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_system), r50Var2.c));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_api_level), r50Var2.d));
            h90 h90Var2 = a80Var2.c;
            createListBuilder.add(ia0Var);
            createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_sdk_integration)));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_ads_sdk_version), h90Var2.a));
            ordinal = h90Var2.b.a.ordinal();
            if (ordinal != 0) {
                k90Var = new k90(c80Var.a.getString(R$string.debug_panel_integrated), R$attr.debug_panel_color_green, Integer.valueOf(R$drawable.debug_panel_icon_success), 0, 8);
            } else if (ordinal == 1) {
                k90Var = new k90(c80Var.a.getString(R$string.debug_panel_integrated), R$attr.debug_panel_color_red, Integer.valueOf(R$drawable.debug_panel_icon_error), 0, 8);
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                k90Var = new k90(c80Var.a.getString(R$string.debug_panel_integration_errors), R$attr.debug_panel_color_red, Integer.valueOf(R$drawable.debug_panel_icon_error), 0, 8);
            }
            j90 j90Var2 = h90Var2.b;
            int i2 = j90Var2.a != i90.b ? R$attr.debug_panel_label_primary : k90Var.b;
            List list22 = j90Var2.b;
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_sdk_integration_status), k90Var, list22 == null ? new v50(i2, CollectionsKt.joinToString$default(list22, "\n", null, null, 0, null, null, 62, null)) : null));
            b40Var = a80Var2.d;
            if (b40Var.a == null || b40Var.c != null || b40Var.b != null) {
                createListBuilder.add(ia0Var);
                createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_advertisement_network_settings)));
                str = b40Var.a;
                if (str != null) {
                    createListBuilder.add(new ka0("Page ID", str));
                }
                str2 = b40Var.b;
                if (str2 != null) {
                    createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_app_review_status), str2));
                }
                str3 = b40Var.c;
                if (str3 != null) {
                    createListBuilder.add(new ka0("app-ads.txt", str3));
                }
                createListBuilder.add(fa0.a);
            }
            i50Var = a80Var2.e;
            if (!i50Var.a.isEmpty()) {
                createListBuilder.add(ia0Var);
                List sortedWith = CollectionsKt.sortedWith(i50Var.a, new b80());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : sortedWith) {
                    if (((g50) obj2).g instanceof c50) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : sortedWith) {
                    if (((g50) obj3).g instanceof d50) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : sortedWith) {
                    if (((g50) obj4).g instanceof e50) {
                        arrayList5.add(obj4);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_completed_integration)));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        c80Var.a(createListBuilder, (g50) it2.next());
                    }
                }
                if (!arrayList4.isEmpty()) {
                    createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_invalid_integration)));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        c80Var.a(createListBuilder, (g50) it3.next());
                    }
                }
                if (!arrayList5.isEmpty()) {
                    createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_missing_integration)));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        c80Var.a(createListBuilder, (g50) it4.next());
                    }
                }
            }
            y50 y50Var2 = a80Var2.f;
            ia0 ia0Var22 = ia0.a;
            createListBuilder.add(ia0Var22);
            createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_user_privacy)));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_age_restricted_user), c80Var.a(y50Var2.b)));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_has_location_consent), c80Var.a(Boolean.valueOf(y50Var2.a))));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_has_user_consent), c80Var.a(y50Var2.c)));
            createListBuilder.add(new ka0(c80Var.a.getString(R$string.debug_panel_tcf_consent), !y50Var2.d ? new k90(c80Var.a.getString(R$string.debug_panel_provided), 0, null, 0, 14) : new k90(c80Var.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14)));
            z70 z70Var2 = a80Var2.g;
            createListBuilder.add(ia0Var22);
            createListBuilder.add(new ja0(c80Var.a.getString(R$string.debug_panel_features)));
            ma0 ma0Var2 = ma0.b;
            createListBuilder.add(new na0(z70Var2.a));
            a3 = CollectionsKt.build(createListBuilder);
            list = a3;
        } else if (i == 2) {
            laVar = (la) this.c;
            x70Var = this.b;
            ResultKt.throwOnFailure(obj);
            a4 = obj;
            laVar.getClass();
            ArrayList arrayList6 = ((a50) a4).a;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            it = arrayList6.iterator();
            while (it.hasNext()) {
                j40 j40Var = (j40) it.next();
                arrayList22.add(new ea0(j40Var.a, j40Var.b, j40Var.c));
            }
            list = arrayList22;
        } else if (i == 3) {
            x70Var2 = this.b;
            ResultKt.throwOnFailure(obj);
            a2 = obj;
            k40Var = (k40) a2;
            if (k40Var != null) {
                this.e.j.getClass();
                List createListBuilder2 = CollectionsKt.createListBuilder();
                createListBuilder2.add(ia0.a);
                createListBuilder2.add(new ja0(k40Var.a));
                createListBuilder2.add(new ka0("Format", k40Var.b));
                createListBuilder2.add(new ka0("ID", k40Var.c));
                for (t40 t40Var : k40Var.d.a) {
                    s40 s40Var = t40Var.f;
                    if (s40Var instanceof q40) {
                        h50Var = h50.c;
                    } else {
                        if (!(s40Var instanceof r40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h50Var = h50.d;
                    }
                    r40 r40Var = s40Var instanceof r40 ? (r40) s40Var : null;
                    createListBuilder2.add(new la0(t40Var.b, t40Var.a, new k90("Mediation", R$attr.debug_panel_label_secondary, null, R$style.DebugPanelText_Body2, 4), new v50(R$attr.debug_panel_label_primary, R$style.DebugPanelText_Body1, h50Var.b), null, t40Var.d, t40Var.e, t40Var.c, r40Var != null ? r40Var.b : null, h50Var, null, 1024));
                }
                build = CollectionsKt.build(createListBuilder2);
                list = build;
                x70Var = x70Var2;
            }
            x70Var = x70Var2;
            list = null;
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x70Var2 = this.b;
            ResultKt.throwOnFailure(obj);
            a = obj;
            g50Var = (g50) a;
            if (g50Var != null) {
                this.e.l.getClass();
                List createListBuilder3 = CollectionsKt.createListBuilder();
                createListBuilder3.add(ia0.a);
                createListBuilder3.add(new ja0("Integration"));
                String str6 = g50Var.d;
                if (str6 != null) {
                    createListBuilder3.add(new ka0("Adapter Version", str6));
                }
                String str7 = g50Var.e;
                if (str7 != null) {
                    createListBuilder3.add(new ka0("Latest Adapter Version", str7));
                }
                ga0 ga0Var = ga0.b;
                createListBuilder3.add(new ha0());
                build = CollectionsKt.build(createListBuilder3);
                list = build;
                x70Var = x70Var2;
            }
            x70Var = x70Var2;
            list = null;
        }
        if (list == null) {
            za1 za1Var4 = this.e;
            ca0 ca0Var = ((ca0) za1Var4.m.getValue()).a;
            if (ca0Var == null) {
                BuildersKt__Builders_commonKt.launch$default(za1Var4.a, null, null, new va1(za1Var4, u90.a, null), 3, null);
            } else {
                ca0 a7 = ca0.a(ca0Var, null, null, false, null, 11);
                MutableStateFlow mutableStateFlow2 = za1Var4.m;
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value3, a7));
            }
        } else if (Intrinsics.areEqual(x70Var, ((ca0) this.e.m.getValue()).b)) {
            ca0 a8 = ca0.a((ca0) this.e.m.getValue(), null, null, false, list, 3);
            MutableStateFlow mutableStateFlow3 = this.e.m;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, a8));
        }
        return Unit.INSTANCE;
    }
}
