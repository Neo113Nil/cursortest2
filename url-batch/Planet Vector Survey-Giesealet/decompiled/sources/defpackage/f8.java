package defpackage;

import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.SectorMission;
import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.ArrayDeckScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import java.util.Collection;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements bu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f8(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e0, code lost:
    
        r7 = new defpackage.oa0(r5, java.lang.Integer.valueOf(r8));
     */
    @Override // defpackage.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ky0 ArrayDeckScreen$lambda$6$lambda$5$lambda$4$lambda$3;
        oa0 oa0Var;
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34;
        ky0 SectorsScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ArrayDeckScreen$lambda$6$lambda$5$lambda$4$lambda$3 = ArrayDeckScreenKt.ArrayDeckScreen$lambda$6$lambda$5$lambda$4$lambda$3((RelayViewModel) obj2, (ArrayModule) obj);
                return ArrayDeckScreen$lambda$6$lambda$5$lambda$4$lambda$3;
            case 1:
                qh qhVar = ((yh) obj2).d;
                jr0 jr0Var = qhVar.c;
                boolean z = qhVar.B;
                Collection collection = wp.d;
                if (!z) {
                    return collection;
                }
                ir0 c = jr0Var.c();
                int i2 = 0;
                while (true) {
                    try {
                        oa0Var = null;
                        if (i2 >= jr0Var.e) {
                            break;
                        } else {
                            if (c.l(i2)) {
                                Object n = c.n(i2);
                                if (n != obj) {
                                    dk0 dk0Var = n instanceof dk0 ? (dk0) n : null;
                                    if ((dk0Var != null ? dk0Var.a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = c.b;
                            int i3 = i2 + 1;
                            int b = (i3 < c.c ? iArr[(i3 * 5) + 4] : c.e) - lr0.b(iArr, i2);
                            int i4 = 0;
                            while (i4 < b) {
                                Object h = c.h(i2, i4);
                                if (h == obj) {
                                    break;
                                } else {
                                    dk0 dk0Var2 = h instanceof dk0 ? (dk0) h : null;
                                    if ((dk0Var2 != null ? dk0Var2.a : null) == obj) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            i2 = i3;
                        }
                    } finally {
                    }
                }
                oa0 oa0Var2 = new oa0(i2, null);
                c.c();
                oa0Var = oa0Var2;
                if (oa0Var == null) {
                    return collection;
                }
                int i5 = oa0Var.a;
                Integer num = oa0Var.b;
                if (qhVar.B) {
                    try {
                        collection = d31.J(jr0Var.c(), i5, num);
                    } finally {
                    }
                }
                return zd.l0(collection, qhVar.D());
            case 2:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34((RelayViewModel) obj2, (s80) obj);
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34;
            case 3:
                ((ug) obj2).d = (qu) obj;
                return ky0Var;
            case 4:
                b70 b70Var = (b70) obj2;
                bi biVar = (bi) obj;
                Object[] objArr = b70Var.b;
                long[] jArr = b70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    biVar.v(objArr[(i6 << 3) + i8]);
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return ky0Var;
            default:
                SectorsScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3 = SectorsScreenKt.SectorsScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3((mu) obj2, (SectorMission) obj);
                return SectorsScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3;
        }
    }
}
