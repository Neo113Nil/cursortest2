package yads;

import android.graphics.Point;
import android.view.View;
import com.yandex.mobile.ads.R$id;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.sequences.SequencesKt;

/* loaded from: classes3.dex */
public final class ou {
    public final ii a;
    public final r73 b;
    public final zl c;

    public ou() {
        ii iiVar = new ii();
        r73 r73Var = new r73();
        zl zlVar = new zl();
        this.a = iiVar;
        this.b = r73Var;
        this.c = zlVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:13|(1:94)|17|(1:93)|21|(3:23|(1:25)|(21:27|(1:29)|30|31|32|33|(1:35)|36|(8:70|71|(1:77)|78|79|(1:81)|82|(12:84|(1:40)|41|42|43|44|(1:46)|47|(7:53|54|(1:56)|57|58|(1:60)|61)|49|(1:51)|52))|38|(0)|41|42|43|44|(0)|47|(0)|49|(0)|52))|92|(0)|30|31|32|33|(0)|36|(0)|38|(0)|41|42|43|44|(0)|47|(0)|49|(0)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0191, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0152, code lost:
    
        r4 = kotlin.Result.INSTANCE;
        r1 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00de, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00df, code lost:
    
        r4 = kotlin.Result.INSTANCE;
        r1 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[EDGE_INSN: B:11:0x004d->B:12:0x004d BREAK  A[LOOP:0: B:2:0x000f->B:97:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[LOOP:0: B:2:0x000f->B:97:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(View view, Long l) {
        String str;
        Pair pair;
        String str2;
        String str3;
        Unit unit;
        Object m8023constructorimpl;
        View view2;
        Object m8023constructorimpl2;
        String str4;
        Object m8023constructorimpl3;
        View view3;
        Object m8023constructorimpl4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = SequencesKt.generateSequence(view, nu.b).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            View view4 = (View) it.next();
            if (view4 instanceof bj2) {
                this.b.getClass();
                q73 q73Var = ((bj2) view4).a;
                if (q73Var != null) {
                    pair = TuplesKt.to(view4, q73Var);
                    if (pair == null) {
                        break;
                    }
                }
                pair = null;
                if (pair == null) {
                }
            } else {
                if (view4 instanceof dj2) {
                    this.c.getClass();
                    q73 a = ((dj2) view4).a();
                    if (a != null) {
                        pair = TuplesKt.to(view4, a);
                        if (pair == null) {
                        }
                    }
                }
                pair = null;
                if (pair == null) {
                }
            }
        }
        if (pair != null) {
            View view5 = (View) pair.component1();
            Point point = ((q73) pair.component2()).a;
            if (point == null || (str2 = Integer.valueOf(point.x).toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("{CLICK_X}", str2);
            if (point == null || (str3 = Integer.valueOf(point.y).toString()) == null) {
                str3 = "";
            }
            linkedHashMap.put("{CLICK_Y}", str3);
            linkedHashMap.put("{WIDTH}", String.valueOf(view5.getWidth()));
            linkedHashMap.put("{HEIGHT}", String.valueOf(view5.getHeight()));
            if (l != null) {
                if (l.longValue() < 0) {
                    l = null;
                }
                if (l != null) {
                    linkedHashMap.put("{CLICK_TIME}", String.valueOf(l.longValue()));
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                        linkedHashMap.put("{CLICK_TIME}", "");
                    }
                    ii iiVar = this.a;
                    iiVar.getClass();
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(view5.findViewById(R$id.close));
                    if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                        m8023constructorimpl = null;
                    }
                    view2 = (View) m8023constructorimpl;
                    if (view2 == null) {
                        try {
                            View findViewWithTag = view5.findViewWithTag("close");
                            if (findViewWithTag == null && (findViewWithTag = view5.findViewWithTag("skip_button")) == null && (findViewWithTag = view5.findViewWithTag("instream_skip")) == null) {
                                findViewWithTag = view5.findViewWithTag("yma_close_button");
                            }
                            m8023constructorimpl2 = Result.m8023constructorimpl(findViewWithTag);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
                            m8023constructorimpl2 = null;
                        }
                        view2 = (View) m8023constructorimpl2;
                        if (view2 == null) {
                            str4 = null;
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put("{CLOSE_LOCATION}", str4);
                            ii iiVar2 = this.a;
                            iiVar2.getClass();
                            m8023constructorimpl3 = Result.m8023constructorimpl(view5.findViewById(R$id.feedback));
                            if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                                m8023constructorimpl3 = null;
                            }
                            view3 = (View) m8023constructorimpl3;
                            if (view3 == null) {
                                try {
                                    View findViewWithTag2 = view5.findViewWithTag("feedback");
                                    if (findViewWithTag2 == null) {
                                        findViewWithTag2 = view5.findViewWithTag("yma_feedback");
                                    }
                                    m8023constructorimpl4 = Result.m8023constructorimpl(findViewWithTag2);
                                } catch (Throwable th2) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    m8023constructorimpl4 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
                                }
                                if (Result.m8028isFailureimpl(m8023constructorimpl4)) {
                                    m8023constructorimpl4 = null;
                                }
                                view3 = (View) m8023constructorimpl4;
                            }
                            str = iiVar2.a.a(view3, view5);
                            linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
                        }
                    }
                    str4 = iiVar.a.a(view2, view5);
                    if (str4 == null) {
                    }
                    linkedHashMap.put("{CLOSE_LOCATION}", str4);
                    ii iiVar22 = this.a;
                    iiVar22.getClass();
                    m8023constructorimpl3 = Result.m8023constructorimpl(view5.findViewById(R$id.feedback));
                    if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                    }
                    view3 = (View) m8023constructorimpl3;
                    if (view3 == null) {
                    }
                    str = iiVar22.a.a(view3, view5);
                    linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
                }
            }
            unit = null;
            if (unit == null) {
            }
            ii iiVar3 = this.a;
            iiVar3.getClass();
            Result.Companion companion4 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(view5.findViewById(R$id.close));
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            }
            view2 = (View) m8023constructorimpl;
            if (view2 == null) {
            }
            str4 = iiVar3.a.a(view2, view5);
            if (str4 == null) {
            }
            linkedHashMap.put("{CLOSE_LOCATION}", str4);
            ii iiVar222 = this.a;
            iiVar222.getClass();
            m8023constructorimpl3 = Result.m8023constructorimpl(view5.findViewById(R$id.feedback));
            if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
            }
            view3 = (View) m8023constructorimpl3;
            if (view3 == null) {
            }
            str = iiVar222.a.a(view3, view5);
            linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
        }
        return linkedHashMap;
    }
}
